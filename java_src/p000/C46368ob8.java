package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: ob8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46368ob8 {

    /* renamed from: a */
    public final V39 f102184a;

    /* renamed from: b */
    public final Boolean f102185b;

    /* renamed from: c */
    public final Boolean f102186c;

    /* renamed from: d */
    public final C46035o19 f102187d;

    /* renamed from: e */
    public final C43444jf9 f102188e;

    public /* synthetic */ C46368ob8(C37237Ya8 c37237Ya8, C45182mb8 c45182mb8) {
        V39 v39;
        Boolean bool;
        C43444jf9 c43444jf9;
        v39 = c37237Ya8.f46040a;
        this.f102184a = v39;
        this.f102185b = null;
        bool = c37237Ya8.f46041b;
        this.f102186c = bool;
        this.f102187d = null;
        c43444jf9 = c37237Ya8.f46042c;
        this.f102188e = c43444jf9;
    }

    @KY7(zza = 1)
    /* renamed from: a */
    public final V39 m20800a() {
        return this.f102184a;
    }

    @KY7(zza = 5)
    /* renamed from: b */
    public final C43444jf9 m20799b() {
        return this.f102188e;
    }

    @KY7(zza = 3)
    /* renamed from: c */
    public final Boolean m20798c() {
        return this.f102186c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C46368ob8)) {
            return false;
        }
        C46368ob8 c46368ob8 = (C46368ob8) obj;
        if (Objects.equal(this.f102184a, c46368ob8.f102184a) && Objects.equal(null, null) && Objects.equal(this.f102186c, c46368ob8.f102186c) && Objects.equal(null, null) && Objects.equal(this.f102188e, c46368ob8.f102188e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f102184a, null, this.f102186c, null, this.f102188e);
    }
}
