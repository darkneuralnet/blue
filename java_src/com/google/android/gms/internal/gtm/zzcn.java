package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes5.dex */
public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    public zzcn(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @VisibleForTesting
    public final String zzf() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context m88003a = zzq().m88003a();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                zzP("Storing clientId", lowerCase);
                fileOutputStream = m88003a.openFileOutput("gaClientId", 0);
                fileOutputStream.write(lowerCase.getBytes());
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    zzK("Failed to close clientId writing stream", e);
                }
                return lowerCase;
            } catch (FileNotFoundException e2) {
                zzK("Error creating clientId file", e2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        zzK("Failed to close clientId writing stream", e);
                        return "0";
                    }
                }
                return "0";
            } catch (IOException e4) {
                zzK("Error writing to clientId file", e4);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        zzK("Failed to close clientId writing stream", e);
                        return "0";
                    }
                }
                return "0";
            }
        } catch (Exception e6) {
            zzK("Error saving clientId file", e6);
            return "0";
        }
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            if (this.zza == null) {
                this.zzb = zzq().m87997g(new zzcl(this));
            }
            Future<String> future = this.zzb;
            if (future != null) {
                try {
                    this.zza = future.get();
                } catch (InterruptedException e) {
                    zzS("ClientId loading or generation was interrupted", e);
                    this.zza = "0";
                } catch (ExecutionException e2) {
                    zzK("Failed to load or generate client id", e2);
                    this.zza = "0";
                }
                if (this.zza == null) {
                    this.zza = "0";
                }
                zzP("Loaded clientId", this.zza);
                this.zzb = null;
            }
            str = this.zza;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: IOException -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0086, blocks: (B:8:0x0030, B:13:0x0043, B:29:0x006e, B:41:0x0082), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[Catch: IOException -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0086, blocks: (B:8:0x0030, B:13:0x0043, B:29:0x006e, B:41:0x0082), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006c -> B:52:0x008a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006e -> B:52:0x008a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0082 -> B:57:0x008a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0087 -> B:52:0x008a). Please submit an issue!!! */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzc() {
        Throwable th;
        IOException e;
        FileInputStream fileInputStream;
        String str;
        String str2 = "gaClientId";
        Context m88003a = zzq().m88003a();
        Preconditions.checkNotMainThread("ClientId should be loaded from worker thread");
        FileInputStream fileInputStream2 = 0;
        try {
        } catch (IOException e2) {
            zzK("Failed to close client id reading stream", e2);
            str2 = e2;
            fileInputStream2 = fileInputStream2;
        }
        try {
            try {
                fileInputStream = m88003a.openFileInput("gaClientId");
                try {
                    byte[] bArr = new byte[36];
                    int read = fileInputStream.read(bArr, 0, 36);
                    if (fileInputStream.available() > 0) {
                        zzR("clientId file seems corrupted, deleting it.");
                        fileInputStream.close();
                        m88003a.deleteFile("gaClientId");
                        fileInputStream.close();
                        str2 = str2;
                    } else if (read < 14) {
                        zzR("clientId file is empty, deleting it.");
                        fileInputStream.close();
                        m88003a.deleteFile("gaClientId");
                        fileInputStream.close();
                        str2 = str2;
                    } else {
                        fileInputStream.close();
                        String str3 = new String(bArr, 0, read);
                        zzP("Read client id from disk", str3);
                        try {
                            fileInputStream.close();
                            str = str2;
                        } catch (IOException e3) {
                            zzK("Failed to close client id reading stream", e3);
                            str = e3;
                        }
                        fileInputStream2 = str3;
                        str2 = str;
                    }
                } catch (FileNotFoundException unused) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileInputStream2 == 0) {
                    }
                } catch (IOException e4) {
                    e = e4;
                    zzK("Error reading client id file, deleting it", e);
                    m88003a.deleteFile(str2);
                    str2 = str2;
                    fileInputStream2 = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                        str2 = str2;
                        fileInputStream2 = fileInputStream2;
                    }
                    if (fileInputStream2 == 0) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e5) {
                        zzK("Failed to close client id reading stream", e5);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
            if (fileInputStream != null) {
            }
            if (fileInputStream2 == 0) {
            }
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
            zzK("Error reading client id file, deleting it", e);
            m88003a.deleteFile(str2);
            str2 = str2;
            fileInputStream2 = fileInputStream2;
            if (fileInputStream != null) {
            }
            if (fileInputStream2 == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream2 != null) {
            }
            throw th;
        }
        if (fileInputStream2 == 0) {
            return zzf();
        }
        return fileInputStream2;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().m87997g(new zzcm(this));
        }
        return zzb();
    }
}
