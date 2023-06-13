package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.C11817c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes.dex */
public class C11817c {

    /* renamed from: a */
    public static final InterfaceC11820c f55134a = new C11818a();

    /* renamed from: b */
    public static final InterfaceC11820c f55135b = new C11819b();

    /* renamed from: androidx.profileinstaller.c$a */
    /* loaded from: classes.dex */
    public class C11818a implements InterfaceC11820c {
        @Override // androidx.profileinstaller.C11817c.InterfaceC11820c
        /* renamed from: a */
        public void mo66787a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.C11817c.InterfaceC11820c
        /* renamed from: b */
        public void mo66786b(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.c$b */
    /* loaded from: classes.dex */
    public class C11819b implements InterfaceC11820c {
        @Override // androidx.profileinstaller.C11817c.InterfaceC11820c
        /* renamed from: a */
        public void mo66787a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i != 6 && i != 7 && i != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }

        @Override // androidx.profileinstaller.C11817c.InterfaceC11820c
        /* renamed from: b */
        public void mo66786b(int i, Object obj) {
            String str;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "";
                            } else {
                                str = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                            }
                        } else {
                            str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                        }
                    } else {
                        str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                    }
                } else {
                    str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                }
            } else {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    /* renamed from: androidx.profileinstaller.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11820c {
        /* renamed from: a */
        void mo66787a(int i, Object obj);

        /* renamed from: b */
        void mo66786b(int i, Object obj);
    }

    private C11817c() {
    }

    /* renamed from: b */
    public static boolean m66798b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    public static void m66797c(Context context, Executor executor, InterfaceC11820c interfaceC11820c) {
        m66798b(context.getFilesDir());
        m66793g(executor, interfaceC11820c, 11, null);
    }

    /* renamed from: d */
    public static boolean m66796d(PackageInfo packageInfo, File file, InterfaceC11820c interfaceC11820c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z = true;
            }
            if (z) {
                interfaceC11820c.mo66787a(2, null);
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m66794f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    public static void m66793g(Executor executor, final InterfaceC11820c interfaceC11820c, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: v74
            @Override // java.lang.Runnable
            public final void run() {
                C11817c.InterfaceC11820c.this.mo66787a(i, obj);
            }
        });
    }

    /* renamed from: h */
    public static boolean m66792h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC11820c interfaceC11820c) {
        C11816b c11816b = new C11816b(assetManager, executor, interfaceC11820c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c11816b.m66809e()) {
            return false;
        }
        boolean m66800n = c11816b.m66805i().m66801m().m66800n();
        if (m66800n) {
            m66794f(packageInfo, file);
        }
        return m66800n;
    }

    /* renamed from: i */
    public static void m66791i(Context context) {
        m66790j(context, new ExecutorC49647u74(), f55134a);
    }

    /* renamed from: j */
    public static void m66790j(Context context, Executor executor, InterfaceC11820c interfaceC11820c) {
        m66789k(context, executor, interfaceC11820c, false);
    }

    /* renamed from: k */
    public static void m66789k(Context context, Executor executor, InterfaceC11820c interfaceC11820c, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && m66796d(packageInfo, filesDir, interfaceC11820c)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                C11821d.m66783c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m66792h(assets, packageName, packageInfo, filesDir, name, executor, interfaceC11820c) && z) {
                z2 = true;
            }
            C11821d.m66783c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC11820c.mo66787a(7, e);
            C11821d.m66783c(context, false);
        }
    }

    /* renamed from: l */
    public static void m66788l(Context context, Executor executor, InterfaceC11820c interfaceC11820c) {
        try {
            m66794f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m66793g(executor, interfaceC11820c, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            m66793g(executor, interfaceC11820c, 7, e);
        }
    }
}
