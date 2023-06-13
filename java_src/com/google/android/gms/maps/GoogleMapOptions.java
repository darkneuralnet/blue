package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C32376Dg7();
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", m51606id = 2, type = "byte")

    /* renamed from: b */
    public Boolean f71363b;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", m51606id = 3, type = "byte")

    /* renamed from: c */
    public Boolean f71364c;
    @SafeParcelable.Field(getter = "getMapType", m51606id = 4)

    /* renamed from: d */
    public int f71365d;
    @SafeParcelable.Field(getter = "getCamera", m51606id = 5)

    /* renamed from: e */
    public CameraPosition f71366e;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", m51606id = 6, type = "byte")

    /* renamed from: f */
    public Boolean f71367f;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", m51606id = 7, type = "byte")

    /* renamed from: g */
    public Boolean f71368g;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", m51606id = 8, type = "byte")

    /* renamed from: h */
    public Boolean f71369h;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", m51606id = 9, type = "byte")

    /* renamed from: i */
    public Boolean f71370i;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", m51606id = 10, type = "byte")

    /* renamed from: j */
    public Boolean f71371j;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", m51606id = 11, type = "byte")

    /* renamed from: k */
    public Boolean f71372k;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", m51606id = 12, type = "byte")

    /* renamed from: l */
    public Boolean f71373l;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", m51606id = 14, type = "byte")

    /* renamed from: m */
    public Boolean f71374m;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", m51606id = 15, type = "byte")

    /* renamed from: n */
    public Boolean f71375n;
    @SafeParcelable.Field(getter = "getMinZoomPreference", m51606id = 16)

    /* renamed from: o */
    public Float f71376o;
    @SafeParcelable.Field(getter = "getMaxZoomPreference", m51606id = 17)

    /* renamed from: p */
    public Float f71377p;
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", m51606id = 18)

    /* renamed from: q */
    public LatLngBounds f71378q;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", m51606id = 19, type = "byte")

    /* renamed from: r */
    public Boolean f71379r;
    @SafeParcelable.Field(getter = "getBackgroundColor", m51606id = 20)

    /* renamed from: s */
    public Integer f71380s;
    @SafeParcelable.Field(getter = "getMapId", m51606id = 21)

    /* renamed from: t */
    public String f71381t;

    public GoogleMapOptions() {
        this.f71365d = -1;
        this.f71376o = null;
        this.f71377p = null;
        this.f71378q = null;
        this.f71380s = null;
        this.f71381t = null;
    }

    /* renamed from: F */
    public static GoogleMapOptions m50753F(Context context, AttributeSet attributeSet) {
        String string;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C36630Vl4.MapAttrs);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            int i = C36630Vl4.MapAttrs_mapType;
            if (obtainAttributes.hasValue(i)) {
                googleMapOptions.m50743Y0(obtainAttributes.getInt(i, -1));
            }
            int i2 = C36630Vl4.MapAttrs_zOrderOnTop;
            if (obtainAttributes.hasValue(i2)) {
                googleMapOptions.m50742Y1(obtainAttributes.getBoolean(i2, false));
            }
            int i3 = C36630Vl4.MapAttrs_useViewLifecycle;
            if (obtainAttributes.hasValue(i3)) {
                googleMapOptions.m50746R1(obtainAttributes.getBoolean(i3, false));
            }
            int i4 = C36630Vl4.MapAttrs_uiCompass;
            if (obtainAttributes.hasValue(i4)) {
                googleMapOptions.m50755E(obtainAttributes.getBoolean(i4, true));
            }
            int i5 = C36630Vl4.MapAttrs_uiRotateGestures;
            if (obtainAttributes.hasValue(i5)) {
                googleMapOptions.m50729u1(obtainAttributes.getBoolean(i5, true));
            }
            int i6 = C36630Vl4.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
            if (obtainAttributes.hasValue(i6)) {
                googleMapOptions.m50752J1(obtainAttributes.getBoolean(i6, true));
            }
            int i7 = C36630Vl4.MapAttrs_uiScrollGestures;
            if (obtainAttributes.hasValue(i7)) {
                googleMapOptions.m50727y1(obtainAttributes.getBoolean(i7, true));
            }
            int i8 = C36630Vl4.MapAttrs_uiTiltGestures;
            if (obtainAttributes.hasValue(i8)) {
                googleMapOptions.m50749L1(obtainAttributes.getBoolean(i8, true));
            }
            int i9 = C36630Vl4.MapAttrs_uiZoomGestures;
            if (obtainAttributes.hasValue(i9)) {
                googleMapOptions.m50740c2(obtainAttributes.getBoolean(i9, true));
            }
            int i10 = C36630Vl4.MapAttrs_uiZoomControls;
            if (obtainAttributes.hasValue(i10)) {
                googleMapOptions.m50741b2(obtainAttributes.getBoolean(i10, true));
            }
            int i11 = C36630Vl4.MapAttrs_liteMode;
            if (obtainAttributes.hasValue(i11)) {
                googleMapOptions.m50754E0(obtainAttributes.getBoolean(i11, false));
            }
            int i12 = C36630Vl4.MapAttrs_uiMapToolbar;
            if (obtainAttributes.hasValue(i12)) {
                googleMapOptions.m50744W0(obtainAttributes.getBoolean(i12, true));
            }
            int i13 = C36630Vl4.MapAttrs_ambientEnabled;
            if (obtainAttributes.hasValue(i13)) {
                googleMapOptions.m50731s(obtainAttributes.getBoolean(i13, false));
            }
            int i14 = C36630Vl4.MapAttrs_cameraMinZoomPreference;
            if (obtainAttributes.hasValue(i14)) {
                googleMapOptions.m50737k1(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
            }
            if (obtainAttributes.hasValue(i14)) {
                googleMapOptions.m50738j1(obtainAttributes.getFloat(C36630Vl4.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
            }
            TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{m50733n2(context, "backgroundColor"), m50733n2(context, "mapId")});
            if (obtainAttributes2.hasValue(0)) {
                googleMapOptions.m50730u(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
            }
            if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
                googleMapOptions.m50748N0(string);
            }
            obtainAttributes2.recycle();
            googleMapOptions.m50756D0(m50735l2(context, attributeSet));
            googleMapOptions.m50728v(m50736k2(context, attributeSet));
            obtainAttributes.recycle();
            return googleMapOptions;
        }
        return null;
    }

    /* renamed from: k2 */
    public static CameraPosition m50736k2(Context context, AttributeSet attributeSet) {
        float f;
        float f2;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C36630Vl4.MapAttrs);
            int i = C36630Vl4.MapAttrs_cameraTargetLat;
            if (obtainAttributes.hasValue(i)) {
                f = obtainAttributes.getFloat(i, 0.0f);
            } else {
                f = 0.0f;
            }
            int i2 = C36630Vl4.MapAttrs_cameraTargetLng;
            if (obtainAttributes.hasValue(i2)) {
                f2 = obtainAttributes.getFloat(i2, 0.0f);
            } else {
                f2 = 0.0f;
            }
            LatLng latLng = new LatLng(f, f2);
            CameraPosition.C17619a m50712s = CameraPosition.m50712s();
            m50712s.m50707c(latLng);
            int i3 = C36630Vl4.MapAttrs_cameraZoom;
            if (obtainAttributes.hasValue(i3)) {
                m50712s.m50705e(obtainAttributes.getFloat(i3, 0.0f));
            }
            int i4 = C36630Vl4.MapAttrs_cameraBearing;
            if (obtainAttributes.hasValue(i4)) {
                m50712s.m50709a(obtainAttributes.getFloat(i4, 0.0f));
            }
            int i5 = C36630Vl4.MapAttrs_cameraTilt;
            if (obtainAttributes.hasValue(i5)) {
                m50712s.m50706d(obtainAttributes.getFloat(i5, 0.0f));
            }
            obtainAttributes.recycle();
            return m50712s.m50708b();
        }
        return null;
    }

    /* renamed from: l2 */
    public static LatLngBounds m50735l2(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C36630Vl4.MapAttrs);
        int i = C36630Vl4.MapAttrs_latLngBoundsSouthWestLatitude;
        if (obtainAttributes.hasValue(i)) {
            f = Float.valueOf(obtainAttributes.getFloat(i, 0.0f));
        } else {
            f = null;
        }
        int i2 = C36630Vl4.MapAttrs_latLngBoundsSouthWestLongitude;
        if (obtainAttributes.hasValue(i2)) {
            f2 = Float.valueOf(obtainAttributes.getFloat(i2, 0.0f));
        } else {
            f2 = null;
        }
        int i3 = C36630Vl4.MapAttrs_latLngBoundsNorthEastLatitude;
        if (obtainAttributes.hasValue(i3)) {
            f3 = Float.valueOf(obtainAttributes.getFloat(i3, 0.0f));
        } else {
            f3 = null;
        }
        int i4 = C36630Vl4.MapAttrs_latLngBoundsNorthEastLongitude;
        if (obtainAttributes.hasValue(i4)) {
            f4 = Float.valueOf(obtainAttributes.getFloat(i4, 0.0f));
        } else {
            f4 = null;
        }
        obtainAttributes.recycle();
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(f.floatValue(), f2.floatValue()), new LatLng(f3.floatValue(), f4.floatValue()));
    }

    /* renamed from: n2 */
    public static int m50733n2(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    /* renamed from: D0 */
    public GoogleMapOptions m50756D0(LatLngBounds latLngBounds) {
        this.f71378q = latLngBounds;
        return this;
    }

    /* renamed from: E */
    public GoogleMapOptions m50755E(boolean z) {
        this.f71368g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: E0 */
    public GoogleMapOptions m50754E0(boolean z) {
        this.f71373l = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: J1 */
    public GoogleMapOptions m50752J1(boolean z) {
        this.f71379r = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: K */
    public Integer m50751K() {
        return this.f71380s;
    }

    /* renamed from: L */
    public CameraPosition m50750L() {
        return this.f71366e;
    }

    /* renamed from: L1 */
    public GoogleMapOptions m50749L1(boolean z) {
        this.f71371j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: N0 */
    public GoogleMapOptions m50748N0(String str) {
        this.f71381t = str;
        return this;
    }

    /* renamed from: R */
    public LatLngBounds m50747R() {
        return this.f71378q;
    }

    /* renamed from: R1 */
    public GoogleMapOptions m50746R1(boolean z) {
        this.f71364c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: T */
    public String m50745T() {
        return this.f71381t;
    }

    /* renamed from: W0 */
    public GoogleMapOptions m50744W0(boolean z) {
        this.f71374m = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: Y0 */
    public GoogleMapOptions m50743Y0(int i) {
        this.f71365d = i;
        return this;
    }

    /* renamed from: Y1 */
    public GoogleMapOptions m50742Y1(boolean z) {
        this.f71363b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b2 */
    public GoogleMapOptions m50741b2(boolean z) {
        this.f71367f = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c2 */
    public GoogleMapOptions m50740c2(boolean z) {
        this.f71370i = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: j0 */
    public int m50739j0() {
        return this.f71365d;
    }

    /* renamed from: j1 */
    public GoogleMapOptions m50738j1(float f) {
        this.f71377p = Float.valueOf(f);
        return this;
    }

    /* renamed from: k1 */
    public GoogleMapOptions m50737k1(float f) {
        this.f71376o = Float.valueOf(f);
        return this;
    }

    /* renamed from: m0 */
    public Float m50734m0() {
        return this.f71377p;
    }

    /* renamed from: p0 */
    public Float m50732p0() {
        return this.f71376o;
    }

    /* renamed from: s */
    public GoogleMapOptions m50731s(boolean z) {
        this.f71375n = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.f71365d)).add("LiteMode", this.f71373l).add("Camera", this.f71366e).add("CompassEnabled", this.f71368g).add("ZoomControlsEnabled", this.f71367f).add("ScrollGesturesEnabled", this.f71369h).add("ZoomGesturesEnabled", this.f71370i).add("TiltGesturesEnabled", this.f71371j).add("RotateGesturesEnabled", this.f71372k).add("ScrollGesturesEnabledDuringRotateOrZoom", this.f71379r).add("MapToolbarEnabled", this.f71374m).add("AmbientEnabled", this.f71375n).add("MinZoomPreference", this.f71376o).add("MaxZoomPreference", this.f71377p).add("BackgroundColor", this.f71380s).add("LatLngBoundsForCameraTarget", this.f71378q).add("ZOrderOnTop", this.f71363b).add("UseViewLifecycleInFragment", this.f71364c).toString();
    }

    /* renamed from: u */
    public GoogleMapOptions m50730u(Integer num) {
        this.f71380s = num;
        return this;
    }

    /* renamed from: u1 */
    public GoogleMapOptions m50729u1(boolean z) {
        this.f71372k = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: v */
    public GoogleMapOptions m50728v(CameraPosition cameraPosition) {
        this.f71366e = cameraPosition;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, C33294He7.m103579a(this.f71363b));
        SafeParcelWriter.writeByte(parcel, 3, C33294He7.m103579a(this.f71364c));
        SafeParcelWriter.writeInt(parcel, 4, m50739j0());
        SafeParcelWriter.writeParcelable(parcel, 5, m50750L(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, C33294He7.m103579a(this.f71367f));
        SafeParcelWriter.writeByte(parcel, 7, C33294He7.m103579a(this.f71368g));
        SafeParcelWriter.writeByte(parcel, 8, C33294He7.m103579a(this.f71369h));
        SafeParcelWriter.writeByte(parcel, 9, C33294He7.m103579a(this.f71370i));
        SafeParcelWriter.writeByte(parcel, 10, C33294He7.m103579a(this.f71371j));
        SafeParcelWriter.writeByte(parcel, 11, C33294He7.m103579a(this.f71372k));
        SafeParcelWriter.writeByte(parcel, 12, C33294He7.m103579a(this.f71373l));
        SafeParcelWriter.writeByte(parcel, 14, C33294He7.m103579a(this.f71374m));
        SafeParcelWriter.writeByte(parcel, 15, C33294He7.m103579a(this.f71375n));
        SafeParcelWriter.writeFloatObject(parcel, 16, m50732p0(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, m50734m0(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, m50747R(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, C33294He7.m103579a(this.f71379r));
        SafeParcelWriter.writeIntegerObject(parcel, 20, m50751K(), false);
        SafeParcelWriter.writeString(parcel, 21, m50745T(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: y1 */
    public GoogleMapOptions m50727y1(boolean z) {
        this.f71369h = Boolean.valueOf(z);
        return this;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(m51605id = 2) byte b, @SafeParcelable.Param(m51605id = 3) byte b2, @SafeParcelable.Param(m51605id = 4) int i, @SafeParcelable.Param(m51605id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(m51605id = 6) byte b3, @SafeParcelable.Param(m51605id = 7) byte b4, @SafeParcelable.Param(m51605id = 8) byte b5, @SafeParcelable.Param(m51605id = 9) byte b6, @SafeParcelable.Param(m51605id = 10) byte b7, @SafeParcelable.Param(m51605id = 11) byte b8, @SafeParcelable.Param(m51605id = 12) byte b9, @SafeParcelable.Param(m51605id = 14) byte b10, @SafeParcelable.Param(m51605id = 15) byte b11, @SafeParcelable.Param(m51605id = 16) Float f, @SafeParcelable.Param(m51605id = 17) Float f2, @SafeParcelable.Param(m51605id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(m51605id = 19) byte b12, @SafeParcelable.Param(m51605id = 20) Integer num, @SafeParcelable.Param(m51605id = 21) String str) {
        this.f71365d = -1;
        this.f71376o = null;
        this.f71377p = null;
        this.f71378q = null;
        this.f71380s = null;
        this.f71381t = null;
        this.f71363b = C33294He7.m103578b(b);
        this.f71364c = C33294He7.m103578b(b2);
        this.f71365d = i;
        this.f71366e = cameraPosition;
        this.f71367f = C33294He7.m103578b(b3);
        this.f71368g = C33294He7.m103578b(b4);
        this.f71369h = C33294He7.m103578b(b5);
        this.f71370i = C33294He7.m103578b(b6);
        this.f71371j = C33294He7.m103578b(b7);
        this.f71372k = C33294He7.m103578b(b8);
        this.f71373l = C33294He7.m103578b(b9);
        this.f71374m = C33294He7.m103578b(b10);
        this.f71375n = C33294He7.m103578b(b11);
        this.f71376o = f;
        this.f71377p = f2;
        this.f71378q = latLngBounds;
        this.f71379r = C33294He7.m103578b(b12);
        this.f71380s = num;
        this.f71381t = str;
    }
}
