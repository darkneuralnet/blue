package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: Yo */
/* loaded from: classes6.dex */
public class C9995Yo extends PI4 {

    /* renamed from: d */
    public static final int f46641d = 22;

    /* renamed from: a */
    public final Context f46642a;

    /* renamed from: b */
    public final Object f46643b = new Object();

    /* renamed from: c */
    public AssetManager f46644c;

    public C9995Yo(Context context) {
        this.f46642a = context;
    }

    /* renamed from: j */
    public static String m74224j(C47378qI4 c47378qI4) {
        return c47378qI4.f105059d.toString().substring(f46641d);
    }

    @Override // p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        Uri uri = c47378qI4.f105059d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        if (this.f46644c == null) {
            synchronized (this.f46643b) {
                if (this.f46644c == null) {
                    this.f46644c = this.f46642a.getAssets();
                }
            }
        }
        return new PI4.C6313a(C34928Oe3.m91751l(this.f46644c.open(m74224j(c47378qI4))), C42732iT3.EnumC23266e.DISK);
    }
}
