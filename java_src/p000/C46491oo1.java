package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.nio.BufferUnderflowException;
/* renamed from: oo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46491oo1 {
    private C46491oo1() {
    }

    /* renamed from: a */
    public static boolean m20482a(InterfaceC36995Xa0 interfaceC36995Xa0) {
        return m20481b(false, interfaceC36995Xa0);
    }

    /* renamed from: b */
    public static boolean m20481b(boolean z, InterfaceC36995Xa0 interfaceC36995Xa0) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC36995Xa0.mo76850a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (S21.m86079a(C45898no1.class) != null) {
                C33928Jx2.m99533a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                C33928Jx2.m99530d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            if (!z) {
                bool = Boolean.FALSE;
            } else {
                throw e;
            }
        }
        if (bool == null) {
            C33928Jx2.m99522l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
