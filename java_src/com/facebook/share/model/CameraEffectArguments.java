package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
/* loaded from: classes5.dex */
public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C17328a();

    /* renamed from: b */
    public final Bundle f69780b;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    /* loaded from: classes5.dex */
    public static class C17328a implements Parcelable.Creator<CameraEffectArguments> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$b */
    /* loaded from: classes5.dex */
    public static class C17329b {

        /* renamed from: a */
        public Bundle f69781a = new Bundle();

        /* renamed from: b */
        public CameraEffectArguments m52291b() {
            return new CameraEffectArguments(this, null);
        }

        /* renamed from: c */
        public C17329b m52290c(Parcel parcel) {
            return m52289d((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: d */
        public C17329b m52289d(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f69781a.putAll(cameraEffectArguments.f69780b);
            }
            return this;
        }
    }

    public /* synthetic */ CameraEffectArguments(C17329b c17329b, C17328a c17328a) {
        this(c17329b);
    }

    /* renamed from: b */
    public Object m52296b(String str) {
        return this.f69780b.get(str);
    }

    /* renamed from: c */
    public Set<String> m52295c() {
        return this.f69780b.keySet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f69780b);
    }

    public CameraEffectArguments(C17329b c17329b) {
        this.f69780b = c17329b.f69781a;
    }

    public CameraEffectArguments(Parcel parcel) {
        this.f69780b = parcel.readBundle(getClass().getClassLoader());
    }
}
