package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.UByte;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class zzlb extends zzlc {
    final zzky zzb;
    final Character zzc;

    public zzlb(zzky zzkyVar, Character ch2) {
        this.zzb = zzkyVar;
        if (ch2 == null || !zzkyVar.zzb(ch2.charValue())) {
            this.zzc = ch2;
            return;
        }
        throw new IllegalArgumentException(zzhf.zza("Padding character %s was already in alphabet", ch2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzlb) {
            zzlb zzlbVar = (zzlb) obj;
            if (this.zzb.equals(zzlbVar.zzb) && zzgw.zza(this.zzc, zzlbVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ Arrays.hashCode(new Object[]{this.zzc});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb.toString());
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzlc
    public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzha.zzg(0, i2, bArr.length);
        while (i3 < i2) {
            zzc(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzlc
    public final int zzb(int i) {
        zzky zzkyVar = this.zzb;
        return zzkyVar.zzc * zzaax.zza(i, zzkyVar.zzd, RoundingMode.CEILING);
    }

    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzha.zzg(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.zzb.zzd) {
            z = true;
        } else {
            z = false;
        }
        zzha.zzd(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & UByte.MAX_VALUE)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.zzb.zzb;
        while (i3 < i2 * 8) {
            zzky zzkyVar = this.zzb;
            appendable.append(zzkyVar.zza(((int) (j >>> (i5 - i3))) & zzkyVar.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i3 += this.zzb.zzb;
            }
        }
    }

    public zzlb(String str, String str2, Character ch2) {
        this(new zzky(str, str2.toCharArray()), ch2);
    }
}
