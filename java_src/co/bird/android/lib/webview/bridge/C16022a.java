package co.bird.android.lib.webview.bridge;

import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.lib.webview.bridge.AbstractC16030b;
import co.bird.android.lib.webview.bridge.C16022a;
import co.bird.android.lib.webview.bridge.WebError;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\b4\u00105JN\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022<\u0010\t\u001a8\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\b0\u00070\u0004H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\b0\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J2\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\u001a\u001a\u00020\n\"\u0004\b\u0000\u0010\u0017*\u00020\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002R\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)RX\u0010-\u001aD\u0012\u0004\u0012\u00020\u0002\u0012:\u00128\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\b0\u00070\u00040+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010,R<\u0010/\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\b0.0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R*\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 1*\b\u0012\u0002\b\u0003\u0018\u00010\u00100\u0010008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102¨\u00066"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/a;", "LOz6;", "", "commandName", "Lkotlin/Function1;", "", "", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "handler", "", C17296a.f69688o, "message", "postMessage", "h", "j", "Lco/bird/android/lib/webview/bridge/b$b;", "payload", "g", "callbackId", "params", "error", "f", "T", "Landroid/webkit/WebView;", "Lco/bird/android/lib/webview/bridge/b;", "i", "b", "Landroid/webkit/WebView;", "webView", "Lwi2;", "c", "Lwi2;", "deserializer", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "e", "Ljava/lang/Object;", "lock", "", "Ljava/util/Map;", "registeredHandlers", "Lio/reactivex/H;", "callbackEmitters", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "commandSubject", "<init>", "(Landroid/webkit/WebView;Lwi2;Lcom/uber/autodispose/ScopeProvider;)V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebBridgeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebBridgeImpl.kt\nco/bird/android/lib/webview/bridge/WebBridgeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,154:1\n1#2:155\n180#3:156\n*S KotlinDebug\n*F\n+ 1 WebBridgeImpl.kt\nco/bird/android/lib/webview/bridge/WebBridgeImpl\n*L\n109#1:156\n*E\n"})
/* renamed from: co.bird.android.lib.webview.bridge.a */
/* loaded from: classes3.dex */
public final class C16022a implements InterfaceC35120Oz6 {

    /* renamed from: i */
    public static final C16023a f66080i = new C16023a(null);

    /* renamed from: b */
    public final WebView f66081b;

    /* renamed from: c */
    public final C51174wi2 f66082c;

    /* renamed from: d */
    public final ScopeProvider f66083d;

    /* renamed from: e */
    public final Object f66084e;

    /* renamed from: f */
    public Map<String, Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, Object>>>>> f66085f;

    /* renamed from: g */
    public Map<String, InterfaceC23444H<Optional<Map<String, Object>>>> f66086g;

