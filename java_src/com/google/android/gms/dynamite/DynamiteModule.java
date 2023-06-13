package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
@KeepForSdk
/* loaded from: classes5.dex */
public final class DynamiteModule {

    /* renamed from: h */
    public static Boolean f70344h = null;

    /* renamed from: i */
    public static String f70345i = null;

    /* renamed from: j */
    public static boolean f70346j = false;

    /* renamed from: k */
    public static int f70347k = -1;

    /* renamed from: l */
    public static Boolean f70348l;

    /* renamed from: q */
    public static Hh9 f70353q;

    /* renamed from: r */
    public static Il9 f70354r;

    /* renamed from: a */
    public final Context f70355a;

    /* renamed from: m */
    public static final ThreadLocal f70349m = new ThreadLocal();

    /* renamed from: n */
    public static final ThreadLocal f70350n = new C41002fY7();

    /* renamed from: o */
    public static final InterfaceC17483a.InterfaceC17484a f70351o = new C17486a();
    @KeepForSdk

    /* renamed from: b */
    public static final InterfaceC17483a f70338b = new C17487b();
    @KeepForSdk

    /* renamed from: c */
    public static final InterfaceC17483a f70339c = new C17488c();
    @KeepForSdk

    /* renamed from: d */
    public static final InterfaceC17483a f70340d = new C17489d();
    @KeepForSdk

    /* renamed from: e */
    public static final InterfaceC17483a f70341e = new C17490e();
    @KeepForSdk

    /* renamed from: f */
    public static final InterfaceC17483a f70342f = new C17491f();
    @KeepForSdk

    /* renamed from: g */
    public static final InterfaceC17483a f70343g = new C17492g();

    /* renamed from: p */
    public static final InterfaceC17483a f70352p = new C17493h();

    @DynamiteApi
    /* loaded from: classes5.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes5.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, C51724xd9 c51724xd9) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, C51724xd9 c51724xd9) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC17483a {

        @KeepForSdk
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* loaded from: classes5.dex */
        public interface InterfaceC17484a {
            /* renamed from: a */
            int mo51582a(Context context, String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo51581b(Context context, String str);
        }

        @KeepForSdk
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        /* loaded from: classes5.dex */
        public static class C17485b {
            @KeepForSdk

            /* renamed from: a */
            public int f70356a = 0;
            @KeepForSdk

            /* renamed from: b */
            public int f70357b = 0;
            @KeepForSdk

            /* renamed from: c */
            public int f70358c = 0;
        }

        @KeepForSdk
        /* renamed from: a */
        C17485b mo51583a(Context context, String str, InterfaceC17484a interfaceC17484a) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f70355a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m51595a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static int m51593c(Context context, String str) {
        return m51590f(context, str, false);
    }

