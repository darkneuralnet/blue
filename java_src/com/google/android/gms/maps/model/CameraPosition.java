package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C33528Ie7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final LatLng f71394b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final float f71395c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final float f71396d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final float f71397e;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    /* loaded from: classes6.dex */
    public static final class C17619a {

        /* renamed from: a */
        public LatLng f71398a;

        /* renamed from: b */
        public float f71399b;

        /* renamed from: c */
        public float f71400c;

        /* renamed from: d */
        public float f71401d;

        public C17619a() {
        }

        /* renamed from: a */
        public C17619a m50709a(float f) {
            this.f71401d = f;
            return this;
        }

        /* renamed from: b */
        public CameraPosition m50708b() {
            return new CameraPosition(this.f71398a, this.f71399b, this.f71400c, this.f71401d);
        }

        /* renamed from: c */
        public C17619a m50707c(LatLng latLng) {
            this.f71398a = (LatLng) Preconditions.checkNotNull(latLng, "location must not be null.");
            return this;
        }

        /* renamed from: d */
        public C17619a m50706d(float f) {
            this.f71400c = f;
            return this;
        }

        /* renamed from: e */
        public C17619a m50705e(float f) {
            this.f71399b = f;
            return this;
        }

        public C17619a(CameraPosition cameraPosition) {
            CameraPosition cameraPosition2 = (CameraPosition) Preconditions.checkNotNull(cameraPosition, "previous must not be null.");
            this.f71398a = cameraPosition2.f71394b;
            this.f71399b = cameraPosition2.f71395c;
            this.f71400c = cameraPosition2.f71396d;
            this.f71401d = cameraPosition2.f71397e;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) float f2, @SafeParcelable.Param(m51605id = 5) float f3) {
        boolean z;
        Preconditions.checkNotNull(latLng, "camera target must not be null.");
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f71394b = latLng;
        this.f71395c = f;
        this.f71396d = f2 + 0.0f;
        this.f71397e = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: s */
    public static C17619a m50712s() {
        return new C17619a();
    }

    /* renamed from: u */
    public static C17619a m50711u(CameraPosition cameraPosition) {
        return new C17619a(cameraPosition);
    }

    /* renamed from: v */
    public static final CameraPosition m50710v(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.f71394b.equals(cameraPosition.f71394b) && Float.floatToIntBits(this.f71395c) == Float.floatToIntBits(cameraPosition.f71395c) && Float.floatToIntBits(this.f71396d) == Float.floatToIntBits(cameraPosition.f71396d) && Float.floatToIntBits(this.f71397e) == Float.floatToIntBits(cameraPosition.f71397e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71394b, Float.valueOf(this.f71395c), Float.valueOf(this.f71396d), Float.valueOf(this.f71397e));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("target", this.f71394b).add("zoom", Float.valueOf(this.f71395c)).add("tilt", Float.valueOf(this.f71396d)).add("bearing", Float.valueOf(this.f71397e)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71394b, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f71395c);
        SafeParcelWriter.writeFloat(parcel, 4, this.f71396d);
        SafeParcelWriter.writeFloat(parcel, 5, this.f71397e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
