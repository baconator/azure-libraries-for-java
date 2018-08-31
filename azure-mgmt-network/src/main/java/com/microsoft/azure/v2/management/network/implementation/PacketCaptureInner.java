/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.network.PacketCaptureFilter;
import com.microsoft.azure.v2.management.network.PacketCaptureStorageLocation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Parameters that define the create packet capture operation.
 */
@JsonFlatten
public class PacketCaptureInner {
    /**
     * The ID of the targeted resource, only VM is currently supported.
     */
    @JsonProperty(value = "properties.target", required = true)
    private String target;

    /**
     * Number of bytes captured per packet, the remaining bytes are truncated.
     */
    @JsonProperty(value = "properties.bytesToCapturePerPacket")
    private Integer bytesToCapturePerPacket;

    /**
     * Maximum size of the capture output.
     */
    @JsonProperty(value = "properties.totalBytesPerSession")
    private Integer totalBytesPerSession;

    /**
     * Maximum duration of the capture session in seconds.
     */
    @JsonProperty(value = "properties.timeLimitInSeconds")
    private Integer timeLimitInSeconds;

    /**
     * The storageLocation property.
     */
    @JsonProperty(value = "properties.storageLocation", required = true)
    private PacketCaptureStorageLocation storageLocation;

    /**
     * The filters property.
     */
    @JsonProperty(value = "properties.filters")
    private List<PacketCaptureFilter> filters;

    /**
     * Get the target value.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket value.
     *
     * @return the bytesToCapturePerPacket value.
     */
    public Integer bytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }

    /**
     * Set the bytesToCapturePerPacket value.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withBytesToCapturePerPacket(Integer bytesToCapturePerPacket) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        return this;
    }

    /**
     * Get the totalBytesPerSession value.
     *
     * @return the totalBytesPerSession value.
     */
    public Integer totalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     * Set the totalBytesPerSession value.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withTotalBytesPerSession(Integer totalBytesPerSession) {
        this.totalBytesPerSession = totalBytesPerSession;
        return this;
    }

    /**
     * Get the timeLimitInSeconds value.
     *
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    /**
     * Set the timeLimitInSeconds value.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.timeLimitInSeconds = timeLimitInSeconds;
        return this;
    }

    /**
     * Get the storageLocation value.
     *
     * @return the storageLocation value.
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.storageLocation;
    }

    /**
     * Set the storageLocation value.
     *
     * @param storageLocation the storageLocation value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Get the filters value.
     *
     * @return the filters value.
     */
    public List<PacketCaptureFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters value.
     *
     * @param filters the filters value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withFilters(List<PacketCaptureFilter> filters) {
        this.filters = filters;
        return this;
    }
}
