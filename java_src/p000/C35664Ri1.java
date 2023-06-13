package p000;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.DV5;
/* renamed from: Ri1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35664Ri1 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final Map<String, Range<Integer>> f32453a;

    /* renamed from: Ri1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C7245a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32454a;

        static {
            int[] iArr = new int[DV5.EnumC1500b.values().length];
            f32454a = iArr;
            try {
                iArr[DV5.EnumC1500b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32454a[DV5.EnumC1500b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32454a[DV5.EnumC1500b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f32453a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    /* renamed from: e */
    public static boolean m86430e() {
        boolean z;
        if ("samsung".equalsIgnoreCase(Build.BRAND) && f32453a.containsKey(Build.MODEL.toUpperCase(Locale.US))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Range<Integer> range = f32453a.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((Range<Integer>) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: f */
    public static boolean m86429f() {
        return m86430e();
    }

    /* renamed from: d */
    public Size m86431d(DV5.EnumC1500b enumC1500b) {
        if (!m86430e()) {
            return null;
        }
        int i = C7245a.f32454a[enumC1500b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new Size(3264, 1836);
            }
            return new Size(1280, 720);
        }
        return new Size(1920, 1080);
    }
}
