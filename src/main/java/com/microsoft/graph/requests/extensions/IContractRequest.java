// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Contract;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Contract Request.
 */
public interface IContractRequest extends IHttpRequest {

    /**
     * Gets the Contract from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Contract> callback);

    /**
     * Gets the Contract from the service
     *
     * @return the Contract from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Contract get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Contract> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Contract with a source
     *
     * @param sourceContract the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Contract sourceContract, final ICallback<Contract> callback);

    /**
     * Patches this Contract with a source
     *
     * @param sourceContract the source object with updates
     * @return the updated Contract
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Contract patch(final Contract sourceContract) throws ClientException;

    /**
     * Posts a Contract with a new object
     *
     * @param newContract the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Contract newContract, final ICallback<Contract> callback);

    /**
     * Posts a Contract with a new object
     *
     * @param newContract the new object to create
     * @return the created Contract
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Contract post(final Contract newContract) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IContractRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IContractRequest expand(final String value);

}

