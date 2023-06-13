package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.analytics.AnnouncementShown;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.FeatureAnnouncementDialogResponse;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C41707gk1;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001*By\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u000105\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m28432d2 = {"Lgk1;", "", "", "Lco/bird/android/model/persistence/Announcement;", "Lgk1$h;", "parameters", "Lco/bird/android/buava/Optional;", "s", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "t", "q", "Lqg;", C17296a.f69688o, "Lqg;", "announcementsManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "LEa;", "c", "LEa;", "analyticsManager", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "appPreference", "LYR4;", "e", "LYR4;", "rideManager", "LpU4;", "f", "LpU4;", "rideMapStateManager", "LTk0;", "g", "LTk0;", "clipboardManager", "Lxk1;", "h", "Lxk1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "j", "Le13;", "navigator", "LZr1;", "k", "LZr1;", "flightBannerCoordinatorPresenter", "l", "Lco/bird/android/model/constant/AnnouncementContext;", "m", "Lgk1$h;", "<init>", "(Lqg;LTq4;LEa;Lgl;LYR4;LpU4;LTk0;Lxk1;Lcom/uber/autodispose/ScopeProvider;Le13;LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFeatureAnnouncementModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureAnnouncementModalPresenter.kt\nco/bird/android/lib/announcement/FeatureAnnouncementModalPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n180#2:267\n288#3,2:268\n*S KotlinDebug\n*F\n+ 1 FeatureAnnouncementModalPresenter.kt\nco/bird/android/lib/announcement/FeatureAnnouncementModalPresenter\n*L\n186#1:267\n211#1:268,2\n*E\n"})
/* renamed from: gk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41707gk1 {

    /* renamed from: a */
    public final InterfaceC27649qg f84098a;

    /* renamed from: b */
    public final C36207Tq4 f84099b;

    /* renamed from: c */
    public final InterfaceC1880Ea f84100c;

    /* renamed from: d */
    public final C22454gl f84101d;

    /* renamed from: e */
    public final YR4 f84102e;

    /* renamed from: f */
    public final InterfaceC46893pU4 f84103f;

    /* renamed from: g */
    public final InterfaceC36149Tk0 f84104g;

    /* renamed from: h */
    public final InterfaceC51786xk1 f84105h;

    /* renamed from: i */
    public final ScopeProvider f84106i;

    /* renamed from: j */
    public final InterfaceC40099e13 f84107j;

    /* renamed from: k */
    public final InterfaceC37617Zr1 f84108k;

    /* renamed from: l */
    public final AnnouncementContext f84109l;

    /* renamed from: m */
    public final C22436h f84110m;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gk1$a */
    /* loaded from: classes3.dex */
    public static final class C22423a extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C22423a f84111g = new C22423a();

        public C22423a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$b */
    /* loaded from: classes3.dex */
    public static final class C22424b extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends List<? extends Announcement>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: gk1$b$a */
        /* loaded from: classes3.dex */
        public static final class C22425a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C22425a f84113g = new C22425a();

            public C22425a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while fetching announcements, failing silently.", new Object[0]);
            }
        }

        public C22424b() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23434B m37812c(C41707gk1 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f84098a.mo6524b0(this$0.f84109l);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends List<Announcement>> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo6514p = C41707gk1.this.f84098a.mo6514p();
            final C22425a c22425a = C22425a.f84113g;
            AbstractC23461c m33069Q = mo6514p.m33084B(new InterfaceC23484g() { // from class: hk1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41707gk1.C22424b.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
            final C41707gk1 c41707gk1 = C41707gk1.this;
            return m33069Q.m33043l(Observable.defer(new Callable() { // from class: ik1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23434B m37812c;
                    m37812c = C41707gk1.C22424b.m37812c(C41707gk1.this);
                    return m37812c;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Announcement;", "announcements", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$c */
    /* loaded from: classes3.dex */
    public static final class C22426c extends Lambda implements Function1<List<? extends Announcement>, Optional<Announcement>> {
        public C22426c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Announcement> invoke(List<Announcement> announcements) {
            Intrinsics.checkNotNullParameter(announcements, "announcements");
            C41707gk1 c41707gk1 = C41707gk1.this;
            return c41707gk1.m37817s(announcements, c41707gk1.f84110m);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Announcement;", "announcement", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$d */
    /* loaded from: classes3.dex */
    public static final class C22427d extends Lambda implements Function1<Announcement, InterfaceC23434B<? extends Announcement>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/Announcement;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gk1$d$a */
        /* loaded from: classes3.dex */
        public static final class C22428a extends Lambda implements Function1<Unit, Announcement> {

            /* renamed from: g */
            public final /* synthetic */ Announcement f84116g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22428a(Announcement announcement) {
                super(1);
                this.f84116g = announcement;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Announcement invoke(Unit it) {
                Announcement copy;
                Intrinsics.checkNotNullParameter(it, "it");
                Announcement announcement = this.f84116g;
                Intrinsics.checkNotNullExpressionValue(announcement, "announcement");
                copy = announcement.copy((r38 & 1) != 0 ? announcement.f66668id : null, (r38 & 2) != 0 ? announcement.context : null, (r38 & 4) != 0 ? announcement.contextParameters : null, (r38 & 8) != 0 ? announcement.displayType : AnnouncementDisplayType.FULL_SCREEN, (r38 & 16) != 0 ? announcement.contentType : null, (r38 & 32) != 0 ? announcement.title : null, (r38 & 64) != 0 ? announcement.titleAsset : null, (r38 & 128) != 0 ? announcement.message : null, (r38 & 256) != 0 ? announcement.messageUrl : null, (r38 & 512) != 0 ? announcement.buttonText : null, (r38 & 1024) != 0 ? announcement.analyticsTitle : null, (r38 & 2048) != 0 ? announcement.buttonUrl : null, (r38 & 4096) != 0 ? announcement.openInWebview : null, (r38 & 8192) != 0 ? announcement.auxiliaryTitle : null, (r38 & 16384) != 0 ? announcement.auxiliaryBody : null, (r38 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? announcement.auxiliaryAsset : null, (r38 & 65536) != 0 ? announcement.shareContent : null, (r38 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? announcement.learnMoreUrl : null, (r38 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? announcement.pages : null, (r38 & 524288) != 0 ? announcement.navigationTitle : null);
                return copy;
            }
        }

        public C22427d() {
            super(1);
        }

        /* renamed from: c */
        public static final Announcement m37808c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Announcement) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Announcement> invoke(Announcement announcement) {
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            if (announcement.isSideMenuBanner()) {
                AbstractC23461c mo4758ia = C41707gk1.this.f84105h.mo4758ia(announcement);
                Observable<Unit> mo4759W4 = C41707gk1.this.f84105h.mo4759W4();
                final C22428a c22428a = new C22428a(announcement);
                return mo4758ia.m33043l(mo4759W4.map(new InterfaceC23492o() { // from class: jk1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Announcement m37808c;
                        m37808c = C41707gk1.C22427d.m37808c(Function1.this, obj);
                        return m37808c;
                    }
                }));
            }
            return Observable.just(announcement);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Announcement;", "announcement", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "kotlin.jvm.PlatformType", "f", "(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$e */
    /* loaded from: classes3.dex */
    public static final class C22429e extends Lambda implements Function1<Announcement, InterfaceC23434B<? extends FeatureAnnouncementDialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: gk1$e$a */
        /* loaded from: classes3.dex */
        public static final class C22430a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C22430a f84118g = new C22430a();

            public C22430a() {
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
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gk1$e$b */
        /* loaded from: classes3.dex */
        public static final class C22431b extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41707gk1 f84119g;

            /* renamed from: h */
            public final /* synthetic */ Announcement f84120h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22431b(C41707gk1 c41707gk1, Announcement announcement) {
                super(1);
                this.f84119g = c41707gk1;
                this.f84120h = announcement;
            }

            /* renamed from: a */
            public final void m37795a(InterfaceC23465c interfaceC23465c) {
                InterfaceC1880Ea interfaceC1880Ea = this.f84119g.f84100c;
                String id = this.f84120h.getId();
                AnnouncementContext announcementContext = this.f84119g.f84109l;
                String analyticsTitle = this.f84120h.getAnalyticsTitle();
                if (analyticsTitle == null) {
                    analyticsTitle = this.f84120h.getTitle();
                }
                interfaceC1880Ea.mo55956N(new AnnouncementShown(id, announcementContext, analyticsTitle));
                this.f84119g.f84100c.mo55905y(new C27023og(null, null, null, this.f84120h.getId(), this.f84120h.getAnalyticsTitle(), null, this.f84120h.getContext().name(), this.f84120h.getDisplayType().name(), this.f84120h.getContentType().name(), this.f84119g.f84101d.m37698O0(this.f84120h.getId()), 39, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m37795a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "response", C17296a.f69688o, "(Lkotlin/Unit;Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gk1$e$c */
        /* loaded from: classes3.dex */
        public static final class C22432c extends Lambda implements Function2<Unit, FeatureAnnouncementDialogResponse, FeatureAnnouncementDialogResponse> {

            /* renamed from: g */
            public static final C22432c f84121g = new C22432c();

            public C22432c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final FeatureAnnouncementDialogResponse invoke(Unit unit, FeatureAnnouncementDialogResponse response) {
                Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(response, "response");
                return response;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/FlightBannerNode;", "list", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nFeatureAnnouncementModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureAnnouncementModalPresenter.kt\nco/bird/android/lib/announcement/FeatureAnnouncementModalPresenter$5$showStream$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
        /* renamed from: gk1$e$d */
        /* loaded from: classes3.dex */
        public static final class C22433d extends Lambda implements Function1<List<? extends Optional<FlightBannerNode>>, InterfaceC24574u<? extends FeatureAnnouncementDialogResponse.Dismiss>> {

            /* renamed from: g */
            public final /* synthetic */ Announcement f84122g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22433d(Announcement announcement) {
                super(1);
                this.f84122g = announcement;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final InterfaceC24574u<? extends FeatureAnnouncementDialogResponse.Dismiss> invoke(List<Optional<FlightBannerNode>> list) {
                Object firstOrNull;
                FlightBannerNode flightBannerNode;
                Object lastOrNull;
                Optional optional;
                FlightBannerNode flightBannerNode2;
                boolean z;
                Intrinsics.checkNotNullParameter(list, "list");
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
                Optional optional2 = (Optional) firstOrNull;
                FlightBannerNode.FlightBanner flightBanner = null;
                if (optional2 != null) {
                    if (list.size() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        optional2 = null;
                    }
                    if (optional2 != null) {
                        flightBannerNode = (FlightBannerNode) optional2.m59035e();
                        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
                        optional = (Optional) lastOrNull;
                        if (optional == null) {
                            flightBannerNode2 = (FlightBannerNode) optional.m59035e();
                        } else {
                            flightBannerNode2 = null;
                        }
                        if (!Intrinsics.areEqual(flightBannerNode, flightBannerNode2)) {
                            if (flightBannerNode != null) {
                                flightBanner = flightBannerNode.getBanner();
                            }
                            if (flightBanner == FlightBannerNode.FlightBanner.ANNOUNCEMENT) {
                                Announcement announcement = this.f84122g;
                                Intrinsics.checkNotNullExpressionValue(announcement, "announcement");
                                return AbstractC24507p.m32068G(new FeatureAnnouncementDialogResponse.Dismiss(announcement));
                            }
                        }
                        return AbstractC24507p.m32024u();
                    }
                }
                flightBannerNode = null;
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
                optional = (Optional) lastOrNull;
                if (optional == null) {
                }
                if (!Intrinsics.areEqual(flightBannerNode, flightBannerNode2)) {
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C22429e() {
            super(1);
        }

        /* renamed from: g */
        public static final InterfaceC23447K m37800g(C41707gk1 this$0, Announcement announcement) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(announcement, "$announcement");
            Observable m74549j0 = C37279Yf5.m74549j0(this$0.f84108k.mo40696L1(), 2, true);
            final C22433d c22433d = new C22433d(announcement);
            return m74549j0.flatMapMaybe(new InterfaceC23492o() { // from class: ok1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m37799h;
                    m37799h = C41707gk1.C22429e.m37799h(Function1.this, obj);
                    return m37799h;
                }
            }).first(new FeatureAnnouncementDialogResponse.Dismiss(announcement));
        }

        /* renamed from: h */
        public static final InterfaceC24574u m37799h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m37798i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final void m37797j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final FeatureAnnouncementDialogResponse m37796k(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (FeatureAnnouncementDialogResponse) tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: f */
        public final InterfaceC23434B<? extends FeatureAnnouncementDialogResponse> invoke(final Announcement announcement) {
            Observable<FeatureAnnouncementDialogResponse> mo4756nj;
            WireBird m59035e;
            Intrinsics.checkNotNullParameter(announcement, "announcement");
            String str = null;
            if (C41707gk1.this.f84109l == AnnouncementContext.RIDE_STARTED && (m59035e = C41707gk1.this.f84103f.mo15900i().m73665a().m59035e()) != null) {
                str = m59035e.getCode();
            }
            if (announcement.isGenericBanner() && C41707gk1.this.f84108k != null) {
                AbstractC23461c mo40692P1 = C41707gk1.this.f84108k.mo40692P1();
                final C41707gk1 c41707gk1 = C41707gk1.this;
                mo4756nj = mo40692P1.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: kk1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23447K m37800g;
                        m37800g = C41707gk1.C22429e.m37800g(C41707gk1.this, announcement);
                        return m37800g;
                    }
                })).m33123k0();
            } else {
                mo4756nj = C41707gk1.this.f84105h.mo4756nj(C41707gk1.this.f84109l, announcement, str);
            }
            AbstractC23461c mo6513q = C41707gk1.this.f84098a.mo6513q(announcement.getId());
            final C22430a c22430a = C22430a.f84118g;
            Observable m33043l = mo6513q.m33084B(new InterfaceC23484g() { // from class: lk1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41707gk1.C22429e.m37798i(Function1.this, obj);
                }
            }).m33069Q().m33043l(Observable.just(Unit.INSTANCE));
            Observable<FeatureAnnouncementDialogResponse> subscribeOn = mo4756nj.subscribeOn(C23454a.m33087a());
            final C22431b c22431b = new C22431b(C41707gk1.this, announcement);
            Observable<FeatureAnnouncementDialogResponse> doOnSubscribe = subscribeOn.doOnSubscribe(new InterfaceC23484g() { // from class: mk1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41707gk1.C22429e.m37797j(Function1.this, obj);
                }
            });
            final C22432c c22432c = C22432c.f84121g;
            return Observable.combineLatest(m33043l, doOnSubscribe, new InterfaceC23480c() { // from class: nk1
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    FeatureAnnouncementDialogResponse m37796k;
                    m37796k = C41707gk1.C22429e.m37796k(Function2.this, obj, obj2);
                    return m37796k;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$f */
    /* loaded from: classes3.dex */
    public static final class C22434f extends Lambda implements Function1<FeatureAnnouncementDialogResponse, Unit> {
        public C22434f() {
            super(1);
        }

        /* renamed from: a */
        public final void m37792a(FeatureAnnouncementDialogResponse featureAnnouncementDialogResponse) {
            if (featureAnnouncementDialogResponse instanceof FeatureAnnouncementDialogResponse.Dismiss) {
                C41707gk1.this.f84100c.mo55905y(new C22706hg(null, null, null, featureAnnouncementDialogResponse.getAnnouncement().getId(), featureAnnouncementDialogResponse.getAnnouncement().getAnalyticsTitle(), null, featureAnnouncementDialogResponse.getAnnouncement().getContext().name(), featureAnnouncementDialogResponse.getAnnouncement().getDisplayType().name(), featureAnnouncementDialogResponse.getAnnouncement().getContentType().name(), C41707gk1.this.f84101d.m37747C(featureAnnouncementDialogResponse.getAnnouncement().getId()), 39, null));
            } else {
                C41707gk1.this.f84100c.mo55905y(new C10321Zf(null, null, null, featureAnnouncementDialogResponse.getAnnouncement().getId(), featureAnnouncementDialogResponse.getAnnouncement().getAnalyticsTitle(), null, featureAnnouncementDialogResponse.getAnnouncement().getContext().name(), featureAnnouncementDialogResponse.getAnnouncement().getDisplayType().name(), featureAnnouncementDialogResponse.getAnnouncement().getContentType().name(), C41707gk1.this.f84101d.m37747C(featureAnnouncementDialogResponse.getAnnouncement().getId()), 39, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FeatureAnnouncementDialogResponse featureAnnouncementDialogResponse) {
            m37792a(featureAnnouncementDialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFeatureAnnouncementModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureAnnouncementModalPresenter.kt\nco/bird/android/lib/announcement/FeatureAnnouncementModalPresenter$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
    /* renamed from: gk1$g */
    /* loaded from: classes3.dex */
    public static final class C22435g extends Lambda implements Function1<FeatureAnnouncementDialogResponse, Unit> {
        public C22435g() {
            super(1);
        }

        /* renamed from: a */
        public final void m37791a(FeatureAnnouncementDialogResponse featureAnnouncementDialogResponse) {
            String learnMoreUrl;
            if (featureAnnouncementDialogResponse instanceof FeatureAnnouncementDialogResponse.Primary) {
                String buttonUrl = featureAnnouncementDialogResponse.getAnnouncement().getButtonUrl();
                if (buttonUrl != null) {
                    C41707gk1.this.f84107j.mo36983m2(buttonUrl);
                }
                C41707gk1.this.f84105h.mo4757l9();
            } else if (featureAnnouncementDialogResponse instanceof FeatureAnnouncementDialogResponse.Dismiss) {
                C41707gk1.this.f84105h.mo4757l9();
            } else if (featureAnnouncementDialogResponse instanceof FeatureAnnouncementDialogResponse.Share) {
                String shareContent = featureAnnouncementDialogResponse.getAnnouncement().getShareContent();
                if (shareContent != null) {
                    C41707gk1.this.f84107j.mo37104Q3(shareContent);
                }
            } else if (featureAnnouncementDialogResponse instanceof FeatureAnnouncementDialogResponse.Copy) {
                C41707gk1.this.f84104g.mo79490a(((FeatureAnnouncementDialogResponse.Copy) featureAnnouncementDialogResponse).getLabel(), featureAnnouncementDialogResponse.getAnnouncement().getShareContent());
            } else if ((featureAnnouncementDialogResponse instanceof FeatureAnnouncementDialogResponse.LearnMore) && (learnMoreUrl = featureAnnouncementDialogResponse.getAnnouncement().getLearnMoreUrl()) != null) {
                InterfaceC40099e13.C19924a.goToWebView$default(C41707gk1.this.f84107j, learnMoreUrl, null, null, false, 14, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FeatureAnnouncementDialogResponse featureAnnouncementDialogResponse) {
            m37791a(featureAnnouncementDialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001f"}, m28432d2 = {"Lgk1$h;", "", "", "rating", "", "duration", "", "role", "", "operatorRoles", C17296a.f69688o, "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lgk1$h;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Float;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Float;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gk1$h */
    /* loaded from: classes3.dex */
    public static final class C22436h {

        /* renamed from: a */
        public final Float f84125a;

        /* renamed from: b */
        public final Integer f84126b;

        /* renamed from: c */
        public final String f84127c;

        /* renamed from: d */
        public final List<String> f84128d;

        public C22436h() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C22436h copy$default(C22436h c22436h, Float f, Integer num, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c22436h.f84125a;
            }
            if ((i & 2) != 0) {
                num = c22436h.f84126b;
            }
            if ((i & 4) != 0) {
                str = c22436h.f84127c;
            }
            if ((i & 8) != 0) {
                list = c22436h.f84128d;
            }
            return c22436h.m37790a(f, num, str, list);
        }

        /* renamed from: a */
        public final C22436h m37790a(Float f, Integer num, String str, List<String> list) {
            return new C22436h(f, num, str, list);
        }

        /* renamed from: b */
        public final Integer m37789b() {
            return this.f84126b;
        }

        /* renamed from: c */
        public final List<String> m37788c() {
            return this.f84128d;
        }

        /* renamed from: d */
        public final Float m37787d() {
            return this.f84125a;
        }

        /* renamed from: e */
        public final String m37786e() {
            return this.f84127c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C22436h) {
                C22436h c22436h = (C22436h) obj;
                return Intrinsics.areEqual((Object) this.f84125a, (Object) c22436h.f84125a) && Intrinsics.areEqual(this.f84126b, c22436h.f84126b) && Intrinsics.areEqual(this.f84127c, c22436h.f84127c) && Intrinsics.areEqual(this.f84128d, c22436h.f84128d);
            }
            return false;
        }

        public int hashCode() {
            Float f = this.f84125a;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Integer num = this.f84126b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f84127c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.f84128d;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            Float f = this.f84125a;
            Integer num = this.f84126b;
            String str = this.f84127c;
            List<String> list = this.f84128d;
            return "Parameters(rating=" + f + ", duration=" + num + ", role=" + str + ", operatorRoles=" + list + ")";
        }

        public C22436h(Float f, Integer num, String str, List<String> list) {
            this.f84125a = f;
            this.f84126b = num;
            this.f84127c = str;
            this.f84128d = list;
        }

        public /* synthetic */ C22436h(Float f, Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", "upstream", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$i */
    /* loaded from: classes3.dex */
    public static final class C22437i extends Lambda implements Function1<Observable<Announcement>, InterfaceC23434B<Announcement>> {

        /* renamed from: g */
        public final /* synthetic */ AnnouncementContext f84129g;

        /* renamed from: h */
        public final /* synthetic */ C41707gk1 f84130h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Announcement;", "announcement", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gk1$i$a */
        /* loaded from: classes3.dex */
        public static final class C22438a extends Lambda implements Function1<Announcement, InterfaceC23434B<? extends Announcement>> {

            /* renamed from: g */
            public final /* synthetic */ C41707gk1 f84131g;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/RideStates;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: gk1$i$a$a */
            /* loaded from: classes3.dex */
            public static final class C22439a extends Lambda implements Function1<List<? extends RideStates>, InterfaceC24574u<? extends Announcement>> {

                /* renamed from: g */
                public final /* synthetic */ Announcement f84132g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C22439a(Announcement announcement) {
                    super(1);
                    this.f84132g = announcement;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC24574u<? extends Announcement> invoke(List<RideStates> list) {
                    Intrinsics.checkNotNullParameter(list, "<name for destructuring parameter 0>");
                    if (list.get(0).getActiveRideCount() < list.get(1).getActiveRideCount()) {
                        return AbstractC24507p.m32068G(this.f84132g);
                    }
                    return AbstractC24507p.m32024u();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22438a(C41707gk1 c41707gk1) {
                super(1);
                this.f84131g = c41707gk1;
            }

            /* renamed from: c */
            public static final InterfaceC24574u m37779c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC24574u) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23434B<? extends Announcement> invoke(Announcement announcement) {
                Intrinsics.checkNotNullParameter(announcement, "announcement");
                Observable m74549j0 = C37279Yf5.m74549j0(this.f84131g.f84102e.mo75032o0(), 2, false);
                final C22439a c22439a = new C22439a(announcement);
                return m74549j0.flatMapMaybe(new InterfaceC23492o() { // from class: rk1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m37779c;
                        m37779c = C41707gk1.C22437i.C22438a.m37779c(Function1.this, obj);
                        return m37779c;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Announcement;", "announcement", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gk1$i$b */
        /* loaded from: classes3.dex */
        public static final class C22440b extends Lambda implements Function1<Announcement, InterfaceC23434B<? extends Announcement>> {

            /* renamed from: g */
            public final /* synthetic */ C41707gk1 f84133g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideUpdateState;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideUpdateState;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: gk1$i$b$a */
            /* loaded from: classes3.dex */
            public static final class C22441a extends Lambda implements Function1<RideUpdateState, Boolean> {

                /* renamed from: g */
                public static final C22441a f84134g = new C22441a();

                public C22441a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Boolean invoke(RideUpdateState it) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it == RideUpdateState.STARTING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideUpdateState;", "it", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/persistence/Announcement;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: gk1$i$b$b */
            /* loaded from: classes3.dex */
            public static final class C22442b extends Lambda implements Function1<RideUpdateState, Announcement> {

                /* renamed from: g */
                public final /* synthetic */ Announcement f84135g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C22442b(Announcement announcement) {
                    super(1);
                    this.f84135g = announcement;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Announcement invoke(RideUpdateState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f84135g;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22440b(C41707gk1 c41707gk1) {
                super(1);
                this.f84133g = c41707gk1;
            }

            /* renamed from: d */
            public static final Announcement m37774d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Announcement) tmp0.invoke(obj);
            }

            public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23434B<? extends Announcement> invoke(Announcement announcement) {
                Intrinsics.checkNotNullParameter(announcement, "announcement");
                Observable<RideUpdateState> distinctUntilChanged = this.f84133g.f84103f.mo15903f().distinctUntilChanged();
                final C22441a c22441a = C22441a.f84134g;
                Observable<RideUpdateState> filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: sk1
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = C41707gk1.C22437i.C22440b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                final C22442b c22442b = new C22442b(announcement);
                return filter.map(new InterfaceC23492o() { // from class: tk1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Announcement m37774d;
                        m37774d = C41707gk1.C22437i.C22440b.m37774d(Function1.this, obj);
                        return m37774d;
                    }
                });
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: gk1$i$c */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C22443c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnouncementContext.values().length];
                try {
                    iArr[AnnouncementContext.POST_RIDE_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnouncementContext.RIDE_STARTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22437i(AnnouncementContext announcementContext, C41707gk1 c41707gk1) {
            super(1);
            this.f84129g = announcementContext;
            this.f84130h = c41707gk1;
        }

        /* renamed from: c */
        public static final InterfaceC23434B m37783c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final InterfaceC23434B m37782d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<Announcement> invoke(Observable<Announcement> upstream) {
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            int i = C22443c.$EnumSwitchMapping$0[this.f84129g.ordinal()];
            if (i == 1) {
                Observable<Announcement> distinctUntilChanged = upstream.distinctUntilChanged();
                final C22438a c22438a = new C22438a(this.f84130h);
                return distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: pk1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m37783c;
                        m37783c = C41707gk1.C22437i.m37783c(Function1.this, obj);
                        return m37783c;
                    }
                });
            } else if (i != 2) {
                return upstream;
            } else {
                Observable<Announcement> distinctUntilChanged2 = upstream.distinctUntilChanged();
                final C22440b c22440b = new C22440b(this.f84130h);
                return distinctUntilChanged2.switchMap(new InterfaceC23492o() { // from class: qk1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m37782d;
                        m37782d = C41707gk1.C22437i.m37782d(Function1.this, obj);
                        return m37782d;
                    }
                });
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", "upstream", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gk1$j */
    /* loaded from: classes3.dex */
    public static final class C22444j extends Lambda implements Function1<Observable<Announcement>, InterfaceC23434B<Announcement>> {

        /* renamed from: g */
        public final /* synthetic */ AnnouncementContext f84136g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: gk1$j$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C22445a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnouncementContext.values().length];
                try {
                    iArr[AnnouncementContext.RIDE_STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnouncementContext.SIDE_MENU.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22444j(AnnouncementContext announcementContext) {
            super(1);
            this.f84136g = announcementContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<Announcement> invoke(Observable<Announcement> upstream) {
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            int i = C22445a.$EnumSwitchMapping$0[this.f84136g.ordinal()];
            return (i == 1 || i == 2) ? upstream : upstream.firstOrError().m33123k0();
        }
    }

    public C41707gk1(InterfaceC27649qg announcementsManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, C22454gl appPreference, YR4 rideManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC36149Tk0 clipboardManager, InterfaceC51786xk1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC37617Zr1 interfaceC37617Zr1, AnnouncementContext context, C22436h parameters) {
        Intrinsics.checkNotNullParameter(announcementsManager, "announcementsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f84098a = announcementsManager;
        this.f84099b = reactiveConfig;
        this.f84100c = analyticsManager;
        this.f84101d = appPreference;
        this.f84102e = rideManager;
        this.f84103f = rideMapStateManager;
        this.f84104g = clipboardManager;
        this.f84105h = ui;
        this.f84106i = scopeProvider;
        this.f84107j = navigator;
        this.f84108k = interfaceC37617Zr1;
        this.f84109l = context;
        this.f84110m = parameters;
        Observable<Boolean> m82733V3 = reactiveConfig.m82733V3();
        final C22423a c22423a = C22423a.f84111g;
        Observable<Boolean> take = m82733V3.filter(new InterfaceC23494q() { // from class: Xj1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m37826j;
                m37826j = C41707gk1.m37826j(Function1.this, obj);
                return m37826j;
            }
        }).take(1L);
        final C22424b c22424b = new C22424b();
        Observable<R> flatMap = take.flatMap(new InterfaceC23492o() { // from class: Yj1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m37825k;
                m37825k = C41707gk1.m37825k(Function1.this, obj);
                return m37825k;
            }
        });
        final C22426c c22426c = new C22426c();
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: Zj1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m37824l;
                m37824l = C41707gk1.m37824l(Function1.this, obj);
                return m37824l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.enableFea…nnouncement(parameters) }");
        Observable<Announcement> observeOn = m37816t(m37819q(C37279Yf5.m74576S(map), context), context).observeOn(C23454a.m33087a());
        final C22427d c22427d = new C22427d();
        Observable<R> flatMap2 = observeOn.flatMap(new InterfaceC23492o() { // from class: ak1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m37823m;
                m37823m = C41707gk1.m37823m(Function1.this, obj);
                return m37823m;
            }
        });
        final C22429e c22429e = new C22429e();
        Observable flatMap3 = flatMap2.flatMap(new InterfaceC23492o() { // from class: bk1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m37822n;
                m37822n = C41707gk1.m37822n(Function1.this, obj);
                return m37822n;
            }
        });
        final C22434f c22434f = new C22434f();
        Observable observeOn2 = flatMap3.doAfterNext(new InterfaceC23484g() { // from class: ck1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41707gk1.m37821o(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "reactiveConfig.enableFea…dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22435g c22435g = new C22435g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: dk1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41707gk1.m37820p(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final boolean m37826j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: k */
    public static final InterfaceC23434B m37825k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final Optional m37824l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final InterfaceC23434B m37823m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23434B m37822n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m37821o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m37820p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23434B m37818r(Function1 tmp0, Observable p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (InterfaceC23434B) tmp0.invoke(p0);
    }

    /* renamed from: u */
    public static final InterfaceC23434B m37815u(Function1 tmp0, Observable p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (InterfaceC23434B) tmp0.invoke(p0);
    }

    /* renamed from: q */
    public final Observable<Announcement> m37819q(Observable<Announcement> observable, AnnouncementContext announcementContext) {
        final C22437i c22437i = new C22437i(announcementContext, this);
        Observable compose = observable.compose(new InterfaceC23435C() { // from class: ek1
            @Override // io.reactivex.InterfaceC23435C
            public final InterfaceC23434B apply(Observable observable2) {
                InterfaceC23434B m37818r;
                m37818r = C41707gk1.m37818r(Function1.this, observable2);
                return m37818r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(compose, "private fun Observable<A…pstream\n      }\n    }\n  }");
        return compose;
    }

    /* renamed from: s */
    public final Optional<Announcement> m37817s(List<Announcement> list, C22436h c22436h) {
        Object obj;
        Optional.C14443a c14443a = Optional.f63040c;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Announcement) obj).isQualified(c22436h.m37787d(), c22436h.m37789b(), c22436h.m37786e(), c22436h.m37788c())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return c14443a.m59033b(obj);
    }

    /* renamed from: t */
    public final Observable<Announcement> m37816t(Observable<Announcement> observable, AnnouncementContext announcementContext) {
        final C22444j c22444j = new C22444j(announcementContext);
        Observable compose = observable.compose(new InterfaceC23435C() { // from class: fk1
            @Override // io.reactivex.InterfaceC23435C
            public final InterfaceC23434B apply(Observable observable2) {
                InterfaceC23434B m37815u;
                m37815u = C41707gk1.m37815u(Function1.this, observable2);
                return m37815u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(compose, "context: AnnouncementCon…)\n        }\n      }\n    }");
        return compose;
    }
}
