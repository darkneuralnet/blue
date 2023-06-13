package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
/* loaded from: classes5.dex */
public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C17330a();

    /* renamed from: b */
    public final Bundle f69782b;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    /* loaded from: classes5.dex */
    public static class C17330a implements Parcelable.Creator<CameraEffectTextures> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$b */
    /* loaded from: classes5.dex */
    public static class C17331b {

        /* renamed from: a */
        public Bundle f69783a = new Bundle();

        /* renamed from: b */
        public CameraEffectTextures m52281b() {
            return new CameraEffectTextures(this, null);
        }

        /* renamed from: c */
        public C17331b m52280c(Parcel parcel) {
            return m52279d((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: d */
        public C17331b m52279d(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f69783a.putAll(cameraEffectTextures.f69782b);
            }
            return this;
        }
    }

    public /* synthetic */ CameraEffectTextures(C17331b c17331b, C17330a c17330a) {
        this(c17331b);
    }

    /* renamed from: b */
    public Bitmap m52287b(String str) {
        Object obj = this.f69782b.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    /* renamed from: c */
    public Uri m52286c(String str) {
        Object obj = this.f69782b.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    /* renamed from: d */
    public Set<String> m52285d() {
        return this.f69782b.keySet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f69782b);
    }

    public CameraEffectTextures(C17331b c17331b) {
        this.f69782b = c17331b.f69783a;
    }

    public CameraEffectTextures(Parcel parcel) {
        this.f69782b = parcel.readBundle(getClass().getClassLoader());
    }
}