    /* renamed from: h */
    public final C24558d<AbstractC16030b.C16032b<?>> f66087h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/a$a;", "", "", "INTERFACE_NAME", "Ljava/lang/String;", "<init>", "()V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.a$a */
    /* loaded from: classes3.dex */
    public static final class C16023a {
        public /* synthetic */ C16023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16023a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"co/bird/android/lib/webview/bridge/a$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewDetachedFromWindow", "onViewAttachedToWindow", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.a$b */
    /* loaded from: classes3.dex */
    public static final class View$OnAttachStateChangeListenerC16024b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC16024b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C16022a.this.m56068j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\t\u001aº\u0001\u0012V\b\u0001\u0012R\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000 \b*(\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0018\u00010\u00030\u0003 \b*\\\u0012V\b\u0001\u0012R\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000 \b*(\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/b$b;", "command", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "", "", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/lib/webview/bridge/b$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.a$c */
    /* loaded from: classes3.dex */
    public static final class C16025c extends Lambda implements Function1<AbstractC16030b.C16032b<?>, InterfaceC23447K<? extends Pair<? extends Optional<Map<String, ? extends Object>>, ? extends AbstractC16030b.C16032b<?>>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aR\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006 \u0007*(\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "", "", "it", "Lkotlin/Pair;", "Lco/bird/android/lib/webview/bridge/b$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.lib.webview.bridge.a$c$a */
        /* loaded from: classes3.dex */
        public static final class C16026a extends Lambda implements Function1<Optional<Map<String, ? extends Object>>, Pair<? extends Optional<Map<String, ? extends Object>>, ? extends AbstractC16030b.C16032b<?>>> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC16030b.C16032b<?> f66090g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16026a(AbstractC16030b.C16032b<?> c16032b) {
                super(1);
                this.f66090g = c16032b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<Map<String, Object>>, AbstractC16030b.C16032b<?>> invoke(Optional<Map<String, Object>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f66090g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.lib.webview.bridge.a$c$b */
        /* loaded from: classes3.dex */
        public static final class C16027b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC16030b.C16032b<?> f66091g;

            /* renamed from: h */
            public final /* synthetic */ C16022a f66092h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16027b(AbstractC16030b.C16032b<?> c16032b, C16022a c16022a) {
                super(1);
                this.f66091g = c16032b;
                this.f66092h = c16022a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.f66091g.mo56057a() != null) {
                    C16022a c16022a = this.f66092h;
                    WebView webView = c16022a.f66081b;
                    String mo56057a = this.f66091g.mo56057a();
                    String message = th.getMessage();
                    if (message == null) {
                        message = "Something went wrong";
                    }
                    c16022a.m56069i(webView, new AbstractC16030b.C16031a(mo56057a, message));
                }
            }
        }

        public C16025c() {
            super(1);
        }

        /* renamed from: d */
        public static final void m56061d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<Optional<Map<String, Object>>, AbstractC16030b.C16032b<?>>> invoke(AbstractC16030b.C16032b<?> command) {
            Intrinsics.checkNotNullParameter(command, "command");
            AbstractC23442F m56071g = C16022a.this.m56071g(command);
            final C16026a c16026a = new C16026a(command);
            AbstractC23442F m33152N = m56071g.m33157I(new InterfaceC23492o() { // from class: Sz6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C16022a.C16025c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).m33152N(C23454a.m33087a());
            final C16027b c16027b = new C16027b(command, C16022a.this);
            return m33152N.m33106t(new InterfaceC23484g() { // from class: Tz6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C16022a.C16025c.m56061d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2V\u0010\u0007\u001aR\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005 \u0006*(\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "", "", "Lco/bird/android/lib/webview/bridge/b$b;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.a$d */
    /* loaded from: classes3.dex */
    public static final class C16028d extends Lambda implements Function1<Pair<? extends Optional<Map<String, ? extends Object>>, ? extends AbstractC16030b.C16032b<?>>, Unit> {
        public C16028d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<Map<String, ? extends Object>>, ? extends AbstractC16030b.C16032b<?>> pair) {
            invoke2((Pair<Optional<Map<String, Object>>, ? extends AbstractC16030b.C16032b<?>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<Map<String, Object>>, ? extends AbstractC16030b.C16032b<?>> pair) {
            Optional<Map<String, Object>> component1 = pair.component1();
            AbstractC16030b.C16032b<?> component2 = pair.component2();
            if (component2.mo56057a() != null) {
                C16022a c16022a = C16022a.this;
                c16022a.m56069i(c16022a.f66081b, new AbstractC16030b.C16033c(component2.mo56057a(), component1.m59035e()));
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.lib.webview.bridge.a$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C16029e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16029e f66094b = new C16029e();

        public C16029e() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public C16022a(WebView webView, C51174wi2 deserializer, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f66081b = webView;
        this.f66082c = deserializer;
        this.f66083d = scopeProvider;
        this.f66084e = new Object();
        this.f66085f = new LinkedHashMap();
        this.f66086g = new LinkedHashMap();
        C24558d<AbstractC16030b.C16032b<?>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WebPayload.InvokeCommand<*>>()");
        this.f66087h = m31902e;
        webView.addJavascriptInterface(this, "android");
        m56070h();
    }

    /* renamed from: k */
    public static final InterfaceC23447K m56067k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m56066l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m56065m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35120Oz6
    /* renamed from: a */
    public void mo56048a(String commandName, Function1<? super Map<String, ? extends Object>, ? extends AbstractC23442F<Optional<Map<String, Object>>>> handler) {
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f66085f.put(commandName, handler);
    }

    /* renamed from: f */
    public final void m56072f(String str, Map<String, ? extends Object> map, String str2) {
        InterfaceC23444H<Optional<Map<String, Object>>> remove;
        synchronized (this.f66084e) {
            remove = this.f66086g.remove(str);
        }
        if (remove == null || remove.mo1769e()) {
            return;
        }
        if (str2 != null) {
            remove.onError(new WebError.Callback(str2));
        } else {
            remove.onSuccess(Optional.f63040c.m59033b(map));
        }
    }

    /* renamed from: g */
    public final AbstractC23442F<Optional<Map<String, Object>>> m56071g(AbstractC16030b.C16032b<?> c16032b) {
        AbstractC23442F<Optional<Map<String, Object>>> invoke;
        Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, Object>>>> function1 = this.f66085f.get(c16032b.mo56056b());
        if (function1 == null || (invoke = function1.invoke(c16032b.mo56054d())) == null) {
            String mo56056b = c16032b.mo56056b();
            AbstractC23442F<Optional<Map<String, Object>>> m33100x = AbstractC23442F.m33100x(new NullPointerException("No handler registered for command: " + mo56056b));
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NullPointerExcepti…${payload.commandName}\"))");
            return m33100x;
        }
        return invoke;
    }

    /* renamed from: h */
    public final void m56070h() {
        if (this.f66081b.isAttachedToWindow()) {
            m56068j();
        } else {
            this.f66081b.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC16024b());
        }
    }

    /* renamed from: i */
    public final <T> void m56069i(WebView webView, AbstractC16030b<T> abstractC16030b) {
        String replace$default;
        String replace$default2;
        String replace$default3;
        String replace$default4;
        String replace$default5;
        String replace$default6;
        replace$default = StringsKt__StringsJVMKt.replace$default(this.f66082c.m6453i(abstractC16030b), "\\", "\\\\", false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "\"", "\\\"", false, 4, (Object) null);
        replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "'", "\\'", false, 4, (Object) null);
        replace$default4 = StringsKt__StringsJVMKt.replace$default(replace$default3, "\n", "\\n", false, 4, (Object) null);
        replace$default5 = StringsKt__StringsJVMKt.replace$default(replace$default4, "\r", "\\r", false, 4, (Object) null);
        replace$default6 = StringsKt__StringsJVMKt.replace$default(replace$default5, SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\\t", false, 4, (Object) null);
        C41318g46.m40163a("sending payload to JS - " + replace$default6, new Object[0]);
        webView.evaluateJavascript("window.motmot._sendMessage('" + replace$default6 + "')", null);
    }

    /* renamed from: j */
    public final void m56068j() {
        C24558d<AbstractC16030b.C16032b<?>> c24558d = this.f66087h;
        final C16025c c16025c = new C16025c();
        Observable observeOn = c24558d.concatMapSingle(new InterfaceC23492o() { // from class: Pz6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m56067k;
                m56067k = C16022a.m56067k(Function1.this, obj);
                return m56067k;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun startCommand…      }, (Timber::e))\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f66083d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16028d c16028d = new C16028d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Qz6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C16022a.m56066l(Function1.this, obj);
            }
        };
        final C16029e c16029e = C16029e.f66094b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Rz6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C16022a.m56065m(Function1.this, obj);
            }
        });
    }

    @JavascriptInterface
    public final void postMessage(String message) {
        boolean z;
        Unit unit;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            AbstractC16030b abstractC16030b = (AbstractC16030b) this.f66082c.m6459c(message, Reflection.getOrCreateKotlinClass(AbstractC16030b.class));
            if (abstractC16030b instanceof AbstractC16030b.C16032b) {
                this.f66087h.onNext(abstractC16030b);
                return;
            }
            if (abstractC16030b instanceof AbstractC16030b.C16033c) {
                z = true;
            } else {
                z = abstractC16030b instanceof AbstractC16030b.C16031a;
            }
            if (z) {
                String mo56057a = abstractC16030b.mo56057a();
                if (mo56057a != null) {
                    m56072f(mo56057a, abstractC16030b.mo56054d(), abstractC16030b.mo56055c());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C41318g46.m40163a("Unable to notify callbacks of updated status for payload " + abstractC16030b, new Object[0]);
                }
            }
        } catch (Exception e) {
            C41318g46.m40159e(e);
        }
    }
}
