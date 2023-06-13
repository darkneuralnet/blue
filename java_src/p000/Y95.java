package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.autopay.C13674a;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideState;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePrivateBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Lazy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC44791lw0;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bo\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0001\u00101\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, m28432d2 = {"LY95;", "LxC;", "LN95;", "", C17296a.f69688o, "onDestroy", "Lca5;", "modalPresenter", "Lco/bird/android/model/RideState;", "rideState", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lio/reactivex/p;", "LDU2;", "H", "K", "LYR4;", "c", "LYR4;", "rideManager", "Ldagger/Lazy;", "Lco/bird/android/app/feature/autopay/a;", DateTokenConverter.CONVERTER_KEY, "Ldagger/Lazy;", "autoPayPresenter", "LLa5;", "e", "tutorialPresenter", "LTq4;", "f", "LTq4;", "reactiveConfig", "Llw0;", "g", "Llw0;", "configurableTutorialManager", "Le13;", "h", "Le13;", "navigator", "i", "Lco/bird/android/core/mvp/BaseActivity;", "", "Lco/bird/android/model/RideState$Status;", "j", "Ljava/util/Set;", "events", "k", "LDU2;", "currentModal", "<init>", "(LYR4;Ldagger/Lazy;Ldagger/Lazy;LTq4;Llw0;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderModalPresenter.kt\nco/bird/android/app/dialog/RiderModalCoordinatingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,167:1\n180#2:168\n237#2:169\n*S KotlinDebug\n*F\n+ 1 RiderModalPresenter.kt\nco/bird/android/app/dialog/RiderModalCoordinatingPresenterImpl\n*L\n98#1:168\n104#1:169\n*E\n"})
/* renamed from: Y95 */
/* loaded from: classes2.dex */
public final class Y95 extends C30060xC implements N95 {

    /* renamed from: c */
    public final YR4 f44708c;

    /* renamed from: d */
    public final Lazy<C13674a> f44709d;

    /* renamed from: e */
    public final Lazy<C34192La5> f44710e;

    /* renamed from: f */
    public final C36207Tq4 f44711f;

    /* renamed from: g */
    public final InterfaceC44791lw0 f44712g;

    /* renamed from: h */
    public final InterfaceC40099e13 f44713h;

    /* renamed from: i */
    public final BaseActivity f44714i;

    /* renamed from: j */
    public final Set<RideState.Status> f44715j;

    /* renamed from: k */
    public DU2 f44716k;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y95$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9683a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RideState.Status.values().length];
            try {
                iArr[RideState.Status.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideState.Status.ENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LDU2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y95$b */
    /* loaded from: classes2.dex */
    public static final class C9684b extends Lambda implements Function1<Unit, InterfaceC24574u<? extends DU2>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39222ca5 f44717g;

        /* renamed from: h */
        public final /* synthetic */ RideState f44718h;

        /* renamed from: i */
        public final /* synthetic */ LifecycleScopeProvider<EnumC7097RE> f44719i;

        /* renamed from: j */
        public final /* synthetic */ BaseActivity f44720j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9684b(InterfaceC39222ca5 interfaceC39222ca5, RideState rideState, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity) {
            super(1);
            this.f44717g = interfaceC39222ca5;
            this.f44718h = rideState;
            this.f44719i = lifecycleScopeProvider;
            this.f44720j = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DU2> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f44717g.mo60820a(this.f44718h, this.f44719i, this.f44720j).m32065J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Tutorial;", "tutorials", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderModalPresenter.kt\nco/bird/android/app/dialog/RiderModalCoordinatingPresenterImpl$maybeShowTutorialV2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n1549#2:168\n1620#2,3:169\n*S KotlinDebug\n*F\n+ 1 RiderModalPresenter.kt\nco/bird/android/app/dialog/RiderModalCoordinatingPresenterImpl$maybeShowTutorialV2$2\n*L\n155#1:168\n155#1:169,3\n*E\n"})
    /* renamed from: Y95$c */
    /* loaded from: classes2.dex */
    public static final class C9685c extends Lambda implements Function1<List<? extends Tutorial>, List<? extends String>> {

        /* renamed from: g */
        public static final C9685c f44721g = new C9685c();

        public C9685c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(List<Tutorial> tutorials) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(tutorials, "tutorials");
            List<Tutorial> list = tutorials;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial : list) {
                arrayList.add(tutorial.getId());
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "tutorialIds", "Lio/reactivex/u;", "LDU2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y95$d */
    /* loaded from: classes2.dex */
    public static final class C9686d extends Lambda implements Function1<List<? extends String>, InterfaceC24574u<? extends DU2>> {
        public C9686d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DU2> invoke(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            if (tutorialIds.isEmpty()) {
                return AbstractC24507p.m32024u();
            }
            InterfaceC40099e13.C19924a.goToConfigurableTutorials$default(Y95.this.f44713h, tutorialIds, null, false, 6, null);
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y95$e */
    /* loaded from: classes2.dex */
    public static final class C9687e extends Lambda implements Function1<Optional<RideState>, Boolean> {

        /* renamed from: g */
        public static final C9687e f44723g = new C9687e();

        public C9687e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<RideState> it) {
            boolean z;
            WirePrivateBird wirePrivateBird;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m59037c()) {
                WireBird bird = it.m59038b().getRide().getBird();
                if (bird != null) {
                    wirePrivateBird = bird.getPrivateBird();
                } else {
                    wirePrivateBird = null;
                }
                if (wirePrivateBird == null) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/RideState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y95$f */
    /* loaded from: classes2.dex */
    public static final class C9688f extends Lambda implements Function1<Optional<RideState>, RideState> {

        /* renamed from: g */
        public static final C9688f f44724g = new C9688f();

        public C9688f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideState invoke(Optional<RideState> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideState;", "first", "second", "", C17296a.f69688o, "(Lco/bird/android/model/RideState;Lco/bird/android/model/RideState;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y95$g */
    /* loaded from: classes2.dex */
    public static final class C9689g extends Lambda implements Function2<RideState, RideState, Boolean> {

        /* renamed from: g */
        public static final C9689g f44725g = new C9689g();

        public C9689g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(RideState first, RideState second) {
            boolean z;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (first.getStatus() == second.getStatus() && Intrinsics.areEqual(first.getRide().getId(), second.getRide().getId())) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RideState;", "rideState", "Lio/reactivex/u;", "LDU2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideState;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y95$h */
    /* loaded from: classes2.dex */
    public static final class C9690h extends Lambda implements Function1<RideState, InterfaceC24574u<? extends DU2>> {
        public C9690h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DU2> invoke(RideState rideState) {
            AbstractC24507p m75521H;
            Intrinsics.checkNotNullParameter(rideState, "rideState");
            if (Y95.this.f44715j.contains(rideState.getStatus())) {
                Y95 y95 = Y95.this;
                Object obj = y95.f44709d.get();
                Intrinsics.checkNotNullExpressionValue(obj, "autoPayPresenter.get()");
                AbstractC24507p m75521H2 = y95.m75521H((InterfaceC39222ca5) obj, rideState, Y95.this.m5717t(), Y95.this.f44714i);
                if (Y95.this.f44711f.m82623f8().m73665a().getTutorialV2().getEnabled()) {
                    m75521H = Y95.this.m75518K(rideState);
                } else {
                    Y95 y952 = Y95.this;
                    Object obj2 = y952.f44710e.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "tutorialPresenter.get()");
                    m75521H = y952.m75521H((InterfaceC39222ca5) obj2, rideState, Y95.this.m5717t(), Y95.this.f44714i);
                }
                return m75521H2.m32054V(m75521H);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y95$i */
    /* loaded from: classes2.dex */
    public static final class C9691i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C9691i f44727g = new C9691i();

        public C9691i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while fetching tutorials", new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y95(YR4 rideManager, Lazy<C13674a> autoPayPresenter, Lazy<C34192La5> tutorialPresenter, C36207Tq4 reactiveConfig, InterfaceC44791lw0 configurableTutorialManager, InterfaceC40099e13 navigator, LifecycleScopeProvider<EnumC7097RE> scopeProvider, BaseActivity activity, Set<? extends RideState.Status> events) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(autoPayPresenter, "autoPayPresenter");
        Intrinsics.checkNotNullParameter(tutorialPresenter, "tutorialPresenter");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f44708c = rideManager;
        this.f44709d = autoPayPresenter;
        this.f44710e = tutorialPresenter;
        this.f44711f = reactiveConfig;
        this.f44712g = configurableTutorialManager;
        this.f44713h = navigator;
        this.f44714i = activity;
        this.f44715j = events;
    }

    /* renamed from: I */
    public static final Unit m75520I() {
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final InterfaceC24574u m75519J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23447K m75517L(Y95 this$0, ConfigurableTutorialContext context, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        return InterfaceC44791lw0.C25816a.getTutorialsByContext$default(this$0.f44712g, context, str, false, 4, null);
    }

    /* renamed from: M */
    public static final List m75516M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC24574u m75515N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final boolean m75514O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: P */
    public static final RideState m75513P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideState) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final boolean m75512Q(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: R */
    public static final InterfaceC24574u m75511R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m75510S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public final AbstractC24507p<DU2> m75521H(InterfaceC39222ca5 interfaceC39222ca5, RideState rideState, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity) {
        if (!baseActivity.isFinishing()) {
            AbstractC24507p m32071D = AbstractC24507p.m32071D(new Callable() { // from class: O95
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m75520I;
                    m75520I = Y95.m75520I();
                    return m75520I;
                }
            });
            final C9684b c9684b = new C9684b(interfaceC39222ca5, rideState, lifecycleScopeProvider, baseActivity);
            AbstractC24507p<DU2> m32021x = m32071D.m32021x(new InterfaceC23492o() { // from class: P95
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m75519J;
                    m75519J = Y95.m75519J(Function1.this, obj);
                    return m75519J;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32021x, "modalPresenter: RiderMod…omplete()\n        }\n    }");
            return m32021x;
        }
        AbstractC24507p<DU2> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "{\n      Maybe.empty<Modal>()\n    }");
        return m32024u;
    }

    /* renamed from: K */
    public final AbstractC24507p<DU2> m75518K(RideState rideState) {
        final ConfigurableTutorialContext configurableTutorialContext;
        final String str;
        int i = C9683a.$EnumSwitchMapping$0[rideState.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                AbstractC24507p<DU2> m32024u = AbstractC24507p.m32024u();
                Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
                return m32024u;
            }
            configurableTutorialContext = ConfigurableTutorialContext.RIDE_END;
        } else {
            configurableTutorialContext = ConfigurableTutorialContext.RIDE_START;
        }
        WireBird bird = rideState.getRide().getBird();
        if (bird != null) {
            str = bird.getModel();
        } else {
            str = null;
        }
        AbstractC23442F m33042m = this.f44712g.mo20264k0(5L).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Q95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m75517L;
                m75517L = Y95.m75517L(Y95.this, configurableTutorialContext, str);
                return m75517L;
            }
        }));
        final C9685c c9685c = C9685c.f44721g;
        AbstractC23442F m33157I = m33042m.m33157I(new InterfaceC23492o() { // from class: R95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m75516M;
                m75516M = Y95.m75516M(Function1.this, obj);
                return m75516M;
            }
        });
        final C9686d c9686d = new C9686d();
        AbstractC24507p<DU2> m33163C = m33157I.m33163C(new InterfaceC23492o() { // from class: S95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m75515N;
                m75515N = Y95.m75515N(Function1.this, obj);
                return m75515N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "private fun maybeShowTut…y()\n        }\n      }\n  }");
        return m33163C;
    }

    @Override // p000.N95
    /* renamed from: a */
    public void mo75509a() {
        Z84<Optional<RideState>> mo75057R = this.f44708c.mo75057R();
        final C9687e c9687e = C9687e.f44723g;
        Observable<Optional<RideState>> filter = mo75057R.filter(new InterfaceC23494q() { // from class: T95
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m75514O;
                m75514O = Y95.m75514O(Function1.this, obj);
                return m75514O;
            }
        });
        final C9688f c9688f = C9688f.f44724g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: U95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideState m75513P;
                m75513P = Y95.m75513P(Function1.this, obj);
                return m75513P;
            }
        });
        final C9689g c9689g = C9689g.f44725g;
        Observable observeOn = map.distinctUntilChanged(new InterfaceC23481d() { // from class: V95
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m75512Q;
                m75512Q = Y95.m75512Q(Function2.this, obj, obj2);
                return m75512Q;
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        final C9690h c9690h = new C9690h();
        Observable flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: W95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m75511R;
                m75511R = Y95.m75511R(Function1.this, obj);
                return m75511R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        AbstractC23461c mo20267g = this.f44712g.mo20267g();
        final C9691i c9691i = C9691i.f44727g;
        AbstractC23461c m33069Q = mo20267g.m33084B(new InterfaceC23484g() { // from class: X95
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                Y95.m75510S(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "configurableTutorialMana…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.C30060xC, p000.N95
    public void onDestroy() {
        super.onDestroy();
        DU2 du2 = this.f44716k;
        if (du2 != null) {
            du2.m110368k();
        }
    }
}
