.class public final Lbo/app/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010)\u001a\u00020\u0004\u00a2\u0006\u0004\u0008*\u0010+J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0006\u001a\u00020\u0002H\u0002J\u0008\u0010\u0007\u001a\u00020\u0002H\u0002J\u0008\u0010\u0008\u001a\u00020\u0002H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0007J\u0008\u0010\r\u001a\u00020\u0002H\u0007R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006,"
    }
    d2 = {
        "Lbo/app/t;",
        "",
        "",
        "i",
        "",
        "f",
        "k",
        "e",
        "c",
        "m",
        "o",
        "l",
        "n",
        "d",
        "Lbo/app/l3;",
        "internalSession",
        "Lbo/app/l3;",
        "h",
        "()Lbo/app/l3;",
        "a",
        "(Lbo/app/l3;)V",
        "getInternalSession$annotations",
        "()V",
        "Lbo/app/f5;",
        "g",
        "()Lbo/app/f5;",
        "currentSessionId",
        "j",
        "()Z",
        "isCurrentSessionSealed",
        "Landroid/content/Context;",
        "applicationContext",
        "Lbo/app/q2;",
        "sessionStorageManager",
        "Lbo/app/g2;",
        "internalEventPublisher",
        "externalEventPublisher",
        "Landroid/app/AlarmManager;",
        "alarmManager",
        "",
        "sessionTimeoutSeconds",
        "sessionStartBasedTimeoutEnabled",
        "<init>",
        "(Landroid/content/Context;Lbo/app/q2;Lbo/app/g2;Lbo/app/g2;Landroid/app/AlarmManager;IZ)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final l:Lbo/app/t$a;

.field private static final m:J

.field private static final n:J


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lbo/app/q2;

.field private final c:Lbo/app/g2;

.field private final d:Lbo/app/g2;

.field private final e:Landroid/app/AlarmManager;

.field private final f:I

.field private final g:Z

.field private final h:Ljava/util/concurrent/locks/ReentrantLock;

.field private final i:Ljava/lang/String;

.field private j:Lzh2;

.field private k:Lbo/app/l3;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbo/app/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/t;->l:Lbo/app/t$a;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lbo/app/t;->m:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lbo/app/t;->n:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbo/app/q2;Lbo/app/g2;Lbo/app/g2;Landroid/app/AlarmManager;IZ)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionStorageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalEventPublisher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalEventPublisher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/t;->a:Landroid/content/Context;

    iput-object p2, p0, Lbo/app/t;->b:Lbo/app/q2;

    iput-object p3, p0, Lbo/app/t;->c:Lbo/app/g2;

    iput-object p4, p0, Lbo/app/t;->d:Lbo/app/g2;

    iput-object p5, p0, Lbo/app/t;->e:Landroid/app/AlarmManager;

    iput p6, p0, Lbo/app/t;->f:I

    iput-boolean p7, p0, Lbo/app/t;->g:Z

    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p2, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p2, p3, p2}, LKh2;->b(Lzh2;ILjava/lang/Object;)Lms0;

    move-result-object p2

    iput-object p2, p0, Lbo/app/t;->j:Lzh2;

    new-instance p2, Lbo/app/t$k;

    invoke-direct {p2, p0}, Lbo/app/t$k;-><init>(Lbo/app/t;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    const-string p4, ".intent.BRAZE_SESSION_SHOULD_SEAL"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lbo/app/t;->i:Ljava/lang/String;

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p5, 0x21

    if-lt p4, p5, :cond_0

    new-instance p4, Landroid/content/IntentFilter;

    invoke-direct {p4, p3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x4

    invoke-static {p1, p2, p4, p3}, Lu52;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    new-instance p4, Landroid/content/IntentFilter;

    invoke-direct {p4, p3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_0
    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Lbo/app/t;->m:J

    return-wide v0
.end method

.method public static final synthetic a(Lbo/app/t;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 0

    iget-object p0, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, Lbo/app/t;->n:J

    return-wide v0
.end method

.method public static final synthetic b(Lbo/app/t;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lbo/app/t;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic c(Lbo/app/t;)Lbo/app/g2;
    .locals 0

    iget-object p0, p0, Lbo/app/t;->c:Lbo/app/g2;

    return-object p0
.end method

.method private final c()V
    .locals 9

    sget-object v0, Lk20;->a:Lk20;

    sget-object v5, Lbo/app/t$b;->b:Lbo/app/t$b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lbo/app/t;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "session_id"

    iget-object v2, p0, Lbo/app/t;->k:Lbo/app/l3;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lb62;->b()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    or-int/2addr v1, v2

    iget-object v2, p0, Lbo/app/t;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, p0, Lbo/app/t;->e:Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    sget-object v6, Lbo/app/t$c;->b:Lbo/app/t$c;

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final synthetic d(Lbo/app/t;)V
    .locals 0

    invoke-direct {p0}, Lbo/app/t;->k()V

    return-void
.end method

.method private final e()V
    .locals 11

    iget-object v0, p0, Lbo/app/t;->k:Lbo/app/l3;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lbo/app/t;->l:Lbo/app/t$a;

    iget v2, p0, Lbo/app/t;->f:I

    iget-boolean v3, p0, Lbo/app/t;->g:Z

    invoke-virtual {v1, v0, v2, v3}, Lbo/app/t$a;->a(Lbo/app/l3;IZ)J

    move-result-wide v1

    sget-object v3, Lk20;->a:Lk20;

    new-instance v8, Lbo/app/t$d;

    invoke-direct {v8, v1, v2}, Lbo/app/t$d;-><init>(J)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :try_start_0
    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, Lbo/app/t;->i:Ljava/lang/String;

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v4, "session_id"

    invoke-virtual {v0}, Lbo/app/l3;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lb62;->b()I

    move-result v0

    const/high16 v4, 0x40000000    # 2.0f

    or-int/2addr v0, v4

    iget-object v4, p0, Lbo/app/t;->a:Landroid/content/Context;

    const/4 v5, 0x0

    invoke-static {v4, v5, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v3, p0, Lbo/app/t;->e:Landroid/app/AlarmManager;

    invoke-static {}, LoT0;->h()J

    move-result-wide v4

    add-long/2addr v4, v1

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v4, v5, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    sget-object v6, Lbo/app/t$e;->b:Lbo/app/t$e;

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final f()Z
    .locals 12

    iget-object v0, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-direct {p0}, Lbo/app/t;->k()V

    invoke-virtual {p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lbo/app/d5;->y()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lbo/app/l3;->w()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lbo/app/l3;->a(Ljava/lang/Double;)V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-direct {p0}, Lbo/app/t;->i()V

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lbo/app/d5;->y()Z

    move-result v4

    if-ne v4, v3, :cond_3

    move v2, v3

    :cond_3
    :goto_1
    if-eqz v2, :cond_4

    sget-object v4, Lk20;->a:Lk20;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lbo/app/t$f;

    invoke-direct {v9, v1}, Lbo/app/t$f;-><init>(Lbo/app/l3;)V

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v5, p0

    invoke-static/range {v4 .. v11}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v2, p0, Lbo/app/t;->b:Lbo/app/q2;

    invoke-virtual {v1}, Lbo/app/d5;->n()Lbo/app/f5;

    move-result-object v1

    invoke-virtual {v1}, Lbo/app/f5;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lbo/app/q2;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_2
    move v2, v3

    :cond_5
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method private final i()V
    .locals 9

    new-instance v8, Lbo/app/l3;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lbo/app/l3;-><init>(Lbo/app/f5;DLjava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, p0, Lbo/app/t;->k:Lbo/app/l3;

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    new-instance v5, Lbo/app/t$g;

    invoke-direct {v5, v8}, Lbo/app/t$g;-><init>(Lbo/app/l3;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/t;->c:Lbo/app/g2;

    new-instance v1, Lbo/app/e5;

    invoke-direct {v1, v8}, Lbo/app/e5;-><init>(Lbo/app/d5;)V

    const-class v2, Lbo/app/e5;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lbo/app/t;->d:Lbo/app/g2;

    new-instance v1, LJv5;

    invoke-virtual {v8}, Lbo/app/d5;->n()Lbo/app/f5;

    move-result-object v2

    invoke-virtual {v2}, Lbo/app/f5;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LJv5$a;->b:LJv5$a;

    invoke-direct {v1, v2, v3}, LJv5;-><init>(Ljava/lang/String;LJv5$a;)V

    const-class v2, LJv5;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method private final k()V
    .locals 20

    move-object/from16 v9, p0

    iget-object v10, v9, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v10}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v0

    const/4 v11, 0x0

    if-nez v0, :cond_1

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lbo/app/t$h;->b:Lbo/app/t$h;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, v9, Lbo/app/t;->b:Lbo/app/q2;

    invoke-interface {v0}, Lbo/app/q2;->a()Lbo/app/d5;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, v11

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lbo/app/d5;->z()Lbo/app/l3;

    move-result-object v0

    :goto_0
    invoke-virtual {v9, v0}, Lbo/app/t;->a(Lbo/app/l3;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    sget-object v12, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lbo/app/t$i;

    invoke-direct {v6, v0}, Lbo/app/t$i;-><init>(Lbo/app/l3;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v12

    move-object/from16 v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lbo/app/l3;->w()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lbo/app/d5;->y()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v13, Lbo/app/t;->l:Lbo/app/t$a;

    invoke-virtual {v0}, Lbo/app/d5;->x()D

    move-result-wide v14

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v16

    iget v1, v9, Lbo/app/t;->f:I

    iget-boolean v2, v9, Lbo/app/t;->g:Z

    move/from16 v18, v1

    move/from16 v19, v2

    invoke-virtual/range {v13 .. v19}, Lbo/app/t$a;->a(DDIZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v3, Lk20$a;->d:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lbo/app/t$j;

    invoke-direct {v6, v0}, Lbo/app/t$j;-><init>(Lbo/app/l3;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, v12

    move-object/from16 v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbo/app/t;->l()V

    iget-object v0, v9, Lbo/app/t;->b:Lbo/app/q2;

    invoke-virtual/range {p0 .. p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v1, v11

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lbo/app/d5;->n()Lbo/app/f5;

    move-result-object v1

    :goto_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lbo/app/q2;->a(Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Lbo/app/t;->a(Lbo/app/l3;)V

    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-interface {v10}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {v10}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public final a(Lbo/app/l3;)V
    .locals 0

    iput-object p1, p0, Lbo/app/t;->k:Lbo/app/l3;

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lbo/app/t;->j:Lzh2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final g()Lbo/app/f5;
    .locals 2

    iget-object v0, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-direct {p0}, Lbo/app/t;->k()V

    invoke-virtual {p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lbo/app/d5;->n()Lbo/app/f5;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final h()Lbo/app/l3;
    .locals 1

    iget-object v0, p0, Lbo/app/t;->k:Lbo/app/l3;

    return-object v0
.end method

.method public final j()Z
    .locals 3

    iget-object v0, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lbo/app/d5;->y()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, Lbo/app/t;->k:Lbo/app/l3;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v0}, Lbo/app/l3;->A()V

    iget-object v2, p0, Lbo/app/t;->b:Lbo/app/q2;

    invoke-interface {v2, v0}, Lbo/app/q2;->a(Lbo/app/d5;)V

    iget-object v2, p0, Lbo/app/t;->c:Lbo/app/g2;

    new-instance v3, Lbo/app/g5;

    invoke-direct {v3, v0}, Lbo/app/g5;-><init>(Lbo/app/d5;)V

    const-class v4, Lbo/app/g5;

    invoke-interface {v2, v3, v4}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v2, p0, Lbo/app/t;->d:Lbo/app/g2;

    new-instance v3, LJv5;

    invoke-virtual {v0}, Lbo/app/d5;->n()Lbo/app/f5;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/f5;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v4, LJv5$a;->c:LJv5$a;

    invoke-direct {v3, v0, v4}, LJv5;-><init>(Ljava/lang/String;LJv5$a;)V

    const-class v0, LJv5;

    invoke-interface {v2, v3, v0}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final m()V
    .locals 4

    iget-object v0, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-direct {p0}, Lbo/app/t;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lbo/app/t;->b:Lbo/app/q2;

    invoke-interface {v2, v1}, Lbo/app/q2;->a(Lbo/app/d5;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lbo/app/t;->d()V

    invoke-direct {p0}, Lbo/app/t;->c()V

    iget-object v1, p0, Lbo/app/t;->c:Lbo/app/g2;

    sget-object v2, Lbo/app/h5;->b:Lbo/app/h5;

    const-class v3, Lbo/app/h5;

    invoke-interface {v1, v2, v3}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final n()V
    .locals 9

    iget-object v0, p0, Lbo/app/t;->j:Lzh2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object v3, LZ10;->b:LZ10;

    new-instance v6, Lbo/app/t$l;

    invoke-direct {v6, p0, v2}, Lbo/app/t$l;-><init>(Lbo/app/t;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object v0

    iput-object v0, p0, Lbo/app/t;->j:Lzh2;

    return-void
.end method

.method public final o()V
    .locals 13

    iget-object v0, p0, Lbo/app/t;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-direct {p0}, Lbo/app/t;->f()Z

    invoke-virtual {p0}, Lbo/app/t;->h()Lbo/app/l3;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LoT0;->j()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbo/app/l3;->a(Ljava/lang/Double;)V

    iget-object v2, p0, Lbo/app/t;->b:Lbo/app/q2;

    invoke-interface {v2, v1}, Lbo/app/q2;->a(Lbo/app/d5;)V

    invoke-virtual {p0}, Lbo/app/t;->n()V

    invoke-direct {p0}, Lbo/app/t;->e()V

    iget-object v2, p0, Lbo/app/t;->c:Lbo/app/g2;

    sget-object v3, Lbo/app/j5;->b:Lbo/app/j5;

    const-class v4, Lbo/app/j5;

    invoke-interface {v2, v3, v4}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    sget-object v5, Lk20;->a:Lk20;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lbo/app/t$m;

    invoke-direct {v10, v1}, Lbo/app/t$m;-><init>(Lbo/app/l3;)V

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v6, p0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method
