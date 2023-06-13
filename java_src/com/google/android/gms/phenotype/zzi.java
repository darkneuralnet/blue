package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
@SafeParcelable.Class(creator = "FlagCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new C52762zN8();

    /* renamed from: j */
    public static final Comparator<zzi> f71765j = new WG8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f71766b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final long f71767c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final boolean f71768d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final double f71769e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final String f71770f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final byte[] f71771g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final int f71772h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public final int f71773i;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) long j, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) double d, @SafeParcelable.Param(m51605id = 6) String str2, @SafeParcelable.Param(m51605id = 7) byte[] bArr, @SafeParcelable.Param(m51605id = 8) int i, @SafeParcelable.Param(m51605id = 9) int i2) {
        this.f71766b = str;
        this.f71767c = j;
        this.f71768d = z;
        this.f71769e = d;
        this.f71770f = str2;
        this.f71771g = bArr;
        this.f71772h = i;
        this.f71773i = i2;
    }

    /* renamed from: s */
    public static int m50552s(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzi zziVar) {
        zzi zziVar2 = zziVar;
        int compareTo = this.f71766b.compareTo(zziVar2.f71766b);
        if (compareTo != 0) {
            return compareTo;
        }
        int m50552s = m50552s(this.f71772h, zziVar2.f71772h);
        if (m50552s != 0) {
            return m50552s;
        }
        int i = this.f71772h;
        if (i == 1) {
            int i2 = (this.f71767c > zziVar2.f71767c ? 1 : (this.f71767c == zziVar2.f71767c ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            return i2 == 0 ? 0 : 1;
        } else if (i == 2) {
            boolean z = this.f71768d;
            if (z == zziVar2.f71768d) {
                return 0;
            }
            return z ? 1 : -1;
        } else if (i != 3) {
            if (i == 4) {
                String str = this.f71770f;
                String str2 = zziVar2.f71770f;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i != 5) {
                int i3 = this.f71772h;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i3);
                throw new AssertionError(sb.toString());
            } else {
                byte[] bArr = this.f71771g;
                byte[] bArr2 = zziVar2.f71771g;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i4 = 0; i4 < Math.min(this.f71771g.length, zziVar2.f71771g.length); i4++) {
                    int i5 = this.f71771g[i4] - zziVar2.f71771g[i4];
                    if (i5 != 0) {
                        return i5;
                    }
                }
                return m50552s(this.f71771g.length, zziVar2.f71771g.length);
            }
        } else {
            return Double.compare(this.f71769e, zziVar2.f71769e);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (O49.m92951a(this.f71766b, zziVar.f71766b) && (i = this.f71772h) == zziVar.f71772h && this.f71773i == zziVar.f71773i) {
                if (i != 1) {
                    if (i == 2) {
                        return this.f71768d == zziVar.f71768d;
                    } else if (i == 3) {
                        return this.f71769e == zziVar.f71769e;
                    } else if (i != 4) {
                        if (i == 5) {
                            return Arrays.equals(this.f71771g, zziVar.f71771g);
                        }
                        int i2 = this.f71772h;
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Invalid enum value: ");
                        sb.append(i2);
                        throw new AssertionError(sb.toString());
                    } else {
                        return O49.m92951a(this.f71770f, zziVar.f71770f);
                    }
                } else if (this.f71767c == zziVar.f71767c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Flag(");
        sb.append(this.f71766b);
        sb.append(", ");
        int i = this.f71772h;
        if (i == 1) {
            sb.append(this.f71767c);
        } else if (i == 2) {
            sb.append(this.f71768d);
        } else if (i != 3) {
            if (i == 4) {
                sb.append("'");
                str = this.f71770f;
            } else if (i != 5) {
                String str2 = this.f71766b;
                int i2 = this.f71772h;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb2.append("Invalid type: ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(i2);
                throw new AssertionError(sb2.toString());
            } else if (this.f71771g == null) {
                sb.append("null");
            } else {
                sb.append("'");
                str = Base64.encodeToString(this.f71771g, 3);
            }
            sb.append(str);
            sb.append("'");
        } else {
            sb.append(this.f71769e);
        }
        sb.append(", ");
        sb.append(this.f71772h);
        sb.append(", ");
        sb.append(this.f71773i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71766b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f71767c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71768d);
        SafeParcelWriter.writeDouble(parcel, 5, this.f71769e);
        SafeParcelWriter.writeString(parcel, 6, this.f71770f, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f71771g, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f71772h);
        SafeParcelWriter.writeInt(parcel, 9, this.f71773i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
