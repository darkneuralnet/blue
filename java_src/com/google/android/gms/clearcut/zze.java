package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.C17477a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
@SafeParcelable.Class(creator = "LogEventParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C47584qe8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public zzr f70326b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public byte[] f70327c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int[] f70328d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String[] f70329e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public int[] f70330f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public byte[][] f70331g;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: h */
    public ExperimentTokens[] f70332h;
    @SafeParcelable.Field(defaultValue = "true", m51606id = 8)

    /* renamed from: i */
    public boolean f70333i;

    /* renamed from: j */
    public final C35536Qt8 f70334j;

    public zze(zzr zzrVar, C35536Qt8 c35536Qt8, C17477a.InterfaceC17480c interfaceC17480c, C17477a.InterfaceC17480c interfaceC17480c2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.f70326b = zzrVar;
        this.f70334j = c35536Qt8;
        this.f70328d = iArr;
        this.f70329e = null;
        this.f70330f = iArr2;
        this.f70331g = null;
        this.f70332h = null;
        this.f70333i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (Objects.equal(this.f70326b, zzeVar.f70326b) && Arrays.equals(this.f70327c, zzeVar.f70327c) && Arrays.equals(this.f70328d, zzeVar.f70328d) && Arrays.equals(this.f70329e, zzeVar.f70329e) && Objects.equal(this.f70334j, zzeVar.f70334j) && Objects.equal(null, null) && Objects.equal(null, null) && Arrays.equals(this.f70330f, zzeVar.f70330f) && Arrays.deepEquals(this.f70331g, zzeVar.f70331g) && Arrays.equals(this.f70332h, zzeVar.f70332h) && this.f70333i == zzeVar.f70333i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f70326b, this.f70327c, this.f70328d, this.f70329e, this.f70334j, null, null, this.f70330f, this.f70331g, this.f70332h, Boolean.valueOf(this.f70333i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f70326b);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f70327c;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f70328d));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f70329e));
        sb.append(", LogEvent: ");
        sb.append(this.f70334j);
        sb.append(", ExtensionProducer: ");
        sb.append((Object) null);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f70330f));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f70331g));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f70332h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f70333i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70326b, i, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f70327c, false);
        SafeParcelWriter.writeIntArray(parcel, 4, this.f70328d, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.f70329e, false);
        SafeParcelWriter.writeIntArray(parcel, 6, this.f70330f, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f70331g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f70333i);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f70332h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(m51605id = 2) zzr zzrVar, @SafeParcelable.Param(m51605id = 3) byte[] bArr, @SafeParcelable.Param(m51605id = 4) int[] iArr, @SafeParcelable.Param(m51605id = 5) String[] strArr, @SafeParcelable.Param(m51605id = 6) int[] iArr2, @SafeParcelable.Param(m51605id = 7) byte[][] bArr2, @SafeParcelable.Param(m51605id = 8) boolean z, @SafeParcelable.Param(m51605id = 9) ExperimentTokens[] experimentTokensArr) {
        this.f70326b = zzrVar;
        this.f70327c = bArr;
        this.f70328d = iArr;
        this.f70329e = strArr;
        this.f70334j = null;
        this.f70330f = iArr2;
        this.f70331g = bArr2;
        this.f70332h = experimentTokensArr;
        this.f70333i = z;
    }
}
