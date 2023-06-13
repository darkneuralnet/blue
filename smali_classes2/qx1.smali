.class public abstract Lqx1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0017J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0008\u0010\u000e\u001a\u00020\rH\u0014R\u001b\u0010\u0012\u001a\u00020\r8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\r8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\r8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000f\u001a\u0004\u0008\u0016\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00028\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010!R\u0014\u0010%\u001a\u00020\"8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00080&8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010+\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u001aR\u0014\u0010-\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u001aR\u0014\u0010.\u001a\u00020\r8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0011\u00a8\u00061"
    }
    d2 = {
        "Lqx1;",
        "",
        "",
        "icon",
        "Landroid/app/Notification;",
        "m",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "",
        "isDebug",
        "",
        "n",
        "a",
        "",
        "b",
        "Lkotlin/Lazy;",
        "d",
        "()Ljava/lang/String;",
        "channelName",
        "f",
        "contentTitle",
        "c",
        "e",
        "contentText",
        "I",
        "k",
        "()I",
        "priority",
        "Landroid/content/Intent;",
        "Landroid/content/Intent;",
        "h",
        "()Landroid/content/Intent;",
        "intent",
        "Z",
        "Landroid/content/Context;",
        "g",
        "()Landroid/content/Context;",
        "context",
        "Lio/reactivex/Observable;",
        "l",
        "()Lio/reactivex/Observable;",
        "shouldForeground",
        "i",
        "notificationId",
        "j",
        "notificationPriority",
        "channelId",
        "<init>",
        "()V",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;

.field public final c:Lkotlin/Lazy;

.field public final d:I

.field public final e:Landroid/content/Intent;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqx1$a;

    invoke-direct {v0, p0}, Lqx1$a;-><init>(Lqx1;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lqx1;->a:Lkotlin/Lazy;

    new-instance v0, Lqx1$c;

    invoke-direct {v0, p0}, Lqx1$c;-><init>(Lqx1;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lqx1;->b:Lkotlin/Lazy;

    new-instance v0, Lqx1$b;

    invoke-direct {v0, p0}, Lqx1$b;-><init>(Lqx1;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lqx1;->c:Lkotlin/Lazy;

    const/4 v0, -0x2

    iput v0, p0, Lqx1;->d:I

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lqx1;->e:Landroid/content/Intent;

    return-void
.end method

.method public static synthetic onCreate$default(Lqx1;Lcom/uber/autodispose/ScopeProvider;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lqx1;->n(Lcom/uber/autodispose/ScopeProvider;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onCreate"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(I)Landroid/app/Notification;
    .locals 5

    invoke-virtual {p0}, Lqx1;->b()Ljava/lang/String;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x4000000

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/high16 v1, 0x10000000

    :try_start_0
    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, LBZ5;->h(Landroid/content/Context;)LBZ5;

    move-result-object v3

    invoke-virtual {p0}, Lqx1;->h()Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v3, v4}, LBZ5;->a(Landroid/content/Intent;)LBZ5;

    move-result-object v3

    or-int v4, v0, v1

    invoke-virtual {v3, v2, v4}, LBZ5;->j(II)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v4, "{\n      TaskStackBuilder\u2026r mutabilityFlag)!!\n    }"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p0}, Lqx1;->h()Landroid/content/Intent;

    move-result-object v4

    or-int/2addr v0, v1

    invoke-static {v3, v2, v4, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    const-string v0, "{\n      PendingIntent.ge\u2026abilityFlag\n      )\n    }"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    new-instance v0, Lac3$e;

    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lqx1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lac3$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    new-instance v0, Lac3$e;

    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lac3$e;-><init>(Landroid/content/Context;)V

    :goto_2
    invoke-virtual {v0, v3}, Lac3$e;->k(Landroid/app/PendingIntent;)Lac3$e;

    move-result-object v0

    const-string v1, "if (Build.VERSION.SDK_IN\u2026tentIntent(contentIntent)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Lqx1;->f:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Lqx1;->f()Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Lac3$e;->m(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object v0

    invoke-virtual {p0}, Lqx1;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lac3$e;->l(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lac3$e;->B(I)Lac3$e;

    move-result-object p1

    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->black:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lac3$e;->j(I)Lac3$e;

    move-result-object p1

    invoke-virtual {p0}, Lqx1;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lac3$e;->x(I)Lac3$e;

    move-result-object p1

    const-string v0, "builder\n      .setConten\u2026   .setPriority(priority)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lac3$e;->c()Landroid/app/Notification;

    move-result-object p1

    const-string v0, "builder.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    invoke-static {}, Lia3;->a()V

    invoke-virtual {p0}, Lqx1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lqx1;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lha3;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v1

    invoke-virtual {p0}, Lqx1;->g()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->notification_bird_running_in_background_channel_description:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lxb3;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lda3;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_0
    invoke-virtual {p0}, Lqx1;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqx1;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqx1;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqx1;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public abstract g()Landroid/content/Context;
.end method

.method public h()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lqx1;->e:Landroid/content/Intent;

    return-object v0
.end method

.method public abstract i()I
.end method

.method public abstract j()I
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lqx1;->d:I

    return v0
.end method

.method public abstract l()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public final m(I)Landroid/app/Notification;
    .locals 0

    invoke-virtual {p0, p1}, Lqx1;->a(I)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/uber/autodispose/ScopeProvider;Z)V
    .locals 1

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lqx1;->f:Z

    return-void
.end method
