package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 12\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, m28432d2 = {"LEZ1;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "LpP1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "e", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", DateTokenConverter.CONVERTER_KEY, "b", "c", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LwO1;", "LwO1;", "inAppMessage", "LJO1;", "LJO1;", "inAppMessageWebViewClientListener", "LpP1;", "webViewClientStateListener", "Z", "hasPageFinishedLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCalledPageFinishedOnListener", "Lzh2;", "g", "Lzh2;", "markPageFinishedJob", "", "h", "I", "maxOnPageFinishedWaitTimeMs", "<init>", "(Landroid/content/Context;LwO1;LJO1;)V", "i", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: EZ1 */
/* loaded from: classes5.dex */
public class EZ1 extends WebViewClient {

    /* renamed from: i */
    public static final C1870a f7679i = new C1870a(null);

    /* renamed from: a */
    public final Context f7680a;

    /* renamed from: b */
    public final InterfaceC50985wO1 f7681b;

    /* renamed from: c */
    public final JO1 f7682c;

    /* renamed from: d */
    public InterfaceC46845pP1 f7683d;

    /* renamed from: e */
    public boolean f7684e;

    /* renamed from: f */
    public final AtomicBoolean f7685f;

    /* renamed from: g */
    public InterfaceC52943zh2 f7686g;

    /* renamed from: h */
    public final int f7687h;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"LEZ1$a;", "", "", "url", "Landroid/os/Bundle;", C17296a.f69688o, "APPBOY_INAPP_MESSAGE_SCHEME", "Ljava/lang/String;", "AUTHORITY_NAME_CLOSE", "AUTHORITY_NAME_CUSTOM_EVENT", "AUTHORITY_NAME_NEWSFEED", "BRIDGE_JS_FILE", "JAVASCRIPT_PREFIX", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_DEEPLINK", "QUERY_NAME_EXTERNAL_OPEN", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: EZ1$a */
    /* loaded from: classes5.dex */
    public static final class C1870a {
        public /* synthetic */ C1870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Bundle m108815a(String url) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(url, "url");
            Bundle bundle = new Bundle();
            isBlank = StringsKt__StringsJVMKt.isBlank(url);
            if (isBlank) {
                return bundle;
            }
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            for (Map.Entry<String, String> entry : C33302Hf6.m103553b(uri).entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            return bundle;
        }

        private C1870a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$b */
    /* loaded from: classes5.dex */
    public static final class C1871b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1871b f7688g = new C1871b();

        public C1871b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to get HTML in-app message javascript additions";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$c */
    /* loaded from: classes5.dex */
    public static final class C1872c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1872c f7689g = new C1872c();

        public C1872c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$d */
    /* loaded from: classes5.dex */
    public static final class C1873d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1873d f7690g = new C1873d();

        public C1873d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "InAppMessageWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$e */
    /* loaded from: classes5.dex */
    public static final class C1874e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f7691g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1874e(Uri uri) {
            super(0);
            this.f7691g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Uri authority was null. Uri: ", this.f7691g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$f */
    /* loaded from: classes5.dex */
    public static final class C1875f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f7692g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1875f(Uri uri) {
            super(0);
            this.f7692g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Uri scheme was null or not an appboy url. Uri: ", this.f7692g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$g */
    /* loaded from: classes5.dex */
    public static final class C1876g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1876g f7693g = new C1876g();

        public C1876g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$h */
    /* loaded from: classes5.dex */
    public static final class C1877h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1877h f7694g = new C1877h();

        public C1877h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Page has finished loading. Calling onPageFinished on listener";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: EZ1$i */
    /* loaded from: classes5.dex */
    public static final class C1878i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1878i f7695g = new C1878i();

        public C1878i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The webview rendering process crashed, returning true";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1", m28418f = "InAppMessageWebViewClient.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: EZ1$j */
    /* loaded from: classes5.dex */
    public static final class C1879j extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f7696h;

        public C1879j(Continuation<? super C1879j> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C1879j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7696h == 0) {
                ResultKt.throwOnFailure(obj);
                EZ1.this.m108817d();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C1879j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EZ1(Context context, InterfaceC50985wO1 inAppMessage, JO1 jo1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f7680a = context;
        this.f7681b = inAppMessage;
        this.f7682c = jo1;
        this.f7685f = new AtomicBoolean(false);
        this.f7687h = new X10(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
    }

    /* renamed from: b */
    public final void m108819b(WebView webView) {
        try {
            AssetManager assets = this.f7680a.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "context.assets");
            webView.loadUrl(Intrinsics.stringPlus("javascript:", C38903c20.m62018d(assets, "appboy-html-in-app-message-javascript-component.js")));
        } catch (Exception e) {
            C42478i20.m35358s().m35357t(false);
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C1871b.f7688g, 4, null);
        }
    }

    /* renamed from: c */
    public final boolean m108818c(String str) {
        boolean isBlank;
        if (this.f7682c == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C1872c.f7689g, 6, null);
            return true;
        }
        isBlank = StringsKt__StringsJVMKt.isBlank(str);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C1873d.f7690g, 6, null);
            return true;
        }
        Uri parse = Uri.parse(str);
        Bundle m108815a = f7679i.m108815a(str);
        if (parse.getScheme() != null && Intrinsics.areEqual(parse.getScheme(), "appboy")) {
            String authority = parse.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                if (hashCode != -1801488983) {
                    if (hashCode != 3138974) {
                        if (hashCode == 94756344 && authority.equals("close")) {
                            this.f7682c.onCloseAction(this.f7681b, str, m108815a);
                        }
                    } else if (authority.equals("feed")) {
                        this.f7682c.onNewsfeedAction(this.f7681b, str, m108815a);
                    }
                } else if (authority.equals("customEvent")) {
                    this.f7682c.onCustomEventAction(this.f7681b, str, m108815a);
                }
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C1874e(parse), 7, null);
            }
            return true;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C1875f(parse), 7, null);
        this.f7682c.onOtherUrlAction(this.f7681b, str, m108815a);
        return true;
    }

    /* renamed from: d */
    public final void m108817d() {
        InterfaceC46845pP1 interfaceC46845pP1 = this.f7683d;
        if (interfaceC46845pP1 != null && this.f7685f.compareAndSet(false, true)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C1876g.f7693g, 6, null);
            interfaceC46845pP1.mo19348a();
        }
    }

    /* renamed from: e */
    public final void m108816e(InterfaceC46845pP1 interfaceC46845pP1) {
        if (interfaceC46845pP1 != null && this.f7684e && this.f7685f.compareAndSet(false, true)) {
            interfaceC46845pP1.mo19348a();
        } else {
            this.f7686g = Z10.m73846b(Z10.f47750b, Integer.valueOf(this.f7687h), null, new C1879j(null), 2, null);
        }
        this.f7683d = interfaceC46845pP1;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        m108819b(view);
        InterfaceC46845pP1 interfaceC46845pP1 = this.f7683d;
        if (interfaceC46845pP1 != null && this.f7685f.compareAndSet(false, true)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C1877h.f7694g, 6, null);
            interfaceC46845pP1.mo19348a();
        }
        this.f7684e = true;
        InterfaceC52943zh2 interfaceC52943zh2 = this.f7686g;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.f7686g = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C1878i.f7695g, 6, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()");
        return m108818c(uri);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return m108818c(url);
    }
}
