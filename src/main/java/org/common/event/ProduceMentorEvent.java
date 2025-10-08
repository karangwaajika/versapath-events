package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProduceMentorEvent {
    private UUID versapathUserId;
    private String email;
    private String firstName;
    private String lastName;
    private String username;
    private  String imageUrl;
    private List<UUID> specializations;
}
