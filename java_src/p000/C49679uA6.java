package p000;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC36758Vz6;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008d\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\u0019\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, m28432d2 = {"LBA6;", TransferTable.COLUMN_STATE, "LgV2;", "modifier", "", "captureBackPresses", "LvA6;", "navigator", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "onDispose", "Lx2;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lw2;", "chromeClient", "Landroid/content/Context;", "factory", C17296a.f69688o, "(LBA6;LgV2;ZLvA6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx2;Lw2;Lkotlin/jvm/functions/Function1;LEt0;II)V", "LVz6;", "", "url", "LVz6$b;", "j", "LZC0;", "coroutineScope", "h", "(LZC0;LEt0;II)LvA6;", MessageExtension.FIELD_DATA, "baseUrl", "i", "(Ljava/lang/String;Ljava/lang/String;LEt0;II)LBA6;", "web_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: uA6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49679uA6 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: uA6$a */
    /* loaded from: classes5.dex */
    public static final class C29105a extends Lambda implements Function1<WebView, Unit> {

        /* renamed from: g */
        public static final C29105a f111873g = new C29105a();

        public C29105a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WebView it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
            invoke2(webView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: uA6$b */
    /* loaded from: classes5.dex */
    public static final class C29106b extends Lambda implements Function1<WebView, Unit> {

        /* renamed from: g */
        public static final C29106b f111874g = new C29106b();

        public C29106b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WebView it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
            invoke2(webView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: uA6$c */
    /* loaded from: classes5.dex */
    public static final class C29107c extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ EX2<WebView> f111875g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29107c(EX2<WebView> ex2) {
            super(0);
            this.f111875g = ex2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WebView m10704b = C49679uA6.m10704b(this.f111875g);
            if (m10704b != null) {
                m10704b.goBack();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.google.accompanist.web.WebViewKt$WebView$6$1", m28418f = "WebView.kt", m28417i = {}, m28416l = {89}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uA6$d */
    /* loaded from: classes5.dex */
    public static final class C29108d extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f111876h;

        /* renamed from: i */
        public final /* synthetic */ C50271vA6 f111877i;

        /* renamed from: j */
        public final /* synthetic */ EX2<WebView> f111878j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29108d(C50271vA6 c50271vA6, EX2<WebView> ex2, Continuation<? super C29108d> continuation) {
            super(2, continuation);
            this.f111877i = c50271vA6;
            this.f111878j = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29108d(this.f111877i, this.f111878j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29108d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f111876h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                C50271vA6 c50271vA6 = this.f111877i;
                WebView m10704b = C49679uA6.m10704b(this.f111878j);
                if (m10704b != null) {
                    this.f111876h = 1;
                    if (c50271vA6.m9061c(m10704b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: uA6$e */
    /* loaded from: classes5.dex */
    public static final class C29109e extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ WebView f111879g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<Function1<WebView, Unit>> f111880h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"uA6$e$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: uA6$e$a */
        /* loaded from: classes5.dex */
        public static final class C29110a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ WebView f111881a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC48627sP5 f111882b;

            public C29110a(WebView webView, InterfaceC48627sP5 interfaceC48627sP5) {
                this.f111881a = webView;
                this.f111882b = interfaceC48627sP5;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                C49679uA6.m10702d(this.f111882b).invoke(this.f111881a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29109e(WebView webView, InterfaceC48627sP5<? extends Function1<? super WebView, Unit>> interfaceC48627sP5) {
            super(1);
            this.f111879g = webView;
            this.f111880h = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C29110a(this.f111879g, this.f111880h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: uA6$f */
    /* loaded from: classes5.dex */
    public static final class C29111f extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f111883g;

        /* renamed from: h */
        public final /* synthetic */ BA6 f111884h;

        /* renamed from: i */
        public final /* synthetic */ C50271vA6 f111885i;

        /* renamed from: j */
        public final /* synthetic */ int f111886j;

        /* renamed from: k */
        public final /* synthetic */ Function1<Context, WebView> f111887k;

        /* renamed from: l */
        public final /* synthetic */ Function1<WebView, Unit> f111888l;

        /* renamed from: m */
        public final /* synthetic */ C29742w2 f111889m;

        /* renamed from: n */
        public final /* synthetic */ C30027x2 f111890n;

        /* renamed from: o */
        public final /* synthetic */ EX2<WebView> f111891o;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: uA6$f$a */
        /* loaded from: classes5.dex */
        public static final class C29112a extends Lambda implements Function1<Context, WebView> {

            /* renamed from: g */
            public final /* synthetic */ Function1<Context, WebView> f111892g;

            /* renamed from: h */
            public final /* synthetic */ Function1<WebView, Unit> f111893h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC41875h10 f111894i;

            /* renamed from: j */
            public final /* synthetic */ C29742w2 f111895j;

            /* renamed from: k */
            public final /* synthetic */ C30027x2 f111896k;

            /* renamed from: l */
            public final /* synthetic */ EX2<WebView> f111897l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C29112a(Function1<? super Context, ? extends WebView> function1, Function1<? super WebView, Unit> function12, InterfaceC41875h10 interfaceC41875h10, C29742w2 c29742w2, C30027x2 c30027x2, EX2<WebView> ex2) {
                super(1);
                this.f111892g = function1;
                this.f111893h = function12;
                this.f111894i = interfaceC41875h10;
                this.f111895j = c29742w2;
                this.f111896k = c30027x2;
                this.f111897l = ex2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WebView invoke(Context context) {
                WebView webView;
                int i;
                Intrinsics.checkNotNullParameter(context, "context");
                Function1<Context, WebView> function1 = this.f111892g;
                if (function1 == null || (webView = function1.invoke(context)) == null) {
                    webView = new WebView(context);
                }
                Function1<WebView, Unit> function12 = this.f111893h;
                InterfaceC41875h10 interfaceC41875h10 = this.f111894i;
                C29742w2 c29742w2 = this.f111895j;
                C30027x2 c30027x2 = this.f111896k;
                function12.invoke(webView);
                int i2 = -1;
                if (C44228kz0.m28065l(interfaceC41875h10.mo35389b())) {
                    i = -1;
                } else {
                    i = -2;
                }
                if (!C44228kz0.m28066k(interfaceC41875h10.mo35389b())) {
                    i2 = -2;
                }
                webView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
                webView.setWebChromeClient(c29742w2);
                webView.setWebViewClient(c30027x2);
                C49679uA6.m10703c(this.f111897l, webView);
                return webView;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: uA6$f$b */
        /* loaded from: classes5.dex */
        public static final class C29113b extends Lambda implements Function1<WebView, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f111898g;

            /* renamed from: h */
            public final /* synthetic */ BA6 f111899h;

            /* renamed from: i */
            public final /* synthetic */ C50271vA6 f111900i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29113b(boolean z, BA6 ba6, C50271vA6 c50271vA6) {
                super(1);
                this.f111898g = z;
                this.f111899h = ba6;
                this.f111900i = c50271vA6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
                invoke2(webView);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(WebView view) {
                Map<String, String> mutableMap;
                Intrinsics.checkNotNullParameter(view, "view");
                if (this.f111898g) {
                    return;
                }
                AbstractC36758Vz6 m114311a = this.f111899h.m114311a();
                if (m114311a instanceof AbstractC36758Vz6.C8887b) {
                    AbstractC36758Vz6.C8887b c8887b = (AbstractC36758Vz6.C8887b) m114311a;
                    String m79017e = c8887b.m79017e();
                    if ((m79017e.length() > 0) && !Intrinsics.areEqual(m79017e, view.getUrl())) {
                        mutableMap = MapsKt__MapsKt.toMutableMap(c8887b.m79018d());
                        view.loadUrl(m79017e, mutableMap);
                    }
                } else if (m114311a instanceof AbstractC36758Vz6.C8886a) {
                    AbstractC36758Vz6.C8886a c8886a = (AbstractC36758Vz6.C8886a) m114311a;
                    view.loadDataWithBaseURL(c8886a.m79022b(), c8886a.m79021c(), null, "utf-8", null);
                }
                this.f111900i.m9060d(view.canGoBack());
                this.f111900i.m9059e(view.canGoForward());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29111f(boolean z, BA6 ba6, C50271vA6 c50271vA6, int i, Function1<? super Context, ? extends WebView> function1, Function1<? super WebView, Unit> function12, C29742w2 c29742w2, C30027x2 c30027x2, EX2<WebView> ex2) {
            super(3);
            this.f111883g = z;
            this.f111884h = ba6;
            this.f111885i = c50271vA6;
            this.f111886j = i;
            this.f111887k = function1;
            this.f111888l = function12;
            this.f111889m = c29742w2;
            this.f111890n = c30027x2;
            this.f111891o = ex2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [Et0] */
        /* JADX WARN: Type inference failed for: r3v6 */
        public final void invoke(InterfaceC41875h10 BoxWithConstraints, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = (interfaceC32720Et0.mo89539n(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1606035789, i, -1, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:108)");
            }
            C29112a c29112a = new C29112a(this.f111887k, this.f111888l, BoxWithConstraints, this.f111889m, this.f111890n, this.f111891o);
            Boolean valueOf = Boolean.valueOf(this.f111883g);
            BA6 ba6 = this.f111884h;
            C50271vA6 c50271vA6 = this.f111885i;
            boolean z = this.f111883g;
            interfaceC32720Et0.mo89638F(1618982084);
            boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(ba6) | interfaceC32720Et0.mo89539n(c50271vA6);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C29113b(z, ba6, c50271vA6);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C24963je.m30175a(c29112a, null, mo89635G, interfaceC32720Et0, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: uA6$g */
    /* loaded from: classes5.dex */
    public static final class C29114g extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BA6 f111901g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f111902h;

        /* renamed from: i */
        public final /* synthetic */ boolean f111903i;

        /* renamed from: j */
        public final /* synthetic */ C50271vA6 f111904j;

        /* renamed from: k */
        public final /* synthetic */ Function1<WebView, Unit> f111905k;

        /* renamed from: l */
        public final /* synthetic */ Function1<WebView, Unit> f111906l;

        /* renamed from: m */
        public final /* synthetic */ C30027x2 f111907m;

        /* renamed from: n */
        public final /* synthetic */ C29742w2 f111908n;

        /* renamed from: o */
        public final /* synthetic */ Function1<Context, WebView> f111909o;

        /* renamed from: p */
        public final /* synthetic */ int f111910p;

        /* renamed from: q */
        public final /* synthetic */ int f111911q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29114g(BA6 ba6, InterfaceC41563gV2 interfaceC41563gV2, boolean z, C50271vA6 c50271vA6, Function1<? super WebView, Unit> function1, Function1<? super WebView, Unit> function12, C30027x2 c30027x2, C29742w2 c29742w2, Function1<? super Context, ? extends WebView> function13, int i, int i2) {
            super(2);
            this.f111901g = ba6;
            this.f111902h = interfaceC41563gV2;
            this.f111903i = z;
            this.f111904j = c50271vA6;
            this.f111905k = function1;
            this.f111906l = function12;
            this.f111907m = c30027x2;
            this.f111908n = c29742w2;
            this.f111909o = function13;
            this.f111910p = i;
            this.f111911q = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C49679uA6.m10705a(this.f111901g, this.f111902h, this.f111903i, this.f111904j, this.f111905k, this.f111906l, this.f111907m, this.f111908n, this.f111909o, interfaceC32720Et0, this.f111910p | 1, this.f111911q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10705a(BA6 state, InterfaceC41563gV2 interfaceC41563gV2, boolean z, C50271vA6 c50271vA6, Function1<? super WebView, Unit> function1, Function1<? super WebView, Unit> function12, C30027x2 c30027x2, C29742w2 c29742w2, Function1<? super Context, ? extends WebView> function13, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C50271vA6 c50271vA62;
        int i8;
        C29105a c29105a;
        int i9;
        int i10;
        C29106b c29106b;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z2;
        C30027x2 c30027x22;
        C29742w2 c29742w22;
        InterfaceC41563gV2 interfaceC41563gV23;
        Function1<? super Context, ? extends WebView> function14;
        C29742w2 c29742w23;
        Object obj;
        Object obj2;
        boolean z3;
        C50271vA6 c50271vA63;
        int i16;
        C30027x2 c30027x23;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        boolean z4;
        boolean mo89539n;
        Object mo89635G2;
        boolean mo89539n2;
        Object mo89635G3;
        WebView m10704b;
        InterfaceC41563gV2 interfaceC41563gV24;
        boolean z5;
        Function1<? super WebView, Unit> function15;
        Function1<? super Context, ? extends WebView> function16;
        C29742w2 c29742w24;
        C30027x2 c30027x24;
        Function1<? super WebView, Unit> function17;
        C50271vA6 c50271vA64;
        InterfaceC36874Wm5 mo89512w;
        int i17;
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1473276617);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(state)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89536o(z)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        c50271vA62 = c50271vA6;
                        if (mo89518u.mo89539n(c50271vA62)) {
                            i17 = 2048;
                            i3 |= i17;
                        }
                    } else {
                        c50271vA62 = c50271vA6;
                    }
                    i17 = 1024;
                    i3 |= i17;
                } else {
                    c50271vA62 = c50271vA6;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    c29105a = function1;
                    if (mo89518u.mo89539n(c29105a)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                    i10 = i2 & 32;
                    if (i10 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                    } else if ((458752 & i) == 0) {
                        c29106b = function12;
                        if (mo89518u.mo89539n(c29106b)) {
                            i11 = DateUtils.FORMAT_NUMERIC_DATE;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 524288;
                        }
                        i13 = i2 & 128;
                        if (i13 != 0) {
                            i3 |= 4194304;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (mo89518u.mo89539n(function13)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i2 & 192) != 192 && (191739611 & i3) == 38347922 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV24 = interfaceC41563gV2;
                            z5 = z;
                            c29742w24 = c29742w2;
                            c50271vA64 = c50271vA62;
                            function15 = c29105a;
                            function17 = c29106b;
                            c30027x24 = c30027x2;
                            function16 = function13;
                        } else {
                            mo89518u.mo89626J();
                            if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                                mo89518u.mo89548k();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if (i12 != 0) {
                                    i3 &= -3670017;
                                }
                                if (i13 != 0) {
                                    i3 &= -29360129;
                                }
                                interfaceC41563gV23 = interfaceC41563gV2;
                                c29742w23 = c29742w2;
                                function14 = function13;
                                i16 = i3;
                                obj = c29105a;
                                obj2 = c29106b;
                                z3 = z;
                                c50271vA63 = c50271vA62;
                                c30027x23 = c30027x2;
                            } else {
                                if (i18 != 0) {
                                    interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                                } else {
                                    interfaceC41563gV22 = interfaceC41563gV2;
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                InterfaceC41563gV2 interfaceC41563gV25 = interfaceC41563gV22;
                                if ((i2 & 8) != 0) {
                                    c50271vA62 = m10698h(null, mo89518u, 0, 1);
                                    i3 &= -7169;
                                }
                                if (i8 != 0) {
                                    c29105a = C29105a.f111873g;
                                }
                                if (i10 != 0) {
                                    c29106b = C29106b.f111874g;
                                }
                                if (i12 != 0) {
                                    mo89518u.mo89638F(-492369756);
                                    Object mo89635G4 = mo89518u.mo89635G();
                                    if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G4 = new C30027x2();
                                        mo89518u.mo89503z(mo89635G4);
                                    }
                                    mo89518u.mo89605Q();
                                    c30027x22 = (C30027x2) mo89635G4;
                                    i3 &= -3670017;
                                } else {
                                    c30027x22 = c30027x2;
                                }
                                if (i13 != 0) {
                                    mo89518u.mo89638F(-492369756);
                                    Object mo89635G5 = mo89518u.mo89635G();
                                    if (mo89635G5 == InterfaceC32720Et0.f8257a.m108267a()) {
                                        mo89635G5 = new C29742w2();
                                        mo89518u.mo89503z(mo89635G5);
                                    }
                                    mo89518u.mo89605Q();
                                    c29742w22 = (C29742w2) mo89635G5;
                                    i3 &= -29360129;
                                } else {
                                    c29742w22 = c29742w2;
                                }
                                interfaceC41563gV23 = interfaceC41563gV25;
                                if (i14 != 0) {
                                    c29742w23 = c29742w22;
                                    obj = c29105a;
                                    obj2 = c29106b;
                                    function14 = null;
                                } else {
                                    function14 = function13;
                                    c29742w23 = c29742w22;
                                    obj = c29105a;
                                    obj2 = c29106b;
                                }
                                z3 = z2;
                                c50271vA63 = c50271vA62;
                                i16 = i3;
                                c30027x23 = c30027x22;
                            }
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1473276617, i16, -1, "com.google.accompanist.web.WebView (WebView.kt:70)");
                            }
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            c2012a = InterfaceC32720Et0.f8257a;
                            if (mo89635G == c2012a.m108267a()) {
                                mo89635G = LM5.m97025e(null, null, 2, null);
                                mo89518u.mo89503z(mo89635G);
                            }
                            mo89518u.mo89605Q();
                            EX2 ex2 = (EX2) mo89635G;
                            if (!z3 && c50271vA63.m9062b()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            mo89518u.mo89638F(1157296644);
                            mo89539n = mo89518u.mo89539n(ex2);
                            mo89635G2 = mo89518u.mo89635G();
                            if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                                mo89635G2 = new C29107c(ex2);
                                mo89518u.mo89503z(mo89635G2);
                            }
                            mo89518u.mo89605Q();
                            C7582Sv.m84651a(z4, (Function0) mo89635G2, mo89518u, 0, 0);
                            WebView m10704b2 = m10704b(ex2);
                            mo89518u.mo89638F(511388516);
                            mo89539n2 = mo89518u.mo89539n(c50271vA63) | mo89518u.mo89539n(ex2);
                            mo89635G3 = mo89518u.mo89635G();
                            if (!mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                                mo89635G3 = new C29108d(c50271vA63, ex2, null);
                                mo89518u.mo89503z(mo89635G3);
                            }
                            mo89518u.mo89605Q();
                            Y91.m75534e(m10704b2, c50271vA63, (Function2) mo89635G3, mo89518u, ((i16 >> 6) & 112) | 520);
                            InterfaceC48627sP5 m105193n = GM5.m105193n(obj2, mo89518u, (i16 >> 15) & 14);
                            m10704b = m10704b(ex2);
                            mo89518u.mo89638F(1370702462);
                            if (m10704b != null) {
                                Y91.m75536c(m10704b, new C29109e(m10704b, m105193n), mo89518u, 8);
                                Unit unit = Unit.INSTANCE;
                            }
                            mo89518u.mo89605Q();
                            c30027x23.m5914d(state);
                            c30027x23.m5915c(c50271vA63);
                            c29742w23.m7550b(state);
                            C29742w2 c29742w25 = c29742w23;
                            C30027x2 c30027x25 = c30027x23;
                            Object obj3 = obj2;
                            C50271vA6 c50271vA65 = c50271vA63;
                            C41282g10.m40327a(interfaceC41563gV23, null, false, C43575jt0.m29791b(mo89518u, -1606035789, true, new C29111f(((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue(), state, c50271vA63, i16, function14, obj, c29742w25, c30027x25, ex2)), mo89518u, ((i16 >> 3) & 14) | 3072, 6);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            interfaceC41563gV24 = interfaceC41563gV23;
                            z5 = z3;
                            function15 = obj;
                            function16 = function14;
                            c29742w24 = c29742w25;
                            c30027x24 = c30027x25;
                            function17 = obj3;
                            c50271vA64 = c50271vA65;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w != null) {
                            mo89512w.mo20405a(new C29114g(state, interfaceC41563gV24, z5, c50271vA64, function15, function17, c30027x24, c29742w24, function16, i, i2));
                            return;
                        }
                        return;
                    }
                    c29106b = function12;
                    i12 = i2 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i2 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                    }
                    if ((i2 & 192) != 192) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) == 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    InterfaceC41563gV2 interfaceC41563gV252 = interfaceC41563gV22;
                    if ((i2 & 8) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    interfaceC41563gV23 = interfaceC41563gV252;
                    if (i14 != 0) {
                    }
                    z3 = z2;
                    c50271vA63 = c50271vA62;
                    i16 = i3;
                    c30027x23 = c30027x22;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    EX2 ex22 = (EX2) mo89635G;
                    if (!z3) {
                    }
                    z4 = false;
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(ex22);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G2 = new C29107c(ex22);
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    C7582Sv.m84651a(z4, (Function0) mo89635G2, mo89518u, 0, 0);
                    WebView m10704b22 = m10704b(ex22);
                    mo89518u.mo89638F(511388516);
                    mo89539n2 = mo89518u.mo89539n(c50271vA63) | mo89518u.mo89539n(ex22);
                    mo89635G3 = mo89518u.mo89635G();
                    if (!mo89539n2) {
                    }
                    mo89635G3 = new C29108d(c50271vA63, ex22, null);
                    mo89518u.mo89503z(mo89635G3);
                    mo89518u.mo89605Q();
                    Y91.m75534e(m10704b22, c50271vA63, (Function2) mo89635G3, mo89518u, ((i16 >> 6) & 112) | 520);
                    InterfaceC48627sP5 m105193n2 = GM5.m105193n(obj2, mo89518u, (i16 >> 15) & 14);
                    m10704b = m10704b(ex22);
                    mo89518u.mo89638F(1370702462);
                    if (m10704b != null) {
                    }
                    mo89518u.mo89605Q();
                    c30027x23.m5914d(state);
                    c30027x23.m5915c(c50271vA63);
                    c29742w23.m7550b(state);
                    C29742w2 c29742w252 = c29742w23;
                    C30027x2 c30027x252 = c30027x23;
                    Object obj32 = obj2;
                    C50271vA6 c50271vA652 = c50271vA63;
                    C41282g10.m40327a(interfaceC41563gV23, null, false, C43575jt0.m29791b(mo89518u, -1606035789, true, new C29111f(((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue(), state, c50271vA63, i16, function14, obj, c29742w252, c30027x252, ex22)), mo89518u, ((i16 >> 3) & 14) | 3072, 6);
                    if (C35528Qt0.m87827O()) {
                    }
                    interfaceC41563gV24 = interfaceC41563gV23;
                    z5 = z3;
                    function15 = obj;
                    function16 = function14;
                    c29742w24 = c29742w252;
                    c30027x24 = c30027x252;
                    function17 = obj32;
                    c50271vA64 = c50271vA652;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                c29105a = function1;
                i10 = i2 & 32;
                if (i10 == 0) {
                }
                c29106b = function12;
                i12 = i2 & 64;
                if (i12 != 0) {
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                }
                if ((i2 & 192) != 192) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i18 != 0) {
                }
                if (i6 != 0) {
                }
                InterfaceC41563gV2 interfaceC41563gV2522 = interfaceC41563gV22;
                if ((i2 & 8) != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                interfaceC41563gV23 = interfaceC41563gV2522;
                if (i14 != 0) {
                }
                z3 = z2;
                c50271vA63 = c50271vA62;
                i16 = i3;
                c30027x23 = c30027x22;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                EX2 ex222 = (EX2) mo89635G;
                if (!z3) {
                }
                z4 = false;
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(ex222);
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G2 = new C29107c(ex222);
                mo89518u.mo89503z(mo89635G2);
                mo89518u.mo89605Q();
                C7582Sv.m84651a(z4, (Function0) mo89635G2, mo89518u, 0, 0);
                WebView m10704b222 = m10704b(ex222);
                mo89518u.mo89638F(511388516);
                mo89539n2 = mo89518u.mo89539n(c50271vA63) | mo89518u.mo89539n(ex222);
                mo89635G3 = mo89518u.mo89635G();
                if (!mo89539n2) {
                }
                mo89635G3 = new C29108d(c50271vA63, ex222, null);
                mo89518u.mo89503z(mo89635G3);
                mo89518u.mo89605Q();
                Y91.m75534e(m10704b222, c50271vA63, (Function2) mo89635G3, mo89518u, ((i16 >> 6) & 112) | 520);
                InterfaceC48627sP5 m105193n22 = GM5.m105193n(obj2, mo89518u, (i16 >> 15) & 14);
                m10704b = m10704b(ex222);
                mo89518u.mo89638F(1370702462);
                if (m10704b != null) {
                }
                mo89518u.mo89605Q();
                c30027x23.m5914d(state);
                c30027x23.m5915c(c50271vA63);
                c29742w23.m7550b(state);
                C29742w2 c29742w2522 = c29742w23;
                C30027x2 c30027x2522 = c30027x23;
                Object obj322 = obj2;
                C50271vA6 c50271vA6522 = c50271vA63;
                C41282g10.m40327a(interfaceC41563gV23, null, false, C43575jt0.m29791b(mo89518u, -1606035789, true, new C29111f(((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue(), state, c50271vA63, i16, function14, obj, c29742w2522, c30027x2522, ex222)), mo89518u, ((i16 >> 3) & 14) | 3072, 6);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV24 = interfaceC41563gV23;
                z5 = z3;
                function15 = obj;
                function16 = function14;
                c29742w24 = c29742w2522;
                c30027x24 = c30027x2522;
                function17 = obj322;
                c50271vA64 = c50271vA6522;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            i8 = i2 & 16;
            if (i8 != 0) {
            }
            c29105a = function1;
            i10 = i2 & 32;
            if (i10 == 0) {
            }
            c29106b = function12;
            i12 = i2 & 64;
            if (i12 != 0) {
            }
            i13 = i2 & 128;
            if (i13 != 0) {
            }
            i14 = i2 & 256;
            if (i14 != 0) {
            }
            if ((i2 & 192) != 192) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i18 != 0) {
            }
            if (i6 != 0) {
            }
            InterfaceC41563gV2 interfaceC41563gV25222 = interfaceC41563gV22;
            if ((i2 & 8) != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            interfaceC41563gV23 = interfaceC41563gV25222;
            if (i14 != 0) {
            }
            z3 = z2;
            c50271vA63 = c50271vA62;
            i16 = i3;
            c30027x23 = c30027x22;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            EX2 ex2222 = (EX2) mo89635G;
            if (!z3) {
            }
            z4 = false;
            mo89518u.mo89638F(1157296644);
            mo89539n = mo89518u.mo89539n(ex2222);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G2 = new C29107c(ex2222);
            mo89518u.mo89503z(mo89635G2);
            mo89518u.mo89605Q();
            C7582Sv.m84651a(z4, (Function0) mo89635G2, mo89518u, 0, 0);
            WebView m10704b2222 = m10704b(ex2222);
            mo89518u.mo89638F(511388516);
            mo89539n2 = mo89518u.mo89539n(c50271vA63) | mo89518u.mo89539n(ex2222);
            mo89635G3 = mo89518u.mo89635G();
            if (!mo89539n2) {
            }
            mo89635G3 = new C29108d(c50271vA63, ex2222, null);
            mo89518u.mo89503z(mo89635G3);
            mo89518u.mo89605Q();
            Y91.m75534e(m10704b2222, c50271vA63, (Function2) mo89635G3, mo89518u, ((i16 >> 6) & 112) | 520);
            InterfaceC48627sP5 m105193n222 = GM5.m105193n(obj2, mo89518u, (i16 >> 15) & 14);
            m10704b = m10704b(ex2222);
            mo89518u.mo89638F(1370702462);
            if (m10704b != null) {
            }
            mo89518u.mo89605Q();
            c30027x23.m5914d(state);
            c30027x23.m5915c(c50271vA63);
            c29742w23.m7550b(state);
            C29742w2 c29742w25222 = c29742w23;
            C30027x2 c30027x25222 = c30027x23;
            Object obj3222 = obj2;
            C50271vA6 c50271vA65222 = c50271vA63;
            C41282g10.m40327a(interfaceC41563gV23, null, false, C43575jt0.m29791b(mo89518u, -1606035789, true, new C29111f(((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue(), state, c50271vA63, i16, function14, obj, c29742w25222, c30027x25222, ex2222)), mo89518u, ((i16 >> 3) & 14) | 3072, 6);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV24 = interfaceC41563gV23;
            z5 = z3;
            function15 = obj;
            function16 = function14;
            c29742w24 = c29742w25222;
            c30027x24 = c30027x25222;
            function17 = obj3222;
            c50271vA64 = c50271vA65222;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        i8 = i2 & 16;
        if (i8 != 0) {
        }
        c29105a = function1;
        i10 = i2 & 32;
        if (i10 == 0) {
        }
        c29106b = function12;
        i12 = i2 & 64;
        if (i12 != 0) {
        }
        i13 = i2 & 128;
        if (i13 != 0) {
        }
        i14 = i2 & 256;
        if (i14 != 0) {
        }
        if ((i2 & 192) != 192) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i18 != 0) {
        }
        if (i6 != 0) {
        }
        InterfaceC41563gV2 interfaceC41563gV252222 = interfaceC41563gV22;
        if ((i2 & 8) != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        interfaceC41563gV23 = interfaceC41563gV252222;
        if (i14 != 0) {
        }
        z3 = z2;
        c50271vA63 = c50271vA62;
        i16 = i3;
        c30027x23 = c30027x22;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        EX2 ex22222 = (EX2) mo89635G;
        if (!z3) {
        }
        z4 = false;
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(ex22222);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G2 = new C29107c(ex22222);
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        C7582Sv.m84651a(z4, (Function0) mo89635G2, mo89518u, 0, 0);
        WebView m10704b22222 = m10704b(ex22222);
        mo89518u.mo89638F(511388516);
        mo89539n2 = mo89518u.mo89539n(c50271vA63) | mo89518u.mo89539n(ex22222);
        mo89635G3 = mo89518u.mo89635G();
        if (!mo89539n2) {
        }
        mo89635G3 = new C29108d(c50271vA63, ex22222, null);
        mo89518u.mo89503z(mo89635G3);
        mo89518u.mo89605Q();
        Y91.m75534e(m10704b22222, c50271vA63, (Function2) mo89635G3, mo89518u, ((i16 >> 6) & 112) | 520);
        InterfaceC48627sP5 m105193n2222 = GM5.m105193n(obj2, mo89518u, (i16 >> 15) & 14);
        m10704b = m10704b(ex22222);
        mo89518u.mo89638F(1370702462);
        if (m10704b != null) {
        }
        mo89518u.mo89605Q();
        c30027x23.m5914d(state);
        c30027x23.m5915c(c50271vA63);
        c29742w23.m7550b(state);
        C29742w2 c29742w252222 = c29742w23;
        C30027x2 c30027x252222 = c30027x23;
        Object obj32222 = obj2;
        C50271vA6 c50271vA652222 = c50271vA63;
        C41282g10.m40327a(interfaceC41563gV23, null, false, C43575jt0.m29791b(mo89518u, -1606035789, true, new C29111f(((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue(), state, c50271vA63, i16, function14, obj, c29742w252222, c30027x252222, ex22222)), mo89518u, ((i16 >> 3) & 14) | 3072, 6);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV24 = interfaceC41563gV23;
        z5 = z3;
        function15 = obj;
        function16 = function14;
        c29742w24 = c29742w252222;
        c30027x24 = c30027x252222;
        function17 = obj32222;
        c50271vA64 = c50271vA652222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: b */
    public static final WebView m10704b(EX2<WebView> ex2) {
        return ex2.getValue();
    }

    /* renamed from: c */
    public static final void m10703c(EX2<WebView> ex2, WebView webView) {
        ex2.setValue(webView);
    }

    /* renamed from: d */
    public static final Function1<WebView, Unit> m10702d(InterfaceC48627sP5<? extends Function1<? super WebView, Unit>> interfaceC48627sP5) {
        return (Function1) interfaceC48627sP5.getValue();
    }

    /* renamed from: h */
    public static final C50271vA6 m10698h(ZC0 zc0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(1602323198);
        if ((i2 & 1) != 0) {
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            zc0 = ((C42992iu0) mo89635G).m31665a();
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1602323198, i, -1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:428)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(zc0);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C50271vA6(zc0);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        C50271vA6 c50271vA6 = (C50271vA6) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c50271vA6;
    }

    /* renamed from: i */
    public static final BA6 m10697i(String data, String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        interfaceC32720Et0.mo89638F(993282027);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(993282027, i, -1, "com.google.accompanist.web.rememberWebViewStateWithHTMLData (WebView.kt:476)");
        }
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(data) | interfaceC32720Et0.mo89539n(str);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new BA6(new AbstractC36758Vz6.C8886a(data, str));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        BA6 ba6 = (BA6) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return ba6;
    }

    /* renamed from: j */
    public static final AbstractC36758Vz6.C8887b m10696j(AbstractC36758Vz6 abstractC36758Vz6, String url) {
        Intrinsics.checkNotNullParameter(abstractC36758Vz6, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        if (abstractC36758Vz6 instanceof AbstractC36758Vz6.C8887b) {
            return AbstractC36758Vz6.C8887b.m79019c((AbstractC36758Vz6.C8887b) abstractC36758Vz6, url, null, 2, null);
        }
        return new AbstractC36758Vz6.C8887b(url, null, 2, null);
    }
}
