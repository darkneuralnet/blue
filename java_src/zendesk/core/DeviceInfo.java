package zendesk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import ch.qos.logback.core.util.FileSize;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes8.dex */
class DeviceInfo {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "DeviceInfo";
    private static final String PLATFORM_ANDROID = "Android";
    private final ActivityManager activityManager;
    private final Context context;

    public DeviceInfo(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    private long getAvailableInternalDiskMemory() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("level", -1);
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / FileSize.MB_COEFFICIENT);
    }

    public static Locale getCurrentLocale(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    private long getDiskSize() {
        return getTotalInternalDiskSize();
    }

    private String getManufacturer() {
        boolean z;
        String str = Build.MANUFACTURER;
        if (!"unknown".equals(str) && !C44504lS5.m27271d(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        return str;
    }

    private String getOS() {
        String str = Build.VERSION.RELEASE;
        if ("unknown".equals(str) || C44504lS5.m27271d(str)) {
        }
        return String.format(Locale.US, "%s/%s", str, Integer.valueOf(Build.VERSION.SDK_INT));
    }

    private long getTotalInternalDiskSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    private long getTotalMemory() {
        C33694Ix2.m101457b(LOG_TAG, "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private long getUsedDiskSpace() {
        return getDiskSize() - getAvailableInternalDiskMemory();
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    public Map<String, String> getInfo() {
        HashMap hashMap = new HashMap();
        String os = getOS();
        String model = getModel();
        long usedMemory = getUsedMemory();
        long totalMemory = getTotalMemory();
        long diskSize = getDiskSize();
        long usedDiskSpace = getUsedDiskSpace();
        int batteryLevel = getBatteryLevel();
        String locale = getLocale();
        String manufacturer = getManufacturer();
        if (!C44504lS5.m27271d(os)) {
            hashMap.put("os", os);
        }
        if (!C44504lS5.m27271d(model)) {
            hashMap.put(RequestHeadersFactory.MODEL, model);
        }
        if (usedMemory != -1) {
            hashMap.put("memory_used", getBytesInMb(usedMemory));
        }
        if (totalMemory != -1) {
            hashMap.put("memory_total", getBytesInMb(totalMemory));
        }
        if (diskSize != -1) {
            hashMap.put("disk_total", getBytesInMb(diskSize));
        }
        if (usedDiskSpace != -1) {
            hashMap.put("disk_used", getBytesInMb(usedDiskSpace));
        }
        if (batteryLevel != -1) {
            hashMap.put("battery_level", String.valueOf(batteryLevel));
        }
        if (!C44504lS5.m27271d(locale)) {
            hashMap.put("sys_locale", locale);
        }
        if (!C44504lS5.m27271d(manufacturer)) {
            hashMap.put("manufacturer", manufacturer);
        }
        hashMap.put("platform", PLATFORM_ANDROID);
        return hashMap;
    }

    public String getLocale() {
        return C32272Cv2.m111342d(Locale.getDefault());
    }

    public String getModel() {
        boolean z;
        boolean z2;
        String str = Build.MODEL;
        if (!"unknown".equals(str) && !C44504lS5.m27271d(str)) {
            z = false;
        } else {
            z = true;
        }
        String str2 = Build.DEVICE;
        if (!"unknown".equals(str2) && !C44504lS5.m27271d(str2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            return "";
        }
        if (str.equals(str2)) {
            return str;
        }
        return String.format(Locale.US, "%s/%s", str, str2);
    }
}
