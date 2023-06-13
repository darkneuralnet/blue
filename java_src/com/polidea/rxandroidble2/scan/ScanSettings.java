package com.polidea.rxandroidble2.scan;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes6.dex */
public class ScanSettings implements Parcelable {
    public static final Parcelable.Creator<ScanSettings> CREATOR = new C18578a();

    /* renamed from: b */
    public int f75044b;

    /* renamed from: c */
    public int f75045c;

    /* renamed from: d */
    public long f75046d;

    /* renamed from: e */
    public int f75047e;

    /* renamed from: f */
    public int f75048f;

    /* renamed from: g */
    public boolean f75049g;

    /* renamed from: h */
    public boolean f75050h;

    /* renamed from: com.polidea.rxandroidble2.scan.ScanSettings$a */
    /* loaded from: classes6.dex */
    public class C18578a implements Parcelable.Creator<ScanSettings> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ScanSettings createFromParcel(Parcel parcel) {
            return new ScanSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ScanSettings[] newArray(int i) {
            return new ScanSettings[i];
        }
    }

    /* renamed from: com.polidea.rxandroidble2.scan.ScanSettings$b */
    /* loaded from: classes6.dex */
    public static final class C18579b {

        /* renamed from: a */
        public int f75051a = 0;

        /* renamed from: b */
        public int f75052b = 1;

        /* renamed from: c */
        public long f75053c = 0;

        /* renamed from: d */
        public int f75054d = 1;

        /* renamed from: e */
        public int f75055e = 3;

        /* renamed from: f */
        public boolean f75056f = true;

        /* renamed from: g */
        public boolean f75057g = true;

        /* renamed from: a */
        public ScanSettings m45823a() {
            return new ScanSettings(this.f75051a, this.f75052b, this.f75053c, this.f75054d, this.f75055e, this.f75056f, this.f75057g);
        }

        /* renamed from: b */
        public C18579b m45822b(int i) {
            if (i >= -1 && i <= 2) {
                this.f75051a = i;
                return this;
            }
            throw new IllegalArgumentException("invalid scan mode " + i);
        }
    }

    public ScanSettings(int i, int i2, long j, int i3, int i4, boolean z, boolean z2) {
        this.f75044b = i;
        this.f75045c = i2;
        this.f75046d = j;
        this.f75048f = i4;
        this.f75047e = i3;
        this.f75049g = z;
        this.f75050h = z2;
    }

    /* renamed from: a */
    public ScanSettings m45833a(int i) {
        return new ScanSettings(this.f75044b, i, this.f75046d, this.f75047e, this.f75048f, this.f75049g, this.f75050h);
    }

    /* renamed from: b */
    public int m45832b() {
        return this.f75045c;
    }

    /* renamed from: c */
    public boolean m45831c() {
        return this.f75049g;
    }

    /* renamed from: d */
    public int m45830d() {
        return this.f75047e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m45829e() {
        return this.f75048f;
    }

    /* renamed from: g */
    public long m45828g() {
        return this.f75046d;
    }

    /* renamed from: h */
    public int m45827h() {
        return this.f75044b;
    }

    /* renamed from: i */
    public boolean m45826i() {
        return this.f75050h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f75044b);
        parcel.writeInt(this.f75045c);
        parcel.writeLong(this.f75046d);
        parcel.writeInt(this.f75047e);
        parcel.writeInt(this.f75048f);
        parcel.writeInt(this.f75049g ? 1 : 0);
        parcel.writeInt(this.f75050h ? 1 : 0);
    }

    public ScanSettings(Parcel parcel) {
        this.f75044b = parcel.readInt();
        this.f75045c = parcel.readInt();
        this.f75046d = parcel.readLong();
        this.f75047e = parcel.readInt();
        this.f75048f = parcel.readInt();
        this.f75049g = parcel.readInt() != 0;
        this.f75050h = parcel.readInt() != 0;
    }
}
