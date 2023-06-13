package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p000.WU2;
/* renamed from: HP2 */
/* loaded from: classes5.dex */
public class HP2 implements WU2<Uri, InputStream> {

    /* renamed from: a */
    public final Context f13340a;

    /* renamed from: HP2$a */
    /* loaded from: classes5.dex */
    public static class C3139a implements XU2<Uri, InputStream> {

        /* renamed from: a */
        public final Context f13341a;

        public C3139a(Context context) {
            this.f13341a = context;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, InputStream> mo19945b(QW2 qw2) {
            return new HP2(this.f13341a);
        }
    }

    public HP2(Context context) {
        this.f13340a = context.getApplicationContext();
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<InputStream> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        if (JP2.m100514d(i, i2)) {
            return new WU2.C9060a<>(new C35387Qd3(uri), X36.m77500d(this.f13340a, uri));
        }
        return null;
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        return JP2.m100517a(uri);
    }
}
