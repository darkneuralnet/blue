package p000;

import java.lang.ref.WeakReference;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
/* renamed from: Qh6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35426Qh6 extends AbstractC43480jj5 {

    /* renamed from: a */
    public final WeakReference<AbstractC43480jj5> f30760a;

    public C35426Qh6(AbstractC43480jj5 abstractC43480jj5) {
        this.f30760a = new WeakReference<>(abstractC43480jj5);
    }

    @Override // p000.AbstractC43480jj5
    /* renamed from: a */
    public void mo30024a(List<ScanResult> list) {
        AbstractC43480jj5 abstractC43480jj5 = this.f30760a.get();
        if (abstractC43480jj5 != null) {
            abstractC43480jj5.mo30024a(list);
        }
    }

    @Override // p000.AbstractC43480jj5
    /* renamed from: b */
    public void mo30023b(int i) {
        AbstractC43480jj5 abstractC43480jj5 = this.f30760a.get();
        if (abstractC43480jj5 != null) {
            abstractC43480jj5.mo30023b(i);
        }
    }

    @Override // p000.AbstractC43480jj5
    /* renamed from: c */
    public void mo30022c(int i, ScanResult scanResult) {
        AbstractC43480jj5 abstractC43480jj5 = this.f30760a.get();
        if (abstractC43480jj5 != null) {
            abstractC43480jj5.mo30022c(i, scanResult);
        }
    }

    /* renamed from: d */
    public AbstractC43480jj5 m88174d() {
        return this.f30760a.get();
    }

    /* renamed from: e */
    public boolean m88173e() {
        return this.f30760a.get() == null;
    }
}
