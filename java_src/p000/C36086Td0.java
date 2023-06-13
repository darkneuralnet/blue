package p000;

import co.bird.api.response.CannotAccessReportResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LTd0;", "Lf1;", "LUd0;", "LVd0;", "renderer", "", "q", "LaM;", "e", "LaM;", "birdManager", "Le13;", "f", "Le13;", "navigator", "<init>", "(LaM;Le13;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCannotAccessReportsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsPresenter.kt\nco/bird/android/feature/cannotaccess/reports/CannotAccessReportsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,34:1\n180#2:35\n180#2:36\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsPresenter.kt\nco/bird/android/feature/cannotaccess/reports/CannotAccessReportsPresenter\n*L\n20#1:35\n30#1:36\n*E\n"})
/* renamed from: Td0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36086Td0 extends AbstractC20169f1<InterfaceC36320Ud0, C36554Vd0> {

    /* renamed from: e */
    public final InterfaceC10636aM f35793e;

    /* renamed from: f */
    public final InterfaceC40099e13 f35794f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Td0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7898a extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<List<? extends CannotAccessReportResponse>>> {
        public C7898a(Object obj) {
            super(1, obj, InterfaceC10636aM.class, "cannotAccessReportsByBirdId", "cannotAccessReportsByBirdId(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<CannotAccessReportResponse>> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC10636aM) this.receiver).mo71574k(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "reports", "", "Lco/bird/api/response/CannotAccessReportResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Td0$b */
    /* loaded from: classes3.dex */
    public static final class C7899b extends Lambda implements Function1<List<? extends CannotAccessReportResponse>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LVd0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LVd0;)LVd0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Td0$b$a */
        /* loaded from: classes3.dex */
        public static final class C7900a extends Lambda implements Function1<C36554Vd0, C36554Vd0> {

            /* renamed from: g */
            public final /* synthetic */ List<CannotAccessReportResponse> f35796g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7900a(List<CannotAccessReportResponse> list) {
                super(1);
                this.f35796g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36554Vd0 invoke(C36554Vd0 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<CannotAccessReportResponse> reports = this.f35796g;
                Intrinsics.checkNotNullExpressionValue(reports, "reports");
                return state.m79643a(reports);
            }
        }

        public C7899b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CannotAccessReportResponse> list) {
            invoke2((List<CannotAccessReportResponse>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<CannotAccessReportResponse> list) {
            C36086Td0.this.m42279i(new C7900a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Td0$c */
    /* loaded from: classes3.dex */
    public static final class C7901c extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LVd0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LVd0;)LVd0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nCannotAccessReportsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsPresenter.kt\nco/bird/android/feature/cannotaccess/reports/CannotAccessReportsPresenter$consume$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
        /* renamed from: Td0$c$a */
        /* loaded from: classes3.dex */
        public static final class C7902a extends Lambda implements Function1<C36554Vd0, C36554Vd0> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f35798g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7902a(Throwable th) {
                super(1);
                this.f35798g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36554Vd0 invoke(C36554Vd0 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                C36554Vd0 copy$default = C36554Vd0.copy$default(state, null, 1, null);
                copy$default.m79640d(this.f35798g);
                return copy$default;
            }
        }

        public C7901c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C36086Td0.this.m42279i(new C7902a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Td0$d */
    /* loaded from: classes3.dex */
    public static final class C7903d extends Lambda implements Function1<String, Unit> {
        public C7903d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            List listOf;
            InterfaceC40099e13 interfaceC40099e13 = C36086Td0.this.f35794f;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(str, null));
            InterfaceC40099e13.C19924a.goToLightbox$default(interfaceC40099e13, listOf, 0, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36086Td0(InterfaceC10636aM birdManager, InterfaceC40099e13 navigator) {
        super(new C36554Vd0(null, 1, null));
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f35793e = birdManager;
        this.f35794f = navigator;
    }

    /* renamed from: g */
    public static final void m83264g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m83258r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m83257s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m83256t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: q */
    public void consume(InterfaceC36320Ud0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<String> mo81225K8 = renderer.mo81225K8();
        final C7898a c7898a = new C7898a(this.f35793e);
        Observable retry = mo81225K8.flatMapSingle(new InterfaceC23492o() { // from class: Pd0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m83258r;
                m83258r = C36086Td0.m83258r(Function1.this, obj);
                return m83258r;
            }
        }).retry(3L);
        Intrinsics.checkNotNullExpressionValue(retry, "renderer.birdId()\n      …ByBirdId)\n      .retry(3)");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7899b c7899b = new C7899b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Qd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36086Td0.m83264g(Function1.this, obj);
            }
        };
        final C7901c c7901c = new C7901c();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Rd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36086Td0.m83257s(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo81224Z3().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7903d c7903d = new C7903d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Sd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36086Td0.m83256t(Function1.this, obj);
            }
        });
    }
}
