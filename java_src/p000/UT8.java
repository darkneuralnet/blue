package p000;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.List;
/* renamed from: UT8 */
/* loaded from: classes5.dex */
public final class UT8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C34366Lt8 f37459b;

    /* renamed from: c */
    public final /* synthetic */ Ql9 f37460c;

    public UT8(Ql9 ql9, C34366Lt8 c34366Lt8) {
        this.f37460c = ql9;
        this.f37459b = c34366Lt8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<Zo9> list;
        this.f37459b.m96229d().mo15629a(this.f37459b);
        list = this.f37460c.f30881b;
        for (Zo9 zo9 : list) {
            zo9.zza();
        }
        C34366Lt8 c34366Lt8 = this.f37459b;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(c34366Lt8.m96220m(), "Measurement must be submitted");
        List<Zq9> m96227f = c34366Lt8.m96227f();
        if (!m96227f.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (Zq9 zq9 : m96227f) {
                Uri zzb = zq9.zzb();
                if (!hashSet.contains(zzb)) {
                    hashSet.add(zzb);
                    zq9.mo72399a(c34366Lt8);
                }
            }
        }
    }
}
