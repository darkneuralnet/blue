package p000;

import android.graphics.Shader;
import android.os.Build;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import p000.C38929c46;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0004"}, m28432d2 = {"Lc46;", "Landroid/graphics/Shader$TileMode;", C17296a.f69688o, "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ud */
/* loaded from: classes.dex */
public final class C8337Ud {
    /* renamed from: a */
    public static final Shader.TileMode m81226a(int i) {
        C38929c46.C13386a c13386a = C38929c46.f60033a;
        if (C38929c46.m61961f(i, c13386a.m61958a())) {
            return Shader.TileMode.CLAMP;
        }
        if (C38929c46.m61961f(i, c13386a.m61955d())) {
            return Shader.TileMode.REPEAT;
        }
        if (C38929c46.m61961f(i, c13386a.m61956c())) {
            return Shader.TileMode.MIRROR;
        }
        if (C38929c46.m61961f(i, c13386a.m61957b())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return C40132e46.f77669a.m43299b();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
