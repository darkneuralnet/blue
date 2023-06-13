package p000;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@VisibleForTesting
/* renamed from: aD1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37825aD1 extends C48176re7 {

    /* renamed from: j */
    public static List<Runnable> f50071j = new ArrayList();

    /* renamed from: f */
    public boolean f50072f;

    /* renamed from: g */
    public Set<Object> f50073g;

    /* renamed from: h */
    public boolean f50074h;

    /* renamed from: i */
    public volatile boolean f50075i;

    @VisibleForTesting
    public C37825aD1(zzbv zzbvVar) {
        super(zzbvVar);
        this.f50073g = new HashSet();
    }

    /* renamed from: k */
    public static void m71780k() {
        synchronized (C37825aD1.class) {
            List<Runnable> list = f50071j;
            if (list != null) {
                for (Runnable runnable : list) {
                    runnable.run();
                }
                f50071j = null;
            }
        }
    }

    /* renamed from: h */
    public boolean m71783h() {
        return this.f50075i;
    }

    /* renamed from: i */
    public boolean m71782i() {
        return this.f50074h;
    }

    /* renamed from: j */
    public void m71781j(boolean z) {
        this.f50074h = z;
    }

    /* renamed from: l */
    public final void m71779l() {
        zzft zzq = m15627e().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            m71781j(zzq.zzc());
        }
        zzq.zzf();
        this.f50072f = true;
    }

    /* renamed from: m */
    public final boolean m71778m() {
        return this.f50072f;
    }
}
