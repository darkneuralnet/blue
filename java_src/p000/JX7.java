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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: JX7 */
/* loaded from: classes5.dex */
public abstract class JX7<T> {

    /* renamed from: h */
    public static volatile AbstractC49887uX7 f17750h;

    /* renamed from: a */
    public final C40993fX7 f17754a;

    /* renamed from: b */
    public final String f17755b;

    /* renamed from: c */
    public final T f17756c;

    /* renamed from: d */
    public volatile int f17757d = -1;

    /* renamed from: e */
    public volatile T f17758e;

    /* renamed from: f */
    public final boolean f17759f;

    /* renamed from: g */
    public static final Object f17749g = new Object();

    /* renamed from: i */
    public static final AtomicReference<Collection<JX7<?>>> f17751i = new AtomicReference<>();

    /* renamed from: j */
    public static final C45162mZ7 f17752j = new C45162mZ7(BV7.f2440a, null);

    /* renamed from: k */
    public static final AtomicInteger f17753k = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ JX7(C40993fX7 c40993fX7, String str, Object obj, boolean z, C39799dW7 c39799dW7) {
        if (c40993fX7.f80298b != null) {
            this.f17754a = c40993fX7;
            this.f17755b = str;
            this.f17756c = obj;
            this.f17759f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m100268d() {
        f17753k.incrementAndGet();
    }

    /* renamed from: e */
    public static void m100267e(final Context context) {
        if (f17750h == null) {
            Object obj = f17749g;
            synchronized (obj) {
                if (f17750h == null) {
                    synchronized (obj) {
                        AbstractC49887uX7 abstractC49887uX7 = f17750h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (abstractC49887uX7 == null || abstractC49887uX7.mo10098a() != context) {
                            ES7.m108967c();
                            XY7.m76856b();
                            C52824zU7.m1315d();
                            f17750h = new KR7(context, L18.m97917a(new G08() { // from class: PV7
                                @Override // p000.G08
                                public final Object zza() {
                                    AbstractC38891c08 m62033c;
                                    AbstractC38891c08 m62033c2;
                                    String str;
                                    Context context2 = context;
                                    Object obj2 = JX7.f17749g;
                                    String str2 = Build.TYPE;
                                    String str3 = Build.TAGS;
                                    if ((!str2.equals("eng") && !str2.equals("userdebug")) || (!str3.contains("dev-keys") && !str3.contains("test-keys"))) {
                                        return AbstractC38891c08.m62033c();
                                    }
                                    if (C50425vR7.m8642a() && !context2.isDeviceProtectedStorage()) {
                                        context2 = context2.createDeviceProtectedStorageContext();
                                    }
                                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        StrictMode.allowThreadDiskWrites();
                                        try {
                                            File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                            if (file.exists()) {
                                                m62033c = AbstractC38891c08.m62032d(file);
                                            } else {
                                                m62033c = AbstractC38891c08.m62033c();
                                            }
                                        } catch (RuntimeException e) {
                                            Log.e("HermeticFileOverrides", "no data dir", e);
                                            m62033c = AbstractC38891c08.m62033c();
                                        }
                                        if (m62033c.mo16671b()) {
                                            File file2 = (File) m62033c.mo16672a();
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                try {
                                                    HashMap hashMap = new HashMap();
                                                    HashMap hashMap2 = new HashMap();
                                                    while (true) {
                                                        String readLine = bufferedReader.readLine();
                                                        if (readLine == null) {
                                                            break;
                                                        }
                                                        String[] split = readLine.split(" ", 3);
                                                        if (split.length != 3) {
                                                            if (readLine.length() != 0) {
                                                                str = "Invalid: ".concat(readLine);
                                                            } else {
                                                                str = new String("Invalid: ");
                                                            }
                                                            Log.e("HermeticFileOverrides", str);
                                                        } else {
                                                            String str4 = new String(split[0]);
                                                            String decode = Uri.decode(new String(split[1]));
                                                            String str5 = (String) hashMap2.get(split[2]);
                                                            if (str5 == null) {
                                                                String str6 = new String(split[2]);
                                                                str5 = Uri.decode(str6);
                                                                if (str5.length() < 1024 || str5 == str6) {
                                                                    hashMap2.put(str6, str5);
                                                                }
                                                            }
                                                            if (!hashMap.containsKey(str4)) {
                                                                hashMap.put(str4, new HashMap());
                                                            }
                                                            ((Map) hashMap.get(str4)).put(decode, str5);
                                                        }
                                                    }
                                                    String valueOf = String.valueOf(file2);
                                                    StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                                                    sb.append("Parsed ");
                                                    sb.append(valueOf);
                                                    Log.i("HermeticFileOverrides", sb.toString());
                                                    MU7 mu7 = new MU7(hashMap);
                                                    bufferedReader.close();
                                                    m62033c2 = AbstractC38891c08.m62032d(mu7);
                                                } catch (Throwable th) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e2) {
                                                throw new RuntimeException(e2);
                                            }
                                        } else {
                                            m62033c2 = AbstractC38891c08.m62033c();
                                        }
                                        return m62033c2;
                                    } finally {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                }
                            }));
                            f17753k.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract T mo15827a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:26:0x006d, B:25:0x0067, B:53:0x00e4, B:55:0x00f4, B:57:0x0108, B:58:0x010b, B:59:0x010f, B:41:0x00bc, B:43:0x00c2, B:47:0x00d4, B:49:0x00da, B:52:0x00e2, B:46:0x00d2, B:28:0x0072, B:30:0x0078, B:32:0x0086, B:36:0x00ab, B:38:0x00b5, B:34:0x009d, B:60:0x0114, B:61:0x0119, B:62:0x011a), top: B:69:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:26:0x006d, B:25:0x0067, B:53:0x00e4, B:55:0x00f4, B:57:0x0108, B:58:0x010b, B:59:0x010f, B:41:0x00bc, B:43:0x00c2, B:47:0x00d4, B:49:0x00da, B:52:0x00e2, B:46:0x00d2, B:28:0x0072, B:30:0x0078, B:32:0x0086, B:36:0x00ab, B:38:0x00b5, B:34:0x009d, B:60:0x0114, B:61:0x0119, B:62:0x011a), top: B:69:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[Catch: all -> 0x011c, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:26:0x006d, B:25:0x0067, B:53:0x00e4, B:55:0x00f4, B:57:0x0108, B:58:0x010b, B:59:0x010f, B:41:0x00bc, B:43:0x00c2, B:47:0x00d4, B:49:0x00da, B:52:0x00e2, B:46:0x00d2, B:28:0x0072, B:30:0x0078, B:32:0x0086, B:36:0x00ab, B:38:0x00b5, B:34:0x009d, B:60:0x0114, B:61:0x0119, B:62:0x011a), top: B:69:0x001c }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T m100270b() {
        MT7 m76857a;
        Object zzb;
        T mo15827a;
        String str;
        AbstractC38891c08<MU7> zza;
        String str2;
        if (!this.f17759f && this.f17755b == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i = f17753k.get();
        if (this.f17757d < i) {
            synchronized (this) {
                if (this.f17757d < i) {
                    AbstractC49887uX7 abstractC49887uX7 = f17750h;
                    if (abstractC49887uX7 != null) {
                        boolean z = this.f17754a.f80302f;
                        String zzb2 = C52824zU7.m1318a(abstractC49887uX7.mo10098a()).zzb("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                        if (zzb2 != null && C41532gR7.f82200c.matcher(zzb2).matches()) {
                            if (Log.isLoggable("PhenotypeFlag", 3)) {
                                String valueOf = String.valueOf(m100269c());
                                if (valueOf.length() != 0) {
                                    str2 = "Bypass reading Phenotype values for flag: ".concat(valueOf);
                                } else {
                                    str2 = new String("Bypass reading Phenotype values for flag: ");
                                }
                                Log.d("PhenotypeFlag", str2);
                            }
                        } else {
                            if (this.f17754a.f80298b != null) {
                                if (C37993aV7.m71273a(abstractC49887uX7.mo10098a(), this.f17754a.f80298b)) {
                                    boolean z2 = this.f17754a.f80304h;
                                    m76857a = ES7.m108969a(abstractC49887uX7.mo10098a().getContentResolver(), this.f17754a.f80298b);
                                } else {
                                    m76857a = null;
                                }
                            } else {
                                Context mo10098a = abstractC49887uX7.mo10098a();
                                String str3 = this.f17754a.f80297a;
                                m76857a = XY7.m76857a(mo10098a, null);
                            }
                            if (m76857a != null && (zzb = m76857a.zzb(m100269c())) != null) {
                                mo15827a = mo15827a(zzb);
                                if (mo15827a == null) {
                                    if (!this.f17754a.f80301e) {
                                        C52824zU7 m1318a = C52824zU7.m1318a(abstractC49887uX7.mo10098a());
                                        if (this.f17754a.f80301e) {
                                            str = null;
                                        } else {
                                            str = this.f17755b;
                                        }
                                        String zzb3 = m1318a.zzb(str);
                                        if (zzb3 != null) {
                                            mo15827a = mo15827a(zzb3);
                                            if (mo15827a == null) {
                                                mo15827a = this.f17756c;
                                            }
                                        }
                                    }
                                    mo15827a = null;
                                    if (mo15827a == null) {
                                    }
                                }
                                zza = abstractC49887uX7.mo10097b().zza();
                                if (zza.mo16671b()) {
                                    C40993fX7 c40993fX7 = this.f17754a;
                                    String m95282a = zza.mo16672a().m95282a(c40993fX7.f80298b, null, c40993fX7.f80300d, this.f17755b);
                                    if (m95282a == null) {
                                        mo15827a = this.f17756c;
                                    } else {
                                        mo15827a = mo15827a(m95282a);
                                    }
                                }
                                this.f17758e = mo15827a;
                                this.f17757d = i;
                            }
                        }
                        mo15827a = null;
                        if (mo15827a == null) {
                        }
                        zza = abstractC49887uX7.mo10097b().zza();
                        if (zza.mo16671b()) {
                        }
                        this.f17758e = mo15827a;
                        this.f17757d = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.f17758e;
    }

    /* renamed from: c */
    public final String m100269c() {
        String str = this.f17754a.f80300d;
        return this.f17755b;
    }
}
