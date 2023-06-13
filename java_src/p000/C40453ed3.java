package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import androidx.work.C12124b;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ride.activity.RideActivity;
import co.bird.android.app.push.worker.ScheduledNotificationWorker;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.facebook.share.internal.C17296a;
import com.google.firebase.messaging.RemoteMessage;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32849Fh3;
import p000.C38054ac3;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"Led3;", "Ldd3;", "Lcom/google/firebase/messaging/RemoteMessage$b;", "message", "Landroid/content/Intent;", "openIntent", "", "c", "Landroid/app/Notification;", TransferService.INTENT_KEY_NOTIFICATION, "", "notificationId", "e", "", "title", Entry.TYPE_TEXT, "", "delayMilliseconds", "f", "b", "requestCode", "Lac3$e;", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LZC6;", "LZC6;", "workManager", "", "Ljava/lang/String;", "channelId", "channelName", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "getManager", "()Landroid/app/NotificationManager;", "manager", "<init>", "(Landroid/content/Context;LZC6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationSenderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSenderImpl.kt\nco/bird/android/app/push/NotificationSenderImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n12744#2,2:156\n*S KotlinDebug\n*F\n+ 1 NotificationSenderImpl.kt\nco/bird/android/app/push/NotificationSenderImpl\n*L\n149#1:156,2\n*E\n"})
/* renamed from: ed3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40453ed3 implements InterfaceC39861dd3 {

    /* renamed from: a */
    public final Context f78616a;

    /* renamed from: b */
    public final ZC6 f78617b;

    /* renamed from: c */
    public final String f78618c;

    /* renamed from: d */
    public final String f78619d;

    /* renamed from: e */
    public final NotificationManager f78620e;

    public C40453ed3(Context context, ZC6 workManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f78616a = context;
        this.f78617b = workManager;
        this.f78618c = "default_channel_id";
        this.f78619d = "Default Channel";
        Object systemService = context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f78620e = notificationManager;
        if (m42700a()) {
            C42795ia3.m33793a();
            notificationManager.createNotificationChannel(C42202ha3.m36179a("default_channel_id", "Default Channel", 3));
        }
    }

    /* renamed from: a */
    public final boolean m42700a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // p000.InterfaceC39861dd3
    /* renamed from: b */
    public void mo42699b(int i) {
        this.f78620e.cancel(i);
    }

    @Override // p000.InterfaceC39861dd3
    /* renamed from: c */
    public void mo42698c(RemoteMessage.C18353b message, Intent openIntent) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(openIntent, "openIntent");
        C38054ac3.C10770e m71047m = mo42697d(message.hashCode(), openIntent).m71066C(Settings.System.DEFAULT_NOTIFICATION_URI).m71060I(System.currentTimeMillis()).m71047m(message.m47203c());
        String m47205a = message.m47205a();
        if (m47205a == null) {
            m47205a = "";
        }
        Notification m71057c = m71047m.m71048l(m47205a).m71057c();
        Intrinsics.checkNotNullExpressionValue(m71057c, "builder\n      .setSound(…Y_DEFAULT)\n      .build()");
        mo42696e(m71057c, (int) System.currentTimeMillis());
    }

    @Override // p000.InterfaceC39861dd3
    /* renamed from: d */
    public C38054ac3.C10770e mo42697d(int i, Intent openIntent) {
        int i2;
        PendingIntent activity;
        C38054ac3.C10770e c10770e;
        Intrinsics.checkNotNullParameter(openIntent, "openIntent");
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = 67108864;
        } else {
            i2 = 0;
        }
        try {
            activity = BZ5.m113853h(this.f78616a.getApplicationContext()).m113854f(RideActivity.class).m113858a(openIntent).m113852j(i, i2 | 268435456);
            Intrinsics.checkNotNull(activity);
            Intrinsics.checkNotNullExpressionValue(activity, "{\n      TaskStackBuilder…r mutabilityFlag)!!\n    }");
        } catch (Exception unused) {
            activity = PendingIntent.getActivity(this.f78616a.getApplicationContext(), i, openIntent, i2 | 268435456);
            Intrinsics.checkNotNullExpressionValue(activity, "{\n      PendingIntent.ge…abilityFlag\n      )\n    }");
        }
        if (m42700a()) {
            c10770e = new C38054ac3.C10770e(this.f78616a, this.f78618c);
        } else {
            c10770e = new C38054ac3.C10770e(this.f78616a);
        }
        C38054ac3.C10770e m71049k = c10770e.m71049k(activity);
        Intrinsics.checkNotNullExpressionValue(m71049k, "if (isAndroidOero()) {\n …tentIntent(contentIntent)");
        C38054ac3.C10770e m71050j = m71049k.m71067B(C52342yg4.ic_notification).m71050j(C40788fB0.m41776f(this.f78616a, C32364Df4.black));
        Intrinsics.checkNotNullExpressionValue(m71050j, "builder\n      .setSmallI…lorCompat(C.color.black))");
        return m71050j;
    }

    @Override // p000.InterfaceC39861dd3
    /* renamed from: e */
    public void mo42696e(Notification notification, int i) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        notification.flags |= 16;
        this.f78620e.notify(i, notification);
    }

    @Override // p000.InterfaceC39861dd3
    /* renamed from: f */
    public void mo42695f(CharSequence title, CharSequence text, int i, long j) {
        Map<String, Object> mapOf;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        EnumC41094fi1 enumC41094fi1 = EnumC41094fi1.REPLACE;
        C12124b.C12125a c12125a = new C12124b.C12125a();
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("title", title), TuplesKt.m28425to(Entry.TYPE_TEXT, text), TuplesKt.m28425to("channel_id", this.f78618c));
        C12124b m65581a = c12125a.m65578d(mapOf).m65581a();
        Intrinsics.checkNotNullExpressionValue(m65581a, "Builder().putAll(\n      …    )\n          ).build()");
        this.f78617b.m73615f("one_off_scheduler_notification_submit_" + i, enumC41094fi1, new C32849Fh3.C2399a(ScheduledNotificationWorker.class).m109250j(j, TimeUnit.MILLISECONDS).m109249k(m65581a).m109257a());
    }
}
