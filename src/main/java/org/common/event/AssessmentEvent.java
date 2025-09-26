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
public class AssessmentEvent {
    private String assessmentName;
    private String assessmentType;
    private int maxAttempts;
    private int timeLimitMinutes;
    private int passingScore;
    private UUID capsuleId;
    private int moodleCourseId;

}
