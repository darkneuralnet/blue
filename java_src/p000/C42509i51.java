package p000;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
/* renamed from: i51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42509i51 {

    /* renamed from: d */
    public static final Size f86710d = new Size(1920, 1080);

    /* renamed from: e */
    public static final Object f86711e = new Object();

    /* renamed from: f */
    public static volatile C42509i51 f86712f;

    /* renamed from: a */
    public final DisplayManager f86713a;

    /* renamed from: b */
    public volatile Size f86714b = null;

    /* renamed from: c */
    public final C39722dO2 f86715c = new C39722dO2();

    public C42509i51(Context context) {
        this.f86713a = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: b */
    public static C42509i51 m34487b(Context context) {
        if (f86712f == null) {
            synchronized (f86711e) {
                if (f86712f == null) {
                    f86712f = new C42509i51(context);
                }
            }
        }
        return f86712f;
    }

    /* renamed from: a */
    public final Size m34488a() {
        Size size;
        Point point = new Point();
        m34486c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f86710d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f86715c.m44320a(size);
    }

    /* renamed from: c */
    public Display m34486c() {
        Display[] displays = this.f86713a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        int i = -1;
        Display display = null;
        int i2 = -1;
        Display display2 = null;
        for (Display display3 : displays) {
            if (display3.getState() != 1) {
                Point point = new Point();
                display3.getRealSize(point);
                int i3 = point.x;
                int i4 = point.y;
                if (i3 * i4 > i2) {
                    i2 = i3 * i4;
                    display2 = display3;
                }
            }
        }
        if (display2 == null) {
            for (Display display4 : displays) {
                Point point2 = new Point();
                display4.getRealSize(point2);
                int i5 = point2.x;
                int i6 = point2.y;
                if (i5 * i6 > i) {
                    display = display4;
                    i = i5 * i6;
                }
            }
            if (display != null) {
                return display;
            }
            throw new IllegalArgumentException("No display can be found from the input display manager!");
        }
        return display2;
    }

    /* renamed from: d */
    public Size m34485d() {
        if (this.f86714b != null) {
            return this.f86714b;
        }
        this.f86714b = m34488a();
        return this.f86714b;
    }

    /* renamed from: e */
    public void m34484e() {
        this.f86714b = m34488a();
    }
}
