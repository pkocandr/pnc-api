/**
 * Copyright 2026 Red Hat, Inc.
 * SPDX-License-Identifier: Apache-2.0
 */
package org.jboss.pnc.api.trackingservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Jacksonized
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingReport {

    private String trackingID;

    private Set<TrackedEntry> uploads;

    private Set<TrackedEntry> downloads;

}