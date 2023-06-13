package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C10909a();

    /* renamed from: b */
    public int f51375b;

    /* renamed from: c */
    public int f51376c;

    /* renamed from: d */
    public int f51377d;

    /* renamed from: e */
    public int f51378e;

    /* renamed from: f */
    public int f51379f;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    public class C10909a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f51375b = parcel.readInt();
        this.f51377d = parcel.readInt();
        this.f51378e = parcel.readInt();
        this.f51379f = parcel.readInt();
        this.f51376c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51375b);
        parcel.writeInt(this.f51377d);
        parcel.writeInt(this.f51378e);
        parcel.writeInt(this.f51379f);
        parcel.writeInt(this.f51376c);
    }
}
