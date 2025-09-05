package org.common.event.consumer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumeUserEvent {
    private UUID versapathUserId;
    private Long moodleUserId;
}
