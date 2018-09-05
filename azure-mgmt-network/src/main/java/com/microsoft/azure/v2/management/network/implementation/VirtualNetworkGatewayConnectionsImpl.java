/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.VirtualNetworkGateway;
import com.microsoft.azure.v2.management.network.VirtualNetworkGatewayConnection;
import com.microsoft.azure.v2.management.network.VirtualNetworkGatewayConnections;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.implementation.GroupPagedList;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;

import java.util.List;

/**
 * The implementation of VirtualNetworkGatewayConnections.
 */
@LangDefinition
class VirtualNetworkGatewayConnectionsImpl
        extends GroupableResourcesImpl<
        VirtualNetworkGatewayConnection,
        VirtualNetworkGatewayConnectionImpl,
        VirtualNetworkGatewayConnectionInner,
        VirtualNetworkGatewayConnectionsInner,
        NetworkManager>
        implements VirtualNetworkGatewayConnections {

    private final VirtualNetworkGatewayImpl parent;

    VirtualNetworkGatewayConnectionsImpl(final VirtualNetworkGatewayImpl parent) {
        super(parent.manager().inner().virtualNetworkGatewayConnections(), parent.manager());
        this.parent = parent;
    }


    @Override
    protected VirtualNetworkGatewayConnectionImpl wrapModel(String name) {
        return new VirtualNetworkGatewayConnectionImpl(name, parent, new VirtualNetworkGatewayConnectionInner())
                .withRegion(parent.regionName())
                .withExistingResourceGroup(parent.resourceGroupName());
    }

    @Override
    protected VirtualNetworkGatewayConnectionImpl wrapModel(VirtualNetworkGatewayConnectionInner inner) {
        if (inner == null) {
            return null;
        }
        return new VirtualNetworkGatewayConnectionImpl(inner.name(), parent, inner);
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public void deleteByName(String name) {
        deleteByNameAsync(name).blockingAwait();
    }

    @Override
    public ServiceFuture<Void> deleteByNameAsync(String name, ServiceCallback<Void> callback) {
        return this.inner().deleteAsync(parent.resourceGroupName(), name, callback);
    }

    @Override
    public Completable deleteByNameAsync(String name) {
        return this.inner().deleteAsync(parent.resourceGroupName(), name)
                .flatMapCompletable(v -> Completable.complete());
    }

    @Override
    public PagedList<VirtualNetworkGatewayConnection> list() {
        return new GroupPagedList<VirtualNetworkGatewayConnection>(this.manager().resourceManager().resourceGroups().list()) {
            @Override
            public List<VirtualNetworkGatewayConnection> listNextGroup(String resourceGroupName) {
                return wrapList(VirtualNetworkGatewayConnectionsImpl.this.inner().listByResourceGroup(resourceGroupName));
            }
        };
    }

    @Override
    public VirtualNetworkGatewayConnection getByName(String name) {
        VirtualNetworkGatewayConnectionInner inner = this.manager().inner().virtualNetworkGatewayConnections()
                .getByResourceGroup(this.parent().resourceGroupName(), name);
        return new VirtualNetworkGatewayConnectionImpl(name, parent, inner);
    }

    @Override
    public VirtualNetworkGateway parent() {
        return this.parent;
    }

    @Override
    public Observable<VirtualNetworkGatewayConnection> listAsync() {
        return this.manager().resourceManager().resourceGroups().listAsync()
                .flatMap(resourceGroup -> wrapPageAsync(inner().listByResourceGroupAsync(resourceGroup.name())));
    }

    @Override
    protected Maybe<VirtualNetworkGatewayConnectionInner> getInnerAsync(String resourceGroupName, String name) {
        return inner().getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        return inner().deleteAsync(resourceGroupName, name)
                .flatMapCompletable(v -> Completable.complete());
    }

    @Override
    public Observable<VirtualNetworkGatewayConnection> getByNameAsync(String name) {
        return inner().getByResourceGroupAsync(parent.resourceGroupName(), name)
                .map(inner -> (VirtualNetworkGatewayConnection) wrapModel(inner))
                .toObservable();
    }
}