package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.constant.ConfigurableTutorialType;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.rxkotlin.C24527f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C32513Dw0;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\f\u0010\u000b\u001a\u00020\n*\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00070\u00070$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010+\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010)0)0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'¨\u0006."}, m28432d2 = {"LDw0;", "Lf1;", "LFw0;", "LKw0;", "renderer", "", "y", "Lco/bird/android/model/persistence/Tutorial;", "tutorial", "L", "Lio/reactivex/c;", "K", "Llw0;", "e", "Llw0;", "manager", "LEa;", "f", "LEa;", "analyticsManager", "Le13;", "g", "Le13;", "navigator", "Lqw0;", "h", "Lqw0;", "tutorialNavigator", "", "i", "Z", "keepUnseen", "LXc1;", "j", "LXc1;", "endRideManager", "Lma4;", "kotlin.jvm.PlatformType", "k", "Lma4;", "currentTutorialRelay", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "l", "currentPageRelay", "<init>", "(Llw0;LEa;Le13;Lqw0;ZLXc1;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialPresenter.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n180#2:217\n180#2:218\n180#2:219\n180#2:220\n180#2:221\n237#2:222\n180#2:223\n180#2:224\n180#2:225\n2624#3,3:226\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialPresenter.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialPresenter\n*L\n58#1:217\n68#1:218\n74#1:219\n88#1:220\n136#1:221\n166#1:222\n175#1:223\n180#1:224\n188#1:225\n208#1:226,3\n*E\n"})
/* renamed from: Dw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32513Dw0 extends AbstractC20169f1<InterfaceC32981Fw0, InterfaceC34151Kw0> {

    /* renamed from: e */
    public final InterfaceC44791lw0 f6603e;

    /* renamed from: f */
    public final InterfaceC1880Ea f6604f;

    /* renamed from: g */
    public final InterfaceC40099e13 f6605g;

    /* renamed from: h */
    public final C47756qw0 f6606h;

    /* renamed from: i */
    public final boolean f6607i;

    /* renamed from: j */
    public final InterfaceC37014Xc1 f6608j;

    /* renamed from: k */
    public final C45168ma4<Tutorial> f6609k;

    /* renamed from: l */
    public final C45168ma4<TutorialPage> f6610l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "atBottom", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw0$a */
    /* loaded from: classes3.dex */
    public static final class C1656a extends Lambda implements Function1<Boolean, Unit> {
        public C1656a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C32513Dw0.this.m42280h(new C47900rA5(!bool.booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw0$b */
    /* loaded from: classes3.dex */
    public static final class C1657b extends Lambda implements Function1<Unit, Unit> {
        public C1657b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32513Dw0.this.f6605g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012R\u0010\u0005\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/Tutorial;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw0$c */
    /* loaded from: classes3.dex */
    public static final class C1658c extends Lambda implements Function1<Triple<? extends Unit, ? extends Integer, ? extends Tutorial>, Unit> {
        public C1658c() {
            super(1);
        }

        /* renamed from: a */
        public final void m109627a(Triple<Unit, Integer, Tutorial> triple) {
            boolean contains$default;
            Integer idx = triple.component2();
            List<TutorialPage> pages = triple.component3().getPages();
            Intrinsics.checkNotNullExpressionValue(idx, "idx");
            String zendeskHelpUrl = pages.get(idx.intValue()).getZendeskHelpUrl();
            if (zendeskHelpUrl != null) {
                InterfaceC40099e13 interfaceC40099e13 = C32513Dw0.this.f6605g;
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) zendeskHelpUrl, (CharSequence) "help.bird.co", false, 2, (Object) null);
                InterfaceC40099e13.C19924a.goToWebView$default(interfaceC40099e13, zendeskHelpUrl, null, null, contains$default, 6, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends Integer, ? extends Tutorial> triple) {
            m109627a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tutorials", "", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw0$d */
    /* loaded from: classes3.dex */
    public static final class C1659d extends Lambda implements Function1<List<? extends Tutorial>, Unit> {
        public C1659d() {
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
            C45168ma4 c45168ma4 = C32513Dw0.this.f6609k;
            Intrinsics.checkNotNullExpressionValue(tutorials, "tutorials");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) tutorials);
            c45168ma4.accept(first);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Tutorial;", "tutorial", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Tutorial;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw0$e */
    /* loaded from: classes3.dex */
    public static final class C1660e extends Lambda implements Function1<Tutorial, InterfaceC23447K<? extends Tutorial>> {
        public C1660e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Tutorial> invoke(Tutorial tutorial) {
            Intrinsics.checkNotNullParameter(tutorial, "tutorial");
            return C32513Dw0.this.m109644K(tutorial).m33042m(AbstractC23442F.m33158H(tutorial));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw0$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1661f extends FunctionReferenceImpl implements Function1<Tutorial, Unit> {
        public C1661f(Object obj) {
            super(1, obj, C32513Dw0.class, "populate", "populate(Lco/bird/android/model/persistence/Tutorial;)V", 0);
        }

        /* renamed from: a */
        public final void m109625a(Tutorial p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C32513Dw0) this.receiver).m109643L(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Tutorial tutorial) {
            m109625a(tutorial);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConfigurableTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialPresenter.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n350#2,7:217\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialPresenter.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialPresenter$consume$4\n*L\n76#1:217,7\n*E\n"})
    /* renamed from: Dw0$g */
    /* loaded from: classes3.dex */
    public static final class C1662g extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends Tutorial>>, Unit> {
        public C1662g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends List<? extends Tutorial>> pair) {
            invoke2((Pair<String, ? extends List<Tutorial>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends List<Tutorial>> pair) {
            String component1 = pair.component1();
            List<Tutorial> tutorials = pair.component2();
            Intrinsics.checkNotNullExpressionValue(tutorials, "tutorials");
            Iterator<Tutorial> it = tutorials.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getId(), component1)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == tutorials.size() - 1) {
                if (C32513Dw0.this.f6606h.mo28392a()) {
                    return;
                }
                C32513Dw0.this.f6605g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
                return;
            }
            C32513Dw0.this.f6609k.accept(tutorials.get(i + 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw0$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1663h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1663h f6617b = new C1663h();

        public C1663h() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw0$i */
    /* loaded from: classes3.dex */
    public static final class C1664i extends Lambda implements Function1<Pair<? extends Integer, ? extends Tutorial>, Unit> {
        public C1664i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Tutorial> pair) {
            invoke2((Pair<Integer, Tutorial>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, Tutorial> pair) {
            boolean isBlank;
            TutorialPage tutorialPage = pair.component2().getPages().get(pair.component1().intValue());
            C32513Dw0.this.f6610l.accept(tutorialPage);
            boolean z = true;
            C32513Dw0.this.m42280h(new C48492sA5(tutorialPage.getType() == ConfigurableTutorialType.CHAPTER_OPTIONAL));
            String buttonText = tutorialPage.getButtonText();
            if (buttonText != null) {
                C32513Dw0.this.m42280h(new C34849Nv5(buttonText));
            }
            if (tutorialPage.getType() == ConfigurableTutorialType.QUIZ) {
                C41318g46.m40163a("hiding button due to quiz page being shown", new Object[0]);
                C32513Dw0.this.m42280h(IM1.f15392a);
            } else {
                C41318g46.m40163a("showing button due to non-quiz page being shown", new Object[0]);
                C32513Dw0.this.m42280h(C37693Zz5.f49625a);
            }
            String helpButtonText = tutorialPage.getHelpButtonText();
            String zendeskHelpUrl = tutorialPage.getZendeskHelpUrl();
            if (zendeskHelpUrl != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(zendeskHelpUrl);
                if (!isBlank) {
                    z = false;
                }
            }
            if (!z && helpButtonText != null) {
                C32513Dw0.this.m42280h(new C37189Xv5(helpButtonText));
            } else {
                C32513Dw0.this.m42280h(JM1.f17398a);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012 \u0010\u0005\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw0$j */
    /* loaded from: classes3.dex */
    public static final class C1665j extends Lambda implements Function1<Pair<? extends Optional<Boolean>, ? extends TutorialPage>, Optional<Boolean>> {

        /* renamed from: g */
        public static final C1665j f6619g = new C1665j();

        public C1665j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Boolean> invoke(Pair<Optional<Boolean>, TutorialPage> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<Boolean> component1 = pair.component1();
            if (pair.component2().getType() != ConfigurableTutorialType.QUIZ) {
                return null;
            }
            return component1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "optionalAnswered", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw0$k */
    /* loaded from: classes3.dex */
    public static final class C1666k extends Lambda implements Function1<Optional<Boolean>, Unit> {
        public C1666k() {
            super(1);
        }

        /* renamed from: a */
        public final void m109623a(Optional<Boolean> optional) {
            Boolean m59035e = optional.m59035e();
            if (Intrinsics.areEqual(m59035e, Boolean.TRUE)) {
                C41318g46.m40163a("quiz page successfully answered, showing button", new Object[0]);
                C32513Dw0.this.m42280h(C37693Zz5.f49625a);
            } else if (Intrinsics.areEqual(m59035e, Boolean.FALSE)) {
                C41318g46.m40163a("quiz page not yet answered, hiding button", new Object[0]);
                C32513Dw0.this.m42280h(IM1.f15392a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Boolean> optional) {
            m109623a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "tutorialIds", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialPresenter.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialPresenter$consume$tutorialsObservable$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,216:1\n37#2,2:217\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialPresenter.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialPresenter$consume$tutorialsObservable$1\n*L\n53#1:217,2\n*E\n"})
    /* renamed from: Dw0$m */
    /* loaded from: classes3.dex */
    public static final class C1668m extends Lambda implements Function1<List<? extends String>, InterfaceC23447K<? extends List<? extends Tutorial>>> {
        public C1668m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Tutorial>> invoke(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            InterfaceC44791lw0 interfaceC44791lw0 = C32513Dw0.this.f6603e;
            String[] strArr = (String[]) tutorialIds.toArray(new String[0]);
            return interfaceC44791lw0.mo20263l0((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32513Dw0(InterfaceC44791lw0 manager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, C47756qw0 tutorialNavigator, boolean z, InterfaceC37014Xc1 endRideManager) {
        super(C50989wO5.f115894a);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tutorialNavigator, "tutorialNavigator");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        this.f6603e = manager;
        this.f6604f = analyticsManager;
        this.f6605g = navigator;
        this.f6606h = tutorialNavigator;
        this.f6607i = z;
        this.f6608j = endRideManager;
        C45168ma4<Tutorial> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Tutorial>()");
        this.f6609k = m25409g;
        C45168ma4<TutorialPage> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<TutorialPage>()");
        this.f6610l = m25409g2;
    }

    /* renamed from: A */
    public static final void m109654A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m109653B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m109652C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m109651D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m109650E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m109649F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m109648G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m109647H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23496h m109646I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m109645J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m109642g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23447K m109628z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public final AbstractC23461c m109644K(Tutorial tutorial) {
        boolean z;
        if (tutorial.getSkippable() && !this.f6607i) {
            List<TutorialPage> pages = tutorial.getPages();
            boolean z2 = true;
            if (!(pages instanceof Collection) || !pages.isEmpty()) {
                Iterator<T> it = pages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((TutorialPage) it.next()).getType() == ConfigurableTutorialType.QUIZ) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                return this.f6603e.mo20272B(tutorial.getId());
            }
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    /* renamed from: L */
    public final void m109643L(Tutorial tutorial) {
        m42280h(new C39460cw5(tutorial.getHeader()));
        m42280h(new C48706sY3(tutorial.getPages()));
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: y */
    public void consume(InterfaceC32981Fw0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<List<String>> mo82258g1 = renderer.mo82258g1();
        final C1668m c1668m = new C1668m();
        AbstractC24495a tutorialsObservable = mo82258g1.flatMapSingle(new InterfaceC23492o() { // from class: rw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m109628z;
                m109628z = C32513Dw0.m109628z(Function1.this, obj);
                return m109628z;
            }
        }).publish();
        Intrinsics.checkNotNullExpressionValue(tutorialsObservable, "tutorialsObservable");
        Object m33094as = tutorialsObservable.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1659d c1659d = new C1659d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ww0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109642g(Function1.this, obj);
            }
        });
        C45168ma4<Tutorial> c45168ma4 = this.f6609k;
        final C1660e c1660e = new C1660e();
        Observable<R> flatMapSingle = c45168ma4.flatMapSingle(new InterfaceC23492o() { // from class: xw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m109652C;
                m109652C = C32513Dw0.m109652C(Function1.this, obj);
                return m109652C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…sObservable.connect()\n  }");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1661f c1661f = new C1661f(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109651D(Function1.this, obj);
            }
        });
        Object m33094as3 = C24527f.m31950a(renderer.mo82259e5(), tutorialsObservable).m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1662g c1662g = new C1662g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: zw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109650E(Function1.this, obj);
            }
        };
        final C1663h c1663h = C1663h.f6617b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Aw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109649F(Function1.this, obj);
            }
        });
        Object m33094as4 = C24527f.m31950a(renderer.mo82256l9(), this.f6609k).m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1664i c1664i = new C1664i();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Bw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109648G(Function1.this, obj);
            }
        });
        Observable observeOn = C37279Yf5.m74575T(C24527f.m31950a(renderer.mo82263G2(), this.f6610l), C1665j.f6619g).observeOn(C23454a.m33087a());
        final C1666k c1666k = new C1666k();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: Cw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109647H(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…sObservable.connect()\n  }");
        Object m33094as5 = doOnNext.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe();
        Observable m31950a = C24527f.m31950a(renderer.mo82255t2(), this.f6609k);
        final C1667l c1667l = new C1667l();
        AbstractC23461c flatMapCompletable = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: sw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m109646I;
                m109646I = C32513Dw0.m109646I(Function1.this, obj);
                return m109646I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…sObservable.connect()\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Boolean> observeOn2 = renderer.mo82254t5().observeOn(C23454a.m33087a());
        final C1656a c1656a = new C1656a();
        Observable<Boolean> doOnNext2 = observeOn2.doOnNext(new InterfaceC23484g() { // from class: tw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109645J(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun consume(ren…sObservable.connect()\n  }");
        Object m33094as6 = doOnNext2.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as6).subscribe();
        Object m33094as7 = renderer.mo82262L().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1657b c1657b = new C1657b();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: uw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109654A(Function1.this, obj);
            }
        });
        Object m33094as8 = C24527f.m31949b(renderer.mo82257h6(), renderer.mo82256l9(), this.f6609k).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1658c c1658c = new C1658c();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: vw0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32513Dw0.m109653B(Function1.this, obj);
            }
        });
        tutorialsObservable.m32087e();
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Tutorial;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw0$l */
    /* loaded from: classes3.dex */
    public static final class C1667l extends Lambda implements Function1<Pair<? extends Boolean, ? extends Tutorial>, InterfaceC23496h> {
        public C1667l() {
            super(1);
        }

        /* renamed from: b */
        public static final void m109621b(boolean z, C32513Dw0 this$0, Tutorial tutorial) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!z) {
                this$0.m42280h(new C40169e83(tutorial.getPages().size()));
                return;
            }
            this$0.f6604f.mo55905y(new C35363Qa6(null, null, null, tutorial.getId(), this$0.f6608j.mo55540n(), tutorial.getViewCount() + 1, 7, null));
            this$0.m42280h(new R51(tutorial.getId()));
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Boolean, Tutorial> pair) {
            AbstractC23461c m33039p;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final boolean booleanValue = pair.component1().booleanValue();
            final Tutorial component2 = pair.component2();
            if (!component2.getSkippable() && booleanValue && !C32513Dw0.this.f6607i) {
                m33039p = C32513Dw0.this.f6603e.mo20272B(component2.getId());
            } else {
                m33039p = AbstractC23461c.m33039p();
            }
            final C32513Dw0 c32513Dw0 = C32513Dw0.this;
            return m33039p.m33029z(new InterfaceC23478a() { // from class: Ew0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C32513Dw0.C1667l.m109621b(booleanValue, c32513Dw0, component2);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Boolean, ? extends Tutorial> pair) {
            return invoke2((Pair<Boolean, Tutorial>) pair);
        }
    }
}
