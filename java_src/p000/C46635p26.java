package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.H16;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"Lp26;", "", "Lme0;", "canvas", "Li26;", "textLayoutResult", "", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: p26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46635p26 {

    /* renamed from: a */
    public static final C46635p26 f103035a = new C46635p26();

    private C46635p26() {
    }

    /* renamed from: a */
    public final void m20022a(InterfaceC45204me0 canvas, C42484i26 textLayoutResult) {
        boolean z;
        long m18732a;
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.m34600h() && !C45449n26.m24543e(textLayoutResult.m34597k().m40263f(), C45449n26.f99264a.m24538c())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C35055Os4 m84692b = C35991Ss4.m84692b(C32120Ce3.f4427b.m111932c(), CB5.m112663a(G52.m105829g(textLayoutResult.m34609A()), G52.m105830f(textLayoutResult.m34609A())));
            canvas.mo25245v();
            InterfaceC45204me0.m25262e(canvas, m84692b, 0, 2, null);
        }
        GN5 m105936A = textLayoutResult.m34597k().m40260i().m105936A();
        R06 m105156s = m105936A.m105156s();
        if (m105156s == null) {
            m105156s = R06.f31395b.m87428c();
        }
        R06 r06 = m105156s;
        C35335Px5 m105157r = m105936A.m105157r();
        if (m105157r == null) {
            m105157r = C35335Px5.f29462d.m89238a();
        }
        C35335Px5 c35335Px5 = m105157r;
        J61 m105167h = m105936A.m105167h();
        if (m105167h == null) {
            m105167h = C52982zl1.f122162a;
        }
        J61 j61 = m105167h;
        try {
            AbstractC37727a30 m105169f = m105936A.m105169f();
            if (m105169f != null) {
                if (m105936A.m105155t() != H16.C3007b.f12735b) {
                    f = m105936A.m105155t().mo61988h();
                } else {
                    f = 1.0f;
                }
                RW2.m86674D(textLayoutResult.m34586v(), canvas, m105169f, f, c35335Px5, r06, j61, 0, 64, null);
            } else {
                if (m105936A.m105155t() != H16.C3007b.f12735b) {
                    m18732a = m105936A.m105155t().mo61991a();
                } else {
                    m18732a = C47063pm0.f104050b.m18732a();
                }
                RW2.m86676B(textLayoutResult.m34586v(), canvas, m18732a, c35335Px5, r06, j61, 0, 32, null);
            }
        } finally {
            if (z) {
                canvas.mo25251p();
            }
        }
    }
}
