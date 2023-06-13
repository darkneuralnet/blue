package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: t96  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49076t96 {

    /* renamed from: a */
    public static final Paint f109957a = new Paint(6);

    /* renamed from: b */
    public static final Paint f109958b = new Paint(7);

    /* renamed from: c */
    public static final Paint f109959c;

    /* renamed from: d */
    public static final Set<String> f109960d;

    /* renamed from: e */
    public static final Lock f109961e;

    /* renamed from: t96$a  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class locksLockC28539a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        Lock lockslockc28539a;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f109960d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lockslockc28539a = new ReentrantLock();
        } else {
            lockslockc28539a = new locksLockC28539a();
        }
        f109961e = lockslockc28539a;
        Paint paint = new Paint(7);
        f109959c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private C49076t96() {
    }

    /* renamed from: a */
    public static void m12991a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f109961e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f109957a);
            m12988d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f109961e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m12990b(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap mo16192d = interfaceC20044eU.mo16192d(i, i2, m12984h(bitmap));
        m12980l(bitmap, mo16192d);
        m12991a(bitmap, mo16192d, matrix);
        return mo16192d;
    }

    /* renamed from: c */
    public static Bitmap m12989c(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return m12987e(interfaceC20044eU, bitmap, i, i2);
    }

    /* renamed from: d */
    public static void m12988d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: e */
    public static Bitmap m12987e(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap mo16192d = interfaceC20044eU.mo16192d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), m12984h(bitmap));
        m12980l(bitmap, mo16192d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + mo16192d.getWidth() + "x" + mo16192d.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m12991a(bitmap, mo16192d, matrix);
        return mo16192d;
    }

    /* renamed from: f */
    public static Lock m12986f() {
        return f109961e;
    }

    /* renamed from: g */
    public static int m12985g(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    public static Bitmap.Config m12984h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: i */
    public static void m12983i(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: j */
    public static boolean m12982j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: k */
    public static Bitmap m12981k(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i) {
        if (!m12982j(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m12983i(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap mo16192d = interfaceC20044eU.mo16192d(Math.round(rectF.width()), Math.round(rectF.height()), m12984h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        mo16192d.setHasAlpha(bitmap.hasAlpha());
        m12991a(bitmap, mo16192d, matrix);
        return mo16192d;
    }

    /* renamed from: l */
    public static void m12980l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
