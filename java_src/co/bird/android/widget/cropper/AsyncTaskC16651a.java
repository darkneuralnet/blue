package co.bird.android.widget.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import co.bird.android.widget.cropper.C16655c;
import co.bird.android.widget.cropper.CropImageView;
import java.lang.ref.WeakReference;
/* renamed from: co.bird.android.widget.cropper.a */
/* loaded from: classes4.dex */
public final class AsyncTaskC16651a extends AsyncTask<Void, Void, C16652a> {

    /* renamed from: a */
    public final WeakReference<CropImageView> f67950a;

    /* renamed from: b */
    public final Bitmap f67951b;

    /* renamed from: c */
    public final Uri f67952c;

    /* renamed from: d */
    public final Context f67953d;

    /* renamed from: e */
    public final float[] f67954e;

    /* renamed from: f */
    public final int f67955f;

    /* renamed from: g */
    public final int f67956g;

    /* renamed from: h */
    public final int f67957h;

    /* renamed from: i */
    public final boolean f67958i;

    /* renamed from: j */
    public final int f67959j;

    /* renamed from: k */
    public final int f67960k;

    /* renamed from: l */
    public final int f67961l;

    /* renamed from: m */
    public final int f67962m;

    /* renamed from: n */
    public final boolean f67963n;

    /* renamed from: o */
    public final boolean f67964o;

    /* renamed from: p */
    public final CropImageView.EnumC16647h f67965p;

    /* renamed from: q */
    public final Uri f67966q;

    /* renamed from: r */
    public final Bitmap.CompressFormat f67967r;

    /* renamed from: s */
    public final int f67968s;

    public AsyncTaskC16651a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, CropImageView.EnumC16647h enumC16647h, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        this.f67950a = new WeakReference<>(cropImageView);
        this.f67953d = cropImageView.getContext();
        this.f67951b = bitmap;
        this.f67954e = fArr;
        this.f67952c = null;
        this.f67955f = i;
        this.f67958i = z;
        this.f67959j = i2;
        this.f67960k = i3;
        this.f67961l = i4;
        this.f67962m = i5;
        this.f67963n = z2;
        this.f67964o = z3;
        this.f67965p = enumC16647h;
        this.f67966q = uri;
        this.f67967r = compressFormat;
        this.f67968s = i6;
        this.f67956g = 0;
        this.f67957h = 0;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public C16652a doInBackground(Void... voidArr) {
        C16655c.C16656a m54111g;
        boolean z = true;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f67952c;
            if (uri != null) {
                m54111g = C16655c.m54114d(this.f67953d, uri, this.f67954e, this.f67955f, this.f67956g, this.f67957h, this.f67958i, this.f67959j, this.f67960k, this.f67961l, this.f67962m, this.f67963n, this.f67964o);
            } else {
                Bitmap bitmap = this.f67951b;
                if (bitmap != null) {
                    m54111g = C16655c.m54111g(bitmap, this.f67954e, this.f67955f, this.f67958i, this.f67959j, this.f67960k, this.f67963n, this.f67964o);
                } else {
                    return new C16652a((Bitmap) null, 1);
                }
            }
            Bitmap m54093y = C16655c.m54093y(m54111g.f67991a, this.f67961l, this.f67962m, this.f67965p);
            Uri uri2 = this.f67966q;
            if (uri2 == null) {
                return new C16652a(m54093y, m54111g.f67992b);
            }
            C16655c.m54119C(this.f67953d, m54093y, uri2, this.f67967r, this.f67968s);
            if (m54093y != null) {
                m54093y.recycle();
            }
            return new C16652a(this.f67966q, m54111g.f67992b);
        } catch (Exception e) {
            if (this.f67966q == null) {
                z = false;
            }
            return new C16652a(e, z);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(C16652a c16652a) {
        boolean z;
        Bitmap bitmap;
        CropImageView cropImageView;
        if (c16652a != null) {
            if (!isCancelled() && (cropImageView = this.f67950a.get()) != null) {
                cropImageView.m54174o(c16652a);
                z = true;
            } else {
                z = false;
            }
            if (!z && (bitmap = c16652a.f67969a) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: co.bird.android.widget.cropper.a$a */
    /* loaded from: classes4.dex */
    public static final class C16652a {

        /* renamed from: a */
        public final Bitmap f67969a;

        /* renamed from: b */
        public final Uri f67970b;

        /* renamed from: c */
        public final Exception f67971c;

        /* renamed from: d */
        public final boolean f67972d;

        /* renamed from: e */
        public final int f67973e;

        public C16652a(Bitmap bitmap, int i) {
            this.f67969a = bitmap;
            this.f67970b = null;
            this.f67971c = null;
            this.f67972d = false;
            this.f67973e = i;
        }

        public C16652a(Uri uri, int i) {
            this.f67969a = null;
            this.f67970b = uri;
            this.f67971c = null;
            this.f67972d = true;
            this.f67973e = i;
        }

        public C16652a(Exception exc, boolean z) {
            this.f67969a = null;
            this.f67970b = null;
            this.f67971c = exc;
            this.f67972d = z;
            this.f67973e = 1;
        }
    }

    public AsyncTaskC16651a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.EnumC16647h enumC16647h, Uri uri2, Bitmap.CompressFormat compressFormat, int i8) {
        this.f67950a = new WeakReference<>(cropImageView);
        this.f67953d = cropImageView.getContext();
        this.f67952c = uri;
        this.f67954e = fArr;
        this.f67955f = i;
        this.f67958i = z;
        this.f67959j = i4;
        this.f67960k = i5;
        this.f67956g = i2;
        this.f67957h = i3;
        this.f67961l = i6;
        this.f67962m = i7;
        this.f67963n = z2;
        this.f67964o = z3;
        this.f67965p = enumC16647h;
        this.f67966q = uri2;
        this.f67967r = compressFormat;
        this.f67968s = i8;
        this.f67951b = null;
    }
}
