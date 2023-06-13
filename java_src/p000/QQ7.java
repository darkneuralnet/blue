package p000;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: QQ7 */
/* loaded from: classes5.dex */
public final class QQ7 extends ContentObserver {
    public QQ7(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C41532gR7.f82202e;
        atomicBoolean.set(true);
    }
}
