package io.card.payment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import androidx.recyclerview.widget.C11925l;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class Util {
    private static final String TAG = "Util";
    private static final boolean TORCH_BLACK_LISTED = Build.MODEL.equals("DROID2");
    private static Boolean sHardwareSupported;

    public static boolean deviceSupportsTorch(Context context) {
        if (!TORCH_BLACK_LISTED && context.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            return true;
        }
        return false;
    }

    public static String getNativeMemoryStats() {
        return "(free/alloc'd/total)" + Debug.getNativeHeapFreeSize() + "/" + Debug.getNativeHeapAllocatedSize() + "/" + Debug.getNativeHeapSize();
    }

    private static boolean hardwareSupportCheck() {
        Camera open;
        boolean z;
        if (!CardScanner.processorSupported()) {
            Log.w("card.io", "- Processor type is not supported");
            return false;
        }
        try {
            open = Camera.open();
        } catch (RuntimeException unused) {
        }
        if (open == null) {
            Log.w("card.io", "- No camera found");
            return false;
        }
        List<Camera.Size> supportedPreviewSizes = open.getParameters().getSupportedPreviewSizes();
        open.release();
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (true) {
            if (it.hasNext()) {
                Camera.Size next = it.next();
                if (next.width == 640 && next.height == 480) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Log.w("card.io", "- Camera resolution is insufficient");
            return false;
        }
        return true;
    }

    public static boolean hardwareSupported() {
        if (sHardwareSupported == null) {
            sHardwareSupported = Boolean.valueOf(hardwareSupportCheck());
        }
        return sHardwareSupported.booleanValue();
    }

    public static boolean hasConfigFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void logNativeMemoryStats() {
        Log.d("MEMORY", "Native memory stats: " + getNativeMemoryStats());
    }

    public static String manifestHasConfigChange(ResolveInfo resolveInfo, Class cls) {
        String str;
        if (resolveInfo == null) {
            str = String.format("Didn't find %s in the AndroidManifest.xml", cls.getName());
        } else if (!hasConfigFlag(resolveInfo.activityInfo.configChanges, 128)) {
            str = cls.getName() + " requires attribute android:configChanges=\"orientation\"";
        } else {
            str = null;
        }
        if (str != null) {
            Log.e("card.io", str);
        }
        return str;
    }

    public static Rect rectGivenCenter(Point point, int i, int i2) {
        int i3 = point.x;
        int i4 = i / 2;
        int i5 = point.y;
        int i6 = i2 / 2;
        return new Rect(i3 - i4, i5 - i6, i3 + i4, i5 + i6);
    }

    public static void setupTextPaintStyle(Paint paint) {
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5f, 0.5f, 0.0f, Color.HSVToColor(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, new float[]{0.0f, 0.0f, 0.0f}));
    }

    public static void writeCapturedCardImageIfNecessary(Intent intent, Intent intent2, OverlayView overlayView) {
        if (intent.getBooleanExtra(CardIOActivity.EXTRA_RETURN_CARD_IMAGE, false) && overlayView != null && overlayView.getBitmap() != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            overlayView.getBitmap().compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            intent2.putExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE, byteArrayOutputStream.toByteArray());
        }
    }
}
