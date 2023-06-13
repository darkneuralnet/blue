package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.QuickLinkBehavior;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePart;
import co.bird.android.model.wire.WireQuickLink;
import co.bird.api.response.AdjustInventoryCountResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LX82;", "", "", "category", "partSku", "", "k", "m", "", "e", "l", "LXl3;", C17296a.f69688o, "LXl3;", "partManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "LY82;", DateTokenConverter.CONVERTER_KEY, "LY82;", "partUi", "LcI3;", "LcI3;", "partConverter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "partSkuSubject", "<init>", "(LXl3;Lcom/uber/autodispose/ScopeProvider;Le13;LY82;LcI3;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryPartDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartDetailsPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,80:1\n180#2:81\n180#2:82\n180#2:83\n180#2:84\n*S KotlinDebug\n*F\n+ 1 InventoryPartDetailsPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartDetailsPresenter\n*L\n41#1:81\n54#1:82\n58#1:83\n65#1:84\n*E\n"})
/* renamed from: X82 */
/* loaded from: classes3.dex */
public final class X82 {

    /* renamed from: a */
    public final InterfaceC37097Xl3 f42712a;

    /* renamed from: b */
    public final ScopeProvider f42713b;

    /* renamed from: c */
    public final InterfaceC40099e13 f42714c;

    /* renamed from: d */
    public final Y82 f42715d;

    /* renamed from: e */
    public final C39058cI3 f42716e;

    /* renamed from: f */
    public final C24552a<String> f42717f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireQuickLink;", "kotlin.jvm.PlatformType", "quickLink", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireQuickLink;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X82$a */
    /* loaded from: classes3.dex */
    public static final class C9320a extends Lambda implements Function1<WireQuickLink, Unit> {
        public C9320a() {
            super(1);
        }

        /* renamed from: a */
        public final void m77296a(WireQuickLink wireQuickLink) {
            String url;
            if (wireQuickLink.getLinkBehavior() == QuickLinkBehavior.EXTERNAL_WEB_VIEW && (url = wireQuickLink.getUrl()) != null) {
                InterfaceC40099e13.C19924a.goToWebView$default(X82.this.f42714c, url, wireQuickLink.getDisplay(), null, false, 12, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
            m77296a(wireQuickLink);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "partSku", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X82$b */
    /* loaded from: classes3.dex */
    public static final class C9321b extends Lambda implements Function1<String, InterfaceC23447K<? extends WireInventoryPart>> {
        public C9321b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireInventoryPart> invoke(String partSku) {
            Intrinsics.checkNotNullParameter(partSku, "partSku");
            return X82.this.f42712a.mo40850a(partSku).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireInventoryPart;", "it", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireInventoryPart;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X82$c */
    /* loaded from: classes3.dex */
    public static final class C9322c extends Lambda implements Function1<WireInventoryPart, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C9322c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(WireInventoryPart it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return X82.this.f42716e.m61618b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X82$d */
    /* loaded from: classes3.dex */
    public static final class C9323d extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C9323d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            Y82 y82 = X82.this.f42715d;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            y82.m75554Vl(sections);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X82$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9324e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9324e(Object obj) {
            super(1, obj, X82.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((X82) this.receiver).m77308l(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X82$f */
    /* loaded from: classes3.dex */
    public static final class C9325f extends Lambda implements Function1<Pair<? extends Integer, ? extends String>, InterfaceC23447K<? extends List<? extends AdjustInventoryCountResponse>>> {
        public C9325f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<AdjustInventoryCountResponse>> invoke(Pair<Integer, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            int intValue = pair.component1().intValue();
            String partSku = pair.component2();
            InterfaceC37097Xl3 interfaceC37097Xl3 = X82.this.f42712a;
            Intrinsics.checkNotNullExpressionValue(partSku, "partSku");
            return interfaceC37097Xl3.mo40847d(partSku, intValue).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X82$g */
    /* loaded from: classes3.dex */
    public static final class C9326g extends Lambda implements Function1<List<? extends AdjustInventoryCountResponse>, Unit> {

        /* renamed from: g */
        public static final C9326g f42723g = new C9326g();

        public C9326g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<AdjustInventoryCountResponse> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AdjustInventoryCountResponse> list) {
            invoke2((List<AdjustInventoryCountResponse>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X82$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9327h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9327h(Object obj) {
            super(1, obj, X82.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((X82) this.receiver).m77308l(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X82$i */
    /* loaded from: classes3.dex */
    public static final class C9328i extends Lambda implements Function1<WirePart, Unit> {
        public C9328i() {
            super(1);
        }

        /* renamed from: a */
        public final void m77293a(WirePart wirePart) {
            X82.onCreate$default(X82.this, null, wirePart.getKey(), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m77293a(wirePart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X82$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9329j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9329j(Object obj) {
            super(1, obj, X82.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((X82) this.receiver).m77308l(p0);
        }
    }

    public X82(InterfaceC37097Xl3 partManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, Y82 partUi, C39058cI3 partConverter) {
        Intrinsics.checkNotNullParameter(partManager, "partManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(partUi, "partUi");
        Intrinsics.checkNotNullParameter(partConverter, "partConverter");
        this.f42712a = partManager;
        this.f42713b = scopeProvider;
        this.f42714c = navigator;
        this.f42715d = partUi;
        this.f42716e = partConverter;
        C24552a<String> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<String>()");
        this.f42717f = m31922e;
    }

    /* renamed from: n */
    public static final InterfaceC23447K m77306n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m77305o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void onCreate$default(X82 x82, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        x82.m77309k(str, str2);
    }

    /* renamed from: p */
    public static final InterfaceC23447K m77304p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m77303q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m77302r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m77301s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m77300t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m77299u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m77298v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m77297w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public final void m77309k(String str, String partSku) {
        Intrinsics.checkNotNullParameter(partSku, "partSku");
        this.f42717f.onNext(partSku);
        if (str != null) {
            this.f42715d.m75556Oi(str);
        }
    }

    /* renamed from: l */
    public final void m77308l(Throwable th) {
        this.f42715d.error(th.getMessage());
        C41318g46.m40159e(th);
    }

    /* renamed from: m */
    public final void m77307m() {
        C24552a<String> c24552a = this.f42717f;
        final C9321b c9321b = new C9321b();
        Observable<R> flatMapSingle = c24552a.flatMapSingle(new InterfaceC23492o() { // from class: N82
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m77306n;
                m77306n = X82.m77306n(Function1.this, obj);
                return m77306n;
            }
        });
        final C9322c c9322c = new C9322c();
        Observable observeOn = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: O82
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m77304p;
                m77304p = X82.m77304p(Function1.this, obj);
                return m77304p;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    par…  }\n        }\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f42713b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9323d c9323d = new C9323d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: P82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77303q(Function1.this, obj);
            }
        };
        final C9324e c9324e = new C9324e(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Q82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77302r(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f42715d.m75555Ul(), this.f42717f);
        final C9325f c9325f = new C9325f();
        Observable flatMapSingle2 = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: R82
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m77301s;
                m77301s = X82.m77301s(Function1.this, obj);
                return m77301s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "fun onResume() {\n    par…  }\n        }\n      }\n  }");
        Object m33094as2 = flatMapSingle2.m33094as(AutoDispose.m45239a(this.f42713b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9326g c9326g = C9326g.f42723g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: S82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77300t(Function1.this, obj);
            }
        };
        final C9327h c9327h = new C9327h(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: T82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77299u(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f42715d.m8924Ql().m33094as(AutoDispose.m45239a(this.f42713b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9328i c9328i = new C9328i();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: U82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77298v(Function1.this, obj);
            }
        };
        final C9329j c9329j = new C9329j(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: V82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77297w(Function1.this, obj);
            }
        });
        Observable<WireQuickLink> observeOn2 = this.f42715d.m75553Wl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "partUi.relatedLinkClicks…dSchedulers.mainThread())");
        Object m33094as4 = observeOn2.m33094as(AutoDispose.m45239a(this.f42713b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9320a c9320a = new C9320a();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: W82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X82.m77305o(Function1.this, obj);
            }
        });
    }
}
