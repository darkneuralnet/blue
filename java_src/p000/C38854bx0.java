package p000;

import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lbx0;", "Lf1;", "Lcx0;", "", "renderer", "", "p", "Llw0;", "e", "Llw0;", "configurableTutorialManager", "Lqw0;", "f", "Lqw0;", "navigator", "<init>", "(Llw0;Lqw0;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialsPresenter.kt\nco/bird/android/feature/configurabletutorial/ConfigurableTutorialsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,35:1\n180#2:36\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialsPresenter.kt\nco/bird/android/feature/configurabletutorial/ConfigurableTutorialsPresenter\n*L\n25#1:36\n*E\n"})
/* renamed from: bx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38854bx0 extends AbstractC20169f1<InterfaceC39465cx0, Object> {

    /* renamed from: e */
    public final InterfaceC44791lw0 f59815e;

    /* renamed from: f */
    public final C47756qw0 f59816f;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "tutorialIds", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialsPresenter.kt\nco/bird/android/feature/configurabletutorial/ConfigurableTutorialsPresenter$consume$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,35:1\n37#2,2:36\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialsPresenter.kt\nco/bird/android/feature/configurabletutorial/ConfigurableTutorialsPresenter$consume$1\n*L\n19#1:36,2\n*E\n"})
    /* renamed from: bx0$a */
    /* loaded from: classes3.dex */
    public static final class C13349a extends Lambda implements Function1<List<? extends String>, InterfaceC23447K<? extends List<? extends Tutorial>>> {
        public C13349a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Tutorial>> invoke(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            InterfaceC44791lw0 interfaceC44791lw0 = C38854bx0.this.f59815e;
            String[] strArr = (String[]) tutorialIds.toArray(new String[0]);
            return interfaceC44791lw0.mo20263l0((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Tutorial;", "tutorials", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialsPresenter.kt\nco/bird/android/feature/configurabletutorial/ConfigurableTutorialsPresenter$consume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n2624#2,3:36\n1549#2:39\n1620#2,3:40\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialsPresenter.kt\nco/bird/android/feature/configurabletutorial/ConfigurableTutorialsPresenter$consume$2\n*L\n22#1:36,3\n23#1:39\n23#1:40,3\n*E\n"})
    /* renamed from: bx0$b */
    /* loaded from: classes3.dex */
    public static final class C13350b extends Lambda implements Function1<List<? extends Tutorial>, Pair<? extends List<? extends String>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C13350b f59818g = new C13350b();

        public C13350b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<String>, Boolean> invoke(List<Tutorial> tutorials) {
            int collectionSizeOrDefault;
            boolean z;
            Intrinsics.checkNotNullParameter(tutorials, "tutorials");
            boolean z2 = false;
            if (tutorials.size() > 1) {
                List<Tutorial> list = tutorials;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Tutorial tutorial : list) {
                        if (!tutorial.getSkippable()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    z2 = true;
                }
            }
            List<Tutorial> list2 = tutorials;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial2 : list2) {
                arrayList.add(tutorial2.getId());
            }
            return TuplesKt.m28425to(arrayList, Boolean.valueOf(z2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bx0$c */
    /* loaded from: classes3.dex */
    public static final class C13351c extends Lambda implements Function1<Pair<? extends List<? extends String>, ? extends Boolean>, Unit> {
        public C13351c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends String>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<String>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<String>, Boolean> pair) {
            List<String> component1 = pair.component1();
            if (pair.component2().booleanValue()) {
                C38854bx0.this.f59816f.m16778d(component1);
            } else {
                C38854bx0.this.f59816f.m16777e(component1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38854bx0(InterfaceC44791lw0 configurableTutorialManager, C47756qw0 navigator) {
        super(new Object());
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f59815e = configurableTutorialManager;
        this.f59816f = navigator;
    }

    /* renamed from: q */
    public static final InterfaceC23447K m62104q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final Pair m62103r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m62102s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: p */
    public void consume(InterfaceC39465cx0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<List<String>> mo44802x7 = renderer.mo44802x7();
        final C13349a c13349a = new C13349a();
        Observable<R> flatMapSingle = mo44802x7.flatMapSingle(new InterfaceC23492o() { // from class: Yw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m62104q;
                m62104q = C38854bx0.m62104q(Function1.this, obj);
                return m62104q;
            }
        });
        final C13350b c13350b = C13350b.f59818g;
        Observable map = flatMapSingle.map(new InterfaceC23492o() { // from class: Zw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m62103r;
                m62103r = C38854bx0.m62103r(Function1.this, obj);
                return m62103r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun consume(ren…ds)\n        }\n      }\n  }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13351c c13351c = new C13351c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ax0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38854bx0.m62102s(Function1.this, obj);
            }
        });
    }
}
