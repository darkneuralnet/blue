.class public final LGC8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public final synthetic b:LRC8;


# direct methods
.method public constructor <init>(LRC8;)V
    .locals 0

    iput-object p1, p0, LGC8;->b:LRC8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "onActivityCreated"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    :goto_0
    invoke-virtual {v0}, LPn8;->K()LnG8;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LnG8;->v(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, LWc9;->b()Z

    iget-object v1, p0, LGC8;->b:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    move-result-object v1

    sget-object v2, La98;->H0:LL88;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    :cond_1
    :goto_1
    move-object v4, v3

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/net/Uri;->isHierarchical()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    move-object v4, v1

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "com.android.vending.referral_url"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_1

    :goto_3
    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/net/Uri;->isHierarchical()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_7

    :cond_5
    iget-object v1, p0, LGC8;->b:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->N()LOW8;

    const-string v1, "android.intent.extra.REFERRER_NAME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "android-app://com.google.android.googlequicksearchbox/https/www.google.com"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "https://www.google.com"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "android-app://com.google.appcrawler"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    const-string v0, "auto"

    goto :goto_5

    :cond_7
    :goto_4
    const-string v0, "gs"

    :goto_5
    move-object v5, v0

    const-string v0, "referrer"

    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez p2, :cond_8

    const/4 v0, 0x1

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    move v3, v0

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v7, LvC8;

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, LvC8;-><init>(LGC8;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ldn8;->w(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    goto/16 :goto_0

    :cond_9
    :goto_7
    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_8

    :catch_0
    move-exception v0

    :try_start_2
    iget-object v1, p0, LGC8;->b:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Throwable caught in onActivityCreated"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    goto/16 :goto_0

    :goto_8
    iget-object v1, p0, LGC8;->b:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->K()LnG8;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, LnG8;->v(Landroid/app/Activity;Landroid/os/Bundle;)V

    throw v0
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->K()LnG8;

    move-result-object v0

    invoke-virtual {v0, p1}, LnG8;->w(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 4

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->K()LnG8;

    move-result-object v0

    invoke-virtual {v0, p1}, LnG8;->x(Landroid/app/Activity;)V

    iget-object p1, p0, LGC8;->b:LRC8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->M()LcR8;

    move-result-object p1

    iget-object v0, p1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->c()Ldn8;

    move-result-object v2

    new-instance v3, LvP8;

    invoke-direct {v3, p1, v0, v1}, LvP8;-><init>(LcR8;J)V

    invoke-virtual {v2, v3}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->M()LcR8;

    move-result-object v0

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    iget-object v3, v0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->c()Ldn8;

    move-result-object v3

    new-instance v4, LtP8;

    invoke-direct {v4, v0, v1, v2}, LtP8;-><init>(LcR8;J)V

    invoke-virtual {v3, v4}, Ldn8;->w(Ljava/lang/Runnable;)V

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->K()LnG8;

    move-result-object v0

    invoke-virtual {v0, p1}, LnG8;->y(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->K()LnG8;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LnG8;->B(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
