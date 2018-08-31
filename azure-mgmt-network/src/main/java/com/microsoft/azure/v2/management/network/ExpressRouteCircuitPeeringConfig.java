/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies the peering configuration.
 */
public final class ExpressRouteCircuitPeeringConfig {
    /**
     * The reference of AdvertisedPublicPrefixes.
     */
    @JsonProperty(value = "advertisedPublicPrefixes")
    private List<String> advertisedPublicPrefixes;

    /**
     * The communities of bgp peering. Spepcified for microsoft peering.
     */
    @JsonProperty(value = "advertisedCommunities")
    private List<String> advertisedCommunities;

    /**
     * AdvertisedPublicPrefixState of the Peering resource. Possible values are
     * 'NotConfigured', 'Configuring', 'Configured', and 'ValidationNeeded'.
     * Possible values include: 'NotConfigured', 'Configuring', 'Configured',
     * 'ValidationNeeded'.
     */
    @JsonProperty(value = "advertisedPublicPrefixesState")
    private ExpressRouteCircuitPeeringAdvertisedPublicPrefixState advertisedPublicPrefixesState;

    /**
     * The legacy mode of the peering.
     */
    @JsonProperty(value = "legacyMode")
    private Integer legacyMode;

    /**
     * The CustomerASN of the peering.
     */
    @JsonProperty(value = "customerASN")
    private Integer customerASN;

    /**
     * The RoutingRegistryName of the configuration.
     */
    @JsonProperty(value = "routingRegistryName")
    private String routingRegistryName;

    /**
     * Get the advertisedPublicPrefixes value.
     *
     * @return the advertisedPublicPrefixes value.
     */
    public List<String> advertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes;
    }

    /**
     * Set the advertisedPublicPrefixes value.
     *
     * @param advertisedPublicPrefixes the advertisedPublicPrefixes value to
     * set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withAdvertisedPublicPrefixes(List<String> advertisedPublicPrefixes) {
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        return this;
    }

    /**
     * Get the advertisedCommunities value.
     *
     * @return the advertisedCommunities value.
     */
    public List<String> advertisedCommunities() {
        return this.advertisedCommunities;
    }

    /**
     * Set the advertisedCommunities value.
     *
     * @param advertisedCommunities the advertisedCommunities value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withAdvertisedCommunities(List<String> advertisedCommunities) {
        this.advertisedCommunities = advertisedCommunities;
        return this;
    }

    /**
     * Get the advertisedPublicPrefixesState value.
     *
     * @return the advertisedPublicPrefixesState value.
     */
    public ExpressRouteCircuitPeeringAdvertisedPublicPrefixState advertisedPublicPrefixesState() {
        return this.advertisedPublicPrefixesState;
    }

    /**
     * Set the advertisedPublicPrefixesState value.
     *
     * @param advertisedPublicPrefixesState the advertisedPublicPrefixesState
     * value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withAdvertisedPublicPrefixesState(ExpressRouteCircuitPeeringAdvertisedPublicPrefixState advertisedPublicPrefixesState) {
        this.advertisedPublicPrefixesState = advertisedPublicPrefixesState;
        return this;
    }

    /**
     * Get the legacyMode value.
     *
     * @return the legacyMode value.
     */
    public Integer legacyMode() {
        return this.legacyMode;
    }

    /**
     * Set the legacyMode value.
     *
     * @param legacyMode the legacyMode value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withLegacyMode(Integer legacyMode) {
        this.legacyMode = legacyMode;
        return this;
    }

    /**
     * Get the customerASN value.
     *
     * @return the customerASN value.
     */
    public Integer customerASN() {
        return this.customerASN;
    }

    /**
     * Set the customerASN value.
     *
     * @param customerASN the customerASN value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withCustomerASN(Integer customerASN) {
        this.customerASN = customerASN;
        return this;
    }

    /**
     * Get the routingRegistryName value.
     *
     * @return the routingRegistryName value.
     */
    public String routingRegistryName() {
        return this.routingRegistryName;
    }

    /**
     * Set the routingRegistryName value.
     *
     * @param routingRegistryName the routingRegistryName value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withRoutingRegistryName(String routingRegistryName) {
        this.routingRegistryName = routingRegistryName;
        return this;
    }
}
