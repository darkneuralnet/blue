package p000;

import android.os.Build;
import android.util.Size;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
/* renamed from: yh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52349yh1 implements InterfaceC35865Se4 {
    /* renamed from: j */
    public static boolean m2904j() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m2903k() {
        if ("OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m2902l() {
        if ("OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m2901m() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if ("SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m2900n() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if ("SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m2899o() {
        if (!m2903k() && !m2902l() && !m2904j() && !m2900n() && !m2901m()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public List<Size> m2910d(String str, int i) {
        if (m2903k()) {
            return m2908f(str, i);
        }
        if (m2902l()) {
            return m2907g(str, i);
        }
        if (m2904j()) {
            return m2909e(str, i, null);
        }
        if (m2900n()) {
            return m2905i(str, i, null);
        }
        if (m2901m()) {
            return m2906h(str, i, null);
        }
        C33928Jx2.m99522l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    /* renamed from: e */
    public final List<Size> m2909e(String str, int i, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<Size> m2908f(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List<Size> m2907g(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<Size> m2906h(String str, int i, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i != 34 && cls == null) {
                if (i == 35) {
                    arrayList.add(new Size(2048, 1536));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, 1080));
                }
            } else {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, DateTimeConstants.MINUTES_PER_DAY));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List<Size> m2905i(String str, int i, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i != 34 && cls == null) {
                if (i == 35) {
                    arrayList.add(new Size(4128, 2322));
                    arrayList.add(new Size(3088, 3088));
                    arrayList.add(new Size(3264, 2448));
                    arrayList.add(new Size(3264, 1836));
                    arrayList.add(new Size(2048, 1536));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, 1080));
                }
            } else {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }
}
