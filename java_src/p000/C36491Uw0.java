package p000;

import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC44791lw0;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LUw0;", "Lf1;", "LVw0;", "LWw0;", "renderer", "", "r", "Llw0;", "e", "Llw0;", "manager", "Le13;", "f", "Le13;", "navigator", "<init>", "(Llw0;Le13;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialViewerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerPresenter.kt\nco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerPresenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,45:1\n1549#2:46\n1620#2,3:47\n199#3:50\n180#3:51\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialViewerPresenter.kt\nco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerPresenter\n*L\n28#1:46\n28#1:47,3\n34#1:50\n39#1:51\n*E\n"})
/* renamed from: Uw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36491Uw0 extends AbstractC20169f1<InterfaceC36725Vw0, InterfaceC36959Ww0> {

    /* renamed from: e */
    public final InterfaceC44791lw0 f38292e;

    /* renamed from: f */
    public final InterfaceC40099e13 f38293f;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0002*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "tutorialsArray", "", "Lco/bird/android/model/persistence/Tutorial;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialViewerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerPresenter.kt\nco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerPresenter$consume$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,45:1\n11335#2:46\n11670#2,3:47\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialViewerPresenter.kt\nco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerPresenter$consume$2\n*L\n30#1:46\n30#1:47,3\n*E\n"})
    /* renamed from: Uw0$a */
    /* loaded from: classes3.dex */
    public static final class C8504a extends Lambda implements Function1<Object[], List<? extends List<? extends Tutorial>>> {

        /* renamed from: g */
        public static final C8504a f38294g = new C8504a();

        public C8504a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<List<Tutorial>> invoke(Object[] tutorialsArray) {
            Intrinsics.checkNotNullParameter(tutorialsArray, "tutorialsArray");
            ArrayList arrayList = new ArrayList(tutorialsArray.length);
            for (Object obj : tutorialsArray) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<co.bird.android.model.persistence.Tutorial>");
                arrayList.add((List) obj);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Tutorial;", "tutorialsList", "LmY3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LmY3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uw0$b */
    /* loaded from: classes3.dex */
    public static final class C8505b extends Lambda implements Function1<List<? extends List<? extends Tutorial>>, C45149mY3> {

        /* renamed from: g */
        public static final C8505b f38295g = new C8505b();

        public C8505b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C45149mY3 invoke(List<? extends List<Tutorial>> tutorialsList) {
            Intrinsics.checkNotNullParameter(tutorialsList, "tutorialsList");
            return new C45149mY3(tutorialsList);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uw0$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8506c extends FunctionReferenceImpl implements Function1<InterfaceC36959Ww0, Unit> {
        public C8506c(Object obj) {
            super(1, obj, C36491Uw0.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m80594a(InterfaceC36959Ww0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C36491Uw0) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36959Ww0 interfaceC36959Ww0) {
            m80594a(interfaceC36959Ww0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uw0$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8507d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C8507d f38296b = new C8507d();

        public C8507d() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tutorialIds", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uw0$e */
    /* loaded from: classes3.dex */
    public static final class C8508e extends Lambda implements Function1<List<? extends String>, Unit> {
        public C8508e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> tutorialIds) {
            InterfaceC40099e13 interfaceC40099e13 = C36491Uw0.this.f38293f;
            Intrinsics.checkNotNullExpressionValue(tutorialIds, "tutorialIds");
            InterfaceC40099e13.C19924a.goToConfigurableTutorials$default(interfaceC40099e13, tutorialIds, null, false, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36491Uw0(InterfaceC44791lw0 manager, InterfaceC40099e13 navigator) {
        super(C50780w22.f115186a);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f38292e = manager;
        this.f38293f = navigator;
    }

    /* renamed from: s */
    public static final List m80601s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final C45149mY3 m80600t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C45149mY3) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m80599u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m80598v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m80597w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: r */
    public void consume(InterfaceC36725Vw0 renderer) {
        List list;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23461c mo20267g = this.f38292e.mo20267g();
        list = ArraysKt___ArraysKt.toList(ConfigurableTutorialContext.values());
        List<ConfigurableTutorialContext> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ConfigurableTutorialContext configurableTutorialContext : list2) {
            arrayList.add(InterfaceC44791lw0.C25816a.getTutorialsByContext$default(this.f38292e, configurableTutorialContext, null, false, 2, null));
        }
        final C8504a c8504a = C8504a.f38294g;
        AbstractC23442F m33042m = mo20267g.m33042m(AbstractC23442F.m33107s0(arrayList, new InterfaceC23492o() { // from class: Pw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m80601s;
                m80601s = C36491Uw0.m80601s(Function1.this, obj);
                return m80601s;
            }
        }));
        final C8505b c8505b = C8505b.f38295g;
        AbstractC23442F m33157I = m33042m.m33157I(new InterfaceC23492o() { // from class: Qw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C45149mY3 m80600t;
                m80600t = C36491Uw0.m80600t(Function1.this, obj);
                return m80600t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "manager.fetchTutorials()…eAdapter(tutorialsList) }");
        Object m33135e = m33157I.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8506c c8506c = new C8506c(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Rw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36491Uw0.m80599u(Function1.this, obj);
            }
        };
        final C8507d c8507d = C8507d.f38296b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Sw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36491Uw0.m80598v(Function1.this, obj);
            }
        });
        Object m33094as = renderer.mo58388u9().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8508e c8508e = new C8508e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Tw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36491Uw0.m80597w(Function1.this, obj);
            }
        });
    }
}
