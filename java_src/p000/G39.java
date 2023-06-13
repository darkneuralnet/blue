package p000;

import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: G39 */
/* loaded from: classes5.dex */
public final class G39 {

    /* renamed from: a */
    public Long f10853a;

    /* renamed from: b */
    public G59 f10854b;

    /* renamed from: c */
    public Boolean f10855c;

    /* renamed from: d */
    public Boolean f10856d;

    /* renamed from: e */
    public Boolean f10857e;

    /* renamed from: a */
    public final G39 m105873a(Boolean bool) {
        this.f10856d = bool;
        return this;
    }

    /* renamed from: b */
    public final G39 m105872b(Boolean bool) {
        this.f10857e = bool;
        return this;
    }

    /* renamed from: c */
    public final G39 m105871c(Long l) {
        this.f10853a = Long.valueOf(l.longValue() & LongCompanionObject.MAX_VALUE);
        return this;
    }

    /* renamed from: d */
    public final G39 m105870d(G59 g59) {
        this.f10854b = g59;
        return this;
    }

    /* renamed from: e */
    public final G39 m105869e(Boolean bool) {
        this.f10855c = bool;
        return this;
    }

    /* renamed from: f */
    public final Y39 m105868f() {
        return new Y39(this, null);
    }
}
