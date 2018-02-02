// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Dns Record Request.
 */
public class BaseDomainDnsRecordRequest extends BaseRequest implements IBaseDomainDnsRecordRequest {

    /**
     * The request for the DomainDnsRecord
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseDomainDnsRecordRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DomainDnsRecord from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<DomainDnsRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsRecord from the service
     * @return The DomainDnsRecord from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DomainDnsRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DomainDnsRecord with a source
     * @param sourceDomainDnsRecord The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final DomainDnsRecord sourceDomainDnsRecord, final ICallback<DomainDnsRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsRecord);
    }

    /**
     * Patches this DomainDnsRecord with a source
     * @param sourceDomainDnsRecord The source object with updates
     * @return The updated DomainDnsRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DomainDnsRecord patch(final DomainDnsRecord sourceDomainDnsRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     * @param newDomainDnsRecord The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final DomainDnsRecord newDomainDnsRecord, final ICallback<DomainDnsRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     * @param newDomainDnsRecord The new object to create
     * @return The created DomainDnsRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DomainDnsRecord post(final DomainDnsRecord newDomainDnsRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IDomainDnsRecordRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DomainDnsRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IDomainDnsRecordRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DomainDnsRecordRequest)this;
     }

}

