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
    private int courseModuleId; // id for tracking progress
    private int pageId; // id for fetching content
}
