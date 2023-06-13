package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p000.WU2;
/* renamed from: LP2 */
/* loaded from: classes5.dex */
public class LP2 implements WU2<Uri, InputStream> {

    /* renamed from: a */
    public final Context f21377a;

    /* renamed from: LP2$a */
    /* loaded from: classes5.dex */
    public static class C4908a implements XU2<Uri, InputStream> {

        /* renamed from: a */
        public final Context f21378a;

        public C4908a(Context context) {
            this.f21378a = context;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, InputStream> mo19945b(QW2 qw2) {
            return new LP2(this.f21378a);
        }
    }

    public LP2(Context context) {
        this.f21377a = context.getApplicationContext();
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<InputStream> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        if (JP2.m100514d(i, i2) && m96964e(c48964sy3)) {
            return new WU2.C9060a<>(new C35387Qd3(uri), X36.m77499f(this.f21377a, uri));
        }
        return null;
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        return JP2.m100515c(uri);
    }

    /* renamed from: e */
    public final boolean m96964e(C48964sy3 c48964sy3) {
        Long l = (Long) c48964sy3.m13300c(C39391cp6.f75670d);
        if (l != null && l.longValue() == -1) {
            return true;
        }
        return false;
    }
}
