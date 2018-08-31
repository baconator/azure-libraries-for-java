/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.SubResource;
import com.microsoft.rest.v2.serializer.JsonFlatten;

/**
 * Authentication certificates of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayAuthenticationCertificate extends SubResource {
    /**
     * Certificate public data.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /**
     * Provisioning state of the authentication certificate resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the authentication certificate that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the data value.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayAuthenticationCertificate object itself.
     */
    public ApplicationGatewayAuthenticationCertificate withType(String type) {
        this.type = type;
        return this;
    }
}
