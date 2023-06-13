package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireTierView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32541Dz1;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LjA1;", "LfA1;", "", C17296a.f69688o, "b", "i", "", "tabIndex", "j", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", MessageExtension.FIELD_DATA, "LnA1;", "LnA1;", "ui", "LTq4;", "c", "LTq4;", "reactiveConfig", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LEa;", "f", "LEa;", "analyticsManager", "<init>", "(Lco/bird/android/model/wire/WireFrequentFlyerView;LnA1;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LEa;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrequentFlyerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,92:1\n1549#2:93\n1620#2,3:94\n180#3:97\n180#3:98\n180#3:99\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterImpl\n*L\n36#1:93\n36#1:94,3\n47#1:97\n54#1:98\n60#1:99\n*E\n"})
/* renamed from: jA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43152jA1 implements InterfaceC40780fA1 {

    /* renamed from: a */
    public final WireFrequentFlyerView f92248a;

    /* renamed from: b */
    public final InterfaceC45524nA1 f92249b;

    /* renamed from: c */
    public final C36207Tq4 f92250c;

    /* renamed from: d */
    public final InterfaceC40099e13 f92251d;

    /* renamed from: e */
    public final ScopeProvider f92252e;

    /* renamed from: f */
    public final InterfaceC1880Ea f92253f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "selectedTabIndex", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jA1$a */
    /* loaded from: classes3.dex */
    public static final class C24727a extends Lambda implements Function1<Integer, Unit> {
        public C24727a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer selectedTabIndex) {
            InterfaceC45524nA1 interfaceC45524nA1 = C43152jA1.this.f92249b;
            List<WireTierView> tierViews = C43152jA1.this.f92248a.getTierViews();
            Intrinsics.checkNotNullExpressionValue(selectedTabIndex, "selectedTabIndex");
            interfaceC45524nA1.mo21697k2(C44338lA1.m27721a(tierViews.get(selectedTabIndex.intValue())));
            C43152jA1.this.m31036j(selectedTabIndex.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jA1$b */
    /* loaded from: classes3.dex */
    public static final class C24728b extends Lambda implements Function1<Unit, Unit> {
        public C24728b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43152jA1.this.mo31044b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jA1$c */
    /* loaded from: classes3.dex */
    public static final class C24729c extends Lambda implements Function1<Unit, Unit> {
        public C24729c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43152jA1.this.m31037i();
        }
    }

    public C43152jA1(WireFrequentFlyerView data, InterfaceC45524nA1 ui, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f92248a = data;
        this.f92249b = ui;
        this.f92250c = reactiveConfig;
        this.f92251d = navigator;
        this.f92252e = scopeProvider;
        this.f92253f = analyticsManager;
    }

    /* renamed from: f */
    public static final void m31040f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m31039g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m31038h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40780fA1
    /* renamed from: a */
    public void mo31045a() {
        int collectionSizeOrDefault;
        Long l;
        this.f92249b.mo21695oi(this.f92248a.getProgress());
        InterfaceC45524nA1 interfaceC45524nA1 = this.f92249b;
        Integer valueOf = Integer.valueOf(this.f92248a.getHeaderLevel());
        String headline = this.f92248a.getHeadline();
        List<WireTierView> tierViews = this.f92248a.getTierViews();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(tierViews, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireTierView wireTierView : tierViews) {
            arrayList.add(wireTierView.getTitle());
        }
        interfaceC45524nA1.mo21700d9(new C32541Dz1.C1681c(valueOf, headline, arrayList, this.f92248a.getSelectedLevelIndex()));
        InterfaceC45524nA1 interfaceC45524nA12 = this.f92249b;
        String faqZendeskArticleId = this.f92250c.m82623f8().m73665a().getFrequentFlyer().getFaqZendeskArticleId();
        Long l2 = null;
        if (faqZendeskArticleId != null) {
            l = Long.valueOf(Long.parseLong(faqZendeskArticleId));
        } else {
            l = null;
        }
        String termsZendeskArticleId = this.f92250c.m82623f8().m73665a().getFrequentFlyer().getTermsZendeskArticleId();
        if (termsZendeskArticleId != null) {
            l2 = Long.valueOf(Long.parseLong(termsZendeskArticleId));
        }
        interfaceC45524nA12.mo21698ij(new C32541Dz1.C1680b(l, l2));
        Observable<Integer> observeOn = this.f92249b.mo21699fc().distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.selectedTab()\n      .…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f92252e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24727a c24727a = new C24727a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: gA1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43152jA1.m31040f(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f92249b.mo21701Cf().m33094as(AutoDispose.m45239a(this.f92252e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24728b c24728b = new C24728b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: hA1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43152jA1.m31039g(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f92249b.mo21696m2().m33094as(AutoDispose.m45239a(this.f92252e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24729c c24729c = new C24729c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: iA1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43152jA1.m31038h(Function1.this, obj);
            }
        });
        this.f92253f.mo55905y(new C43189jE2(null, null, null, this.f92248a.getHeadline(), 7, null));
    }

    @Override // p000.InterfaceC40780fA1
    /* renamed from: b */
    public void mo31044b() {
        String faqZendeskArticleId = this.f92250c.m82623f8().getValue().getFrequentFlyer().getFaqZendeskArticleId();
        if (faqZendeskArticleId != null) {
            this.f92251d.mo36922w3(Long.parseLong(faqZendeskArticleId));
        }
    }

    /* renamed from: i */
    public final void m31037i() {
        String termsZendeskArticleId = this.f92250c.m82623f8().getValue().getFrequentFlyer().getTermsZendeskArticleId();
        if (termsZendeskArticleId != null) {
            this.f92251d.mo36922w3(Long.parseLong(termsZendeskArticleId));
        }
        this.f92253f.mo55905y(new C43782kE2(null, null, null, this.f92248a.getHeadline(), 7, null));
    }

    /* renamed from: j */
    public final void m31036j(int i) {
        this.f92253f.mo55905y(new C42596iE2(null, null, null, this.f92248a.getTierViews().get(i).getTitle(), 7, null));
    }
}
