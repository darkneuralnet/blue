package p000;

import java.util.Map;
import p000.AbstractC52403ym5;
/* renamed from: cu */
/* loaded from: classes5.dex */
public final class C19635cu extends AbstractC52403ym5 {

    /* renamed from: a */
    public final InterfaceC38734bl0 f75794a;

    /* renamed from: b */
    public final Map<N24, AbstractC52403ym5.AbstractC30700b> f75795b;

    public C19635cu(InterfaceC38734bl0 interfaceC38734bl0, Map<N24, AbstractC52403ym5.AbstractC30700b> map) {
        if (interfaceC38734bl0 != null) {
            this.f75794a = interfaceC38734bl0;
            if (map != null) {
                this.f75795b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // p000.AbstractC52403ym5
    /* renamed from: e */
    public InterfaceC38734bl0 mo2619e() {
        return this.f75794a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC52403ym5)) {
            return false;
        }
        AbstractC52403ym5 abstractC52403ym5 = (AbstractC52403ym5) obj;
        if (this.f75794a.equals(abstractC52403ym5.mo2619e()) && this.f75795b.equals(abstractC52403ym5.mo2616h())) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC52403ym5
    /* renamed from: h */
    public Map<N24, AbstractC52403ym5.AbstractC30700b> mo2616h() {
        return this.f75795b;
    }

    public int hashCode() {
        return ((this.f75794a.hashCode() ^ 1000003) * 1000003) ^ this.f75795b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f75794a + ", values=" + this.f75795b + "}";
    }
}
