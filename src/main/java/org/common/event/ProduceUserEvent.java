package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduceUserEvent {
    private UUID versapathUserId;
    private String email;
    private String lastName;
    private String firstName;
    private String username;
    private String imageUrl;
}
