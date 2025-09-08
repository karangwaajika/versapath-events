package org.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestEvent {
    String name;
    String location;
    int age;
<<<<<<< HEAD
    int year;
=======
>>>>>>> 97d80b07208bc7384848f9ce96d9b5ae6990ba32
}
