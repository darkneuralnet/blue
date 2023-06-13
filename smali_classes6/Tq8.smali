.class public final LTq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LTq8;->d:Lcs8;

    iput-object p2, p0, LTq8;->b:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p3, p0, LTq8;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "_r"

    iget-object v2, v1, LTq8;->d:Lcs8;

    invoke-static {v2}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v2

    invoke-virtual {v2}, LhV8;->b()V

    iget-object v2, v1, LTq8;->d:Lcs8;

    invoke-static {v2}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v2

    invoke-virtual {v2}, LhV8;->d0()LYD8;

    move-result-object v2

    iget-object v3, v1, LTq8;->b:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v13, v1, LTq8;->c:Ljava/lang/String;

    invoke-virtual {v2}, Lns8;->e()V

    invoke-static {}, LPn8;->q()V

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v4, v2, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->w()Lgl7;

    move-result-object v4

    sget-object v5, La98;->W:LL88;

    invoke-virtual {v4, v13, v5}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v2, "Generating ScionPayload disabled. packageName"

    invoke-virtual {v0, v2, v13}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v5, [B

    goto/16 :goto_a

    :cond_0
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const-string v6, "_iap"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v14, 0x0

    if-nez v4, :cond_1

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const-string v6, "_iapx"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const-string v3, "Generating a payload for this event is not available. package_name, event_name"

    invoke-virtual {v0, v3, v13, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v14

    goto/16 :goto_a

    :cond_1
    invoke-static {}, Lfn8;->B()LSm8;

    move-result-object v6

    iget-object v4, v2, LIR8;->b:LhV8;

    invoke-virtual {v4}, LhV8;->W()Ltq7;

    move-result-object v4

    invoke-virtual {v4}, Ltq7;->e0()V

    :try_start_0
    iget-object v4, v2, LIR8;->b:LhV8;

    invoke-virtual {v4}, LhV8;->W()Ltq7;

    move-result-object v4

    invoke-virtual {v4, v13}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v4

    if-nez v4, :cond_2

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v3, "Log and bundle not available. package_name"

    invoke-virtual {v0, v3, v13}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, v2, LIR8;->b:LhV8;

    :goto_0
    invoke-virtual {v2}, LhV8;->W()Ltq7;

    move-result-object v2

    invoke-virtual {v2}, Ltq7;->f0()V

    goto/16 :goto_a

    :cond_2
    :try_start_1
    invoke-virtual {v4}, Lpt8;->M()Z

    move-result v7

    if-nez v7, :cond_3

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v3, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v3, v13}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v5, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v2, v2, LIR8;->b:LhV8;

    goto :goto_0

    :cond_3
    :try_start_2
    invoke-static {}, LCn8;->S1()Lqn8;

    move-result-object v15

    const/4 v11, 0x1

    invoke-virtual {v15, v11}, Lqn8;->i0(I)Lqn8;

    const-string v7, "android"

    invoke-virtual {v15, v7}, Lqn8;->d0(Ljava/lang/String;)Lqn8;

    invoke-virtual {v4}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-virtual {v4}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Lqn8;->B(Ljava/lang/String;)Lqn8;

    :cond_4
    invoke-virtual {v4}, Lpt8;->k0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v4}, Lpt8;->k0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15, v7}, Lqn8;->D(Ljava/lang/String;)Lqn8;

    :cond_5
    invoke-virtual {v4}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v4}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15, v7}, Lqn8;->G(Ljava/lang/String;)Lqn8;

    :cond_6
    invoke-virtual {v4}, Lpt8;->P()J

    move-result-wide v7

    const-wide/32 v9, -0x80000000

    cmp-long v7, v7, v9

    if-eqz v7, :cond_7

    invoke-virtual {v4}, Lpt8;->P()J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v15, v7}, Lqn8;->H(I)Lqn8;

    :cond_7
    invoke-virtual {v4}, Lpt8;->a0()J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lqn8;->Z(J)Lqn8;

    invoke-virtual {v4}, Lpt8;->Y()J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lqn8;->S(J)Lqn8;

    invoke-virtual {v4}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lpt8;->g0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual {v15, v7}, Lqn8;->Y(Ljava/lang/String;)Lqn8;

    goto :goto_1

    :cond_8
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    invoke-virtual {v15, v8}, Lqn8;->A(Ljava/lang/String;)Lqn8;

    :cond_9
    :goto_1
    invoke-static {}, LYg9;->b()Z

    iget-object v7, v2, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->w()Lgl7;

    move-result-object v7

    sget-object v8, La98;->G0:LL88;

    invoke-virtual {v7, v14, v8}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Lpt8;->e0()J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lqn8;->r0(J)Lqn8;

    :cond_a
    iget-object v7, v2, LIR8;->b:LhV8;

    invoke-virtual {v7, v13}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v7

    invoke-virtual {v4}, Lpt8;->X()J

    move-result-wide v8

    invoke-virtual {v15, v8, v9}, Lqn8;->O(J)Lqn8;

    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->l()Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->w()Lgl7;

    move-result-object v8

    invoke-virtual {v15}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lgl7;->B(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    sget-object v8, Lcm7;->c:Lcm7;

    invoke-virtual {v7, v8}, LXm7;->i(Lcm7;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_b

    invoke-virtual {v15, v14}, Lqn8;->Q(Ljava/lang/String;)Lqn8;

    :cond_b
    invoke-virtual {v7}, LXm7;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8}, Lqn8;->N(Ljava/lang/String;)Lqn8;

    sget-object v8, Lcm7;->c:Lcm7;

    invoke-virtual {v7, v8}, LXm7;->i(Lcm7;)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v4}, Lpt8;->L()Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, v2, LIR8;->b:LhV8;

    invoke-virtual {v8}, LhV8;->e0()LVN8;

    move-result-object v8

    invoke-virtual {v4}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, LVN8;->k(Ljava/lang/String;LXm7;)Landroid/util/Pair;

    move-result-object v8

    invoke-virtual {v4}, Lpt8;->L()Z

    move-result v9

    if-eqz v9, :cond_c

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v9, :cond_c

    :try_start_3
    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, LYD8;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15, v9}, Lqn8;->k0(Ljava/lang/String;)Lqn8;
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v8, :cond_c

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v15, v8}, Lqn8;->b0(Z)Lqn8;

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v3, v2, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->n()Lec8;

    move-result-object v3

    const-string v4, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v5, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v2, v2, LIR8;->b:LhV8;

    goto/16 :goto_0

    :cond_c
    :goto_2
    :try_start_5
    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->x()LJt7;

    move-result-object v8

    invoke-virtual {v8}, LBs8;->h()V

    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v15, v8}, Lqn8;->P(Ljava/lang/String;)Lqn8;

    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->x()LJt7;

    move-result-object v8

    invoke-virtual {v8}, LBs8;->h()V

    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v15, v8}, Lqn8;->c0(Ljava/lang/String;)Lqn8;

    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->x()LJt7;

    move-result-object v8

    invoke-virtual {v8}, LJt7;->m()J

    move-result-wide v8

    long-to-int v8, v8

    invoke-virtual {v15, v8}, Lqn8;->s0(I)Lqn8;

    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->x()LJt7;

    move-result-object v8

    invoke-virtual {v8}, LJt7;->n()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8}, Lqn8;->w0(Ljava/lang/String;)Lqn8;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    sget-object v8, Lcm7;->d:Lcm7;

    invoke-virtual {v7, v8}, LXm7;->i(Lcm7;)Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v4}, Lpt8;->j0()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-virtual {v4}, Lpt8;->j0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LYD8;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Lqn8;->C(Ljava/lang/String;)Lqn8;
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_d
    :try_start_7
    invoke-virtual {v4}, Lpt8;->m0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {v4}, Lpt8;->m0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15, v7}, Lqn8;->X(Ljava/lang/String;)Lqn8;

    :cond_e
    invoke-virtual {v4}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v2, LIR8;->b:LhV8;

    invoke-virtual {v8}, LhV8;->W()Ltq7;

    move-result-object v8

    invoke-virtual {v8, v7}, Ltq7;->c0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LqW8;

    const-string v11, "_lte"

    iget-object v12, v10, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_3

    :cond_10
    move-object v10, v14

    :goto_3
    const-wide/16 v24, 0x0

    if-eqz v10, :cond_11

    iget-object v9, v10, LqW8;->e:Ljava/lang/Object;

    if-nez v9, :cond_12

    :cond_11
    new-instance v9, LqW8;

    const-string v19, "auto"

    const-string v20, "_lte"

    iget-object v10, v2, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v10

    invoke-interface {v10}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v21

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    move-object/from16 v17, v9

    move-object/from16 v18, v7

    invoke-direct/range {v17 .. v23}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v7, v2, LIR8;->b:LhV8;

    invoke-virtual {v7}, LhV8;->W()Ltq7;

    move-result-object v7

    invoke-virtual {v7, v9}, Ltq7;->u(LqW8;)Z

    :cond_12
    iget-object v7, v2, LIR8;->b:LhV8;

    invoke-virtual {v7}, LhV8;->g0()LDV8;

    move-result-object v7

    iget-object v9, v7, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->s()Lec8;

    move-result-object v9

    const-string v10, "Checking account type status for ad personalization signals"

    invoke-virtual {v9, v10}, Lec8;->a(Ljava/lang/String;)V

    iget-object v9, v7, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->x()LJt7;

    move-result-object v9

    invoke-virtual {v9}, LJt7;->p()Z

    move-result v9

    const-wide/16 v10, 0x1

    if-eqz v9, :cond_15

    invoke-virtual {v4}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lpt8;->L()Z

    move-result v12

    if-eqz v12, :cond_15

    iget-object v12, v7, LIR8;->b:LhV8;

    invoke-virtual {v12}, LhV8;->a0()LOk8;

    move-result-object v12

    invoke-virtual {v12, v9}, LOk8;->y(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_15

    iget-object v12, v7, Lns8;->a:LPn8;

    invoke-virtual {v12}, LPn8;->a()LFc8;

    move-result-object v12

    invoke-virtual {v12}, LFc8;->n()Lec8;

    move-result-object v12

    const-string v14, "Turning off ad personalization due to account type"

    invoke-virtual {v12, v14}, Lec8;->a(Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LqW8;

    const-string v5, "_npa"

    iget-object v14, v14, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v12}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    :cond_13
    const/4 v5, 0x0

    goto :goto_4

    :cond_14
    :goto_5
    new-instance v5, LqW8;

    const-string v19, "auto"

    const-string v20, "_npa"

    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v7

    invoke-interface {v7}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v21

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    move-object/from16 v17, v5

    move-object/from16 v18, v9

    invoke-direct/range {v17 .. v23}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [LKp8;

    const/4 v7, 0x0

    :goto_6
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_16

    invoke-static {}, LKp8;->E()Lyp8;

    move-result-object v9

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LqW8;

    iget-object v12, v12, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v9, v12}, Lyp8;->D(Ljava/lang/String;)Lyp8;

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LqW8;

    iget-wide v10, v12, LqW8;->d:J

    invoke-virtual {v9, v10, v11}, Lyp8;->G(J)Lyp8;

    iget-object v10, v2, LIR8;->b:LhV8;

    invoke-virtual {v10}, LhV8;->g0()LDV8;

    move-result-object v10

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LqW8;

    iget-object v11, v11, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v10, v9, v11}, LDV8;->K(Lyp8;Ljava/lang/Object;)V

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v9

    check-cast v9, LKp8;

    aput-object v9, v5, v7

    add-int/lit8 v7, v7, 0x1

    const-wide/16 v10, 0x1

    goto :goto_6

    :cond_16
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v15, v5}, Lqn8;->O0(Ljava/lang/Iterable;)Lqn8;

    invoke-static {v3}, LUc8;->b(Lcom/google/android/gms/measurement/internal/zzaw;)LUc8;

    move-result-object v5

    iget-object v7, v2, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->N()LOW8;

    move-result-object v7

    iget-object v8, v5, LUc8;->d:Landroid/os/Bundle;

    iget-object v9, v2, LIR8;->b:LhV8;

    invoke-virtual {v9}, LhV8;->W()Ltq7;

    move-result-object v9

    invoke-virtual {v9, v13}, Ltq7;->Q(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, LOW8;->w(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v7, v2, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->N()LOW8;

    move-result-object v7

    iget-object v8, v2, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->w()Lgl7;

    move-result-object v8

    invoke-virtual {v8, v13}, Lgl7;->k(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v5, v8}, LOW8;->y(LUc8;I)V

    iget-object v14, v5, LUc8;->d:Landroid/os/Bundle;

    const-string v5, "_c"

    const-wide/16 v7, 0x1

    invoke-virtual {v14, v5, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v5, v2, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->n()Lec8;

    move-result-object v5

    const-string v7, "Marking in-app purchase as real-time"

    invoke-virtual {v5, v7}, Lec8;->a(Ljava/lang/String;)V

    const-wide/16 v7, 0x1

    invoke-virtual {v14, v0, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v5, "_o"

    iget-object v7, v3, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    invoke-virtual {v14, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v2, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->N()LOW8;

    move-result-object v5

    invoke-virtual {v15}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, LOW8;->U(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_17

    iget-object v5, v2, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->N()LOW8;

    move-result-object v5

    const-string v7, "_dbg"

    const-wide/16 v8, 0x1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v14, v7, v8}, LOW8;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v5, v2, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->N()LOW8;

    move-result-object v5

    invoke-virtual {v5, v14, v0, v8}, LOW8;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_17
    iget-object v0, v2, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->W()Ltq7;

    move-result-object v0

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v0, v13, v5}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v0

    if-nez v0, :cond_18

    new-instance v0, Lpv7;

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v17, 0x0

    move-wide/from16 v21, v11

    move-wide/from16 v11, v17

    const-wide/16 v16, 0x0

    move-object/from16 v28, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, v4

    move-object v4, v0

    move-object/from16 v27, v5

    move-object v5, v13

    move-object/from16 v29, v6

    move-object/from16 v6, v27

    move-object/from16 v27, v13

    move-object/from16 v26, v14

    const/4 v1, 0x0

    move-wide/from16 v13, v21

    invoke-direct/range {v4 .. v20}, Lpv7;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-wide/from16 v11, v24

    goto :goto_7

    :cond_18
    move-object/from16 v23, v4

    move-object/from16 v29, v6

    move-object/from16 v27, v13

    move-object/from16 v26, v14

    move-object/from16 v28, v15

    const/4 v1, 0x0

    iget-wide v4, v0, Lpv7;->f:J

    iget-wide v6, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    invoke-virtual {v0, v6, v7}, Lpv7;->c(J)Lpv7;

    move-result-object v0

    move-wide v11, v4

    :goto_7
    iget-object v4, v2, LIR8;->b:LhV8;

    invoke-virtual {v4}, LhV8;->W()Ltq7;

    move-result-object v4

    invoke-virtual {v4, v0}, Ltq7;->n(Lpv7;)V

    new-instance v14, Lxu7;

    iget-object v5, v2, Lns8;->a:LPn8;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    iget-wide v9, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    move-object v4, v14

    move-object/from16 v7, v27

    move-object/from16 v13, v26

    invoke-direct/range {v4 .. v13}, Lxu7;-><init>(LPn8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-static {}, Lpk8;->F()Ldk8;

    move-result-object v4

    iget-wide v5, v14, Lxu7;->d:J

    invoke-virtual {v4, v5, v6}, Ldk8;->O(J)Ldk8;

    iget-object v5, v14, Lxu7;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ldk8;->I(Ljava/lang/String;)Ldk8;

    iget-wide v5, v14, Lxu7;->e:J

    invoke-virtual {v4, v5, v6}, Ldk8;->N(J)Ldk8;

    iget-object v5, v14, Lxu7;->f:Lcom/google/android/gms/measurement/internal/zzau;

    new-instance v6, Lew7;

    invoke-direct {v6, v5}, Lew7;-><init>(Lcom/google/android/gms/measurement/internal/zzau;)V

    :cond_19
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v6}, Lew7;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lpl8;->F()Ldl8;

    move-result-object v7

    invoke-virtual {v7, v5}, Ldl8;->J(Ljava/lang/String;)Ldl8;

    iget-object v8, v14, Lxu7;->f:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v8, v5}, Lcom/google/android/gms/measurement/internal/zzau;->F(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_19

    iget-object v8, v2, LIR8;->b:LhV8;

    invoke-virtual {v8}, LhV8;->g0()LDV8;

    move-result-object v8

    invoke-virtual {v8, v7, v5}, LDV8;->J(Ldl8;Ljava/lang/Object;)V

    invoke-virtual {v4, v7}, Ldk8;->C(Ldl8;)Ldk8;

    goto :goto_8

    :cond_1a
    move-object/from16 v5, v28

    invoke-virtual {v5, v4}, Lqn8;->P0(Ldk8;)Lqn8;

    invoke-static {}, Lpo8;->B()LQn8;

    move-result-object v6

    invoke-static {}, LPk8;->B()LDk8;

    move-result-object v7

    iget-wide v8, v0, Lpv7;->c:J

    invoke-virtual {v7, v8, v9}, LDk8;->y(J)LDk8;

    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v7, v0}, LDk8;->z(Ljava/lang/String;)LDk8;

    invoke-virtual {v6, v7}, LQn8;->y(LDk8;)LQn8;

    invoke-virtual {v5, v6}, Lqn8;->f0(LQn8;)Lqn8;

    iget-object v0, v2, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->T()LFf7;

    move-result-object v6

    invoke-virtual/range {v23 .. v23}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v5}, Lqn8;->C0()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v4}, Ldk8;->A()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v4}, Ldk8;->A()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual/range {v6 .. v11}, LFf7;->j(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lqn8;->J0(Ljava/lang/Iterable;)Lqn8;

    invoke-virtual {v4}, Ldk8;->U()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {v4}, Ldk8;->A()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lqn8;->q0(J)Lqn8;

    invoke-virtual {v4}, Ldk8;->A()J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lqn8;->U(J)Lqn8;

    :cond_1b
    invoke-virtual/range {v23 .. v23}, Lpt8;->b0()J

    move-result-wide v3

    cmp-long v0, v3, v24

    if-eqz v0, :cond_1c

    invoke-virtual {v5, v3, v4}, Lqn8;->g0(J)Lqn8;

    :cond_1c
    invoke-virtual/range {v23 .. v23}, Lpt8;->d0()J

    move-result-wide v6

    cmp-long v8, v6, v24

    if-eqz v8, :cond_1d

    invoke-virtual {v5, v6, v7}, Lqn8;->h0(J)Lqn8;

    goto :goto_9

    :cond_1d
    if-eqz v0, :cond_1e

    invoke-virtual {v5, v3, v4}, Lqn8;->h0(J)Lqn8;

    :cond_1e
    :goto_9
    invoke-virtual/range {v23 .. v23}, Lpt8;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ltk9;->b()Z

    iget-object v3, v2, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->w()Lgl7;

    move-result-object v3

    sget-object v4, La98;->q0:LL88;

    move-object/from16 v6, v27

    invoke-virtual {v3, v6, v4}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v3

    if-eqz v3, :cond_1f

    if-eqz v0, :cond_1f

    invoke-virtual {v5, v0}, Lqn8;->o0(Ljava/lang/String;)Lqn8;

    :cond_1f
    invoke-virtual/range {v23 .. v23}, Lpt8;->f()V

    invoke-virtual/range {v23 .. v23}, Lpt8;->c0()J

    move-result-wide v3

    long-to-int v0, v3

    invoke-virtual {v5, v0}, Lqn8;->I(I)Lqn8;

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->n()J

    const-wide/32 v3, 0x12cc8

    invoke-virtual {v5, v3, v4}, Lqn8;->u0(J)Lqn8;

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lqn8;->t0(J)Lqn8;

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lqn8;->n0(Z)Lqn8;

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    sget-object v3, La98;->u0:LL88;

    invoke-virtual {v0, v1, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, v2, LIR8;->b:LhV8;

    invoke-virtual {v5}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v5}, LhV8;->e(Ljava/lang/String;Lqn8;)V

    :cond_20
    move-object/from16 v0, v29

    invoke-virtual {v0, v5}, LSm8;->y(Lqn8;)LSm8;

    invoke-virtual {v5}, Lqn8;->H0()J

    move-result-wide v3

    move-object/from16 v7, v23

    invoke-virtual {v7, v3, v4}, Lpt8;->D(J)V

    invoke-virtual {v5}, Lqn8;->G0()J

    move-result-wide v3

    invoke-virtual {v7, v3, v4}, Lpt8;->B(J)V

    iget-object v3, v2, LIR8;->b:LhV8;

    invoke-virtual {v3}, LhV8;->W()Ltq7;

    move-result-object v3

    invoke-virtual {v3, v7}, Ltq7;->m(Lpt8;)V

    iget-object v3, v2, LIR8;->b:LhV8;

    invoke-virtual {v3}, LhV8;->W()Ltq7;

    move-result-object v3

    invoke-virtual {v3}, Ltq7;->l()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    iget-object v3, v2, LIR8;->b:LhV8;

    invoke-virtual {v3}, LhV8;->W()Ltq7;

    move-result-object v3

    invoke-virtual {v3}, Ltq7;->f0()V

    :try_start_8
    iget-object v3, v2, LIR8;->b:LhV8;

    invoke-virtual {v3}, LhV8;->g0()LDV8;

    move-result-object v3

    invoke-virtual {v0}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lfn8;

    invoke-virtual {v0}, LQJ8;->c()[B

    move-result-object v0

    invoke-virtual {v3, v0}, LDV8;->O([B)[B

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Data loss. Failed to bundle and serialize. appId"

    invoke-virtual {v2, v4, v3, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_a

    :catch_2
    move-exception v0

    :try_start_9
    iget-object v1, v2, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x0

    new-array v0, v1, [B
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    iget-object v1, v2, LIR8;->b:LhV8;

    invoke-virtual {v1}, LhV8;->W()Ltq7;

    move-result-object v1

    invoke-virtual {v1}, Ltq7;->f0()V

    :goto_a
    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, v2, LIR8;->b:LhV8;

    invoke-virtual {v1}, LhV8;->W()Ltq7;

    move-result-object v1

    invoke-virtual {v1}, Ltq7;->f0()V

    throw v0
.end method
