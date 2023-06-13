package io.github.sceneview.p052ar;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Config;
import io.github.sceneview.SceneView;
import io.github.sceneview.p052ar.arcore.ArSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC30295xm;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(J)\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002J\u0099\u0002\u0010\u001a\u001a\u00020\u000720\b\u0002\u0010\r\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\b\f24\b\u0002\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u000b\u0012\u0017\u0012\u00150\u000ej\u0002`\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\b\f20\b\u0002\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\b\f2E\b\u0002\u0010\u0016\u001a?\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\f20\b\u0002\u0010\u0019\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\b\fR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010#\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010&\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"Lio/github/sceneview/ar/ArSceneLifecycle;", "Lqm5;", "Lkotlin/Function1;", "Lio/github/sceneview/ar/arcore/ArSession;", "Lkotlin/ParameterName;", "name", "session", "", "action", "u", "Lkotlin/Function2;", "Lxm;", "Lkotlin/ExtensionFunctionType;", "onArSessionCreated", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "onArSessionFailed", "onArSessionResumed", "Lkotlin/Function3;", "Lcom/google/ar/core/Config;", "config", "onArSessionConfigChanged", "Lrm;", "arFrame", "onArFrame", "s", "Lio/github/sceneview/ar/ArSceneView;", "x", "()Lio/github/sceneview/ar/ArSceneView;", "sceneView", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "w", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "v", "()Lio/github/sceneview/ar/arcore/ArSession;", "arSession", "<init>", "(Lio/github/sceneview/ar/ArSceneView;)V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.ArSceneLifecycle */
/* loaded from: classes6.dex */
public final class ArSceneLifecycle extends C47661qm5 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lxm;", "Lio/github/sceneview/ar/arcore/ArSession;", "it", "", C17296a.f69688o, "(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.ArSceneLifecycle$a */
    /* loaded from: classes6.dex */
    public static final class C23387a extends Lambda implements Function2<InterfaceC30295xm, ArSession, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function1<ArSession, Unit> f87952h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23387a(Function1<? super ArSession, Unit> function1) {
            super(2);
            this.f87952h = function1;
        }

        /* renamed from: a */
        public final void m33410a(InterfaceC30295xm addObserver, ArSession it) {
            Intrinsics.checkNotNullParameter(addObserver, "$this$addObserver");
            Intrinsics.checkNotNullParameter(it, "it");
            ArSceneLifecycle.this.mo67006d(addObserver);
            this.f87952h.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC30295xm interfaceC30295xm, ArSession arSession) {
            m33410a(interfaceC30295xm, arSession);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArSceneLifecycle(ArSceneView sceneView) {
        super(sceneView);
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static /* synthetic */ void m33415t(ArSceneLifecycle arSceneLifecycle, Function2 function2, Function2 function22, Function2 function23, Function3 function3, Function2 function24, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        if ((i & 2) != 0) {
            function22 = null;
        }
        if ((i & 4) != 0) {
            function23 = null;
        }
        if ((i & 8) != 0) {
            function3 = null;
        }
        if ((i & 16) != 0) {
            function24 = null;
        }
        arSceneLifecycle.m33416s(function2, function22, function23, function3, function24);
    }

    /* renamed from: s */
    public final void m33416s(final Function2<? super InterfaceC30295xm, ? super ArSession, Unit> function2, final Function2<? super InterfaceC30295xm, ? super Exception, Unit> function22, final Function2<? super InterfaceC30295xm, ? super ArSession, Unit> function23, final Function3<? super InterfaceC30295xm, ? super ArSession, ? super Config, Unit> function3, final Function2<? super InterfaceC30295xm, ? super C27991rm, Unit> function24) {
        mo67008a(new InterfaceC30295xm() { // from class: io.github.sceneview.ar.ArSceneLifecycle$addObserver$1
            @Override // p000.InterfaceC30295xm
            /* renamed from: F */
            public void mo4733F(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                Function2<InterfaceC30295xm, Exception, Unit> function25 = function22;
                if (function25 != null) {
                    function25.invoke(this, exception);
                }
            }

            @Override // p000.InterfaceC48254rm5
            /* renamed from: I */
            public void mo15405I(int i, int i2) {
                InterfaceC30295xm.C30296a.m4722g(this, i, i2);
            }

            @Override // p000.InterfaceC30295xm
            /* renamed from: c */
            public void mo4732c(ArSession session) {
                Intrinsics.checkNotNullParameter(session, "session");
                Function2<InterfaceC30295xm, ArSession, Unit> function25 = function23;
                if (function25 != null) {
                    function25.invoke(this, session);
                }
            }

            @Override // p000.InterfaceC48254rm5
            /* renamed from: g */
            public void mo15404g(C35340Py1 c35340Py1) {
                InterfaceC30295xm.C30296a.m4723f(this, c35340Py1);
            }

            @Override // p000.InterfaceC30295xm
            /* renamed from: i */
            public void mo4731i(ArSession session, Config config) {
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(config, "config");
                Function3<InterfaceC30295xm, ArSession, Config, Unit> function32 = function3;
                if (function32 != null) {
                    function32.invoke(this, session, config);
                }
            }

            @Override // p000.InterfaceC30295xm
            /* renamed from: m */
            public void mo4730m(ArSession session) {
                Intrinsics.checkNotNullParameter(session, "session");
                Function2<InterfaceC30295xm, ArSession, Unit> function25 = function2;
                if (function25 != null) {
                    function25.invoke(this, session);
                }
            }

            @Override // p000.InterfaceC30295xm
            /* renamed from: r */
            public void mo4729r(C27991rm arFrame) {
                Intrinsics.checkNotNullParameter(arFrame, "arFrame");
                Function2<InterfaceC30295xm, C27991rm, Unit> function25 = function24;
                if (function25 != null) {
                    function25.invoke(this, arFrame);
                }
            }
        });
    }

    /* renamed from: u */
    public final void m33414u(Function1<? super ArSession, Unit> action) {
        Unit unit;
        Intrinsics.checkNotNullParameter(action, "action");
        ArSession m33413v = m33413v();
        if (m33413v != null) {
            action.invoke(m33413v);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m33415t(this, new C23387a(action), null, null, null, null, 30, null);
        }
    }

    /* renamed from: v */
    public final ArSession m33413v() {
        return mo17097r().m33394s0();
    }

    /* renamed from: w */
    public final Context m33412w() {
        return mo17097r().getContext();
    }

    @Override // p000.C47661qm5
    /* renamed from: x */
    public ArSceneView mo17097r() {
        SceneView mo17097r = super.mo17097r();
        Intrinsics.checkNotNull(mo17097r, "null cannot be cast to non-null type io.github.sceneview.ar.ArSceneView");
        return (ArSceneView) mo17097r;
    }
}
