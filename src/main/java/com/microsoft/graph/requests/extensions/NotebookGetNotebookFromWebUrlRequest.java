// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.NotebookGetNotebookFromWebUrlBody;
import com.microsoft.graph.models.extensions.CopyNotebookModel;
import com.microsoft.graph.requests.extensions.INotebookGetNotebookFromWebUrlRequest;
import com.microsoft.graph.requests.extensions.NotebookGetNotebookFromWebUrlRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Get Notebook From Web Url Request.
 */
public class NotebookGetNotebookFromWebUrlRequest extends BaseRequest implements INotebookGetNotebookFromWebUrlRequest {
    protected final NotebookGetNotebookFromWebUrlBody body;

    /**
     * The request for this NotebookGetNotebookFromWebUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotebookGetNotebookFromWebUrlRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CopyNotebookModel.class);
        body = new NotebookGetNotebookFromWebUrlBody();
    }

    public void post(final ICallback<CopyNotebookModel> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public CopyNotebookModel post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public INotebookGetNotebookFromWebUrlRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (NotebookGetNotebookFromWebUrlRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public INotebookGetNotebookFromWebUrlRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (NotebookGetNotebookFromWebUrlRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public INotebookGetNotebookFromWebUrlRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (NotebookGetNotebookFromWebUrlRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public INotebookGetNotebookFromWebUrlRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (NotebookGetNotebookFromWebUrlRequest)this;
    }

}
