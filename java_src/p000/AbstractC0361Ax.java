package p000;

import com.github.mikephil.charting.data.Entry;
import p000.TS0;
/* renamed from: Ax */
/* loaded from: classes5.dex */
public abstract class AbstractC0361Ax extends RS0 {

    /* renamed from: g */
    public C0362a f1449g;

    /* renamed from: Ax$a */
    /* loaded from: classes5.dex */
    public class C0362a {

        /* renamed from: a */
        public int f1450a;

        /* renamed from: b */
        public int f1451b;

        /* renamed from: c */
        public int f1452c;

        public C0362a() {
        }

        /* renamed from: a */
        public void m114826a(InterfaceC30784yx interfaceC30784yx, YN1 yn1) {
            int mo21238b;
            float max = Math.max(0.0f, Math.min(1.0f, AbstractC0361Ax.this.f32035b.m36088a()));
            float mo2232c = interfaceC30784yx.mo2232c();
            float mo2230o = interfaceC30784yx.mo2230o();
            Object mo21243D0 = yn1.mo21243D0(mo2232c, Float.NaN, TS0.EnumC7851a.DOWN);
            Object mo21243D02 = yn1.mo21243D0(mo2230o, Float.NaN, TS0.EnumC7851a.UP);
            int i = 0;
            if (mo21243D0 == null) {
                mo21238b = 0;
            } else {
                mo21238b = yn1.mo21238b(mo21243D0);
            }
            this.f1450a = mo21238b;
            if (mo21243D02 != null) {
                i = yn1.mo21238b(mo21243D02);
            }
            this.f1451b = i;
            this.f1452c = (int) ((i - this.f1450a) * max);
        }
    }

    public AbstractC0361Ax(C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f1449g = new C0362a();
    }

    /* renamed from: h */
    public boolean m114828h(Entry entry, YN1 yn1) {
        if (entry == null || yn1.mo21238b(entry) >= yn1.mo21241L0() * this.f32035b.m36088a()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m114827i(InterfaceC46243oO1 interfaceC46243oO1) {
        return interfaceC46243oO1.isVisible() && (interfaceC46243oO1.mo4014i0() || interfaceC46243oO1.mo4027D());
    }
}
