package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new QP7();
    @SafeParcelable.Field(getter = "getCenter", m51606id = 2)

    /* renamed from: b */
    public LatLng f71405b;
    @SafeParcelable.Field(getter = "getRadius", m51606id = 3)

    /* renamed from: c */
    public double f71406c;
    @SafeParcelable.Field(getter = "getStrokeWidth", m51606id = 4)

    /* renamed from: d */
    public float f71407d;
    @SafeParcelable.Field(getter = "getStrokeColor", m51606id = 5)

    /* renamed from: e */
    public int f71408e;
    @SafeParcelable.Field(getter = "getFillColor", m51606id = 6)

    /* renamed from: f */
    public int f71409f;
    @SafeParcelable.Field(getter = "getZIndex", m51606id = 7)

    /* renamed from: g */
    public float f71410g;
    @SafeParcelable.Field(getter = "isVisible", m51606id = 8)

    /* renamed from: h */
    public boolean f71411h;
    @SafeParcelable.Field(getter = "isClickable", m51606id = 9)

    /* renamed from: i */
    public boolean f71412i;
    @SafeParcelable.Field(getter = "getStrokePattern", m51606id = 10)

    /* renamed from: j */
    public List<PatternItem> f71413j;

    public CircleOptions() {
        this.f71405b = null;
        this.f71406c = 0.0d;
        this.f71407d = 10.0f;
        this.f71408e = -16777216;
        this.f71409f = 0;
        this.f71410g = 0.0f;
        this.f71411h = true;
        this.f71412i = false;
        this.f71413j = null;
    }

    /* renamed from: D0 */
    public CircleOptions m50704D0(float f) {
        this.f71407d = f;
        return this;
    }

    /* renamed from: E */
    public int m50703E() {
        return this.f71409f;
    }

    /* renamed from: E0 */
    public CircleOptions m50702E0(float f) {
        this.f71410g = f;
        return this;
    }

    /* renamed from: F */
    public int m50701F() {
        return this.f71408e;
    }

    /* renamed from: K */
    public List<PatternItem> m50700K() {
        return this.f71413j;
    }

    /* renamed from: L */
    public float m50699L() {
        return this.f71407d;
    }

    /* renamed from: R */
    public float m50698R() {
        return this.f71410g;
    }

    /* renamed from: T */
    public boolean m50697T() {
        return this.f71412i;
    }

    public double getRadius() {
        return this.f71406c;
    }

    /* renamed from: j0 */
    public boolean m50696j0() {
        return this.f71411h;
    }

    /* renamed from: m0 */
    public CircleOptions m50695m0(double d) {
        this.f71406c = d;
        return this;
    }

    /* renamed from: p0 */
    public CircleOptions m50694p0(int i) {
        this.f71408e = i;
        return this;
    }

    /* renamed from: s */
    public CircleOptions m50693s(LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.f71405b = latLng;
        return this;
    }

    /* renamed from: u */
    public CircleOptions m50692u(int i) {
        this.f71409f = i;
        return this;
    }

    /* renamed from: v */
    public LatLng m50691v() {
        return this.f71405b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m50691v(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, m50699L());
        SafeParcelWriter.writeInt(parcel, 5, m50701F());
        SafeParcelWriter.writeInt(parcel, 6, m50703E());
        SafeParcelWriter.writeFloat(parcel, 7, m50698R());
        SafeParcelWriter.writeBoolean(parcel, 8, m50696j0());
        SafeParcelWriter.writeBoolean(parcel, 9, m50697T());
        SafeParcelWriter.writeTypedList(parcel, 10, m50700K(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) double d, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) int i, @SafeParcelable.Param(m51605id = 6) int i2, @SafeParcelable.Param(m51605id = 7) float f2, @SafeParcelable.Param(m51605id = 8) boolean z, @SafeParcelable.Param(m51605id = 9) boolean z2, @SafeParcelable.Param(m51605id = 10) List<PatternItem> list) {
        this.f71405b = latLng;
        this.f71406c = d;
        this.f71407d = f;
        this.f71408e = i;
        this.f71409f = i2;
        this.f71410g = f2;
        this.f71411h = z;
        this.f71412i = z2;
        this.f71413j = list;
    }
}
