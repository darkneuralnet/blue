package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* renamed from: lY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44558lY5 implements InterfaceC45469n46 {
    @Override // p000.InterfaceC45469n46
    /* renamed from: a */
    public long mo24490a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // p000.InterfaceC45469n46
    /* renamed from: b */
    public long mo24489b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
