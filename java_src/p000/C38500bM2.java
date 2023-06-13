package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: bM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38500bM2 {

    /* renamed from: a */
    public static final String f57337a = "bM2";

    /* renamed from: b */
    public static boolean f57338b = false;

    /* renamed from: c */
    public static EnumC12375a f57339c = EnumC12375a.LEGACY;

    /* renamed from: bM2$a */
    /* loaded from: classes6.dex */
    public enum EnumC12375a {
        LEGACY,
        LATEST
    }

    private C38500bM2() {
    }

    /* renamed from: a */
    public static synchronized int m64632a(Context context) {
        int m64631b;
        synchronized (C38500bM2.class) {
            m64631b = m64631b(context, null, null);
        }
        return m64631b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|12|14|15|16|17|(10:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30)|31|32)|36|23|24|(0)|27|28|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        android.util.Log.e(p000.C38500bM2.f57337a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: RemoteException -> 0x005b, all -> 0x0089, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:21:0x0049, B:23:0x004f, B:24:0x0053), top: B:48:0x0049, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x001e, B:10:0x0025, B:11:0x0029, B:13:0x0038, B:15:0x003d, B:21:0x0049, B:23:0x004f, B:24:0x0053, B:28:0x0063, B:30:0x0076, B:27:0x005c, B:34:0x007e, B:35:0x0083, B:37:0x0085), top: B:47:0x0003, inners: #0, #1, #3 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int m64631b(Context context, EnumC12375a enumC12375a, InterfaceC36584Vg3 interfaceC36584Vg3) {
        synchronized (C38500bM2.class) {
            Preconditions.checkNotNull(context, "Context is null");
            Log.d(f57337a, "preferredRenderer: ".concat(String.valueOf(enumC12375a)));
            if (f57338b) {
                if (interfaceC36584Vg3 != null) {
                    interfaceC36584Vg3.mo11201a(f57339c);
                }
                return 0;
            }
            try {
                InterfaceC49955ue8 m109024a = EQ7.m109024a(context, enumC12375a);
                try {
                    C48149rc0.m15704f(m109024a.zze());
                    C6780QT.m88493c(m109024a.mo9914c());
                    int i = 1;
                    f57338b = true;
                    if (enumC12375a != null) {
                        int ordinal = enumC12375a.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                i = 2;
                            }
                        }
                        if (m109024a.zzd() == 2) {
                            f57339c = EnumC12375a.LATEST;
                        }
                        m109024a.mo9917G0(BinderC36557Vd3.m79636e5(context), i);
                        Log.d(f57337a, "loadedRenderer: ".concat(String.valueOf(f57339c)));
                        if (interfaceC36584Vg3 != null) {
                            interfaceC36584Vg3.mo11201a(f57339c);
                        }
                        return 0;
                    }
                    i = 0;
                    if (m109024a.zzd() == 2) {
                    }
                    m109024a.mo9917G0(BinderC36557Vd3.m79636e5(context), i);
                    Log.d(f57337a, "loadedRenderer: ".concat(String.valueOf(f57339c)));
                    if (interfaceC36584Vg3 != null) {
                    }
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        }
    }
}
