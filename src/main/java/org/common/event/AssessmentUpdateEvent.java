package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssessmentUpdateEvent {
    private String assessmentName;
    private int quizId;
    private int moodleCourseModuleId;
}
