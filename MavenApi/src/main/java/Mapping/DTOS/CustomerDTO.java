package Mapping.DTOS;

import domain.enums.CTier;

public record CustomerDTO(Long id,
                          String name,
                          CTier tier) {
}
