/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.InnerSupportsGet;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.InnerSupportsListing;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * DdosProtectionPlans.
 */
public final class DdosProtectionPlansInner implements InnerSupportsGet<DdosProtectionPlanInner>, InnerSupportsDelete<Void>, InnerSupportsListing<DdosProtectionPlanInner> {
    /**
     * The proxy service used to perform REST calls.
     */
    private DdosProtectionPlansService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of DdosProtectionPlansInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DdosProtectionPlansInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(DdosProtectionPlansService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for DdosProtectionPlans to be
     * used by the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface DdosProtectionPlansService {
        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginDelete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("ddosProtectionPlanName") String ddosProtectionPlanName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> delete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("ddosProtectionPlanName") String ddosProtectionPlanName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<DdosProtectionPlanInner>> getByResourceGroup(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("ddosProtectionPlanName") String ddosProtectionPlanName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<DdosProtectionPlanInner>> beginCreateOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("ddosProtectionPlanName") String ddosProtectionPlanName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") DdosProtectionPlanInner parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<DdosProtectionPlanInner>> createOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("ddosProtectionPlanName") String ddosProtectionPlanName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") DdosProtectionPlanInner parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans/{ddosProtectionPlanName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<DdosProtectionPlanInner>> resumeCreateOrUpdate(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/ddosProtectionPlans")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<DdosProtectionPlanInner>>> list(@PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosProtectionPlans")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<DdosProtectionPlanInner>>> listByResourceGroup(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<DdosProtectionPlanInner>>> listNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<DdosProtectionPlanInner>>> listByResourceGroupNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginDelete(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        beginDeleteAsync(resourceGroupName, ddosProtectionPlanName).blockingLast();
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginDeleteAsync(resourceGroupName, ddosProtectionPlanName), serviceCallback);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosProtectionPlanName == null) {
            throw new IllegalArgumentException("Parameter ddosProtectionPlanName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginDelete(resourceGroupName, ddosProtectionPlanName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void delete(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        deleteAsync(resourceGroupName, ddosProtectionPlanName).blockingGet();
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> deleteAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteAsync(resourceGroupName, ddosProtectionPlanName), serviceCallback);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> deleteWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosProtectionPlanName == null) {
            throw new IllegalArgumentException("Parameter ddosProtectionPlanName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.delete(resourceGroupName, ddosProtectionPlanName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Void> deleteAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        return deleteWithRestResponseAsync(resourceGroupName, ddosProtectionPlanName)
            .flatMapMaybe((VoidResponse res) -> Maybe.empty());
    }

    /**
     * Deletes the specified DDoS protection plan. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeDelete(operationDescription);
    }

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DdosProtectionPlanInner object if successful.
     */
    public DdosProtectionPlanInner getByResourceGroup(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        return getByResourceGroupAsync(resourceGroupName, ddosProtectionPlanName).blockingGet();
    }

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<DdosProtectionPlanInner> getByResourceGroupAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, ServiceCallback<DdosProtectionPlanInner> serviceCallback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, ddosProtectionPlanName), serviceCallback);
    }

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<DdosProtectionPlanInner>> getByResourceGroupWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosProtectionPlanName == null) {
            throw new IllegalArgumentException("Parameter ddosProtectionPlanName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.getByResourceGroup(resourceGroupName, ddosProtectionPlanName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<DdosProtectionPlanInner> getByResourceGroupAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName) {
        return getByResourceGroupWithRestResponseAsync(resourceGroupName, ddosProtectionPlanName)
            .flatMapMaybe((BodyResponse<DdosProtectionPlanInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DdosProtectionPlanInner object if successful.
     */
    public DdosProtectionPlanInner beginCreateOrUpdate(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, ddosProtectionPlanName, parameters).blockingLast().result();
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;DdosProtectionPlanInner&gt; object.
     */
    public ServiceFuture<DdosProtectionPlanInner> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters, ServiceCallback<DdosProtectionPlanInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCreateOrUpdateAsync(resourceGroupName, ddosProtectionPlanName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<DdosProtectionPlanInner>> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosProtectionPlanName == null) {
            throw new IllegalArgumentException("Parameter ddosProtectionPlanName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.beginCreateOrUpdate(resourceGroupName, ddosProtectionPlanName, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DdosProtectionPlanInner object if successful.
     */
    public DdosProtectionPlanInner createOrUpdate(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters) {
        return createOrUpdateAsync(resourceGroupName, ddosProtectionPlanName, parameters).blockingGet();
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<DdosProtectionPlanInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters, ServiceCallback<DdosProtectionPlanInner> serviceCallback) {
        return ServiceFuture.fromBody(createOrUpdateAsync(resourceGroupName, ddosProtectionPlanName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<DdosProtectionPlanInner>> createOrUpdateWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosProtectionPlanName == null) {
            throw new IllegalArgumentException("Parameter ddosProtectionPlanName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.createOrUpdate(resourceGroupName, ddosProtectionPlanName, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<DdosProtectionPlanInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String ddosProtectionPlanName, @NonNull DdosProtectionPlanInner parameters) {
        return createOrUpdateWithRestResponseAsync(resourceGroupName, ddosProtectionPlanName, parameters)
            .flatMapMaybe((BodyResponse<DdosProtectionPlanInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a DDoS protection plan. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<DdosProtectionPlanInner>> resumeCreateOrUpdate(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCreateOrUpdate(operationDescription);
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;DdosProtectionPlanInner&gt; object if successful.
     */
    public PagedList<DdosProtectionPlanInner> list() {
        Page<DdosProtectionPlanInner> response = listSinglePageAsync().blockingGet();
        return new PagedList<DdosProtectionPlanInner>(response) {
            @Override
            public Page<DdosProtectionPlanInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @return the observable to the PagedList&lt;DdosProtectionPlanInner&gt; object.
     */
    public Observable<Page<DdosProtectionPlanInner>> listAsync() {
        return listSinglePageAsync()
            .toObservable()
            .concatMap((Page<DdosProtectionPlanInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink));
            });
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @return the Single&lt;Page&lt;DdosProtectionPlanInner&gt;&gt; object if successful.
     */
    public Single<Page<DdosProtectionPlanInner>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<DdosProtectionPlanInner>> res) -> res.body());
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;DdosProtectionPlanInner&gt; object if successful.
     */
    public PagedList<DdosProtectionPlanInner> listByResourceGroup(@NonNull String resourceGroupName) {
        Page<DdosProtectionPlanInner> response = listByResourceGroupSinglePageAsync(resourceGroupName).blockingGet();
        return new PagedList<DdosProtectionPlanInner>(response) {
            @Override
            public Page<DdosProtectionPlanInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;DdosProtectionPlanInner&gt; object.
     */
    public Observable<Page<DdosProtectionPlanInner>> listByResourceGroupAsync(@NonNull String resourceGroupName) {
        return listByResourceGroupSinglePageAsync(resourceGroupName)
            .toObservable()
            .concatMap((Page<DdosProtectionPlanInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listByResourceGroupNextAsync(nextPageLink));
            });
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;DdosProtectionPlanInner&gt;&gt; object if successful.
     */
    public Single<Page<DdosProtectionPlanInner>> listByResourceGroupSinglePageAsync(@NonNull String resourceGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.listByResourceGroup(resourceGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<DdosProtectionPlanInner>> res) -> res.body());
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;DdosProtectionPlanInner&gt; object if successful.
     */
    public PagedList<DdosProtectionPlanInner> listNext(@NonNull String nextPageLink) {
        Page<DdosProtectionPlanInner> response = listNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<DdosProtectionPlanInner>(response) {
            @Override
            public Page<DdosProtectionPlanInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;DdosProtectionPlanInner&gt; object.
     */
    public Observable<Page<DdosProtectionPlanInner>> listNextAsync(@NonNull String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<DdosProtectionPlanInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink1));
            });
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;DdosProtectionPlanInner&gt;&gt; object if successful.
     */
    public Single<Page<DdosProtectionPlanInner>> listNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<DdosProtectionPlanInner>> res) -> res.body());
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;DdosProtectionPlanInner&gt; object if successful.
     */
    public PagedList<DdosProtectionPlanInner> listByResourceGroupNext(@NonNull String nextPageLink) {
        Page<DdosProtectionPlanInner> response = listByResourceGroupNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<DdosProtectionPlanInner>(response) {
            @Override
            public Page<DdosProtectionPlanInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;DdosProtectionPlanInner&gt; object.
     */
    public Observable<Page<DdosProtectionPlanInner>> listByResourceGroupNextAsync(@NonNull String nextPageLink) {
        return listByResourceGroupNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<DdosProtectionPlanInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listByResourceGroupNextAsync(nextPageLink1));
            });
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;DdosProtectionPlanInner&gt;&gt; object if successful.
     */
    public Single<Page<DdosProtectionPlanInner>> listByResourceGroupNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceGroupNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<DdosProtectionPlanInner>> res) -> res.body());
    }
}
