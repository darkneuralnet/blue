package p000;

import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lhw0;", "Lf1;", "Liw0;", "Ljw0;", "renderer", "", "u", "Llw0;", "e", "Llw0;", "manager", "Lqw0;", "f", "Lqw0;", "tutorialNavigator", "Le13;", "g", "Le13;", "navigator", "<init>", "(Llw0;Lqw0;Le13;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialGroupPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupPresenter.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,56:1\n180#2:57\n180#2:58\n180#2:59\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialGroupPresenter.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupPresenter\n*L\n34#1:57\n47#1:58\n52#1:59\n*E\n"})
/* renamed from: hw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42419hw0 extends AbstractC20169f1<InterfaceC43012iw0, InterfaceC43605jw0> {

    /* renamed from: e */
    public final InterfaceC44791lw0 f86197e;

    /* renamed from: f */
    public final C47756qw0 f86198f;

    /* renamed from: g */
    public final InterfaceC40099e13 f86199g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "tutorialIds", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialGroupPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupPresenter.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupPresenter$consume$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,56:1\n37#2,2:57\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialGroupPresenter.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupPresenter$consume$1\n*L\n29#1:57,2\n*E\n"})
    /* renamed from: hw0$a */
    /* loaded from: classes3.dex */
    public static final class C22845a extends Lambda implements Function1<List<? extends String>, InterfaceC23447K<? extends List<? extends Tutorial>>> {
        public C22845a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Tutorial>> invoke(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            InterfaceC44791lw0 interfaceC44791lw0 = C42419hw0.this.f86197e;
            String[] strArr = (String[]) tutorialIds.toArray(new String[0]);
            return interfaceC44791lw0.mo20263l0((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hw0$b */
    /* loaded from: classes3.dex */
    public static final class C22846b extends Lambda implements Function1<Throwable, Unit> {
        public C22846b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C42419hw0.this.f86199g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tutorials", "", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConfigurableTutorialGroupPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupPresenter.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupPresenter$consume$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    /* renamed from: hw0$c */
    /* loaded from: classes3.dex */
    public static final class C22847c extends Lambda implements Function1<List<? extends Tutorial>, Unit> {
        public C22847c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Tutorial> list) {
            invoke2((List<Tutorial>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Tutorial> tutorials) {
            Object first;
            C42419hw0 c42419hw0 = C42419hw0.this;
            Intrinsics.checkNotNullExpressionValue(tutorials, "tutorials");
            c42419hw0.m42280h(new C48114rY3(tutorials));
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) tutorials);
            Tutorial tutorial = (Tutorial) first;
            String groupTitle = tutorial.getGroupTitle();
            if (groupTitle != null) {
                C42419hw0.this.m42280h(new C36955Wv5(groupTitle));
            }
            String groupMessage = tutorial.getGroupMessage();
            if (groupMessage != null) {
                C42419hw0.this.m42280h(new C36721Vv5(groupMessage));
            }
            String groupButtonText = tutorial.getGroupButtonText();
            if (groupButtonText != null) {
                C42419hw0.this.m42280h(new C36253Tv5(groupButtonText));
            }
            String groupHeader = tutorial.getGroupHeader();
            if (groupHeader != null) {
                C42419hw0.this.m42280h(new C36487Uv5(groupHeader));
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hw0$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22848d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22848d f86203b = new C22848d();

        public C22848d() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "tutorialId", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hw0$e */
    /* loaded from: classes3.dex */
    public static final class C22849e extends Lambda implements Function1<String, List<? extends String>> {

        /* renamed from: g */
        public static final C22849e f86204g = new C22849e();

        public C22849e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final List<String> invoke(String tutorialId) {
            List<String> listOf;
            Intrinsics.checkNotNullParameter(tutorialId, "tutorialId");
            listOf = CollectionsKt__CollectionsJVMKt.listOf(tutorialId);
            return listOf;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hw0$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22850f extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C22850f(Object obj) {
            super(1, obj, C47756qw0.class, "navigateToTutorial", "navigateToTutorial(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C47756qw0) this.receiver).m16777e(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hw0$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22851g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22851g f86205b = new C22851g();

        public C22851g() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hw0$h */
    /* loaded from: classes3.dex */
    public static final class C22852h extends Lambda implements Function1<Unit, Unit> {
        public C22852h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42419hw0.this.f86199g.mo37030e3();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42419hw0(InterfaceC44791lw0 manager, C47756qw0 tutorialNavigator, InterfaceC40099e13 navigator) {
        super(HO5.f13335a);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(tutorialNavigator, "tutorialNavigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f86197e = manager;
        this.f86198f = tutorialNavigator;
        this.f86199g = navigator;
    }

    /* renamed from: A */
    public static final void m35482A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m35481B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m35480g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m35470v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m35469w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m35468x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final List m35467y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m35466z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: u */
    public void consume(InterfaceC43012iw0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<List<String>> mo31598g1 = renderer.mo31598g1();
        final C22845a c22845a = new C22845a();
        Observable<R> flatMapSingle = mo31598g1.flatMapSingle(new InterfaceC23492o() { // from class: Zv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m35470v;
                m35470v = C42419hw0.m35470v(Function1.this, obj);
                return m35470v;
            }
        });
        final C22846b c22846b = new C22846b();
        Observable doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: aw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42419hw0.m35480g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun consume(ren…vigator.closeDown() }\n  }");
        Object m33094as = doOnError.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22847c c22847c = new C22847c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42419hw0.m35469w(Function1.this, obj);
            }
        };
        final C22848d c22848d = C22848d.f86203b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42419hw0.m35468x(Function1.this, obj);
            }
        });
        Observable<String> mo31600K7 = renderer.mo31600K7();
        final C22849e c22849e = C22849e.f86204g;
        Observable<R> map = mo31600K7.map(new InterfaceC23492o() { // from class: dw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m35467y;
                m35467y = C42419hw0.m35467y(Function1.this, obj);
                return m35467y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "renderer\n      .tutorial…d -> listOf(tutorialId) }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22850f c22850f = new C22850f(this.f86198f);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: ew0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42419hw0.m35466z(Function1.this, obj);
            }
        };
        final C22851g c22851g = C22851g.f86205b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: fw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42419hw0.m35482A(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo31599L().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22852h c22852h = new C22852h();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: gw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42419hw0.m35481B(Function1.this, obj);
            }
        });
    }
}
