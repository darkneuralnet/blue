package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import p000.TN8;
/* renamed from: TN8 */
/* loaded from: classes5.dex */
public class TN8<T extends TN8> {

    /* renamed from: a */
    public final Ql9 f35397a;

    /* renamed from: b */
    public final C34366Lt8 f35398b;

    /* renamed from: c */
    public final List<NA8> f35399c;

    @VisibleForTesting
    public TN8(Ql9 ql9, Clock clock) {
        Preconditions.checkNotNull(ql9);
        this.f35397a = ql9;
        this.f35399c = new ArrayList();
        C34366Lt8 c34366Lt8 = new C34366Lt8(this, clock);
        c34366Lt8.m96225h();
        this.f35398b = c34366Lt8;
    }

    /* renamed from: a */
    public void mo15629a(C34366Lt8 c34366Lt8) {
        throw null;
    }

    /* renamed from: b */
    public final Ql9 m83705b() {
        return this.f35397a;
    }

    /* renamed from: c */
    public final void m83704c(C34366Lt8 c34366Lt8) {
        for (NA8 na8 : this.f35399c) {
            na8.zza();
        }
    }
}
