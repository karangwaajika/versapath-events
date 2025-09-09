package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkillAtomEvent {
    UUID id;
    String name;
    private String description;
    private int moodleModuleId; // id for tracking progress
    private int moodlePageId; // id for fetching content

}
