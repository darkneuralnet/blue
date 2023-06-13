.class public final Lcom/facebook/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/b;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/b$a;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const-string v0, "auto_event_setup_enabled"

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/b;->a()Lcom/facebook/b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/b$b;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/facebook/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, LNk1;->o(Ljava/lang/String;Z)LMk1;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LMk1;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lvp;->m(Landroid/content/Context;)Lvp;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lvp;->j()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lvp;->j()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_2

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "advertiser_id"

    invoke-virtual {v1}, Lvp;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "fields"

    invoke-virtual {v4, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v3}, Lcom/facebook/GraphRequest;->w(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/facebook/GraphRequest;->D(Z)V

    invoke-virtual {v1, v4}, Lcom/facebook/GraphRequest;->C(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->j()LWD1;

    move-result-object v1

    invoke-virtual {v1}, LWD1;->c()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/facebook/b;->b()Lcom/facebook/b$b;

    move-result-object v3

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v3, Lcom/facebook/b$b;->b:Ljava/lang/Boolean;

    invoke-static {}, Lcom/facebook/b;->b()Lcom/facebook/b$b;

    move-result-object v0

    iget-wide v3, p0, Lcom/facebook/b$a;->b:J

    iput-wide v3, v0, Lcom/facebook/b$b;->d:J

    invoke-static {}, Lcom/facebook/b;->b()Lcom/facebook/b$b;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/b;->c(Lcom/facebook/b$b;)V

    :cond_2
    invoke-static {}, Lcom/facebook/b;->d()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
