/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuit;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitPeering;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitPeerings;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitServiceProviderProperties;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitSkuType;
import com.microsoft.azure.v2.management.network.ServiceProviderProvisioningState;
import com.microsoft.azure.v2.management.network.model.GroupableParentResourceWithTagsImpl;
import com.microsoft.azure.v2.management.resources.fluentcore.utils.Utils;
import io.reactivex.Maybe;
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LangDefinition
class ExpressRouteCircuitImpl extends GroupableParentResourceWithTagsImpl<
        ExpressRouteCircuit,
        ExpressRouteCircuitInner,
        ExpressRouteCircuitImpl,
        NetworkManager>
        implements
        ExpressRouteCircuit,
        ExpressRouteCircuit.Definition,
        ExpressRouteCircuit.Update {
    private ExpressRouteCircuitPeeringsImpl peerings;
    private Map<String, ExpressRouteCircuitPeering> expressRouteCircuitPeerings;

    ExpressRouteCircuitImpl(String name, ExpressRouteCircuitInner innerObject, NetworkManager manager) {
        super(name, innerObject, manager);
        initializeChildrenFromInner();
    }

    @Override
    public ExpressRouteCircuitImpl withServiceProvider(String serviceProviderName) {
        ensureServiceProviderProperties().withServiceProviderName(serviceProviderName);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withPeeringLocation(String location) {
        ensureServiceProviderProperties().withPeeringLocation(location);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withBandwidthInMbps(int bandwidthInMbps) {
        ensureServiceProviderProperties().withBandwidthInMbps(bandwidthInMbps);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withSku(ExpressRouteCircuitSkuType sku) {
        inner().withSku(sku.sku());
        return this;
    }


    @Override
    public ExpressRouteCircuitImpl withClassicOperations() {
        inner().withAllowClassicOperations(true);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withoutClassicOperations() {
        inner().withAllowClassicOperations(false);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withAuthorization(String authorizationName) {
        ensureAuthorizations().add(new ExpressRouteCircuitAuthorizationInner().withName(authorizationName));
        return this;
    }

    private List<ExpressRouteCircuitAuthorizationInner> ensureAuthorizations() {
        if (inner().authorizations() == null) {
            inner().withAuthorizations(new ArrayList<ExpressRouteCircuitAuthorizationInner>());
        }
        return inner().authorizations();
    }

    private ExpressRouteCircuitServiceProviderProperties ensureServiceProviderProperties() {
        if (inner().serviceProviderProperties() == null) {
            inner().withServiceProviderProperties(new ExpressRouteCircuitServiceProviderProperties());
        }
        return inner().serviceProviderProperties();
    }

    protected void beforeCreating() {
    }

    @Override
    protected void afterCreating() {
    }

    @Override
    protected Observable<ExpressRouteCircuitInner> createInner() {
        return this.manager().inner().expressRouteCircuits().createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
                .toObservable();
    }

    @Override
    protected void initializeChildrenFromInner() {
        expressRouteCircuitPeerings = new HashMap<>();
        if (inner().peerings() != null) {
            for (ExpressRouteCircuitPeeringInner peering : inner().peerings()) {
                expressRouteCircuitPeerings.put(peering.name(),
                        new ExpressRouteCircuitPeeringImpl(this, peering, manager().inner().expressRouteCircuitPeerings(), peering.peeringType()));
            }
        }
    }

    @Override
    protected Maybe<ExpressRouteCircuitInner> getInnerAsync() {
        return this.manager().inner().expressRouteCircuits().getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public Maybe<ExpressRouteCircuit> refreshAsync() {
        return super.refreshAsync().map(expressRouteCircuit -> {
                ExpressRouteCircuitImpl impl = (ExpressRouteCircuitImpl) expressRouteCircuit;
                impl.initializeChildrenFromInner();
                return impl;
            });
    }

    @Override
    protected Observable<ExpressRouteCircuitInner> applyTagsToInnerAsync() {
        return this.manager().inner().expressRouteCircuits().updateTagsAsync(resourceGroupName(), name(), inner().getTags())
                .toObservable();
    }

    // Getters

    @Override
    public ExpressRouteCircuitPeerings peerings() {
        if (peerings == null) {
            peerings = new ExpressRouteCircuitPeeringsImpl(this);
        }
        return peerings;
    }

    @Override
    public ExpressRouteCircuitSkuType sku() {
        return ExpressRouteCircuitSkuType.fromSku(inner().sku());
    }

    @Override
    public boolean isAllowClassicOperations() {
        return Utils.toPrimitiveBoolean(inner().allowClassicOperations());
    }

    @Override
    public String circuitProvisioningState() {
        return inner().circuitProvisioningState();
    }

    @Override
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return inner().serviceProviderProvisioningState();
    }

    @Override
    public String serviceKey() {
        return inner().serviceKey();
    }

    @Override
    public String serviceProviderNotes() {
        return inner().serviceProviderNotes();
    }

    @Override
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return inner().serviceProviderProperties();
    }

    @Override
    public String provisioningState() {
        return inner().provisioningState();
    }

    @Override
    public Map<String, ExpressRouteCircuitPeering> peeringsMap() {
        return expressRouteCircuitPeerings;
    }
}