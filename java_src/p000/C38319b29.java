package p000;

import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: b29  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38319b29 {

    /* renamed from: a */
    public Long f56818a;

    /* renamed from: b */
    public V39 f56819b;

    /* renamed from: c */
    public Boolean f56820c;

    /* renamed from: d */
    public Boolean f56821d;

    /* renamed from: e */
    public Boolean f56822e;

    /* renamed from: a */
    public final C38319b29 m65076a(Boolean bool) {
        this.f56821d = bool;
        return this;
    }

    /* renamed from: b */
    public final C38319b29 m65075b(Boolean bool) {
        this.f56822e = bool;
        return this;
    }

    /* renamed from: c */
    public final C38319b29 m65074c(Long l) {
        this.f56818a = Long.valueOf(l.longValue() & LongCompanionObject.MAX_VALUE);
        return this;
    }

    /* renamed from: d */
    public final C38319b29 m65073d(V39 v39) {
        this.f56819b = v39;
        return this;
    }

    /* renamed from: e */
    public final C38319b29 m65072e(Boolean bool) {
        this.f56820c = bool;
        return this;
    }

    /* renamed from: f */
    public final C50194v29 m65071f() {
        return new C50194v29(this, null);
    }
}
