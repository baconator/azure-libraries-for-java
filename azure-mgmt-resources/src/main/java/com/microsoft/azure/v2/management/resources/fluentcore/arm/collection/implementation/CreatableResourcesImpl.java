/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.resources.fluentcore.arm.collection.implementation;

import com.microsoft.azure.v2.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.v2.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.v2.management.resources.fluentcore.model.CreatedResources;
import com.microsoft.azure.v2.management.resources.fluentcore.model.Indexable;
import com.microsoft.azure.v2.management.resources.fluentcore.model.implementation.CreatableUpdatableImpl;
import com.microsoft.azure.v2.management.resources.fluentcore.utils.Utils;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.ServiceCallback;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Base class for creatable resource collection, i.e. those where the member of the collection is of <code>Resource</code>
 * type and are creatable.
 * (Internal use only)
 *
 * @param <T> the individual resource type returned
 * @param <ImplT> the individual resource implementation
 * @param <InnerT> the wrapper inner type
 */
public abstract class CreatableResourcesImpl<T extends Indexable, ImplT extends T, InnerT>
        extends CreatableWrappersImpl<T, ImplT, InnerT>
        implements
        SupportsBatchCreation<T> {

    protected CreatableResourcesImpl() {
    }

    @Override
    @SafeVarargs
    public final CreatedResources<T> create(Creatable<T>... creatables) {
        return createAsyncNonStream(creatables)
                .blockingGet();
    }

    @Override
    public final CreatedResources<T> create(List<Creatable<T>> creatables) {
        return createAsyncNonStream(creatables)
                .blockingGet();
    }

    @Override
    @SafeVarargs
    public final Observable<Indexable> createAsync(Creatable<T> ... creatables) {
        CreatableUpdatableResourcesRootImpl<T> rootResource = new CreatableUpdatableResourcesRootImpl<>();
        rootResource.addCreatableDependencies(creatables);
        return rootResource.createAsync();
    }

    @Override
    public final Observable<Indexable> createAsync(List<Creatable<T>> creatables) {
        CreatableUpdatableResourcesRootImpl<T> rootResource = new CreatableUpdatableResourcesRootImpl<>();
        rootResource.addCreatableDependencies(creatables);
        return rootResource.createAsync();
    }

    @Override
    @SafeVarargs
    public final ServiceFuture<CreatedResources<T>> createAsync(final ServiceCallback<CreatedResources<T>> callback, Creatable<T>... creatables) {
        return ServiceFuture.fromBody(createAsyncNonStream(creatables), callback);
    }

    @Override
    public final ServiceFuture<CreatedResources<T>> createAsync(final ServiceCallback<CreatedResources<T>> callback, List<Creatable<T>> creatables) {
        return ServiceFuture.fromBody(createAsyncNonStream(creatables), callback);
    }


    private Single<CreatedResources<T>> createAsyncNonStream(List<Creatable<T>> creatables) {
        return Utils.<CreatableUpdatableResourcesRoot<T>>rootResource(this.createAsync(creatables))
                .map(new Function<CreatableUpdatableResourcesRoot<T>, CreatedResources<T>>() {
                    @Override
                    public CreatedResources<T> apply(CreatableUpdatableResourcesRoot<T> tCreatableUpdatableResourcesRoot) {
                        return new CreatedResourcesImpl<>(tCreatableUpdatableResourcesRoot);
                    }
                });
    }

    @SuppressWarnings("unchecked")
    private Single<CreatedResources<T>> createAsyncNonStream(Creatable<T>... creatables) {
        return Utils.<CreatableUpdatableResourcesRoot<T>>rootResource(this.createAsync(creatables))
                .map(new Function<CreatableUpdatableResourcesRoot<T>, CreatedResources<T>>() {
                    @Override
                    public CreatedResources<T> apply(CreatableUpdatableResourcesRoot<T> tCreatableUpdatableResourcesRoot) {
                        return new CreatedResourcesImpl<>(tCreatableUpdatableResourcesRoot);
                    }
                });
    }

    /**
     * Implements CreatedResources.
     * @param <ResourceT> the type of the resources in the batch.
     */
    private class CreatedResourcesImpl<ResourceT extends Indexable>
        extends HashMap<String, ResourceT>
        implements CreatedResources<ResourceT> {
        private static final long serialVersionUID = -1360746896732289907L;
        private CreatableUpdatableResourcesRoot<ResourceT> creatableUpdatableResourcesRoot;

        CreatedResourcesImpl(CreatableUpdatableResourcesRoot<ResourceT> creatableUpdatableResourcesRoot) {
            this.creatableUpdatableResourcesRoot = creatableUpdatableResourcesRoot;
            for (ResourceT resource : this.creatableUpdatableResourcesRoot.createdTopLevelResources()) {
                super.put(resource.key(), resource);
            }
        }

        @Override
        public Indexable createdRelatedResource(String key) {
            return this.creatableUpdatableResourcesRoot.createdRelatedResource(key);
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override
        public ResourceT put(String key, ResourceT value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ResourceT remove(Object key) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putAll(Map<? extends String, ? extends ResourceT> m) {
            throw new UnsupportedOperationException();
        }
    }

     /**
     * The local root resource that is used as dummy parent resource for the batch creatable resources
     * added via <code>SupportsBatchCreation.create()</code> or <code>CreatableResourcesImpl#createAsync</code>.
     *
     * @param <ResourceT> the type of the resources in the batch.
     */
    interface CreatableUpdatableResourcesRoot<ResourceT extends Indexable> extends Indexable {
        List<ResourceT> createdTopLevelResources();
        Indexable createdRelatedResource(String key);
    }

    /**
     * Implementation of CreatableUpdatableResourcesRoot.
     *
     * @param <ResourceT> the type of the resources in the batch.
     */
    private class CreatableUpdatableResourcesRootImpl<ResourceT extends Indexable>
            extends CreatableUpdatableImpl<CreatableUpdatableResourcesRoot<ResourceT>, Object, CreatableUpdatableResourcesRootImpl<ResourceT>>
            implements CreatableUpdatableResourcesRoot<ResourceT> {
        /**
         * Collection of keys of top level resources in this batch.
         */
        private List<String> keys;

        CreatableUpdatableResourcesRootImpl() {
            super("CreatableUpdatableResourcesRoot", null);
            this.keys = new ArrayList<>();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<ResourceT> createdTopLevelResources() {
            List<ResourceT> resources = new ArrayList<>();
            for (String resourceKey : keys) {
                resources.add(this.<ResourceT>taskResult(resourceKey));
            }
            return Collections.unmodifiableList(resources);
        }

        @Override
        public Indexable createdRelatedResource(String key) {
            return this.<Indexable>taskResult(key);
        }

        @SuppressWarnings("unchecked")
        void addCreatableDependencies(Creatable<T> ... creatables) {
            for (Creatable<T> item : creatables) {
                this.keys.add(this.addDependency(item));
            }
        }

        void addCreatableDependencies(List<Creatable<T>> creatables) {
            for (Creatable<T> item : creatables) {
                this.keys.add(this.addDependency(item));
            }
        }

        @Override
        public Observable<CreatableUpdatableResourcesRoot<ResourceT>> createResourceAsync() {
            return Observable.just((CreatableUpdatableResourcesRoot<ResourceT>) this);
        }

        @Override
        public Observable<CreatableUpdatableResourcesRoot<ResourceT>> updateResourceAsync() {
            return createResourceAsync();
        }

        @Override
        public boolean isInCreateMode() {
            return true;
        }

        @Override
        protected Maybe<Object> getInnerAsync() {
            return Maybe.empty();
        }
    }
}