// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionResponse;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner User.
 */
public class PlannerUser extends Entity implements IJsonBackedObject {


    /**
     * The Plans.
     * Read-only. Nullable. Returns the plannerTasks assigned to the user.
     */
    @SerializedName("plans")
    @Expose
    public PlannerPlanCollectionPage plans;

    /**
     * The Tasks.
     * Read-only. Nullable. Returns the plannerPlans shared with the user.
     */
    @SerializedName("tasks")
    @Expose
    public PlannerTaskCollectionPage tasks;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("plans")) {
            final PlannerPlanCollectionResponse response = new PlannerPlanCollectionResponse();
            if (json.has("plans@odata.nextLink")) {
                response.nextLink = json.get("plans@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("plans").toString(), JsonObject[].class);
            final PlannerPlan[] array = new PlannerPlan[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerPlan.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            plans = new PlannerPlanCollectionPage(response, null);
        }

        if (json.has("tasks")) {
            final PlannerTaskCollectionResponse response = new PlannerTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final PlannerTask[] array = new PlannerTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new PlannerTaskCollectionPage(response, null);
        }
    }
}
