package com.google.p034ar.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.annotations.UsedByNative;
import com.google.p034ar.core.exceptions.ResourceExhaustedException;
import com.google.p034ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p034ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p034ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p034ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;
@UsedByNative("arcoreapk.cc")
@SuppressLint({"LongLogTag"})
/* renamed from: com.google.ar.core.ArCoreApkJniAdapter */
/* loaded from: classes6.dex */
final class ArCoreApkJniAdapter {

    /* renamed from: a */
    private static final Map f73719a;

    static {
        HashMap hashMap = new HashMap();
        f73719a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(EnumC17978ae.ERROR_INVALID_ARGUMENT.f73772G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(EnumC17978ae.ERROR_RESOURCE_EXHAUSTED.f73772G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(EnumC17978ae.UNAVAILABLE_ARCORE_NOT_INSTALLED.f73772G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(EnumC17978ae.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f73772G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(EnumC17978ae.UNAVAILABLE_APK_TOO_OLD.f73772G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(EnumC17978ae.UNAVAILABLE_SDK_TOO_OLD.f73772G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(EnumC17978ae.UNAVAILABLE_USER_DECLINED_INSTALLATION.f73772G));
    }

    private ArCoreApkJniAdapter() {
    }

    /* renamed from: a */
    private static int m48457a(Throwable th) {
        Log.e("ARCore-ArCoreApkJniAdapter", "Exception details:", th);
        Map map = f73719a;
        Class<?> cls = th.getClass();
        if (map.containsKey(cls)) {
            return ((Integer) map.get(cls)).intValue();
        }
        return EnumC17978ae.ERROR_FATAL.f73772G;
    }

    @UsedByNative("arcoreapk.cc")
    public static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            m48457a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    @UsedByNative("arcoreapk.cc")
    public static int requestInstall(Activity activity, boolean z, int[] iArr) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return EnumC17978ae.SUCCESS.f73772G;
        } catch (Throwable th) {
            return m48457a(th);
        }
    }

    @UsedByNative("arcoreapk.cc")
    public static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return EnumC17978ae.SUCCESS.f73772G;
        } catch (Throwable th) {
            return m48457a(th);
        }
    }
}
