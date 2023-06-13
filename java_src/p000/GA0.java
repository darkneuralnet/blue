package p000;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: GA0 */
/* loaded from: classes6.dex */
public class GA0 extends PI4 {

    /* renamed from: a */
    public final Context f11074a;

    public GA0(Context context) {
        this.f11074a = context;
    }

    @Override // p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        return "content".equals(c47378qI4.f105059d.getScheme());
    }

    @Override // p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        return new PI4.C6313a(C34928Oe3.m91751l(m105671j(c47378qI4)), C42732iT3.EnumC23266e.DISK);
    }

    /* renamed from: j */
    public InputStream m105671j(C47378qI4 c47378qI4) throws FileNotFoundException {
        return this.f11074a.getContentResolver().openInputStream(c47378qI4.f105059d);
    }
}
