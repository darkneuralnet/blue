package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import org.joda.time.DateTimeConstants;
@SafeParcelable.Class(creator = "StrategyCreator")
/* loaded from: classes6.dex */
public class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Strategy> CREATOR = new C51733xe8();

    /* renamed from: j */
    public static final Strategy f71651j = new C17623a().m50564a();

    /* renamed from: k */
    public static final Strategy f71652k;
    @ShowFirstParty
    @Deprecated

    /* renamed from: l */
    public static final Strategy f71653l;
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71654b;
    @SafeParcelable.Field(m51606id = 1)
    @Deprecated

    /* renamed from: c */
    public final int f71655c;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: d */
    public final int f71656d;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: e */
    public final int f71657e;
    @SafeParcelable.Field(m51606id = 4)
    @Deprecated

    /* renamed from: f */
    public final boolean f71658f;
    @SafeParcelable.Field(getter = "getDiscoveryMedium", m51606id = 5)

    /* renamed from: g */
    public final int f71659g;
    @SafeParcelable.Field(getter = "getDiscoveryMode", m51606id = 6)

    /* renamed from: h */
    public final int f71660h;
    @SafeParcelable.Field(getter = "getBackgroundScanMode", m51606id = 7)

    /* renamed from: i */
    public final int f71661i;

    /* renamed from: com.google.android.gms.nearby.messages.Strategy$a */
    /* loaded from: classes6.dex */
    public static class C17623a {

        /* renamed from: a */
        public int f71662a = 3;

        /* renamed from: b */
        public int f71663b = 300;

        /* renamed from: c */
        public int f71664c = 0;

        /* renamed from: d */
        public int f71665d = -1;

        /* renamed from: a */
        public Strategy m50564a() {
            int i = this.f71665d;
            if (i == 2 && this.f71664c == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new Strategy(2, 0, this.f71663b, this.f71664c, false, i, this.f71662a, 0);
        }

        /* renamed from: b */
        public C17623a m50563b(int i) {
            boolean z;
            if (i != Integer.MAX_VALUE && (i <= 0 || i > 86400)) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), Integer.valueOf((int) DateTimeConstants.SECONDS_PER_DAY));
            this.f71663b = i;
            return this;
        }

        @ShowFirstParty
        /* renamed from: c */
        public final C17623a m50562c(int i) {
            this.f71665d = 2;
            return this;
        }
    }

    static {
        C17623a c17623a = new C17623a();
        c17623a.m50562c(2);
        c17623a.m50563b(Integer.MAX_VALUE);
        Strategy m50564a = c17623a.m50564a();
        f71652k = m50564a;
        f71653l = m50564a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Strategy(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 1) int i2, @SafeParcelable.Param(m51605id = 2) int i3, @SafeParcelable.Param(m51605id = 3) int i4, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) int i5, @SafeParcelable.Param(m51605id = 6) int i6, @SafeParcelable.Param(m51605id = 7) int i7) {
        this.f71654b = i;
        this.f71655c = i2;
        if (i2 != 0) {
            if (i2 != 2) {
                i6 = 3;
                if (i2 == 3) {
                    this.f71660h = 2;
                }
            } else {
                this.f71660h = 1;
            }
            this.f71657e = i4;
            this.f71658f = z;
            if (z) {
                this.f71656d = i3;
                if (i5 == -1 || i5 == 0 || i5 == 1 || i5 == 6) {
                    this.f71659g = -1;
                } else {
                    this.f71659g = i5;
                }
            } else {
                this.f71659g = 2;
                this.f71656d = Integer.MAX_VALUE;
            }
            this.f71661i = i7;
        }
        this.f71660h = i6;
        this.f71657e = i4;
        this.f71658f = z;
        if (z) {
        }
        this.f71661i = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        if (this.f71654b == strategy.f71654b && this.f71660h == strategy.f71660h && this.f71656d == strategy.f71656d && this.f71657e == strategy.f71657e && this.f71659g == strategy.f71659g && this.f71661i == strategy.f71661i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f71654b * 31) + this.f71660h) * 31) + this.f71656d) * 31) + this.f71657e) * 31) + this.f71659g) * 31) + this.f71661i;
    }

    public String toString() {
        String str;
        String obj;
        String obj2;
        int i = this.f71656d;
        int i2 = this.f71657e;
        String str2 = "DEFAULT";
        if (i2 == 0) {
            str = "DEFAULT";
        } else if (i2 != 1) {
            StringBuilder sb = new StringBuilder(19);
            sb.append("UNKNOWN:");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = "EARSHOT";
        }
        int i3 = this.f71659g;
        if (i3 == -1) {
            obj = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("UNKNOWN:");
                sb2.append(i3);
                obj = sb2.toString();
            } else {
                obj = arrayList.toString();
            }
        }
        int i4 = this.f71660h;
        if (i4 == 3) {
            obj2 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(19);
                sb3.append("UNKNOWN:");
                sb3.append(i4);
                obj2 = sb3.toString();
            } else {
                obj2 = arrayList2.toString();
            }
        }
        int i5 = this.f71661i;
        if (i5 != 0) {
            if (i5 != 1) {
                StringBuilder sb4 = new StringBuilder(20);
                sb4.append("UNKNOWN: ");
                sb4.append(i5);
                str2 = sb4.toString();
            } else {
                str2 = "ALWAYS_ON";
            }
        }
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(obj).length();
        StringBuilder sb5 = new StringBuilder(length + 102 + length2 + String.valueOf(obj2).length() + String.valueOf(str2).length());
        sb5.append("Strategy{ttlSeconds=");
        sb5.append(i);
        sb5.append(", distanceType=");
        sb5.append(str);
        sb5.append(", discoveryMedium=");
        sb5.append(obj);
        sb5.append(", discoveryMode=");
        sb5.append(obj2);
        sb5.append(", backgroundScanMode=");
        sb5.append(str2);
        sb5.append(CoreConstants.CURLY_RIGHT);
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71655c);
        SafeParcelWriter.writeInt(parcel, 2, this.f71656d);
        SafeParcelWriter.writeInt(parcel, 3, this.f71657e);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71658f);
        SafeParcelWriter.writeInt(parcel, 5, this.f71659g);
        SafeParcelWriter.writeInt(parcel, 6, this.f71660h);
        SafeParcelWriter.writeInt(parcel, 7, this.f71661i);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71654b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
