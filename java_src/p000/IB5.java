package p000;

import android.util.Size;
import org.joda.time.DateTimeConstants;
/* renamed from: IB5 */
/* loaded from: classes.dex */
public final class IB5 {

    /* renamed from: a */
    public static final Size f14641a = new Size(0, 0);

    /* renamed from: b */
    public static final Size f14642b = new Size(320, 240);

    /* renamed from: c */
    public static final Size f14643c = new Size(640, 480);

    /* renamed from: d */
    public static final Size f14644d = new Size(720, 480);

    /* renamed from: e */
    public static final Size f14645e = new Size(1280, 720);

    /* renamed from: f */
    public static final Size f14646f = new Size(1920, 1080);

    /* renamed from: g */
    public static final Size f14647g = new Size(1920, DateTimeConstants.MINUTES_PER_DAY);

    private IB5() {
    }

    /* renamed from: a */
    public static int m102817a(Size size) {
        return size.getWidth() * size.getHeight();
    }

    /* renamed from: b */
    public static boolean m102816b(Size size, Size size2) {
        if (size.getWidth() <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
            return false;
        }
        return true;
    }
}
