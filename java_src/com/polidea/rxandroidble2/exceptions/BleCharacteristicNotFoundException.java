package com.polidea.rxandroidble2.exceptions;

import java.util.UUID;
/* loaded from: classes6.dex */
public class BleCharacteristicNotFoundException extends BleException {

    /* renamed from: b */
    public final UUID f75004b;

    public BleCharacteristicNotFoundException(UUID uuid) {
        super("Characteristic not found with UUID " + uuid);
        this.f75004b = uuid;
    }
}
