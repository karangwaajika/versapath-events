package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LearnerOnBoardingEvent {
    private UUID learnerId;
    private UUID talentRouteId;
    private UUID growthTrackId;
    private boolean requiresOnboarding;
}
