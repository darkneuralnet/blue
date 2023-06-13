package p000;

import android.view.MotionEvent;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.HitResult;
import io.github.sceneview.p052ar.arcore.ArSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u0018"}, m28432d2 = {"Liw6;", "", "Lio/github/sceneview/ar/arcore/ArSession;", "session", "", "m", "", "exception", C17296a.f69688o, "c", "Lcom/google/ar/core/Config;", "config", "i", "Lcom/google/ar/core/HitResult;", "hitResult", "Landroid/view/MotionEvent;", "motionEvent", "b", "Lrm;", "arFrame", "r", "LPy1;", "frameTime", "g", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iw6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC43018iw6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iw6$a */
    /* loaded from: classes3.dex */
    public static final class C24645a {
        /* renamed from: a */
        public static void m31584a(InterfaceC43018iw6 interfaceC43018iw6, C27991rm arFrame) {
            Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        }

        /* renamed from: b */
        public static void m31583b(InterfaceC43018iw6 interfaceC43018iw6, ArSession session, Config config) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(config, "config");
        }

        /* renamed from: c */
        public static void m31582c(InterfaceC43018iw6 interfaceC43018iw6, ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }

        /* renamed from: d */
        public static void m31581d(InterfaceC43018iw6 interfaceC43018iw6, Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
        }

        /* renamed from: e */
        public static void m31580e(InterfaceC43018iw6 interfaceC43018iw6, ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }

        /* renamed from: f */
        public static void m31579f(InterfaceC43018iw6 interfaceC43018iw6, C35340Py1 frameTime) {
            Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        }

        /* renamed from: g */
        public static void m31578g(InterfaceC43018iw6 interfaceC43018iw6, HitResult hitResult, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(hitResult, "hitResult");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        }
    }

    /* renamed from: a */
    void mo31591a(Throwable th);

    /* renamed from: b */
    void mo31590b(HitResult hitResult, MotionEvent motionEvent);

    /* renamed from: c */
    void mo31589c(ArSession arSession);

    /* renamed from: g */
    void mo31588g(C35340Py1 c35340Py1);

    /* renamed from: i */
    void mo31587i(ArSession arSession, Config config);

    /* renamed from: m */
    void mo31586m(ArSession arSession);

    /* renamed from: r */
    void mo31585r(C27991rm c27991rm);
}
