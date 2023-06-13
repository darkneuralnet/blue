package p000;
/* renamed from: bV8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38587bV8 extends ES8 {
    public C38587bV8() {
        super(4);
    }

    /* renamed from: c */
    public final C38587bV8 m64503c(Object obj) {
        super.m108965a(obj);
        return this;
    }

    /* renamed from: d */
    public final AbstractC45127mV8 m64502d() {
        AbstractC45127mV8 m25477w;
        int i = this.f7511b;
        if (i != 0) {
            if (i != 1) {
                m25477w = AbstractC45127mV8.m25477w(i, this.f7510a);
                this.f7511b = m25477w.size();
                this.f7512c = true;
                return m25477w;
            }
            Object obj = this.f7510a[0];
            obj.getClass();
            return new C51666xX8(obj);
        }
        return C39809dX8.f76751j;
    }
}
