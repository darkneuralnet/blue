package com.google.android.libraries.places.internal;

import java.math.RoundingMode;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzky {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;

    public zzky(String str, char[] cArr) {
        String str2;
        boolean z;
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzaax.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int min = Math.min(8, Integer.lowestOneBit(zzb));
            try {
                this.zzc = 8 / min;
                this.zzd = zzb / min;
                this.zza = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    if (c < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzha.zzf(z, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z2 = false;
                    }
                    zzha.zzf(z2, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.zzg = bArr;
                boolean[] zArr = new boolean[this.zzc];
                for (int i2 = 0; i2 < this.zzd; i2++) {
                    zArr[zzaax.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
                }
            } catch (ArithmeticException e) {
                String str3 = new String(cArr);
                if (str3.length() != 0) {
                    str2 = "Illegal alphabet ".concat(str3);
                } else {
                    str2 = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public static /* synthetic */ char[] zzc(zzky zzkyVar) {
        return zzkyVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzky) {
            return Arrays.equals(this.zzf, ((zzky) obj).zzf);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final boolean zzb(char c) {
        return c < 128 && this.zzg[c] != -1;
    }
}
