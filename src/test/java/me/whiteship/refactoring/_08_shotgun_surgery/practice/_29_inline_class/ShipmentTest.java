package me.whiteship.refactoring._08_shotgun_surgery.practice._29_inline_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipmentTest {

    @Test
    void trackingInfo() {
        Shipment shipment = new Shipment("UPS", "12345");
        assertEquals("UPS: 12345", shipment.getTrackingInfo());
    }

}
