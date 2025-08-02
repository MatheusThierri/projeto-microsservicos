package com.algaworks.algadelivery.delivery.tracking.domain.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@ToString
public class DeliveryPlacedEvent {
    private final OffsetDateTime ocurredAt;
    private final UUID deliveryId;
}
