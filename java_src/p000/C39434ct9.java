package p000;

import java.time.Instant;
/* renamed from: ct9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39434ct9 {
    /* renamed from: a */
    public static Kr9 m44886a(G29 g29) {
        Instant now;
        long epochSecond;
        int nano;
        now = Instant.now();
        epochSecond = now.getEpochSecond();
        nano = now.getNano();
        return C41805gt9.m37355d(epochSecond, nano);
    }
}
