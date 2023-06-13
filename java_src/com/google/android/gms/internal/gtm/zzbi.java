package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p000.C25919m8;
@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzbi extends zzbs {
    public static boolean zza;
    private C25919m8.C25920a zzb;
    private final zzfo zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    public zzbi(zzbv zzbvVar) {
        super(zzbvVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0174, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:15:0x002e, B:19:0x0038, B:82:0x015b, B:22:0x0040, B:23:0x004a, B:83:0x015e, B:18:0x0034, B:10:0x001c, B:12:0x0020, B:13:0x0028, B:88:0x0170, B:24:0x004b, B:27:0x0050, B:29:0x0068, B:31:0x007c, B:32:0x0085, B:33:0x008a, B:39:0x0093, B:42:0x00a7, B:48:0x00b8, B:50:0x00c6, B:52:0x00d1, B:53:0x00d5, B:51:0x00cb, B:55:0x00d8, B:57:0x00e2, B:59:0x00ec, B:58:0x00e7, B:46:0x00b2, B:60:0x00f2, B:62:0x0100, B:64:0x010b, B:66:0x0115, B:68:0x0117, B:70:0x011f, B:72:0x0121, B:74:0x0129, B:75:0x013b, B:77:0x0149, B:79:0x0154, B:80:0x0158, B:78:0x014e, B:63:0x0105, B:41:0x00a2), top: B:101:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x0174, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:15:0x002e, B:19:0x0038, B:82:0x015b, B:22:0x0040, B:23:0x004a, B:83:0x015e, B:18:0x0034, B:10:0x001c, B:12:0x0020, B:13:0x0028, B:88:0x0170, B:24:0x004b, B:27:0x0050, B:29:0x0068, B:31:0x007c, B:32:0x0085, B:33:0x008a, B:39:0x0093, B:42:0x00a7, B:48:0x00b8, B:50:0x00c6, B:52:0x00d1, B:53:0x00d5, B:51:0x00cb, B:55:0x00d8, B:57:0x00e2, B:59:0x00ec, B:58:0x00e7, B:46:0x00b2, B:60:0x00f2, B:62:0x0100, B:64:0x010b, B:66:0x0115, B:68:0x0117, B:70:0x011f, B:72:0x0121, B:74:0x0129, B:75:0x013b, B:77:0x0149, B:79:0x0154, B:80:0x0158, B:78:0x014e, B:63:0x0105, B:41:0x00a2), top: B:101:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized C25919m8.C25920a zzc() {
        C25919m8.C25920a c25920a;
        String m26300a;
        String str;
        IOException e;
        FileInputStream openFileInput;
        byte[] bArr;
        int read;
        String str2;
        String str3;
        boolean zzf;
        String str4;
        String str5;
        if (this.zzc.zzc(1000L)) {
            this.zzc.zzb();
            String str6 = null;
            try {
                try {
                    c25920a = C25919m8.m26307a(zzo());
                } catch (Exception e2) {
                    if (!zza) {
                        zza = true;
                        zzS("Error getting advertiser id", e2);
                    }
                    c25920a = null;
                    C25919m8.C25920a c25920a2 = this.zzb;
                    if (c25920a == null) {
                    }
                    if (!TextUtils.isEmpty(m26300a)) {
                    }
                    this.zzb = c25920a;
                    return this.zzb;
                }
            } catch (IllegalStateException unused) {
                zzR("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
                c25920a = null;
                C25919m8.C25920a c25920a22 = this.zzb;
                if (c25920a == null) {
                }
                if (!TextUtils.isEmpty(m26300a)) {
                }
                this.zzb = c25920a;
                return this.zzb;
            }
            C25919m8.C25920a c25920a222 = this.zzb;
            if (c25920a == null) {
                m26300a = null;
            } else {
                m26300a = c25920a.m26300a();
            }
            if (!TextUtils.isEmpty(m26300a)) {
                String zzb = zzv().zzb();
                synchronized (this.zzf) {
                    if (!this.zze) {
                        try {
                            openFileInput = zzo().openFileInput("gaClientIdData");
                            bArr = new byte[128];
                            read = openFileInput.read(bArr, 0, 128);
                        } catch (FileNotFoundException unused2) {
                        } catch (IOException e3) {
                            str = null;
                            e = e3;
                        }
                        if (openFileInput.available() > 0) {
                            zzR("Hash file seems corrupted, deleting it.");
                            openFileInput.close();
                            zzo().deleteFile("gaClientIdData");
                        } else if (read <= 0) {
                            zzO("Hash file is empty.");
                            openFileInput.close();
                        } else {
                            str = new String(bArr, 0, read);
                            try {
                                openFileInput.close();
                            } catch (FileNotFoundException unused3) {
                            } catch (IOException e4) {
                                e = e4;
                                zzS("Error reading Hash file, deleting it", e);
                                zzo().deleteFile("gaClientIdData");
                            }
                            str6 = str;
                        }
                        this.zzd = str6;
                        this.zze = true;
                    } else if (TextUtils.isEmpty(this.zzd)) {
                        if (c25920a222 != null) {
                            str6 = c25920a222.m26300a();
                        }
                        if (str6 == null) {
                            String valueOf = String.valueOf(m26300a);
                            String valueOf2 = String.valueOf(zzb);
                            if (valueOf2.length() != 0) {
                                str5 = valueOf.concat(valueOf2);
                            } else {
                                str5 = new String(valueOf);
                            }
                            zzf = zzf(str5);
                        } else {
                            String valueOf3 = String.valueOf(zzb);
                            if (valueOf3.length() != 0) {
                                str4 = str6.concat(valueOf3);
                            } else {
                                str4 = new String(str6);
                            }
                            this.zzd = zze(str4);
                        }
                    }
                    String valueOf4 = String.valueOf(m26300a);
                    String valueOf5 = String.valueOf(zzb);
                    if (valueOf5.length() != 0) {
                        str2 = valueOf4.concat(valueOf5);
                    } else {
                        str2 = new String(valueOf4);
                    }
                    String zze = zze(str2);
                    if (!TextUtils.isEmpty(zze)) {
                        if (!zze.equals(this.zzd)) {
                            if (!TextUtils.isEmpty(this.zzd)) {
                                zzO("Resetting the client id because Advertising Id changed.");
                                zzb = zzv().zze();
                                zzP("New client Id", zzb);
                            }
                            String valueOf6 = String.valueOf(m26300a);
                            String valueOf7 = String.valueOf(zzb);
                            if (valueOf7.length() != 0) {
                                str3 = valueOf6.concat(valueOf7);
                            } else {
                                str3 = new String(valueOf6);
                            }
                            zzf = zzf(str3);
                        }
                    } else {
                        zzJ("Failed to reset client id on adid change. Not using adid");
                        this.zzb = new C25919m8.C25920a("", false);
                    }
                }
            }
            this.zzb = c25920a;
        }
        return this.zzb;
    }

    private static String zze(String str) {
        MessageDigest zze = zzfs.zze("MD5");
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzO("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e) {
            zzK("Error creating hash file", e);
            return false;
        }
    }

    public final String zza() {
        String str;
        zzW();
        C25919m8.C25920a zzc = zzc();
        if (zzc != null) {
            str = zzc.m26300a();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzW();
        C25919m8.C25920a zzc = zzc();
        if (zzc == null || zzc.m26299b()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}
