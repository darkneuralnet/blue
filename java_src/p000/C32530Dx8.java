package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/* renamed from: Dx8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32530Dx8 {

    /* renamed from: a */
    public static volatile QC8 f6657a;

    private C32530Dx8() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:6|(3:10|11|12)|18|(1:22)|23|24|25|26|27|28|(1:30)(1:80)|31|(10:33|34|35|36|37|38|(2:39|(3:41|(3:56|57|58)(7:43|44|(2:46|(1:49))|50|(1:52)|53|54)|55)(1:59))|60|61|62)(1:79)|63|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = p000.QC8.m88749c();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static QC8 m109584a(Context context) {
        QC8 qc8;
        QC8 m88749c;
        QC8 m88749c2;
        synchronized (C32530Dx8.class) {
            qc8 = f6657a;
            if (qc8 == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                    m88749c2 = QC8.m88749c();
                    qc8 = m88749c2;
                    f6657a = qc8;
                }
                if (C41814gu8.m37343b() && !context.isDeviceProtectedStorage()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    m88749c = QC8.m88748d(file);
                } else {
                    m88749c = QC8.m88749c();
                }
                if (m88749c.mo24137b()) {
                    File file2 = (File) m88749c.mo24138a();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            NA5 na5 = new NA5();
                            HashMap hashMap = new HashMap();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                } else {
                                    String str3 = new String(split[0]);
                                    String decode = Uri.decode(new String(split[1]));
                                    String str4 = (String) hashMap.get(split[2]);
                                    if (str4 == null) {
                                        String str5 = new String(split[2]);
                                        str4 = Uri.decode(str5);
                                        if (str4.length() < 1024 || str4 == str5) {
                                            hashMap.put(str5, str4);
                                        }
                                    }
                                    if (!na5.containsKey(str3)) {
                                        na5.put(str3, new NA5());
                                    }
                                    ((NA5) na5.get(str3)).put(decode, str4);
                                }
                            }
                            String obj = file2.toString();
                            String packageName = context.getPackageName();
                            Log.w("HermeticFileOverrides", "Parsed " + obj + " for Android package " + packageName);
                            C33448Hv8 c33448Hv8 = new C33448Hv8(na5);
                            bufferedReader.close();
                            m88749c2 = QC8.m88748d(c33448Hv8);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    m88749c2 = QC8.m88749c();
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                qc8 = m88749c2;
                f6657a = qc8;
            }
        }
        return qc8;
    }
}
