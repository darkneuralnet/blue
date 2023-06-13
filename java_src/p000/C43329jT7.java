package p000;

import android.os.Binder;
/* renamed from: jT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C43329jT7 {
    /* renamed from: a */
    public static <V> V m30578a(InterfaceC52222yT7<V> interfaceC52222yT7) {
        try {
            return interfaceC52222yT7.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC52222yT7.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
