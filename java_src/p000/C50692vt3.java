package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"Lvt3;", "Lf1;", "Lwt3;", "Lxt3;", "renderer", "", "r", "LTq4;", "e", "LTq4;", "reactiveConfig", "<init>", "(LTq4;)V", "f", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSettingsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSettingsPresenter.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,46:1\n180#2:47\n180#2:48\n*S KotlinDebug\n*F\n+ 1 OperatorSettingsPresenter.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsPresenter\n*L\n31#1:47\n39#1:48\n*E\n"})
/* renamed from: vt3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50692vt3 extends AbstractC20169f1<InterfaceC51285wt3, AbstractC51878xt3> {

    /* renamed from: f */
    public static final C29691a f114854f = new C29691a(null);

    /* renamed from: g */
    public static final int f114855g = 8;

    /* renamed from: h */
    public static final List<String> f114856h;

    /* renamed from: e */
    public final C36207Tq4 f114857e;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lvt3$a;", "", "", "", "TWEAK_KEYS", "Ljava/util/List;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vt3$a */
    /* loaded from: classes2.dex */
    public static final class C29691a {
        public /* synthetic */ C29691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29691a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/config/tweaks/dsl/Tweaks;", "tweaks", "", "LRa6;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/config/tweaks/dsl/Tweaks;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorSettingsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSettingsPresenter.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsPresenter$consume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n*S KotlinDebug\n*F\n+ 1 OperatorSettingsPresenter.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsPresenter$consume$1\n*L\n28#1:47\n28#1:48,3\n*E\n"})
    /* renamed from: vt3$b */
    /* loaded from: classes2.dex */
    public static final class C29692b extends Lambda implements Function1<Tweaks, List<? extends C35597Ra6<Object>>> {

        /* renamed from: g */
        public static final C29692b f114858g = new C29692b();

        public C29692b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C35597Ra6<Object>> invoke(Tweaks tweaks) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(tweaks, "tweaks");
            List<String> list = C50692vt3.f114856h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str : list) {
                arrayList.add(tweaks.getTweak(str));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LRa6;", "", "tweaks", "LqY3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LqY3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vt3$c */
    /* loaded from: classes2.dex */
    public static final class C29693c extends Lambda implements Function1<List<? extends C35597Ra6<Object>>, C47521qY3> {

        /* renamed from: g */
        public static final C29693c f114859g = new C29693c();

        public C29693c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C47521qY3 invoke(List<C35597Ra6<Object>> tweaks) {
            Intrinsics.checkNotNullParameter(tweaks, "tweaks");
            return new C47521qY3(tweaks);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vt3$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C29694d extends FunctionReferenceImpl implements Function1<AbstractC51878xt3, Unit> {
        public C29694d(Object obj) {
            super(1, obj, C50692vt3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m7851a(AbstractC51878xt3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50692vt3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC51878xt3 abstractC51878xt3) {
            m7851a(abstractC51878xt3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052>\u0010\u0004\u001a:\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LRa6;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vt3$f */
    /* loaded from: classes2.dex */
    public static final class C29696f extends Lambda implements Function1<Pair<? extends C35597Ra6<?>, ? extends Tweaks>, Unit> {
        public C29696f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C35597Ra6<?>, ? extends Tweaks> pair) {
            invoke2((Pair<? extends C35597Ra6<?>, Tweaks>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends C35597Ra6<?>, Tweaks> pair) {
            Tweaks tweaks = pair.component2();
            tweaks.updateTweak(pair.component1());
            C36207Tq4 c36207Tq4 = C50692vt3.this.f114857e;
            Intrinsics.checkNotNullExpressionValue(tweaks, "tweaks");
            c36207Tq4.m82622f9(tweaks);
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"enableOperatorAreaManualRefresh", "enableOperatorShakeToReport"});
        f114856h = listOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50692vt3(C36207Tq4 reactiveConfig) {
        super(C49002t22.f109761a);
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f114857e = reactiveConfig;
    }

    /* renamed from: s */
    public static final List m7858s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final C47521qY3 m7857t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C47521qY3) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m7856u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final boolean m7855v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: w */
    public static final void m7854w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: r */
    public void consume(InterfaceC51285wt3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Z84<Tweaks> m82601h8 = this.f114857e.m82601h8();
        final C29692b c29692b = C29692b.f114858g;
        Observable<R> map = m82601h8.map(new InterfaceC23492o() { // from class: qt3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m7858s;
                m7858s = C50692vt3.m7858s(Function1.this, obj);
                return m7858s;
            }
        });
        final C29693c c29693c = C29693c.f114859g;
        Observable map2 = map.map(new InterfaceC23492o() { // from class: rt3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C47521qY3 m7857t;
                m7857t = C50692vt3.m7857t(Function1.this, obj);
                return m7857t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "reactiveConfig.tweaks\n  …PopulateAdapter(tweaks) }");
        Object m33094as = map2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29694d c29694d = new C29694d(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: st3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50692vt3.m7856u(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(renderer.mo6186I0(), this.f114857e.m82601h8());
        final C29695e c29695e = C29695e.f114860g;
        Observable filter = m31950a.filter(new InterfaceC23494q() { // from class: tt3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m7855v;
                m7855v = C50692vt3.m7855v(Function1.this, obj);
                return m7855v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "renderer.tweakUpdates()\n…pdatedTweak.value\n      }");
        Object m33094as2 = filter.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29696f c29696f = new C29696f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ut3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50692vt3.m7854w(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LRa6;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vt3$e */
    /* loaded from: classes2.dex */
    public static final class C29695e extends Lambda implements Function1<Pair<? extends C35597Ra6<?>, ? extends Tweaks>, Boolean> {

        /* renamed from: g */
        public static final C29695e f114860g = new C29695e();

        public C29695e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends C35597Ra6<?>, Tweaks> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C35597Ra6<?> component1 = pair.component1();
            return Boolean.valueOf(!Intrinsics.areEqual(pair.component2().getTweak(component1.m86601c()).m86599e(), component1.m86599e()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C35597Ra6<?>, ? extends Tweaks> pair) {
            return invoke2((Pair<? extends C35597Ra6<?>, Tweaks>) pair);
        }
    }
}
