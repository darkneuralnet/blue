package p000;

import java.io.File;
import p000.InterfaceC52578z41;
/* renamed from: G41 */
/* loaded from: classes5.dex */
public class G41 implements InterfaceC52578z41.InterfaceC30901a {

    /* renamed from: a */
    public final long f10862a;

    /* renamed from: b */
    public final InterfaceC2625a f10863b;

    /* renamed from: G41$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC2625a {
        /* renamed from: a */
        File mo21782a();
    }

    public G41(InterfaceC2625a interfaceC2625a, long j) {
        this.f10862a = j;
        this.f10863b = interfaceC2625a;
    }

    @Override // p000.InterfaceC52578z41.InterfaceC30901a
    public InterfaceC52578z41 build() {
        File mo21782a = this.f10863b.mo21782a();
        if (mo21782a == null) {
            return null;
        }
        if (!mo21782a.isDirectory() && !mo21782a.mkdirs()) {
            return null;
        }
        return H41.m104450c(mo21782a, this.f10862a);
    }
}
