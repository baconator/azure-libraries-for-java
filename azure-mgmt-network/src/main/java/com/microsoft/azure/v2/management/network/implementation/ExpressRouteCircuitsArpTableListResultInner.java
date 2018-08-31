/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitArpTable;
import java.util.List;

/**
 * Response for ListArpTable associated with the Express Route Circuits API.
 */
public final class ExpressRouteCircuitsArpTableListResultInner {
    /**
     * Gets list of the ARP table.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitArpTable> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitArpTable> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCircuitsArpTableListResultInner object itself.
     */
    public ExpressRouteCircuitsArpTableListResultInner withValue(List<ExpressRouteCircuitArpTable> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitsArpTableListResultInner object itself.
     */
    public ExpressRouteCircuitsArpTableListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
