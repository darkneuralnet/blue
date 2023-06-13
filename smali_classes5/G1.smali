.class public final LG1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG1$b;,
        LG1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 &2\u00020\u0001:\u0002\u0013\u0017B\u0019\u0008\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u00a2\u0006\u0004\u0008*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\r\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0002J\u001c\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0008\u0010\u0010\u001a\u00020\u0004H\u0002J\u0008\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010%\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)\u00a8\u0006,"
    }
    d2 = {
        "LG1;",
        "",
        "",
        "i",
        "",
        "e",
        "f",
        "Lcom/facebook/AccessToken$a;",
        "callback",
        "j",
        "Lcom/facebook/AccessToken;",
        "currentAccessToken",
        "saveToCache",
        "n",
        "oldAccessToken",
        "l",
        "o",
        "p",
        "k",
        "a",
        "Lcom/facebook/AccessToken;",
        "currentAccessTokenField",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "b",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "tokenRefreshInProgress",
        "Ljava/util/Date;",
        "c",
        "Ljava/util/Date;",
        "lastAttemptedTokenExtendDate",
        "LMu2;",
        "d",
        "LMu2;",
        "localBroadcastManager",
        "LF1;",
        "LF1;",
        "accessTokenCache",
        "value",
        "g",
        "()Lcom/facebook/AccessToken;",
        "m",
        "(Lcom/facebook/AccessToken;)V",
        "<init>",
        "(LMu2;LF1;)V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static f:LG1;

.field public static final g:LG1$a;


# instance fields
.field public a:Lcom/facebook/AccessToken;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Ljava/util/Date;

.field public final d:LMu2;

.field public final e:LF1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LG1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LG1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LG1;->g:LG1$a;

    return-void
.end method

.method public constructor <init>(LMu2;LF1;)V
    .locals 2

    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessTokenCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG1;->d:LMu2;

    iput-object p2, p0, LG1;->e:LF1;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, LG1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/Date;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    iput-object p1, p0, LG1;->c:Ljava/util/Date;

    return-void
.end method

.method public static final synthetic a()LG1;
    .locals 1

    sget-object v0, LG1;->f:LG1;

    return-object v0
.end method

.method public static final synthetic b(LG1;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, LG1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic c(LG1;Lcom/facebook/AccessToken$a;)V
    .locals 0

    invoke-virtual {p0, p1}, LG1;->k(Lcom/facebook/AccessToken$a;)V

    return-void
.end method

.method public static final synthetic d(LG1;)V
    .locals 0

    sput-object p0, LG1;->f:LG1;

    return-void
.end method

.method public static final h()LG1;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LG1;->g:LG1$a;

    invoke-virtual {v0}, LG1$a;->e()LG1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final e()V
    .locals 2

    invoke-virtual {p0}, LG1;->g()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-virtual {p0}, LG1;->g()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LG1;->l(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V

    return-void
.end method

.method public final f()V
    .locals 1

    invoke-virtual {p0}, LG1;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LG1;->j(Lcom/facebook/AccessToken$a;)V

    return-void
.end method

.method public final g()Lcom/facebook/AccessToken;
    .locals 1

    iget-object v0, p0, LG1;->a:Lcom/facebook/AccessToken;

    return-object v0
.end method

.method public final i()Z
    .locals 2

    iget-object v0, p0, LG1;->e:LF1;

    invoke-virtual {v0}, LF1;->f()Lcom/facebook/AccessToken;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, v1}, LG1;->n(Lcom/facebook/AccessToken;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final j(Lcom/facebook/AccessToken$a;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LG1;->k(Lcom/facebook/AccessToken$a;)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LG1$c;

    invoke-direct {v1, p0, p1}, LG1$c;-><init>(LG1;Lcom/facebook/AccessToken$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public final k(Lcom/facebook/AccessToken$a;)V
    .locals 12

    invoke-virtual {p0}, LG1;->g()Lcom/facebook/AccessToken;

    move-result-object v3

    if-nez v3, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "No current access token to refresh"

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/facebook/AccessToken$a;->a(Lcom/facebook/FacebookException;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, LG1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Refresh already in progress"

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/facebook/AccessToken$a;->a(Lcom/facebook/FacebookException;)V

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, LG1;->c:Ljava/util/Date;

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v5, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v4, LG1$b;

    invoke-direct {v4}, LG1$b;-><init>()V

    new-instance v9, LVD1;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/GraphRequest;

    sget-object v10, LG1;->g:LG1$a;

    new-instance v11, LG1$e;

    invoke-direct {v11, v5, v6, v7, v8}, LG1$e;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v10, v3, v11}, LG1$a;->b(LG1$a;Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;

    move-result-object v11

    aput-object v11, v0, v1

    new-instance v1, LG1$f;

    invoke-direct {v1, v4}, LG1$f;-><init>(LG1$b;)V

    invoke-static {v10, v3, v1}, LG1$a;->a(LG1$a;Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-direct {v9, v0}, LVD1;-><init>([Lcom/facebook/GraphRequest;)V

    new-instance v10, LG1$d;

    move-object v0, v10

    move-object v1, p0

    move-object v2, v4

    move-object v4, p1

    invoke-direct/range {v0 .. v8}, LG1$d;-><init>(LG1;LG1$b;Lcom/facebook/AccessToken;Lcom/facebook/AccessToken$a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    invoke-virtual {v9, v10}, LVD1;->c(LVD1$a;)V

    invoke-virtual {v9}, LVD1;->j()LUD1;

    return-void
.end method

.method public final l(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, LG1;->d:LMu2;

    invoke-virtual {p1, v0}, LMu2;->d(Landroid/content/Intent;)Z

    return-void
.end method

.method public final m(Lcom/facebook/AccessToken;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LG1;->n(Lcom/facebook/AccessToken;Z)V

    return-void
.end method

.method public final n(Lcom/facebook/AccessToken;Z)V
    .locals 4

    iget-object v0, p0, LG1;->a:Lcom/facebook/AccessToken;

    iput-object p1, p0, LG1;->a:Lcom/facebook/AccessToken;

    iget-object v1, p0, LG1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v1, Ljava/util/Date;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v1, p0, LG1;->c:Ljava/util/Date;

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    iget-object p2, p0, LG1;->e:LF1;

    invoke-virtual {p2, p1}, LF1;->g(Lcom/facebook/AccessToken;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LG1;->e:LF1;

    invoke-virtual {p2}, LF1;->a()V

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object p2

    const-string v1, "FacebookSdk.getApplicationContext()"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lyi6;->f(Landroid/content/Context;)V

    :cond_1
    :goto_0
    invoke-static {v0, p1}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p0, v0, p1}, LG1;->l(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V

    invoke-virtual {p0}, LG1;->o()V

    :cond_2
    return-void
.end method

.method public final o()V
    .locals 5

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/AccessToken;->q:Lcom/facebook/AccessToken$c;

    invoke-virtual {v1}, Lcom/facebook/AccessToken$c;->e()Lcom/facebook/AccessToken;

    move-result-object v2

    const-string v3, "alarm"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/AlarmManager;

    invoke-virtual {v1}, Lcom/facebook/AccessToken$c;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->h()Ljava/util/Date;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-class v4, Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;

    invoke-direct {v1, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    :try_start_0
    invoke-virtual {v2}, Lcom/facebook/AccessToken;->h()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const/4 v4, 0x1

    invoke-virtual {v3, v4, v1, v2, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    return-void
.end method

.method public final p()Z
    .locals 8

    invoke-virtual {p0}, LG1;->g()Lcom/facebook/AccessToken;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->l()LI1;

    move-result-object v4

    invoke-virtual {v4}, LI1;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, LG1;->c:Ljava/util/Date;

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long v4, v2, v4

    const v6, 0x36ee80

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->j()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const v0, 0x5265c00

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method
