package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.UByte;
/* loaded from: classes6.dex */
final class zzla extends zzlb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzla(String str, String str2, Character ch2) {
        super(r0, ch2);
        boolean z;
        zzky zzkyVar = new zzky(str, str2.toCharArray());
        if (zzky.zzc(zzkyVar).length == 64) {
            z = true;
        } else {
            z = false;
        }
        zzha.zzd(z);
    }

    @Override // com.google.android.libraries.places.internal.zzlb, com.google.android.libraries.places.internal.zzlc
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzha.zzg(0, i2, bArr.length);
        int i4 = i2;
        while (i4 >= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i3] & UByte.MAX_VALUE) << 16) | ((bArr[i5] & UByte.MAX_VALUE) << 8) | (bArr[i6] & UByte.MAX_VALUE);
            appendable.append(this.zzb.zza(i7 >>> 18));
            appendable.append(this.zzb.zza((i7 >>> 12) & 63));
            appendable.append(this.zzb.zza((i7 >>> 6) & 63));
            appendable.append(this.zzb.zza(i7 & 63));
            i4 -= 3;
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            zzc(appendable, bArr, i3, i2 - i3);
        }
    }
}
