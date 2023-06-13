package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p000.IS0;
import p000.WU2;
/* renamed from: kb4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43992kb4<DataT> implements WU2<Uri, DataT> {

    /* renamed from: a */
    public final Context f94610a;

    /* renamed from: b */
    public final WU2<File, DataT> f94611b;

    /* renamed from: c */
    public final WU2<Uri, DataT> f94612c;

    /* renamed from: d */
    public final Class<DataT> f94613d;

    /* renamed from: kb4$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC25188a<DataT> implements XU2<Uri, DataT> {

        /* renamed from: a */
        public final Context f94614a;

        /* renamed from: b */
        public final Class<DataT> f94615b;

        public AbstractC25188a(Context context, Class<DataT> cls) {
            this.f94614a = context;
            this.f94615b = cls;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public final WU2<Uri, DataT> mo19945b(QW2 qw2) {
            return new C43992kb4(this.f94614a, qw2.m88449d(File.class, this.f94615b), qw2.m88449d(Uri.class, this.f94615b), this.f94615b);
        }
    }

    /* renamed from: kb4$b */
    /* loaded from: classes5.dex */
    public static final class C25189b extends AbstractC25188a<ParcelFileDescriptor> {
        public C25189b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: kb4$c */
    /* loaded from: classes5.dex */
    public static final class C25190c extends AbstractC25188a<InputStream> {
        public C25190c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: kb4$d */
    /* loaded from: classes5.dex */
    public static final class C25191d<DataT> implements IS0<DataT> {

        /* renamed from: l */
        public static final String[] f94616l = {"_data"};

        /* renamed from: b */
        public final Context f94617b;

        /* renamed from: c */
        public final WU2<File, DataT> f94618c;

        /* renamed from: d */
        public final WU2<Uri, DataT> f94619d;

        /* renamed from: e */
        public final Uri f94620e;

        /* renamed from: f */
        public final int f94621f;

        /* renamed from: g */
        public final int f94622g;

        /* renamed from: h */
        public final C48964sy3 f94623h;

        /* renamed from: i */
        public final Class<DataT> f94624i;

        /* renamed from: j */
        public volatile boolean f94625j;

        /* renamed from: k */
        public volatile IS0<DataT> f94626k;

        public C25191d(Context context, WU2<File, DataT> wu2, WU2<Uri, DataT> wu22, Uri uri, int i, int i2, C48964sy3 c48964sy3, Class<DataT> cls) {
            this.f94617b = context.getApplicationContext();
            this.f94618c = wu2;
            this.f94619d = wu22;
            this.f94620e = uri;
            this.f94621f = i;
            this.f94622g = i2;
            this.f94623h = c48964sy3;
            this.f94624i = cls;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<DataT> mo6834a() {
            return this.f94624i;
        }

        @Override // p000.IS0
        /* renamed from: b */
        public ZS0 mo19947b() {
            return ZS0.LOCAL;
        }

        /* renamed from: c */
        public final WU2.C9060a<DataT> m28805c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            Uri uri;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f94618c.mo19951b(m28802g(this.f94620e), this.f94621f, this.f94622g, this.f94623h);
            }
            if (m28803f()) {
                uri = MediaStore.setRequireOriginal(this.f94620e);
            } else {
                uri = this.f94620e;
            }
            return this.f94619d.mo19951b(uri, this.f94621f, this.f94622g, this.f94623h);
        }

        @Override // p000.IS0
        public void cancel() {
            this.f94625j = true;
            IS0<DataT> is0 = this.f94626k;
            if (is0 != null) {
                is0.cancel();
            }
        }

        @Override // p000.IS0
        public void cleanup() {
            IS0<DataT> is0 = this.f94626k;
            if (is0 != null) {
                is0.cleanup();
            }
        }

        /* renamed from: d */
        public final IS0<DataT> m28804d() throws FileNotFoundException {
            WU2.C9060a<DataT> m28805c = m28805c();
            if (m28805c != null) {
                return m28805c.f41160c;
            }
            return null;
        }

        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super DataT> interfaceC3534a) {
            try {
                IS0<DataT> m28804d = m28804d();
                if (m28804d == null) {
                    interfaceC3534a.mo77097d(new IllegalArgumentException("Failed to build fetcher for: " + this.f94620e));
                    return;
                }
                this.f94626k = m28804d;
                if (this.f94625j) {
                    cancel();
                } else {
                    m28804d.mo19946e(p24, interfaceC3534a);
                }
            } catch (FileNotFoundException e) {
                interfaceC3534a.mo77097d(e);
            }
        }

        /* renamed from: f */
        public final boolean m28803f() {
            return this.f94617b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: g */
        public final File m28802g(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.f94617b.getContentResolver().query(uri, f94616l, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public C43992kb4(Context context, WU2<File, DataT> wu2, WU2<Uri, DataT> wu22, Class<DataT> cls) {
        this.f94610a = context.getApplicationContext();
        this.f94611b = wu2;
        this.f94612c = wu22;
        this.f94613d = cls;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<DataT> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(uri), new C25191d(this.f94610a, this.f94611b, this.f94612c, uri, i, i2, c48964sy3, this.f94613d));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && JP2.m100516b(uri);
    }
}
