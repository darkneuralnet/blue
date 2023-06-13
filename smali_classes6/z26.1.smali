.class public Lz26;
.super LLE2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LLE2<",
        "Lp06;",
        "Lg32;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:LAZ5;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static i:Z = true

.field public static final j:LsY1;


# instance fields
.field public final d:LKT8;

.field public final e:Lmm9;

.field public final f:Lym9;

.field public final g:Lx26;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v0

    sput-object v0, Lz26;->j:LsY1;

    new-instance v0, LAZ5;

    invoke-direct {v0}, LAZ5;-><init>()V

    sput-object v0, Lz26;->h:LAZ5;

    return-void
.end method

.method public constructor <init>(Lmm9;LKT8;Lx26;)V
    .locals 1

    sget-object v0, Lz26;->h:LAZ5;

    invoke-direct {p0, v0}, LLE2;-><init>(LAZ5;)V

    iput-object p1, p0, Lz26;->e:Lmm9;

    iput-object p2, p0, Lz26;->d:LKT8;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object p1

    invoke-virtual {p1}, LyU2;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lym9;->a(Landroid/content/Context;)Lym9;

    move-result-object p1

    iput-object p1, p0, Lz26;->f:Lym9;

    iput-object p3, p0, Lz26;->g:Lx26;

    return-void
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz26;->d:LKT8;

    invoke-interface {v0}, LKT8;->zzb()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lz26;->i:Z

    iget-object v0, p0, Lz26;->d:LKT8;

    invoke-interface {v0}, LKT8;->zzc()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final bridge synthetic i(LNE2;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    check-cast p1, Lg32;

    invoke-virtual {p0, p1}, Lz26;->l(Lg32;)Lp06;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic j(JLV39;Lg32;)Lxk9;
    .locals 2

    new-instance v0, Lre9;

    invoke-direct {v0}, Lre9;-><init>()V

    new-instance v1, Lb29;

    invoke-direct {v1}, Lb29;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Lb29;->c(Ljava/lang/Long;)Lb29;

    invoke-virtual {v1, p3}, Lb29;->d(LV39;)Lb29;

    sget-boolean p1, Lz26;->i:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lb29;->e(Ljava/lang/Boolean;)Lb29;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Lb29;->a(Ljava/lang/Boolean;)Lb29;

    invoke-virtual {v1, p1}, Lb29;->b(Ljava/lang/Boolean;)Lb29;

    invoke-virtual {v1}, Lb29;->f()Lv29;

    move-result-object p1

    invoke-virtual {v0, p1}, Lre9;->d(Lv29;)Lre9;

    sget-object p1, Lz26;->j:LsY1;

    invoke-virtual {p1, p4}, LsY1;->c(Lg32;)I

    move-result p2

    invoke-virtual {p1, p4}, LsY1;->d(Lg32;)I

    move-result p1

    new-instance p3, LL09;

    invoke-direct {p3}, LL09;-><init>()V

    const/4 p4, -0x1

    if-eq p2, p4, :cond_4

    const/16 p4, 0x23

    if-eq p2, p4, :cond_3

    const p4, 0x32315659

    if-eq p2, p4, :cond_2

    const/16 p4, 0x10

    if-eq p2, p4, :cond_1

    const/16 p4, 0x11

    if-eq p2, p4, :cond_0

    sget-object p2, LV09;->c:LV09;

    goto :goto_0

    :cond_0
    sget-object p2, LV09;->e:LV09;

    goto :goto_0

    :cond_1
    sget-object p2, LV09;->d:LV09;

    goto :goto_0

    :cond_2
    sget-object p2, LV09;->f:LV09;

    goto :goto_0

    :cond_3
    sget-object p2, LV09;->g:LV09;

    goto :goto_0

    :cond_4
    sget-object p2, LV09;->i:LV09;

    :goto_0
    invoke-virtual {p3, p2}, LL09;->a(LV09;)LL09;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, LL09;->b(Ljava/lang/Integer;)LL09;

    invoke-virtual {p3}, LL09;->d()Lo19;

    move-result-object p1

    invoke-virtual {v0, p1}, Lre9;->c(Lo19;)Lre9;

    new-instance p1, LMe9;

    invoke-direct {p1}, LMe9;-><init>()V

    iget-object p2, p0, Lz26;->g:Lx26;

    invoke-interface {p2}, Lx26;->f()I

    move-result p2

    invoke-static {p2}, LXx2;->a(I)LTe9;

    move-result-object p2

    invoke-virtual {p1, p2}, LMe9;->a(LTe9;)LMe9;

    invoke-virtual {p1}, LMe9;->c()Ljf9;

    move-result-object p1

    invoke-virtual {v0, p1}, Lre9;->e(Ljf9;)Lre9;

    invoke-virtual {v0}, Lre9;->f()LFe9;

    move-result-object p1

    new-instance p2, Lm49;

    invoke-direct {p2}, Lm49;-><init>()V

    iget-object p3, p0, Lz26;->g:Lx26;

    invoke-interface {p3}, Lx26;->d()Z

    move-result p3

    if-eqz p3, :cond_5

    sget-object p3, LM39;->e:LM39;

    goto :goto_1

    :cond_5
    sget-object p3, LM39;->d:LM39;

    :goto_1
    invoke-virtual {p2, p3}, Lm49;->e(LM39;)Lm49;

    invoke-virtual {p2, p1}, Lm49;->h(LFe9;)Lm49;

    invoke-static {p2}, LDm9;->d(Lm49;)Lxk9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic k(Lob8;ILa09;)Lxk9;
    .locals 2

    new-instance v0, Lm49;

    invoke-direct {v0}, Lm49;-><init>()V

    iget-object v1, p0, Lz26;->g:Lx26;

    invoke-interface {v1}, Lx26;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LM39;->e:LM39;

    goto :goto_0

    :cond_0
    sget-object v1, LM39;->d:LM39;

    :goto_0
    invoke-virtual {v0, v1}, Lm49;->e(LM39;)Lm49;

    new-instance v1, Lxa8;

    invoke-direct {v1}, Lxa8;-><init>()V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lxa8;->a(Ljava/lang/Integer;)Lxa8;

    invoke-virtual {v1, p1}, Lxa8;->c(Lob8;)Lxa8;

    invoke-virtual {v1, p3}, Lxa8;->b(La09;)Lxa8;

    invoke-virtual {v1}, Lxa8;->e()LQb8;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm49;->d(LQb8;)Lm49;

    invoke-static {v0}, LDm9;->d(Lm49;)Lxk9;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized l(Lg32;)Lp06;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lz26;->d:LKT8;

    invoke-interface {v2, p1}, LKT8;->a(Lg32;)Lp06;

    move-result-object v2

    sget-object v3, LV39;->c:LV39;

    invoke-virtual {p0, v3, v0, v1, p1}, Lz26;->m(LV39;JLg32;)V

    const/4 v3, 0x0

    sput-boolean v3, Lz26;->i:Z
    :try_end_1
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v2

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v2}, Lcom/google/mlkit/common/MlKitException;->a()I

    move-result v3

    const/16 v4, 0xe

    if-ne v3, v4, :cond_0

    sget-object v3, LV39;->m:LV39;

    goto :goto_0

    :cond_0
    sget-object v3, LV39;->r0:LV39;

    :goto_0
    invoke-virtual {p0, v3, v0, v1, p1}, Lz26;->m(LV39;JLg32;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final m(LV39;JLg32;)V
    .locals 23

    move-object/from16 v6, p0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v14, v0, p2

    new-instance v7, Lv99;

    move-object v0, v7

    move-object/from16 v1, p0

    move-wide v2, v14

    move-object/from16 v4, p1

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Lv99;-><init>(Lz26;JLV39;Lg32;)V

    iget-object v0, v6, Lz26;->e:Lmm9;

    sget-object v1, Le49;->h:Le49;

    invoke-virtual {v0, v7, v1}, Lmm9;->f(Lgm9;Le49;)V

    new-instance v0, LYa8;

    invoke-direct {v0}, LYa8;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, LYa8;->a(LV39;)LYa8;

    sget-boolean v2, Lz26;->i:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, LYa8;->b(Ljava/lang/Boolean;)LYa8;

    new-instance v2, LMe9;

    invoke-direct {v2}, LMe9;-><init>()V

    iget-object v3, v6, Lz26;->g:Lx26;

    invoke-interface {v3}, Lx26;->f()I

    move-result v3

    invoke-static {v3}, LXx2;->a(I)LTe9;

    move-result-object v3

    invoke-virtual {v2, v3}, LMe9;->a(LTe9;)LMe9;

    invoke-virtual {v2}, LMe9;->c()Ljf9;

    move-result-object v2

    invoke-virtual {v0, v2}, LYa8;->c(Ljf9;)LYa8;

    invoke-virtual {v0}, LYa8;->d()Lob8;

    move-result-object v10

    new-instance v13, Lvd9;

    invoke-direct {v13, v6}, Lvd9;-><init>(Lz26;)V

    iget-object v8, v6, Lz26;->e:Lmm9;

    sget-object v9, Le49;->E1:Le49;

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v2, LUl9;

    move-object v7, v2

    move-wide v11, v14

    invoke-direct/range {v7 .. v13}, LUl9;-><init>(Lmm9;Le49;Ljava/lang/Object;JLvd9;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v21

    iget-object v0, v6, Lz26;->f:Lym9;

    iget-object v2, v6, Lz26;->g:Lx26;

    invoke-interface {v2}, Lx26;->h()I

    move-result v17

    sub-long v19, v21, v14

    invoke-virtual/range {p1 .. p1}, LV39;->zza()I

    move-result v18

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v22}, Lym9;->c(IIJJ)V

    return-void
.end method
