package p000;

import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: pL8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46816pL8 {

    /* renamed from: a */
    public Long f103543a;

    /* renamed from: b */
    public ZN8 f103544b;

    /* renamed from: c */
    public Boolean f103545c;

    /* renamed from: d */
    public Boolean f103546d;

    /* renamed from: e */
    public Boolean f103547e;

    /* renamed from: a */
    public final C46816pL8 m19438a(Boolean bool) {
        this.f103546d = bool;
        return this;
    }

    /* renamed from: b */
    public final C46816pL8 m19437b(Boolean bool) {
        this.f103547e = bool;
        return this;
    }

    /* renamed from: c */
    public final C46816pL8 m19436c(Long l) {
        this.f103543a = Long.valueOf(l.longValue() & LongCompanionObject.MAX_VALUE);
        return this;
    }

    /* renamed from: d */
    public final C46816pL8 m19435d(ZN8 zn8) {
        this.f103544b = zn8;
        return this;
    }

    /* renamed from: e */
    public final C46816pL8 m19434e(Boolean bool) {
        this.f103545c = bool;
        return this;
    }

    /* renamed from: f */
    public final NL8 m19433f() {
        return new NL8(this, null);
    }
}
