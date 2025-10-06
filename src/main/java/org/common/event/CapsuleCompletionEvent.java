package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CapsuleCompletionEvent {
    private UUID learnerId;
    private UUID capsuleId;
    private String capsuleName;
    private String capsuleDescription;
}
