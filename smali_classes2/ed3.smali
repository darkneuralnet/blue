.class public final Led3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldd3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010 R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010 R\u0017\u0010\'\u001a\u00020#8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006*"
    }
    d2 = {
        "Led3;",
        "Ldd3;",
        "Lcom/google/firebase/messaging/RemoteMessage$b;",
        "message",
        "Landroid/content/Intent;",
        "openIntent",
        "",
        "c",
        "Landroid/app/Notification;",
        "notification",
        "",
        "notificationId",
        "e",
        "",
        "title",
        "text",
        "",
        "delayMilliseconds",
        "f",
        "b",
        "requestCode",
        "Lac3$e;",
        "d",
        "",
        "a",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LZC6;",
        "LZC6;",
        "workManager",
        "",
        "Ljava/lang/String;",
        "channelId",
        "channelName",
        "Landroid/app/NotificationManager;",
        "Landroid/app/NotificationManager;",
        "getManager",
        "()Landroid/app/NotificationManager;",
        "manager",
        "<init>",
        "(Landroid/content/Context;LZC6;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationSenderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSenderImpl.kt\nco/bird/android/app/push/NotificationSenderImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n12744#2,2:156\n*S KotlinDebug\n*F\n+ 1 NotificationSenderImpl.kt\nco/bird/android/app/push/NotificationSenderImpl\n*L\n149#1:156,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LZC6;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/app/NotificationManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZC6;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led3;->a:Landroid/content/Context;

    iput-object p2, p0, Led3;->b:LZC6;

    const-string p2, "default_channel_id"

    iput-object p2, p0, Led3;->c:Ljava/lang/String;

    const-string v0, "Default Channel"

    iput-object v0, p0, Led3;->d:Ljava/lang/String;

    const-string v1, "notification"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Led3;->e:Landroid/app/NotificationManager;

    invoke-virtual {p0}, Led3;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lia3;->a()V

    const/4 v1, 0x3

    invoke-static {p2, v0, v1}, Lha3;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object p2

    invoke-static {p1, p2}, Lda3;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Led3;->e:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public c(Lcom/google/firebase/messaging/RemoteMessage$b;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "openIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, v0, p2}, Led3;->d(ILandroid/content/Intent;)Lac3$e;

    move-result-object p2

    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    invoke-virtual {p2, v0}, Lac3$e;->C(Landroid/net/Uri;)Lac3$e;

    move-result-object p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lac3$e;->I(J)Lac3$e;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lac3$e;->m(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$b;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {p2, p1}, Lac3$e;->l(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object p1

    invoke-virtual {p1}, Lac3$e;->c()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "builder\n      .setSound(\u2026Y_DEFAULT)\n      .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int p2, v0

    invoke-virtual {p0, p1, p2}, Led3;->e(Landroid/app/Notification;I)V

    return-void
.end method

.method public d(ILandroid/content/Intent;)Lac3$e;
    .locals 4

    const-string v0, "openIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x4000000

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/high16 v1, 0x10000000

    :try_start_0
    iget-object v2, p0, Led3;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, LBZ5;->h(Landroid/content/Context;)LBZ5;

    move-result-object v2

    const-class v3, Lco/bird/android/app/feature/ride/activity/RideActivity;

    invoke-virtual {v2, v3}, LBZ5;->f(Ljava/lang/Class;)LBZ5;

    move-result-object v2

    invoke-virtual {v2, p2}, LBZ5;->a(Landroid/content/Intent;)LBZ5;

    move-result-object v2

    or-int v3, v0, v1

    invoke-virtual {v2, p1, v3}, LBZ5;->j(II)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "{\n      TaskStackBuilder\u2026r mutabilityFlag)!!\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iget-object v2, p0, Led3;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    or-int/2addr v0, v1

    invoke-static {v2, p1, p2, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    const-string p1, "{\n      PendingIntent.ge\u2026abilityFlag\n      )\n    }"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0}, Led3;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lac3$e;

    iget-object p2, p0, Led3;->a:Landroid/content/Context;

    iget-object v0, p0, Led3;->c:Ljava/lang/String;

    invoke-direct {p1, p2, v0}, Lac3$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    new-instance p1, Lac3$e;

    iget-object p2, p0, Led3;->a:Landroid/content/Context;

    invoke-direct {p1, p2}, Lac3$e;-><init>(Landroid/content/Context;)V

    :goto_2
    invoke-virtual {p1, v2}, Lac3$e;->k(Landroid/app/PendingIntent;)Lac3$e;

    move-result-object p1

    const-string p2, "if (isAndroidOero()) {\n \u2026tentIntent(contentIntent)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lyg4;->ic_notification:I

    invoke-virtual {p1, p2}, Lac3$e;->B(I)Lac3$e;

    move-result-object p1

    iget-object p2, p0, Led3;->a:Landroid/content/Context;

    sget v0, LDf4;->black:I

    invoke-static {p2, v0}, LfB0;->f(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Lac3$e;->j(I)Lac3$e;

    move-result-object p1

    const-string p2, "builder\n      .setSmallI\u2026lorCompat(C.color.black))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e(Landroid/app/Notification;I)V
    .locals 1

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p1, Landroid/app/Notification;->flags:I

    iget-object v0, p0, Led3;->e:Landroid/app/NotificationManager;

    invoke-virtual {v0, p2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public f(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IJ)V
    .locals 6

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "text"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Led3;->b:LZC6;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "one_off_scheduler_notification_submit_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    sget-object v3, Lfi1;->b:Lfi1;

    new-instance v4, LFh3$a;

    const-class v5, Lco/bird/android/app/push/worker/ScheduledNotificationWorker;

    invoke-direct {v4, v5}, LFh3$a;-><init>(Ljava/lang/Class;)V

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, p4, p5, v5}, LEG6$a;->j(JLjava/util/concurrent/TimeUnit;)LEG6$a;

    move-result-object p4

    check-cast p4, LFh3$a;

    new-instance p5, Landroidx/work/b$a;

    invoke-direct {p5}, Landroidx/work/b$a;-><init>()V

    const/4 v4, 0x3

    new-array v4, v4, [Lkotlin/Pair;

    const/4 v5, 0x0

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v4, v5

    const/4 p1, 0x1

    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v4, p1

    const-string p1, "channel_id"

    iget-object p2, p0, Led3;->c:Ljava/lang/String;

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v4, p2

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p5, p1}, Landroidx/work/b$a;->d(Ljava/util/Map;)Landroidx/work/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    const-string p2, "Builder().putAll(\n      \u2026    )\n          ).build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, p1}, LEG6$a;->k(Landroidx/work/b;)LEG6$a;

    move-result-object p1

    check-cast p1, LFh3$a;

    invoke-virtual {p1}, LEG6$a;->a()LEG6;

    move-result-object p1

    check-cast p1, LFh3;

    invoke-virtual {v2, p3, v3, p1}, LZC6;->f(Ljava/lang/String;Lfi1;LFh3;)LXh3;

    return-void
.end method
