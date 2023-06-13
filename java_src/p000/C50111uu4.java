package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
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
import p000.C50111uu4;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Luu4;", "Lf1;", "Lzu4;", "LEu4;", "renderer", "", "v", "Liu4;", "e", "Liu4;", "releaseAssignmentManager", "Le13;", "f", "Le13;", "navigator", "<init>", "(Liu4;Le13;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseAssignmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentPresenter.kt\nco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,99:1\n180#2:100\n237#2:101\n237#2:102\n180#2:103\n237#2:104\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentPresenter.kt\nco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentPresenter\n*L\n26#1:100\n41#1:101\n55#1:102\n60#1:103\n95#1:104\n*E\n"})
/* renamed from: uu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50111uu4 extends AbstractC20169f1<InterfaceC53075zu4, InterfaceC32733Eu4> {

    /* renamed from: e */
    public final InterfaceC42996iu4 f113180e;

    /* renamed from: f */
    public final InterfaceC40099e13 f113181f;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "zoneAssignmentGroups", "", "Lco/bird/android/model/persistence/ZoneAssignmentGroup;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uu4$a */
    /* loaded from: classes3.dex */
    public static final class C29331a extends Lambda implements Function1<List<? extends ZoneAssignmentGroup>, Unit> {
        public C29331a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ZoneAssignmentGroup> list) {
            invoke2((List<ZoneAssignmentGroup>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ZoneAssignmentGroup> zoneAssignmentGroups) {
            C50111uu4 c50111uu4 = C50111uu4.this;
            Intrinsics.checkNotNullExpressionValue(zoneAssignmentGroups, "zoneAssignmentGroups");
            c50111uu4.m42280h(new C51966y22(zoneAssignmentGroups));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uu4$b */
    /* loaded from: classes3.dex */
    public static final class C29332b extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C29332b() {
            super(1);
        }

        /* renamed from: a */
        public final void m9514a(InterfaceC23465c interfaceC23465c) {
            C50111uu4.this.m42280h(new C32722Et2(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m9514a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uu4$c */
    /* loaded from: classes3.dex */
    public static final class C29333c extends Lambda implements Function1<Throwable, Unit> {
        public C29333c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C50111uu4.this.m42280h(new C41377gA5(null, false, 3, null));
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uu4$d */
    /* loaded from: classes3.dex */
    public static final class C29334d extends Lambda implements Function1<Unit, Unit> {
        public C29334d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50111uu4.this.m42280h(new C51456xA5(false));
            C50111uu4.this.m42280h(new C32722Et2(true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uu4$e */
    /* loaded from: classes3.dex */
    public static final class C29335e extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C29335e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m9511c(C50111uu4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42280h(new C32722Et2(false));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo29771o0 = C50111uu4.this.f113180e.mo29771o0();
            final C50111uu4 c50111uu4 = C50111uu4.this;
            return mo29771o0.m33029z(new InterfaceC23478a() { // from class: vu4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C50111uu4.C29335e.m9511c(C50111uu4.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Point;", "kotlin.jvm.PlatformType", "point", "", C17296a.f69688o, "(Lco/bird/android/model/Point;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uu4$f */
    /* loaded from: classes3.dex */
    public static final class C29336f extends Lambda implements Function1<Point, Unit> {
        public C29336f() {
            super(1);
        }

        /* renamed from: a */
        public final void m9510a(Point point) {
            InterfaceC40099e13 interfaceC40099e13 = C50111uu4.this.f113181f;
            Intent intent = new Intent();
            intent.putExtra("center_point", new LatLng(point.f66612y, point.f66611x));
            Unit unit = Unit.INSTANCE;
            interfaceC40099e13.mo37190C1(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Point point) {
            m9510a(point);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uu4$g */
    /* loaded from: classes3.dex */
    public static final class C29337g extends Lambda implements Function1<String, Unit> {
        public C29337g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C50111uu4.this.m42280h(new C32722Et2(true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "reservationId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uu4$h */
    /* loaded from: classes3.dex */
    public static final class C29338h extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nReleaseAssignmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentPresenter.kt\nco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentPresenter$consume$9$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
        /* renamed from: uu4$h$a */
        /* loaded from: classes3.dex */
        public static final class C29339a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50111uu4 f113190g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29339a(C50111uu4 c50111uu4) {
                super(1);
                this.f113190g = c50111uu4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable error) {
                Unit unit;
                Intrinsics.checkNotNullExpressionValue(error, "error");
                Throwable m87362c = R36.m87362c(error);
                C41318g46.m40159e(m87362c);
                if ((m87362c instanceof RetrofitException) && ((RetrofitException) m87362c).m53928b() != RetrofitException.EnumC16708a.NETWORK) {
                    String message = m87362c.getMessage();
                    if (message != null) {
                        this.f113190g.m42280h(new C41377gA5(message, false, 2, null));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        this.f113190g.m42280h(new C41377gA5(null, false, 3, null));
                        return;
                    }
                    return;
                }
                this.f113190g.m42280h(new C41377gA5(null, true, 1, null));
            }
        }

        public C29338h() {
            super(1);
        }

        /* renamed from: e */
        public static final void m9505e(C50111uu4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42280h(new C32722Et2(false));
        }

        /* renamed from: f */
        public static final InterfaceC23496h m9504f(C50111uu4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f113180e.mo29771o0().m33069Q();
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(String reservationId) {
            Intrinsics.checkNotNullParameter(reservationId, "reservationId");
            AbstractC23461c m33065U = C50111uu4.this.f113180e.mo29772A0(reservationId).m33065U(1L);
            final C29339a c29339a = new C29339a(C50111uu4.this);
            AbstractC23461c m33069Q = m33065U.m33084B(new InterfaceC23484g() { // from class: wu4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C50111uu4.C29338h.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
            final C50111uu4 c50111uu4 = C50111uu4.this;
            AbstractC23461c m33029z = m33069Q.m33029z(new InterfaceC23478a() { // from class: xu4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C50111uu4.C29338h.m9505e(C50111uu4.this);
                }
            });
            final C50111uu4 c50111uu42 = C50111uu4.this;
            return m33029z.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: yu4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m9504f;
                    m9504f = C50111uu4.C29338h.m9504f(C50111uu4.this);
                    return m9504f;
                }
            }));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50111uu4(InterfaceC42996iu4 releaseAssignmentManager, InterfaceC40099e13 navigator) {
        super(C52768zO5.f121288a);
        Intrinsics.checkNotNullParameter(releaseAssignmentManager, "releaseAssignmentManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f113180e = releaseAssignmentManager;
        this.f113181f = navigator;
    }

    /* renamed from: A */
    public static final void m9533A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m9532B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m9531C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m9530f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m9529g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m9518w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m9517x(C50111uu4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m42280h(new C32722Et2(false));
    }

    /* renamed from: y */
    public static final void m9516y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23496h m9515z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: v */
    public void consume(InterfaceC53075zu4 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = this.f113180e.mo29770z0().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29331a c29331a = new C29331a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: lu4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50111uu4.m9530f(Function1.this, obj);
            }
        });
        AbstractC23461c mo29771o0 = this.f113180e.mo29771o0();
        final C29332b c29332b = new C29332b();
        AbstractC23461c m33065U = mo29771o0.m33081E(new InterfaceC23484g() { // from class: mu4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50111uu4.m9529g(Function1.this, obj);
            }
        }).m33065U(1L);
        final C29333c c29333c = new C29333c();
        AbstractC23461c m33029z = m33065U.m33084B(new InterfaceC23484g() { // from class: nu4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50111uu4.m9518w(Function1.this, obj);
            }
        }).m33069Q().m33029z(new InterfaceC23478a() { // from class: ou4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C50111uu4.m9517x(C50111uu4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun consume(ren…r)\n      .subscribe()\n  }");
        Object m33041n = m33029z.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Unit> mo143r0 = renderer.mo143r0();
        final C29334d c29334d = new C29334d();
        Observable<Unit> doOnNext = mo143r0.doOnNext(new InterfaceC23484g() { // from class: pu4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50111uu4.m9516y(Function1.this, obj);
            }
        });
        final C29335e c29335e = new C29335e();
        AbstractC23461c m33066T = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: qu4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m9515z;
                m9515z = C50111uu4.m9515z(Function1.this, obj);
                return m9515z;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…r)\n      .subscribe()\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Object m33094as2 = renderer.mo144m2().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29336f c29336f = new C29336f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ru4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50111uu4.m9533A(Function1.this, obj);
            }
        });
        Observable<String> mo142z0 = renderer.mo142z0();
        final C29337g c29337g = new C29337g();
        Observable<String> doOnNext2 = mo142z0.doOnNext(new InterfaceC23484g() { // from class: su4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50111uu4.m9532B(Function1.this, obj);
            }
        });
        final C29338h c29338h = new C29338h();
        AbstractC23461c flatMapCompletable = doOnNext2.flatMapCompletable(new InterfaceC23492o() { // from class: tu4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m9531C;
                m9531C = C50111uu4.m9531C(Function1.this, obj);
                return m9531C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…r)\n      .subscribe()\n  }");
        Object m33041n3 = flatMapCompletable.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
    }
}
