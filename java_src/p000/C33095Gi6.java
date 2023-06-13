package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
/* renamed from: Gi6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33095Gi6 {

    /* renamed from: a */
    public static final ThreadLocal<PathMeasure> f12287a = new C2918a();

    /* renamed from: b */
    public static final ThreadLocal<Path> f12288b = new C2919b();

    /* renamed from: c */
    public static final ThreadLocal<Path> f12289c = new C2920c();

    /* renamed from: d */
    public static final ThreadLocal<float[]> f12290d = new C2921d();

    /* renamed from: e */
    public static final float f12291e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: Gi6$a */
    /* loaded from: classes2.dex */
    public class C2918a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: Gi6$b */
    /* loaded from: classes2.dex */
    public class C2919b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: Gi6$c */
    /* loaded from: classes2.dex */
    public class C2920c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: Gi6$d */
    /* loaded from: classes2.dex */
    public class C2921d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    private C33095Gi6() {
    }

    /* renamed from: a */
    public static void m104871a(Path path, float f, float f2, float f3) {
        C32416Dl2.m109978a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f12287a.get();
        Path path2 = f12288b.get();
        Path path3 = f12289c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C32416Dl2.m109977b("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = C48077rU2.m15914f(min, length);
                max = C48077rU2.m15914f(max, length);
            }
            if (min < 0.0f) {
                min = C48077rU2.m15914f(min, length);
            }
            if (max < 0.0f) {
                max = C48077rU2.m15914f(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C32416Dl2.m109977b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C32416Dl2.m109977b("applyTrimPathIfNeeded");
        } else {
            C32416Dl2.m109977b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m104870b(Path path, C51691xa6 c51691xa6) {
        if (c51691xa6 != null && !c51691xa6.m4984k()) {
            m104871a(path, ((C46551ou1) c51691xa6.m4986i()).m20303p() / 100.0f, ((C46551ou1) c51691xa6.m4990c()).m20303p() / 100.0f, ((C46551ou1) c51691xa6.m4987h()).m20303p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m104869c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m104868d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: e */
    public static float m104867e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: f */
    public static float m104866f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m104865g(Matrix matrix) {
        float[] fArr = f12290d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f12291e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: h */
    public static boolean m104864h(Matrix matrix) {
        float[] fArr = f12290d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static int m104863i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: j */
    public static boolean m104862j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m104861k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m104860l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m104859m(Canvas canvas, RectF rectF, Paint paint) {
        m104858n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m104858n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C32416Dl2.m109978a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C32416Dl2.m109977b("Utils#saveLayer");
    }
}
