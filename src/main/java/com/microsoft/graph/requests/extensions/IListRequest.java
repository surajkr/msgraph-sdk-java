// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.List;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the List Request.
 */
public interface IListRequest extends IHttpRequest {

    /**
     * Gets the List from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<List> callback);

    /**
     * Gets the List from the service
     *
     * @return the List from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    List get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<List> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this List with a source
     *
     * @param sourceList the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final List sourceList, final ICallback<List> callback);

    /**
     * Patches this List with a source
     *
     * @param sourceList the source object with updates
     * @return the updated List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    List patch(final List sourceList) throws ClientException;

    /**
     * Posts a List with a new object
     *
     * @param newList the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final List newList, final ICallback<List> callback);

    /**
     * Posts a List with a new object
     *
     * @param newList the new object to create
     * @return the created List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    List post(final List newList) throws ClientException;

    /**
     * Posts a List with a new object
     *
     * @param newList the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final List newList, final ICallback<List> callback);

    /**
     * Posts a List with a new object
     *
     * @param newList the object to create/update
     * @return the created List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    List put(final List newList) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IListRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IListRequest expand(final String value);

}

