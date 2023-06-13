package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.WU2;
/* renamed from: Rf6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35642Rf6<Data> implements WU2<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f32431b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final WU2<OC1, Data> f32432a;

    /* renamed from: Rf6$a */
    /* loaded from: classes5.dex */
    public static class C7238a implements XU2<Uri, InputStream> {
        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, InputStream> mo19945b(QW2 qw2) {
            return new C35642Rf6(qw2.m88449d(OC1.class, InputStream.class));
        }
    }

    public C35642Rf6(WU2<OC1, Data> wu2) {
        this.f32432a = wu2;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        return this.f32432a.mo19951b(new OC1(uri.toString()), i, i2, c48964sy3);
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        return f32431b.contains(uri.getScheme());
    }
}
