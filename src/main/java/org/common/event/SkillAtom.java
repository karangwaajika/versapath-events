package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillAtom {
    private String name; // versapath atom name
    private Long courseModuleId; // id for tracking progress
    private Long pageId; // id for fetching content
}
