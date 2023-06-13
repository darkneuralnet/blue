package zendesk.support;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import ch.qos.logback.core.util.FileSize;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class SupportSdkMetadata {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final String DEVICE_INFO_API_VERSION = "device_api";
    private static final String DEVICE_INFO_BATTERY = "device_battery";
    private static final String DEVICE_INFO_DEVICE_NAME = "device_name";
    private static final String DEVICE_INFO_LOW_MEMORY = "device_low_memory";
    private static final String DEVICE_INFO_MANUFACTURER = "device_manufacturer";
    private static final String DEVICE_INFO_MODEL_TYPE = "device_model";
    private static final String DEVICE_INFO_OS_VERSION = "device_os";
    private static final String DEVICE_INFO_TOTAL_MEMORY = "device_total_memory";
    private static final String DEVICE_INFO_USED_MEMORY = "device_used_memory";
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "SupportSdkMetadata";
    private final ActivityManager activityManager;
    private final Context context;

    public SupportSdkMetadata(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
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

    private String getModel() {
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

    private String getModelDeviceName() {
        return Build.DEVICE;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: NumberFormatException -> 0x009d, NoSuchElementException -> 0x00a6, TRY_LEAVE, TryCatch #8 {NumberFormatException -> 0x009d, NoSuchElementException -> 0x00a6, blocks: (B:23:0x0082, B:25:0x0089), top: B:50:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long getTotalMemoryCompat() {
        BufferedReader bufferedReader;
        Throwable th;
        IOException e;
        String str;
        StringTokenizer stringTokenizer;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"));
            try {
                try {
                    str = bufferedReader.readLine();
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        C33694Ix2.m101448k(LOG_TAG, "Failed to close /proc/meminfo file stream: " + e2.getMessage(), e2, new Object[0]);
                    }
                } catch (IOException e3) {
                    e = e3;
                    C33694Ix2.m101455d(LOG_TAG, "Failed to determine total memory from /proc/meminfo: " + e.getMessage(), e, new Object[0]);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            C33694Ix2.m101448k(LOG_TAG, "Failed to close /proc/meminfo file stream: " + e4.getMessage(), e4, new Object[0]);
                        }
                    }
                    str = "";
                    stringTokenizer = new StringTokenizer(str);
                    if (stringTokenizer.countTokens() == 3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        C33694Ix2.m101448k(LOG_TAG, "Failed to close /proc/meminfo file stream: " + e5.getMessage(), e5, new Object[0]);
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            bufferedReader = null;
            e = e6;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            if (bufferedReader != null) {
            }
            throw th;
        }
        stringTokenizer = new StringTokenizer(str);
        try {
            if (stringTokenizer.countTokens() == 3) {
                return -1L;
            }
            stringTokenizer.nextToken();
            return Long.valueOf(stringTokenizer.nextToken()).longValue() * 1024;
        } catch (NumberFormatException e7) {
            C33694Ix2.m101455d(LOG_TAG, "Error reading memory size from proc/meminfo", e7, new Object[0]);
            return -1L;
        } catch (NoSuchElementException e8) {
            C33694Ix2.m101455d(LOG_TAG, "Error reading tokens from the /proc/meminfo", e8, new Object[0]);
            return -1L;
        }
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    private int getVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    private String getVersionName() {
        return Build.VERSION.RELEASE;
    }

    private boolean isLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public Map<String, String> getDeviceInfoAsMapForMetaData() {
        HashMap hashMap = new HashMap();
        hashMap.put(DEVICE_INFO_OS_VERSION, getVersionName());
        hashMap.put(DEVICE_INFO_API_VERSION, String.valueOf(getVersionCode()));
        hashMap.put(DEVICE_INFO_MODEL_TYPE, getModel());
        hashMap.put(DEVICE_INFO_DEVICE_NAME, getModelDeviceName());
        hashMap.put(DEVICE_INFO_MANUFACTURER, getManufacturer());
        hashMap.put(DEVICE_INFO_TOTAL_MEMORY, getBytesInMb(getTotalMemory()));
        hashMap.put(DEVICE_INFO_USED_MEMORY, getBytesInMb(getUsedMemory()));
        hashMap.put(DEVICE_INFO_LOW_MEMORY, String.valueOf(isLowMemory()));
        hashMap.put(DEVICE_INFO_BATTERY, String.valueOf(getBatteryLevel()));
        return hashMap;
    }

    public String getLocale() {
        return C32272Cv2.m111342d(Locale.getDefault());
    }
}
