package za.ac.cput.model;

import lombok.*;

/**
 * Represents a user session.
 *
 * Author: Rethabile Ntsekhe
 * Student number: 220455430
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSession {
    private String sessionToken;
    private String userId;
}
