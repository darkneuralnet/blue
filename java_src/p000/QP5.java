package p000;

import android.os.Build;
import android.text.StaticLayout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¨\u0006\f"}, m28432d2 = {"LQP5;", "LeQ5;", "LfQ5;", "params", "Landroid/text/StaticLayout;", "b", "layout", "", "useFallbackLineSpacing", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QP5 */
/* loaded from: classes.dex */
public final class QP5 implements InterfaceC40335eQ5 {
    @Override // p000.InterfaceC40335eQ5
    /* renamed from: a */
    public boolean mo42885a(StaticLayout layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (T30.m84398c()) {
            return C39132cQ5.m61417a(layout);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return z;
    }

    @Override // p000.InterfaceC40335eQ5
    /* renamed from: b */
    public StaticLayout mo42884b(C40928fQ5 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.m41390r(), params.m41391q(), params.m41403e(), params.m41393o(), params.m41387u());
        obtain.setTextDirection(params.m41389s());
        obtain.setAlignment(params.m41407a());
        obtain.setMaxLines(params.m41394n());
        obtain.setEllipsize(params.m41405c());
        obtain.setEllipsizedWidth(params.m41404d());
        obtain.setLineSpacing(params.m41396l(), params.m41395m());
        obtain.setIncludePad(params.m41401g());
        obtain.setBreakStrategy(params.m41406b());
        obtain.setHyphenationFrequency(params.m41402f());
        obtain.setIndents(params.m41399i(), params.m41392p());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            SP5.m85482a(obtain, params.m41400h());
        }
        if (i >= 28) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            UP5.m81552a(obtain, params.m41388t());
        }
        if (i >= 33) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C39132cQ5.m61416b(obtain, params.m41398j(), params.m41397k());
        }
        StaticLayout build = obtain.build();
        Intrinsics.checkNotNullExpressionValue(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
