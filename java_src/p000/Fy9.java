package p000;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: Fy9 */
/* loaded from: classes5.dex */
public final class Fy9 extends ContentObserver {
    public Fy9(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = Fx9.f10597e;
        atomicBoolean.set(true);
    }
}
