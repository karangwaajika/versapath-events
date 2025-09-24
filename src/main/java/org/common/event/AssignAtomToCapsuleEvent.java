package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignAtomToCapsuleEvent {
    private int moodleCourseId;
    private String courseName;
    private List<String> atoms;
}
