package com.google.android.libraries.places.internal;

import java.io.IOException;
/* loaded from: classes6.dex */
public abstract class zzlc {
    private static final zzlc zza = new zzla("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzlc zzb = new zzla("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzlc zzc = new zzlb("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzlc zzd = new zzlb("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzlc zze = new zzkz("base16()", "0123456789ABCDEF");

    public static zzlc zzd() {
        return zze;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb(int i);

    public final String zze(byte[] bArr, int i, int i2) {
        zzha.zzg(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzb(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
