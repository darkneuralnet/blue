package p000;

import com.google.p034ar.core.Config;
import io.github.sceneview.p052ar.arcore.ArSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC48254rm5;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, m28432d2 = {"Lxm;", "Lrm5;", "Lio/github/sceneview/ar/arcore/ArSession;", "session", "", "m", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "F", "c", "Lcom/google/ar/core/Config;", "config", "i", "Lrm;", "arFrame", "r", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: xm */
/* loaded from: classes6.dex */
public interface InterfaceC30295xm extends InterfaceC48254rm5 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: xm$a */
    /* loaded from: classes6.dex */
    public static final class C30296a {
        /* renamed from: a */
        public static void m4728a(InterfaceC30295xm interfaceC30295xm, C27991rm arFrame) {
            Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        }

        /* renamed from: b */
        public static void m4727b(InterfaceC30295xm interfaceC30295xm, ArSession session, Config config) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(config, "config");
        }

        /* renamed from: c */
        public static void m4726c(InterfaceC30295xm interfaceC30295xm, ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }

        /* renamed from: d */
        public static void m4725d(InterfaceC30295xm interfaceC30295xm, Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
        }

        /* renamed from: e */
        public static void m4724e(InterfaceC30295xm interfaceC30295xm, ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }

        /* renamed from: f */
        public static void m4723f(InterfaceC30295xm interfaceC30295xm, C35340Py1 frameTime) {
            Intrinsics.checkNotNullParameter(frameTime, "frameTime");
            InterfaceC48254rm5.C27996a.m15403a(interfaceC30295xm, frameTime);
        }

        /* renamed from: g */
        public static void m4722g(InterfaceC30295xm interfaceC30295xm, int i, int i2) {
            InterfaceC48254rm5.C27996a.m15402b(interfaceC30295xm, i, i2);
        }
    }

    /* renamed from: F */
    void mo4733F(Exception exc);

    /* renamed from: c */
    void mo4732c(ArSession arSession);

    /* renamed from: i */
    void mo4731i(ArSession arSession, Config config);

    /* renamed from: m */
    void mo4730m(ArSession arSession);

    /* renamed from: r */
    void mo4729r(C27991rm c27991rm);
}
