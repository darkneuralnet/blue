package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C38054ac3;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014R\u001b\u0010\u0012\u001a\u00020\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00028\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010%\u001a\u00020\"8$X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0014\u0010-\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0014\u0010.\u001a\u00020\r8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u00061"}, m28432d2 = {"Lqx1;", "", "", "icon", "Landroid/app/Notification;", "m", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "isDebug", "", "n", C17296a.f69688o, "", "b", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "channelName", "f", "contentTitle", "c", "e", "contentText", "I", "k", "()I", "priority", "Landroid/content/Intent;", "Landroid/content/Intent;", "h", "()Landroid/content/Intent;", "intent", "Z", "Landroid/content/Context;", "g", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "l", "()Lio/reactivex/Observable;", "shouldForeground", "i", "notificationId", "j", "notificationPriority", "channelId", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qx1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC47767qx1 {

    /* renamed from: a */
    public final Lazy f106116a;

    /* renamed from: b */
    public final Lazy f106117b;

    /* renamed from: c */
    public final Lazy f106118c;

    /* renamed from: d */
    public final int f106119d;

    /* renamed from: e */
    public final Intent f106120e;

    /* renamed from: f */
    public boolean f106121f;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qx1$a */
    /* loaded from: classes2.dex */
    public static final class C27740a extends Lambda implements Function0<String> {
        public C27740a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = AbstractC47767qx1.this.mo16756g().getString(C45871nl4.notification_bird_running_in_background_channel_name);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_background_channel_name)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qx1$b */
    /* loaded from: classes2.dex */
    public static final class C27741b extends Lambda implements Function0<String> {
        public C27741b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = AbstractC47767qx1.this.mo16756g().getString(C45871nl4.notification_bird_running_in_background_content);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ng_in_background_content)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qx1$c */
    /* loaded from: classes2.dex */
    public static final class C27742c extends Lambda implements Function0<String> {
        public C27742c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = AbstractC47767qx1.this.mo16756g().getString(C45871nl4.notification_bird_running_in_background);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…rd_running_in_background)");
            return string;
        }
    }

    public AbstractC47767qx1() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C27740a());
        this.f106116a = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C27742c());
        this.f106117b = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C27741b());
        this.f106118c = lazy3;
        this.f106119d = -2;
        this.f106120e = new Intent();
    }

    public static /* synthetic */ void onCreate$default(AbstractC47767qx1 abstractC47767qx1, ScopeProvider scopeProvider, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCreate");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC47767qx1.mo16749n(scopeProvider, z);
    }

    /* renamed from: a */
    public Notification m16762a(int i) {
        int i2;
        PendingIntent activity;
        C38054ac3.C10770e c10770e;
        String mo16757f;
        m16761b();
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = 67108864;
        } else {
            i2 = 0;
        }
        try {
            activity = BZ5.m113853h(mo16756g()).m113858a(mo16755h()).m113852j(0, i2 | 268435456);
            Intrinsics.checkNotNull(activity);
            Intrinsics.checkNotNullExpressionValue(activity, "{\n      TaskStackBuilder…r mutabilityFlag)!!\n    }");
        } catch (Exception unused) {
            activity = PendingIntent.getActivity(mo16756g(), 0, mo16755h(), i2 | 268435456);
            Intrinsics.checkNotNullExpressionValue(activity, "{\n      PendingIntent.ge…abilityFlag\n      )\n    }");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c10770e = new C38054ac3.C10770e(mo16756g(), mo16760c());
        } else {
            c10770e = new C38054ac3.C10770e(mo16756g());
        }
        C38054ac3.C10770e m71049k = c10770e.m71049k(activity);
        Intrinsics.checkNotNullExpressionValue(m71049k, "if (Build.VERSION.SDK_IN…tentIntent(contentIntent)");
        if (this.f106121f) {
            mo16757f = getClass().getSimpleName();
        } else {
            mo16757f = mo16757f();
        }
        C38054ac3.C10770e m71036x = m71049k.m71047m(mo16757f).m71048l(mo16758e()).m71067B(i).m71050j(NA0.m94301c(mo16756g(), C32364Df4.black)).m71036x(m16752k());
        Intrinsics.checkNotNullExpressionValue(m71036x, "builder\n      .setConten…   .setPriority(priority)");
        Notification m71057c = m71036x.m71057c();
        Intrinsics.checkNotNullExpressionValue(m71057c, "builder.build()");
        return m71057c;
    }

    /* renamed from: b */
    public String m16761b() {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = mo16756g().getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            C42795ia3.m33793a();
            NotificationChannel m36179a = C42202ha3.m36179a(mo16760c(), m16759d(), 1);
            m36179a.setDescription(mo16756g().getString(C45871nl4.notification_bird_running_in_background_channel_description));
            ((NotificationManager) systemService).createNotificationChannel(m36179a);
        }
        return mo16760c();
    }

    /* renamed from: c */
    public abstract String mo16760c();

    /* renamed from: d */
    public String m16759d() {
        return (String) this.f106116a.getValue();
    }

    /* renamed from: e */
    public String mo16758e() {
        return (String) this.f106118c.getValue();
    }

    /* renamed from: f */
    public String mo16757f() {
        return (String) this.f106117b.getValue();
    }

    /* renamed from: g */
    public abstract Context mo16756g();

    /* renamed from: h */
    public Intent mo16755h() {
        return this.f106120e;
    }

    /* renamed from: i */
    public abstract int mo16754i();

    /* renamed from: j */
    public abstract int mo16753j();

    /* renamed from: k */
    public int m16752k() {
        return this.f106119d;
    }

    /* renamed from: l */
    public abstract Observable<Boolean> mo16751l();

    /* renamed from: m */
    public final Notification m16750m(int i) {
        return m16762a(i);
    }

    /* renamed from: n */
    public void mo16749n(ScopeProvider scopeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f106121f = z;
    }
}
