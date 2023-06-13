package p000;

import android.graphics.Matrix;
/* renamed from: Ft */
/* loaded from: classes.dex */
public final class C2497Ft extends TY1 {

    /* renamed from: a */
    public final C51672xY5 f10403a;

    /* renamed from: b */
    public final long f10404b;

    /* renamed from: c */
    public final int f10405c;

    /* renamed from: d */
    public final Matrix f10406d;

    public C2497Ft(C51672xY5 c51672xY5, long j, int i, Matrix matrix) {
        if (c51672xY5 != null) {
            this.f10403a = c51672xY5;
            this.f10404b = j;
            this.f10405c = i;
            if (matrix != null) {
                this.f10406d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    @Override // p000.TY1, p000.InterfaceC51066wX1
    /* renamed from: b */
    public C51672xY5 mo3254b() {
        return this.f10403a;
    }

    @Override // p000.TY1, p000.InterfaceC51066wX1
    /* renamed from: c */
    public int mo3253c() {
        return this.f10405c;
    }

    @Override // p000.TY1
    /* renamed from: e */
    public Matrix mo83422e() {
        return this.f10406d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TY1)) {
            return false;
        }
        TY1 ty1 = (TY1) obj;
        if (this.f10403a.equals(ty1.mo3254b()) && this.f10404b == ty1.getTimestamp() && this.f10405c == ty1.mo3253c() && this.f10406d.equals(ty1.mo83422e())) {
            return true;
        }
        return false;
    }

    @Override // p000.TY1, p000.InterfaceC51066wX1
    public long getTimestamp() {
        return this.f10404b;
    }

    public int hashCode() {
        long j = this.f10404b;
        return ((((((this.f10403a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f10405c) * 1000003) ^ this.f10406d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f10403a + ", timestamp=" + this.f10404b + ", rotationDegrees=" + this.f10405c + ", sensorToBufferTransformMatrix=" + this.f10406d + "}";
    }
}
