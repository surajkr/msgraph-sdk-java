// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ConversationMember;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Conversation Member Request.
 */
public interface IConversationMemberRequest extends IHttpRequest {

    /**
     * Gets the ConversationMember from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ConversationMember> callback);

    /**
     * Gets the ConversationMember from the service
     *
     * @return the ConversationMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationMember get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ConversationMember> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ConversationMember with a source
     *
     * @param sourceConversationMember the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ConversationMember sourceConversationMember, final ICallback<ConversationMember> callback);

    /**
     * Patches this ConversationMember with a source
     *
     * @param sourceConversationMember the source object with updates
     * @return the updated ConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationMember patch(final ConversationMember sourceConversationMember) throws ClientException;

    /**
     * Posts a ConversationMember with a new object
     *
     * @param newConversationMember the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ConversationMember newConversationMember, final ICallback<ConversationMember> callback);

    /**
     * Posts a ConversationMember with a new object
     *
     * @param newConversationMember the new object to create
     * @return the created ConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationMember post(final ConversationMember newConversationMember) throws ClientException;

    /**
     * Posts a ConversationMember with a new object
     *
     * @param newConversationMember the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ConversationMember newConversationMember, final ICallback<ConversationMember> callback);

    /**
     * Posts a ConversationMember with a new object
     *
     * @param newConversationMember the object to create/update
     * @return the created ConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationMember put(final ConversationMember newConversationMember) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IConversationMemberRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IConversationMemberRequest expand(final String value);

}

