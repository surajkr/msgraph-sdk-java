// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Swap Shifts Change Request Request.
 */
public interface ISwapShiftsChangeRequestRequest extends IHttpRequest {

    /**
     * Gets the SwapShiftsChangeRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SwapShiftsChangeRequest> callback);

    /**
     * Gets the SwapShiftsChangeRequest from the service
     *
     * @return the SwapShiftsChangeRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SwapShiftsChangeRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SwapShiftsChangeRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SwapShiftsChangeRequest with a source
     *
     * @param sourceSwapShiftsChangeRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SwapShiftsChangeRequest sourceSwapShiftsChangeRequest, final ICallback<SwapShiftsChangeRequest> callback);

    /**
     * Patches this SwapShiftsChangeRequest with a source
     *
     * @param sourceSwapShiftsChangeRequest the source object with updates
     * @return the updated SwapShiftsChangeRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SwapShiftsChangeRequest patch(final SwapShiftsChangeRequest sourceSwapShiftsChangeRequest) throws ClientException;

    /**
     * Posts a SwapShiftsChangeRequest with a new object
     *
     * @param newSwapShiftsChangeRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SwapShiftsChangeRequest newSwapShiftsChangeRequest, final ICallback<SwapShiftsChangeRequest> callback);

    /**
     * Posts a SwapShiftsChangeRequest with a new object
     *
     * @param newSwapShiftsChangeRequest the new object to create
     * @return the created SwapShiftsChangeRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SwapShiftsChangeRequest post(final SwapShiftsChangeRequest newSwapShiftsChangeRequest) throws ClientException;

    /**
     * Posts a SwapShiftsChangeRequest with a new object
     *
     * @param newSwapShiftsChangeRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SwapShiftsChangeRequest newSwapShiftsChangeRequest, final ICallback<SwapShiftsChangeRequest> callback);

    /**
     * Posts a SwapShiftsChangeRequest with a new object
     *
     * @param newSwapShiftsChangeRequest the object to create/update
     * @return the created SwapShiftsChangeRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SwapShiftsChangeRequest put(final SwapShiftsChangeRequest newSwapShiftsChangeRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISwapShiftsChangeRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISwapShiftsChangeRequestRequest expand(final String value);

}

