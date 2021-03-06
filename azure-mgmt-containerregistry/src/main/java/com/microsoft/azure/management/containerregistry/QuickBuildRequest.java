/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import java.util.List;
import com.microsoft.azure.management.containerregistry.implementation.BuildArgumentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.containerregistry.implementation.QueueBuildRequestInner;

/**
 * The queue build request parameters for a quick build.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("QuickBuild")
public class QuickBuildRequest extends QueueBuildRequestInner {
    /**
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /**
     * The URL(absolute or relative) of the source that needs to be built. For
     * Docker build, it can be an URL to a tar or github repoistory as
     * supported by Docker.
     * If it is relative URL, the relative path should be obtained from calling
     * getSourceUploadUrl API.
     */
    @JsonProperty(value = "sourceLocation", required = true)
    private String sourceLocation;

    /**
     * The collection of build arguments to be used.
     */
    @JsonProperty(value = "buildArguments")
    private List<BuildArgumentInner> buildArguments;

    /**
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /**
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /**
     * Build timeout in seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /**
     * The platform properties against which the build will happen.
     */
    @JsonProperty(value = "platform", required = true)
    private PlatformProperties platform;

    /**
     * The Docker file path relative to the source location.
     */
    @JsonProperty(value = "dockerFilePath", required = true)
    private String dockerFilePath;

    /**
     * Get the imageNames value.
     *
     * @return the imageNames value
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the imageNames value.
     *
     * @param imageNames the imageNames value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the sourceLocation value.
     *
     * @return the sourceLocation value
     */
    public String sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the sourceLocation value.
     *
     * @param sourceLocation the sourceLocation value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get the buildArguments value.
     *
     * @return the buildArguments value
     */
    public List<BuildArgumentInner> buildArguments() {
        return this.buildArguments;
    }

    /**
     * Set the buildArguments value.
     *
     * @param buildArguments the buildArguments value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withBuildArguments(List<BuildArgumentInner> buildArguments) {
        this.buildArguments = buildArguments;
        return this;
    }

    /**
     * Get the isPushEnabled value.
     *
     * @return the isPushEnabled value
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the isPushEnabled value.
     *
     * @param isPushEnabled the isPushEnabled value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the noCache value.
     *
     * @return the noCache value
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the noCache value.
     *
     * @param noCache the noCache value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the platform value.
     *
     * @return the platform value
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform value.
     *
     * @param platform the platform value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the dockerFilePath value.
     *
     * @return the dockerFilePath value
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the dockerFilePath value.
     *
     * @param dockerFilePath the dockerFilePath value to set
     * @return the QuickBuildRequest object itself.
     */
    public QuickBuildRequest withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

}
