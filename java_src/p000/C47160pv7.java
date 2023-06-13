package p000;

import com.google.android.gms.common.internal.Preconditions;
/* renamed from: pv7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47160pv7 {

    /* renamed from: a */
    public final String f104324a;

    /* renamed from: b */
    public final String f104325b;

    /* renamed from: c */
    public final long f104326c;

    /* renamed from: d */
    public final long f104327d;

    /* renamed from: e */
    public final long f104328e;

    /* renamed from: f */
    public final long f104329f;

    /* renamed from: g */
    public final long f104330g;

    /* renamed from: h */
    public final Long f104331h;

    /* renamed from: i */
    public final Long f104332i;

    /* renamed from: j */
    public final Long f104333j;

    /* renamed from: k */
    public final Boolean f104334k;

    public C47160pv7(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        Preconditions.checkArgument(j5 >= 0);
        this.f104324a = str;
        this.f104325b = str2;
        this.f104326c = j;
        this.f104327d = j2;
        this.f104328e = j3;
        this.f104329f = j4;
        this.f104330g = j5;
        this.f104331h = l;
        this.f104332i = l2;
        this.f104333j = l3;
        this.f104334k = bool;
    }

    /* renamed from: a */
    public final C47160pv7 m18425a(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new C47160pv7(this.f104324a, this.f104325b, this.f104326c, this.f104327d, this.f104328e, this.f104329f, this.f104330g, this.f104331h, l, l2, bool);
    }

    /* renamed from: b */
    public final C47160pv7 m18424b(long j, long j2) {
        return new C47160pv7(this.f104324a, this.f104325b, this.f104326c, this.f104327d, this.f104328e, this.f104329f, j, Long.valueOf(j2), this.f104332i, this.f104333j, this.f104334k);
    }

    /* renamed from: c */
    public final C47160pv7 m18423c(long j) {
        return new C47160pv7(this.f104324a, this.f104325b, this.f104326c, this.f104327d, this.f104328e, j, this.f104330g, this.f104331h, this.f104332i, this.f104333j, this.f104334k);
    }
}
