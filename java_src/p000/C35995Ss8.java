package p000;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: Ss8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35995Ss8 extends ContentObserver {
    public C35995Ss8(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C35770Rt8.f32811e;
        atomicBoolean.set(true);
    }
}
