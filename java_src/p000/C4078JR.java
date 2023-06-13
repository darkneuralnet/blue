package p000;

import co.bird.android.model.persistence.BirdRatingHistory;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LJR;", "Lf1;", "LKR;", "LQR;", "renderer", "", "r", "Lom3;", "e", "Lom3;", "operatorManager", "LAR;", "f", "LAR;", "converter", "", "g", "Ljava/lang/String;", "birdId", "<init>", "(Lom3;LAR;Ljava/lang/String;)V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRatingHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryPresenter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,45:1\n199#2:46\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryPresenter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryPresenter\n*L\n41#1:46\n*E\n"})
/* renamed from: JR */
/* loaded from: classes3.dex */
public final class C4078JR extends AbstractC20169f1<InterfaceC4433KR, InterfaceC6777QR> {

    /* renamed from: e */
    public final InterfaceC46473om3 f17535e;

    /* renamed from: f */
    public final C0091AR f17536f;

    /* renamed from: g */
    public final String f17537g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JR$a */
    /* loaded from: classes3.dex */
    public static final class C4079a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C4079a() {
            super(1);
        }

        /* renamed from: a */
        public final void m100479a(InterfaceC23465c interfaceC23465c) {
            C4078JR.this.m42280h(new C32254Ct2(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m100479a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdRatingHistory;", "it", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdRatingHistory;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JR$b */
    /* loaded from: classes3.dex */
    public static final class C4080b extends Lambda implements Function1<BirdRatingHistory, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C4080b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(BirdRatingHistory it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4078JR.this.f17536f.m115787b(new C45891nn4(it.getBirdCode(), it.getRatingAverage()), it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JR$c */
    /* loaded from: classes3.dex */
    public static final class C4081c extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C4081c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            C4078JR.this.m42280h(new C32254Ct2(false));
            C4078JR c4078jr = C4078JR.this;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            c4078jr.m42280h(new A22(sections));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JR$d */
    /* loaded from: classes3.dex */
    public static final class C4082d extends Lambda implements Function1<Throwable, Unit> {
        public C4082d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C4078JR.this.m42280h(new C32254Ct2(false));
            C4078JR.this.m42280h(new C39278cg1(th.getMessage()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4078JR(InterfaceC46473om3 operatorManager, C0091AR converter, String birdId) {
        super(FO5.f9275a);
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f17535e = operatorManager;
        this.f17536f = converter;
        this.f17537g = birdId;
    }

    /* renamed from: f */
    public static final void m100490f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m100483s(C4078JR this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f17535e.mo8152D(this$0.f17537g);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m100482t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m100481u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m100480v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: r */
    public void consume(InterfaceC4433KR renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23461c mo8136R = this.f17535e.mo8136R(this.f17537g);
        final C4079a c4079a = new C4079a();
        AbstractC23442F m33042m = mo8136R.m33081E(new InterfaceC23484g() { // from class: ER
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4078JR.m100490f(Function1.this, obj);
            }
        }).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: FR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m100483s;
                m100483s = C4078JR.m100483s(C4078JR.this);
                return m100483s;
            }
        }));
        final C4080b c4080b = new C4080b();
        AbstractC23442F m33165A = m33042m.m33165A(new InterfaceC23492o() { // from class: GR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m100482t;
                m100482t = C4078JR.m100482t(Function1.this, obj);
                return m100482t;
            }
        });
        final C4081c c4081c = new C4081c();
        AbstractC23442F m33146T = m33165A.m33101w(new InterfaceC23484g() { // from class: HR
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4078JR.m100481u(Function1.this, obj);
            }
        }).m33146T(1L);
        final C4082d c4082d = new C4082d();
        AbstractC23442F m33106t = m33146T.m33106t(new InterfaceC23484g() { // from class: IR
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4078JR.m100480v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun consume(ren…r)\n      .subscribe()\n  }");
        Object m33135e = m33106t.m33135e(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }
}
