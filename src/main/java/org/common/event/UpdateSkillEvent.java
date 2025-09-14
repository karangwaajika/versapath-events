package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateSkillEvent {
    private int courseId; // Moodle course id
    private String name; // versapath capsule name
    private List<SkillAtom> skillAtoms;
}
