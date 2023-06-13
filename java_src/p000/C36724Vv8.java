package p000;

import android.os.Binder;
/* renamed from: Vv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C36724Vv8 {
    /* renamed from: a */
    public static Object m79226a(InterfaceC43020iw8 interfaceC43020iw8) {
        try {
            return interfaceC43020iw8.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC43020iw8.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
