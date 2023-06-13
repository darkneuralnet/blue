package p000;

import android.os.Build;
import android.util.Size;
import org.joda.time.DateTimeConstants;
/* renamed from: Ti1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36132Ti1 implements InterfaceC35865Se4 {
    /* renamed from: f */
    public static boolean m83139f() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m83138g() {
        return m83139f();
    }

    /* renamed from: d */
    public Size[] m83141d(int i) {
        if (i == 34 && m83139f()) {
            return m83140e();
        }
        return new Size[0];
    }

    /* renamed from: e */
    public final Size[] m83140e() {
        return new Size[]{new Size(1920, 1080), new Size(DateTimeConstants.MINUTES_PER_DAY, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
    }
}
