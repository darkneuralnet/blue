.class public LIZ1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 2

    const-class v0, LIZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, LIZ1;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static b()V
    .locals 3

    const-class v0, LIZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, LJZ1;->v:Ljava/util/Map;

    sget-object v2, LJZ1;->w:Ljava/util/Map;

    invoke-static {v1, v2}, LLZ1;->e(Ljava/util/Map;Ljava/util/Map;)V

    invoke-interface {v1}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    const-class v0, LIZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "com.android.billingclient.api.Purchase"

    invoke-static {v1}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {p0}, LJZ1;->j(Landroid/content/Context;)LJZ1;

    move-result-object p0

    if-nez p0, :cond_2

    return-void

    :cond_2
    sget-object v1, LJZ1;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LLZ1;->d()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "inapp"

    if-eqz v1, :cond_3

    :try_start_1
    new-instance v1, LIZ1$a;

    invoke-direct {v1}, LIZ1$a;-><init>()V

    invoke-virtual {p0, v2, v1}, LJZ1;->l(Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_3
    new-instance v1, LIZ1$b;

    invoke-direct {v1}, LIZ1$b;-><init>()V

    invoke-virtual {p0, v2, v1}, LJZ1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :goto_0
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
