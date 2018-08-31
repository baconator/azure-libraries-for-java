/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v2.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AzureFirewallRCActionType.
 */
public final class AzureFirewallRCActionType extends ExpandableStringEnum<AzureFirewallRCActionType> {
    /**
     * Static value Allow for AzureFirewallRCActionType.
     */
    public static final AzureFirewallRCActionType ALLOW = fromString("Allow");

    /**
     * Static value Deny for AzureFirewallRCActionType.
     */
    public static final AzureFirewallRCActionType DENY = fromString("Deny");

    /**
     * Creates or finds a AzureFirewallRCActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureFirewallRCActionType.
     */
    @JsonCreator
    public static AzureFirewallRCActionType fromString(String name) {
        return fromString(name, AzureFirewallRCActionType.class);
    }

    /**
     * @return known AzureFirewallRCActionType values.
     */
    public static Collection<AzureFirewallRCActionType> values() {
        return values(AzureFirewallRCActionType.class);
    }
}
