.class public final LvC8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:LGC8;


# direct methods
.method public constructor <init>(LGC8;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LvC8;->f:LGC8;

    iput-boolean p2, p0, LvC8;->b:Z

    iput-object p3, p0, LvC8;->c:Landroid/net/Uri;

    iput-object p4, p0, LvC8;->d:Ljava/lang/String;

    iput-object p5, p0, LvC8;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    move-object/from16 v1, p0

    iget-object v2, v1, LvC8;->f:LGC8;

    iget-boolean v0, v1, LvC8;->b:Z

    iget-object v3, v1, LvC8;->c:Landroid/net/Uri;

    iget-object v4, v1, LvC8;->d:Ljava/lang/String;

    iget-object v5, v1, LvC8;->e:Ljava/lang/String;

    iget-object v6, v2, LGC8;->b:LRC8;

    invoke-virtual {v6}, Lns8;->e()V

    :try_start_0
    iget-object v6, v2, LGC8;->b:LRC8;

    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->N()LOW8;

    move-result-object v6

    invoke-static {}, Lcl9;->b()Z

    iget-object v7, v2, LGC8;->b:LRC8;

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->w()Lgl7;

    move-result-object v7

    sget-object v8, La98;->x0:LL88;

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v8}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v7

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v11, "Activity created with data \'referrer\' without required params"

    const-string v12, "utm_medium"

    const-string v13, "_cis"

    const-string v14, "utm_source"

    const-string v15, "utm_campaign"

    const-string v9, "gclid"

    if-eqz v10, :cond_0

    :goto_0
    const/4 v6, 0x0

    goto :goto_3

    :cond_0
    :try_start_1
    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v5, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v5, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "utm_id"

    invoke-virtual {v5, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "dclid"

    invoke-virtual {v5, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "srsltid"

    invoke-virtual {v5, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    if-eqz v7, :cond_2

    const-string v7, "sfmc_id"

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v6, v6, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->n()Lec8;

    move-result-object v6

    invoke-virtual {v6, v11}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    :goto_2
    const-string v10, "https://google.com/search?"

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    invoke-virtual {v6, v10, v7}, LOW8;->v0(Landroid/net/Uri;Z)Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_4

    const-string v7, "referrer"

    invoke-virtual {v6, v13, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_4
    :goto_3
    const-string v7, "_cmp"

    if-eqz v0, :cond_6

    :try_start_2
    iget-object v0, v2, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-static {}, Lcl9;->b()Z

    iget-object v10, v2, LGC8;->b:LRC8;

    iget-object v10, v10, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->w()Lgl7;

    move-result-object v10

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v8}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v8

    invoke-virtual {v0, v3, v8}, LOW8;->v0(Landroid/net/Uri;Z)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v1, "intent"

    invoke-virtual {v0, v13, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    if-eqz v6, :cond_5

    invoke-virtual {v6, v9}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "_cer"

    const-string v3, "gclid=%s"

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    invoke-virtual {v6, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v13, 0x0

    aput-object v8, v10, v13

    invoke-static {v3, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v1, v2, LGC8;->b:LRC8;

    invoke-virtual {v1, v4, v7, v0}, LRC8;->r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v1, v2, LGC8;->b:LRC8;

    iget-object v1, v1, LRC8;->n:LIo9;

    invoke-virtual {v1, v4, v0}, LIo9;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    iget-object v0, v2, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v1, "Activity created with referrer"

    invoke-virtual {v0, v1, v5}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v2, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    sget-object v1, La98;->c0:LL88;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v1, "_ldl"

    const-string v3, "auto"

    if-eqz v0, :cond_9

    if-eqz v6, :cond_8

    :try_start_3
    iget-object v0, v2, LGC8;->b:LRC8;

    invoke-virtual {v0, v4, v7, v6}, LRC8;->r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, v2, LGC8;->b:LRC8;

    iget-object v0, v0, LRC8;->n:LIo9;

    invoke-virtual {v0, v4, v6}, LIo9;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_4

    :cond_8
    iget-object v0, v2, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v4, "Referrer does not contain valid parameters"

    invoke-virtual {v0, v4, v5}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_4
    iget-object v0, v2, LGC8;->b:LRC8;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v1, v5, v4}, LRC8;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void

    :cond_9
    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v5, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v5, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "utm_term"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "utm_content"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_a
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, v2, LGC8;->b:LRC8;

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v5, v4}, LRC8;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_b
    :goto_5
    return-void

    :cond_c
    iget-object v0, v2, LGC8;->b:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    invoke-virtual {v0, v11}, Lec8;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v2, LGC8;->b:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
