package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.C11243o;
/* renamed from: androidx.camera.core.c */
/* loaded from: classes.dex */
public final class C11151c extends C11243o.AbstractC11251h {

    /* renamed from: a */
    public final Rect f52439a;

    /* renamed from: b */
    public final int f52440b;

    /* renamed from: c */
    public final int f52441c;

    /* renamed from: d */
    public final boolean f52442d;

    public C11151c(Rect rect, int i, int i2, boolean z) {
        if (rect != null) {
            this.f52439a = rect;
            this.f52440b = i;
            this.f52441c = i2;
            this.f52442d = z;
            return;
        }
        throw new NullPointerException("Null getCropRect");
    }

    @Override // androidx.camera.core.C11243o.AbstractC11251h
    /* renamed from: a */
    public Rect mo69085a() {
        return this.f52439a;
    }

    @Override // androidx.camera.core.C11243o.AbstractC11251h
    /* renamed from: b */
    public int mo69084b() {
        return this.f52440b;
    }

    @Override // androidx.camera.core.C11243o.AbstractC11251h
    /* renamed from: c */
    public int mo69083c() {
        return this.f52441c;
    }

    @Override // androidx.camera.core.C11243o.AbstractC11251h
    /* renamed from: d */
    public boolean mo69082d() {
        return this.f52442d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11243o.AbstractC11251h)) {
            return false;
        }
        C11243o.AbstractC11251h abstractC11251h = (C11243o.AbstractC11251h) obj;
        if (this.f52439a.equals(abstractC11251h.mo69085a()) && this.f52440b == abstractC11251h.mo69084b() && this.f52441c == abstractC11251h.mo69083c() && this.f52442d == abstractC11251h.mo69082d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f52439a.hashCode() ^ 1000003) * 1000003) ^ this.f52440b) * 1000003) ^ this.f52441c) * 1000003;
        if (this.f52442d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f52439a + ", getRotationDegrees=" + this.f52440b + ", getTargetRotation=" + this.f52441c + ", hasCameraTransform=" + this.f52442d + "}";
    }
}
