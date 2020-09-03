// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Request.
 */
public class ManagedDeviceRequest extends BaseRequest implements IManagedDeviceRequest {
	
    /**
     * The request for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDevice.class);
    }

    /**
     * Gets the ManagedDevice from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedDevice> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDevice from the service
     *
     * @return the ManagedDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDevice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ManagedDevice> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedDevice with a source
     *
     * @param sourceManagedDevice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDevice sourceManagedDevice, final ICallback<ManagedDevice> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDevice);
    }

    /**
     * Patches this ManagedDevice with a source
     *
     * @param sourceManagedDevice the source object with updates
     * @return the updated ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDevice patch(final ManagedDevice sourceManagedDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDevice newManagedDevice, final ICallback<ManagedDevice> callback) {
        send(HttpMethod.POST, callback, newManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the new object to create
     * @return the created ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDevice post(final ManagedDevice newManagedDevice) throws ClientException {
        return send(HttpMethod.POST, newManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedDevice newManagedDevice, final ICallback<ManagedDevice> callback) {
        send(HttpMethod.PUT, callback, newManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the object to create/update
     * @return the created ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDevice put(final ManagedDevice newManagedDevice) throws ClientException {
        return send(HttpMethod.PUT, newManagedDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedDeviceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedDeviceRequest)this;
     }

}

