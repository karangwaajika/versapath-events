package org.common.event.producer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserEvent {
    private UUID versapathUserId;
    private String email;
    private String lastName;
    private String firstName;
    private String username;
}
