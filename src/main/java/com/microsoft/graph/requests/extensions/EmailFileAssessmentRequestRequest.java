// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailFileAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email File Assessment Request Request.
 */
public class EmailFileAssessmentRequestRequest extends BaseRequest implements IEmailFileAssessmentRequestRequest {
	
    /**
     * The request for the EmailFileAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailFileAssessmentRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailFileAssessmentRequest.class);
    }

    /**
     * Gets the EmailFileAssessmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EmailFileAssessmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EmailFileAssessmentRequest from the service
     *
     * @return the EmailFileAssessmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailFileAssessmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EmailFileAssessmentRequest> callback) {
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
     * Patches this EmailFileAssessmentRequest with a source
     *
     * @param sourceEmailFileAssessmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EmailFileAssessmentRequest sourceEmailFileAssessmentRequest, final ICallback<EmailFileAssessmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceEmailFileAssessmentRequest);
    }

    /**
     * Patches this EmailFileAssessmentRequest with a source
     *
     * @param sourceEmailFileAssessmentRequest the source object with updates
     * @return the updated EmailFileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailFileAssessmentRequest patch(final EmailFileAssessmentRequest sourceEmailFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EmailFileAssessmentRequest newEmailFileAssessmentRequest, final ICallback<EmailFileAssessmentRequest> callback) {
        send(HttpMethod.POST, callback, newEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the new object to create
     * @return the created EmailFileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailFileAssessmentRequest post(final EmailFileAssessmentRequest newEmailFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.POST, newEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EmailFileAssessmentRequest newEmailFileAssessmentRequest, final ICallback<EmailFileAssessmentRequest> callback) {
        send(HttpMethod.PUT, callback, newEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the object to create/update
     * @return the created EmailFileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailFileAssessmentRequest put(final EmailFileAssessmentRequest newEmailFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newEmailFileAssessmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEmailFileAssessmentRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EmailFileAssessmentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEmailFileAssessmentRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EmailFileAssessmentRequestRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IEmailFileAssessmentRequestRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (EmailFileAssessmentRequestRequest)this;
     }

}

