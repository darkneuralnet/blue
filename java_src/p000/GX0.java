package p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Channel;
import com.braze.support.BrazeFunctionNotImplemented;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C38310b20;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0002R\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LGX0;", "LGO1;", "Landroid/view/View;", "inAppMessageView", "LwO1;", "inAppMessage", "", "f", DateTokenConverter.CONVERTER_KEY, "b", "c", "LjZ1;", "inAppMessageCloser", "g", "LmT2;", "messageButton", "LAO1;", "inAppMessageImmersive", C17296a.f69688o, "e", "j", "k", "LYj0;", "clickAction", "Landroid/net/Uri;", "clickUri", "", "openUriInWebview", "i", "l", "Li20;", "h", "()Li20;", "inAppMessageManager", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: GX0 */
/* loaded from: classes5.dex */
public class GX0 implements GO1 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C2868a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37310Yj0.values().length];
            iArr[EnumC37310Yj0.NEWS_FEED.ordinal()] = 1;
            iArr[EnumC37310Yj0.URI.ordinal()] = 2;
            iArr[EnumC37310Yj0.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$b */
    /* loaded from: classes5.dex */
    public static final class C2869b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2869b f12020g = new C2869b();

        public C2869b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.afterClosed called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$c */
    /* loaded from: classes5.dex */
    public static final class C2870c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2870c f12021g = new C2870c();

        public C2870c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.afterOpened called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$d */
    /* loaded from: classes5.dex */
    public static final class C2871d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2871d f12022g = new C2871d();

        public C2871d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.beforeClosed called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$e */
    /* loaded from: classes5.dex */
    public static final class C2872e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2872e f12023g = new C2872e();

        public C2872e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.beforeOpened called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$f */
    /* loaded from: classes5.dex */
    public static final class C2873f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2873f f12024g = new C2873f();

        public C2873f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$g */
    /* loaded from: classes5.dex */
    public static final class C2874g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2874g f12025g = new C2874g();

        public C2874g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.onClicked called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$h */
    /* loaded from: classes5.dex */
    public static final class C2875h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2875h f12026g = new C2875h();

        public C2875h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Deprecated onInAppMessageClicked(inAppMessage, inAppMessageCloser) called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$i */
    /* loaded from: classes5.dex */
    public static final class C2876i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2876i f12027g = new C2876i();

        public C2876i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Using non-deprecated onInAppMessageClicked(inAppMessage)";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$j */
    /* loaded from: classes5.dex */
    public static final class C2877j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2877j f12028g = new C2877j();

        public C2877j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.onDismissed called.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$k */
    /* loaded from: classes5.dex */
    public static final class C2878k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2878k f12029g = new C2878k();

        public C2878k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Can't perform click action because the cached activity is null.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$l */
    /* loaded from: classes5.dex */
    public static final class C2879l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2879l f12030g = new C2879l();

        public C2879l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "clickUri is null, not performing click action";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: GX0$m */
    /* loaded from: classes5.dex */
    public static final class C2880m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C2880m f12031g = new C2880m();

        public C2880m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "appContext is null, not performing click action";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", m28418f = "DefaultInAppMessageViewLifecycleListener.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: GX0$n */
    /* loaded from: classes5.dex */
    public static final class C2881n extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f12032h;

        public C2881n(Continuation<? super C2881n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2881n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C2881n) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12032h == 0) {
                ResultKt.throwOnFailure(obj);
                Activity m6659a = C42478i20.m35358s().m6659a();
                if (m6659a != null) {
                    C38903c20.m62021a(C36992Wz6.m77582a(m6659a));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // p000.GO1
    /* renamed from: a */
    public void mo105042a(C43377jZ1 inAppMessageCloser, C45103mT2 messageButton, AO1 inAppMessageImmersive) {
        boolean m112273e;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Intrinsics.checkNotNullParameter(inAppMessageImmersive, "inAppMessageImmersive");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2873f.f12024g, 7, null);
        inAppMessageImmersive.mo14017L(messageButton);
        try {
            m112273e = m105035h().m6651i().m112274d(inAppMessageImmersive, messageButton, inAppMessageCloser);
        } catch (BrazeFunctionNotImplemented unused) {
            m112273e = m105035h().m6651i().m112273e(inAppMessageImmersive, messageButton);
        }
        if (!m112273e) {
            m105033j(messageButton, inAppMessageImmersive, inAppMessageCloser);
        }
    }

    @Override // p000.GO1
    /* renamed from: b */
    public void mo105041b(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        m105035h().m6651i().m112271g(inAppMessageView, inAppMessage);
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2871d.f12022g, 7, null);
    }

    @Override // p000.GO1
    /* renamed from: c */
    public void mo105040c(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2869b.f12020g, 7, null);
        m105035h().m35351z();
        if (inAppMessage instanceof InterfaceC52171yO1) {
            m105031l();
        }
        inAppMessage.mo6934q0();
        m105035h().m6651i().m112277a(inAppMessage);
    }

    @Override // p000.GO1
    /* renamed from: d */
    public void mo105039d(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2870c.f12021g, 7, null);
        m105035h().m6651i().m112269j(inAppMessageView, inAppMessage);
    }

    @Override // p000.GO1
    /* renamed from: e */
    public void mo105038e(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2877j.f12028g, 7, null);
        m105035h().m6651i().m112276b(inAppMessage);
    }

    @Override // p000.GO1
    /* renamed from: f */
    public void mo105037f(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        m105035h().m6651i().m112270i(inAppMessageView, inAppMessage);
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2872e.f12023g, 7, null);
        inAppMessage.logImpression();
    }

    @Override // p000.GO1
    /* renamed from: g */
    public void mo105036g(C43377jZ1 inAppMessageCloser, View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        boolean m112272f;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, null, null, false, C2874g.f12025g, 7, null);
        inAppMessage.logClick();
        try {
            m112272f = m105035h().m6651i().m112275c(inAppMessage, inAppMessageCloser);
            C43664k20.m29442e(c43664k20, this, null, null, false, C2875h.f12026g, 7, null);
        } catch (BrazeFunctionNotImplemented unused) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2876i.f12027g, 7, null);
            m112272f = m105035h().m6651i().m112272f(inAppMessage);
        }
        if (!m112272f) {
            m105032k(inAppMessage, inAppMessageCloser);
        }
    }

    /* renamed from: h */
    public final C42478i20 m105035h() {
        C42478i20 m35358s = C42478i20.m35358s();
        Intrinsics.checkNotNullExpressionValue(m35358s, "getInstance()");
        return m35358s;
    }

    /* renamed from: i */
    public final void m105034i(EnumC37310Yj0 enumC37310Yj0, InterfaceC50985wO1 interfaceC50985wO1, C43377jZ1 c43377jZ1, Uri uri, boolean z) {
        Activity m6659a = m105035h().m6659a();
        if (m6659a == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C2878k.f12029g, 6, null);
            return;
        }
        int i = C2868a.$EnumSwitchMapping$0[enumC37310Yj0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c43377jZ1.m30325a(false);
                    return;
                } else {
                    c43377jZ1.m30325a(interfaceC50985wO1.mo6937l0());
                    return;
                }
            }
            c43377jZ1.m30325a(false);
            if (uri == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2879l.f12030g, 7, null);
                return;
            }
            C38310b20.C12274a c12274a = C38310b20.f56803a;
            C32132Cf6 mo44322e = c12274a.m65097a().mo44322e(uri, C40156e70.m43273a(interfaceC50985wO1.getExtras()), z, Channel.INAPP_MESSAGE);
            Context m6658b = m105035h().m6658b();
            if (m6658b == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C2880m.f12031g, 7, null);
                return;
            } else {
                c12274a.m65097a().mo44324c(m6658b, mo44322e);
                return;
            }
        }
        c43377jZ1.m30325a(false);
        C38310b20.f56803a.m65097a().mo44323d(m6659a, new C39577d83(C40156e70.m43273a(interfaceC50985wO1.getExtras()), Channel.INAPP_MESSAGE));
    }

    /* renamed from: j */
    public final void m105033j(C45103mT2 c45103mT2, InterfaceC50985wO1 interfaceC50985wO1, C43377jZ1 c43377jZ1) {
        m105034i(c45103mT2.m25553P(), interfaceC50985wO1, c43377jZ1, c45103mT2.m25552R(), c45103mT2.m25549x());
    }

    /* renamed from: k */
    public final void m105032k(InterfaceC50985wO1 interfaceC50985wO1, C43377jZ1 c43377jZ1) {
        m105034i(interfaceC50985wO1.mo6947P(), interfaceC50985wO1, c43377jZ1, interfaceC50985wO1.mo6946R(), interfaceC50985wO1.getOpenUriInWebView());
    }

    /* renamed from: l */
    public final void m105031l() {
        Z30.m73800d(Z10.f47750b, null, null, new C2881n(null), 3, null);
    }
}
