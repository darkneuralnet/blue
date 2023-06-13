package p000;

import java.util.List;
/* renamed from: tL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49186tL7 extends HL7 {

    /* renamed from: d */
    public final transient int f110324d;

    /* renamed from: e */
    public final transient int f110325e;

    /* renamed from: f */
    public final /* synthetic */ HL7 f110326f;

    public C49186tL7(HL7 hl7, int i, int i2) {
        this.f110326f = hl7;
        this.f110324d = i;
        this.f110325e = i2;
    }

    @Override // p000.BJ7
    /* renamed from: b */
    public final int mo12495b() {
        return this.f110326f.mo12494c() + this.f110324d + this.f110325e;
    }

    @Override // p000.BJ7
    /* renamed from: c */
    public final int mo12494c() {
        return this.f110326f.mo12494c() + this.f110324d;
    }

    @Override // p000.BJ7
    /* renamed from: f */
    public final Object[] mo12493f() {
        return this.f110326f.mo12493f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C50566vg7.m8263a(i, this.f110325e, "index");
        return this.f110326f.get(i + this.f110324d);
    }

    @Override // p000.HL7
    /* renamed from: h */
    public final HL7 mo12492h(int i, int i2) {
        C50566vg7.m8261c(i, i2, this.f110325e);
        HL7 hl7 = this.f110326f;
        int i3 = this.f110324d;
        return hl7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f110325e;
    }

    @Override // p000.HL7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
