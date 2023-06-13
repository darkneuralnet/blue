package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import p000.IS0;
import p000.WU2;
/* renamed from: GP2 */
/* loaded from: classes5.dex */
public final class GP2 implements WU2<Uri, File> {

    /* renamed from: a */
    public final Context f11868a;

    /* renamed from: GP2$a */
    /* loaded from: classes5.dex */
    public static final class C2842a implements XU2<Uri, File> {

        /* renamed from: a */
        public final Context f11869a;

        public C2842a(Context context) {
            this.f11869a = context;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, File> mo19945b(QW2 qw2) {
            return new GP2(this.f11869a);
        }
    }

    /* renamed from: GP2$b */
    /* loaded from: classes5.dex */
    public static class C2843b implements IS0<File> {

        /* renamed from: d */
        public static final String[] f11870d = {"_data"};

        /* renamed from: b */
        public final Context f11871b;

        /* renamed from: c */
        public final Uri f11872c;

        public C2843b(Context context, Uri uri) {
            this.f11871b = context;
            this.f11872c = uri;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<File> mo6834a() {
            return File.class;
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
        }

        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super File> interfaceC3534a) {
            Cursor query = this.f11871b.getContentResolver().query(this.f11872c, f11870d, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                interfaceC3534a.mo77097d(new FileNotFoundException("Failed to find file path for: " + this.f11872c));
                return;
            }
            interfaceC3534a.mo77098c(new File(str));
        }
    }

    public GP2(Context context) {
        this.f11868a = context;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<File> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(uri), new C2843b(this.f11868a, uri));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        return JP2.m100516b(uri);
    }
}
