package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.persistence.Announcement;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C6421Pf;
import p000.H31;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LPf;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "Lio/reactivex/Observable;", "closeImmediately", "Lqg;", C17296a.f69688o, "Lqg;", "announcementsManager", "LNV0;", "b", "LNV0;", "deeplinkResolver", "LYf;", "c", "LYf;", "bannerUi", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/app/Activity;", "e", "Landroid/app/Activity;", "activity", "Lco/bird/android/model/persistence/Announcement;", "f", "Lco/bird/android/model/persistence/Announcement;", "currentAnnouncement", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "closeRelay", "<init>", "(Lqg;LNV0;LYf;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnouncementBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/AnnouncementBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,108:1\n180#2:109\n237#2:110\n*S KotlinDebug\n*F\n+ 1 AnnouncementBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/AnnouncementBannerPresenterImpl\n*L\n51#1:109\n102#1:110\n*E\n"})
/* renamed from: Pf */
/* loaded from: classes2.dex */
public final class C6421Pf implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC27649qg f28818a;

    /* renamed from: b */
    public final NV0 f28819b;

    /* renamed from: c */
    public final C9883Yf f28820c;

    /* renamed from: d */
    public final ScopeProvider f28821d;

    /* renamed from: e */
    public final Activity f28822e;

    /* renamed from: f */
    public Announcement f28823f;

    /* renamed from: g */
    public final C45168ma4<Unit> f28824g;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/Announcement;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAnnouncementBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/AnnouncementBannerPresenterImpl$onBannerShown$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
    /* renamed from: Pf$a */
    /* loaded from: classes2.dex */
    public static final class C6422a extends Lambda implements Function1<List<? extends Announcement>, Unit> {
        public C6422a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Announcement> list) {
            invoke2((List<Announcement>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Announcement> it) {
            Object firstOrNull;
            C6421Pf c6421Pf = C6421Pf.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) it);
            c6421Pf.f28823f = (Announcement) firstOrNull;
            Announcement announcement = C6421Pf.this.f28823f;
            if (announcement != null) {
                C6421Pf.this.f28820c.m74609Ql(announcement);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pf$b */
    /* loaded from: classes2.dex */
    public static final class C6423b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6423b f28826g = new C6423b();

        public C6423b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while streaming generic banner announcements", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnouncementBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/AnnouncementBannerPresenterImpl$onBannerShown$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
    /* renamed from: Pf$c */
    /* loaded from: classes2.dex */
    public static final class C6424c extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LcW0;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(LcW0;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Pf$c$a */
        /* loaded from: classes2.dex */
        public static final class C6425a extends Lambda implements Function1<AbstractC39181cW0, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C6421Pf f28828g;

            /* renamed from: h */
            public final /* synthetic */ Intent f28829h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Pf$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C6426a extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C6421Pf f28830g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6426a(C6421Pf c6421Pf) {
                    super(1);
                    this.f28830g = c6421Pf;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable e) {
                    C41318g46.m40159e(e);
                    Intrinsics.checkNotNullExpressionValue(e, "e");
                    Throwable m87362c = R36.m87362c(e);
                    if (m87362c instanceof RetrofitException) {
                        H31.C3014a.showRetrofitExceptionDialog$default(this.f28830g.f28820c, e, null, null, 6, null);
                    } else if (m87362c instanceof LV0) {
                        H31.C3014a.showBirdDialog$default(this.f28830g.f28820c, C45128mW0.f98123d, false, false, null, null, null, null, 124, null);
                    } else {
                        this.f28830g.f28820c.errorGeneric();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6425a(C6421Pf c6421Pf, Intent intent) {
                super(1);
                this.f28828g = c6421Pf;
                this.f28829h = intent;
            }

            /* renamed from: d */
            public static final void m90019d(C6421Pf this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28824g.accept(Unit.INSTANCE);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23496h invoke(AbstractC39181cW0 result) {
                Intrinsics.checkNotNullParameter(result, "result");
                NV0 nv0 = this.f28828g.f28819b;
                AbstractC24507p<Pair<AbstractC39181cW0, Intent>> m32068G = AbstractC24507p.m32068G(TuplesKt.m28425to(result, this.f28829h));
                Intrinsics.checkNotNullExpressionValue(m32068G, "just(result to intent)");
                AbstractC23461c mo78298d = nv0.mo78298d(m32068G, true);
                final C6426a c6426a = new C6426a(this.f28828g);
                AbstractC23461c m33084B = mo78298d.m33084B(new InterfaceC23484g() { // from class: Tf
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C6421Pf.C6424c.C6425a.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C6421Pf c6421Pf = this.f28828g;
                return m33084B.m33029z(new InterfaceC23478a() { // from class: Uf
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C6421Pf.C6424c.C6425a.m90019d(C6421Pf.this);
                    }
                });
            }
        }

        public C6424c() {
            super(1);
        }

        /* renamed from: e */
        public static final void m90024e(C6421Pf this$0, Intent intent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f28822e.startActivity(intent);
        }

        /* renamed from: f */
        public static final Unit m90023f(C6421Pf this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C45168ma4 c45168ma4 = this$0.f28824g;
            Unit unit = Unit.INSTANCE;
            c45168ma4.accept(unit);
            return unit;
        }

        public static final InterfaceC23496h invoke$lambda$3(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(Unit it) {
            String buttonUrl;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            Announcement announcement = C6421Pf.this.f28823f;
            final Intent intent = null;
            if (announcement != null && (buttonUrl = announcement.getButtonUrl()) != null) {
                C6421Pf c6421Pf = C6421Pf.this;
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(buttonUrl));
                if (intent2.resolveActivity(c6421Pf.f28822e.getPackageManager()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    intent = intent2;
                }
            }
            if (intent != null) {
                AbstractC24507p<AbstractC39181cW0> m32066I = C6421Pf.this.f28819b.mo78301a(intent).m32066I(C23454a.m33087a());
                final C6421Pf c6421Pf2 = C6421Pf.this;
                AbstractC24507p<AbstractC39181cW0> m32031n = m32066I.m32031n(new InterfaceC23478a() { // from class: Qf
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C6421Pf.C6424c.m90024e(C6421Pf.this, intent);
                    }
                });
                final C6425a c6425a = new C6425a(C6421Pf.this, intent);
                return m32031n.m32074A(new InterfaceC23492o() { // from class: Rf
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h invoke$lambda$3;
                        invoke$lambda$3 = C6421Pf.C6424c.invoke$lambda$3(Function1.this, obj);
                        return invoke$lambda$3;
                    }
                });
            }
            final C6421Pf c6421Pf3 = C6421Pf.this;
            return AbstractC23461c.m33078H(new Callable() { // from class: Sf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m90023f;
                    m90023f = C6421Pf.C6424c.m90023f(C6421Pf.this);
                    return m90023f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pf$d */
    /* loaded from: classes2.dex */
    public static final class C6427d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6427d f28831g = new C6427d();

        public C6427d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error encountered while attempting to click on an announcement based banner: ", new Object[0]);
        }
    }

    public C6421Pf(InterfaceC27649qg announcementsManager, NV0 deeplinkResolver, C9883Yf bannerUi, ScopeProvider scopeProvider, Activity activity) {
        Intrinsics.checkNotNullParameter(announcementsManager, "announcementsManager");
        Intrinsics.checkNotNullParameter(deeplinkResolver, "deeplinkResolver");
        Intrinsics.checkNotNullParameter(bannerUi, "bannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f28818a = announcementsManager;
        this.f28819b = deeplinkResolver;
        this.f28820c = bannerUi;
        this.f28821d = scopeProvider;
        this.f28822e = activity;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f28824g = m25409g;
    }

    /* renamed from: e */
    public static final void m90032e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m90031f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final InterfaceC23496h m90030g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m90029h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        Observable<Unit> merge = Observable.merge(this.f28824g, this.f28820c.m74610Pl());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(closeRelay, bannerUi.closeClicks())");
        return merge;
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Observable<List<Announcement>> observeOn = this.f28818a.mo6527F().retry(3L).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "announcementsManager.str…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f28821d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6422a c6422a = new C6422a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Lf
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6421Pf.m90032e(Function1.this, obj);
            }
        };
        final C6423b c6423b = C6423b.f28826g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Mf
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6421Pf.m90031f(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f28820c.m74607W4().observeOn(C24542a.m31934a());
        final C6424c c6424c = new C6424c();
        AbstractC23461c flatMapCompletable = observeOn2.flatMapCompletable(new InterfaceC23492o() { // from class: Nf
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m90030g;
                m90030g = C6421Pf.m90030g(Function1.this, obj);
                return m90030g;
            }
        });
        final C6427d c6427d = C6427d.f28831g;
        AbstractC23461c m33069Q = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: Of
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6421Pf.m90029h(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun onBannerSho…r)\n      .subscribe()\n  }");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f28821d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
