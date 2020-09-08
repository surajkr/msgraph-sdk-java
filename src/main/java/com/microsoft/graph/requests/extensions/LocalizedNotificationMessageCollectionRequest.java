// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.LocalizedNotificationMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionPage;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionRequest;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Localized Notification Message Collection Request.
 */
public class LocalizedNotificationMessageCollectionRequest extends BaseCollectionRequest<LocalizedNotificationMessageCollectionResponse, ILocalizedNotificationMessageCollectionPage> implements ILocalizedNotificationMessageCollectionRequest {

    /**
     * The request builder for this collection of LocalizedNotificationMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LocalizedNotificationMessageCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LocalizedNotificationMessageCollectionResponse.class, ILocalizedNotificationMessageCollectionPage.class);
    }

    public void get(final ICallback<ILocalizedNotificationMessageCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ILocalizedNotificationMessageCollectionPage get() throws ClientException {
        final LocalizedNotificationMessageCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final LocalizedNotificationMessage newLocalizedNotificationMessage, final ICallback<LocalizedNotificationMessage> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new LocalizedNotificationMessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newLocalizedNotificationMessage, callback);
    }

    public LocalizedNotificationMessage post(final LocalizedNotificationMessage newLocalizedNotificationMessage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new LocalizedNotificationMessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newLocalizedNotificationMessage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ILocalizedNotificationMessageCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ILocalizedNotificationMessageCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ILocalizedNotificationMessageCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    public ILocalizedNotificationMessageCollectionPage buildFromResponse(final LocalizedNotificationMessageCollectionResponse response) {
        final ILocalizedNotificationMessageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new LocalizedNotificationMessageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final LocalizedNotificationMessageCollectionPage page = new LocalizedNotificationMessageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
