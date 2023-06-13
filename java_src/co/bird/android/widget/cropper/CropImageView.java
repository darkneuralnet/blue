package co.bird.android.widget.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import co.bird.android.widget.cropper.AsyncTaskC16651a;
import co.bird.android.widget.cropper.AsyncTaskC16653b;
import co.bird.android.widget.cropper.C16655c;
import co.bird.android.widget.cropper.CropOverlayView;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* loaded from: classes4.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: A */
    public float f67858A;

    /* renamed from: B */
    public float f67859B;

    /* renamed from: C */
    public float f67860C;

    /* renamed from: D */
    public RectF f67861D;

    /* renamed from: E */
    public int f67862E;

    /* renamed from: F */
    public boolean f67863F;

    /* renamed from: G */
    public Uri f67864G;

    /* renamed from: H */
    public WeakReference<AsyncTaskC16653b> f67865H;

    /* renamed from: I */
    public WeakReference<AsyncTaskC16651a> f67866I;

    /* renamed from: b */
    public final ImageView f67867b;

    /* renamed from: c */
    public final CropOverlayView f67868c;

    /* renamed from: d */
    public final Matrix f67869d;

    /* renamed from: e */
    public final Matrix f67870e;

    /* renamed from: f */
    public final ProgressBar f67871f;

    /* renamed from: g */
    public final float[] f67872g;

    /* renamed from: h */
    public ME0 f67873h;

    /* renamed from: i */
    public Bitmap f67874i;

    /* renamed from: j */
    public int f67875j;

    /* renamed from: k */
    public int f67876k;

    /* renamed from: l */
    public boolean f67877l;

    /* renamed from: m */
    public boolean f67878m;

    /* renamed from: n */
    public int f67879n;

    /* renamed from: o */
    public int f67880o;

    /* renamed from: p */
    public int f67881p;

    /* renamed from: q */
    public EnumC16648i f67882q;

    /* renamed from: r */
    public boolean f67883r;

    /* renamed from: s */
    public boolean f67884s;

    /* renamed from: t */
    public boolean f67885t;

    /* renamed from: u */
    public boolean f67886u;

    /* renamed from: v */
    public int f67887v;

    /* renamed from: w */
    public InterfaceC16646g f67888w;

    /* renamed from: x */
    public InterfaceC16644e f67889x;

    /* renamed from: y */
    public Uri f67890y;

    /* renamed from: z */
    public int f67891z;

    /* renamed from: co.bird.android.widget.cropper.CropImageView$a */
    /* loaded from: classes4.dex */
    public class C16640a implements CropOverlayView.InterfaceC16649a {
        public C16640a() {
        }

        @Override // co.bird.android.widget.cropper.CropOverlayView.InterfaceC16649a
        /* renamed from: a */
        public void mo54127a(boolean z) {
            CropImageView.this.m54176m(z, true);
            CropImageView.this.getClass();
        }
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$b */
    /* loaded from: classes4.dex */
    public static class C16641b {

        /* renamed from: b */
        public final Bitmap f67893b;

        /* renamed from: c */
        public final Uri f67894c;

        /* renamed from: d */
        public final Bitmap f67895d;

        /* renamed from: e */
        public final Uri f67896e;

        /* renamed from: f */
        public final Exception f67897f;

        /* renamed from: g */
        public final float[] f67898g;

        /* renamed from: h */
        public final Rect f67899h;

        /* renamed from: i */
        public final Rect f67900i;

        /* renamed from: j */
        public final int f67901j;

        /* renamed from: k */
        public final int f67902k;

        public C16641b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f67893b = bitmap;
            this.f67894c = uri;
            this.f67895d = bitmap2;
            this.f67896e = uri2;
            this.f67897f = exc;
            this.f67898g = fArr;
            this.f67899h = rect;
            this.f67900i = rect2;
            this.f67901j = i;
            this.f67902k = i2;
        }

        /* renamed from: a */
        public float[] m54165a() {
            return this.f67898g;
        }

        /* renamed from: b */
        public Rect m54164b() {
            return this.f67899h;
        }

        /* renamed from: c */
        public Exception m54163c() {
            return this.f67897f;
        }

        /* renamed from: d */
        public Uri m54162d() {
            return this.f67894c;
        }

        /* renamed from: e */
        public int m54161e() {
            return this.f67901j;
        }

        /* renamed from: g */
        public int m54160g() {
            return this.f67902k;
        }

        /* renamed from: h */
        public Uri m54159h() {
            return this.f67896e;
        }

        /* renamed from: i */
        public Rect m54158i() {
            return this.f67900i;
        }
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$c */
    /* loaded from: classes4.dex */
    public enum EnumC16642c {
        RECTANGLE,
        OVAL
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$d */
    /* loaded from: classes4.dex */
    public enum EnumC16643d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC16644e {
        /* renamed from: e */
        void mo54155e(CropImageView cropImageView, C16641b c16641b);
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$f */
    /* loaded from: classes4.dex */
    public interface InterfaceC16645f {
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$g */
    /* loaded from: classes4.dex */
    public interface InterfaceC16646g {
        /* renamed from: j */
        void mo54154j(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$h */
    /* loaded from: classes4.dex */
    public enum EnumC16647h {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* renamed from: co.bird.android.widget.cropper.CropImageView$i */
    /* loaded from: classes4.dex */
    public enum EnumC16648i {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    /* renamed from: j */
    public static int m54179j(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: c */
    public final void m54186c(float f, float f2, boolean z, boolean z2) {
        float f3;
        float f4;
        float max;
        if (this.f67874i != null) {
            float f5 = 0.0f;
            if (f > 0.0f && f2 > 0.0f) {
                this.f67869d.invert(this.f67870e);
                RectF m54139m = this.f67868c.m54139m();
                this.f67870e.mapRect(m54139m);
                this.f67869d.reset();
                this.f67869d.postTranslate((f - this.f67874i.getWidth()) / 2.0f, (f2 - this.f67874i.getHeight()) / 2.0f);
                m54175n();
                int i = this.f67876k;
                if (i > 0) {
                    this.f67869d.postRotate(i, C16655c.m54101q(this.f67872g), C16655c.m54100r(this.f67872g));
                    m54175n();
                }
                float min = Math.min(f / C16655c.m54094x(this.f67872g), f2 / C16655c.m54098t(this.f67872g));
                EnumC16648i enumC16648i = this.f67882q;
                if (enumC16648i == EnumC16648i.FIT_CENTER || ((enumC16648i == EnumC16648i.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f67886u))) {
                    this.f67869d.postScale(min, min, C16655c.m54101q(this.f67872g), C16655c.m54100r(this.f67872g));
                    m54175n();
                }
                if (this.f67877l) {
                    f3 = -this.f67858A;
                } else {
                    f3 = this.f67858A;
                }
                if (this.f67878m) {
                    f4 = -this.f67858A;
                } else {
                    f4 = this.f67858A;
                }
                this.f67869d.postScale(f3, f4, C16655c.m54101q(this.f67872g), C16655c.m54100r(this.f67872g));
                m54175n();
                this.f67869d.mapRect(m54139m);
                if (z) {
                    if (f > C16655c.m54094x(this.f67872g)) {
                        max = 0.0f;
                    } else {
                        max = Math.max(Math.min((f / 2.0f) - m54139m.centerX(), -C16655c.m54097u(this.f67872g)), getWidth() - C16655c.m54096v(this.f67872g)) / f3;
                    }
                    this.f67859B = max;
                    if (f2 <= C16655c.m54098t(this.f67872g)) {
                        f5 = Math.max(Math.min((f2 / 2.0f) - m54139m.centerY(), -C16655c.m54095w(this.f67872g)), getHeight() - C16655c.m54102p(this.f67872g)) / f4;
                    }
                    this.f67860C = f5;
                } else {
                    this.f67859B = Math.min(Math.max(this.f67859B * f3, -m54139m.left), (-m54139m.right) + f) / f3;
                    this.f67860C = Math.min(Math.max(this.f67860C * f4, -m54139m.top), (-m54139m.bottom) + f2) / f4;
                }
                this.f67869d.postTranslate(this.f67859B * f3, this.f67860C * f4);
                m54139m.offset(this.f67859B * f3, this.f67860C * f4);
                this.f67868c.setCropWindowRect(m54139m);
                m54175n();
                this.f67868c.invalidate();
                if (z2) {
                    this.f67873h.m95483d(this.f67872g, this.f67869d);
                    this.f67867b.startAnimation(this.f67873h);
                } else {
                    this.f67867b.setImageMatrix(this.f67869d);
                }
                m54166w(false);
            }
        }
    }

    /* renamed from: d */
    public final void m54185d() {
        Bitmap bitmap = this.f67874i;
        if (bitmap != null && (this.f67881p > 0 || this.f67890y != null)) {
            bitmap.recycle();
        }
        this.f67874i = null;
        this.f67881p = 0;
        this.f67890y = null;
        this.f67891z = 1;
        this.f67876k = 0;
        this.f67858A = 1.0f;
        this.f67859B = 0.0f;
        this.f67860C = 0.0f;
        this.f67869d.reset();
        this.f67864G = null;
        this.f67867b.setImageBitmap(null);
        m54169t();
    }

    /* renamed from: e */
    public void m54184e() {
        this.f67877l = !this.f67877l;
        m54186c(getWidth(), getHeight(), true, false);
    }

    /* renamed from: f */
    public void m54183f() {
        this.f67878m = !this.f67878m;
        m54186c(getWidth(), getHeight(), true, false);
    }

    /* renamed from: g */
    public float[] m54182g() {
        RectF m54139m = this.f67868c.m54139m();
        float[] fArr = new float[8];
        float f = m54139m.left;
        fArr[0] = f;
        float f2 = m54139m.top;
        fArr[1] = f2;
        float f3 = m54139m.right;
        fArr[2] = f3;
        fArr[3] = f2;
        fArr[4] = f3;
        float f4 = m54139m.bottom;
        fArr[5] = f4;
        fArr[6] = f;
        fArr[7] = f4;
        this.f67869d.invert(this.f67870e);
        this.f67870e.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * this.f67891z;
        }
        return fArr;
    }

    /* renamed from: h */
    public Rect m54181h() {
        if (this.f67874i != null) {
            return C16655c.m54099s(m54182g(), this.f67891z * this.f67874i.getWidth(), this.f67891z * this.f67874i.getHeight(), this.f67868c.m54134r(), this.f67868c.m54142j(), this.f67868c.m54141k());
        }
        return null;
    }

    /* renamed from: i */
    public Uri m54180i() {
        return this.f67890y;
    }

    /* renamed from: k */
    public int m54178k() {
        return this.f67876k;
    }

    /* renamed from: l */
    public Rect m54177l() {
        return new Rect(0, 0, this.f67874i.getWidth() * this.f67891z, this.f67874i.getHeight() * this.f67891z);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54176m(boolean z, boolean z2) {
        float f;
        int width = getWidth();
        int height = getHeight();
        if (this.f67874i != null && width > 0 && height > 0) {
            RectF m54139m = this.f67868c.m54139m();
            if (z) {
                if (m54139m.left < 0.0f || m54139m.top < 0.0f || m54139m.right > width || m54139m.bottom > height) {
                    m54186c(width, height, false, false);
                    return;
                }
                return;
            }
            float f2 = 1.0f;
            if (this.f67886u || this.f67858A > 1.0f) {
                if (this.f67858A < this.f67887v) {
                    float f3 = width;
                    if (m54139m.width() < f3 * 0.5f) {
                        float f4 = height;
                        if (m54139m.height() < 0.5f * f4) {
                            f = Math.min(this.f67887v, Math.min(f3 / ((m54139m.width() / this.f67858A) / 0.64f), f4 / ((m54139m.height() / this.f67858A) / 0.64f)));
                            if (this.f67858A > 1.0f) {
                                float f5 = width;
                                if (m54139m.width() > f5 * 0.65f || m54139m.height() > height * 0.65f) {
                                    f = Math.max(1.0f, Math.min(f5 / ((m54139m.width() / this.f67858A) / 0.51f), height / ((m54139m.height() / this.f67858A) / 0.51f)));
                                }
                            }
                            if (this.f67886u) {
                                f2 = f;
                            }
                            if (f2 <= 0.0f && f2 != this.f67858A) {
                                if (z2) {
                                    if (this.f67873h == null) {
                                        this.f67873h = new ME0(this.f67867b, this.f67868c);
                                    }
                                    this.f67873h.m95482e(this.f67872g, this.f67869d);
                                }
                                this.f67858A = f2;
                                m54186c(width, height, true, z2);
                                return;
                            }
                        }
                    }
                }
                f = 0.0f;
                if (this.f67858A > 1.0f) {
                }
                if (this.f67886u) {
                }
                if (f2 <= 0.0f) {
                }
            }
        }
    }

    /* renamed from: n */
    public final void m54175n() {
        float[] fArr = this.f67872g;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.f67874i.getWidth();
        float[] fArr2 = this.f67872g;
        fArr2[3] = 0.0f;
        fArr2[4] = this.f67874i.getWidth();
        this.f67872g[5] = this.f67874i.getHeight();
        float[] fArr3 = this.f67872g;
        fArr3[6] = 0.0f;
        fArr3[7] = this.f67874i.getHeight();
        this.f67869d.mapPoints(this.f67872g);
    }

    /* renamed from: o */
    public void m54174o(AsyncTaskC16651a.C16652a c16652a) {
        this.f67866I = null;
        m54168u();
        InterfaceC16644e interfaceC16644e = this.f67889x;
        if (interfaceC16644e != null) {
            interfaceC16644e.mo54155e(this, new C16641b(this.f67874i, this.f67890y, c16652a.f67969a, c16652a.f67970b, c16652a.f67971c, m54182g(), m54181h(), m54177l(), m54178k(), c16652a.f67973e));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f67879n > 0 && this.f67880o > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.f67879n;
            layoutParams.height = this.f67880o;
            setLayoutParams(layoutParams);
            if (this.f67874i != null) {
                float f = i3 - i;
                float f2 = i4 - i2;
                m54186c(f, f2, true, false);
                if (this.f67861D != null) {
                    int i5 = this.f67862E;
                    if (i5 != this.f67875j) {
                        this.f67876k = i5;
                        m54186c(f, f2, true, false);
                    }
                    this.f67869d.mapRect(this.f67861D);
                    this.f67868c.setCropWindowRect(this.f67861D);
                    m54176m(false, false);
                    this.f67868c.m54143i();
                    this.f67861D = null;
                    return;
                } else if (this.f67863F) {
                    this.f67863F = false;
                    m54176m(false, false);
                    return;
                } else {
                    return;
                }
            }
            m54166w(true);
            return;
        }
        m54166w(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        double d;
        double d2;
        int width;
        int i3;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f67874i;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.f67874i.getWidth()) {
                d = size / this.f67874i.getWidth();
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.f67874i.getHeight()) {
                d2 = size2 / this.f67874i.getHeight();
            } else {
                d2 = Double.POSITIVE_INFINITY;
            }
            if (d == Double.POSITIVE_INFINITY && d2 == Double.POSITIVE_INFINITY) {
                width = this.f67874i.getWidth();
                i3 = this.f67874i.getHeight();
            } else if (d <= d2) {
                i3 = (int) (this.f67874i.getHeight() * d);
                width = size;
            } else {
                width = (int) (this.f67874i.getWidth() * d2);
                i3 = size2;
            }
            int m54179j = m54179j(mode, size, width);
            int m54179j2 = m54179j(mode2, size2, i3);
            this.f67879n = m54179j;
            this.f67880o = m54179j2;
            setMeasuredDimension(m54179j, m54179j2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bitmap bitmap;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f67865H == null && this.f67890y == null && this.f67874i == null && this.f67881p == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = C16655c.f67989f;
                        if (pair != null && ((String) pair.first).equals(string)) {
                            bitmap = (Bitmap) ((WeakReference) C16655c.f67989f.second).get();
                        } else {
                            bitmap = null;
                        }
                        C16655c.f67989f = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            m54170s(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f67890y == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i2 = bundle.getInt("DEGREES_ROTATED");
                this.f67862E = i2;
                this.f67876k = i2;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.f67868c.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.f67861D = rectF;
                }
                this.f67868c.setCropShape(EnumC16642c.valueOf(bundle.getString("CROP_SHAPE")));
                this.f67886u = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f67887v = bundle.getInt("CROP_MAX_ZOOM");
                this.f67877l = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f67878m = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        AsyncTaskC16653b asyncTaskC16653b;
        if (this.f67890y == null && this.f67874i == null && this.f67881p < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f67890y;
        if (this.f67883r && uri == null && this.f67881p < 1) {
            uri = C16655c.m54118D(getContext(), this.f67874i, this.f67864G);
            this.f67864G = uri;
        }
        if (uri != null && this.f67874i != null) {
            String uuid = UUID.randomUUID().toString();
            C16655c.f67989f = new Pair<>(uuid, new WeakReference(this.f67874i));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<AsyncTaskC16653b> weakReference = this.f67865H;
        if (weakReference != null && (asyncTaskC16653b = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", asyncTaskC16653b.m54123b());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f67881p);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f67891z);
        bundle.putInt("DEGREES_ROTATED", this.f67876k);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f67868c.m54138n());
        RectF rectF = C16655c.f67986c;
        rectF.set(this.f67868c.m54139m());
        this.f67869d.invert(this.f67870e);
        this.f67870e.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f67868c.m54140l().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f67886u);
        bundle.putInt("CROP_MAX_ZOOM", this.f67887v);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f67877l);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f67878m);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 > 0 && i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f67863F = z;
    }

    /* renamed from: p */
    public void m54173p(AsyncTaskC16653b.C16654a c16654a) {
        this.f67865H = null;
        m54168u();
        if (c16654a.f67983e == null) {
            int i = c16654a.f67982d;
            this.f67875j = i;
            m54170s(c16654a.f67980b, 0, c16654a.f67979a, c16654a.f67981c, i);
        }
        InterfaceC16646g interfaceC16646g = this.f67888w;
        if (interfaceC16646g != null) {
            interfaceC16646g.mo54154j(this, c16654a.f67979a, c16654a.f67983e);
        }
    }

    /* renamed from: q */
    public void m54172q(int i) {
        int i2;
        boolean z;
        float width;
        float height;
        if (this.f67874i != null) {
            if (i < 0) {
                i2 = (i % 360) + 360;
            } else {
                i2 = i % 360;
            }
            if (!this.f67868c.m54134r() && ((i2 > 45 && i2 < 135) || (i2 > 215 && i2 < 305))) {
                z = true;
            } else {
                z = false;
            }
            RectF rectF = C16655c.f67986c;
            rectF.set(this.f67868c.m54139m());
            if (z) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            float f = width / 2.0f;
            if (z) {
                height = rectF.width();
            } else {
                height = rectF.height();
            }
            float f2 = height / 2.0f;
            if (z) {
                boolean z2 = this.f67877l;
                this.f67877l = this.f67878m;
                this.f67878m = z2;
            }
            this.f67869d.invert(this.f67870e);
            float[] fArr = C16655c.f67987d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f67870e.mapPoints(fArr);
            this.f67876k = (this.f67876k + i2) % 360;
            m54186c(getWidth(), getHeight(), true, false);
            Matrix matrix = this.f67869d;
            float[] fArr2 = C16655c.f67988e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (this.f67858A / Math.sqrt(Math.pow(fArr2[4] - fArr2[2], 2.0d) + Math.pow(fArr2[5] - fArr2[3], 2.0d)));
            this.f67858A = sqrt;
            this.f67858A = Math.max(sqrt, 1.0f);
            m54186c(getWidth(), getHeight(), true, false);
            this.f67869d.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow(fArr2[4] - fArr2[2], 2.0d) + Math.pow(fArr2[5] - fArr2[3], 2.0d));
            float f3 = (float) (f * sqrt2);
            float f4 = (float) (f2 * sqrt2);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            rectF.set(f5 - f3, f6 - f4, f5 + f3, f6 + f4);
            this.f67868c.m54129w();
            this.f67868c.setCropWindowRect(rectF);
            m54186c(getWidth(), getHeight(), true, false);
            m54176m(false, false);
            this.f67868c.m54143i();
        }
    }

    /* renamed from: r */
    public void m54171r(Uri uri, Bitmap.CompressFormat compressFormat, int i, int i2, int i3, EnumC16647h enumC16647h) {
        if (this.f67889x != null) {
            m54167v(i2, i3, enumC16647h, uri, compressFormat, i);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* renamed from: s */
    public final void m54170s(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f67874i;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f67867b.clearAnimation();
            m54185d();
            this.f67874i = bitmap;
            this.f67867b.setImageBitmap(bitmap);
            this.f67890y = uri;
            this.f67881p = i;
            this.f67891z = i2;
            this.f67876k = i3;
            m54186c(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f67868c;
            if (cropOverlayView != null) {
                cropOverlayView.m54129w();
                m54169t();
            }
        }
    }

    public void setAspectRatio(int i, int i2) {
        this.f67868c.setAspectRatioX(i);
        this.f67868c.setAspectRatioY(i2);
        setFixedAspectRatio(true);
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f67886u != z) {
            this.f67886u = z;
            m54176m(false, false);
            this.f67868c.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f67868c.setInitialCropWindowRect(rect);
    }

    public void setCropShape(EnumC16642c enumC16642c) {
        this.f67868c.setCropShape(enumC16642c);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f67868c.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f67877l != z) {
            this.f67877l = z;
            m54186c(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f67878m != z) {
            this.f67878m = z;
            m54186c(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(EnumC16643d enumC16643d) {
        this.f67868c.setGuidelines(enumC16643d);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f67868c.setInitialCropWindowRect(null);
        m54170s(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f67868c.setInitialCropWindowRect(null);
            m54170s(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        AsyncTaskC16653b asyncTaskC16653b;
        if (uri != null) {
            WeakReference<AsyncTaskC16653b> weakReference = this.f67865H;
            if (weakReference != null) {
                asyncTaskC16653b = weakReference.get();
            } else {
                asyncTaskC16653b = null;
            }
            if (asyncTaskC16653b != null) {
                asyncTaskC16653b.cancel(true);
            }
            m54185d();
            this.f67861D = null;
            this.f67862E = 0;
            this.f67868c.setInitialCropWindowRect(null);
            WeakReference<AsyncTaskC16653b> weakReference2 = new WeakReference<>(new AsyncTaskC16653b(this, uri));
            this.f67865H = weakReference2;
            weakReference2.get().execute(new Void[0]);
            m54168u();
        }
    }

    public void setMaxCropResultSize(int i, int i2) {
        this.f67868c.setMaxCropResultSize(i, i2);
    }

    public void setMaxZoom(int i) {
        if (this.f67887v != i && i > 0) {
            this.f67887v = i;
            m54176m(false, false);
            this.f67868c.invalidate();
        }
    }

    public void setMinCropResultSize(int i, int i2) {
        this.f67868c.setMinCropResultSize(i, i2);
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f67868c.m54128x(z)) {
            m54176m(false, false);
            this.f67868c.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(InterfaceC16644e interfaceC16644e) {
        this.f67889x = interfaceC16644e;
    }

    public void setOnSetCropOverlayReleasedListener(InterfaceC16645f interfaceC16645f) {
    }

    public void setOnSetImageUriCompleteListener(InterfaceC16646g interfaceC16646g) {
        this.f67888w = interfaceC16646g;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f67876k;
        if (i2 != i) {
            m54172q(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f67883r = z;
    }

    public void setScaleType(EnumC16648i enumC16648i) {
        if (enumC16648i != this.f67882q) {
            this.f67882q = enumC16648i;
            this.f67858A = 1.0f;
            this.f67860C = 0.0f;
            this.f67859B = 0.0f;
            this.f67868c.m54129w();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f67884s != z) {
            this.f67884s = z;
            m54169t();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f67885t != z) {
            this.f67885t = z;
            m54168u();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f67868c.setSnapRadius(f);
        }
    }

    /* renamed from: t */
    public final void m54169t() {
        int i;
        CropOverlayView cropOverlayView = this.f67868c;
        if (cropOverlayView != null) {
            if (this.f67884s && this.f67874i != null) {
                i = 0;
            } else {
                i = 4;
            }
            cropOverlayView.setVisibility(i);
        }
    }

    /* renamed from: u */
    public final void m54168u() {
        boolean z;
        int i = 0;
        if (this.f67885t && ((this.f67874i == null && this.f67865H != null) || this.f67866I != null)) {
            z = true;
        } else {
            z = false;
        }
        ProgressBar progressBar = this.f67871f;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: v */
    public void m54167v(int i, int i2, EnumC16647h enumC16647h, Uri uri, Bitmap.CompressFormat compressFormat, int i3) {
        AsyncTaskC16651a asyncTaskC16651a;
        int i4;
        int i5;
        CropImageView cropImageView;
        if (this.f67874i != null) {
            this.f67867b.clearAnimation();
            WeakReference<AsyncTaskC16651a> weakReference = this.f67866I;
            if (weakReference != null) {
                asyncTaskC16651a = weakReference.get();
            } else {
                asyncTaskC16651a = null;
            }
            if (asyncTaskC16651a != null) {
                asyncTaskC16651a.cancel(true);
            }
            EnumC16647h enumC16647h2 = EnumC16647h.NONE;
            if (enumC16647h != enumC16647h2) {
                i4 = i;
            } else {
                i4 = 0;
            }
            if (enumC16647h != enumC16647h2) {
                i5 = i2;
            } else {
                i5 = 0;
            }
            int width = this.f67874i.getWidth() * this.f67891z;
            int height = this.f67874i.getHeight();
            int i6 = this.f67891z;
            int i7 = height * i6;
            if (this.f67890y != null && (i6 > 1 || enumC16647h == EnumC16647h.SAMPLING)) {
                this.f67866I = new WeakReference<>(new AsyncTaskC16651a(this, this.f67890y, m54182g(), this.f67876k, width, i7, this.f67868c.m54134r(), this.f67868c.m54142j(), this.f67868c.m54141k(), i4, i5, this.f67877l, this.f67878m, enumC16647h, uri, compressFormat, i3));
                cropImageView = this;
            } else {
                cropImageView = this;
                cropImageView.f67866I = new WeakReference<>(new AsyncTaskC16651a(this, this.f67874i, m54182g(), this.f67876k, this.f67868c.m54134r(), this.f67868c.m54142j(), this.f67868c.m54141k(), i4, i5, this.f67877l, this.f67878m, enumC16647h, uri, compressFormat, i3));
            }
            cropImageView.f67866I.get().execute(new Void[0]);
            m54168u();
        }
    }

    /* renamed from: w */
    public final void m54166w(boolean z) {
        float[] fArr;
        Bitmap bitmap = this.f67874i;
        if (bitmap != null && !z) {
            this.f67868c.setCropWindowLimits(getWidth(), getHeight(), (bitmap.getWidth() * this.f67891z) / C16655c.m54094x(this.f67872g), (this.f67874i.getHeight() * this.f67891z) / C16655c.m54098t(this.f67872g));
        }
        CropOverlayView cropOverlayView = this.f67868c;
        if (z) {
            fArr = null;
        } else {
            fArr = this.f67872g;
        }
        cropOverlayView.setBounds(fArr, getWidth(), getHeight());
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Bundle bundleExtra;
        this.f67869d = new Matrix();
        this.f67870e = new Matrix();
        this.f67872g = new float[8];
        this.f67883r = false;
        this.f67884s = true;
        this.f67885t = true;
        this.f67886u = true;
        this.f67891z = 1;
        this.f67858A = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("bundle")) != null) {
            cropImageOptions = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C34758Nl4.CropImageView, 0, 0);
                try {
                    int i = C34758Nl4.CropImageView_cropFixAspectRatio;
                    cropImageOptions.f67844m = obtainStyledAttributes.getBoolean(i, cropImageOptions.f67844m);
                    int i2 = C34758Nl4.CropImageView_cropAspectRatioX;
                    cropImageOptions.f67845n = obtainStyledAttributes.getInteger(i2, cropImageOptions.f67845n);
                    cropImageOptions.f67846o = obtainStyledAttributes.getInteger(C34758Nl4.CropImageView_cropAspectRatioY, cropImageOptions.f67846o);
                    cropImageOptions.f67837f = EnumC16648i.values()[obtainStyledAttributes.getInt(C34758Nl4.CropImageView_cropScaleType, cropImageOptions.f67837f.ordinal())];
                    cropImageOptions.f67840i = obtainStyledAttributes.getBoolean(C34758Nl4.CropImageView_cropAutoZoomEnabled, cropImageOptions.f67840i);
                    cropImageOptions.f67841j = obtainStyledAttributes.getBoolean(C34758Nl4.CropImageView_cropMultiTouchEnabled, cropImageOptions.f67841j);
                    cropImageOptions.f67842k = obtainStyledAttributes.getInteger(C34758Nl4.CropImageView_cropMaxZoom, cropImageOptions.f67842k);
                    cropImageOptions.f67833b = EnumC16642c.values()[obtainStyledAttributes.getInt(C34758Nl4.CropImageView_cropShape, cropImageOptions.f67833b.ordinal())];
                    cropImageOptions.f67836e = EnumC16643d.values()[obtainStyledAttributes.getInt(C34758Nl4.CropImageView_cropGuidelines, cropImageOptions.f67836e.ordinal())];
                    cropImageOptions.f67834c = obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropSnapRadius, cropImageOptions.f67834c);
                    cropImageOptions.f67835d = obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropTouchRadius, cropImageOptions.f67835d);
                    cropImageOptions.f67843l = obtainStyledAttributes.getFloat(C34758Nl4.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions.f67843l);
                    cropImageOptions.f67847p = obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropBorderLineThickness, cropImageOptions.f67847p);
                    cropImageOptions.f67848q = obtainStyledAttributes.getInteger(C34758Nl4.CropImageView_cropBorderLineColor, cropImageOptions.f67848q);
                    int i3 = C34758Nl4.CropImageView_cropBorderCornerThickness;
                    cropImageOptions.f67849r = obtainStyledAttributes.getDimension(i3, cropImageOptions.f67849r);
                    cropImageOptions.f67850s = obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropBorderCornerOffset, cropImageOptions.f67850s);
                    cropImageOptions.f67851t = obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropBorderCornerLength, cropImageOptions.f67851t);
                    cropImageOptions.f67852u = obtainStyledAttributes.getInteger(C34758Nl4.CropImageView_cropBorderCornerColor, cropImageOptions.f67852u);
                    cropImageOptions.f67853v = obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropGuidelinesThickness, cropImageOptions.f67853v);
                    cropImageOptions.f67854w = obtainStyledAttributes.getInteger(C34758Nl4.CropImageView_cropGuidelinesColor, cropImageOptions.f67854w);
                    cropImageOptions.f67855x = obtainStyledAttributes.getInteger(C34758Nl4.CropImageView_cropBackgroundColor, cropImageOptions.f67855x);
                    cropImageOptions.f67838g = obtainStyledAttributes.getBoolean(C34758Nl4.CropImageView_cropShowCropOverlay, this.f67884s);
                    cropImageOptions.f67839h = obtainStyledAttributes.getBoolean(C34758Nl4.CropImageView_cropShowProgressBar, this.f67885t);
                    cropImageOptions.f67849r = obtainStyledAttributes.getDimension(i3, cropImageOptions.f67849r);
                    cropImageOptions.f67856y = (int) obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropMinCropWindowWidth, cropImageOptions.f67856y);
                    cropImageOptions.f67857z = (int) obtainStyledAttributes.getDimension(C34758Nl4.CropImageView_cropMinCropWindowHeight, cropImageOptions.f67857z);
                    cropImageOptions.f67812A = (int) obtainStyledAttributes.getFloat(C34758Nl4.CropImageView_cropMinCropResultWidthPX, cropImageOptions.f67812A);
                    cropImageOptions.f67813B = (int) obtainStyledAttributes.getFloat(C34758Nl4.CropImageView_cropMinCropResultHeightPX, cropImageOptions.f67813B);
                    cropImageOptions.f67814C = (int) obtainStyledAttributes.getFloat(C34758Nl4.CropImageView_cropMaxCropResultWidthPX, cropImageOptions.f67814C);
                    cropImageOptions.f67815D = (int) obtainStyledAttributes.getFloat(C34758Nl4.CropImageView_cropMaxCropResultHeightPX, cropImageOptions.f67815D);
                    int i4 = C34758Nl4.CropImageView_cropFlipHorizontally;
                    cropImageOptions.f67831Y = obtainStyledAttributes.getBoolean(i4, cropImageOptions.f67831Y);
                    cropImageOptions.f67832Z = obtainStyledAttributes.getBoolean(i4, cropImageOptions.f67832Z);
                    this.f67883r = obtainStyledAttributes.getBoolean(C34758Nl4.CropImageView_cropSaveBitmapToInstanceState, this.f67883r);
                    if (obtainStyledAttributes.hasValue(i2) && obtainStyledAttributes.hasValue(i2) && !obtainStyledAttributes.hasValue(i)) {
                        cropImageOptions.f67844m = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        cropImageOptions.m54191a();
        this.f67882q = cropImageOptions.f67837f;
        this.f67886u = cropImageOptions.f67840i;
        this.f67887v = cropImageOptions.f67842k;
        this.f67884s = cropImageOptions.f67838g;
        this.f67885t = cropImageOptions.f67839h;
        this.f67877l = cropImageOptions.f67831Y;
        this.f67878m = cropImageOptions.f67832Z;
        View inflate = LayoutInflater.from(context).inflate(C47047pk4.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(C32391Di4.ImageView_image);
        this.f67867b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(C32391Di4.CropOverlayView);
        this.f67868c = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new C16640a());
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        this.f67871f = (ProgressBar) inflate.findViewById(C32391Di4.CropProgressBar);
        m54168u();
    }

    public void setImageBitmap(Bitmap bitmap, C37059Xh1 c37059Xh1) {
        Bitmap bitmap2;
        int i;
        if (bitmap == null || c37059Xh1 == null) {
            bitmap2 = bitmap;
            i = 0;
        } else {
            C16655c.C16657b m54121A = C16655c.m54121A(bitmap, c37059Xh1);
            Bitmap bitmap3 = m54121A.f67993a;
            int i2 = m54121A.f67994b;
            this.f67875j = i2;
            i = i2;
            bitmap2 = bitmap3;
        }
        this.f67868c.setInitialCropWindowRect(null);
        m54170s(bitmap2, 0, null, 1, i);
    }
}