    @KeepForSdk
    /* renamed from: e */
    public static DynamiteModule m51591e(Context context, InterfaceC17483a interfaceC17483a, String str) throws LoadingException {
        long j;
        Boolean bool;
        WO1 m103523f5;
        DynamiteModule dynamiteModule;
        Il9 il9;
        boolean z;
        Boolean valueOf;
        WO1 m101731c5;
        ThreadLocal threadLocal = f70349m;
        Z49 z49 = (Z49) threadLocal.get();
        Z49 z492 = new Z49(null);
        threadLocal.set(z492);
        ThreadLocal threadLocal2 = f70350n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            InterfaceC17483a.C17485b mo51583a = interfaceC17483a.mo51583a(context, str, f70351o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + mo51583a.f70356a + " and remote module " + str + ":" + mo51583a.f70357b);
            int i = mo51583a.f70358c;
            try {
                if (i != 0) {
                    if (i == -1) {
                        if (mo51583a.f70356a != 0) {
                            i = -1;
                        }
                    }
                    if (i != 1 || mo51583a.f70357b != 0) {
                        if (i == -1) {
                            DynamiteModule m51588h = m51588h(context, str);
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor = z492.f47829a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(z49);
                            return m51588h;
                        } else if (i == 1) {
                            try {
                                int i2 = mo51583a.f70357b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (m51585k(context)) {
                                            bool = f70344h;
                                        } else {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                            synchronized (DynamiteModule.class) {
                                                il9 = f70354r;
                                            }
                                            if (il9 != null) {
                                                Z49 z493 = (Z49) threadLocal.get();
                                                if (z493 != null && z493.f47829a != null) {
                                                    Context applicationContext = context.getApplicationContext();
                                                    Cursor cursor2 = z493.f47829a;
                                                    BinderC36557Vd3.m79636e5(null);
                                                    synchronized (DynamiteModule.class) {
                                                        if (f70347k >= 2) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        valueOf = Boolean.valueOf(z);
                                                    }
                                                    if (valueOf.booleanValue()) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        m101731c5 = il9.m101730d5(BinderC36557Vd3.m79636e5(applicationContext), str, i2, BinderC36557Vd3.m79636e5(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        m101731c5 = il9.m101731c5(BinderC36557Vd3.m79636e5(applicationContext), str, i2, BinderC36557Vd3.m79636e5(cursor2));
                                                    }
                                                    Context context2 = (Context) BinderC36557Vd3.m79637d5(m101731c5);
                                                    if (context2 != null) {
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        throw new LoadingException("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("No result cursor", null);
                                                }
                                            } else {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                            Hh9 m51584l = m51584l(context);
                                            if (m51584l != null) {
                                                int m103526c5 = m51584l.m103526c5();
                                                if (m103526c5 >= 3) {
                                                    Z49 z494 = (Z49) threadLocal.get();
                                                    if (z494 != null) {
                                                        m103523f5 = m51584l.m103522g5(BinderC36557Vd3.m79636e5(context), str, i2, BinderC36557Vd3.m79636e5(z494.f47829a));
                                                    } else {
                                                        throw new LoadingException("No cached result cursor holder", null);
                                                    }
                                                } else if (m103526c5 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    m103523f5 = m51584l.m103521h5(BinderC36557Vd3.m79636e5(context), str, i2);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    m103523f5 = m51584l.m103523f5(BinderC36557Vd3.m79636e5(context), str, i2);
                                                }
                                                Object m79637d5 = BinderC36557Vd3.m79637d5(m103523f5);
                                                if (m79637d5 != null) {
                                                    dynamiteModule = new DynamiteModule((Context) m79637d5);
                                                } else {
                                                    throw new LoadingException("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        if (longValue == 0) {
                                            threadLocal2.remove();
                                        } else {
                                            threadLocal2.set(Long.valueOf(longValue));
                                        }
                                        Cursor cursor3 = z492.f47829a;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        threadLocal.set(z49);
                                        return dynamiteModule;
                                    }
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                } catch (RemoteException e) {
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, null);
                                }
                            } catch (LoadingException e3) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                                int i3 = mo51583a.f70356a;
                                if (i3 != 0 && interfaceC17483a.mo51583a(context, str, new C17494i(i3, 0)).f70358c == -1) {
                                    DynamiteModule m51588h2 = m51588h(context, str);
                                    if (longValue == 0) {
                                        f70350n.remove();
                                    } else {
                                        f70350n.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor4 = z492.f47829a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    f70349m.set(z49);
                                    return m51588h2;
                                }
                                throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                            }
                        } else {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i, null);
                        }
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + mo51583a.f70356a + " and remote version is " + mo51583a.f70357b + InstructionFileId.DOT, null);
            } catch (Throwable th2) {
                th = th2;
                j = 0;
                if (longValue == j) {
                    f70350n.remove();
                } else {
                    f70350n.set(Long.valueOf(longValue));
                }
                Cursor cursor5 = z492.f47829a;
                if (cursor5 != null) {
                    cursor5.close();
                }
                f70349m.set(z49);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j = 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01b3 -> B:128:0x01b8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01b5 -> B:128:0x01b8). Please submit an issue!!! */
    /* renamed from: f */
    public static int m51590f(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f70344h;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m51587i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!m51585k(context)) {
                            return 0;
                        } else {
                            if (!f70346j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m51589g = m51589g(context, str, z, true);
                                        String str2 = f70345i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m107439a = FC7.m107439a();
                                            if (m107439a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    D81.m110886a();
                                                    String str3 = f70345i;
                                                    Preconditions.checkNotNull(str3);
                                                    m107439a = C81.m112749a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f70345i;
                                                    Preconditions.checkNotNull(str4);
                                                    m107439a = new ZP7(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m51587i(m107439a);
                                            declaredField.set(null, m107439a);
                                            f70344h = bool2;
                                            return m51589g;
                                        }
                                        return m51589g;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f70344h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m51589g(context, str, z, false);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                Hh9 m51584l = m51584l(context);
                try {
                    if (m51584l != null) {
                        try {
                            int m103526c5 = m51584l.m103526c5();
                            if (m103526c5 >= 3) {
                                Z49 z49 = (Z49) f70349m.get();
                                if (z49 != null && (cursor = z49.f47829a) != null) {
                                    i = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) BinderC36557Vd3.m79637d5(m51584l.m103520i5(BinderC36557Vd3.m79636e5(context), str, z, ((Long) f70350n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 <= 0 || !m51586j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            String message2 = e.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (m103526c5 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = m51584l.m103524e5(BinderC36557Vd3.m79636e5(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = m51584l.m103525d5(BinderC36557Vd3.m79636e5(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return i;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m51589g(Context context, String str, boolean z, boolean z2) throws LoadingException {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        try {
            try {
                long longValue = ((Long) f70350n.get()).longValue();
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = "api_force_staging";
                boolean z3 = true;
                if (true != z) {
                    str2 = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z4 = false;
                            int i = query.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    f70345i = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f70347k = query.getInt(columnIndex);
                                    }
                                    int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (query.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        f70346j = z3;
                                        z4 = z3;
                                    }
                                }
                                if (m51586j(query)) {
                                    query = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", null);
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed", e, null);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            if (r0 != 0) {
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static DynamiteModule m51588h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: i */
    public static void m51587i(ClassLoader classLoader) throws LoadingException {
        Il9 il9;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                il9 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof Il9) {
                    il9 = (Il9) queryLocalInterface;
                } else {
                    il9 = new Il9(iBinder);
                }
            }
            f70354r = il9;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: j */
    public static boolean m51586j(Cursor cursor) {
        Z49 z49 = (Z49) f70349m.get();
        if (z49 == null || z49.f47829a != null) {
            return false;
        }
        z49.f47829a = cursor;
        return true;
    }

    /* renamed from: k */
    public static boolean m51585k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f70348l)) {
            return true;
        }
        boolean z = false;
        if (f70348l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f70348l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f70346j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* renamed from: l */
    public static Hh9 m51584l(Context context) {
        Hh9 hh9;
        synchronized (DynamiteModule.class) {
            Hh9 hh92 = f70353q;
            if (hh92 != null) {
                return hh92;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hh9 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof Hh9) {
                        hh9 = (Hh9) queryLocalInterface;
                    } else {
                        hh9 = new Hh9(iBinder);
                    }
                }
                if (hh9 != null) {
                    f70353q = hh9;
                    return hh9;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public Context m51594b() {
        return this.f70355a;
    }

    @KeepForSdk
    /* renamed from: d */
    public IBinder m51592d(String str) throws LoadingException {
        try {
            return (IBinder) this.f70355a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
