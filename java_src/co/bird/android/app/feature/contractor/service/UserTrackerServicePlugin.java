package co.bird.android.app.feature.contractor.service;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.analytics.RxBleState_Kt;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC39873de5;
import p000.InterfaceC40001dr4;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0003`a>BO\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b^\u0010_J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u001a\u0010\u0014\u001a\u00020\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\u0002048\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001a\u00107R\u001a\u0010:\u001a\u0002048\u0016X\u0096D¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b\u001e\u00107R\u001a\u0010@\u001a\u00020;8\u0014X\u0094D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u001c\u0010J\u001a\n G*\u0004\u0018\u00010F0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010M\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010;0;0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010LR\"\u0010O\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010;0;0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\"\u0010Q\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010)0)0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010LR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020R0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR!\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bH\u0010WR!\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\b&\u0010WR\u0014\u0010[\u001a\u00020;8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010?R\u0014\u0010]\u001a\u00020;8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010?¨\u0006b"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;", "Lqx1;", "", "operatorActive", "requirementsMissing", "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;", "z", "Lio/reactivex/Observable;", "u", "Lio/reactivex/c;", "A", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "isDebug", "", "n", "Landroid/content/Context;", "g", "Landroid/content/Context;", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lom3;", "h", "Lom3;", "operatorManager", "LRh6;", "i", "LRh6;", "userStream", "Ldr4;", "j", "Ldr4;", "locationManager", "LTq4;", "k", "LTq4;", "reactiveConfig", "Lde5;", "l", "Lde5;", "rxBleClient", "Landroid/content/Intent;", "m", "Landroid/content/Intent;", "mainActivityIntent", "Lgl;", "Lgl;", "preference", "LLifecycleOwner;", "o", "LLifecycleOwner;", "lifecycleOwner", "", "p", "I", "()I", "notificationId", "q", "notificationPriority", "", "r", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "channelId", "Landroidx/core/app/NotificationManagerCompat;", "s", "Lkotlin/Lazy;", "()Landroidx/core/app/NotificationManagerCompat;", "notificationManagerCompat", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "t", "Ljava/util/concurrent/ExecutorService;", "executor", "Lio/reactivex/subjects/a;", "Lio/reactivex/subjects/a;", "contentTitleSubject", "v", "contentTextSubject", "w", "intentSubject", "Landroidx/lifecycle/f$a;", "x", "Lio/reactivex/Observable;", "lifecycleObservable", "y", "()Lio/reactivex/Observable;", "shouldForegroundSetup", "shouldForeground", "f", "contentTitle", "e", "contentText", "<init>", "(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,208:1\n237#2:209\n180#2:210\n*S KotlinDebug\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin\n*L\n166#1:209\n189#1:210\n*E\n"})
/* loaded from: classes2.dex */
public final class UserTrackerServicePlugin extends AbstractC47767qx1 {

    /* renamed from: A */
    public static final C13714a f61390A = new C13714a(null);

    /* renamed from: B */
    public static final int f61391B = 8;

    /* renamed from: g */
    public final Context f61392g;

    /* renamed from: h */
    public final InterfaceC46473om3 f61393h;

    /* renamed from: i */
    public final InterfaceC35660Rh6 f61394i;

    /* renamed from: j */
    public final InterfaceC40001dr4 f61395j;

    /* renamed from: k */
    public final C36207Tq4 f61396k;

    /* renamed from: l */
    public final AbstractC39873de5 f61397l;

    /* renamed from: m */
    public final Intent f61398m;

    /* renamed from: n */
    public final C22454gl f61399n;

    /* renamed from: o */
    public final LifecycleOwner f61400o;

    /* renamed from: p */
    public final int f61401p;

    /* renamed from: q */
    public final int f61402q;

    /* renamed from: r */
    public final String f61403r;

    /* renamed from: s */
    public final Lazy f61404s;

    /* renamed from: t */
    public final ExecutorService f61405t;

    /* renamed from: u */
    public final C24552a<String> f61406u;

    /* renamed from: v */
    public final C24552a<String> f61407v;

    /* renamed from: w */
    public final C24552a<Intent> f61408w;

    /* renamed from: x */
    public final Observable<AbstractC11719f.EnumC11720a> f61409x;

    /* renamed from: y */
    public final Lazy f61410y;

    /* renamed from: z */
    public final Lazy f61411z;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$a;", "", "", "NOTIFICATIONS_ENABLED_OBSERVING_INTERVAL", "J", "", "SPECIAL_TASKS_CHANNEL_ID", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$a */
    /* loaded from: classes2.dex */
    public static final class C13714a {
        public /* synthetic */ C13714a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13714a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$b */
    /* loaded from: classes2.dex */
    public enum EnumC13715b {
        TRACKING_ENABLED,
        REQUIREMENTS_MISSING
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;", "", "", C17296a.f69688o, "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;", "b", "enabled", "notificationType", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "getEnabled", "()Z", "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;", "getNotificationType", "()Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;", "<init>", "(ZLco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$c */
    /* loaded from: classes2.dex */
    public static final class C13716c {

        /* renamed from: a */
        public final boolean f61415a;

        /* renamed from: b */
        public final EnumC13715b f61416b;

        public C13716c(boolean z, EnumC13715b notificationType) {
            Intrinsics.checkNotNullParameter(notificationType, "notificationType");
            this.f61415a = z;
            this.f61416b = notificationType;
        }

        public static /* synthetic */ C13716c copy$default(C13716c c13716c, boolean z, EnumC13715b enumC13715b, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c13716c.f61415a;
            }
            if ((i & 2) != 0) {
                enumC13715b = c13716c.f61416b;
            }
            return c13716c.m60689c(z, enumC13715b);
        }

        /* renamed from: a */
        public final boolean m60691a() {
            return this.f61415a;
        }

        /* renamed from: b */
        public final EnumC13715b m60690b() {
            return this.f61416b;
        }

        /* renamed from: c */
        public final C13716c m60689c(boolean z, EnumC13715b notificationType) {
            Intrinsics.checkNotNullParameter(notificationType, "notificationType");
            return new C13716c(z, notificationType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13716c) {
                C13716c c13716c = (C13716c) obj;
                return this.f61415a == c13716c.f61415a && this.f61416b == c13716c.f61416b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.f61415a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.f61416b.hashCode();
        }

        public String toString() {
            boolean z = this.f61415a;
            EnumC13715b enumC13715b = this.f61416b;
            return "UserTrackerServiceData(enabled=" + z + ", notificationType=" + enumC13715b + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/core/app/NotificationManagerCompat;", "b", "()Landroidx/core/app/NotificationManagerCompat;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$d */
    /* loaded from: classes2.dex */
    public static final class C13717d extends Lambda implements Function0<NotificationManagerCompat> {
        public C13717d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final NotificationManagerCompat invoke() {
            return NotificationManagerCompat.from(UserTrackerServicePlugin.this.mo16756g());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$e */
    /* loaded from: classes2.dex */
    public static final class C13718e extends Lambda implements Function1<Long, Boolean> {
        public C13718e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(UserTrackerServicePlugin.this.m60703s().areNotificationsEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$f */
    /* loaded from: classes2.dex */
    public static final class C13719f extends Lambda implements Function1<C13716c, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$f$a */
        /* loaded from: classes2.dex */
        public static final class C13720a extends Lambda implements Function1<Long, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ UserTrackerServicePlugin f61420g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13720a(UserTrackerServicePlugin userTrackerServicePlugin) {
                super(1);
                this.f61420g = userTrackerServicePlugin;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23496h invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f61420g.m60708A();
            }
        }

        public C13719f() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m60685c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(C13716c c13716c) {
            Intrinsics.checkNotNullParameter(c13716c, "<name for destructuring parameter 0>");
            boolean m60691a = c13716c.m60691a();
            EnumC13715b m60690b = c13716c.m60690b();
            if (m60691a && m60690b == EnumC13715b.TRACKING_ENABLED) {
                AbstractC24490k<Long> m32108t0 = Observable.interval(0L, UserTrackerServicePlugin.this.f61396k.m82623f8().getValue().getUserTracking().getTrackIntervalSeconds(), TimeUnit.SECONDS).toFlowable(EnumC23460b.LATEST).m32108t0(C24542a.m31932c(), false, 1);
                final C13720a c13720a = new C13720a(UserTrackerServicePlugin.this);
                return m32108t0.m32162Z(new InterfaceC23492o() { // from class: ei6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m60685c;
                        m60685c = UserTrackerServicePlugin.C13719f.m60685c(Function1.this, obj);
                        return m60685c;
                    }
                });
            }
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$g */
    /* loaded from: classes2.dex */
    public static final class C13721g extends Lambda implements Function1<C13716c, Triple<? extends String, ? extends String, ? extends Intent>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$g$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C13722a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC13715b.values().length];
                try {
                    iArr[EnumC13715b.TRACKING_ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13715b.REQUIREMENTS_MISSING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C13721g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<String, String, Intent> invoke(C13716c c13716c) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(c13716c, "<name for destructuring parameter 0>");
            int i3 = C13722a.$EnumSwitchMapping$0[c13716c.m60690b().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i = C45871nl4.notification_operator_on_duty_service_missing_requirements;
                    i2 = C45871nl4.notification_operator_on_duty_service_missing_requirements_content;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = C45871nl4.notification_operator_on_duty_service_running_in_background;
                i2 = C45871nl4.notification_operator_on_duty_service_running_in_background_content;
            }
            Intent intent = UserTrackerServicePlugin.this.f61398m;
            intent.putExtra("co.bird.android.force_map_mode", MapMode.OPERATOR.ordinal());
            return new Triple<>(UserTrackerServicePlugin.this.mo16756g().getString(i), UserTrackerServicePlugin.this.mo16756g().getString(i2), intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u000522\u0010\u0004\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$h */
    /* loaded from: classes2.dex */
    public static final class C13723h extends Lambda implements Function1<Triple<? extends String, ? extends String, ? extends Intent>, Unit> {
        public C13723h() {
            super(1);
        }

        /* renamed from: a */
        public final void m60683a(Triple<String, String, ? extends Intent> triple) {
            UserTrackerServicePlugin.this.f61406u.onNext(triple.component1());
            UserTrackerServicePlugin.this.f61407v.onNext(triple.component2());
            UserTrackerServicePlugin.this.f61408w.onNext(triple.component3());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends String, ? extends String, ? extends Intent> triple) {
            m60683a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$i */
    /* loaded from: classes2.dex */
    public static final class C13724i extends Lambda implements Function0<Observable<Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$i$a */
        /* loaded from: classes2.dex */
        public static final class C13725a extends Lambda implements Function1<C13716c, Boolean> {

            /* renamed from: g */
            public static final C13725a f61424g = new C13725a();

            public C13725a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(C13716c c13716c) {
                Intrinsics.checkNotNullParameter(c13716c, "<name for destructuring parameter 0>");
                return Boolean.valueOf(c13716c.m60691a());
            }
        }

        public C13724i() {
            super(0);
        }

        /* renamed from: c */
        public static final Boolean m60680c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            Observable m60702t = UserTrackerServicePlugin.this.m60702t();
            final C13725a c13725a = C13725a.f61424g;
            return m60702t.map(new InterfaceC23492o() { // from class: fi6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m60680c;
                    m60680c = UserTrackerServicePlugin.C13724i.m60680c(Function1.this, obj);
                    return m60680c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;", "kotlin.jvm.PlatformType", "c", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,208:1\n61#2,2:209\n41#2,2:211\n22#2,2:213\n*S KotlinDebug\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n*L\n101#1:209,2\n114#1:211,2\n99#1:213,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$j */
    /* loaded from: classes2.dex */
    public static final class C13726j extends Lambda implements Function0<Observable<C13716c>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$j$a */
        /* loaded from: classes2.dex */
        public static final class C13727a extends Lambda implements Function1<Optional<User>, Boolean> {

            /* renamed from: g */
            public static final C13727a f61426g = new C13727a();

            public C13727a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<User> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                User m59035e = it.m59035e();
                boolean z = false;
                if (m59035e != null && UserKt.isOperator(m59035e)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$j$b */
        /* loaded from: classes2.dex */
        public static final class C13728b extends Lambda implements Function1<Location, Boolean> {

            /* renamed from: g */
            public static final C13728b f61427g = new C13728b();

            public C13728b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Location it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isFromMockProvider());
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n*L\n1#1,304:1\n107#2,4:305\n*E\n"})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$j$c */
        /* loaded from: classes2.dex */
        public static final class C13729c<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {

            /* renamed from: a */
            public final /* synthetic */ UserTrackerServicePlugin f61428a;

            public C13729c(UserTrackerServicePlugin userTrackerServicePlugin) {
                this.f61428a = userTrackerServicePlugin;
            }

            @Override // io.reactivex.functions.InterfaceC23486i
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                boolean z;
                AbstractC11719f.EnumC11720a enumC11720a = (AbstractC11719f.EnumC11720a) t4;
                String str = (String) t3;
                Boolean bool = (Boolean) t2;
                if (((Boolean) t1).booleanValue() && bool.booleanValue() && this.f61428a.f61399n.m37571t0() == MapMode.OPERATOR && enumC11720a == AbstractC11719f.EnumC11720a.ON_START) {
                    z = true;
                } else {
                    z = false;
                }
                return (R) Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$3\n+ 2 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n*L\n1#1,304:1\n121#2:305\n*E\n"})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$j$d */
        /* loaded from: classes2.dex */
        public static final class C13730d<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, R> {
            @Override // io.reactivex.functions.InterfaceC23485h
            public final R apply(T1 t1, T2 t2, T3 t3) {
                boolean booleanValue = ((Boolean) t3).booleanValue();
                AbstractC39873de5.EnumC19828a enumC19828a = (AbstractC39873de5.EnumC19828a) t2;
                boolean z = true;
                if (!((Boolean) t1).booleanValue() && RxBleState_Kt.bluetoothEnabled$default(enumC19828a, false, 1, null) && booleanValue) {
                    z = false;
                }
                return (R) Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n*L\n1#1,304:1\n125#2:305\n*E\n"})
        /* renamed from: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$j$e */
        /* loaded from: classes2.dex */
        public static final class C13731e<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {

            /* renamed from: a */
            public final /* synthetic */ UserTrackerServicePlugin f61429a;

            public C13731e(UserTrackerServicePlugin userTrackerServicePlugin) {
                this.f61429a = userTrackerServicePlugin;
            }

            @Override // io.reactivex.functions.InterfaceC23480c
            public final R apply(T1 t1, T2 t2) {
                return (R) this.f61429a.m60696z(((Boolean) t1).booleanValue(), ((Boolean) t2).booleanValue());
            }
        }

        public C13726j() {
            super(0);
        }

        /* renamed from: d */
        public static final Boolean m60675d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Boolean m60674e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c */
        public final Observable<C13716c> invoke() {
            C24523e c24523e = C24523e.f91168a;
            Observable<Boolean> m82933B3 = UserTrackerServicePlugin.this.f61396k.m82933B3();
            Z84<Optional<User>> mo76577h = UserTrackerServicePlugin.this.f61394i.mo76577h();
            final C13727a c13727a = C13727a.f61426g;
            InterfaceC23434B map = mo76577h.map(new InterfaceC23492o() { // from class: gi6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m60675d;
                    m60675d = UserTrackerServicePlugin.C13726j.m60675d(Function1.this, obj);
                    return m60675d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "userStream.currentUserSt…)?.isOperator() == true }");
            Observable combineLatest = Observable.combineLatest(m82933B3, map, UserTrackerServicePlugin.this.f61399n.m37746C0(), UserTrackerServicePlugin.this.f61409x, new C13729c(UserTrackerServicePlugin.this));
            Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
            Observable subscribeOn = InterfaceC40001dr4.C19874a.frequentLocationUpdates$default(UserTrackerServicePlugin.this.f61395j, false, 1, null).subscribeOn(C24542a.m31932c());
            final C13728b c13728b = C13728b.f61427g;
            Observable distinctUntilChanged = subscribeOn.map(new InterfaceC23492o() { // from class: hi6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m60674e;
                    m60674e = UserTrackerServicePlugin.C13726j.m60674e(Function1.this, obj);
                    return m60674e;
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "locationManager\n        … }.distinctUntilChanged()");
            Observable<AbstractC39873de5.EnumC19828a> distinctUntilChanged2 = UserTrackerServicePlugin.this.f61397l.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) UserTrackerServicePlugin.this.f61397l.mo33641c()).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "rxBleClient.observeState…e).distinctUntilChanged()");
            Observable combineLatest2 = Observable.combineLatest(distinctUntilChanged, distinctUntilChanged2, UserTrackerServicePlugin.this.m60701u(), new C13730d());
            Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…neFunction(t1, t2, t3) })");
            Observable distinctUntilChanged3 = combineLatest2.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "Observables.combineLates…  .distinctUntilChanged()");
            Observable combineLatest3 = Observable.combineLatest(combineLatest, distinctUntilChanged3, new C13731e(UserTrackerServicePlugin.this));
            Intrinsics.checkExpressionValueIsNotNull(combineLatest3, "Observable.combineLatest…ombineFunction(t1, t2) })");
            return combineLatest3.share();
        }
    }

    public UserTrackerServicePlugin(Context context, InterfaceC46473om3 operatorManager, InterfaceC35660Rh6 userStream, InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig, AbstractC39873de5 rxBleClient, Intent mainActivityIntent, C22454gl preference, LifecycleOwner lifecycleOwner) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(mainActivityIntent, "mainActivityIntent");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f61392g = context;
        this.f61393h = operatorManager;
        this.f61394i = userStream;
        this.f61395j = locationManager;
        this.f61396k = reactiveConfig;
        this.f61397l = rxBleClient;
        this.f61398m = mainActivityIntent;
        this.f61399n = preference;
        this.f61400o = lifecycleOwner;
        this.f61401p = 1238;
        this.f61402q = 2;
        this.f61403r = "special_tasks_channel";
        lazy = LazyKt__LazyJVMKt.lazy(new C13717d());
        this.f61404s = lazy;
        this.f61405t = Executors.newSingleThreadExecutor();
        C24552a<String> m31921g = C24552a.m31921g("");
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(\"\")");
        this.f61406u = m31921g;
        C24552a<String> m31921g2 = C24552a.m31921g("");
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(\"\")");
        this.f61407v = m31921g2;
        C24552a<Intent> m31921g3 = C24552a.m31921g(mainActivityIntent);
        Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault(mainActivityIntent)");
        this.f61408w = m31921g3;
        this.f61409x = C45832nh5.m23307i(new UserTrackerServicePlugin$lifecycleObservable$1(this));
        lazy2 = LazyKt__LazyJVMKt.lazy(new C13726j());
        this.f61410y = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C13724i());
        this.f61411z = lazy3;
    }

    /* renamed from: v */
    public static final Boolean m60700v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23496h m60699w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final Triple m60698x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m60697y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final AbstractC23461c m60708A() {
        AbstractC23461c m33069Q = this.f61393h.mo8095k1().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "operatorManager.track()\n      .onErrorComplete()");
        return m33069Q;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: c */
    public String mo16760c() {
        return this.f61403r;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: e */
    public String mo16758e() {
        String value = this.f61407v.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: f */
    public String mo16757f() {
        String value = this.f61406u.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: g */
    public Context mo16756g() {
        return this.f61392g;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: i */
    public int mo16754i() {
        return this.f61401p;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: j */
    public int mo16753j() {
        return this.f61402q;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: l */
    public Observable<Boolean> mo16751l() {
        Object value = this.f61411z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-shouldForeground>(...)");
        return (Observable) value;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: n */
    public void mo16749n(ScopeProvider scopeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        super.mo16749n(scopeProvider, z);
        Observable<C13716c> subscribeOn = m60702t().subscribeOn(C24542a.m31933b(this.f61405t));
        final C13719f c13719f = new C13719f();
        AbstractC23461c switchMapCompletable = subscribeOn.switchMapCompletable(new InterfaceC23492o() { // from class: ai6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m60699w;
                m60699w = UserTrackerServicePlugin.m60699w(Function1.this, obj);
                return m60699w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate(sc…nNext(intent)\n      }\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<C13716c> m60702t = m60702t();
        final C13721g c13721g = new C13721g();
        Observable<R> map = m60702t.map(new InterfaceC23492o() { // from class: bi6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m60698x;
                m60698x = UserTrackerServicePlugin.m60698x(Function1.this, obj);
                return m60698x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onCreate(sc…nNext(intent)\n      }\n  }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13723h c13723h = new C13723h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ci6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                UserTrackerServicePlugin.m60697y(Function1.this, obj);
            }
        });
    }

    /* renamed from: s */
    public final NotificationManagerCompat m60703s() {
        return (NotificationManagerCompat) this.f61404s.getValue();
    }

    /* renamed from: t */
    public final Observable<C13716c> m60702t() {
        Object value = this.f61410y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-shouldForegroundSetup>(...)");
        return (Observable) value;
    }

    /* renamed from: u */
    public final Observable<Boolean> m60701u() {
        Observable<Long> interval = Observable.interval(5L, TimeUnit.SECONDS);
        final C13718e c13718e = new C13718e();
        Observable<Boolean> distinctUntilChanged = interval.map(new InterfaceC23492o() { // from class: Zh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m60700v;
                m60700v = UserTrackerServicePlugin.m60700v(Function1.this, obj);
                return m60700v;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "private fun observeNotif…istinctUntilChanged()\n  }");
        return distinctUntilChanged;
    }

    /* renamed from: z */
    public final C13716c m60696z(boolean z, boolean z2) {
        EnumC13715b enumC13715b;
        boolean z3;
        if (z2) {
            enumC13715b = EnumC13715b.REQUIREMENTS_MISSING;
        } else {
            enumC13715b = EnumC13715b.TRACKING_ENABLED;
        }
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new C13716c(z3, enumC13715b);
    }
}
