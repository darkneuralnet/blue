package p000;

import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: QD8 */
/* loaded from: classes5.dex */
public final class QD8 {

    /* renamed from: a */
    public Long f30063a;

    /* renamed from: b */
    public EnumC38434bE8 f30064b;

    /* renamed from: c */
    public JC8 f30065c;

    /* renamed from: d */
    public Integer f30066d;

    /* renamed from: e */
    public Integer f30067e;

    /* renamed from: f */
    public Integer f30068f;

    /* renamed from: g */
    public Integer f30069g;

    /* renamed from: b */
    public final QD8 m88728b(Long l) {
        this.f30063a = Long.valueOf(l.longValue() & LongCompanionObject.MAX_VALUE);
        return this;
    }

    /* renamed from: c */
    public final QD8 m88727c(Integer num) {
        this.f30066d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    /* renamed from: d */
    public final QD8 m88726d(JC8 jc8) {
        this.f30065c = jc8;
        return this;
    }

    /* renamed from: e */
    public final QD8 m88725e(Integer num) {
        this.f30068f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    /* renamed from: f */
    public final QD8 m88724f(EnumC38434bE8 enumC38434bE8) {
        this.f30064b = enumC38434bE8;
        return this;
    }

    /* renamed from: g */
    public final QD8 m88723g(Integer num) {
        this.f30067e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    /* renamed from: h */
    public final QD8 m88722h(Integer num) {
        this.f30069g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    /* renamed from: j */
    public final C52681zE8 m88720j() {
        return new C52681zE8(this, null);
    }
}
