package me.dm7.barcodescanner.core;

import android.hardware.Camera;
import java.util.List;
/* loaded from: classes8.dex */
public class CameraUtils {
    public static Camera getCameraInstance() {
        return getCameraInstance(getDefaultCameraId());
    }

    public static int getDefaultCameraId() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i < numberOfCameras) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
                i2 = i + 1;
            } else {
                return i4;
            }
        }
    }

    public static boolean isFlashSupported(Camera camera) {
        List<String> supportedFlashModes;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty() && (supportedFlashModes.size() != 1 || !supportedFlashModes.get(0).equals("off"))) {
                return true;
            }
        }
        return false;
    }

    public static Camera getCameraInstance(int i) {
        Camera open;
        try {
            if (i == -1) {
                open = Camera.open();
            } else {
                open = Camera.open(i);
            }
            return open;
        } catch (Exception unused) {
            return null;
        }
    }
}
