package p000;

import java.util.Date;
/* renamed from: lh9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44650lh9 {

    /* renamed from: a */
    public final Date f96570a;

    /* renamed from: b */
    public final Vg9 f96571b;

    /* renamed from: c */
    public final String f96572c;

    public C44650lh9(Date date, int i, Vg9 vg9, String str) {
        this.f96570a = date;
        this.f96571b = vg9;
        this.f96572c = str;
    }

    /* renamed from: b */
    public static C44650lh9 m26947b(Date date) {
        return new C44650lh9(date, 1, null, null);
    }

    /* renamed from: c */
    public static C44650lh9 m26946c(Vg9 vg9, String str) {
        return new C44650lh9(vg9.m79570c(), 0, vg9, str);
    }

    /* renamed from: a */
    public final Vg9 m26948a() {
        return this.f96571b;
    }
}
