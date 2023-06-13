package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@KeepForSdk
@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class ExperimentTokens extends AbstractSafeParcelable {

    /* renamed from: j */
    public static final byte[][] f71751j;

    /* renamed from: k */
    public static final ExperimentTokens f71752k;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f71757b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final byte[] f71758c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final byte[][] f71759d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final byte[][] f71760e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final byte[][] f71761f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final byte[][] f71762g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final int[] f71763h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public final byte[][] f71764i;
    @KeepForSdk
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new C47734qt8();

    /* renamed from: l */
    public static final InterfaceC17624a f71753l = new C17625a();

    /* renamed from: m */
    public static final InterfaceC17624a f71754m = new C17626b();

    /* renamed from: n */
    public static final InterfaceC17624a f71755n = new C17627c();

    /* renamed from: o */
    public static final InterfaceC17624a f71756o = new C17628d();

    /* renamed from: com.google.android.gms.phenotype.ExperimentTokens$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17624a {
    }

    static {
        byte[][] bArr = new byte[0];
        f71751j = bArr;
        f71752k = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    @SafeParcelable.Constructor
    public ExperimentTokens(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) byte[] bArr, @SafeParcelable.Param(m51605id = 4) byte[][] bArr2, @SafeParcelable.Param(m51605id = 5) byte[][] bArr3, @SafeParcelable.Param(m51605id = 6) byte[][] bArr4, @SafeParcelable.Param(m51605id = 7) byte[][] bArr5, @SafeParcelable.Param(m51605id = 8) int[] iArr, @SafeParcelable.Param(m51605id = 9) byte[][] bArr6) {
        this.f71757b = str;
        this.f71758c = bArr;
        this.f71759d = bArr2;
        this.f71760e = bArr3;
        this.f71761f = bArr4;
        this.f71762g = bArr5;
        this.f71763h = iArr;
        this.f71764i = bArr6;
    }

    /* renamed from: s */
    public static List<Integer> m50555s(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: u */
    public static List<String> m50554u(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: v */
    public static void m50553v(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (O49.m92951a(this.f71757b, experimentTokens.f71757b) && Arrays.equals(this.f71758c, experimentTokens.f71758c) && O49.m92951a(m50554u(this.f71759d), m50554u(experimentTokens.f71759d)) && O49.m92951a(m50554u(this.f71760e), m50554u(experimentTokens.f71760e)) && O49.m92951a(m50554u(this.f71761f), m50554u(experimentTokens.f71761f)) && O49.m92951a(m50554u(this.f71762g), m50554u(experimentTokens.f71762g)) && O49.m92951a(m50555s(this.f71763h), m50555s(experimentTokens.f71763h)) && O49.m92951a(m50554u(this.f71764i), m50554u(experimentTokens.f71764i))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f71757b;
        if (str == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
            sb3.append("'");
            sb3.append(str);
            sb3.append("'");
            sb = sb3.toString();
        }
        sb2.append(sb);
        sb2.append(", ");
        byte[] bArr = this.f71758c;
        sb2.append("direct");
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        m50553v(sb2, "GAIA", this.f71759d);
        sb2.append(", ");
        m50553v(sb2, "PSEUDO", this.f71760e);
        sb2.append(", ");
        m50553v(sb2, "ALWAYS", this.f71761f);
        sb2.append(", ");
        m50553v(sb2, "OTHER", this.f71762g);
        sb2.append(", ");
        int[] iArr = this.f71763h;
        sb2.append("weak");
        sb2.append("=");
        if (iArr == null) {
            sb2.append("null");
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(i2);
                i++;
                z = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        m50553v(sb2, "directs", this.f71764i);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71757b, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f71758c, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.f71759d, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.f71760e, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.f71761f, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f71762g, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.f71763h, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.f71764i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
