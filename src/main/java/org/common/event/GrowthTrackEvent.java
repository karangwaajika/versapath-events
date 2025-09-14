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
public class GrowthTrackEvent {
    private UUID id;
    private String name;
    private String description;
    private List<Map<UUID, Integer>> skillCapsules; // capsule ID with its sequence order
}
