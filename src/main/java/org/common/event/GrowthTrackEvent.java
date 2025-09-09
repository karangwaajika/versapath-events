package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.common.event.util.ProficiencyLevel;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GrowthTrackEvent {
    UUID id;
    String name;
    private String description;
    List<Map<UUID, int>> skillCapsules; // capsule ID with its sequence order
}
