package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.User;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.persistence.Announcement;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C29933wg;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m28432d2 = {"Lwg;", "Lqg;", "Lio/reactivex/c;", "p", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Announcement;", "b0", "F", "", "announcementId", "q", "Ljg;", C17296a.f69688o, "Ljg;", "announcementRepo", "Lg46$b;", "k", "()Lg46$b;", "logger", "LRh6;", "userStream", "LOi;", "appContextStream", "<init>", "(LRh6;LOi;Ljg;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnouncementsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementsManagerImpl.kt\nco/bird/android/manager/ride/AnnouncementsManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,84:1\n237#2:85\n237#2:86\n237#2:87\n*S KotlinDebug\n*F\n+ 1 AnnouncementsManagerImpl.kt\nco/bird/android/manager/ride/AnnouncementsManagerImpl\n*L\n34#1:85\n47#1:86\n59#1:87\n*E\n"})
/* renamed from: wg */
/* loaded from: classes4.dex */
public final class C29933wg implements InterfaceC27649qg {

    /* renamed from: a */
    public final InterfaceC24980jg f116330a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wg$a */
    /* loaded from: classes4.dex */
    public static final class C29934a extends Lambda implements Function1<User, InterfaceC23496h> {
        public C29934a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C29933wg.this.f116330a.mo25192e1().m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wg$b */
    /* loaded from: classes4.dex */
    public static final class C29935b extends Lambda implements Function1<User, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: wg$b$a */
        /* loaded from: classes4.dex */
        public static final class C29936a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C29936a f116333g = new C29936a();

            public C29936a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while refreshing announcements on login.", new Object[0]);
            }
        }

        public C29935b() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C29933wg.this.m6515k().mo7221o("Refreshing announcements on login.", new Object[0]);
            AbstractC23461c m33063X = C29933wg.this.f116330a.mo25191p().m33063X(C24542a.m31932c());
            final C29936a c29936a = C29936a.f116333g;
            return m33063X.m33084B(new InterfaceC23484g() { // from class: xg
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C29933wg.C29935b.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LNi;", "it", "", C17296a.f69688o, "(LNi;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wg$c */
    /* loaded from: classes4.dex */
    public static final class C29937c extends Lambda implements Function1<AbstractC5657Ni, Boolean> {

        /* renamed from: g */
        public static final C29937c f116334g = new C29937c();

        public C29937c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC5657Ni it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!(it instanceof C44302l65) && !(it instanceof C39428ct3)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LNi;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(LNi;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wg$d */
    /* loaded from: classes4.dex */
    public static final class C29938d extends Lambda implements Function1<AbstractC5657Ni, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: wg$d$a */
        /* loaded from: classes4.dex */
        public static final class C29939a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C29939a f116336g = new C29939a();

            public C29939a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while refreshing announcements on ride started.", new Object[0]);
            }
        }

        public C29938d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(AbstractC5657Ni it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C29933wg.this.m6515k().mo7221o("Refreshing announcements on ride started.", new Object[0]);
            AbstractC23461c m33063X = C29933wg.this.f116330a.mo25191p().m33063X(C24542a.m31932c());
            final C29939a c29939a = C29939a.f116336g;
            return m33063X.m33084B(new InterfaceC23484g() { // from class: yg
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C29933wg.C29938d.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    public C29933wg(InterfaceC35660Rh6 userStream, InterfaceC6098Oi appContextStream, InterfaceC24980jg announcementRepo) {
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appContextStream, "appContextStream");
        Intrinsics.checkNotNullParameter(announcementRepo, "announcementRepo");
        this.f116330a = announcementRepo;
        Observable<User> mo76576i = userStream.mo76576i();
        final C29934a c29934a = new C29934a();
        AbstractC23461c flatMapCompletable = mo76576i.flatMapCompletable(new InterfaceC23492o() { // from class: rg
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6520f;
                m6520f = C29933wg.m6520f(Function1.this, obj);
                return m6520f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "userStream.logoutEvents(…(Schedulers.io())\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: sg
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C29933wg.m6519g(C29933wg.this);
            }
        });
        Observable<User> mo76582c = userStream.mo76582c();
        final C29935b c29935b = new C29935b();
        AbstractC23461c flatMapCompletable2 = mo76582c.flatMapCompletable(new InterfaceC23492o() { // from class: tg
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6518h;
                m6518h = C29933wg.m6518h(Function1.this, obj);
                return m6518h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "userStream.loginEvents()…onErrorComplete()\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n2 = flatMapCompletable2.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<AbstractC5657Ni> mo88171b = appContextStream.mo88171b();
        final C29937c c29937c = C29937c.f116334g;
        Observable<AbstractC5657Ni> filter = mo88171b.filter(new InterfaceC23494q() { // from class: ug
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m6517i;
                m6517i = C29933wg.m6517i(Function1.this, obj);
                return m6517i;
            }
        });
        final C29938d c29938d = new C29938d();
        AbstractC23461c switchMapCompletable = filter.switchMapCompletable(new InterfaceC23492o() { // from class: vg
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6516j;
                m6516j = C29933wg.m6516j(Function1.this, obj);
                return m6516j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "appContextStream.events\n…onErrorComplete()\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n3 = switchMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
    }

    /* renamed from: f */
    public static final InterfaceC23496h m6520f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m6519g(C29933wg this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m6515k().mo7221o("Clearing announcements on logout.", new Object[0]);
    }

    /* renamed from: h */
    public static final InterfaceC23496h m6518h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final boolean m6517i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: j */
    public static final InterfaceC23496h m6516j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC27649qg
    /* renamed from: F */
    public Observable<List<Announcement>> mo6527F() {
        Observable<List<Announcement>> subscribeOn = this.f116330a.mo25199F().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "announcementRepo.streamG…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC27649qg
    /* renamed from: b0 */
    public Observable<List<Announcement>> mo6524b0(AnnouncementContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Observable<List<Announcement>> subscribeOn = this.f116330a.mo25193b0(context).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "announcementRepo.streamA…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    /* renamed from: k */
    public final C41318g46.AbstractC20723b m6515k() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("announcements-manager");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"announcements-manager\")");
        return m40153k;
    }

    @Override // p000.InterfaceC27649qg
    /* renamed from: p */
    public AbstractC23461c mo6514p() {
        AbstractC23461c m33063X = this.f116330a.mo25191p().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "announcementRepo.fetchAn…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC27649qg
    /* renamed from: q */
    public AbstractC23461c mo6513q(String announcementId) {
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        AbstractC23461c m33063X = this.f116330a.mo25190q(announcementId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "announcementRepo.markSee…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
