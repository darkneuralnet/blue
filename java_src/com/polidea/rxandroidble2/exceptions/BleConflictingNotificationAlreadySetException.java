package com.polidea.rxandroidble2.exceptions;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import java.util.UUID;
/* loaded from: classes6.dex */
public class BleConflictingNotificationAlreadySetException extends BleException {

    /* renamed from: b */
    public final UUID f75005b;

    /* renamed from: c */
    public final boolean f75006c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BleConflictingNotificationAlreadySetException(UUID uuid, boolean z) {
        super(r0.toString());
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Characteristic ");
        sb.append(uuid);
        sb.append(" notification already set to ");
        if (z) {
            str = "indication";
        } else {
            str = TransferService.INTENT_KEY_NOTIFICATION;
        }
        sb.append(str);
        this.f75005b = uuid;
        this.f75006c = z;
    }
}
