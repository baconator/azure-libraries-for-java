/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.azure.v2.management.network.ErrorException;
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
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnConnections.
 */
public final class VpnConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VpnConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnConnectionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public VpnConnectionsInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(VpnConnectionsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpnConnections to be used by
     * the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface VpnConnectionsService {
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<VpnConnectionInner>> get(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Observable<OperationStatus<VpnConnectionInner>> beginCreateOrUpdate(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json; charset=utf-8") VpnConnectionInner vpnConnectionParameters, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<VpnConnectionInner>> createOrUpdate(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json; charset=utf-8") VpnConnectionInner vpnConnectionParameters, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        @ResumeOperation
        Observable<OperationStatus<VpnConnectionInner>> resumeCreateOrUpdate(OperationDescription operationDescription);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Observable<OperationStatus<Void>> beginDelete(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> delete(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<PageImpl<VpnConnectionInner>>> listByVpnGateway(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<PageImpl<VpnConnectionInner>>> listByVpnGatewayNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Retrieves the details of a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VpnConnectionInner object if successful.
     */
    public VpnConnectionInner get(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        return getAsync(resourceGroupName, gatewayName, connectionName).blockingGet();
    }

    /**
     * Retrieves the details of a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<VpnConnectionInner> getAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, ServiceCallback<VpnConnectionInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, gatewayName, connectionName), serviceCallback);
    }

    /**
     * Retrieves the details of a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<VpnConnectionInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Retrieves the details of a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<VpnConnectionInner> getAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        return getWithRestResponseAsync(resourceGroupName, gatewayName, connectionName)
            .flatMapMaybe((BodyResponse<VpnConnectionInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VpnConnectionInner object if successful.
     */
    public VpnConnectionInner beginCreateOrUpdate(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters).blockingLast().result();
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;VpnConnectionInner&gt; object.
     */
    public ServiceFuture<VpnConnectionInner> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters, ServiceCallback<VpnConnectionInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCreateOrUpdateAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters), serviceCallback);
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<VpnConnectionInner>> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (vpnConnectionParameters == null) {
            throw new IllegalArgumentException("Parameter vpnConnectionParameters is required and cannot be null.");
        }
        Validator.validate(vpnConnectionParameters);
        final String apiVersion = "2018-06-01";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion, vpnConnectionParameters, this.client.acceptLanguage());
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VpnConnectionInner object if successful.
     */
    public VpnConnectionInner createOrUpdate(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters) {
        return createOrUpdateAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters).blockingGet();
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<VpnConnectionInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters, ServiceCallback<VpnConnectionInner> serviceCallback) {
        return ServiceFuture.fromBody(createOrUpdateAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters), serviceCallback);
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<VpnConnectionInner>> createOrUpdateWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (vpnConnectionParameters == null) {
            throw new IllegalArgumentException("Parameter vpnConnectionParameters is required and cannot be null.");
        }
        Validator.validate(vpnConnectionParameters);
        final String apiVersion = "2018-06-01";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion, vpnConnectionParameters, this.client.acceptLanguage());
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<VpnConnectionInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, @NonNull VpnConnectionInner vpnConnectionParameters) {
        return createOrUpdateWithRestResponseAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters)
            .flatMapMaybe((BodyResponse<VpnConnectionInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<VpnConnectionInner>> resumeCreateOrUpdate(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCreateOrUpdate(operationDescription);
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginDelete(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        beginDeleteAsync(resourceGroupName, gatewayName, connectionName).blockingLast();
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginDeleteAsync(resourceGroupName, gatewayName, connectionName), serviceCallback);
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void delete(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        deleteAsync(resourceGroupName, gatewayName, connectionName).blockingAwait();
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> deleteAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteAsync(resourceGroupName, gatewayName, connectionName), serviceCallback);
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> deleteWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.delete(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable deleteAsync(@NonNull String resourceGroupName, @NonNull String gatewayName, @NonNull String connectionName) {
        return deleteWithRestResponseAsync(resourceGroupName, gatewayName, connectionName)
            .toCompletable();
    }

    /**
     * Deletes a vpn connection. (resume watch).
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
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;VpnConnectionInner&gt; object if successful.
     */
    public PagedList<VpnConnectionInner> listByVpnGateway(@NonNull String resourceGroupName, @NonNull String gatewayName) {
        Page<VpnConnectionInner> response = listByVpnGatewaySinglePageAsync(resourceGroupName, gatewayName).blockingGet();
        return new PagedList<VpnConnectionInner>(response) {
            @Override
            public Page<VpnConnectionInner> nextPage(String nextPageLink) {
                return listByVpnGatewayNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;VpnConnectionInner&gt; object.
     */
    public Observable<Page<VpnConnectionInner>> listByVpnGatewayAsync(@NonNull String resourceGroupName, @NonNull String gatewayName) {
        return listByVpnGatewaySinglePageAsync(resourceGroupName, gatewayName)
            .toObservable()
            .concatMap((Page<VpnConnectionInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listByVpnGatewayNextAsync(nextPageLink));
            });
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;VpnConnectionInner&gt;&gt; object if successful.
     */
    public Single<Page<VpnConnectionInner>> listByVpnGatewaySinglePageAsync(@NonNull String resourceGroupName, @NonNull String gatewayName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.listByVpnGateway(this.client.subscriptionId(), resourceGroupName, gatewayName, apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<VpnConnectionInner>> res) -> res.body());
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;VpnConnectionInner&gt; object if successful.
     */
    public PagedList<VpnConnectionInner> listByVpnGatewayNext(@NonNull String nextPageLink) {
        Page<VpnConnectionInner> response = listByVpnGatewayNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<VpnConnectionInner>(response) {
            @Override
            public Page<VpnConnectionInner> nextPage(String nextPageLink) {
                return listByVpnGatewayNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;VpnConnectionInner&gt; object.
     */
    public Observable<Page<VpnConnectionInner>> listByVpnGatewayNextAsync(@NonNull String nextPageLink) {
        return listByVpnGatewayNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<VpnConnectionInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listByVpnGatewayNextAsync(nextPageLink1));
            });
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;VpnConnectionInner&gt;&gt; object if successful.
     */
    public Single<Page<VpnConnectionInner>> listByVpnGatewayNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByVpnGatewayNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<VpnConnectionInner>> res) -> res.body());
    }
}
