package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: ql1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47647ql1 extends GA0 {
    public C47647ql1(Context context) {
        super(context);
    }

    /* renamed from: k */
    public static int m17142k(Uri uri) throws IOException {
        return new C37059Xh1(uri.getPath()).m76651i("Orientation", 1);
    }

    @Override // p000.GA0, p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        return "file".equals(c47378qI4.f105059d.getScheme());
    }

    @Override // p000.GA0, p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        return new PI4.C6313a(null, C34928Oe3.m91751l(m105671j(c47378qI4)), C42732iT3.EnumC23266e.DISK, m17142k(c47378qI4.f105059d));
    }
}
