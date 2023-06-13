package p000;

import co.bird.android.model.wire.WireTransferOrderFilter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lu86;", "Lf1;", "Lv86;", "Lw86;", "renderer", "", "r", "LO86;", "e", "LO86;", "transferOrderManager", "LAG;", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "kotlin.jvm.PlatformType", "f", "LAG;", "selected", "<init>", "(LO86;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderLandingFiltersPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingFiltersPresenter.kt\nco/bird/android/feature/transferorder/landing/filters/TransferOrderLandingFiltersPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,86:1\n180#2:87\n180#2:88\n180#2:89\n180#2:90\n180#2:91\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingFiltersPresenter.kt\nco/bird/android/feature/transferorder/landing/filters/TransferOrderLandingFiltersPresenter\n*L\n27#1:87\n41#1:88\n54#1:89\n61#1:90\n74#1:91\n*E\n"})
/* renamed from: u86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49659u86 extends AbstractC20169f1<InterfaceC50251v86, InterfaceC50844w86> {

    /* renamed from: e */
    public final O86 f111795e;

    /* renamed from: f */
    public final C0058AG<List<WireTransferOrderFilter>> f111796f;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u86$a */
    /* loaded from: classes3.dex */
    public static final class C29066a extends Lambda implements Function1<Pair<? extends List<? extends WireTransferOrderFilter>, ? extends List<? extends WireTransferOrderFilter>>, Unit> {
        public C29066a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireTransferOrderFilter>, ? extends List<? extends WireTransferOrderFilter>> pair) {
            invoke2((Pair<? extends List<WireTransferOrderFilter>, ? extends List<WireTransferOrderFilter>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WireTransferOrderFilter>, ? extends List<WireTransferOrderFilter>> pair) {
            List<WireTransferOrderFilter> filters = pair.component1();
            List<WireTransferOrderFilter> selected = pair.component2();
            C49659u86 c49659u86 = C49659u86.this;
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            Intrinsics.checkNotNullExpressionValue(selected, "selected");
            c49659u86.m42280h(new C36569Ve6(filters, selected, false));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u86$b */
    /* loaded from: classes3.dex */
    public static final class C29067b extends Lambda implements Function1<Pair<? extends WireTransferOrderFilter, ? extends List<? extends WireTransferOrderFilter>>, Unit> {
        public C29067b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireTransferOrderFilter, ? extends List<? extends WireTransferOrderFilter>> pair) {
            invoke2((Pair<WireTransferOrderFilter, ? extends List<WireTransferOrderFilter>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireTransferOrderFilter, ? extends List<WireTransferOrderFilter>> pair) {
            List plus;
            WireTransferOrderFilter component1 = pair.component1();
            List<WireTransferOrderFilter> selected = pair.component2();
            C0058AG c0058ag = C49659u86.this.f111796f;
            if (selected.contains(component1)) {
                Intrinsics.checkNotNullExpressionValue(selected, "selected");
                plus = CollectionsKt___CollectionsKt.minus(selected, component1);
            } else {
                Intrinsics.checkNotNullExpressionValue(selected, "selected");
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireTransferOrderFilter>) ((Collection<? extends Object>) selected), component1);
            }
            c0058ag.accept(plus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u86$c */
    /* loaded from: classes3.dex */
    public static final class C29068c extends Lambda implements Function1<Unit, Unit> {
        public C29068c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List emptyList;
            C0058AG c0058ag = C49659u86.this.f111796f;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            c0058ag.accept(emptyList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u86$d */
    /* loaded from: classes3.dex */
    public static final class C29069d extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lw86;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lw86;)Lw86;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: u86$d$a */
        /* loaded from: classes3.dex */
        public static final class C29070a extends Lambda implements Function1<InterfaceC50844w86, InterfaceC50844w86> {

            /* renamed from: g */
            public static final C29070a f111801g = new C29070a();

            public C29070a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC50844w86 invoke(InterfaceC50844w86 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new C26582nm(state.getFilters(), state.mo7357a(), state.getLoading());
            }
        }

        public C29069d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C49659u86.this.m42279i(C29070a.f111801g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u86$e */
    /* loaded from: classes3.dex */
    public static final class C29071e extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lw86;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lw86;)Lw86;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: u86$e$a */
        /* loaded from: classes3.dex */
        public static final class C29072a extends Lambda implements Function1<InterfaceC50844w86, InterfaceC50844w86> {

            /* renamed from: g */
            public static final C29072a f111803g = new C29072a();

            public C29072a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC50844w86 invoke(InterfaceC50844w86 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new C39327cl0(state.getFilters(), state.mo7357a(), state.getLoading());
            }
        }

        public C29071e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C49659u86.this.m42279i(C29072a.f111803g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49659u86(O86 transferOrderManager) {
        super(new C36569Ve6(null, null, false, 7, null));
        List emptyList;
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        this.f111795e = transferOrderManager;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C0058AG<List<WireTransferOrderFilter>> m115950h = C0058AG.m115950h(emptyList);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<List<WireT…rderFilter>>(emptyList())");
        this.f111796f = m115950h;
    }

    /* renamed from: f */
    public static final void m10808f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m10807g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m10800s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m10799t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m10798u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: r */
    public void consume(InterfaceC50251v86 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C24523e c24523e = C24523e.f91168a;
        Observable<List<WireTransferOrderFilter>> m33123k0 = this.f111795e.mo80302c().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "transferOrderManager.act…)\n        .toObservable()");
        Object m33094as = c24523e.m31956a(m33123k0, this.f111796f).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29066a c29066a = new C29066a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: p86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49659u86.m10808f(Function1.this, obj);
            }
        });
        Object m33094as2 = C24527f.m31950a(renderer.mo9138S4(), this.f111796f).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29067b c29067b = new C29067b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: q86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49659u86.m10807g(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo9136w9().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29068c c29068c = new C29068c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: r86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49659u86.m10800s(Function1.this, obj);
            }
        });
        Object m33094as4 = renderer.mo9139H0().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29069d c29069d = new C29069d();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: s86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49659u86.m10799t(Function1.this, obj);
            }
        });
        Object m33094as5 = renderer.mo9137q1().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29071e c29071e = new C29071e();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: t86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49659u86.m10798u(Function1.this, obj);
            }
        });
    }
}
