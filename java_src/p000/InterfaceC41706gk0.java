package p000;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: gk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC41706gk0 {

    /* renamed from: gk0$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22419a {
        /* renamed from: a */
        InterfaceC22419a mo37861a(Context context);

        InterfaceC41706gk0 build();
    }

    /* renamed from: gk0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC22420b {
        /* renamed from: a */
        void mo37836a();
    }

    /* renamed from: gk0$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC22421c {

        /* renamed from: gk0$c$a */
        /* loaded from: classes6.dex */
        public class C22422a implements InterfaceC22420b {

            /* renamed from: a */
            public final /* synthetic */ ExecutorService f84095a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC23437E f84096b;

            /* renamed from: c */
            public final /* synthetic */ ExecutorService f84097c;

            public C22422a(ExecutorService executorService, AbstractC23437E abstractC23437E, ExecutorService executorService2) {
                this.f84095a = executorService;
                this.f84096b = abstractC23437E;
                this.f84097c = executorService2;
            }

            @Override // p000.InterfaceC41706gk0.InterfaceC22420b
            /* renamed from: a */
            public void mo37836a() {
                this.f84095a.shutdown();
                this.f84096b.shutdown();
                this.f84097c.shutdown();
            }
        }

        /* renamed from: a */
        public static BluetoothAdapter m37860a() {
            return BluetoothAdapter.getDefaultAdapter();
        }

        /* renamed from: b */
        public static AbstractC23437E m37859b() {
            return C24508a.m32004e(new ThreadFactoryC52916ze5());
        }

        /* renamed from: c */
        public static ExecutorService m37858c() {
            return Executors.newSingleThreadExecutor();
        }

        /* renamed from: d */
        public static AbstractC23437E m37857d(ExecutorService executorService) {
            return C24542a.m31933b(executorService);
        }

        /* renamed from: e */
        public static BluetoothManager m37856e(Context context) {
            return (BluetoothManager) context.getSystemService("bluetooth");
        }

        /* renamed from: f */
        public static AbstractC23437E m37855f() {
            return C24542a.m31934a();
        }

        /* renamed from: g */
        public static ExecutorService m37854g() {
            return Executors.newCachedThreadPool();
        }

        /* renamed from: h */
        public static ContentResolver m37853h(Context context) {
            return context.getContentResolver();
        }

        /* renamed from: i */
        public static int m37852i() {
            return Build.VERSION.SDK_INT;
        }

        /* renamed from: j */
        public static byte[] m37851j() {
            return BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }

        /* renamed from: k */
        public static byte[] m37850k() {
            return BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        }

        /* renamed from: l */
        public static byte[] m37849l() {
            return BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        }

        /* renamed from: m */
        public static InterfaceC22420b m37848m(ExecutorService executorService, AbstractC23437E abstractC23437E, ExecutorService executorService2) {
            return new C22422a(executorService, abstractC23437E, executorService2);
        }

        @SuppressLint({"InlinedApi"})
        /* renamed from: n */
        public static boolean m37847n(Context context, int i) {
            return i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        }

        /* renamed from: o */
        public static Z92 m37846o(int i, Z94<C38033aa2> z94, Z94<C39830da2> z942) {
            if (i < 26) {
                return z94.get();
            }
            return z942.get();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            if ((r4.requestedPermissionsFlags[r1] & 65536) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
            return false;
         */
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean m37845p(Context context) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    } else if ("android.permission.BLUETOOTH_SCAN".equals(strArr[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                C52323ye5.m3124e(e, "Could not find application PackageInfo", new Object[0]);
            }
            return false;
        }

        /* renamed from: q */
        public static LocationManager m37844q(Context context) {
            return (LocationManager) context.getSystemService("location");
        }

        /* renamed from: r */
        public static Observable<Boolean> m37843r(int i, C34153Kw2 c34153Kw2) {
            if (i < 23) {
                return C39871de3.m43956b(Boolean.TRUE);
            }
            return c34153Kw2.m98121a();
        }

        /* renamed from: s */
        public static InterfaceC34855Nw2 m37842s(int i, Z94<C35089Ow2> z94, Z94<C35557Qw2> z942, Z94<C36025Sw2> z943) {
            if (i < 23) {
                return z94.get();
            }
            if (i < 31) {
                return z942.get();
            }
            return z943.get();
        }

        /* renamed from: t */
        public static String[][] m37841t(int i, int i2) {
            return Math.min(i, i2) < 31 ? new String[0] : new String[][]{new String[]{"android.permission.BLUETOOTH_CONNECT"}};
        }

        /* renamed from: u */
        public static String[][] m37840u(int i, int i2, boolean z) {
            int min = Math.min(i, i2);
            if (min < 23) {
                return new String[0];
            }
            return min < 29 ? new String[][]{new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}} : min < 31 ? new String[][]{new String[]{"android.permission.ACCESS_FINE_LOCATION"}} : z ? new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}} : new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}, new String[]{"android.permission.ACCESS_FINE_LOCATION"}};
        }

        /* renamed from: v */
        public static InterfaceC50012uk5 m37839v(int i, Z94<C50604vk5> z94, Z94<C51790xk5> z942) {
            if (i < 24) {
                return z94.get();
            }
            return z942.get();
        }

        /* renamed from: w */
        public static InterfaceC39332cl5 m37838w(int i, Z94<C39943dl5> z94, Z94<C41128fl5> z942, Z94<C42314hl5> z943) {
            if (i < 21) {
                return z94.get();
            }
            if (i < 23) {
                return z942.get();
            }
            return z943.get();
        }

        /* renamed from: x */
        public static int m37837x(Context context) {
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
            } catch (Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }
    }

    /* renamed from: g */
    AbstractC39873de5 mo37862g();
}
