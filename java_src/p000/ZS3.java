package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RideState;
import co.bird.android.model.analytics.PhysicalLockTutorialViewed;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010(\u001a\u00020%\u0012\b\b\u0001\u0010,\u001a\u00020)¢\u0006\u0004\b2\u00103J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010\u00060\u00060-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, m28432d2 = {"LZS3;", "LWS3;", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "", "forceEndTutorialSteps", "", C17296a.f69688o, "Lio/reactivex/Observable;", "observeDone", "Lgl;", "Lgl;", "preference", "LEa;", "b", "LEa;", "analyticsManager", "Le13;", "c", "Le13;", "navigator", "LoI5;", DateTokenConverter.CONVERTER_KEY, "LoI5;", "smartlockManager", "LYR4;", "e", "LYR4;", "rideManager", "LTq4;", "f", "LTq4;", "reactiveConfig", "LXc1;", "g", "LXc1;", "endRideManager", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LdT3;", "i", "LdT3;", "ui", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "doneEvents", "<init>", "(Lgl;LEa;Le13;LoI5;LYR4;LTq4;LXc1;Lcom/uber/autodispose/ScopeProvider;LdT3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockTutorialPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockTutorialPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,119:1\n180#2:120\n180#2:121\n*S KotlinDebug\n*F\n+ 1 PhysicalLockTutorialPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockTutorialPresenterImpl\n*L\n95#1:120\n107#1:121\n*E\n"})
/* renamed from: ZS3 */
/* loaded from: classes2.dex */
public final class ZS3 implements WS3 {

    /* renamed from: a */
    public final C22454gl f48597a;

    /* renamed from: b */
    public final InterfaceC1880Ea f48598b;

    /* renamed from: c */
    public final InterfaceC40099e13 f48599c;

    /* renamed from: d */
    public final InterfaceC46193oI5 f48600d;

    /* renamed from: e */
    public final YR4 f48601e;

    /* renamed from: f */
    public final C36207Tq4 f48602f;

    /* renamed from: g */
    public final InterfaceC37014Xc1 f48603g;

    /* renamed from: h */
    public final ScopeProvider f48604h;

    /* renamed from: i */
    public final InterfaceC39768dT3 f48605i;

    /* renamed from: j */
    public final C45168ma4<Unit> f48606j;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZS3$a */
    /* loaded from: classes2.dex */
    public static final class C10275a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WirePhysicalLock f48607g;

        /* renamed from: h */
        public final /* synthetic */ ZS3 f48608h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10275a(WirePhysicalLock wirePhysicalLock, ZS3 zs3) {
            super(1);
            this.f48607g = wirePhysicalLock;
            this.f48608h = zs3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            String physicalLockPurpose;
            Map<String, Long> zendeskArticleIdByPurpose;
            PhysicalLockPurpose purpose = this.f48607g.getPurpose();
            Unit unit2 = null;
            Long l = (purpose == null || (physicalLockPurpose = purpose.toString()) == null || (zendeskArticleIdByPurpose = this.f48608h.f48602f.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getZendeskArticleIdByPurpose()) == null) ? null : zendeskArticleIdByPurpose.get(physicalLockPurpose);
            if (l != null) {
                this.f48608h.f48599c.mo36922w3(l.longValue());
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                InterfaceC40099e13.C19924a.goToHelp$default(this.f48608h.f48599c, MapMode.RIDER, null, false, 6, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZS3$b */
    /* loaded from: classes2.dex */
    public static final class C10276b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<WirePhysicalLockTutorialStep> f48610h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10276b(List<WirePhysicalLockTutorialStep> list) {
            super(1);
            this.f48610h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            int lastIndex;
            int mo13060l4 = ZS3.this.f48605i.mo13060l4();
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f48610h);
            if (mo13060l4 == lastIndex) {
                ZS3.this.f48606j.accept(Unit.INSTANCE);
            } else {
                ZS3.this.f48605i.mo13066N3(ZS3.this.f48605i.mo13060l4() + 1);
            }
        }
    }

    public ZS3(C22454gl preference, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, InterfaceC46193oI5 smartlockManager, YR4 rideManager, C36207Tq4 reactiveConfig, InterfaceC37014Xc1 endRideManager, ScopeProvider scopeProvider, InterfaceC39768dT3 ui) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f48597a = preference;
        this.f48598b = analyticsManager;
        this.f48599c = navigator;
        this.f48600d = smartlockManager;
        this.f48601e = rideManager;
        this.f48602f = reactiveConfig;
        this.f48603g = endRideManager;
        this.f48604h = scopeProvider;
        this.f48605i = ui;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f48606j = m25409g;
    }

    /* renamed from: d */
    public static final void m73090d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m73089e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.WS3
    /* renamed from: a */
    public void mo73093a(WirePhysicalLock wirePhysicalLock, boolean z) {
        boolean z2;
        List<WirePhysicalLockTutorialStep> tutorialSteps;
        WireRide wireRide;
        String str;
        String str2;
        int i;
        boolean z3 = false;
        if (this.f48600d.mo21395l() <= 0 && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str3 = null;
        if (z2) {
            if (wirePhysicalLock == null || (tutorialSteps = wirePhysicalLock.getEndRideTutorialSteps()) == null) {
                if (wirePhysicalLock != null) {
                    tutorialSteps = wirePhysicalLock.getTutorialSteps();
                }
                tutorialSteps = null;
            }
        } else {
            if (wirePhysicalLock != null) {
                tutorialSteps = wirePhysicalLock.getTutorialSteps();
            }
            tutorialSteps = null;
        }
        if (wirePhysicalLock != null && tutorialSteps != null) {
            this.f48605i.mo13067Je(tutorialSteps);
            this.f48597a.m37677T1(wirePhysicalLock.getKind());
            this.f48598b.mo55956N(new PhysicalLockTutorialViewed(wirePhysicalLock.getKind()));
            RideState m59035e = this.f48601e.mo75034m0().m73665a().m59035e();
            if (m59035e != null) {
                wireRide = m59035e.getRide();
            } else {
                wireRide = null;
            }
            InterfaceC1880Ea interfaceC1880Ea = this.f48598b;
            if (z2) {
                str = "ride_end";
            } else {
                str = "ride_start";
            }
            String str4 = str;
            String id = wirePhysicalLock.getId();
            if (wireRide != null) {
                str2 = wireRide.getBirdId();
            } else {
                str2 = null;
            }
            if (wireRide != null) {
                str3 = wireRide.getId();
            }
            interfaceC1880Ea.mo55905y(new C40953fT3(null, null, null, str4, id, str2, str3, wirePhysicalLock.getKind(), String.valueOf(wirePhysicalLock.getPurpose()), this.f48603g.mo55540n(), 7, null));
            PhysicalLockPurpose purpose = wirePhysicalLock.getPurpose();
            PhysicalLockPurpose physicalLockPurpose = PhysicalLockPurpose.HELMET;
            if (purpose == physicalLockPurpose) {
                if (z2) {
                    i = C45871nl4.physical_lock_end_tutorial_helmet_title;
                } else {
                    i = C45871nl4.physical_lock_tutorial_helmet_title;
                }
                this.f48605i.setTitle(i);
            }
            InterfaceC39768dT3 interfaceC39768dT3 = this.f48605i;
            if (wirePhysicalLock.getPurpose() == physicalLockPurpose) {
                z3 = true;
            }
            interfaceC39768dT3.mo13065Q4(z3);
            Object m33094as = this.f48605i.mo13059r0().m33094as(AutoDispose.m45239a(this.f48604h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C10275a c10275a = new C10275a(wirePhysicalLock, this);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: XS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ZS3.m73090d(Function1.this, obj);
                }
            });
            Object m33094as2 = this.f48605i.mo13058u().m33094as(AutoDispose.m45239a(this.f48604h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C10276b c10276b = new C10276b(tutorialSteps);
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: YS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ZS3.m73089e(Function1.this, obj);
                }
            });
            return;
        }
        this.f48606j.accept(Unit.INSTANCE);
    }

    @Override // p000.WS3
    public Observable<Unit> observeDone() {
        Observable<Unit> hide = this.f48606j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "doneEvents.hide()");
        return hide;
    }
}
