package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssessmentResultEvent {
    private UUID userId;
    private UUID assessmentId;
    private UUID capsuleId;
    private String assessmentName;
    private int moodleQuizId;
    private double grade;
    private LocalDateTime timeStart;
    private LocalDateTime timeFinish;
    private int attemptNumber;

}
