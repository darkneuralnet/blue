package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class Barcode extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Barcode> CREATOR = new C17631b();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f71794b;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f71795c;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f71796d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public int f71797e;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public Point[] f71798f;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public Email f71799g;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public Phone f71800h;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public Sms f71801i;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public WiFi f71802j;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public UrlBookmark f71803k;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public GeoPoint f71804l;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 13)

    /* renamed from: m */
    public CalendarEvent f71805m;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 14)

    /* renamed from: n */
    public ContactInfo f71806n;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 15)

    /* renamed from: o */
    public DriverLicense f71807o;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 16)

    /* renamed from: p */
    public byte[] f71808p;
    @SafeParcelable.Field(m51606id = 17)

    /* renamed from: q */
    public boolean f71809q;

    @SafeParcelable.Class(creator = "AddressCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class Address extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Address> CREATOR = new C17630a();
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public int f71810b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String[] f71811c;

        public Address() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 2, this.f71810b);
            SafeParcelWriter.writeStringArray(parcel, 3, this.f71811c, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public Address(@SafeParcelable.Param(m51605id = 2) int i, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String[] strArr) {
            this.f71810b = i;
            this.f71811c = strArr;
        }
    }

    @SafeParcelable.Class(creator = "CalendarDateTimeCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class CalendarDateTime extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<CalendarDateTime> CREATOR = new C17632c();
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public int f71812b;
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public int f71813c;
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public int f71814d;
        @SafeParcelable.Field(m51606id = 5)

        /* renamed from: e */
        public int f71815e;
        @SafeParcelable.Field(m51606id = 6)

        /* renamed from: f */
        public int f71816f;
        @SafeParcelable.Field(m51606id = 7)

        /* renamed from: g */
        public int f71817g;
        @SafeParcelable.Field(m51606id = 8)

        /* renamed from: h */
        public boolean f71818h;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 9)

        /* renamed from: i */
        public String f71819i;

        public CalendarDateTime() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 2, this.f71812b);
            SafeParcelWriter.writeInt(parcel, 3, this.f71813c);
            SafeParcelWriter.writeInt(parcel, 4, this.f71814d);
            SafeParcelWriter.writeInt(parcel, 5, this.f71815e);
            SafeParcelWriter.writeInt(parcel, 6, this.f71816f);
            SafeParcelWriter.writeInt(parcel, 7, this.f71817g);
            SafeParcelWriter.writeBoolean(parcel, 8, this.f71818h);
            SafeParcelWriter.writeString(parcel, 9, this.f71819i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public CalendarDateTime(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) int i4, @SafeParcelable.Param(m51605id = 6) int i5, @SafeParcelable.Param(m51605id = 7) int i6, @SafeParcelable.Param(m51605id = 8) boolean z, @RecentlyNonNull @SafeParcelable.Param(m51605id = 9) String str) {
            this.f71812b = i;
            this.f71813c = i2;
            this.f71814d = i3;
            this.f71815e = i4;
            this.f71816f = i5;
            this.f71817g = i6;
            this.f71818h = z;
            this.f71819i = str;
        }
    }

    @SafeParcelable.Class(creator = "CalendarEventCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class CalendarEvent extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<CalendarEvent> CREATOR = new C17634e();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public String f71820b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71821c;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public String f71822d;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 5)

        /* renamed from: e */
        public String f71823e;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 6)

        /* renamed from: f */
        public String f71824f;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 7)

        /* renamed from: g */
        public CalendarDateTime f71825g;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 8)

        /* renamed from: h */
        public CalendarDateTime f71826h;

        public CalendarEvent() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.f71820b, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71821c, false);
            SafeParcelWriter.writeString(parcel, 4, this.f71822d, false);
            SafeParcelWriter.writeString(parcel, 5, this.f71823e, false);
            SafeParcelWriter.writeString(parcel, 6, this.f71824f, false);
            SafeParcelWriter.writeParcelable(parcel, 7, this.f71825g, i, false);
            SafeParcelWriter.writeParcelable(parcel, 8, this.f71826h, i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public CalendarEvent(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str2, @RecentlyNonNull @SafeParcelable.Param(m51605id = 4) String str3, @RecentlyNonNull @SafeParcelable.Param(m51605id = 5) String str4, @RecentlyNonNull @SafeParcelable.Param(m51605id = 6) String str5, @RecentlyNonNull @SafeParcelable.Param(m51605id = 7) CalendarDateTime calendarDateTime, @RecentlyNonNull @SafeParcelable.Param(m51605id = 8) CalendarDateTime calendarDateTime2) {
            this.f71820b = str;
            this.f71821c = str2;
            this.f71822d = str3;
            this.f71823e = str4;
            this.f71824f = str5;
            this.f71825g = calendarDateTime;
            this.f71826h = calendarDateTime2;
        }
    }

    @SafeParcelable.Class(creator = "ContactInfoCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class ContactInfo extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<ContactInfo> CREATOR = new C17633d();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public PersonName f71827b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71828c;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public String f71829d;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 5)

        /* renamed from: e */
        public Phone[] f71830e;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 6)

        /* renamed from: f */
        public Email[] f71831f;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 7)

        /* renamed from: g */
        public String[] f71832g;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 8)

        /* renamed from: h */
        public Address[] f71833h;

        public ContactInfo() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeParcelable(parcel, 2, this.f71827b, i, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71828c, false);
            SafeParcelWriter.writeString(parcel, 4, this.f71829d, false);
            SafeParcelWriter.writeTypedArray(parcel, 5, this.f71830e, i, false);
            SafeParcelWriter.writeTypedArray(parcel, 6, this.f71831f, i, false);
            SafeParcelWriter.writeStringArray(parcel, 7, this.f71832g, false);
            SafeParcelWriter.writeTypedArray(parcel, 8, this.f71833h, i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public ContactInfo(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) PersonName personName, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 4) String str2, @RecentlyNonNull @SafeParcelable.Param(m51605id = 5) Phone[] phoneArr, @RecentlyNonNull @SafeParcelable.Param(m51605id = 6) Email[] emailArr, @RecentlyNonNull @SafeParcelable.Param(m51605id = 7) String[] strArr, @RecentlyNonNull @SafeParcelable.Param(m51605id = 8) Address[] addressArr) {
            this.f71827b = personName;
            this.f71828c = str;
            this.f71829d = str2;
            this.f71830e = phoneArr;
            this.f71831f = emailArr;
            this.f71832g = strArr;
            this.f71833h = addressArr;
        }
    }

    @SafeParcelable.Class(creator = "DriverLicenseCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class DriverLicense extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<DriverLicense> CREATOR = new C17636g();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public String f71834b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71835c;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public String f71836d;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 5)

        /* renamed from: e */
        public String f71837e;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 6)

        /* renamed from: f */
        public String f71838f;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 7)

        /* renamed from: g */
        public String f71839g;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 8)

        /* renamed from: h */
        public String f71840h;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 9)

        /* renamed from: i */
        public String f71841i;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 10)

        /* renamed from: j */
        public String f71842j;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 11)

        /* renamed from: k */
        public String f71843k;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 12)

        /* renamed from: l */
        public String f71844l;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 13)

        /* renamed from: m */
        public String f71845m;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 14)

        /* renamed from: n */
        public String f71846n;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 15)

        /* renamed from: o */
        public String f71847o;

        public DriverLicense() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.f71834b, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71835c, false);
            SafeParcelWriter.writeString(parcel, 4, this.f71836d, false);
            SafeParcelWriter.writeString(parcel, 5, this.f71837e, false);
            SafeParcelWriter.writeString(parcel, 6, this.f71838f, false);
            SafeParcelWriter.writeString(parcel, 7, this.f71839g, false);
            SafeParcelWriter.writeString(parcel, 8, this.f71840h, false);
            SafeParcelWriter.writeString(parcel, 9, this.f71841i, false);
            SafeParcelWriter.writeString(parcel, 10, this.f71842j, false);
            SafeParcelWriter.writeString(parcel, 11, this.f71843k, false);
            SafeParcelWriter.writeString(parcel, 12, this.f71844l, false);
            SafeParcelWriter.writeString(parcel, 13, this.f71845m, false);
            SafeParcelWriter.writeString(parcel, 14, this.f71846n, false);
            SafeParcelWriter.writeString(parcel, 15, this.f71847o, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public DriverLicense(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str2, @RecentlyNonNull @SafeParcelable.Param(m51605id = 4) String str3, @RecentlyNonNull @SafeParcelable.Param(m51605id = 5) String str4, @RecentlyNonNull @SafeParcelable.Param(m51605id = 6) String str5, @RecentlyNonNull @SafeParcelable.Param(m51605id = 7) String str6, @RecentlyNonNull @SafeParcelable.Param(m51605id = 8) String str7, @RecentlyNonNull @SafeParcelable.Param(m51605id = 9) String str8, @RecentlyNonNull @SafeParcelable.Param(m51605id = 10) String str9, @RecentlyNonNull @SafeParcelable.Param(m51605id = 11) String str10, @RecentlyNonNull @SafeParcelable.Param(m51605id = 12) String str11, @RecentlyNonNull @SafeParcelable.Param(m51605id = 13) String str12, @RecentlyNonNull @SafeParcelable.Param(m51605id = 14) String str13, @RecentlyNonNull @SafeParcelable.Param(m51605id = 15) String str14) {
            this.f71834b = str;
            this.f71835c = str2;
            this.f71836d = str3;
            this.f71837e = str4;
            this.f71838f = str5;
            this.f71839g = str6;
            this.f71840h = str7;
            this.f71841i = str8;
            this.f71842j = str9;
            this.f71843k = str10;
            this.f71844l = str11;
            this.f71845m = str12;
            this.f71846n = str13;
            this.f71847o = str14;
        }
    }

    @SafeParcelable.Class(creator = "EmailCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class Email extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Email> CREATOR = new C17635f();
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public int f71848b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71849c;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public String f71850d;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 5)

        /* renamed from: e */
        public String f71851e;

        public Email() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 2, this.f71848b);
            SafeParcelWriter.writeString(parcel, 3, this.f71849c, false);
            SafeParcelWriter.writeString(parcel, 4, this.f71850d, false);
            SafeParcelWriter.writeString(parcel, 5, this.f71851e, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public Email(@SafeParcelable.Param(m51605id = 2) int i, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 4) String str2, @RecentlyNonNull @SafeParcelable.Param(m51605id = 5) String str3) {
            this.f71848b = i;
            this.f71849c = str;
            this.f71850d = str2;
            this.f71851e = str3;
        }
    }

    @SafeParcelable.Class(creator = "GeoPointCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class GeoPoint extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<GeoPoint> CREATOR = new C17638i();
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public double f71852b;
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public double f71853c;

        public GeoPoint() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeDouble(parcel, 2, this.f71852b);
            SafeParcelWriter.writeDouble(parcel, 3, this.f71853c);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public GeoPoint(@SafeParcelable.Param(m51605id = 2) double d, @SafeParcelable.Param(m51605id = 3) double d2) {
            this.f71852b = d;
            this.f71853c = d2;
        }
    }

    @SafeParcelable.Class(creator = "PersonNameCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class PersonName extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<PersonName> CREATOR = new C17637h();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public String f71854b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71855c;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public String f71856d;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 5)

        /* renamed from: e */
        public String f71857e;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 6)

        /* renamed from: f */
        public String f71858f;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 7)

        /* renamed from: g */
        public String f71859g;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 8)

        /* renamed from: h */
        public String f71860h;

        public PersonName() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.f71854b, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71855c, false);
            SafeParcelWriter.writeString(parcel, 4, this.f71856d, false);
            SafeParcelWriter.writeString(parcel, 5, this.f71857e, false);
            SafeParcelWriter.writeString(parcel, 6, this.f71858f, false);
            SafeParcelWriter.writeString(parcel, 7, this.f71859g, false);
            SafeParcelWriter.writeString(parcel, 8, this.f71860h, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public PersonName(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str2, @RecentlyNonNull @SafeParcelable.Param(m51605id = 4) String str3, @RecentlyNonNull @SafeParcelable.Param(m51605id = 5) String str4, @RecentlyNonNull @SafeParcelable.Param(m51605id = 6) String str5, @RecentlyNonNull @SafeParcelable.Param(m51605id = 7) String str6, @RecentlyNonNull @SafeParcelable.Param(m51605id = 8) String str7) {
            this.f71854b = str;
            this.f71855c = str2;
            this.f71856d = str3;
            this.f71857e = str4;
            this.f71858f = str5;
            this.f71859g = str6;
            this.f71860h = str7;
        }
    }

    @SafeParcelable.Class(creator = "PhoneCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class Phone extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Phone> CREATOR = new C17640k();
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public int f71861b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71862c;

        public Phone() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 2, this.f71861b);
            SafeParcelWriter.writeString(parcel, 3, this.f71862c, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public Phone(@SafeParcelable.Param(m51605id = 2) int i, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str) {
            this.f71861b = i;
            this.f71862c = str;
        }
    }

    @SafeParcelable.Class(creator = "SmsCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class Sms extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Sms> CREATOR = new C17639j();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public String f71863b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71864c;

        public Sms() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.f71863b, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71864c, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public Sms(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str2) {
            this.f71863b = str;
            this.f71864c = str2;
        }
    }

    @SafeParcelable.Class(creator = "UrlBookmarkCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class UrlBookmark extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<UrlBookmark> CREATOR = new C17642m();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public String f71865b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71866c;

        public UrlBookmark() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.f71865b, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71866c, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public UrlBookmark(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str2) {
            this.f71865b = str;
            this.f71866c = str2;
        }
    }

    @SafeParcelable.Class(creator = "WiFiCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes6.dex */
    public static class WiFi extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<WiFi> CREATOR = new C17641l();
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 2)

        /* renamed from: b */
        public String f71867b;
        @RecentlyNonNull
        @SafeParcelable.Field(m51606id = 3)

        /* renamed from: c */
        public String f71868c;
        @SafeParcelable.Field(m51606id = 4)

        /* renamed from: d */
        public int f71869d;

        public WiFi() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.f71867b, false);
            SafeParcelWriter.writeString(parcel, 3, this.f71868c, false);
            SafeParcelWriter.writeInt(parcel, 4, this.f71869d);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @SafeParcelable.Constructor
        public WiFi(@RecentlyNonNull @SafeParcelable.Param(m51605id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) int i) {
            this.f71867b = str;
            this.f71868c = str2;
            this.f71869d = i;
        }
    }

    public Barcode() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71794b);
        SafeParcelWriter.writeString(parcel, 3, this.f71795c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71796d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f71797e);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f71798f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f71799g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f71800h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f71801i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f71802j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f71803k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f71804l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f71805m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f71806n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f71807o, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.f71808p, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.f71809q);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public Barcode(@SafeParcelable.Param(m51605id = 2) int i, @RecentlyNonNull @SafeParcelable.Param(m51605id = 3) String str, @RecentlyNonNull @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) int i2, @RecentlyNonNull @SafeParcelable.Param(m51605id = 6) Point[] pointArr, @RecentlyNonNull @SafeParcelable.Param(m51605id = 7) Email email, @RecentlyNonNull @SafeParcelable.Param(m51605id = 8) Phone phone, @RecentlyNonNull @SafeParcelable.Param(m51605id = 9) Sms sms, @RecentlyNonNull @SafeParcelable.Param(m51605id = 10) WiFi wiFi, @RecentlyNonNull @SafeParcelable.Param(m51605id = 11) UrlBookmark urlBookmark, @RecentlyNonNull @SafeParcelable.Param(m51605id = 12) GeoPoint geoPoint, @RecentlyNonNull @SafeParcelable.Param(m51605id = 13) CalendarEvent calendarEvent, @RecentlyNonNull @SafeParcelable.Param(m51605id = 14) ContactInfo contactInfo, @RecentlyNonNull @SafeParcelable.Param(m51605id = 15) DriverLicense driverLicense, @RecentlyNonNull @SafeParcelable.Param(m51605id = 16) byte[] bArr, @SafeParcelable.Param(m51605id = 17) boolean z) {
        this.f71794b = i;
        this.f71795c = str;
        this.f71808p = bArr;
        this.f71796d = str2;
        this.f71797e = i2;
        this.f71798f = pointArr;
        this.f71809q = z;
        this.f71799g = email;
        this.f71800h = phone;
        this.f71801i = sms;
        this.f71802j = wiFi;
        this.f71803k = urlBookmark;
        this.f71804l = geoPoint;
        this.f71805m = calendarEvent;
        this.f71806n = contactInfo;
        this.f71807o = driverLicense;
    }
}
