package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.IS0;
/* renamed from: X36 */
/* loaded from: classes5.dex */
public class X36 implements IS0<InputStream> {

    /* renamed from: b */
    public final Uri f42584b;

    /* renamed from: c */
    public final C37743a46 f42585c;

    /* renamed from: d */
    public InputStream f42586d;

    /* renamed from: X36$a */
    /* loaded from: classes5.dex */
    public static class C9291a implements Y36 {

        /* renamed from: b */
        public static final String[] f42587b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f42588a;

        public C9291a(ContentResolver contentResolver) {
            this.f42588a = contentResolver;
        }

        @Override // p000.Y36
        /* renamed from: a */
        public Cursor mo75793a(Uri uri) {
            return this.f42588a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f42587b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: X36$b */
    /* loaded from: classes5.dex */
    public static class C9292b implements Y36 {

        /* renamed from: b */
        public static final String[] f42589b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f42590a;

        public C9292b(ContentResolver contentResolver) {
            this.f42590a = contentResolver;
        }

        @Override // p000.Y36
        /* renamed from: a */
        public Cursor mo75793a(Uri uri) {
            return this.f42590a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f42589b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public X36(Uri uri, C37743a46 c37743a46) {
        this.f42584b = uri;
        this.f42585c = c37743a46;
    }

    /* renamed from: c */
    public static X36 m77501c(Context context, Uri uri, Y36 y36) {
        return new X36(uri, new C37743a46(ComponentCallbacks2C17096a.m53155c(context).m53148j().m53172g(), y36, ComponentCallbacks2C17096a.m53155c(context).m53153e(), context.getContentResolver()));
    }

    /* renamed from: d */
    public static X36 m77500d(Context context, Uri uri) {
        return m77501c(context, uri, new C9291a(context.getContentResolver()));
    }

    /* renamed from: f */
    public static X36 m77499f(Context context, Uri uri) {
        return m77501c(context, uri, new C9292b(context.getContentResolver()));
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<InputStream> mo6834a() {
        return InputStream.class;
    }

    @Override // p000.IS0
    /* renamed from: b */
    public ZS0 mo19947b() {
        return ZS0.LOCAL;
    }

    @Override // p000.IS0
    public void cancel() {
    }

    @Override // p000.IS0
    public void cleanup() {
        InputStream inputStream = this.f42586d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.IS0
    /* renamed from: e */
    public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super InputStream> interfaceC3534a) {
        try {
            InputStream m77498g = m77498g();
            this.f42586d = m77498g;
            interfaceC3534a.mo77098c(m77498g);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            interfaceC3534a.mo77097d(e);
        }
    }

    /* renamed from: g */
    public final InputStream m77498g() throws FileNotFoundException {
        int i;
        InputStream m71926d = this.f42585c.m71926d(this.f42584b);
        if (m71926d != null) {
            i = this.f42585c.m71929a(this.f42584b);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new C38112ai1(m71926d, i);
        }
        return m71926d;
    }
}
