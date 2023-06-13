package p000;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: rt8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48327rt8 {

    /* renamed from: a */
    public static final AtomicBoolean f107856a = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m15108a(Context context) {
        if (f107856a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C47664qm8());
    }
}
