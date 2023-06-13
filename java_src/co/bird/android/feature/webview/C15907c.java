package co.bird.android.feature.webview;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.webview.C15907c;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001\u000eBI\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, m28432d2 = {"Lco/bird/android/feature/webview/c;", "", "", "archiveName", "", "k", "l", "", DateTokenConverter.CONVERTER_KEY, "e", "g", "Lco/bird/android/feature/webview/RequestContext;", "f", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LAz6;", "b", "LAz6;", "webArchiveManager", "Lhq;", "c", "Lhq;", "authManager", "LBc;", "LBc;", "deviceManager", "Le13;", "Le13;", "navigator", "Lwi2;", "Lwi2;", "deserializer", "LnA6;", "LnA6;", "ui", "LOh;", "h", "LOh;", "appBuildConfig", "i", "Ljava/lang/String;", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LAz6;Lhq;LBc;Le13;Lwi2;LnA6;LOh;)V", "j", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebViewArchivePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,199:1\n180#2:200\n*S KotlinDebug\n*F\n+ 1 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter\n*L\n122#1:200\n*E\n"})
/* renamed from: co.bird.android.feature.webview.c */
/* loaded from: classes3.dex */
public final class C15907c {

    /* renamed from: j */
    public static final C15908a f65899j = new C15908a(null);

    /* renamed from: a */
    public final ScopeProvider f65900a;

    /* renamed from: b */
    public final InterfaceC31844Az6 f65901b;

    /* renamed from: c */
    public final InterfaceC22767hq f65902c;

    /* renamed from: d */
    public final InterfaceC0650Bc f65903d;

    /* renamed from: e */
    public final InterfaceC40099e13 f65904e;

    /* renamed from: f */
    public final C51174wi2 f65905f;

    /* renamed from: g */
    public final C45529nA6 f65906g;

    /* renamed from: h */
    public final InterfaceC6097Oh f65907h;

    /* renamed from: i */
    public String f65908i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/webview/c$a;", "", "", "NAVIGATE_COMMAND_OPEN_URL_IN_APP", "Ljava/lang/String;", "NAVIGATE_COMMAND_URL", "REQUEST_CONTEXT_PLATFORM", "SET_TITLE_PARAM", "<init>", "()V", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$a */
    /* loaded from: classes3.dex */
    public static final class C15908a {
        public /* synthetic */ C15908a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15908a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "", "it", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "b", "(Ljava/util/Map;)Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$b */
    /* loaded from: classes3.dex */
    public static final class C15909b extends Lambda implements Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, ? extends Object>>>> {
        public C15909b() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m56281c(C15907c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return Optional.f63040c.m59033b(this$0.m56290f().params());
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final AbstractC23442F<Optional<Map<String, Object>>> invoke(Map<String, ? extends Object> map) {
            final C15907c c15907c = C15907c.this;
            AbstractC23442F<Optional<Map<String, Object>>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: iA6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Optional m56281c;
                    m56281c = C15907c.C15909b.m56281c(C15907c.this);
                    return m56281c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n         …ext().params())\n        }");
            return m33161E;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "", "it", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "b", "(Ljava/util/Map;)Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$c */
    /* loaded from: classes3.dex */
    public static final class C15910c extends Lambda implements Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, ? extends Object>>>> {
        public C15910c() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m56278c(C15907c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f65904e.close();
            return Optional.f63040c.m59034a();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final AbstractC23442F<Optional<Map<String, Object>>> invoke(Map<String, ? extends Object> map) {
            final C15907c c15907c = C15907c.this;
            AbstractC23442F<Optional<Map<String, Object>>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: jA6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Optional m56278c;
                    m56278c = C15907c.C15910c.m56278c(C15907c.this);
                    return m56278c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n         …tional.absent()\n        }");
            return m33161E;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "", "it", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "b", "(Ljava/util/Map;)Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWebViewArchivePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter$configureWebBridge$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
    /* renamed from: co.bird.android.feature.webview.c$d */
    /* loaded from: classes3.dex */
    public static final class C15911d extends Lambda implements Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, ? extends Object>>>> {
        public C15911d() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m56275c(Map map, C15907c this$0) {
            Object obj;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String str = null;
            if (map != null) {
                obj = map.get("title");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
            if (str != null) {
                this$0.f65906g.m24229t(str);
            }
            return Optional.f63040c.m59034a();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final AbstractC23442F<Optional<Map<String, Object>>> invoke(final Map<String, ? extends Object> map) {
            final C15907c c15907c = C15907c.this;
            AbstractC23442F<Optional<Map<String, Object>>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: kA6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Optional m56275c;
                    m56275c = C15907c.C15911d.m56275c(map, c15907c);
                    return m56275c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n         …tional.absent()\n        }");
            return m33161E;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "", "it", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "(Ljava/util/Map;)Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$e */
    /* loaded from: classes3.dex */
    public static final class C15912e extends Lambda implements Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, ? extends Object>>>> {

        /* renamed from: g */
        public static final C15912e f65912g = new C15912e();

        public C15912e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<Optional<Map<String, Object>>> invoke(Map<String, ? extends Object> map) {
            EnumC52557z20 enumC52557z20 = EnumC52557z20.SHOW_ALERT;
            AbstractC23442F<Optional<Map<String, Object>>> m33100x = AbstractC23442F.m33100x(new NotImplementedError(enumC52557z20 + " has not been implemented on the Android client"));
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotImplementedErro… on the Android client\"))");
            return m33100x;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "", "it", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "b", "(Ljava/util/Map;)Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$f */
    /* loaded from: classes3.dex */
    public static final class C15913f extends Lambda implements Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, ? extends Object>>>> {
        public C15913f() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m56271c(Map map, C15907c this$0) {
            Object obj;
            String str;
            Object obj2;
            Boolean bool;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (map != null) {
                obj = map.get("url");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (map != null) {
                obj2 = map.get("open_url_in_app");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Boolean) {
                bool = (Boolean) obj2;
            } else {
                bool = null;
            }
            if (str != null) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    InterfaceC40099e13.C19924a.goToWebView$default(this$0.f65904e, str, null, null, false, 14, null);
                } else {
                    this$0.f65904e.mo36983m2(str);
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final AbstractC23442F<Optional<Map<String, Object>>> invoke(final Map<String, ? extends Object> map) {
            final C15907c c15907c = C15907c.this;
            AbstractC23442F<Optional<Map<String, Object>>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: lA6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Optional m56271c;
                    m56271c = C15907c.C15913f.m56271c(map, c15907c);
                    return m56271c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n         …\n          null\n        }");
            return m33161E;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "", "it", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "(Ljava/util/Map;)Lio/reactivex/F;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$g */
    /* loaded from: classes3.dex */
    public static final class C15914g extends Lambda implements Function1<Map<String, ? extends Object>, AbstractC23442F<Optional<Map<String, ? extends Object>>>> {

        /* renamed from: g */
        public static final C15914g f65914g = new C15914g();

        public C15914g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<Optional<Map<String, Object>>> invoke(Map<String, ? extends Object> map) {
            EnumC52557z20 enumC52557z20 = EnumC52557z20.INCOMPATIBLE_CLIENT_VERSION;
            AbstractC23442F<Optional<Map<String, Object>>> m33100x = AbstractC23442F.m33100x(new NotImplementedError(enumC52557z20 + " has not been implemented on the Android client"));
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotImplementedErro… on the Android client\"))");
            return m33100x;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lvz6;", "list", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWebViewArchivePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter$initArchiveStream$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1054#2:200\n288#2,2:201\n1#3:203\n*S KotlinDebug\n*F\n+ 1 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter$initArchiveStream$1\n*L\n115#1:200\n116#1:201,2\n*E\n"})
    /* renamed from: co.bird.android.feature.webview.c$h */
    /* loaded from: classes3.dex */
    public static final class C15915h extends Lambda implements Function1<List<? extends C50755vz6>, Optional<C50755vz6>> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter$initArchiveStream$1\n*L\n1#1,328:1\n115#2:329\n*E\n"})
        /* renamed from: co.bird.android.feature.webview.c$h$a */
        /* loaded from: classes3.dex */
        public static final class C15916a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(((C50755vz6) t2).m7613g(), ((C50755vz6) t).m7613g());
                return compareValues;
            }
        }

        public C15915h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<C50755vz6> invoke(List<C50755vz6> list) {
            List sortedWith;
            Object obj;
            Intrinsics.checkNotNullParameter(list, "list");
            C41318g46.m40163a("availableArchives update received, starting filter check of " + list, new Object[0]);
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C15916a());
            C15907c c15907c = C15907c.this;
            Iterator it = sortedWith.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((C50755vz6) obj).m7615e(), c15907c.f65908i)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return Optional.f63040c.m59033b((C50755vz6) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lvz6;", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lvz6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$i */
    /* loaded from: classes3.dex */
    public static final class C15917i extends Lambda implements Function1<Optional<C50755vz6>, C50755vz6> {

        /* renamed from: g */
        public static final C15917i f65916g = new C15917i();

        public C15917i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C50755vz6 invoke(Optional<C50755vz6> optional) {
            return optional.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lvz6;", "kotlin.jvm.PlatformType", "archive", "", C17296a.f69688o, "(Lvz6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.webview.c$j */
    /* loaded from: classes3.dex */
    public static final class C15918j extends Lambda implements Function1<C50755vz6, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.webview.c$j$a */
        /* loaded from: classes3.dex */
        public static final class C15919a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C15907c f65918g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15919a(C15907c c15907c) {
                super(0);
                this.f65918g = c15907c;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f65918g.f65904e.close();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.webview.c$j$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C15920b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC34886Nz6.values().length];
                try {
                    iArr[EnumC34886Nz6.FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC34886Nz6.READY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C15918j() {
            super(1);
        }

        /* renamed from: a */
        public final void m56267a(C50755vz6 c50755vz6) {
            String replace$default;
            int i = C15920b.$EnumSwitchMapping$0[c50755vz6.m7614f().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    S74.C7343a.showProgress$default(C15907c.this.f65906g, true, 0, 2, null);
                    return;
                }
                S74.C7343a.showProgress$default(C15907c.this.f65906g, false, 0, 2, null);
                S74.C7343a.showProgress$default(C15907c.this.f65906g, false, 0, 2, null);
                C41318g46.m40163a("attempting to load " + c50755vz6, new Object[0]);
                String m7618b = c50755vz6.m7618b();
                if (c50755vz6.m7617c() && m7618b != null) {
                    C41318g46.m40163a("remotely loading " + m7618b, new Object[0]);
                    C15907c.this.f65906g.m24231Sl(m7618b);
                    return;
                }
                File m7616d = c50755vz6.m7616d();
                if (m7616d != null) {
                    C15907c c15907c = C15907c.this;
                    String uri = m7616d.toURI().toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "file.toURI().toString()");
                    replace$default = StringsKt__StringsJVMKt.replace$default(uri, "file:/", "file:///", false, 4, (Object) null);
                    String str = replace$default + "index.html";
                    C41318g46.m40163a("resolved local file url: " + str, new Object[0]);
                    c15907c.f65906g.m24231Sl(str);
                    return;
                }
                return;
            }
            S74.C7343a.showProgress$default(C15907c.this.f65906g, false, 0, 2, null);
            H31.C3014a.showDialog$default(C15907c.this.f65906g, C53127zz6.f122560d, false, false, new C15919a(C15907c.this), null, null, null, 116, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50755vz6 c50755vz6) {
            m56267a(c50755vz6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.webview.c$k */
    /* loaded from: classes3.dex */
    public static final class C15921k extends Lambda implements Function1<Throwable, Unit> {
        public C15921k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C45529nA6 c45529nA6 = C15907c.this.f65906g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c45529nA6.error(it);
        }
    }

    public C15907c(ScopeProvider scopeProvider, InterfaceC31844Az6 webArchiveManager, InterfaceC22767hq authManager, InterfaceC0650Bc deviceManager, InterfaceC40099e13 navigator, C51174wi2 deserializer, C45529nA6 ui, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(webArchiveManager, "webArchiveManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f65900a = scopeProvider;
        this.f65901b = webArchiveManager;
        this.f65902c = authManager;
        this.f65903d = deviceManager;
        this.f65904e = navigator;
        this.f65905f = deserializer;
        this.f65906g = ui;
        this.f65907h = appBuildConfig;
    }

    /* renamed from: h */
    public static final Optional m56288h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m56287i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m56286j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final boolean m56292d() {
        return this.f65906g.m24233Ql();
    }

    /* renamed from: e */
    public final void m56291e() {
        InterfaceC36524Uz6 m24232Rl = this.f65906g.m24232Rl();
        m24232Rl.mo56047b(this.f65905f);
        m24232Rl.mo56048a(EnumC52557z20.REQUEST_CONTEXT.toString(), new C15909b());
        m24232Rl.mo56048a(EnumC52557z20.CLOSE_VIEW.toString(), new C15910c());
        m24232Rl.mo56048a(EnumC52557z20.SET_TITLE.toString(), new C15911d());
        m24232Rl.mo56048a(EnumC52557z20.SHOW_ALERT.toString(), C15912e.f65912g);
        m24232Rl.mo56048a(EnumC52557z20.NAVIGATE.toString(), new C15913f());
        m24232Rl.mo56048a(EnumC52557z20.INCOMPATIBLE_CLIENT_VERSION.toString(), C15914g.f65914g);
    }

    /* renamed from: f */
    public final RequestContext m56290f() {
        String mo89926f;
        String mo15264c = this.f65902c.mo15264c();
        if (mo15264c == null) {
            mo15264c = "";
        }
        String str = mo15264c;
        String m7765i = C50711vv2.m7769e().m7765i();
        Intrinsics.checkNotNullExpressionValue(m7765i, "getDefault().toLanguageTags()");
        String mo89931a = this.f65907h.mo89931a();
        if (Intrinsics.areEqual(this.f65907h.mo89926f(), "birdOperator")) {
            mo89926f = "bird";
        } else {
            mo89926f = this.f65907h.mo89926f();
        }
        return new RequestContext(str, m7765i, "android", mo89931a, mo89926f, this.f65903d.getDeviceId(), "");
    }

    /* renamed from: g */
    public final void m56289g() {
        Observable<List<C50755vz6>> observeOn = this.f65901b.mo99405a().observeOn(C24542a.m31934a());
        final C15915h c15915h = new C15915h();
        Observable<R> map = observeOn.map(new InterfaceC23492o() { // from class: fA6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m56288h;
                m56288h = C15907c.m56288h(Function1.this, obj);
                return m56288h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun initArchiveS…ui.error(it)\n      })\n  }");
        Observable observeOn2 = C37279Yf5.m74575T(map, C15917i.f65916g).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "private fun initArchiveS…ui.error(it)\n      })\n  }");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f65900a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15918j c15918j = new C15918j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gA6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15907c.m56287i(Function1.this, obj);
            }
        };
        final C15921k c15921k = new C15921k();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hA6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C15907c.m56286j(Function1.this, obj);
            }
        });
    }

    /* renamed from: k */
    public final void m56285k(String str) {
        C41318g46.m40163a("onCreate called for " + str, new Object[0]);
        this.f65908i = str;
    }

    /* renamed from: l */
    public final void m56284l() {
        m56291e();
        m56289g();
    }
}
