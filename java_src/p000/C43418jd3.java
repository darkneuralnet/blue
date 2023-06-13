package p000;

import androidx.core.app.NotificationManagerCompat;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"Ljd3;", "Lgd3;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", C17296a.f69688o, "Lio/reactivex/Observable;", "", "b", "Landroidx/core/app/NotificationManagerCompat;", "Landroidx/core/app/NotificationManagerCompat;", "notificationManager", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "notificationState", "<init>", "(Landroidx/core/app/NotificationManagerCompat;)V", "c", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationStateManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationStateManagerImpl.kt\nco/bird/android/manager/contractor/NotificationStateManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,34:1\n180#2:35\n*S KotlinDebug\n*F\n+ 1 NotificationStateManagerImpl.kt\nco/bird/android/manager/contractor/NotificationStateManagerImpl\n*L\n26#1:35\n*E\n"})
/* renamed from: jd3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43418jd3 implements InterfaceC41639gd3 {

    /* renamed from: c */
    public static final C24960a f93036c = new C24960a(null);

    /* renamed from: a */
    public final NotificationManagerCompat f93037a;

    /* renamed from: b */
    public final C24552a<Boolean> f93038b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Ljd3$a;", "", "", "NOTIFICATIONS_ENABLED_OBSERVING_INTERVAL", "J", "<init>", "()V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jd3$a */
    /* loaded from: classes4.dex */
    public static final class C24960a {
        public /* synthetic */ C24960a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C24960a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jd3$b */
    /* loaded from: classes4.dex */
    public static final class C24961b extends Lambda implements Function1<Long, Boolean> {
        public C24961b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C43418jd3.this.f93037a.areNotificationsEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jd3$c */
    /* loaded from: classes4.dex */
    public static final class C24962c extends Lambda implements Function1<Boolean, Unit> {
        public C24962c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C43418jd3.this.f93038b.onNext(bool);
        }
    }

    public C43418jd3(NotificationManagerCompat notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        this.f93037a = notificationManager;
        C24552a<Boolean> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Boolean>()");
        this.f93038b = m31922e;
    }

    /* renamed from: e */
    public static final Boolean m30183e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m30182f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC41639gd3
    /* renamed from: a */
    public void mo30187a(ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Observable<Long> interval = Observable.interval(2L, TimeUnit.SECONDS);
        final C24961b c24961b = new C24961b();
        Observable<R> map = interval.map(new InterfaceC23492o() { // from class: hd3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m30183e;
                m30183e = C43418jd3.m30183e(Function1.this, obj);
                return m30183e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun initializeW…te.onNext(it)\n      }\n  }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24962c c24962c = new C24962c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: id3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43418jd3.m30182f(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC41639gd3
    /* renamed from: b */
    public Observable<Boolean> mo30186b() {
        Observable<Boolean> hide = this.f93038b.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "notificationState.hide()");
        return hide;
    }
}
