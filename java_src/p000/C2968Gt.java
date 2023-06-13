package p000;
/* renamed from: Gt */
/* loaded from: classes.dex */
public final class C2968Gt extends AbstractC41598gZ1 {

    /* renamed from: a */
    public final float f12578a;

    /* renamed from: b */
    public final float f12579b;

    /* renamed from: c */
    public final float f12580c;

    /* renamed from: d */
    public final float f12581d;

    public C2968Gt(float f, float f2, float f3, float f4) {
        this.f12578a = f;
        this.f12579b = f2;
        this.f12580c = f3;
        this.f12581d = f4;
    }

    @Override // p000.AbstractC41598gZ1, p000.InterfaceC47389qJ6
    /* renamed from: a */
    public float mo16065a() {
        return this.f12579b;
    }

    @Override // p000.AbstractC41598gZ1, p000.InterfaceC47389qJ6
    /* renamed from: b */
    public float mo16064b() {
        return this.f12581d;
    }

    @Override // p000.AbstractC41598gZ1, p000.InterfaceC47389qJ6
    /* renamed from: c */
    public float mo16063c() {
        return this.f12580c;
    }

    @Override // p000.AbstractC41598gZ1, p000.InterfaceC47389qJ6
    /* renamed from: d */
    public float mo16062d() {
        return this.f12578a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC41598gZ1)) {
            return false;
        }
        AbstractC41598gZ1 abstractC41598gZ1 = (AbstractC41598gZ1) obj;
        if (Float.floatToIntBits(this.f12578a) == Float.floatToIntBits(abstractC41598gZ1.mo16062d()) && Float.floatToIntBits(this.f12579b) == Float.floatToIntBits(abstractC41598gZ1.mo16065a()) && Float.floatToIntBits(this.f12580c) == Float.floatToIntBits(abstractC41598gZ1.mo16063c()) && Float.floatToIntBits(this.f12581d) == Float.floatToIntBits(abstractC41598gZ1.mo16064b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f12578a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f12579b)) * 1000003) ^ Float.floatToIntBits(this.f12580c)) * 1000003) ^ Float.floatToIntBits(this.f12581d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f12578a + ", maxZoomRatio=" + this.f12579b + ", minZoomRatio=" + this.f12580c + ", linearZoom=" + this.f12581d + "}";
    }
}
