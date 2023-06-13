package p000;

import co.bird.api.response.TestRideResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41274g02;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"Lg02;", "Lf1;", "Lj02;", "Lk02;", "renderer", "", "p", "LO86;", "e", "LO86;", "transferOrderManager", "<init>", "(LO86;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInboundAcceptancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundAcceptancePresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptancePresenter\n+ 2 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,34:1\n641#2,2:35\n180#3:37\n*S KotlinDebug\n*F\n+ 1 InboundAcceptancePresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptancePresenter\n*L\n17#1:35,2\n30#1:37\n*E\n"})
/* renamed from: g02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41274g02 extends AbstractC20169f1<InterfaceC43053j02, AbstractC43646k02> {

    /* renamed from: e */
    public final O86 f81275e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: g02$a */
    /* loaded from: classes3.dex */
    public static final class C20676a<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C20676a<T> f81276b = new C20676a<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof DO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: g02$b */
    /* loaded from: classes3.dex */
    public static final class C20677b<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C20677b<T, R> f81277b = new C20677b<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final DO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (DO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LDO5;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/api/response/TestRideResponse;", "kotlin.jvm.PlatformType", "c", "(LDO5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g02$c */
    /* loaded from: classes3.dex */
    public static final class C20678c extends Lambda implements Function1<DO5, InterfaceC23434B<? extends TestRideResponse>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC43053j02 f81278g;

        /* renamed from: h */
        public final /* synthetic */ C41274g02 f81279h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/api/response/TestRideResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nInboundAcceptancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundAcceptancePresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/dialog/InboundAcceptancePresenter$consume$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
        /* renamed from: g02$c$a */
        /* loaded from: classes3.dex */
        public static final class C20679a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends TestRideResponse>> {

            /* renamed from: g */
            public final /* synthetic */ DO5 f81280g;

            /* renamed from: h */
            public final /* synthetic */ C41274g02 f81281h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20679a(DO5 do5, C41274g02 c41274g02) {
                super(1);
                this.f81280g = do5;
                this.f81281h = c41274g02;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends TestRideResponse> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String m110545b = this.f81280g.m110545b();
                if (m110545b != null) {
                    return this.f81281h.f81275e.mo80280v(m110545b, this.f81280g.m110544c());
                }
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: g02$c$b */
        /* loaded from: classes3.dex */
        public static final class C20680b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41274g02 f81282g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20680b(C41274g02 c41274g02) {
                super(1);
                this.f81282g = c41274g02;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable e) {
                C41318g46.m40159e(e);
                C41274g02 c41274g02 = this.f81282g;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                c41274g02.m42280h(new C38092ag1(e));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20678c(InterfaceC43053j02 interfaceC43053j02, C41274g02 c41274g02) {
            super(1);
            this.f81278g = interfaceC43053j02;
            this.f81279h = c41274g02;
        }

        /* renamed from: d */
        public static final void m40361d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23434B<? extends TestRideResponse> invoke(DO5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            Observable<Unit> mo31272L3 = this.f81278g.mo31272L3();
            final C20679a c20679a = new C20679a(state, this.f81279h);
            Observable<R> flatMapSingle = mo31272L3.flatMapSingle(new InterfaceC23492o() { // from class: h02
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C41274g02.C20678c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C20680b c20680b = new C20680b(this.f81279h);
            return flatMapSingle.doOnError(new InterfaceC23484g() { // from class: i02
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41274g02.C20678c.m40361d(Function1.this, obj);
                }
            }).retry();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/TestRideResponse;", "response", "LxT5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/TestRideResponse;)LxT5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g02$d */
    /* loaded from: classes3.dex */
    public static final class C20681d extends Lambda implements Function1<TestRideResponse, C51627xT5> {

        /* renamed from: g */
        public static final C20681d f81283g = new C20681d();

        public C20681d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C51627xT5 invoke(TestRideResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new C51627xT5(response.getSuccessTitle(), response.getSuccessMessage());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g02$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20682e extends FunctionReferenceImpl implements Function1<AbstractC43646k02, Unit> {
        public C20682e(Object obj) {
            super(1, obj, C41274g02.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m40359a(AbstractC43646k02 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C41274g02) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC43646k02 abstractC43646k02) {
            m40359a(abstractC43646k02);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41274g02(O86 transferOrderManager) {
        super(C40108e22.f77595a);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        this.f81275e = transferOrderManager;
    }

    /* renamed from: q */
    public static final InterfaceC23434B m40367q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final C51627xT5 m40366r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C51627xT5) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m40365s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: p */
    public void consume(InterfaceC43053j02 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<R> map = m42276l().filter(C20676a.f81276b).map(C20677b.f81277b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        final C20678c c20678c = new C20678c(renderer, this);
        Observable switchMap = map.switchMap(new InterfaceC23492o() { // from class: d02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m40367q;
                m40367q = C41274g02.m40367q(Function1.this, obj);
                return m40367q;
            }
        });
        final C20681d c20681d = C20681d.f81283g;
        Observable map2 = switchMap.map(new InterfaceC23492o() { // from class: e02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C51627xT5 m40366r;
                m40366r = C41274g02.m40366r(Function1.this, obj);
                return m40366r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Object m33094as = map2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20682e c20682e = new C20682e(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: f02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41274g02.m40365s(Function1.this, obj);
            }
        });
    }
}
