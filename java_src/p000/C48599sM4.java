package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: sM4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48599sM4 extends PI4 {

    /* renamed from: a */
    public final Context f108669a;

    public C48599sM4(Context context) {
        this.f108669a = context;
    }

    /* renamed from: j */
    public static Bitmap m14305j(Resources resources, int i, C47378qI4 c47378qI4) {
        BitmapFactory.Options m90496d = PI4.m90496d(c47378qI4);
        if (PI4.m90494g(m90496d)) {
            BitmapFactory.decodeResource(resources, i, m90496d);
            PI4.m90497b(c47378qI4.f105063h, c47378qI4.f105064i, m90496d, c47378qI4);
        }
        return BitmapFactory.decodeResource(resources, i, m90496d);
    }

    @Override // p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        if (c47378qI4.f105060e != 0) {
            return true;
        }
        return "android.resource".equals(c47378qI4.f105059d.getScheme());
    }

    @Override // p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        Resources m106699m = C32861Fi6.m106699m(this.f108669a, c47378qI4);
        return new PI4.C6313a(m14305j(m106699m, C32861Fi6.m106700l(m106699m, c47378qI4), c47378qI4), C42732iT3.EnumC23266e.DISK);
    }
}
