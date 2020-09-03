// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms And Conditions Assignment Request.
 */
public interface ITermsAndConditionsAssignmentRequest extends IHttpRequest {

    /**
     * Gets the TermsAndConditionsAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<TermsAndConditionsAssignment> callback);

    /**
     * Gets the TermsAndConditionsAssignment from the service
     *
     * @return the TermsAndConditionsAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsAndConditionsAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<TermsAndConditionsAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TermsAndConditionsAssignment with a source
     *
     * @param sourceTermsAndConditionsAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TermsAndConditionsAssignment sourceTermsAndConditionsAssignment, final ICallback<TermsAndConditionsAssignment> callback);

    /**
     * Patches this TermsAndConditionsAssignment with a source
     *
     * @param sourceTermsAndConditionsAssignment the source object with updates
     * @return the updated TermsAndConditionsAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsAndConditionsAssignment patch(final TermsAndConditionsAssignment sourceTermsAndConditionsAssignment) throws ClientException;

    /**
     * Posts a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment, final ICallback<TermsAndConditionsAssignment> callback);

    /**
     * Posts a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the new object to create
     * @return the created TermsAndConditionsAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsAndConditionsAssignment post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment) throws ClientException;

    /**
     * Posts a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TermsAndConditionsAssignment newTermsAndConditionsAssignment, final ICallback<TermsAndConditionsAssignment> callback);

    /**
     * Posts a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the object to create/update
     * @return the created TermsAndConditionsAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsAndConditionsAssignment put(final TermsAndConditionsAssignment newTermsAndConditionsAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITermsAndConditionsAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITermsAndConditionsAssignmentRequest expand(final String value);

}

