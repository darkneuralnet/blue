package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p000.WU2;
/* renamed from: YR5 */
/* loaded from: classes5.dex */
public class YR5<Data> implements WU2<String, Data> {

    /* renamed from: a */
    public final WU2<Uri, Data> f45883a;

    /* renamed from: YR5$a */
    /* loaded from: classes5.dex */
    public static final class C9776a implements XU2<String, AssetFileDescriptor> {
        @Override // p000.XU2
        /* renamed from: b */
        public WU2<String, AssetFileDescriptor> mo19945b(QW2 qw2) {
            return new YR5(qw2.m88449d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: YR5$b */
    /* loaded from: classes5.dex */
    public static class C9777b implements XU2<String, ParcelFileDescriptor> {
        @Override // p000.XU2
        /* renamed from: b */
        public WU2<String, ParcelFileDescriptor> mo19945b(QW2 qw2) {
            return new YR5(qw2.m88449d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: YR5$c */
    /* loaded from: classes5.dex */
    public static class C9778c implements XU2<String, InputStream> {
        @Override // p000.XU2
        /* renamed from: b */
        public WU2<String, InputStream> mo19945b(QW2 qw2) {
            return new YR5(qw2.m88449d(Uri.class, InputStream.class));
        }
    }

    public YR5(WU2<Uri, Data> wu2) {
        this.f45883a = wu2;
    }

    /* renamed from: e */
    public static Uri m75018e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m75017f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m75017f(str);
        }
        return parse;
    }

    /* renamed from: f */
    public static Uri m75017f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(String str, int i, int i2, C48964sy3 c48964sy3) {
        Uri m75018e = m75018e(str);
        if (m75018e != null && this.f45883a.mo19952a(m75018e)) {
            return this.f45883a.mo19951b(m75018e, i, i2, c48964sy3);
        }
        return null;
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(String str) {
        return true;
    }
}
