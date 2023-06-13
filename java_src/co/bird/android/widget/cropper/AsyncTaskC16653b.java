package co.bird.android.widget.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import co.bird.android.widget.cropper.C16655c;
import java.lang.ref.WeakReference;
/* renamed from: co.bird.android.widget.cropper.b */
/* loaded from: classes4.dex */
public final class AsyncTaskC16653b extends AsyncTask<Void, Void, C16654a> {

    /* renamed from: a */
    public final WeakReference<CropImageView> f67974a;

    /* renamed from: b */
    public final Uri f67975b;

    /* renamed from: c */
    public final Context f67976c;

    /* renamed from: d */
    public final int f67977d;

    /* renamed from: e */
    public final int f67978e;

    public AsyncTaskC16653b(CropImageView cropImageView, Uri uri) {
        DisplayMetrics displayMetrics;
        double d;
        this.f67975b = uri;
        this.f67974a = new WeakReference<>(cropImageView);
        this.f67976c = cropImageView.getContext();
        float f = cropImageView.getResources().getDisplayMetrics().density;
        if (f > 1.0f) {
            d = 1.0f / f;
        } else {
            d = 1.0d;
        }
        this.f67977d = (int) (displayMetrics.widthPixels * d);
        this.f67978e = (int) (displayMetrics.heightPixels * d);
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public C16654a doInBackground(Void... voidArr) {
        try {
            if (!isCancelled()) {
                C16655c.C16656a m54106l = C16655c.m54106l(this.f67976c, this.f67975b, this.f67977d, this.f67978e);
                if (!isCancelled()) {
                    C16655c.C16657b m54120B = C16655c.m54120B(m54106l.f67991a, this.f67976c, this.f67975b);
                    return new C16654a(this.f67975b, m54120B.f67993a, m54106l.f67992b, m54120B.f67994b);
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            return new C16654a(this.f67975b, e);
        }
    }

    /* renamed from: b */
    public Uri m54123b() {
        return this.f67975b;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(C16654a c16654a) {
        boolean z;
        Bitmap bitmap;
        CropImageView cropImageView;
        if (c16654a != null) {
            if (!isCancelled() && (cropImageView = this.f67974a.get()) != null) {
                cropImageView.m54173p(c16654a);
                z = true;
            } else {
                z = false;
            }
            if (!z && (bitmap = c16654a.f67980b) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: co.bird.android.widget.cropper.b$a */
    /* loaded from: classes4.dex */
    public static final class C16654a {

        /* renamed from: a */
        public final Uri f67979a;

        /* renamed from: b */
        public final Bitmap f67980b;

        /* renamed from: c */
        public final int f67981c;

        /* renamed from: d */
        public final int f67982d;

        /* renamed from: e */
        public final Exception f67983e;

        public C16654a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f67979a = uri;
            this.f67980b = bitmap;
            this.f67981c = i;
            this.f67982d = i2;
            this.f67983e = null;
        }

        public C16654a(Uri uri, Exception exc) {
            this.f67979a = uri;
            this.f67980b = null;
            this.f67981c = 0;
            this.f67982d = 0;
            this.f67983e = exc;
        }
    }
}
