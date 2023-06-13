package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: d */
    public static final Set<Integer> f52422d = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: e */
    public static final Set<Integer> f52423e = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: b */
    public final int f52424b;

    /* renamed from: c */
    public final CameraAccessException f52425c;

    public CameraAccessExceptionCompat(int i, String str, Throwable th) {
        super(m69661a(i, str), th);
        this.f52424b = i;
        this.f52425c = f52422d.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th) : null;
    }

    /* renamed from: a */
    public static String m69661a(int i, String str) {
        return String.format("%s (%d): %s", m69659c(i), Integer.valueOf(i), str);
    }

    /* renamed from: b */
    public static String m69660b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 10001) {
                                if (i != 10002) {
                                    return null;
                                }
                                return "Failed to create CameraCharacteristics.";
                            }
                            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
                        }
                        return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
                    }
                    return "The camera device is in use already";
                }
                return "The camera device is currently in the error state; no further calls to it will succeed.";
            }
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        return "The camera is disabled due to a device policy, and cannot be opened.";
    }

    /* renamed from: c */
    public static String m69659c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 1000 ? i != 10001 ? i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: e */
    public static CameraAccessExceptionCompat m69657e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    /* renamed from: d */
    public final int m69658d() {
        return this.f52424b;
    }

    public CameraAccessExceptionCompat(int i, Throwable th) {
        super(m69660b(i), th);
        this.f52424b = i;
        this.f52425c = f52422d.contains(Integer.valueOf(i)) ? new CameraAccessException(i, null, th) : null;
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f52424b = cameraAccessException.getReason();
        this.f52425c = cameraAccessException;
    }
}
