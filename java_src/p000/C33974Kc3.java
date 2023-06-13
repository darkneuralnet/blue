package p000;

import co.bird.android.model.constant.OperatorNotificationActionKind;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.nestedstructures.NotificationAction;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33974Kc3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LKc3;", "Lf1;", "LNc3;", "LOc3;", "renderer", "", "r", "Lio/reactivex/F;", "", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/Notification;", "w", "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", "Lio/reactivex/c;", "s", "", "e", "v", "LDa3;", "LDa3;", "notificationCenterManager", "LEa;", "f", "LEa;", "analyticsManager", "LNV0;", "g", "LNV0;", "deeplinkResolver", "<init>", "(LDa3;LEa;LNV0;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailsPresenter.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,104:1\n180#2:105\n237#2:106\n*S KotlinDebug\n*F\n+ 1 NotificationDetailsPresenter.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsPresenter\n*L\n33#1:105\n43#1:106\n*E\n"})
/* renamed from: Kc3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33974Kc3 extends AbstractC20169f1<InterfaceC34676Nc3, C34910Oc3> {

    /* renamed from: e */
    public final InterfaceC32318Da3 f19932e;

    /* renamed from: f */
    public final InterfaceC1880Ea f19933f;

    /* renamed from: g */
    public final NV0 f19934g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Notification;", "kotlin.jvm.PlatformType", TransferService.INTENT_KEY_NOTIFICATION, "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Notification;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kc3$a */
    /* loaded from: classes3.dex */
    public static final class C4498a extends Lambda implements Function1<Notification, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOc3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOc3;)LOc3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kc3$a$a */
        /* loaded from: classes3.dex */
        public static final class C4499a extends Lambda implements Function1<C34910Oc3, C34910Oc3> {

            /* renamed from: g */
            public final /* synthetic */ Notification f19936g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4499a(Notification notification) {
                super(1);
                this.f19936g = notification;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34910Oc3 invoke(C34910Oc3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.m91849a(this.f19936g);
            }
        }

        public C4498a() {
            super(1);
        }

        /* renamed from: a */
        public final void m98672a(Notification notification) {
            C33974Kc3.this.m42279i(new C4499a(notification));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Notification notification) {
            m98672a(notification);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kc3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4500b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C4500b(Object obj) {
            super(1, obj, C33974Kc3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33974Kc3) this.receiver).m98675v(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kc3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4501c extends FunctionReferenceImpl implements Function1<String, Observable<Notification>> {
        public C4501c(Object obj) {
            super(1, obj, InterfaceC32318Da3.class, "streamOperatorNotificationById", "streamOperatorNotificationById(Ljava/lang/String;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<Notification> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC32318Da3) this.receiver).mo108777l(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOc3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOc3;)LOc3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailsPresenter.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
    /* renamed from: Kc3$e */
    /* loaded from: classes3.dex */
    public static final class C4504e extends Lambda implements Function1<C34910Oc3, C34910Oc3> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f19938g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4504e(Throwable th) {
            super(1);
            this.f19938g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C34910Oc3 invoke(C34910Oc3 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            C34910Oc3 copy$default = C34910Oc3.copy$default(state, null, 1, null);
            copy$default.m91847c(this.f19938g);
            return copy$default;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "notificationId", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/Notification;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kc3$f */
    /* loaded from: classes3.dex */
    public static final class C4505f extends Lambda implements Function1<String, InterfaceC23434B<? extends Notification>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Notification;", "kotlin.jvm.PlatformType", TransferService.INTENT_KEY_NOTIFICATION, "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Notification;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kc3$f$a */
        /* loaded from: classes3.dex */
        public static final class C4506a extends Lambda implements Function1<Notification, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AtomicBoolean f19940g;

            /* renamed from: h */
            public final /* synthetic */ C33974Kc3 f19941h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4506a(AtomicBoolean atomicBoolean, C33974Kc3 c33974Kc3) {
                super(1);
                this.f19940g = atomicBoolean;
                this.f19941h = c33974Kc3;
            }

            /* renamed from: a */
            public final void m98664a(Notification notification) {
                if (!this.f19940g.getAndSet(true)) {
                    this.f19941h.f19933f.mo55905y(new C50642vo3(null, null, null, notification.getId(), notification.getCategory(), notification.getKind(), 7, null));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Notification notification) {
                m98664a(notification);
                return Unit.INSTANCE;
            }
        }

        public C4505f() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Notification> invoke(String notificationId) {
            Intrinsics.checkNotNullParameter(notificationId, "notificationId");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Observable<Notification> mo108777l = C33974Kc3.this.f19932e.mo108777l(notificationId);
            final C4506a c4506a = new C4506a(atomicBoolean, C33974Kc3.this);
            return mo108777l.doOnNext(new InterfaceC23484g() { // from class: Mc3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33974Kc3.C4505f.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33974Kc3(InterfaceC32318Da3 notificationCenterManager, InterfaceC1880Ea analyticsManager, NV0 deeplinkResolver) {
        super(new C34910Oc3(null, 1, null));
        Intrinsics.checkNotNullParameter(notificationCenterManager, "notificationCenterManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(deeplinkResolver, "deeplinkResolver");
        this.f19932e = notificationCenterManager;
        this.f19933f = analyticsManager;
        this.f19934g = deeplinkResolver;
    }

    /* renamed from: f */
    public static final void m98686f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m98685g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23434B m98677t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23496h m98676u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23434B m98673x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: r */
    public void consume(InterfaceC34676Nc3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = m98674w(renderer.mo57895N3()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4498a c4498a = new C4498a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Fc3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33974Kc3.m98686f(Function1.this, obj);
            }
        });
        AbstractC23461c m98678s = m98678s(renderer.mo57890c1(), renderer);
        final C4500b c4500b = new C4500b(this);
        AbstractC23461c m33066T = m98678s.m33084B(new InterfaceC23484g() { // from class: Gc3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33974Kc3.m98685g(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "renderer.actionClicks()\n…::onError)\n      .retry()");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: s */
    public final AbstractC23461c m98678s(Observable<NotificationAction> observable, InterfaceC34676Nc3 interfaceC34676Nc3) {
        AbstractC23442F<String> mo57895N3 = interfaceC34676Nc3.mo57895N3();
        final C4501c c4501c = new C4501c(this.f19932e);
        InterfaceC23434B m33162D = mo57895N3.m33162D(new InterfaceC23492o() { // from class: Hc3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m98677t;
                m98677t = C33974Kc3.m98677t(Function1.this, obj);
                return m98677t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "renderer.notificationId(…OperatorNotificationById)");
        Observable m31950a = C24527f.m31950a(observable, m33162D);
        final C4502d c4502d = new C4502d();
        AbstractC23461c flatMapCompletable = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: Ic3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m98676u;
                m98676u = C33974Kc3.m98676u(Function1.this, obj);
                return m98676u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun Observable<N…)\n          }\n      }\n  }");
        return flatMapCompletable;
    }

    /* renamed from: v */
    public final void m98675v(Throwable th) {
        m42279i(new C4504e(th));
    }

    /* renamed from: w */
    public final Observable<Notification> m98674w(AbstractC23442F<String> abstractC23442F) {
        final C4505f c4505f = new C4505f();
        Observable m33162D = abstractC23442F.m33162D(new InterfaceC23492o() { // from class: Jc3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m98673x;
                m98673x = C33974Kc3.m98673x(Function1.this, obj);
                return m98673x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "private fun Single<Strin…    }\n        }\n    }\n  }");
        return m33162D;
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", "Lco/bird/android/model/persistence/Notification;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kc3$d */
    /* loaded from: classes3.dex */
    public static final class C4502d extends Lambda implements Function1<Pair<? extends NotificationAction, ? extends Notification>, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Kc3$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C4503a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OperatorNotificationActionKind.values().length];
                try {
                    iArr[OperatorNotificationActionKind.DEEPLINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C4502d() {
            super(1);
        }

        /* renamed from: b */
        public static final void m98668b(C33974Kc3 this$0, Notification notification, NotificationAction action) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "$action");
            this$0.f19933f.mo55905y(new C47679qo3(null, null, null, notification.getId(), action.getActionKind().name(), notification.getCategory(), notification.getKind(), 7, null));
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<NotificationAction, Notification> pair) {
            AbstractC23461c m33039p;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final NotificationAction component1 = pair.component1();
            final Notification component2 = pair.component2();
            if (C4503a.$EnumSwitchMapping$0[component1.getActionKind().ordinal()] == 1) {
                String deeplinkPath = component1.getDeeplinkPath();
                if (deeplinkPath == null || (m33039p = C33974Kc3.this.f19934g.mo78299c(deeplinkPath, true, false)) == null) {
                    m33039p = AbstractC23461c.m33039p();
                }
            } else {
                m33039p = AbstractC23461c.m33039p();
            }
            final C33974Kc3 c33974Kc3 = C33974Kc3.this;
            return m33039p.m33029z(new InterfaceC23478a() { // from class: Lc3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C33974Kc3.C4502d.m98668b(C33974Kc3.this, component2, component1);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends NotificationAction, ? extends Notification> pair) {
            return invoke2((Pair<NotificationAction, Notification>) pair);
        }
    }
}
