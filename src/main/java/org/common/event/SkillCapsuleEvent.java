package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkillCapsuleEvent {
    UUID id;
    String name;
    private int moodleCourseId;
    private String description;
    private String difficulty;
    private String proficiencyLevel;
    private List<Map<UUID, Integer>> skillAtom; // atom ID with its sequence order
    private List<UUID> clusters;
}
