package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
/* renamed from: bV7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38586bV7 {

    /* renamed from: a */
    public static final String f57572a = C45710nU7.m23606a(5);

    /* renamed from: a */
    public static final AbstractC45836nh9 m64505a(Au9 au9, Context context, XS7 xs7) throws C45108mT7, C37984aU7 {
        long j;
        Au9 au92 = Au9.MOBILE_SIGNALS_UNKNOWN;
        switch (au9.ordinal()) {
            case 1:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1);
                    xs7.m77001b(intExtra);
                    return AU7.m115725a(intExtra);
                }
                throw new C37984aU7(1);
            case 2:
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    return AU7.m115725a((audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3));
                }
                throw new C37984aU7(2);
            case 3:
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    int i = (int) ((memoryInfo.availMem * 100) / memoryInfo.totalMem);
                    xs7.m76999d(i);
                    return AU7.m115725a(i);
                }
                throw new C37984aU7(3);
            case 4:
                PackageManagerWrapper packageManager = Wrappers.packageManager(context);
                String packageName = context.getPackageName();
                if (packageManager != null) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            j = packageInfo.getLongVersionCode();
                        } else {
                            j = packageInfo.versionCode;
                        }
                        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                        order.putLong(j).rewind();
                        return AbstractC45836nh9.m23293w(order);
                    } catch (PackageManager.NameNotFoundException e) {
                        C33384Ho7.m103418a(f57572a, e);
                        throw new C37984aU7(4);
                    }
                }
                throw new C37984aU7(4);
            case 5:
                PackageManagerWrapper packageManager2 = Wrappers.packageManager(context);
                String packageName2 = context.getPackageName();
                if (packageManager2 != null) {
                    try {
                        PackageInfo packageInfo2 = packageManager2.getPackageInfo(packageName2, 4096);
                        GQ8 gq8 = new GQ8();
                        ByteBuffer order2 = ByteBuffer.allocate(packageInfo2.requestedPermissions.length * 3).order(ByteOrder.LITTLE_ENDIAN);
                        for (String str : packageInfo2.requestedPermissions) {
                            byte[] copyOf = Arrays.copyOf(C47517qX8.m17467a().mo83544a(str, Charset.forName(Constants.DEFAULT_ENCODING)).mo20941e(), 3);
                            order2.put(copyOf);
                            gq8.m105126d(AU7.m115724b(copyOf));
                        }
                        xs7.m77000c(gq8.m105125e());
                        order2.rewind();
                        return AbstractC45836nh9.m23293w(order2);
                    } catch (PackageManager.NameNotFoundException e2) {
                        C33384Ho7.m103418a(f57572a, e2);
                        throw new C37984aU7(5);
                    }
                }
                throw new C37984aU7(5);
            case 6:
                return AU7.m115725a(m64504b(context.getContentResolver()));
            case 7:
                if (context instanceof Activity) {
                    String name = ((Activity) context).getClass().getName();
                    xs7.m77002a(name);
                    return AbstractC45836nh9.m23290z(name);
                }
                throw new C37984aU7(7);
            default:
                throw new C45108mT7(au9.zza());
        }
    }

    /* renamed from: b */
    public static int m64504b(ContentResolver contentResolver) throws C37984aU7 {
        try {
            return Settings.System.getInt(contentResolver, "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            C33384Ho7.m103418a(f57572a, e);
            throw new C37984aU7(6);
        }
    }
}
