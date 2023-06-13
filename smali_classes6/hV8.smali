.class public final LhV8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQs8;


# static fields
.field public static volatile F:LhV8;


# instance fields
.field public final A:Ljava/util/Map;

.field public final B:Ljava/util/Map;

.field public C:LwE8;

.field public D:Ljava/lang/String;

.field public final E:LDW8;

.field public final a:LOk8;

.field public final b:Lbf8;

.field public c:Ltq7;

.field public d:LEf8;

.field public e:LGR8;

.field public f:LFf7;

.field public final g:LDV8;

.field public h:LYD8;

.field public i:LVN8;

.field public final j:LxS8;

.field public k:Lxi8;

.field public final l:LPn8;

.field public m:Z

.field public n:Z

.field public o:J
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public p:Ljava/util/List;

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Ljava/nio/channels/FileLock;

.field public w:Ljava/nio/channels/FileChannel;

.field public x:Ljava/util/List;

.field public y:Ljava/util/List;

.field public z:J


# direct methods
.method public constructor <init>(LsV8;LPn8;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-boolean p2, p0, LhV8;->m:Z

    new-instance p2, LfU8;

    invoke-direct {p2, p0}, LfU8;-><init>(LhV8;)V

    iput-object p2, p0, LhV8;->E:LDW8;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, LsV8;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object p2

    iput-object p2, p0, LhV8;->l:LPn8;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LhV8;->z:J

    new-instance p2, LxS8;

    invoke-direct {p2, p0}, LxS8;-><init>(LhV8;)V

    iput-object p2, p0, LhV8;->j:LxS8;

    new-instance p2, LDV8;

    invoke-direct {p2, p0}, LDV8;-><init>(LhV8;)V

    invoke-virtual {p2}, LTR8;->g()V

    iput-object p2, p0, LhV8;->g:LDV8;

    new-instance p2, Lbf8;

    invoke-direct {p2, p0}, Lbf8;-><init>(LhV8;)V

    invoke-virtual {p2}, LTR8;->g()V

    iput-object p2, p0, LhV8;->b:Lbf8;

    new-instance p2, LOk8;

    invoke-direct {p2, p0}, LOk8;-><init>(LhV8;)V

    invoke-virtual {p2}, LTR8;->g()V

    iput-object p2, p0, LhV8;->a:LOk8;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LhV8;->A:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LhV8;->B:Ljava/util/Map;

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object p2

    new-instance v0, LzS8;

    invoke-direct {v0, p0, p1}, LzS8;-><init>(LhV8;LsV8;)V

    invoke-virtual {p2, v0}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final G(Ldk8;ILjava/lang/String;)V
    .locals 4
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Ldk8;->S()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const-string v3, "_err"

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl8;

    invoke-virtual {v2}, Lpl8;->H()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lpl8;->F()Ldl8;

    move-result-object v0

    invoke-virtual {v0, v3}, Ldl8;->J(Ljava/lang/String;)Ldl8;

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ldl8;->I(J)Ldl8;

    invoke-virtual {v0}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, Lpl8;

    invoke-static {}, Lpl8;->F()Ldl8;

    move-result-object v0

    const-string v1, "_ev"

    invoke-virtual {v0, v1}, Ldl8;->J(Ljava/lang/String;)Ldl8;

    invoke-virtual {v0, p2}, Ldl8;->M(Ljava/lang/String;)Ldl8;

    invoke-virtual {v0}, LUS8;->q()LpU8;

    move-result-object p2

    check-cast p2, Lpl8;

    invoke-virtual {p0, p1}, Ldk8;->D(Lpl8;)Ldk8;

    invoke-virtual {p0, p2}, Ldk8;->D(Lpl8;)Ldk8;

    return-void
.end method

.method public static final H(Ldk8;Ljava/lang/String;)V
    .locals 3
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Ldk8;->S()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl8;

    invoke-virtual {v2}, Lpl8;->H()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ldk8;->H(I)Ldk8;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final Q(Lcom/google/android/gms/measurement/internal/zzq;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzq;->r:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final R(LTR8;)LTR8;
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LTR8;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Upload Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic b0(LhV8;)LPn8;
    .locals 0

    iget-object p0, p0, LhV8;->l:LPn8;

    return-object p0
.end method

.method public static f0(Landroid/content/Context;)LhV8;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LhV8;->F:LhV8;

    if-nez v0, :cond_1

    const-class v0, LhV8;

    monitor-enter v0

    :try_start_0
    sget-object v1, LhV8;->F:LhV8;

    if-nez v1, :cond_0

    new-instance v1, LsV8;

    invoke-direct {v1, p0}, LsV8;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LsV8;

    new-instance v1, LhV8;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LhV8;-><init>(LsV8;LPn8;)V

    sput-object v1, LhV8;->F:LhV8;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, LhV8;->F:LhV8;

    return-object p0
.end method

.method public static bridge synthetic k0(LhV8;LsV8;)V
    .locals 3

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object p1

    invoke-virtual {p1}, Lns8;->e()V

    new-instance p1, Lxi8;

    invoke-direct {p1, p0}, Lxi8;-><init>(LhV8;)V

    iput-object p1, p0, LhV8;->k:Lxi8;

    new-instance p1, Ltq7;

    invoke-direct {p1, p0}, Ltq7;-><init>(LhV8;)V

    invoke-virtual {p1}, LTR8;->g()V

    iput-object p1, p0, LhV8;->c:Ltq7;

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object p1

    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkk7;

    invoke-virtual {p1, v0}, Lgl7;->w(Lkk7;)V

    new-instance p1, LVN8;

    invoke-direct {p1, p0}, LVN8;-><init>(LhV8;)V

    invoke-virtual {p1}, LTR8;->g()V

    iput-object p1, p0, LhV8;->i:LVN8;

    new-instance p1, LFf7;

    invoke-direct {p1, p0}, LFf7;-><init>(LhV8;)V

    invoke-virtual {p1}, LTR8;->g()V

    iput-object p1, p0, LhV8;->f:LFf7;

    new-instance p1, LYD8;

    invoke-direct {p1, p0}, LYD8;-><init>(LhV8;)V

    invoke-virtual {p1}, LTR8;->g()V

    iput-object p1, p0, LhV8;->h:LYD8;

    new-instance p1, LGR8;

    invoke-direct {p1, p0}, LGR8;-><init>(LhV8;)V

    invoke-virtual {p1}, LTR8;->g()V

    iput-object p1, p0, LhV8;->e:LGR8;

    new-instance p1, LEf8;

    invoke-direct {p1, p0}, LEf8;-><init>(LhV8;)V

    iput-object p1, p0, LhV8;->d:LEf8;

    iget p1, p0, LhV8;->q:I

    iget v0, p0, LhV8;->r:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    iget v0, p0, LhV8;->q:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, LhV8;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all upload components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, LhV8;->m:Z

    return-void
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method public final B()V
    .locals 22

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    const/4 v2, 0x1

    iput-boolean v2, v1, LhV8;->u:Z

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, v1, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, v1, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->L()LQM8;

    move-result-object v0

    invoke-virtual {v0}, LQM8;->J()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v2, "Upload data called on the client side before use of service was decided"

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    iput-boolean v3, v1, LhV8;->u:Z

    :goto_0
    invoke-virtual/range {p0 .. p0}, LhV8;->K()V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v2, "Upload called in the client side when service should be used"

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    iput-boolean v3, v1, LhV8;->u:Z

    goto :goto_0

    :cond_1
    :try_start_2
    iget-wide v4, v1, LhV8;->o:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, LhV8;->M()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    iput-boolean v3, v1, LhV8;->u:Z

    goto :goto_0

    :cond_2
    :try_start_3
    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, v1, LhV8;->x:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v2, "Uploading requested multiple times"

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    iput-boolean v3, v1, LhV8;->u:Z

    goto :goto_0

    :cond_3
    :try_start_4
    iget-object v0, v1, LhV8;->b:Lbf8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Lbf8;->j()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v2, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->M()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_9

    iput-boolean v3, v1, LhV8;->u:Z

    goto :goto_0

    :cond_4
    :try_start_5
    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v0

    sget-object v8, La98;->T:LL88;

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v8}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    invoke-static {}, Lgl7;->I()J

    move-result-wide v10

    sub-long v10, v4, v10

    move v8, v3

    :goto_1
    if-ge v8, v0, :cond_5

    invoke-virtual {v1, v9, v10, v11}, LhV8;->N(Ljava/lang/String;J)Z

    move-result v12

    if-eqz v12, :cond_5

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    iget-object v0, v1, LhV8;->i:LVN8;

    iget-object v0, v0, LVN8;->g:Lzg8;

    invoke-virtual {v0}, Lzg8;->a()J

    move-result-wide v10

    cmp-long v0, v10, v6

    if-eqz v0, :cond_6

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v6, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v7, v4, v10

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->Z()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-wide/16 v7, -0x1

    if-nez v0, :cond_24

    iget-wide v10, v1, LhV8;->z:J

    cmp-long v0, v10, v7

    if-nez v0, :cond_a

    iget-object v10, v1, LhV8;->c:Ltq7;

    invoke-static {v10}, LhV8;->R(LTR8;)LTR8;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    :try_start_6
    invoke-virtual {v10}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v11, "select rowid from raw_events order by rowid desc limit 1;"

    invoke-virtual {v0, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-nez v0, :cond_7

    :goto_2
    :try_start_8
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    goto :goto_4

    :cond_7
    :try_start_9
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v11, v9

    :goto_3
    :try_start_a
    iget-object v10, v10, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->a()LFc8;

    move-result-object v10

    invoke-virtual {v10}, LFc8;->o()Lec8;

    move-result-object v10

    const-string v12, "Error querying raw events"

    invoke-virtual {v10, v12, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-eqz v11, :cond_8

    goto :goto_2

    :cond_8
    :goto_4
    :try_start_b
    iput-wide v7, v1, LhV8;->z:J

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v9, v11

    :goto_5
    if-eqz v9, :cond_9

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_9
    throw v0

    :cond_a
    :goto_6
    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v0

    sget-object v7, La98;->i:LL88;

    invoke-virtual {v0, v6, v7}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v7

    sget-object v8, La98;->j:LL88;

    invoke-virtual {v7, v6, v8}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v8, v1, LhV8;->c:Ltq7;

    invoke-static {v8}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v8}, Lns8;->e()V

    invoke-virtual {v8}, LTR8;->f()V

    if-lez v0, :cond_b

    move v10, v2

    goto :goto_7

    :cond_b
    move v10, v3

    :goto_7
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    if-lez v7, :cond_c

    move v10, v2

    goto :goto_8

    :cond_c
    move v10, v3

    :goto_8
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    :try_start_c
    invoke-virtual {v8}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    const-string v12, "queue"

    const-string v13, "rowid"

    const-string v14, "data"

    const-string v15, "retry_count"

    filled-new-array {v13, v14, v15}, [Ljava/lang/String;

    move-result-object v13

    const-string v14, "app_id=?"

    new-array v15, v2, [Ljava/lang/String;

    aput-object v6, v15, v3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "rowid"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v11 .. v19}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :try_start_d
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :try_start_e
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    move-wide/from16 v20, v4

    goto/16 :goto_10

    :cond_d
    :try_start_f
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move v13, v3

    :goto_9
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    :try_start_10
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    iget-object v9, v8, LIR8;->b:LhV8;

    iget-object v9, v9, LhV8;->g:LDV8;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :try_start_11
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v10, 0x400

    new-array v10, v10, [B
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    move-wide/from16 v20, v4

    :goto_a
    :try_start_12
    invoke-virtual {v0, v10}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-gtz v4, :cond_10

    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    :try_start_13
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    array-length v2, v0
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_7
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    add-int/2addr v2, v13

    if-le v2, v7, :cond_e

    goto/16 :goto_e

    :cond_e
    :try_start_14
    invoke-static {}, LCn8;->S1()Lqn8;

    move-result-object v2

    invoke-static {v2, v0}, LDV8;->B(Lh19;[B)Lh19;

    move-result-object v2

    check-cast v2, Lqn8;
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    const/4 v3, 0x2

    :try_start_15
    invoke-interface {v11, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-interface {v11, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lqn8;->l0(I)Lqn8;

    :cond_f
    array-length v0, v0

    add-int/2addr v13, v0

    invoke-virtual {v2}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, LCn8;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :catch_2
    move-exception v0

    iget-object v2, v8, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to merge queued bundle. appId"

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    goto :goto_d

    :cond_10
    const/4 v5, 0x0

    :try_start_16
    invoke-virtual {v3, v10, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    goto :goto_a

    :catch_3
    move-exception v0

    goto :goto_b

    :catch_4
    move-exception v0

    move-wide/from16 v20, v4

    :goto_b
    :try_start_17
    iget-object v2, v9, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to ungzip content"

    invoke-virtual {v2, v3, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    :catch_5
    move-exception v0

    goto :goto_c

    :catch_6
    move-exception v0

    move-wide/from16 v20, v4

    :goto_c
    :try_start_18
    iget-object v2, v8, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to unzip queued bundle. appId"

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_d
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_5

    if-eqz v0, :cond_12

    if-le v13, v7, :cond_11

    goto :goto_e

    :cond_11
    move-wide/from16 v4, v20

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v9, 0x0

    goto/16 :goto_9

    :cond_12
    :goto_e
    :try_start_19
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    move-object v0, v12

    goto :goto_10

    :catch_7
    move-exception v0

    goto :goto_f

    :catch_8
    move-exception v0

    move-wide/from16 v20, v4

    goto :goto_f

    :catchall_2
    move-exception v0

    const/4 v9, 0x0

    goto/16 :goto_19

    :catch_9
    move-exception v0

    move-wide/from16 v20, v4

    const/4 v11, 0x0

    :goto_f
    :try_start_1a
    iget-object v2, v8, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Error querying bundles. appId"

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    if-eqz v11, :cond_13

    :try_start_1b
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_13
    :goto_10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_27

    invoke-virtual {v1, v6}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v2

    sget-object v3, Lcm7;->c:Lcm7;

    invoke-virtual {v2, v3}, LXm7;->i(Lcm7;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, LCn8;

    invoke-virtual {v3}, LCn8;->M()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_14

    invoke-virtual {v3}, LCn8;->M()Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :cond_15
    const/4 v2, 0x0

    :goto_11
    if-eqz v2, :cond_18

    const/4 v3, 0x0

    :goto_12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_18

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, LCn8;

    invoke-virtual {v4}, LCn8;->M()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_16

    goto :goto_13

    :cond_16
    invoke-virtual {v4}, LCn8;->M()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    if-nez v4, :cond_17

    const/4 v4, 0x0

    :try_start_1c
    invoke-interface {v0, v4, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    goto :goto_14

    :catchall_3
    move-exception v0

    move v2, v4

    goto/16 :goto_20

    :cond_17
    :goto_13
    add-int/lit8 v3, v3, 0x1

    goto :goto_12

    :cond_18
    :goto_14
    :try_start_1d
    invoke-static {}, Lfn8;->B()LSm8;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v5

    invoke-virtual {v5, v6}, Lgl7;->B(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-virtual {v1, v6}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v5

    sget-object v7, Lcm7;->c:Lcm7;

    invoke-virtual {v5, v7}, LXm7;->i(Lcm7;)Z

    move-result v5

    if-eqz v5, :cond_19

    const/4 v5, 0x1

    goto :goto_15

    :cond_19
    const/4 v5, 0x0

    :goto_15
    invoke-virtual {v1, v6}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v7

    sget-object v8, Lcm7;->c:Lcm7;

    invoke-virtual {v7, v8}, LXm7;->i(Lcm7;)Z

    move-result v7

    invoke-virtual {v1, v6}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v8

    sget-object v9, Lcm7;->d:Lcm7;

    invoke-virtual {v8, v9}, LXm7;->i(Lcm7;)Z

    move-result v8

    invoke-static {}, Ltk9;->b()Z

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v9

    sget-object v10, La98;->q0:LL88;

    invoke-virtual {v9, v6, v10}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v9

    const/4 v10, 0x0

    :goto_16
    if-ge v10, v3, :cond_1f

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Pair;

    iget-object v11, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, LCn8;

    invoke-virtual {v11}, LpU8;->j()LUS8;

    move-result-object v11

    check-cast v11, Lqn8;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/util/Pair;

    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Long;

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v12

    invoke-virtual {v12}, Lgl7;->n()J

    const-wide/32 v12, 0x12cc8

    invoke-virtual {v11, v12, v13}, Lqn8;->u0(J)Lqn8;

    move-wide/from16 v12, v20

    invoke-virtual {v11, v12, v13}, Lqn8;->t0(J)Lqn8;

    iget-object v14, v1, LhV8;->l:LPn8;

    invoke-virtual {v14}, LPn8;->C()LFg7;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    const/4 v14, 0x0

    :try_start_1e
    invoke-virtual {v11, v14}, Lqn8;->n0(Z)Lqn8;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    if-nez v5, :cond_1a

    :try_start_1f
    invoke-virtual {v11}, Lqn8;->V0()Lqn8;

    :cond_1a
    if-nez v7, :cond_1b

    invoke-virtual {v11}, Lqn8;->e1()Lqn8;

    invoke-virtual {v11}, Lqn8;->a1()Lqn8;

    :cond_1b
    if-nez v8, :cond_1c

    invoke-virtual {v11}, Lqn8;->S0()Lqn8;

    :cond_1c
    invoke-virtual {v1, v6, v11}, LhV8;->e(Ljava/lang/String;Lqn8;)V

    if-nez v9, :cond_1d

    invoke-virtual {v11}, Lqn8;->f1()Lqn8;

    :cond_1d
    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v14

    sget-object v15, La98;->X:LL88;

    invoke-virtual {v14, v6, v15}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v14

    if-eqz v14, :cond_1e

    invoke-virtual {v11}, LUS8;->q()LpU8;

    move-result-object v14

    check-cast v14, LCn8;

    invoke-virtual {v14}, LQJ8;->c()[B

    move-result-object v14

    iget-object v15, v1, LhV8;->g:LDV8;

    invoke-static {v15}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v15, v14}, LDV8;->u([B)J

    move-result-wide v14

    invoke-virtual {v11, v14, v15}, Lqn8;->J(J)Lqn8;

    :cond_1e
    invoke-virtual {v2, v11}, LSm8;->y(Lqn8;)LSm8;

    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v20, v12

    goto :goto_16

    :catchall_4
    move-exception v0

    move v2, v14

    goto/16 :goto_20

    :cond_1f
    move-wide/from16 v12, v20

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->D()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, v1, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lfn8;

    invoke-virtual {v0, v5}, LDV8;->D(Lfn8;)Ljava/lang/String;

    move-result-object v9

    goto :goto_17

    :cond_20
    const/4 v9, 0x0

    :goto_17
    iget-object v0, v1, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lfn8;

    invoke-virtual {v0}, LQJ8;->c()[B

    move-result-object v14

    iget-object v0, v1, LhV8;->j:LxS8;

    invoke-virtual {v0, v6}, LxS8;->f(Ljava/lang/String;)LeS8;

    move-result-object v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_8

    :try_start_20
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    const/4 v7, 0x1

    xor-int/2addr v5, v7

    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    iget-object v5, v1, LhV8;->x:Ljava/util/List;

    if-eqz v5, :cond_21

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->o()Lec8;

    move-result-object v4

    const-string v5, "Set uploading progress before finishing the previous upload"

    invoke-virtual {v4, v5}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_18

    :cond_21
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v1, LhV8;->x:Ljava/util/List;

    :goto_18
    iget-object v4, v1, LhV8;->i:LVN8;

    iget-object v4, v4, LVN8;->h:Lzg8;

    invoke-virtual {v4, v12, v13}, Lzg8;->b(J)V

    const-string v4, "?"
    :try_end_20
    .catch Ljava/net/MalformedURLException; {:try_start_20 .. :try_end_20} :catch_a
    .catchall {:try_start_20 .. :try_end_20} :catchall_8

    if-lez v3, :cond_22

    const/4 v3, 0x0

    :try_start_21
    invoke-virtual {v2, v3}, LSm8;->z(I)LCn8;

    move-result-object v2
    :try_end_21
    .catch Ljava/net/MalformedURLException; {:try_start_21 .. :try_end_21} :catch_a
    .catchall {:try_start_21 .. :try_end_21} :catchall_9

    :try_start_22
    invoke-virtual {v2}, LCn8;->W1()Ljava/lang/String;

    move-result-object v4

    :cond_22
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    const-string v3, "Uploading data. app, uncompressed size, data"

    array-length v5, v14

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5, v9}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iput-boolean v2, v1, LhV8;->t:Z

    iget-object v11, v1, LhV8;->b:Lbf8;

    invoke-static {v11}, LhV8;->R(LTR8;)LTR8;

    new-instance v13, Ljava/net/URL;

    invoke-virtual {v0}, LeS8;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v13, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, LeS8;->b()Ljava/util/Map;

    move-result-object v15

    new-instance v2, LKS8;

    invoke-direct {v2, v1, v6}, LKS8;-><init>(LhV8;Ljava/lang/String;)V

    invoke-virtual {v11}, Lns8;->e()V

    invoke-virtual {v11}, LTR8;->f()V

    invoke-static {v13}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v11, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->c()Ldn8;

    move-result-object v3

    new-instance v4, LUd8;

    move-object v10, v4

    move-object v12, v6

    move-object/from16 v16, v2

    invoke-direct/range {v10 .. v16}, LUd8;-><init>(Lbf8;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lpd8;)V

    invoke-virtual {v3, v4}, Ldn8;->v(Ljava/lang/Runnable;)V
    :try_end_22
    .catch Ljava/net/MalformedURLException; {:try_start_22 .. :try_end_22} :catch_a
    .catchall {:try_start_22 .. :try_end_22} :catchall_8

    goto/16 :goto_1e

    :catch_a
    :try_start_23
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, LeS8;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v4, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1e

    :catchall_5
    move-exception v0

    move-object v9, v11

    :goto_19
    if-eqz v9, :cond_23

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_23
    throw v0

    :cond_24
    move-wide v12, v4

    iput-wide v7, v1, LhV8;->z:J

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    invoke-static {}, Lgl7;->I()J

    move-result-wide v3

    sub-long v4, v12, v3

    invoke-virtual {v2}, Lns8;->e()V

    invoke-virtual {v2}, LTR8;->f()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_8

    :try_start_24
    invoke-virtual {v2}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v3, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v6, v5

    invoke-virtual {v0, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_24
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_24 .. :try_end_24} :catch_c
    .catchall {:try_start_24 .. :try_end_24} :catchall_6

    :try_start_25
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v4, "No expired configs for apps with pending events"

    invoke-virtual {v0, v4}, Lec8;->a(Ljava/lang/String;)V
    :try_end_25
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_25 .. :try_end_25} :catch_b
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    :goto_1a
    :try_start_26
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_8

    goto :goto_1c

    :cond_25
    const/4 v4, 0x0

    :try_start_27
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9
    :try_end_27
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_27 .. :try_end_27} :catch_b
    .catchall {:try_start_27 .. :try_end_27} :catchall_7

    :try_start_28
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_8

    goto :goto_1d

    :catch_b
    move-exception v0

    goto :goto_1b

    :catchall_6
    move-exception v0

    const/4 v9, 0x0

    goto :goto_1f

    :catch_c
    move-exception v0

    const/4 v3, 0x0

    :goto_1b
    :try_start_29
    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v4, "Error selecting expired configs"

    invoke-virtual {v2, v4, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_7

    if-eqz v3, :cond_26

    goto :goto_1a

    :cond_26
    :goto_1c
    const/4 v9, 0x0

    :goto_1d
    :try_start_2a
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, v9}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {v1, v0}, LhV8;->f(Lpt8;)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_8

    :cond_27
    :goto_1e
    const/4 v2, 0x0

    iput-boolean v2, v1, LhV8;->u:Z

    goto/16 :goto_0

    :catchall_7
    move-exception v0

    move-object v9, v3

    :goto_1f
    if-eqz v9, :cond_28

    :try_start_2b
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_28
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_8

    :catchall_8
    move-exception v0

    const/4 v2, 0x0

    goto :goto_20

    :catchall_9
    move-exception v0

    move v2, v3

    :goto_20
    iput-boolean v2, v1, LhV8;->u:Z

    invoke-virtual/range {p0 .. p0}, LhV8;->K()V

    throw v0
.end method

.method public final C()LFg7;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v4, "metadata_fingerprint"

    const-string v5, "app_id"

    const-string v6, "raw_events"

    const-string v7, "_sno"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v8}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v10

    invoke-virtual {v10}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    iget-object v11, v1, LhV8;->g:LDV8;

    invoke-static {v11}, LhV8;->R(LTR8;)LTR8;

    invoke-static/range {p1 .. p2}, LDV8;->j(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v11

    if-nez v11, :cond_0

    return-void

    :cond_0
    iget-boolean v11, v3, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-eqz v11, :cond_3e

    iget-object v11, v1, LhV8;->a:LOk8;

    invoke-static {v11}, LhV8;->R(LTR8;)LTR8;

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v11, v10, v12}, LOk8;->F(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    const-string v15, "_err"

    const/4 v14, 0x0

    if-eqz v11, :cond_4

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->t()Lec8;

    move-result-object v3

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, LhV8;->l:LPn8;

    invoke-virtual {v5}, LPn8;->D()Lqb8;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Dropping blocked event. appId"

    invoke-virtual {v3, v6, v4, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v1, LhV8;->a:LOk8;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3, v10}, LOk8;->D(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v1, LhV8;->a:LOk8;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3, v10}, LOk8;->G(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v11

    iget-object v12, v1, LhV8;->E:LDW8;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const/16 v14, 0xb

    const-string v15, "_ev"

    const/16 v17, 0x0

    move-object v13, v10

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v17}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_2
    :goto_0
    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2, v10}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lpt8;->Z()J

    move-result-wide v3

    invoke-virtual {v2}, Lpt8;->Q()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v5, La98;->B:LL88;

    invoke-virtual {v5, v14}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-lez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->n()Lec8;

    move-result-object v3

    const-string v4, "Fetching config for blocked app"

    invoke-virtual {v3, v4}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LhV8;->f(Lpt8;)V

    :cond_3
    return-void

    :cond_4
    invoke-static/range {p1 .. p1}, LUc8;->b(Lcom/google/android/gms/measurement/internal/zzaw;)LUc8;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v12

    invoke-virtual {v12, v10}, Lgl7;->k(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v11, v2, v12}, LOW8;->y(LUc8;I)V

    invoke-static {}, LJf9;->b()Z

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v11

    sget-object v12, La98;->C0:LL88;

    invoke-virtual {v11, v14, v12}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v11

    sget-object v12, La98;->S:LL88;

    const/16 v13, 0xa

    const/16 v14, 0x23

    invoke-virtual {v11, v10, v12, v13, v14}, Lgl7;->m(Ljava/lang/String;LL88;II)I

    move-result v11

    goto :goto_1

    :cond_5
    const/4 v11, 0x0

    :goto_1
    new-instance v12, Ljava/util/TreeSet;

    iget-object v13, v2, LUc8;->d:Landroid/os/Bundle;

    invoke-virtual {v13}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_6
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const-string v14, "items"

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v14

    move-object/from16 v17, v12

    iget-object v12, v2, LUc8;->d:Landroid/os/Bundle;

    invoke-virtual {v12, v13}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v12

    invoke-static {}, LJf9;->b()Z

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v13

    move-object/from16 v18, v15

    sget-object v15, La98;->C0:LL88;

    move-wide/from16 v28, v8

    const/4 v8, 0x0

    invoke-virtual {v13, v8, v15}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v9

    invoke-virtual {v14, v12, v11, v9}, LOW8;->x([Landroid/os/Parcelable;IZ)V

    move-object/from16 v12, v17

    move-object/from16 v15, v18

    move-wide/from16 v8, v28

    goto :goto_2

    :cond_7
    move-wide/from16 v28, v8

    move-object/from16 v18, v15

    invoke-virtual {v2}, LUc8;->a()Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->D()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x2

    invoke-static {v8, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->s()Lec8;

    move-result-object v8

    iget-object v11, v1, LhV8;->l:LPn8;

    invoke-virtual {v11}, LPn8;->D()Lqb8;

    move-result-object v11

    invoke-virtual {v11, v2}, Lqb8;->c(Lcom/google/android/gms/measurement/internal/zzaw;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Logging event"

    invoke-virtual {v8, v12, v11}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    invoke-static {}, Llf9;->b()Z

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v8

    sget-object v11, La98;->z0:LL88;

    const/4 v14, 0x0

    invoke-virtual {v8, v14, v11}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    iget-object v8, v1, LhV8;->c:Ltq7;

    invoke-static {v8}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v8}, Ltq7;->e0()V

    :try_start_0
    invoke-virtual {v1, v3}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    const-string v8, "ecommerce_purchase"

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v11, "refund"

    if-nez v8, :cond_a

    :try_start_1
    const-string v8, "purchase"

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_3

    :cond_9
    const/4 v8, 0x0

    goto :goto_4

    :cond_a
    :goto_3
    const/4 v8, 0x1

    :goto_4
    const-string v12, "_iap"

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    if-eqz v8, :cond_b

    const/4 v8, 0x1

    goto :goto_5

    :cond_b
    move-object/from16 v32, v4

    move-object/from16 v33, v5

    move-object/from16 v4, v18

    const/4 v5, 0x1

    goto/16 :goto_d

    :cond_c
    :goto_5
    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    const-string v13, "currency"

    invoke-virtual {v12, v13}, Lcom/google/android/gms/measurement/internal/zzau;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "value"

    if-eqz v8, :cond_f

    :try_start_2
    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v8, v13}, Lcom/google/android/gms/measurement/internal/zzau;->v(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v16

    const-wide v19, 0x412e848000000000L    # 1000000.0

    mul-double v16, v16, v19

    const-wide/16 v21, 0x0

    cmpl-double v8, v16, v21

    if-nez v8, :cond_d

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v8, v13}, Lcom/google/android/gms/measurement/internal/zzau;->E(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    long-to-double v13, v14

    mul-double v16, v13, v19

    :cond_d
    const-wide/high16 v13, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v8, v16, v13

    if-gtz v8, :cond_e

    const-wide/high16 v13, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v8, v16, v13

    if-ltz v8, :cond_e

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    neg-long v13, v13

    goto :goto_6

    :cond_e
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    const-string v3, "Data lost. Currency value is too big. appId"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    return-void

    :cond_f
    :try_start_3
    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v8, v13}, Lcom/google/android/gms/measurement/internal/zzau;->E(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :cond_10
    :goto_6
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_b

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v12, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v11, "[A-Z]{3}"

    invoke-virtual {v8, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    const-string v11, "_ltv_"

    invoke-virtual {v11, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v11, v1, LhV8;->c:Ltq7;

    invoke-static {v11}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v11, v10, v8}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v11

    if-eqz v11, :cond_12

    iget-object v11, v11, LqW8;->e:Ljava/lang/Object;

    instance-of v12, v11, Ljava/lang/Long;

    if-nez v12, :cond_11

    goto :goto_7

    :cond_11
    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    new-instance v19, LqW8;

    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v16

    add-long/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v20

    move-object/from16 v11, v19

    move-object v12, v10

    const/4 v14, 0x0

    move-object v13, v15

    move v9, v14

    const/4 v15, 0x0

    move-object v14, v8

    move-object/from16 v8, v18

    move-wide/from16 v15, v16

    move-object/from16 v17, v20

    invoke-direct/range {v11 .. v17}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object/from16 v32, v4

    move-object/from16 v33, v5

    move-object v4, v8

    move-object/from16 v8, v19

    const/4 v5, 0x1

    goto/16 :goto_c

    :cond_12
    :goto_7
    move-object/from16 v15, v18

    const/4 v9, 0x0

    iget-object v11, v1, LhV8;->c:Ltq7;

    invoke-static {v11}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v12

    sget-object v9, La98;->G:LL88;

    invoke-virtual {v12, v10, v9}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v11}, Lns8;->e()V

    invoke-virtual {v11}, LTR8;->f()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v11}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v18, v15

    :try_start_5
    const-string v15, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);"
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v32, v4

    const/4 v4, 0x3

    :try_start_6
    new-array v4, v4, [Ljava/lang/String;

    const/16 v16, 0x0

    aput-object v10, v4, v16
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v33, v5

    const/4 v5, 0x1

    :try_start_7
    aput-object v10, v4, v5

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0x2

    aput-object v9, v4, v16

    invoke-virtual {v12, v15, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_b

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v32, v4

    :goto_8
    move-object/from16 v33, v5

    goto :goto_9

    :catch_3
    move-exception v0

    move-object/from16 v32, v4

    move-object/from16 v33, v5

    move-object/from16 v18, v15

    :goto_9
    const/4 v5, 0x1

    :goto_a
    move-object v4, v0

    :try_start_8
    iget-object v9, v11, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->o()Lec8;

    move-result-object v9

    const-string v11, "Error pruning currencies. appId"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v9, v11, v12, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_b
    new-instance v19, LqW8;

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v9

    invoke-interface {v9}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v15

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v11, v19

    move-object v12, v10

    move-object v13, v4

    move-object v14, v8

    move-object/from16 v4, v18

    invoke-direct/range {v11 .. v17}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object/from16 v8, v19

    :goto_c
    iget-object v9, v1, LhV8;->c:Ltq7;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v9, v8}, Ltq7;->u(LqW8;)Z

    move-result v9

    if-nez v9, :cond_13

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->o()Lec8;

    move-result-object v9

    const-string v11, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    iget-object v13, v1, LhV8;->l:LPn8;

    invoke-virtual {v13}, LPn8;->D()Lqb8;

    move-result-object v13

    iget-object v14, v8, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v13, v14}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iget-object v8, v8, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v9, v11, v12, v13, v8}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v11

    iget-object v12, v1, LhV8;->E:LDW8;

    const/16 v14, 0x9

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v10

    invoke-virtual/range {v11 .. v17}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_13
    :goto_d
    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-static {v8}, LOW8;->Z(Ljava/lang/String;)Z

    move-result v8

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    if-nez v9, :cond_14

    const-wide/16 v12, 0x0

    goto :goto_f

    :cond_14
    new-instance v11, Lew7;

    invoke-direct {v11, v9}, Lew7;-><init>(Lcom/google/android/gms/measurement/internal/zzau;)V

    const-wide/16 v12, 0x0

    :cond_15
    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_16

    invoke-virtual {v11}, Lew7;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Lcom/google/android/gms/measurement/internal/zzau;->F(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, [Landroid/os/Parcelable;

    if-eqz v15, :cond_15

    check-cast v14, [Landroid/os/Parcelable;

    array-length v14, v14

    int-to-long v14, v14

    add-long/2addr v12, v14

    goto :goto_e

    :cond_16
    :goto_f
    iget-object v11, v1, LhV8;->c:Ltq7;

    invoke-static {v11}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual/range {p0 .. p0}, LhV8;->F()J

    move-result-wide v14

    const-wide/16 v22, 0x1

    add-long v18, v12, v22

    const/4 v9, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide v12, v14

    move-object/from16 v30, v6

    const-wide/16 v5, 0x0

    move-object v14, v10

    move-wide/from16 v15, v18

    move/from16 v17, v9

    move/from16 v18, v8

    move/from16 v19, v20

    move/from16 v20, v4

    invoke-virtual/range {v11 .. v21}, Ltq7;->U(JLjava/lang/String;JZZZZZ)LKo7;

    move-result-object v9

    iget-wide v11, v9, LKo7;->b:J

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v13, La98;->m:LL88;

    const/4 v15, 0x0

    invoke-virtual {v13, v15}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    int-to-long v13, v13

    sub-long/2addr v11, v13

    cmp-long v13, v11, v5

    const-wide/16 v16, 0x3e8

    if-lez v13, :cond_18

    rem-long v11, v11, v16

    cmp-long v2, v11, v22

    if-nez v2, :cond_17

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Data loss. Too many events logged. appId, count"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v9, LKo7;->b:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    return-void

    :cond_18
    if-eqz v8, :cond_1a

    :try_start_9
    iget-wide v11, v9, LKo7;->a:J

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v13, La98;->o:LL88;

    invoke-virtual {v13, v15}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    int-to-long v13, v13

    sub-long/2addr v11, v13

    cmp-long v13, v11, v5

    if-lez v13, :cond_1a

    rem-long v11, v11, v16

    cmp-long v3, v11, v22

    if-nez v3, :cond_19

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. appId, count"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-wide v6, v9, LKo7;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_19
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v11

    iget-object v12, v1, LhV8;->E:LDW8;

    const/16 v14, 0x10

    const-string v15, "_ev"

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const/16 v17, 0x0

    move-object v13, v10

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v17}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    return-void

    :cond_1a
    const v11, 0xf4240

    if-eqz v4, :cond_1c

    :try_start_a
    iget-wide v12, v9, LKo7;->d:J

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v4

    iget-object v14, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    sget-object v15, La98;->n:LL88;

    invoke-virtual {v4, v14, v15}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v4

    invoke-static {v11, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v14, 0x0

    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    int-to-long v14, v4

    sub-long/2addr v12, v14

    cmp-long v4, v12, v5

    if-lez v4, :cond_1c

    cmp-long v2, v12, v22

    if-nez v2, :cond_1b

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Too many error events logged. appId, count"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v9, LKo7;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1b
    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    return-void

    :cond_1c
    :try_start_b
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzau;->u()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v9

    const-string v12, "_o"

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    invoke-virtual {v9, v4, v12, v13}, LOW8;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v9

    invoke-virtual {v9, v10}, LOW8;->U(Ljava/lang/String;)Z

    move-result v9
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    const-string v15, "_r"

    if-eqz v9, :cond_1d

    :try_start_c
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v9

    const-string v12, "_dbg"

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v9, v4, v12, v13}, LOW8;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v9

    invoke-virtual {v9, v4, v15, v13}, LOW8;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1d
    const-string v9, "_s"

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1e

    iget-object v9, v1, LhV8;->c:Ltq7;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    iget-object v12, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v9, v12, v7}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v9

    if-eqz v9, :cond_1e

    iget-object v12, v9, LqW8;->e:Ljava/lang/Object;

    instance-of v12, v12, Ljava/lang/Long;

    if-eqz v12, :cond_1e

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v12

    iget-object v9, v9, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v12, v4, v7, v9}, LOW8;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1e
    iget-object v7, v1, LhV8;->c:Ltq7;

    invoke-static {v7}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v7}, Lns8;->e()V

    invoke-virtual {v7}, LTR8;->f()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    invoke-virtual {v7}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    iget-object v12, v7, Lns8;->a:LPn8;

    invoke-virtual {v12}, LPn8;->w()Lgl7;

    move-result-object v12

    sget-object v13, La98;->r:LL88;

    invoke-virtual {v12, v10, v13}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    const/4 v14, 0x0

    :try_start_e
    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/String;

    aput-object v10, v13, v14

    const/16 v17, 0x1

    aput-object v11, v13, v17
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_5
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-object/from16 v11, v30

    :try_start_f
    invoke-virtual {v9, v11, v12, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    int-to-long v12, v7

    goto :goto_11

    :catch_4
    move-exception v0

    goto :goto_10

    :catch_5
    move-exception v0

    move-object/from16 v11, v30

    goto :goto_10

    :catch_6
    move-exception v0

    move-object/from16 v11, v30

    const/4 v14, 0x0

    :goto_10
    move-object v9, v0

    :try_start_10
    iget-object v7, v7, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->o()Lec8;

    move-result-object v7

    const-string v12, "Error deleting over the limit events. appId"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v7, v12, v13, v9}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-wide v12, v5

    :goto_11
    cmp-long v7, v12, v5

    if-lez v7, :cond_1f

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->t()Lec8;

    move-result-object v7

    const-string v9, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v7, v9, v14, v12}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1f
    new-instance v7, Lxu7;

    iget-object v12, v1, LhV8;->l:LPn8;

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    iget-wide v5, v2, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    const-wide/16 v18, 0x0

    move-object v2, v11

    move-object v11, v7

    const/16 v31, 0x0

    move-object v14, v10

    move-object/from16 p1, v2

    move-object/from16 v34, v15

    const/4 v2, 0x0

    move-object v15, v9

    move-wide/from16 v16, v5

    move-object/from16 v20, v4

    invoke-direct/range {v11 .. v20}, Lxu7;-><init>(LPn8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    iget-object v4, v1, LhV8;->c:Ltq7;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    iget-object v5, v7, Lxu7;->b:Ljava/lang/String;

    invoke-virtual {v4, v10, v5}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v4

    if-nez v4, :cond_21

    iget-object v4, v1, LhV8;->c:Ltq7;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v4, v10}, Ltq7;->O(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v6

    invoke-virtual {v6, v10}, Lgl7;->i(Ljava/lang/String;)I

    move-result v6

    int-to-long v11, v6

    cmp-long v4, v4, v11

    if-ltz v4, :cond_20

    if-eqz v8, :cond_20

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, LhV8;->l:LPn8;

    invoke-virtual {v5}, LPn8;->D()Lqb8;

    move-result-object v5

    iget-object v6, v7, Lxu7;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v6

    invoke-virtual {v6, v10}, Lgl7;->i(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v3, v4, v5, v6}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v11

    iget-object v12, v1, LhV8;->E:LDW8;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v10

    invoke-virtual/range {v11 .. v17}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    return-void

    :cond_20
    :try_start_11
    new-instance v4, Lpv7;

    iget-object v13, v7, Lxu7;->b:Ljava/lang/String;

    iget-wide v5, v7, Lxu7;->d:J

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v11, v4

    move-object v12, v10

    move-wide/from16 v20, v5

    invoke-direct/range {v11 .. v27}, Lpv7;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_12

    :cond_21
    iget-object v5, v1, LhV8;->l:LPn8;

    iget-wide v8, v4, Lpv7;->f:J

    invoke-virtual {v7, v5, v8, v9}, Lxu7;->a(LPn8;J)Lxu7;

    move-result-object v7

    iget-wide v5, v7, Lxu7;->d:J

    invoke-virtual {v4, v5, v6}, Lpv7;->c(J)Lpv7;

    move-result-object v4

    :goto_12
    iget-object v5, v1, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v5, v4}, Ltq7;->n(Lpv7;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v4

    invoke-virtual {v4}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v7, Lxu7;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v4, v7, Lxu7;->a:Ljava/lang/String;

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    invoke-static {}, LCn8;->S1()Lqn8;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lqn8;->i0(I)Lqn8;

    const-string v6, "android"

    invoke-virtual {v4, v6}, Lqn8;->d0(Ljava/lang/String;)Lqn8;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_22

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->B(Ljava/lang/String;)Lqn8;

    :cond_22
    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->e:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_23

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->e:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->D(Ljava/lang/String;)Lqn8;

    :cond_23
    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->d:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_24

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->d:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->G(Ljava/lang/String;)Lqn8;

    :cond_24
    invoke-static {}, Ltk9;->b()Z

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->y:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_26

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v6

    sget-object v8, La98;->o0:LL88;

    invoke-virtual {v6, v2, v8}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v6

    if-nez v6, :cond_25

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v6

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    sget-object v9, La98;->q0:LL88;

    invoke-virtual {v6, v8, v9}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v6

    if-eqz v6, :cond_26

    :cond_25
    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->y:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->o0(Ljava/lang/String;)Lqn8;

    :cond_26
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->k:J

    const-wide/32 v10, -0x80000000

    cmp-long v6, v8, v10

    if-eqz v6, :cond_27

    long-to-int v6, v8

    invoke-virtual {v4, v6}, Lqn8;->H(I)Lqn8;

    :cond_27
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->f:J

    invoke-virtual {v4, v8, v9}, Lqn8;->Z(J)Lqn8;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_28

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->Y(Ljava/lang/String;)Lqn8;

    :cond_28
    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v6

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->w:Ljava/lang/String;

    invoke-static {v8}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v8

    invoke-virtual {v6, v8}, LXm7;->c(LXm7;)LXm7;

    move-result-object v6

    invoke-virtual {v6}, LXm7;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lqn8;->N(Ljava/lang/String;)Lqn8;

    invoke-virtual {v4}, Lqn8;->z0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_29

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->r:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_29

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->r:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->A(Ljava/lang/String;)Lqn8;

    :cond_29
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->g:J

    const-wide/16 v10, 0x0

    cmp-long v6, v8, v10

    if-eqz v6, :cond_2a

    invoke-virtual {v4, v8, v9}, Lqn8;->O(J)Lqn8;

    :cond_2a
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->t:J

    invoke-virtual {v4, v8, v9}, Lqn8;->S(J)Lqn8;

    iget-object v6, v1, LhV8;->g:LDV8;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    iget-object v8, v6, LIR8;->b:LhV8;

    iget-object v8, v8, LhV8;->l:LPn8;

    invoke-virtual {v8}, LPn8;->z()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    const-string v9, "com.google.android.gms.measurement"

    invoke-static {v9}, Lay8;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    sget-object v10, LdA7;->b:LdA7;

    invoke-static {v8, v9, v10}, Lgv8;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lgv8;

    move-result-object v8

    if-nez v8, :cond_2b

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v8

    goto :goto_13

    :cond_2b
    invoke-virtual {v8}, Lgv8;->b()Ljava/util/Map;

    move-result-object v8

    :goto_13
    if-eqz v8, :cond_2f

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2c

    goto/16 :goto_16

    :cond_2c
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    sget-object v9, La98;->R:LL88;

    invoke-virtual {v9, v2}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2d
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "measurement.id."

    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    if-eqz v11, :cond_2d

    :try_start_12
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    if-eqz v10, :cond_2d

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v10

    if-lt v10, v9, :cond_2d

    iget-object v10, v6, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->a()LFc8;

    move-result-object v10

    invoke-virtual {v10}, LFc8;->t()Lec8;

    move-result-object v10

    const-string v11, "Too many experiment IDs. Number of IDs"

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_12
    .catch Ljava/lang/NumberFormatException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    goto :goto_15

    :catch_7
    move-exception v0

    move-object v10, v0

    :try_start_13
    iget-object v11, v6, Lns8;->a:LPn8;

    invoke-virtual {v11}, LPn8;->a()LFc8;

    move-result-object v11

    invoke-virtual {v11}, LFc8;->t()Lec8;

    move-result-object v11

    const-string v12, "Experiment ID NumberFormatException"

    invoke-virtual {v11, v12, v10}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_14

    :cond_2e
    :goto_15
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_30

    :cond_2f
    :goto_16
    move-object v14, v2

    :cond_30
    if-eqz v14, :cond_31

    invoke-virtual {v4, v14}, Lqn8;->L0(Ljava/lang/Iterable;)Lqn8;

    :cond_31
    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v6

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->w:Ljava/lang/String;

    invoke-static {v8}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v8

    invoke-virtual {v6, v8}, LXm7;->c(LXm7;)LXm7;

    move-result-object v6

    sget-object v8, Lcm7;->c:Lcm7;

    invoke-virtual {v6, v8}, LXm7;->i(Lcm7;)Z

    move-result v9

    if-eqz v9, :cond_32

    iget-boolean v9, v3, Lcom/google/android/gms/measurement/internal/zzq;->p:Z

    if-eqz v9, :cond_32

    iget-object v9, v1, LhV8;->i:LVN8;

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v9, v10, v6}, LVN8;->k(Ljava/lang/String;LXm7;)Landroid/util/Pair;

    move-result-object v9

    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_32

    iget-boolean v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->p:Z

    if-eqz v10, :cond_32

    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v4, v10}, Lqn8;->k0(Ljava/lang/String;)Lqn8;

    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v9, :cond_32

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v4, v9}, Lqn8;->b0(Z)Lqn8;

    :cond_32
    iget-object v9, v1, LhV8;->l:LPn8;

    invoke-virtual {v9}, LPn8;->x()LJt7;

    move-result-object v9

    invoke-virtual {v9}, LBs8;->h()V

    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v4, v9}, Lqn8;->P(Ljava/lang/String;)Lqn8;

    iget-object v9, v1, LhV8;->l:LPn8;

    invoke-virtual {v9}, LPn8;->x()LJt7;

    move-result-object v9

    invoke-virtual {v9}, LBs8;->h()V

    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v9}, Lqn8;->c0(Ljava/lang/String;)Lqn8;

    iget-object v9, v1, LhV8;->l:LPn8;

    invoke-virtual {v9}, LPn8;->x()LJt7;

    move-result-object v9

    invoke-virtual {v9}, LJt7;->m()J

    move-result-wide v9

    long-to-int v9, v9

    invoke-virtual {v4, v9}, Lqn8;->s0(I)Lqn8;

    iget-object v9, v1, LhV8;->l:LPn8;

    invoke-virtual {v9}, LPn8;->x()LJt7;

    move-result-object v9

    invoke-virtual {v9}, LJt7;->n()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lqn8;->w0(Ljava/lang/String;)Lqn8;

    invoke-static {}, LYg9;->b()Z

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v9

    sget-object v10, La98;->G0:LL88;

    invoke-virtual {v9, v2, v10}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v9

    if-eqz v9, :cond_33

    iget-wide v9, v3, Lcom/google/android/gms/measurement/internal/zzq;->A:J

    invoke-virtual {v4, v9, v10}, Lqn8;->r0(J)Lqn8;

    :cond_33
    iget-object v9, v1, LhV8;->l:LPn8;

    invoke-virtual {v9}, LPn8;->l()Z

    move-result v9

    if-eqz v9, :cond_34

    invoke-virtual {v4}, Lqn8;->y0()Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_34

    invoke-virtual {v4, v2}, Lqn8;->Q(Ljava/lang/String;)Lqn8;

    :cond_34
    iget-object v9, v1, LhV8;->c:Ltq7;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v9

    if-nez v9, :cond_36

    new-instance v9, Lpt8;

    iget-object v10, v1, LhV8;->l:LPn8;

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-direct {v9, v10, v11}, Lpt8;-><init>(LPn8;Ljava/lang/String;)V

    invoke-virtual {v1, v6}, LhV8;->i0(LXm7;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lpt8;->i(Ljava/lang/String;)V

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->l:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lpt8;->w(Ljava/lang/String;)V

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lpt8;->x(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, LXm7;->i(Lcm7;)Z

    move-result v8

    if-eqz v8, :cond_35

    iget-object v8, v1, LhV8;->i:LVN8;

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    iget-boolean v11, v3, Lcom/google/android/gms/measurement/internal/zzq;->p:Z

    invoke-virtual {v8, v10, v11}, LVN8;->l(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Lpt8;->G(Ljava/lang/String;)V

    :cond_35
    const-wide/16 v10, 0x0

    invoke-virtual {v9, v10, v11}, Lpt8;->C(J)V

    invoke-virtual {v9, v10, v11}, Lpt8;->D(J)V

    invoke-virtual {v9, v10, v11}, Lpt8;->B(J)V

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->d:Ljava/lang/String;

    invoke-virtual {v9, v8}, Lpt8;->k(Ljava/lang/String;)V

    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->k:J

    invoke-virtual {v9, v10, v11}, Lpt8;->l(J)V

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->e:Ljava/lang/String;

    invoke-virtual {v9, v8}, Lpt8;->j(Ljava/lang/String;)V

    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->f:J

    invoke-virtual {v9, v10, v11}, Lpt8;->y(J)V

    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->g:J

    invoke-virtual {v9, v10, v11}, Lpt8;->t(J)V

    iget-boolean v8, v3, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    invoke-virtual {v9, v8}, Lpt8;->E(Z)V

    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzq;->t:J

    invoke-virtual {v9, v10, v11}, Lpt8;->u(J)V

    iget-object v8, v1, LhV8;->c:Ltq7;

    invoke-static {v8}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v8, v9}, Ltq7;->m(Lpt8;)V

    :cond_36
    sget-object v8, Lcm7;->d:Lcm7;

    invoke-virtual {v6, v8}, LXm7;->i(Lcm7;)Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-virtual {v9}, Lpt8;->j0()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_37

    invoke-virtual {v9}, Lpt8;->j0()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->C(Ljava/lang/String;)Lqn8;

    :cond_37
    invoke-virtual {v9}, Lpt8;->m0()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_38

    invoke-virtual {v9}, Lpt8;->m0()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqn8;->X(Ljava/lang/String;)Lqn8;

    :cond_38
    iget-object v6, v1, LhV8;->c:Ltq7;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ltq7;->c0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    move/from16 v13, v31

    :goto_17
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-ge v13, v6, :cond_39

    invoke-static {}, LKp8;->E()Lyp8;

    move-result-object v6

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LqW8;

    iget-object v8, v8, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v6, v8}, Lyp8;->D(Ljava/lang/String;)Lyp8;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LqW8;

    iget-wide v8, v8, LqW8;->d:J

    invoke-virtual {v6, v8, v9}, Lyp8;->G(J)Lyp8;

    iget-object v8, v1, LhV8;->g:LDV8;

    invoke-static {v8}, LhV8;->R(LTR8;)LTR8;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LqW8;

    iget-object v9, v9, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v8, v6, v9}, LDV8;->K(Lyp8;Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Lqn8;->Q0(Lyp8;)Lqn8;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_17

    :cond_39
    :try_start_14
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v4}, LUS8;->q()LpU8;

    move-result-object v6

    check-cast v6, LCn8;

    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v6}, LQJ8;->c()[B

    move-result-object v8

    iget-object v9, v3, LIR8;->b:LhV8;

    iget-object v9, v9, LhV8;->g:LDV8;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v9, v8}, LDV8;->u([B)J

    move-result-wide v9

    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v13, v33

    invoke-virtual {v11, v13, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    move-object/from16 v14, v32

    invoke-virtual {v11, v14, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v12, "metadata"

    invoke-virtual {v11, v12, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_a
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    :try_start_15
    invoke-virtual {v3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const-string v12, "raw_events_metadata"

    const/4 v15, 0x4

    invoke-virtual {v8, v12, v2, v11, v15}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_9
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_a
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    :try_start_16
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    iget-object v4, v7, Lxu7;->f:Lcom/google/android/gms/measurement/internal/zzau;

    new-instance v6, Lew7;

    invoke-direct {v6, v4}, Lew7;-><init>(Lcom/google/android/gms/measurement/internal/zzau;)V

    :goto_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3b

    invoke-virtual {v6}, Lew7;->a()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v8, v34

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3a

    move/from16 v31, v5

    goto :goto_19

    :cond_3a
    move-object/from16 v34, v8

    goto :goto_18

    :cond_3b
    iget-object v4, v1, LhV8;->a:LOk8;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    iget-object v6, v7, Lxu7;->a:Ljava/lang/String;

    iget-object v8, v7, Lxu7;->b:Ljava/lang/String;

    invoke-virtual {v4, v6, v8}, LOk8;->E(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    iget-object v15, v1, LhV8;->c:Ltq7;

    invoke-static {v15}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual/range {p0 .. p0}, LhV8;->F()J

    move-result-wide v16

    iget-object v6, v7, Lxu7;->a:Ljava/lang/String;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v6

    invoke-virtual/range {v15 .. v23}, Ltq7;->T(JLjava/lang/String;ZZZZZ)LKo7;

    move-result-object v6

    if-eqz v4, :cond_3c

    iget-wide v11, v6, LKo7;->e:J

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v4

    iget-object v6, v7, Lxu7;->a:Ljava/lang/String;

    sget-object v8, La98;->q:LL88;

    invoke-virtual {v4, v6, v8}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v4

    int-to-long v5, v4

    cmp-long v4, v11, v5

    if-gez v4, :cond_3c

    const/16 v31, 0x1

    :cond_3c
    :goto_19
    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v7, Lxu7;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v4, v3, LIR8;->b:LhV8;

    iget-object v4, v4, LhV8;->g:LDV8;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v4, v7}, LDV8;->y(Lxu7;)Lpk8;

    move-result-object v4

    invoke-virtual {v4}, LQJ8;->c()[B

    move-result-object v4

    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    iget-object v6, v7, Lxu7;->a:Ljava/lang/String;

    invoke-virtual {v5, v13, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "name"

    iget-object v8, v7, Lxu7;->b:Ljava/lang/String;

    invoke-virtual {v5, v6, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "timestamp"

    iget-wide v11, v7, Lxu7;->d:J

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v6, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v14, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v6, "data"

    invoke-virtual {v5, v6, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v4, "realtime"

    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    :try_start_17
    invoke-virtual {v3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    move-object/from16 v6, p1

    invoke-virtual {v4, v6, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-wide/16 v8, -0x1

    cmp-long v2, v4, v8

    if-nez v2, :cond_3d

    iget-object v2, v3, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v4, "Failed to insert raw event (got -1). appId"

    iget-object v5, v7, Lxu7;->a:Ljava/lang/String;

    invoke-static {v5}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_8
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    goto :goto_1a

    :cond_3d
    const-wide/16 v4, 0x0

    :try_start_18
    iput-wide v4, v1, LhV8;->o:J

    goto :goto_1a

    :catch_8
    move-exception v0

    move-object v2, v0

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v4, "Error storing raw event. appId"

    iget-object v5, v7, Lxu7;->a:Ljava/lang/String;

    invoke-static {v5}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    goto :goto_1a

    :catch_9
    move-exception v0

    move-object v2, v0

    :try_start_19
    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v5, "Error storing raw event metadata. appId"

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v5, v6, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v2
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_a
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    :catch_a
    move-exception v0

    move-object v2, v0

    :try_start_1a
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v5, "Data loss. Failed to insert raw event metadata. appId"

    invoke-virtual {v4}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v5, v4, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1a
    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    invoke-virtual/range {p0 .. p0}, LhV8;->M()V

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v3, v3, v28

    const-wide/32 v5, 0x7a120

    add-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "Background event processing time, ms"

    invoke-virtual {v2, v4, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3}, Ltq7;->f0()V

    throw v2

    :cond_3e
    invoke-virtual {v1, v3}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void
.end method

.method public final E()Z
    .locals 5
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LhV8;->v:Ljava/nio/channels/FileLock;

    const/4 v1, 0x1

    const-string v2, "Storage concurrent access okay"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V

    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, LhV8;->c:Ltq7;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    const-string v4, "google_app_measurement.db"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v0, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, LhV8;->w:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, LhV8;->v:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    invoke-virtual {v0, v2}, Lec8;->a(Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->t()Lec8;

    move-result-object v1

    const-string v2, "Storage lock already acquired"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_2
    move-exception v0

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final F()J
    .locals 7

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LhV8;->i:LVN8;

    invoke-virtual {v2}, LTR8;->f()V

    invoke-virtual {v2}, Lns8;->e()V

    iget-object v3, v2, LVN8;->i:Lzg8;

    invoke-virtual {v3}, Lzg8;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    iget-object v3, v2, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->N()LOW8;

    move-result-object v3

    invoke-virtual {v3}, LOW8;->r()Ljava/security/SecureRandom;

    move-result-object v3

    const v4, 0x5265c00

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    int-to-long v3, v3

    iget-object v2, v2, LVN8;->i:Lzg8;

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lzg8;->b(J)V

    :cond_0
    add-long/2addr v0, v3

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final I(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzq;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1, v2}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v15

    const/4 v1, 0x0

    if-eqz v15, :cond_2

    invoke-virtual {v15}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0, v15}, LhV8;->J(Lpt8;)Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    invoke-static/range {p1 .. p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "App version does not match; dropping. appId"

    invoke-virtual {v3, v4, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v35, Lcom/google/android/gms/measurement/internal/zzq;

    move-object/from16 v1, v35

    invoke-virtual {v15}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15}, Lpt8;->P()J

    move-result-wide v5

    invoke-virtual {v15}, Lpt8;->k0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15}, Lpt8;->a0()J

    move-result-wide v8

    invoke-virtual {v15}, Lpt8;->X()J

    move-result-wide v10

    const/4 v12, 0x0

    invoke-virtual {v15}, Lpt8;->M()Z

    move-result v13

    const/4 v14, 0x0

    invoke-virtual {v15}, Lpt8;->m0()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v30, v15

    move-object/from16 v15, v16

    invoke-virtual/range {v30 .. v30}, Lpt8;->A()J

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    invoke-virtual/range {v30 .. v30}, Lpt8;->L()Z

    move-result v21

    const/16 v22, 0x0

    invoke-virtual/range {v30 .. v30}, Lpt8;->g0()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v30 .. v30}, Lpt8;->f0()Ljava/lang/Boolean;

    move-result-object v24

    invoke-virtual/range {v30 .. v30}, Lpt8;->Y()J

    move-result-wide v25

    invoke-virtual/range {v30 .. v30}, Lpt8;->d()Ljava/util/List;

    move-result-object v27

    const/16 v28, 0x0

    invoke-virtual/range {p0 .. p1}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, LXm7;->h()Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {v30 .. v30}, Lpt8;->O()Z

    move-result v32

    invoke-virtual/range {v30 .. v30}, Lpt8;->e0()J

    move-result-wide v33

    const-string v30, ""

    const/16 v31, 0x0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v34}, Lcom/google/android/gms/measurement/internal/zzq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-object v35

    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->n()Lec8;

    move-result-object v3

    const-string v4, "No app data available; dropping"

    invoke-virtual {v3, v4, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final J(Lpt8;)Ljava/lang/Boolean;
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lpt8;->P()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {p1}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p1}, Lpt8;->P()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {p1}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1}, Lpt8;->l0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final K()V
    .locals 5

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, LhV8;->s:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, LhV8;->t:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, LhV8;->u:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Stopping uploading service(s)"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, p0, LhV8;->p:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LhV8;->p:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    iget-boolean v1, p0, LhV8;->s:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, LhV8;->t:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, LhV8;->u:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "Not stopping services. fetch, network, upload"

    invoke-virtual {v0, v4, v1, v2, v3}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final L(Lqn8;JZ)V
    .locals 11
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    const/4 v1, 0x1

    if-eq v1, p4, :cond_0

    const-string v2, "_lte"

    goto :goto_0

    :cond_0
    const-string v2, "_se"

    :goto_0
    invoke-virtual {p1}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, v0, LqW8;->e:Ljava/lang/Object;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v10, LqW8;

    invoke-virtual {p1}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v7

    iget-object v0, v0, LqW8;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v5, p2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v5, "auto"

    move-object v3, v10

    move-object v6, v2

    invoke-direct/range {v3 .. v9}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v10, LqW8;

    invoke-virtual {p1}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v5, "auto"

    move-object v3, v10

    move-object v6, v2

    invoke-direct/range {v3 .. v9}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_2
    invoke-static {}, LKp8;->E()Lyp8;

    move-result-object v0

    invoke-virtual {v0, v2}, Lyp8;->D(Ljava/lang/String;)Lyp8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lyp8;->G(J)Lyp8;

    iget-object v3, v10, LqW8;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lyp8;->C(J)Lyp8;

    invoke-virtual {v0}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, LKp8;

    invoke-static {p1, v2}, LDV8;->t(Lqn8;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_3

    invoke-virtual {p1, v2, v0}, Lqn8;->v0(ILKp8;)Lqn8;

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Lqn8;->R0(LKp8;)Lqn8;

    :goto_3
    const-wide/16 v2, 0x0

    cmp-long p1, p2, v2

    if-lez p1, :cond_5

    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1, v10}, Ltq7;->u(LqW8;)Z

    if-eq v1, p4, :cond_4

    const-string p1, "lifetime"

    goto :goto_4

    :cond_4
    const-string p1, "session-scoped"

    :goto_4
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->s()Lec8;

    move-result-object p2

    iget-object p3, v10, LqW8;->e:Ljava/lang/Object;

    const-string p4, "Updated engagement user property. scope, value"

    invoke-virtual {p2, p4, p1, p3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final M()V
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v1

    invoke-virtual {v1}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    iget-wide v1, v0, LhV8;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v5, v0, LhV8;->o:J

    sub-long/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/32 v5, 0x36ee80

    sub-long/2addr v5, v1

    cmp-long v1, v5, v3

    if-lez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Upload has been suspended. Will update scheduling later in approximately ms"

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->Z()LEf8;

    move-result-object v1

    invoke-virtual {v1}, LEf8;->c()V

    iget-object v1, v0, LhV8;->e:LGR8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, LGR8;->j()V

    return-void

    :cond_0
    iput-wide v3, v0, LhV8;->o:J

    :cond_1
    iget-object v1, v0, LhV8;->l:LPn8;

    invoke-virtual {v1}, LPn8;->o()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual/range {p0 .. p0}, LhV8;->O()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v5, La98;->C:LL88;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v5, v0, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v5}, Ltq7;->q()Z

    move-result v5

    const/4 v10, 0x1

    if-nez v5, :cond_4

    iget-object v5, v0, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v5}, Ltq7;->p()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    :cond_4
    :goto_0
    if-eqz v10, :cond_6

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v5

    invoke-virtual {v5}, Lgl7;->r()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, ".none."

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v5, La98;->x:LL88;

    invoke-virtual {v5, v6}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    goto :goto_1

    :cond_5
    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v5, La98;->w:LL88;

    invoke-virtual {v5, v6}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    goto :goto_1

    :cond_6
    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v5, La98;->v:LL88;

    invoke-virtual {v5, v6}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    :goto_1
    iget-object v5, v0, LhV8;->i:LVN8;

    iget-object v5, v5, LVN8;->g:Lzg8;

    invoke-virtual {v5}, Lzg8;->a()J

    move-result-wide v13

    iget-object v5, v0, LhV8;->i:LVN8;

    iget-object v5, v5, LVN8;->h:Lzg8;

    invoke-virtual {v5}, Lzg8;->a()J

    move-result-wide v15

    iget-object v5, v0, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    move/from16 v17, v10

    invoke-virtual {v5}, Ltq7;->M()J

    move-result-wide v9

    iget-object v5, v0, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    move-wide/from16 v18, v7

    invoke-virtual {v5}, Ltq7;->N()J

    move-result-wide v6

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-nez v7, :cond_8

    :cond_7
    move-wide v9, v3

    goto/16 :goto_3

    :cond_8
    sub-long/2addr v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long v5, v1, v5

    sub-long/2addr v13, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    sub-long v7, v1, v7

    sub-long/2addr v15, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    sub-long/2addr v1, v9

    add-long v9, v5, v18

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    if-eqz v17, :cond_9

    cmp-long v13, v7, v3

    if-lez v13, :cond_9

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    add-long/2addr v9, v11

    :cond_9
    iget-object v13, v0, LhV8;->g:LDV8;

    invoke-static {v13}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v13, v7, v8, v11, v12}, LDV8;->M(JJ)Z

    move-result v13

    if-nez v13, :cond_a

    add-long v9, v7, v11

    :cond_a
    cmp-long v7, v1, v3

    if-eqz v7, :cond_c

    cmp-long v5, v1, v5

    if-ltz v5, :cond_c

    const/4 v5, 0x0

    :goto_2
    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v6, La98;->E:LL88;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v8, 0x0

    invoke-static {v8, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/16 v11, 0x14

    invoke-static {v11, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-ge v5, v6, :cond_7

    const-wide/16 v11, 0x1

    shl-long/2addr v11, v5

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v6, La98;->D:LL88;

    invoke-virtual {v6, v7}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    mul-long/2addr v6, v11

    add-long/2addr v9, v6

    cmp-long v6, v9, v1

    if-lez v6, :cond_b

    goto :goto_3

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_c
    :goto_3
    cmp-long v1, v9, v3

    if-eqz v1, :cond_10

    iget-object v1, v0, LhV8;->b:Lbf8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, Lbf8;->j()Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v0, LhV8;->i:LVN8;

    iget-object v1, v1, LVN8;->f:Lzg8;

    invoke-virtual {v1}, Lzg8;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v5, La98;->t:LL88;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object v7, v0, LhV8;->g:LDV8;

    invoke-static {v7}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v7, v1, v2, v5, v6}, LDV8;->M(JJ)Z

    move-result v7

    if-nez v7, :cond_d

    add-long/2addr v1, v5

    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    :cond_d
    invoke-virtual/range {p0 .. p0}, LhV8;->Z()LEf8;

    move-result-object v1

    invoke-virtual {v1}, LEf8;->c()V

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v9, v1

    cmp-long v1, v9, v3

    if-gtz v1, :cond_e

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    sget-object v1, La98;->y:LL88;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    iget-object v1, v0, LhV8;->i:LVN8;

    iget-object v1, v1, LVN8;->g:Lzg8;

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lzg8;->b(J)V

    :cond_e
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Upload scheduled in approximately ms"

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v0, LhV8;->e:LGR8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1, v9, v10}, LGR8;->k(J)V

    return-void

    :cond_f
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->Z()LEf8;

    move-result-object v1

    invoke-virtual {v1}, LEf8;->b()V

    iget-object v1, v0, LhV8;->e:LGR8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, LGR8;->j()V

    return-void

    :cond_10
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->Z()LEf8;

    move-result-object v1

    invoke-virtual {v1}, LEf8;->c()V

    iget-object v1, v0, LhV8;->e:LGR8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, LGR8;->j()V

    return-void

    :cond_11
    :goto_4
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->Z()LEf8;

    move-result-object v1

    invoke-virtual {v1}, LEf8;->c()V

    iget-object v1, v0, LhV8;->e:LGR8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, LGR8;->j()V

    return-void
.end method

.method public final N(Ljava/lang/String;J)Z
    .locals 40

    move-object/from16 v1, p0

    const-string v2, "_npa"

    const-string v3, "_ai"

    iget-object v4, v1, LhV8;->c:Ltq7;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v4}, Ltq7;->e0()V

    :try_start_0
    new-instance v4, LJU8;

    const/4 v12, 0x0

    invoke-direct {v4, v1, v12}, LJU8;-><init>(LhV8;LqU8;)V

    iget-object v5, v1, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    const/4 v6, 0x0

    iget-wide v9, v1, LhV8;->z:J

    move-wide/from16 v7, p2

    move-object v11, v4

    invoke-virtual/range {v5 .. v11}, Ltq7;->G(Ljava/lang/String;JJLJU8;)V

    iget-object v5, v4, LJU8;->c:Ljava/util/List;

    if-eqz v5, :cond_5c

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_32

    :cond_0
    iget-object v5, v4, LJU8;->a:LCn8;

    invoke-virtual {v5}, LpU8;->j()LUS8;

    move-result-object v5

    check-cast v5, Lqn8;

    invoke-virtual {v5}, Lqn8;->X0()Lqn8;

    move-object v11, v12

    move-object v14, v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, -0x1

    const/4 v15, -0x1

    :goto_0
    iget-object v12, v4, LJU8;->c:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "_fr"

    const-string v7, "_et"

    move/from16 v16, v10

    const-string v10, "_e"

    move/from16 v17, v13

    move-object/from16 v18, v14

    if-ge v8, v12, :cond_24

    :try_start_1
    iget-object v12, v4, LJU8;->c:Ljava/util/List;

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpk8;

    invoke-virtual {v12}, LpU8;->j()LUS8;

    move-result-object v12

    check-cast v12, Ldk8;

    iget-object v14, v1, LhV8;->a:LOk8;

    invoke-static {v14}, LhV8;->R(LTR8;)LTR8;

    iget-object v13, v4, LJU8;->a:LCn8;

    invoke-virtual {v13}, LCn8;->W1()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v19, v2

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v13, v2}, LOk8;->F(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "_err"

    if-eqz v2, :cond_3

    :try_start_2
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    const-string v6, "Dropping blocked raw event. appId"

    iget-object v7, v4, LJU8;->a:LCn8;

    invoke-virtual {v7}, LCn8;->W1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    iget-object v10, v1, LhV8;->l:LPn8;

    invoke-virtual {v10}, LPn8;->D()Lqb8;

    move-result-object v10

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v6, v7, v10}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, LhV8;->a:LOk8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, LOk8;->D(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, LhV8;->a:LOk8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, LOk8;->G(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v20

    iget-object v2, v1, LhV8;->E:LDW8;

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v22

    const/16 v23, 0xb

    const-string v24, "_ev"

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v25

    const/16 v26, 0x0

    move-object/from16 v21, v2

    invoke-virtual/range {v20 .. v26}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_2
    :goto_1
    move-object/from16 v21, v3

    move v6, v8

    move-object/from16 v23, v11

    move/from16 v10, v16

    move/from16 v13, v17

    move-object/from16 v14, v18

    move-object v11, v5

    const/4 v5, -0x1

    goto/16 :goto_13

    :cond_3
    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Leu8;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v12, v3}, Ldk8;->I(Ljava/lang/String;)Ldk8;

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    const-string v14, "Renaming ad_impression to _ai"

    invoke-virtual {v2, v14}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->D()Ljava/lang/String;

    move-result-object v2

    const/4 v14, 0x5

    invoke-static {v2, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v12}, Ldk8;->y()I

    move-result v14

    if-ge v2, v14, :cond_5

    const-string v14, "ad_platform"

    invoke-virtual {v12, v2}, Ldk8;->P(I)Lpl8;

    move-result-object v20

    move-object/from16 v21, v3

    invoke-virtual/range {v20 .. v20}, Lpl8;->H()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v12, v2}, Ldk8;->P(I)Lpl8;

    move-result-object v3

    invoke-virtual {v3}, Lpl8;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "admob"

    invoke-virtual {v12, v2}, Ldk8;->P(I)Lpl8;

    move-result-object v14

    invoke-virtual {v14}, Lpl8;->I()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->u()Lec8;

    move-result-object v3

    const-string v14, "AdMob ad impression logged from app. Potentially duplicative."

    invoke-virtual {v3, v14}, Lec8;->a(Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, v21

    goto :goto_2

    :cond_5
    move-object/from16 v21, v3

    iget-object v2, v1, LhV8;->a:LOk8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v4, LJU8;->a:LCn8;

    invoke-virtual {v3}, LCn8;->W1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v3, v14}, LOk8;->E(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v3, "_c"

    if-nez v2, :cond_8

    :try_start_3
    iget-object v14, v1, LhV8;->g:LDV8;

    invoke-static {v14}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    move/from16 v20, v9

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move/from16 v22, v8

    const v8, 0x17333

    if-eq v9, v8, :cond_6

    goto :goto_3

    :cond_6
    const-string v8, "_ui"

    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/4 v8, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v8, -0x1

    :goto_4
    if-eqz v8, :cond_9

    move-object/from16 v25, v6

    move-object/from16 v24, v7

    move-object/from16 v23, v11

    const/4 v2, 0x0

    move-object v11, v5

    goto/16 :goto_a

    :cond_8
    move/from16 v22, v8

    move/from16 v20, v9

    :cond_9
    move-object/from16 v23, v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    :goto_5
    :try_start_4
    invoke-virtual {v12}, Ldk8;->y()I

    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v24, v7

    const-string v7, "_r"

    if-ge v8, v11, :cond_c

    :try_start_5
    invoke-virtual {v12, v8}, Ldk8;->P(I)Lpl8;

    move-result-object v11

    invoke-virtual {v11}, Lpl8;->H()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {v12, v8}, Ldk8;->P(I)Lpl8;

    move-result-object v7

    invoke-virtual {v7}, LpU8;->j()LUS8;

    move-result-object v7

    check-cast v7, Ldl8;

    move-object v11, v5

    move-object/from16 v25, v6

    const-wide/16 v5, 0x1

    invoke-virtual {v7, v5, v6}, Ldl8;->I(J)Ldl8;

    invoke-virtual {v7}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lpl8;

    invoke-virtual {v12, v8, v5}, Ldk8;->M(ILpl8;)Ldk8;

    const/4 v9, 0x1

    goto :goto_6

    :cond_a
    move-object v11, v5

    move-object/from16 v25, v6

    invoke-virtual {v12, v8}, Ldk8;->P(I)Lpl8;

    move-result-object v5

    invoke-virtual {v5}, Lpl8;->H()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v12, v8}, Ldk8;->P(I)Lpl8;

    move-result-object v5

    invoke-virtual {v5}, LpU8;->j()LUS8;

    move-result-object v5

    check-cast v5, Ldl8;

    const-wide/16 v6, 0x1

    invoke-virtual {v5, v6, v7}, Ldl8;->I(J)Ldl8;

    invoke-virtual {v5}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lpl8;

    invoke-virtual {v12, v8, v5}, Ldk8;->M(ILpl8;)Ldk8;

    const/4 v14, 0x1

    :cond_b
    :goto_6
    add-int/lit8 v8, v8, 0x1

    move-object v5, v11

    move-object/from16 v7, v24

    move-object/from16 v6, v25

    goto :goto_5

    :cond_c
    move-object v11, v5

    move-object/from16 v25, v6

    if-nez v9, :cond_d

    if-eqz v2, :cond_d

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->s()Lec8;

    move-result-object v5

    const-string v6, "Marking event as conversion"

    iget-object v8, v1, LhV8;->l:LPn8;

    invoke-virtual {v8}, LPn8;->D()Lqb8;

    move-result-object v8

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v6, v8}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lpl8;->F()Ldl8;

    move-result-object v5

    invoke-virtual {v5, v3}, Ldl8;->J(Ljava/lang/String;)Ldl8;

    const-wide/16 v8, 0x1

    invoke-virtual {v5, v8, v9}, Ldl8;->I(J)Ldl8;

    invoke-virtual {v12, v5}, Ldk8;->C(Ldl8;)Ldk8;

    :cond_d
    if-nez v14, :cond_e

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->s()Lec8;

    move-result-object v5

    const-string v6, "Marking event as real-time"

    iget-object v8, v1, LhV8;->l:LPn8;

    invoke-virtual {v8}, LPn8;->D()Lqb8;

    move-result-object v8

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v6, v8}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lpl8;->F()Ldl8;

    move-result-object v5

    invoke-virtual {v5, v7}, Ldl8;->J(Ljava/lang/String;)Ldl8;

    const-wide/16 v8, 0x1

    invoke-virtual {v5, v8, v9}, Ldl8;->I(J)Ldl8;

    invoke-virtual {v12, v5}, Ldk8;->C(Ldl8;)Ldk8;

    :cond_e
    iget-object v5, v1, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual/range {p0 .. p0}, LhV8;->F()J

    move-result-wide v27

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x1

    move-object/from16 v26, v5

    invoke-virtual/range {v26 .. v34}, Ltq7;->T(JLjava/lang/String;ZZZZZ)LKo7;

    move-result-object v5

    iget-wide v5, v5, LKo7;->e:J

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v8

    iget-object v9, v4, LJU8;->a:LCn8;

    invoke-virtual {v9}, LCn8;->W1()Ljava/lang/String;

    move-result-object v9

    sget-object v14, La98;->q:LL88;

    invoke-virtual {v8, v9, v14}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v8

    int-to-long v8, v8

    cmp-long v5, v5, v8

    if-lez v5, :cond_f

    invoke-static {v12, v7}, LhV8;->H(Ldk8;Ljava/lang/String;)V

    goto :goto_7

    :cond_f
    const/16 v16, 0x1

    :goto_7
    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LOW8;->Z(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_16

    if-eqz v2, :cond_16

    iget-object v5, v1, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual/range {p0 .. p0}, LhV8;->F()J

    move-result-wide v27

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v26, v5

    invoke-virtual/range {v26 .. v34}, Ltq7;->T(JLjava/lang/String;ZZZZZ)LKo7;

    move-result-object v5

    iget-wide v5, v5, LKo7;->c:J

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v7

    iget-object v8, v4, LJU8;->a:LCn8;

    invoke-virtual {v8}, LCn8;->W1()Ljava/lang/String;

    move-result-object v8

    sget-object v9, La98;->p:LL88;

    invoke-virtual {v7, v8, v9}, Lgl7;->l(Ljava/lang/String;LL88;)I

    move-result v7

    int-to-long v7, v7

    cmp-long v5, v5, v7

    if-lez v5, :cond_16

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->t()Lec8;

    move-result-object v5

    const-string v6, "Too many conversions. Not logging as conversion. appId"

    iget-object v7, v4, LJU8;->a:LCn8;

    invoke-virtual {v7}, LCn8;->W1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, -0x1

    :goto_8
    invoke-virtual {v12}, Ldk8;->y()I

    move-result v9

    if-ge v6, v9, :cond_12

    invoke-virtual {v12, v6}, Ldk8;->P(I)Lpl8;

    move-result-object v9

    invoke-virtual {v9}, Lpl8;->H()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-virtual {v9}, LpU8;->j()LUS8;

    move-result-object v5

    check-cast v5, Ldl8;

    move v8, v6

    goto :goto_9

    :cond_10
    invoke-virtual {v9}, Lpl8;->H()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    const/4 v7, 0x1

    :cond_11
    :goto_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_12
    if-eqz v7, :cond_14

    if-eqz v5, :cond_13

    invoke-virtual {v12, v8}, Ldk8;->H(I)Ldk8;

    goto :goto_a

    :cond_13
    const/4 v5, 0x0

    :cond_14
    if-eqz v5, :cond_15

    invoke-virtual {v5}, LUS8;->n()LUS8;

    move-result-object v5

    check-cast v5, Ldl8;

    invoke-virtual {v5, v13}, Ldl8;->J(Ljava/lang/String;)Ldl8;

    const-wide/16 v6, 0xa

    invoke-virtual {v5, v6, v7}, Ldl8;->I(J)Ldl8;

    invoke-virtual {v5}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lpl8;

    invoke-virtual {v12, v8, v5}, Ldk8;->M(ILpl8;)Ldk8;

    goto :goto_a

    :cond_15
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->o()Lec8;

    move-result-object v5

    const-string v6, "Did not find conversion parameter. appId"

    iget-object v7, v4, LJU8;->a:LCn8;

    invoke-virtual {v7}, LCn8;->W1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_16
    :goto_a
    if-eqz v2, :cond_1e

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ldk8;->S()Ljava/util/List;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    :goto_b
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v9, "currency"

    const-string v13, "value"

    if-ge v5, v8, :cond_19

    :try_start_6
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpl8;

    invoke-virtual {v8}, Lpl8;->H()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_17

    move v6, v5

    goto :goto_c

    :cond_17
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpl8;

    invoke-virtual {v8}, Lpl8;->H()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    move v7, v5

    :cond_18
    :goto_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_19
    const/4 v5, -0x1

    if-ne v6, v5, :cond_1a

    goto/16 :goto_10

    :cond_1a
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpl8;

    invoke-virtual {v5}, Lpl8;->X()Z

    move-result v5

    if-nez v5, :cond_1b

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpl8;

    invoke-virtual {v5}, Lpl8;->V()Z

    move-result v5

    if-nez v5, :cond_1b

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->u()Lec8;

    move-result-object v2

    const-string v5, "Value must be specified with a numeric type."

    invoke-virtual {v2, v5}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {v12, v6}, Ldk8;->H(I)Ldk8;

    invoke-static {v12, v3}, LhV8;->H(Ldk8;Ljava/lang/String;)V

    const/16 v2, 0x12

    invoke-static {v12, v2, v13}, LhV8;->G(Ldk8;ILjava/lang/String;)V

    goto :goto_f

    :cond_1b
    const/4 v5, -0x1

    if-ne v7, v5, :cond_1c

    goto :goto_e

    :cond_1c
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl8;

    invoke-virtual {v2}, Lpl8;->I()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x3

    if-ne v7, v8, :cond_1d

    const/4 v7, 0x0

    :goto_d
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v7, v8, :cond_1f

    invoke-virtual {v2, v7}, Ljava/lang/String;->codePointAt(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->isLetter(I)Z

    move-result v13

    if-eqz v13, :cond_1d

    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v7, v8

    goto :goto_d

    :cond_1d
    :goto_e
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->u()Lec8;

    move-result-object v2

    const-string v7, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    invoke-virtual {v2, v7}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {v12, v6}, Ldk8;->H(I)Ldk8;

    invoke-static {v12, v3}, LhV8;->H(Ldk8;Ljava/lang/String;)V

    const/16 v2, 0x13

    invoke-static {v12, v2, v9}, LhV8;->G(Ldk8;ILjava/lang/String;)V

    goto :goto_10

    :cond_1e
    :goto_f
    const/4 v5, -0x1

    :cond_1f
    :goto_10
    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v6, 0x3e8

    if-eqz v2, :cond_21

    iget-object v2, v1, LhV8;->g:LDV8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v12}, LUS8;->q()LpU8;

    move-result-object v2

    check-cast v2, Lpk8;

    move-object/from16 v3, v25

    invoke-static {v2, v3}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v2

    if-nez v2, :cond_23

    if-eqz v18, :cond_20

    invoke-virtual/range {v18 .. v18}, Ldk8;->A()J

    move-result-wide v2

    invoke-virtual {v12}, Ldk8;->A()J

    move-result-wide v8

    sub-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    cmp-long v2, v2, v6

    if-gtz v2, :cond_20

    invoke-virtual/range {v18 .. v18}, LUS8;->n()LUS8;

    move-result-object v2

    check-cast v2, Ldk8;

    invoke-virtual {v1, v12, v2}, LhV8;->P(Ldk8;Ldk8;)Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-virtual {v11, v15, v2}, Lqn8;->W(ILdk8;)Lqn8;

    move/from16 v13, v17

    :goto_11
    const/4 v14, 0x0

    const/16 v23, 0x0

    goto :goto_12

    :cond_20
    move-object/from16 v23, v12

    move-object/from16 v14, v18

    move/from16 v13, v20

    goto :goto_12

    :cond_21
    const-string v2, "_vs"

    invoke-virtual {v12}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    iget-object v2, v1, LhV8;->g:LDV8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v12}, LUS8;->q()LpU8;

    move-result-object v2

    check-cast v2, Lpk8;

    move-object/from16 v8, v24

    invoke-static {v2, v8}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v2

    if-nez v2, :cond_23

    if-eqz v23, :cond_22

    invoke-virtual/range {v23 .. v23}, Ldk8;->A()J

    move-result-wide v2

    invoke-virtual {v12}, Ldk8;->A()J

    move-result-wide v8

    sub-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    cmp-long v2, v2, v6

    if-gtz v2, :cond_22

    invoke-virtual/range {v23 .. v23}, LUS8;->n()LUS8;

    move-result-object v2

    check-cast v2, Ldk8;

    invoke-virtual {v1, v2, v12}, LhV8;->P(Ldk8;Ldk8;)Z

    move-result v3

    if-eqz v3, :cond_22

    move/from16 v7, v17

    invoke-virtual {v11, v7, v2}, Lqn8;->W(ILdk8;)Lqn8;

    move v13, v7

    goto :goto_11

    :cond_22
    move/from16 v7, v17

    move v13, v7

    move-object v14, v12

    move/from16 v15, v20

    goto :goto_12

    :cond_23
    move/from16 v7, v17

    move v13, v7

    move-object/from16 v14, v18

    :goto_12
    iget-object v2, v4, LJU8;->c:Ljava/util/List;

    invoke-virtual {v12}, LUS8;->q()LpU8;

    move-result-object v3

    check-cast v3, Lpk8;

    move/from16 v6, v22

    invoke-interface {v2, v6, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v20, 0x1

    invoke-virtual {v11, v12}, Lqn8;->P0(Ldk8;)Lqn8;

    move/from16 v10, v16

    :goto_13
    add-int/lit8 v8, v6, 0x1

    move-object v5, v11

    move-object/from16 v2, v19

    move-object/from16 v3, v21

    move-object/from16 v11, v23

    goto/16 :goto_0

    :cond_24
    move-object/from16 v19, v2

    move-object v11, v5

    move-object v3, v6

    move-object v8, v7

    move/from16 v20, v9

    const-wide/16 v5, 0x0

    move-wide v12, v5

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v9, :cond_28

    invoke-virtual {v11, v2}, Lqn8;->I0(I)Lpk8;

    move-result-object v7

    invoke-virtual {v7}, Lpk8;->I()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_25

    iget-object v14, v1, LhV8;->g:LDV8;

    invoke-static {v14}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v7, v3}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v14

    if-eqz v14, :cond_25

    invoke-virtual {v11, v2}, Lqn8;->y(I)Lqn8;

    add-int/lit8 v9, v9, -0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_16

    :cond_25
    iget-object v14, v1, LhV8;->g:LDV8;

    invoke-static {v14}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v7, v8}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v7

    if-eqz v7, :cond_27

    invoke-virtual {v7}, Lpl8;->X()Z

    move-result v14

    if-eqz v14, :cond_26

    invoke-virtual {v7}, Lpl8;->E()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_15

    :cond_26
    const/4 v7, 0x0

    :goto_15
    if-eqz v7, :cond_27

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    cmp-long v14, v14, v5

    if-lez v14, :cond_27

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    add-long/2addr v12, v14

    :cond_27
    :goto_16
    const/4 v7, 0x1

    add-int/2addr v2, v7

    goto :goto_14

    :cond_28
    const/4 v2, 0x0

    invoke-virtual {v1, v11, v12, v13, v2}, LhV8;->L(Lqn8;JZ)V

    invoke-virtual {v11}, Lqn8;->B0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_29
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v7, "_se"

    if-eqz v3, :cond_2a

    :try_start_7
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpk8;

    const-string v8, "_s"

    invoke-virtual {v3}, Lpk8;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_29

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v11}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v7}, Ltq7;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2a
    const-string v2, "_sid"

    invoke-static {v11, v2}, LDV8;->t(Lqn8;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_2b

    const/4 v2, 0x1

    invoke-virtual {v1, v11, v12, v13, v2}, LhV8;->L(Lqn8;JZ)V

    goto :goto_17

    :cond_2b
    invoke-static {v11, v7}, LDV8;->t(Lqn8;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_2c

    invoke-virtual {v11, v2}, Lqn8;->z(I)Lqn8;

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Session engagement user property is in the bundle without session ID. appId"

    iget-object v7, v4, LJU8;->a:LCn8;

    invoke-virtual {v7}, LCn8;->W1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v2, v3, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2c
    :goto_17
    iget-object v2, v1, LhV8;->g:LDV8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v2, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->s()Lec8;

    move-result-object v3

    const-string v7, "Checking account type status for ad personalization signals"

    invoke-virtual {v3, v7}, Lec8;->a(Ljava/lang/String;)V

    iget-object v3, v2, LIR8;->b:LhV8;

    iget-object v3, v3, LhV8;->a:LOk8;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v11}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, LOk8;->y(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2f

    iget-object v3, v2, LIR8;->b:LhV8;

    iget-object v3, v3, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v11}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v3

    if-eqz v3, :cond_2f

    invoke-virtual {v3}, Lpt8;->L()Z

    move-result v3

    if-eqz v3, :cond_2f

    iget-object v3, v2, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->x()LJt7;

    move-result-object v3

    invoke-virtual {v3}, LJt7;->p()Z

    move-result v3

    if-eqz v3, :cond_2f

    iget-object v3, v2, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->n()Lec8;

    move-result-object v3

    const-string v7, "Turning off ad personalization due to account type"

    invoke-virtual {v3, v7}, Lec8;->a(Ljava/lang/String;)V

    invoke-static {}, LKp8;->E()Lyp8;

    move-result-object v3

    move-object/from16 v7, v19

    invoke-virtual {v3, v7}, Lyp8;->D(Ljava/lang/String;)Lyp8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->x()LJt7;

    move-result-object v2

    invoke-virtual {v2}, LJt7;->l()J

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Lyp8;->G(J)Lyp8;

    const-wide/16 v8, 0x1

    invoke-virtual {v3, v8, v9}, Lyp8;->C(J)Lyp8;

    invoke-virtual {v3}, LUS8;->q()LpU8;

    move-result-object v2

    check-cast v2, LKp8;

    const/4 v3, 0x0

    :goto_18
    invoke-virtual {v11}, Lqn8;->F0()I

    move-result v8

    if-ge v3, v8, :cond_2e

    invoke-virtual {v11, v3}, Lqn8;->x0(I)LKp8;

    move-result-object v8

    invoke-virtual {v8}, LKp8;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2d

    invoke-virtual {v11, v3, v2}, Lqn8;->v0(ILKp8;)Lqn8;

    goto :goto_19

    :cond_2d
    add-int/lit8 v3, v3, 0x1

    goto :goto_18

    :cond_2e
    invoke-virtual {v11, v2}, Lqn8;->R0(LKp8;)Lqn8;

    :cond_2f
    :goto_19
    const-wide v2, 0x7fffffffffffffffL

    invoke-virtual {v11, v2, v3}, Lqn8;->q0(J)Lqn8;

    const-wide/high16 v2, -0x8000000000000000L

    invoke-virtual {v11, v2, v3}, Lqn8;->U(J)Lqn8;

    const/4 v2, 0x0

    :goto_1a
    invoke-virtual {v11}, Lqn8;->e0()I

    move-result v3

    if-ge v2, v3, :cond_32

    invoke-virtual {v11, v2}, Lqn8;->I0(I)Lpk8;

    move-result-object v3

    invoke-virtual {v3}, Lpk8;->E()J

    move-result-wide v7

    invoke-virtual {v11}, Lqn8;->H0()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-gez v7, :cond_30

    invoke-virtual {v3}, Lpk8;->E()J

    move-result-wide v7

    invoke-virtual {v11, v7, v8}, Lqn8;->q0(J)Lqn8;

    :cond_30
    invoke-virtual {v3}, Lpk8;->E()J

    move-result-wide v7

    invoke-virtual {v11}, Lqn8;->G0()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-lez v7, :cond_31

    invoke-virtual {v3}, Lpk8;->E()J

    move-result-wide v7

    invoke-virtual {v11, v7, v8}, Lqn8;->U(J)Lqn8;

    :cond_31
    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    :cond_32
    invoke-virtual {v11}, Lqn8;->g1()Lqn8;

    invoke-virtual {v11}, Lqn8;->T0()Lqn8;

    iget-object v2, v1, LhV8;->f:LFf7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v11}, Lqn8;->y0()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v11}, Lqn8;->B0()Ljava/util/List;

    move-result-object v21

    invoke-virtual {v11}, Lqn8;->C0()Ljava/util/List;

    move-result-object v22

    invoke-virtual {v11}, Lqn8;->H0()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    invoke-virtual {v11}, Lqn8;->G0()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v24

    move-object/from16 v19, v2

    invoke-virtual/range {v19 .. v24}, LFf7;->j(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v11, v2}, Lqn8;->J0(Ljava/lang/Iterable;)Lqn8;

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v2

    iget-object v3, v4, LJU8;->a:LCn8;

    invoke-virtual {v3}, LCn8;->W1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgl7;->F(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4a

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v7

    invoke-virtual {v7}, LOW8;->r()Ljava/security/SecureRandom;

    move-result-object v7

    const/4 v8, 0x0

    :goto_1b
    invoke-virtual {v11}, Lqn8;->e0()I

    move-result v9

    if-ge v8, v9, :cond_48

    invoke-virtual {v11, v8}, Lqn8;->I0(I)Lpk8;

    move-result-object v9

    invoke-virtual {v9}, LpU8;->j()LUS8;

    move-result-object v9

    check-cast v9, Ldk8;

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v10

    const-string v12, "_ep"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v12, "_efs"

    const-string v13, "_sr"

    if-eqz v10, :cond_37

    :try_start_8
    iget-object v10, v1, LhV8;->g:LDV8;

    invoke-static {v10}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v10

    check-cast v10, Lpk8;

    const-string v14, "_en"

    invoke-static {v10, v14}, LDV8;->l(Lpk8;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpv7;

    if-nez v14, :cond_33

    iget-object v14, v1, LhV8;->c:Ltq7;

    invoke-static {v14}, LhV8;->R(LTR8;)LTR8;

    iget-object v15, v4, LJU8;->a:LCn8;

    invoke-virtual {v15}, LCn8;->W1()Ljava/lang/String;

    move-result-object v15

    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v5, v17

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v14, v15, v5}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v14

    if-eqz v14, :cond_33

    invoke-interface {v2, v10, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_33
    if-eqz v14, :cond_36

    iget-object v5, v14, Lpv7;->i:Ljava/lang/Long;

    if-nez v5, :cond_36

    iget-object v5, v14, Lpv7;->j:Ljava/lang/Long;

    if-eqz v5, :cond_34

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/16 v17, 0x1

    cmp-long v5, v5, v17

    if-lez v5, :cond_34

    iget-object v5, v1, LhV8;->g:LDV8;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    iget-object v5, v14, Lpv7;->j:Ljava/lang/Long;

    invoke-static {v9, v13, v5}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_34
    iget-object v5, v14, Lpv7;->k:Ljava/lang/Boolean;

    if-eqz v5, :cond_35

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_35

    iget-object v5, v1, LhV8;->g:LDV8;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    const-wide/16 v5, 0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-static {v9, v12, v10}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_35
    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lpk8;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_36
    invoke-virtual {v11, v8, v9}, Lqn8;->W(ILdk8;)Lqn8;

    :goto_1c
    move-object v10, v3

    move-object/from16 v21, v7

    move-object v5, v11

    move-object v7, v2

    const-wide/16 v2, 0x1

    goto/16 :goto_26

    :cond_37
    iget-object v5, v1, LhV8;->a:LOk8;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v6

    const-string v10, "measurement.account.time_zone_offset_minutes"

    invoke-virtual {v5, v6, v10}, LOk8;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez v14, :cond_38

    :try_start_9
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_1d

    :catch_0
    move-exception v0

    move-object v10, v0

    :try_start_a
    iget-object v5, v5, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->t()Lec8;

    move-result-object v5

    const-string v14, "Unable to parse timezone offset. appId"

    invoke-static {v6}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v14, v6, v10}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_38
    const-wide/16 v5, 0x0

    :goto_1d
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v10

    invoke-virtual {v9}, Ldk8;->A()J

    move-result-wide v14

    invoke-virtual {v10, v14, v15, v5, v6}, LOW8;->u0(JJ)J

    move-result-wide v14

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v10

    check-cast v10, Lpk8;

    move-object/from16 p3, v12

    const-wide/16 v17, 0x1

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    move-wide/from16 v17, v5

    const-string v5, "_dbg"

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3b

    invoke-virtual {v10}, Lpk8;->J()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpl8;

    move-object/from16 v21, v6

    invoke-virtual {v10}, Lpl8;->H()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3a

    invoke-virtual {v10}, Lpl8;->E()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_39

    goto :goto_1f

    :cond_39
    const/4 v5, 0x1

    goto :goto_20

    :cond_3a
    move-object/from16 v6, v21

    goto :goto_1e

    :cond_3b
    :goto_1f
    iget-object v5, v1, LhV8;->a:LOk8;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v6, v10}, LOk8;->o(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    :goto_20
    if-gtz v5, :cond_3c

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    const-string v10, "Sample rate must be positive. event, rate"

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v10, v12, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lpk8;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11, v8, v9}, Lqn8;->W(ILdk8;)Lqn8;

    goto/16 :goto_1c

    :cond_3c
    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpv7;

    if-nez v6, :cond_3d

    iget-object v6, v1, LhV8;->c:Ltq7;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    iget-object v10, v4, LJU8;->a:LCn8;

    invoke-virtual {v10}, LCn8;->W1()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v10, v12}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v6

    if-nez v6, :cond_3d

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->t()Lec8;

    move-result-object v6

    const-string v10, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v12, v4, LJU8;->a:LCn8;

    invoke-virtual {v12}, LCn8;->W1()Ljava/lang/String;

    move-result-object v12

    move-wide/from16 v21, v14

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v10, v12, v14}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Lpv7;

    iget-object v10, v4, LJU8;->a:LCn8;

    invoke-virtual {v10}, LCn8;->W1()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v25

    const-wide/16 v26, 0x1

    const-wide/16 v28, 0x1

    const-wide/16 v30, 0x1

    invoke-virtual {v9}, Ldk8;->A()J

    move-result-wide v32

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    move-object/from16 v23, v6

    invoke-direct/range {v23 .. v39}, Lpv7;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_21

    :cond_3d
    move-wide/from16 v21, v14

    :goto_21
    iget-object v10, v1, LhV8;->g:LDV8;

    invoke-static {v10}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v10

    check-cast v10, Lpk8;

    const-string v12, "_eid"

    invoke-static {v10, v12}, LDV8;->l(Lpk8;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    if-eqz v10, :cond_3e

    const/4 v12, 0x1

    goto :goto_22

    :cond_3e
    const/4 v12, 0x0

    :goto_22
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    const/4 v14, 0x1

    if-ne v5, v14, :cond_41

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, Lpk8;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_40

    iget-object v5, v6, Lpv7;->i:Ljava/lang/Long;

    if-nez v5, :cond_3f

    iget-object v5, v6, Lpv7;->j:Ljava/lang/Long;

    if-nez v5, :cond_3f

    iget-object v5, v6, Lpv7;->k:Ljava/lang/Boolean;

    if-eqz v5, :cond_40

    :cond_3f
    const/4 v5, 0x0

    invoke-virtual {v6, v5, v5, v5}, Lpv7;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpv7;

    move-result-object v6

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_40
    invoke-virtual {v11, v8, v9}, Lqn8;->W(ILdk8;)Lqn8;

    goto/16 :goto_1c

    :cond_41
    invoke-virtual {v7, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v14

    if-nez v14, :cond_43

    iget-object v10, v1, LhV8;->g:LDV8;

    invoke-static {v10}, LhV8;->R(LTR8;)LTR8;

    int-to-long v14, v5

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v9, v13, v5}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v10

    check-cast v10, Lpk8;

    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_42

    const/4 v10, 0x0

    invoke-virtual {v6, v10, v5, v10}, Lpv7;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpv7;

    move-result-object v6

    :cond_42
    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9}, Ldk8;->A()J

    move-result-wide v12

    move-wide/from16 v14, v21

    invoke-virtual {v6, v12, v13, v14, v15}, Lpv7;->b(JJ)Lpv7;

    move-result-object v6

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v3

    move-object/from16 v21, v7

    move-object v5, v11

    move-object v7, v2

    const-wide/16 v2, 0x1

    goto/16 :goto_25

    :cond_43
    move-wide/from16 v14, v21

    move-object/from16 v21, v7

    iget-object v7, v6, Lpv7;->h:Ljava/lang/Long;

    if-eqz v7, :cond_44

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v23, v10

    move-object/from16 v22, v11

    goto :goto_23

    :cond_44
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v7

    move-object/from16 v23, v10

    move-object/from16 v22, v11

    invoke-virtual {v9}, Ldk8;->z()J

    move-result-wide v10

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-wide/from16 v2, v17

    invoke-virtual {v7, v10, v11, v2, v3}, LOW8;->u0(JJ)J

    move-result-wide v17

    :goto_23
    cmp-long v2, v17, v14

    if-eqz v2, :cond_46

    iget-object v2, v1, LhV8;->g:LDV8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    const-wide/16 v2, 0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    move-object/from16 v10, p3

    invoke-static {v9, v10, v7}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v7, v1, LhV8;->g:LDV8;

    invoke-static {v7}, LhV8;->R(LTR8;)LTR8;

    int-to-long v10, v5

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v9, v13, v5}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9}, LUS8;->q()LpU8;

    move-result-object v7

    check-cast v7, Lpk8;

    move-object/from16 v10, v25

    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_45

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v11, 0x0

    invoke-virtual {v6, v11, v5, v7}, Lpv7;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpv7;

    move-result-object v6

    :cond_45
    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9}, Ldk8;->A()J

    move-result-wide v11

    invoke-virtual {v6, v11, v12, v14, v15}, Lpv7;->b(JJ)Lpv7;

    move-result-object v6

    move-object/from16 v7, v24

    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_24

    :cond_46
    move-object/from16 v7, v24

    move-object/from16 v10, v25

    const-wide/16 v2, 0x1

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_47

    invoke-virtual {v9}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v11, v23

    const/4 v12, 0x0

    invoke-virtual {v6, v11, v12, v12}, Lpv7;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpv7;

    move-result-object v6

    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_47
    :goto_24
    move-object/from16 v5, v22

    :goto_25
    invoke-virtual {v5, v8, v9}, Lqn8;->W(ILdk8;)Lqn8;

    :goto_26
    add-int/lit8 v8, v8, 0x1

    move-object v11, v5

    move-object v2, v7

    move-object v3, v10

    move-object/from16 v7, v21

    const-wide/16 v5, 0x0

    goto/16 :goto_1b

    :cond_48
    move-object v7, v2

    move-object v10, v3

    move-object v5, v11

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v5}, Lqn8;->e0()I

    move-result v3

    if-ge v2, v3, :cond_49

    invoke-virtual {v5}, Lqn8;->X0()Lqn8;

    invoke-virtual {v5, v10}, Lqn8;->K0(Ljava/lang/Iterable;)Lqn8;

    :cond_49
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    iget-object v6, v1, LhV8;->c:Ltq7;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpv7;

    invoke-virtual {v6, v3}, Ltq7;->n(Lpv7;)V

    goto :goto_27

    :cond_4a
    move-object v5, v11

    :cond_4b
    iget-object v2, v4, LJU8;->a:LCn8;

    invoke-virtual {v2}, LCn8;->W1()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3, v2}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v3

    if-nez v3, :cond_4c

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v6, "Bundling raw events w/o app info. appId"

    iget-object v7, v4, LJU8;->a:LCn8;

    invoke-virtual {v7}, LCn8;->W1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2c

    :cond_4c
    invoke-virtual {v5}, Lqn8;->e0()I

    move-result v6

    if-lez v6, :cond_51

    invoke-virtual {v3}, Lpt8;->b0()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_4d

    invoke-virtual {v5, v6, v7}, Lqn8;->g0(J)Lqn8;

    goto :goto_28

    :cond_4d
    invoke-virtual {v5}, Lqn8;->c1()Lqn8;

    :goto_28
    invoke-virtual {v3}, Lpt8;->d0()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-nez v12, :cond_4e

    goto :goto_29

    :cond_4e
    move-wide v6, v8

    :goto_29
    cmp-long v8, v6, v10

    if-eqz v8, :cond_4f

    invoke-virtual {v5, v6, v7}, Lqn8;->h0(J)Lqn8;

    goto :goto_2a

    :cond_4f
    invoke-virtual {v5}, Lqn8;->d1()Lqn8;

    :goto_2a
    invoke-virtual {v3}, Lpt8;->f()V

    invoke-virtual {v3}, Lpt8;->c0()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v5, v6}, Lqn8;->I(I)Lqn8;

    invoke-virtual {v5}, Lqn8;->H0()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Lpt8;->D(J)V

    invoke-virtual {v5}, Lqn8;->G0()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Lpt8;->B(J)V

    invoke-virtual {v3}, Lpt8;->h0()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_50

    invoke-virtual {v5, v6}, Lqn8;->a0(Ljava/lang/String;)Lqn8;

    goto :goto_2b

    :cond_50
    invoke-virtual {v5}, Lqn8;->Z0()Lqn8;

    :goto_2b
    iget-object v6, v1, LhV8;->c:Ltq7;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v6, v3}, Ltq7;->m(Lpt8;)V

    :cond_51
    :goto_2c
    invoke-virtual {v5}, Lqn8;->e0()I

    move-result v3

    if-lez v3, :cond_58

    iget-object v3, v1, LhV8;->l:LPn8;

    invoke-virtual {v3}, LPn8;->C()LFg7;

    iget-object v3, v1, LhV8;->a:LOk8;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    iget-object v6, v4, LJU8;->a:LCn8;

    invoke-virtual {v6}, LCn8;->W1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, LOk8;->q(Ljava/lang/String;)LCg8;

    move-result-object v3

    const-wide/16 v6, -0x1

    if-eqz v3, :cond_53

    invoke-virtual {v3}, LCg8;->V()Z

    move-result v8

    if-nez v8, :cond_52

    goto :goto_2d

    :cond_52
    invoke-virtual {v3}, LCg8;->D()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Lqn8;->M(J)Lqn8;

    goto :goto_2e

    :cond_53
    :goto_2d
    iget-object v3, v4, LJU8;->a:LCn8;

    invoke-virtual {v3}, LCn8;->H()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_54

    invoke-virtual {v5, v6, v7}, Lqn8;->M(J)Lqn8;

    goto :goto_2e

    :cond_54
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->t()Lec8;

    move-result-object v3

    const-string v8, "Did not find measurement config or missing version info. appId"

    iget-object v9, v4, LJU8;->a:LCn8;

    invoke-virtual {v9}, LCn8;->W1()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2e
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v5}, LUS8;->q()LpU8;

    move-result-object v5

    check-cast v5, LCn8;

    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, LCn8;->W1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v5}, LCn8;->m1()Z

    move-result v8

    invoke-static {v8}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(Z)V

    invoke-virtual {v3}, Ltq7;->h0()V

    iget-object v8, v3, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v8

    invoke-interface {v8}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v5}, LCn8;->I1()J

    move-result-wide v10

    iget-object v12, v3, Lns8;->a:LPn8;

    invoke-virtual {v12}, LPn8;->w()Lgl7;

    invoke-static {}, Lgl7;->f()J

    move-result-wide v12

    sub-long v12, v8, v12

    cmp-long v10, v10, v12

    if-ltz v10, :cond_55

    invoke-virtual {v5}, LCn8;->I1()J

    move-result-wide v10

    iget-object v12, v3, Lns8;->a:LPn8;

    invoke-virtual {v12}, LPn8;->w()Lgl7;

    invoke-static {}, Lgl7;->f()J

    move-result-wide v12

    add-long/2addr v12, v8

    cmp-long v10, v10, v12

    if-lez v10, :cond_56

    :cond_55
    iget-object v10, v3, Lns8;->a:LPn8;

    invoke-virtual {v10}, LPn8;->a()LFc8;

    move-result-object v10

    invoke-virtual {v10}, LFc8;->t()Lec8;

    move-result-object v10

    const-string v11, "Storing bundle outside of the max uploading time span. appId, now, timestamp"

    invoke-virtual {v5}, LCn8;->W1()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5}, LCn8;->I1()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v10, v11, v12, v8, v9}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_56
    invoke-virtual {v5}, LQJ8;->c()[B

    move-result-object v8
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    iget-object v9, v3, LIR8;->b:LhV8;

    iget-object v9, v9, LhV8;->g:LDV8;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v9, v8}, LDV8;->O([B)[B

    move-result-object v8
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    iget-object v9, v3, Lns8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->s()Lec8;

    move-result-object v9

    const-string v10, "Saving bundle, size"

    array-length v11, v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v9, Landroid/content/ContentValues;

    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "app_id"

    invoke-virtual {v5}, LCn8;->W1()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "bundle_end_timestamp"

    invoke-virtual {v5}, LCn8;->I1()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v10, "data"

    invoke-virtual {v9, v10, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v8, "has_realtime"

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v5}, LCn8;->s1()Z

    move-result v8

    if-eqz v8, :cond_57

    const-string v8, "retry_count"

    invoke-virtual {v5}, LCn8;->C1()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_57
    :try_start_d
    invoke-virtual {v3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const-string v10, "queue"

    const/4 v11, 0x0

    invoke-virtual {v8, v10, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v8

    cmp-long v6, v8, v6

    if-nez v6, :cond_58

    iget-object v6, v3, Lns8;->a:LPn8;

    invoke-virtual {v6}, LPn8;->a()LFc8;

    move-result-object v6

    invoke-virtual {v6}, LFc8;->o()Lec8;

    move-result-object v6

    const-string v7, "Failed to insert bundle (got -1). appId"

    invoke-virtual {v5}, LCn8;->W1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_2f

    :catch_1
    move-exception v0

    move-object v6, v0

    :try_start_e
    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v7, "Error storing bundle. appId"

    invoke-virtual {v5}, LCn8;->W1()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v7, v5, v6}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2f

    :catch_2
    move-exception v0

    move-object v6, v0

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v7, "Data loss. Failed to serialize bundle. appId"

    invoke-virtual {v5}, LCn8;->W1()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v7, v5, v6}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_58
    :goto_2f
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    iget-object v4, v4, LJU8;->b:Ljava/util/List;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "rowid in ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    :goto_30
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_5a

    if-eqz v6, :cond_59

    const-string v7, ","

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_59
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_30

    :cond_5a
    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "raw_events"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-eq v5, v6, :cond_5b

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v6, "Deleted fewer rows from raw events table than expected"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v6, v5, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5b
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :try_start_f
    const-string v5, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v7, 0x1

    aput-object v2, v6, v7

    invoke-virtual {v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto :goto_31

    :catch_3
    move-exception v0

    move-object v4, v0

    :try_start_10
    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v5, "Failed to remove unused event metadata. appId"

    invoke-static {v2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v5, v2, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_31
    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    const/4 v2, 0x1

    return v2

    :cond_5c
    :goto_32
    :try_start_11
    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->l()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    const/4 v2, 0x0

    return v2

    :catchall_0
    move-exception v0

    move-object v2, v0

    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3}, Ltq7;->f0()V

    throw v2
.end method

.method public final O()Z
    .locals 1

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->Z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final P(Ldk8;Ldk8;)Z
    .locals 8

    invoke-virtual {p1}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    iget-object v0, p0, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lpk8;

    const-string v2, "_sc"

    invoke-static {v0, v2}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpl8;->I()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v3, p0, LhV8;->g:LDV8;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object v3

    check-cast v3, Lpk8;

    const-string v4, "_pc"

    invoke-static {v3, v4}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lpl8;->I()Ljava/lang/String;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ldk8;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    iget-object v0, p0, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lpk8;

    const-string v1, "_et"

    invoke-static {v0, v1}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lpl8;->X()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lpl8;->E()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lpl8;->E()J

    move-result-wide v2

    iget-object v0, p0, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lpk8;

    invoke-static {v0, v1}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpl8;->E()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-lez v4, :cond_3

    invoke-virtual {v0}, Lpl8;->E()J

    move-result-wide v4

    add-long/2addr v2, v4

    :cond_3
    iget-object v0, p0, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2, v1, v0}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p0, LhV8;->g:LDV8;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "_fr"

    invoke-static {p1, v0, p2}, LDV8;->P(Ldk8;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public final S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;
    .locals 11

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LhV8;->B:Ljava/util/Map;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    new-instance v3, LWU8;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzq;->x:Ljava/lang/String;

    invoke-direct {v3, p0, v4, v1}, LWU8;-><init>(LhV8;Ljava/lang/String;LLU8;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {p0, v2}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzq;->w:Ljava/lang/String;

    invoke-static {v3}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v3

    invoke-virtual {v2, v3}, LXm7;->c(LXm7;)LXm7;

    move-result-object v2

    sget-object v3, Lcm7;->c:Lcm7;

    invoke-virtual {v2, v3}, LXm7;->i(Lcm7;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, LhV8;->i:LVN8;

    iget-object v5, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    iget-boolean v6, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Z

    invoke-virtual {v4, v5, v6}, LVN8;->l(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    const-string v4, ""

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lpt8;

    iget-object v5, p0, LhV8;->l:LPn8;

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-direct {v0, v5, v6}, Lpt8;-><init>(LPn8;Ljava/lang/String;)V

    sget-object v5, Lcm7;->d:Lcm7;

    invoke-virtual {v2, v5}, LXm7;->i(Lcm7;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, v2}, LhV8;->i0(LXm7;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lpt8;->i(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, v3}, LXm7;->i(Lcm7;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v4}, Lpt8;->G(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v2, v3}, LXm7;->i(Lcm7;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lpt8;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v4}, Lpt8;->G(Ljava/lang/String;)V

    iget-boolean v3, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, LhV8;->i:LVN8;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, LVN8;->k(Ljava/lang/String;LXm7;)Landroid/util/Pair;

    move-result-object v3

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v4, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p0, v2}, LhV8;->i0(LXm7;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lpt8;->i(Ljava/lang/String;)V

    iget-object v2, p0, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v4, "_id"

    invoke-virtual {v2, v3, v4}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v2, v3, v4}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v7

    new-instance v2, LqW8;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v5, "auto"

    const-string v6, "_lair"

    const-wide/16 v9, 0x1

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v3, p0, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3, v2}, Ltq7;->u(LqW8;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lpt8;->j0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lcm7;->d:Lcm7;

    invoke-virtual {v2, v3}, LXm7;->i(Lcm7;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, LhV8;->i0(LXm7;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lpt8;->i(Ljava/lang/String;)V

    :cond_5
    :goto_1
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpt8;->x(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->r:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpt8;->g(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->l:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpt8;->w(Ljava/lang/String;)V

    :cond_6
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->f:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v2, v3}, Lpt8;->y(J)V

    :cond_7
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->d:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpt8;->k(Ljava/lang/String;)V

    :cond_8
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->k:J

    invoke-virtual {v0, v2, v3}, Lpt8;->l(J)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->e:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v0, v2}, Lpt8;->j(Ljava/lang/String;)V

    :cond_9
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->g:J

    invoke-virtual {v0, v2, v3}, Lpt8;->t(J)V

    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    invoke-virtual {v0, v2}, Lpt8;->E(Z)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->h:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpt8;->z(Ljava/lang/String;)V

    :cond_a
    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Z

    invoke-virtual {v0, v2}, Lpt8;->h(Z)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->s:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lpt8;->F(Ljava/lang/Boolean;)V

    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->t:J

    invoke-virtual {v0, v2, v3}, Lpt8;->u(J)V

    invoke-static {}, Ltk9;->b()Z

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v2

    sget-object v3, La98;->o0:LL88;

    invoke-virtual {v2, v1, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    sget-object v4, La98;->q0:LL88;

    invoke-virtual {v2, v3, v4}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpt8;->I(Ljava/lang/String;)V

    :cond_c
    invoke-static {}, LNb9;->b()Z

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v2

    sget-object v3, La98;->n0:LL88;

    invoke-virtual {v2, v1, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->u:Ljava/util/List;

    invoke-virtual {v0, v2}, Lpt8;->H(Ljava/util/List;)V

    goto :goto_2

    :cond_d
    invoke-static {}, LNb9;->b()Z

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v2

    sget-object v3, La98;->m0:LL88;

    invoke-virtual {v2, v1, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v0, v1}, Lpt8;->H(Ljava/util/List;)V

    :cond_e
    :goto_2
    invoke-static {}, LWl9;->b()Z

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v2

    sget-object v3, La98;->s0:LL88;

    invoke-virtual {v2, v1, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->z:Z

    invoke-virtual {v0, v2}, Lpt8;->J(Z)V

    :cond_f
    invoke-static {}, LYg9;->b()Z

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v2

    sget-object v3, La98;->G0:LL88;

    invoke-virtual {v2, v1, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzq;->A:J

    invoke-virtual {v0, v1, v2}, Lpt8;->K(J)V

    :cond_10
    invoke-virtual {v0}, Lpt8;->N()Z

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1, v0}, Ltq7;->m(Lpt8;)V

    :cond_11
    return-object v0
.end method

.method public final T()LFf7;
    .locals 1

    iget-object v0, p0, LhV8;->f:LFf7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    return-object v0
.end method

.method public final U()Lgl7;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    return-object v0
.end method

.method public final V(Ljava/lang/String;)LXm7;
    .locals 6

    sget-object v0, LXm7;->b:LXm7;

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    iget-object v0, p0, LhV8;->A:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXm7;

    if-nez v0, :cond_2

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {v0}, LTR8;->f()V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "select consent_state from consent_settings where app_id=? limit 1;"

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    const-string v0, "G1"

    :goto_0
    invoke-static {v0}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LhV8;->x(Ljava/lang/String;LXm7;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v1, "Database error"

    invoke-virtual {v0, v1, v4, p1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    if-eqz v5, :cond_1

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_1
    throw p1

    :cond_2
    :goto_2
    return-object v0
.end method

.method public final W()Ltq7;
    .locals 1

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    return-object v0
.end method

.method public final X()Lqb8;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->D()Lqb8;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Lbf8;
    .locals 1

    iget-object v0, p0, LhV8;->b:Lbf8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    return-object v0
.end method

.method public final Z()LEf8;
    .locals 2

    iget-object v0, p0, LhV8;->d:LEf8;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a()LFc8;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    return-object v0
.end method

.method public final a0()LOk8;
    .locals 1

    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    return-object v0
.end method

.method public final b()V
    .locals 9
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    iget-boolean v0, p0, LhV8;->n:Z

    if-nez v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, LhV8;->n:Z

    invoke-virtual {p0}, LhV8;->E()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, LhV8;->w:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v2

    invoke-virtual {v2}, Lns8;->e()V

    const-wide/16 v2, 0x0

    const-string v4, "Bad channel to read from"

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    :try_start_0
    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v7}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-eq v1, v5, :cond_1

    const/4 v7, -0x1

    if-eq v1, v7, :cond_3

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->t()Lec8;

    move-result-object v7

    const-string v8, "Unexpected data length. Bytes read"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v8, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->o()Lec8;

    move-result-object v7

    const-string v8, "Failed to read from channel"

    invoke-virtual {v7, v8, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    invoke-virtual {v1, v4}, Lec8;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-object v1, p0, LhV8;->l:LPn8;

    invoke-virtual {v1}, LPn8;->y()Lla8;

    move-result-object v1

    invoke-virtual {v1}, Lla8;->m()I

    move-result v1

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v7

    invoke-virtual {v7}, Lns8;->e()V

    if-le v6, v1, :cond_4

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    if-ge v6, v1, :cond_8

    iget-object v7, p0, LhV8;->w:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v8

    invoke-virtual {v8}, Lns8;->e()V

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :try_start_1
    invoke-virtual {v7, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v7, v4}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    invoke-virtual {v7, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_6

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v2, "Error writing to channel. Bytes written"

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_6
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgraded. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to write to channel"

    invoke-virtual {v2, v3, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    :goto_2
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    invoke-virtual {v0, v4}, Lec8;->a(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgrade failed. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public final c()Ldn8;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    return-object v0
.end method

.method public final c0()LPn8;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-boolean v0, p0, LhV8;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UploadController is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d0()LYD8;
    .locals 1

    iget-object v0, p0, LhV8;->h:LYD8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    return-object v0
.end method

.method public final e(Ljava/lang/String;Lqn8;)V
    .locals 5

    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->v(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lqn8;->M0(Ljava/lang/Iterable;)Lqn8;

    :cond_0
    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->J(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lqn8;->U0()Lqn8;

    :cond_1
    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->M(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v0

    sget-object v2, La98;->t0:LL88;

    invoke-virtual {v0, p1, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lqn8;->A0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v1, :cond_3

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lqn8;->c0(Ljava/lang/String;)Lqn8;

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lqn8;->b1()Lqn8;

    :cond_3
    :goto_0
    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "_id"

    invoke-static {p2, v0}, LDV8;->t(Lqn8;Ljava/lang/String;)I

    move-result v0

    if-eq v0, v1, :cond_4

    invoke-virtual {p2, v0}, Lqn8;->z(I)Lqn8;

    :cond_4
    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->L(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lqn8;->V0()Lqn8;

    :cond_5
    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->I(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lqn8;->S0()Lqn8;

    iget-object v0, p0, LhV8;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWU8;

    if-eqz v0, :cond_6

    iget-wide v1, v0, LWU8;->b:J

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v3

    sget-object v4, La98;->V:LL88;

    invoke-virtual {v3, p1, v4}, Lgl7;->o(Ljava/lang/String;LL88;)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_7

    :cond_6
    new-instance v0, LWU8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LWU8;-><init>(LhV8;LLU8;)V

    iget-object v1, p0, LhV8;->B:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v0, v0, LWU8;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lqn8;->V(Ljava/lang/String;)Lqn8;

    :cond_8
    iget-object v0, p0, LhV8;->a:LOk8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, p1}, LOk8;->K(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Lqn8;->f1()Lqn8;

    :cond_9
    return-void
.end method

.method public final e0()LVN8;
    .locals 1

    iget-object v0, p0, LhV8;->i:LVN8;

    return-object v0
.end method

.method public final f(Lpt8;)V
    .locals 12

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p1}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lpt8;->g0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lpt8;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xcc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, LhV8;->k(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, LhV8;->j:LxS8;

    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {p1}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lpt8;->g0()Ljava/lang/String;

    move-result-object v2

    :cond_2
    sget-object v3, La98;->g:LL88;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v5, La98;->h:LL88;

    invoke-virtual {v5, v4}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "config/app/"

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "platform"

    const-string v5, "android"

    invoke-virtual {v2, v3, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->n()J

    const-wide/32 v5, 0x12cc8

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v3, "gmp_version"

    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v2, "runtime_version"

    const-string v3, "0"

    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "Fetching remote configuration"

    invoke-virtual {v1, v2, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, LhV8;->a:LOk8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1, v7}, LOk8;->q(Ljava/lang/String;)LCg8;

    move-result-object v1

    iget-object v2, p0, LhV8;->a:LOk8;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2, v7}, LOk8;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_5

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lso;

    invoke-direct {v1}, Lso;-><init>()V

    const-string v3, "If-Modified-Since"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v1

    :cond_3
    iget-object v1, p0, LhV8;->a:LOk8;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1, v7}, LOk8;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    if-nez v4, :cond_4

    new-instance v2, Lso;

    invoke-direct {v2}, Lso;-><init>()V

    move-object v4, v2

    :cond_4
    const-string v2, "If-None-Match"

    invoke-interface {v4, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    move-object v10, v4

    const/4 v1, 0x1

    iput-boolean v1, p0, LhV8;->s:Z

    iget-object v6, p0, LhV8;->b:Lbf8;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    new-instance v11, LVS8;

    invoke-direct {v11, p0}, LVS8;-><init>(LhV8;)V

    invoke-virtual {v6}, Lns8;->e()V

    invoke-virtual {v6}, LTR8;->f()V

    invoke-static {v8}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v11}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v6, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v2, LUd8;

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, LUd8;-><init>(Lbf8;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lpd8;)V

    invoke-virtual {v1, v2}, Ldn8;->v(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    invoke-virtual {p1}, Lpt8;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to parse config URL. Not fetching. appId"

    invoke-virtual {v1, v2, p1, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v2

    invoke-virtual {v2}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    move-object/from16 v3, p1

    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    invoke-static/range {p1 .. p1}, LUc8;->b(Lcom/google/android/gms/measurement/internal/zzaw;)LUc8;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v4

    invoke-virtual {v4}, Lns8;->e()V

    iget-object v4, v1, LhV8;->C:LwE8;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v1, LhV8;->D:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v5, v1, LhV8;->C:LwE8;

    :cond_1
    :goto_0
    iget-object v4, v3, LUc8;->d:Landroid/os/Bundle;

    const/4 v6, 0x0

    invoke-static {v5, v4, v6}, LOW8;->v(LwE8;Landroid/os/Bundle;Z)V

    invoke-virtual {v3}, LUc8;->a()Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v3

    iget-object v4, v1, LhV8;->g:LDV8;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v3, v0}, LDV8;->j(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v4

    if-nez v4, :cond_2

    return-void

    :cond_2
    iget-boolean v4, v0, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-nez v4, :cond_3

    invoke-virtual {v1, v0}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void

    :cond_3
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzq;->u:Ljava/util/List;

    if-eqz v4, :cond_5

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzau;->u()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "ga_safelisted"

    const-wide/16 v7, 0x1

    invoke-virtual {v4, v5, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    new-instance v5, Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v13, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    new-instance v14, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v14, v4}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    iget-object v15, v3, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    iget-wide v3, v3, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    move-object v12, v5

    move-wide/from16 v16, v3

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    goto :goto_1

    :cond_4
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzaw;->d:Ljava/lang/String;

    const-string v5, "Dropping non-safelisted event. appId, event name, origin"

    invoke-virtual {v0, v5, v2, v4, v3}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    move-object v12, v3

    :goto_1
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3}, Ltq7;->e0()V

    :try_start_0
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    const-wide/16 v4, 0x0

    cmp-long v4, v10, v4

    const/4 v5, 0x2

    const/4 v13, 0x1

    if-gez v4, :cond_6

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->t()Lec8;

    move-result-object v3

    const-string v7, "Invalid time querying timed out conditional properties"

    invoke-static {v2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3, v7, v8, v9}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_2

    :cond_6
    const-string v7, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    new-array v8, v5, [Ljava/lang/String;

    aput-object v2, v8, v6

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v13

    invoke-virtual {v3, v7, v8}, Ltq7;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/zzac;

    if-eqz v7, :cond_7

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->s()Lec8;

    move-result-object v8

    const-string v9, "User property timed out"

    iget-object v14, v7, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    iget-object v15, v1, LhV8;->l:LPn8;

    invoke-virtual {v15}, LPn8;->D()Lqb8;

    move-result-object v15

    iget-object v13, v7, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v13, v13, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v15, v13}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v8, v9, v14, v13, v15}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v8, v7, Lcom/google/android/gms/measurement/internal/zzac;->h:Lcom/google/android/gms/measurement/internal/zzaw;

    if-eqz v8, :cond_8

    new-instance v9, Lcom/google/android/gms/measurement/internal/zzaw;

    invoke-direct {v9, v8, v10, v11}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Lcom/google/android/gms/measurement/internal/zzaw;J)V

    invoke-virtual {v1, v9, v0}, LhV8;->D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_8
    iget-object v8, v1, LhV8;->c:Ltq7;

    invoke-static {v8}, LhV8;->R(LTR8;)LTR8;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v8, v2, v7}, Ltq7;->J(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v13, 0x1

    goto :goto_3

    :cond_9
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    if-gez v4, :cond_a

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->t()Lec8;

    move-result-object v3

    const-string v7, "Invalid time querying expired conditional properties"

    invoke-static {v2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3, v7, v8, v9}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_4

    :cond_a
    const-string v7, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    new-array v8, v5, [Ljava/lang/String;

    aput-object v2, v8, v6

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x1

    aput-object v9, v8, v13

    invoke-virtual {v3, v7, v8}, Ltq7;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_4
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/measurement/internal/zzac;

    if-eqz v8, :cond_b

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v9

    invoke-virtual {v9}, LFc8;->s()Lec8;

    move-result-object v9

    const-string v13, "User property expired"

    iget-object v14, v8, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    iget-object v15, v1, LhV8;->l:LPn8;

    invoke-virtual {v15}, LPn8;->D()Lqb8;

    move-result-object v15

    iget-object v5, v8, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v15, v5}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v15, v8, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v9, v13, v14, v5, v15}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v5, v1, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v5, v2, v9}, Ltq7;->j(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v8, Lcom/google/android/gms/measurement/internal/zzac;->l:Lcom/google/android/gms/measurement/internal/zzaw;

    if-eqz v5, :cond_c

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    iget-object v5, v1, LhV8;->c:Ltq7;

    invoke-static {v5}, LhV8;->R(LTR8;)LTR8;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v5, v2, v8}, Ltq7;->J(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v5, 0x2

    goto :goto_5

    :cond_d
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/measurement/internal/zzaw;

    new-instance v7, Lcom/google/android/gms/measurement/internal/zzaw;

    invoke-direct {v7, v5, v10, v11}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Lcom/google/android/gms/measurement/internal/zzaw;J)V

    invoke-virtual {v1, v7, v0}, LhV8;->D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_6

    :cond_e
    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    iget-object v5, v12, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lns8;->e()V

    invoke-virtual {v3}, LTR8;->f()V

    if-gez v4, :cond_f

    iget-object v4, v3, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->t()Lec8;

    move-result-object v4

    const-string v6, "Invalid time querying triggered conditional properties"

    invoke-static {v2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->D()Lqb8;

    move-result-object v3

    invoke-virtual {v3, v5}, Lqb8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v6, v2, v3, v5}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_7

    :cond_f
    const-string v4, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/String;

    aput-object v2, v7, v6

    const/4 v2, 0x1

    aput-object v5, v7, v2

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v7, v5

    invoke-virtual {v3, v4, v7}, Ltq7;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_7
    new-instance v13, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/google/android/gms/measurement/internal/zzac;

    if-eqz v14, :cond_10

    iget-object v3, v14, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    new-instance v15, LqW8;

    iget-object v4, v14, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v3, v15

    move-wide v7, v10

    invoke-direct/range {v3 .. v9}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3, v15}, Ltq7;->u(LqW8;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->s()Lec8;

    move-result-object v3

    const-string v4, "User property triggered"

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    iget-object v6, v1, LhV8;->l:LPn8;

    invoke-virtual {v6}, LPn8;->D()Lqb8;

    move-result-object v6

    iget-object v7, v15, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v15, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v7}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_11
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v4, "Too many active user properties, ignoring"

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v5}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, LhV8;->l:LPn8;

    invoke-virtual {v6}, LPn8;->D()Lqb8;

    move-result-object v6

    iget-object v7, v15, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v15, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6, v7}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_9
    iget-object v3, v14, Lcom/google/android/gms/measurement/internal/zzac;->j:Lcom/google/android/gms/measurement/internal/zzaw;

    if-eqz v3, :cond_12

    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-direct {v3, v15}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(LqW8;)V

    iput-object v3, v14, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    const/4 v3, 0x1

    iput-boolean v3, v14, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    iget-object v4, v1, LhV8;->c:Ltq7;

    invoke-static {v4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v4, v14}, Ltq7;->t(Lcom/google/android/gms/measurement/internal/zzac;)Z

    goto/16 :goto_8

    :cond_13
    invoke-virtual {v1, v12, v0}, LhV8;->D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/zzaw;

    new-instance v4, Lcom/google/android/gms/measurement/internal/zzaw;

    invoke-direct {v4, v3, v10, v11}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Lcom/google/android/gms/measurement/internal/zzaw;J)V

    invoke-virtual {v1, v4, v0}, LhV8;->D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_a

    :cond_14
    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->f0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    throw v0
.end method

.method public final g0()LDV8;
    .locals 1

    iget-object v0, p0, LhV8;->g:LDV8;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    return-object v0
.end method

.method public final h(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    iget-object v2, v0, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2, v3}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v15

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0, v15}, LhV8;->J(Lpt8;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const-string v4, "_ui"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    invoke-static/range {p2 .. p2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Could not find package. appId"

    invoke-virtual {v2, v5, v4}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    invoke-static/range {p2 .. p2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "App version does not match; dropping event. appId"

    invoke-virtual {v1, v3, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    :goto_0
    new-instance v14, Lcom/google/android/gms/measurement/internal/zzq;

    move-object v2, v14

    invoke-virtual {v15}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15}, Lpt8;->P()J

    move-result-wide v6

    invoke-virtual {v15}, Lpt8;->k0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15}, Lpt8;->a0()J

    move-result-wide v9

    invoke-virtual {v15}, Lpt8;->X()J

    move-result-wide v11

    const/4 v13, 0x0

    invoke-virtual {v15}, Lpt8;->M()Z

    move-result v16

    move-object/from16 v36, v14

    move/from16 v14, v16

    const/16 v16, 0x0

    move-object/from16 v31, v15

    move/from16 v15, v16

    invoke-virtual/range {v31 .. v31}, Lpt8;->m0()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v31 .. v31}, Lpt8;->A()J

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v31 .. v31}, Lpt8;->L()Z

    move-result v22

    const/16 v23, 0x0

    invoke-virtual/range {v31 .. v31}, Lpt8;->g0()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v31 .. v31}, Lpt8;->f0()Ljava/lang/Boolean;

    move-result-object v25

    invoke-virtual/range {v31 .. v31}, Lpt8;->Y()J

    move-result-wide v26

    invoke-virtual/range {v31 .. v31}, Lpt8;->d()Ljava/util/List;

    move-result-object v28

    const/16 v29, 0x0

    invoke-virtual {v0, v3}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, LXm7;->h()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v31 .. v31}, Lpt8;->O()Z

    move-result v33

    invoke-virtual/range {v31 .. v31}, Lpt8;->e0()J

    move-result-wide v34

    const-string v31, ""

    const/16 v32, 0x0

    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v35}, Lcom/google/android/gms/measurement/internal/zzq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V

    move-object/from16 v2, v36

    invoke-virtual {v0, v1, v2}, LhV8;->i(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v2, "No app data available; dropping event"

    invoke-virtual {v1, v2, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final h0()LOW8;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 8

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, LUc8;->b(Lcom/google/android/gms/measurement/internal/zzaw;)LUc8;

    move-result-object p1

    invoke-virtual {p0}, LhV8;->h0()LOW8;

    move-result-object v0

    iget-object v1, p1, LUc8;->d:Landroid/os/Bundle;

    iget-object v2, p0, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, p2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ltq7;->Q(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LOW8;->w(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {p0}, LhV8;->h0()LOW8;

    move-result-object v0

    invoke-virtual {p0}, LhV8;->U()Lgl7;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lgl7;->k(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, LOW8;->y(LUc8;I)V

    invoke-virtual {p1}, LUc8;->a()Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object p1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    const-string v1, "_cmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    const-string v1, "_cis"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "referrer API v2"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    const-string v1, "gclid"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzlj;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    const-string v7, "auto"

    const-string v3, "_lgclid"

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, LhV8;->g(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void
.end method

.method public final i0(LXm7;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcm7;->d:Lcm7;

    invoke-virtual {p1, v0}, LXm7;->i(Lcm7;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p0}, LhV8;->h0()LOW8;

    move-result-object v0

    invoke-virtual {v0}, LOW8;->r()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    const/4 p1, 0x0

    aput-object v3, v2, p1

    const-string p1, "%032x"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final j()V
    .locals 1

    iget v0, p0, LhV8;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LhV8;->r:I

    return-void
.end method

.method public final j0(Lcom/google/android/gms/measurement/internal/zzq;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LgT8;

    invoke-direct {v1, p0, p1}, LgT8;-><init>(LhV8;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {v0, v1}, Ldn8;->p(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x7530

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get app instance id. appId"

    invoke-virtual {v1, v2, p1, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    :cond_0
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "onConfigFetched. Response size"

    array-length v3, p4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, Ltq7;->e0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1, p1}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v1

    const/16 v2, 0xc8

    const/16 v4, 0x130

    if-eq p2, v2, :cond_1

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_1

    if-ne p2, v4, :cond_2

    move p2, v4

    :cond_1
    if-nez p3, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v0

    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->t()Lec8;

    move-result-object p2

    const-string p3, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    const/16 v5, 0x194

    if-nez v2, :cond_7

    if-ne p2, v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p4

    invoke-interface {p4}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p4

    invoke-virtual {v1, p4, p5}, Lpt8;->v(J)V

    iget-object p4, p0, LhV8;->c:Ltq7;

    invoke-static {p4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p4, v1}, Ltq7;->m(Lpt8;)V

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p4

    invoke-virtual {p4}, LFc8;->s()Lec8;

    move-result-object p4

    const-string p5, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p5, v1, p3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p3, p0, LhV8;->a:LOk8;

    invoke-static {p3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p3, p1}, LOk8;->w(Ljava/lang/String;)V

    iget-object p1, p0, LhV8;->i:LVN8;

    iget-object p1, p1, LVN8;->h:Lzg8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lzg8;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_5

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_6

    :cond_5
    iget-object p1, p0, LhV8;->i:LVN8;

    iget-object p1, p1, LVN8;->f:Lzg8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lzg8;->b(J)V

    :cond_6
    invoke-virtual {p0}, LhV8;->M()V

    goto/16 :goto_9

    :cond_7
    :goto_1
    const/4 p3, 0x0

    if-eqz p5, :cond_8

    const-string v2, "Last-Modified"

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_2

    :cond_8
    move-object v2, p3

    :goto_2
    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    :cond_9
    move-object v2, p3

    :goto_3
    if-eqz p5, :cond_a

    const-string v6, "ETag"

    invoke-interface {p5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/List;

    goto :goto_4

    :cond_a
    move-object p5, p3

    :goto_4
    if-eqz p5, :cond_b

    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    goto :goto_5

    :cond_b
    move-object p5, p3

    :goto_5
    if-eq p2, v5, :cond_d

    if-ne p2, v4, :cond_c

    goto :goto_6

    :cond_c
    iget-object p3, p0, LhV8;->a:LOk8;

    invoke-static {p3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p3, p1, p4, v2, p5}, LOk8;->H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    goto :goto_7

    :cond_d
    :goto_6
    iget-object p4, p0, LhV8;->a:LOk8;

    invoke-static {p4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p4, p1}, LOk8;->q(Ljava/lang/String;)LCg8;

    move-result-object p4

    if-nez p4, :cond_e

    iget-object p4, p0, LhV8;->a:LOk8;

    invoke-static {p4}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p4, p1, p3, p3, p3}, LOk8;->H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    :cond_e
    :goto_7
    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p3

    invoke-virtual {v1, p3, p4}, Lpt8;->m(J)V

    iget-object p3, p0, LhV8;->c:Ltq7;

    invoke-static {p3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p3, v1}, Ltq7;->m(Lpt8;)V

    if-ne p2, v5, :cond_f

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->u()Lec8;

    move-result-object p2

    const-string p3, "Config not found. Using empty config. appId"

    invoke-virtual {p2, p3, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_f
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string p3, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2, v3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    iget-object p1, p0, LhV8;->b:Lbf8;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Lbf8;->j()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, LhV8;->O()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, LhV8;->B()V

    goto :goto_9

    :cond_10
    invoke-virtual {p0}, LhV8;->M()V

    :goto_9
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->l()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->f0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v0, p0, LhV8;->s:Z

    invoke-virtual {p0}, LhV8;->K()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    iget-object p2, p0, LhV8;->c:Ltq7;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ltq7;->f0()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    iput-boolean v0, p0, LhV8;->s:Z

    invoke-virtual {p0}, LhV8;->K()V

    throw p1
.end method

.method public final l(Z)V
    .locals 0

    invoke-virtual {p0}, LhV8;->M()V

    return-void
.end method

.method public final l0(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LhV8;->p:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LhV8;->p:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LhV8;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final m(ILjava/lang/Throwable;[BLjava/lang/String;)V
    .locals 8
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object p4

    invoke-virtual {p4}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    const/4 p4, 0x0

    if-nez p3, :cond_0

    :try_start_0
    new-array p3, p4, [B

    :cond_0
    iget-object v0, p0, LhV8;->x:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, LhV8;->x:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v2, 0xc8

    if-eq p1, v2, :cond_1

    const/16 v2, 0xcc

    if-ne p1, v2, :cond_6

    move p1, v2

    :cond_1
    if-nez p2, :cond_6

    :try_start_1
    iget-object p2, p0, LhV8;->i:LVN8;

    iget-object p2, p2, LVN8;->g:Lzg8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lzg8;->b(J)V

    iget-object p2, p0, LhV8;->i:LVN8;

    iget-object p2, p2, LVN8;->h:Lzg8;

    const-wide/16 v2, 0x0

    invoke-virtual {p2, v2, v3}, Lzg8;->b(J)V

    invoke-virtual {p0}, LhV8;->M()V

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->s()Lec8;

    move-result-object p2

    const-string v4, "Successful upload. Got network response. code, size"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    array-length p3, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v4, p1, p3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->e0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object p3, p0, LhV8;->c:Ltq7;

    invoke-static {p3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p3}, Lns8;->e()V

    invoke-virtual {p3}, LTR8;->f()V

    invoke-virtual {p3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, p4
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v4, "queue"

    const-string v5, "rowid=?"

    invoke-virtual {v0, v4, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-ne v0, v6, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v4, "Deleted fewer rows from queue than expected"

    invoke-direct {v0, v4}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    move-exception v0

    :try_start_5
    iget-object p3, p3, Lns8;->a:LPn8;

    invoke-virtual {p3}, LPn8;->a()LFc8;

    move-result-object p3

    invoke-virtual {p3}, LFc8;->o()Lec8;

    move-result-object p3

    const-string v4, "Failed to delete a bundle in a queue table"

    invoke-virtual {p3, v4, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_1
    move-exception p3

    :try_start_6
    iget-object v0, p0, LhV8;->y:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    throw p3

    :cond_4
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->l()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->f0()V

    iput-object v1, p0, LhV8;->y:Ljava/util/List;

    iget-object p1, p0, LhV8;->b:Lbf8;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Lbf8;->j()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LhV8;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LhV8;->B()V

    goto :goto_1

    :cond_5
    const-wide/16 p1, -0x1

    iput-wide p1, p0, LhV8;->z:J

    invoke-virtual {p0}, LhV8;->M()V

    :goto_1
    iput-wide v2, p0, LhV8;->o:J

    goto :goto_2

    :catchall_0
    move-exception p1

    iget-object p2, p0, LhV8;->c:Ltq7;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ltq7;->f0()V

    throw p1
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catch_2
    move-exception p1

    :try_start_8
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->o()Lec8;

    move-result-object p2

    const-string p3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {p2, p3, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, LhV8;->o:J

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string p2, "Disable upload, time"

    iget-wide v0, p0, LhV8;->o:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p3

    invoke-virtual {p3}, LFc8;->s()Lec8;

    move-result-object p3

    const-string v1, "Network upload failed. Will retry later. code, error"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p3, v1, v2, p2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, LhV8;->i:LVN8;

    iget-object p2, p2, LVN8;->h:Lzg8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lzg8;->b(J)V

    const/16 p2, 0x1f7

    if-eq p1, p2, :cond_7

    const/16 p2, 0x1ad

    if-ne p1, p2, :cond_8

    :cond_7
    iget-object p1, p0, LhV8;->i:LVN8;

    iget-object p1, p1, LVN8;->f:Lzg8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lzg8;->b(J)V

    :cond_8
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1, v0}, Ltq7;->g0(Ljava/util/List;)V

    invoke-virtual {p0}, LhV8;->M()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    iput-boolean p4, p0, LhV8;->t:Z

    invoke-virtual {p0}, LhV8;->K()V

    return-void

    :catchall_1
    move-exception p1

    iput-boolean p4, p0, LhV8;->t:Z

    invoke-virtual {p0}, LhV8;->K()V

    throw p1
.end method

.method public final n(Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "_sysu"

    const-string v4, "_sys"

    const-string v5, "com.android.vending"

    const-string v6, "_pfo"

    const-string v0, "_npa"

    const-string v7, "_uwa"

    const-string v8, "app_id=?"

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v9

    invoke-virtual {v9}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p1 .. p1}, LhV8;->Q(Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v9

    if-eqz v9, :cond_27

    iget-object v9, v1, LhV8;->c:Ltq7;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v9

    const-wide/16 v10, 0x0

    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_0

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_0

    invoke-virtual {v9, v10, v11}, Lpt8;->m(J)V

    iget-object v12, v1, LhV8;->c:Ltq7;

    invoke-static {v12}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v12, v9}, Ltq7;->m(Lpt8;)V

    iget-object v9, v1, LhV8;->a:LOk8;

    invoke-static {v9}, LhV8;->R(LTR8;)LTR8;

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v9, v12}, LOk8;->x(Ljava/lang/String;)V

    :cond_0
    iget-boolean v9, v2, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-nez v9, :cond_1

    invoke-virtual/range {p0 .. p1}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void

    :cond_1
    iget-wide v12, v2, Lcom/google/android/gms/measurement/internal/zzq;->n:J

    cmp-long v9, v12, v10

    if-nez v9, :cond_2

    invoke-virtual/range {p0 .. p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v9

    invoke-interface {v9}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v12

    :cond_2
    iget-object v9, v1, LhV8;->l:LPn8;

    invoke-virtual {v9}, LPn8;->x()LJt7;

    move-result-object v9

    invoke-virtual {v9}, LJt7;->o()V

    iget v9, v2, Lcom/google/android/gms/measurement/internal/zzq;->o:I

    const/4 v15, 0x1

    if-eqz v9, :cond_3

    if-eq v9, v15, :cond_3

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LFc8;->t()Lec8;

    move-result-object v14

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v11, "Incorrect app type, assuming installed app. appId, appType"

    invoke-virtual {v14, v11, v10, v9}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x0

    :cond_3
    iget-object v10, v1, LhV8;->c:Ltq7;

    invoke-static {v10}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v10}, Ltq7;->e0()V

    :try_start_0
    iget-object v10, v1, LhV8;->c:Ltq7;

    invoke-static {v10}, LhV8;->R(LTR8;)LTR8;

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v10, v11, v0}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v10

    move-object v11, v3

    move-object/from16 v20, v4

    if-eqz v10, :cond_5

    const-string v14, "auto"

    iget-object v3, v10, LqW8;->b:Ljava/lang/String;

    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    move v4, v15

    goto :goto_2

    :cond_5
    :goto_0
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzq;->s:Ljava/lang/Boolean;

    if-eqz v3, :cond_8

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzlj;

    const-string v3, "_npa"

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzq;->s:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eq v15, v4, :cond_6

    const-wide/16 v18, 0x0

    goto :goto_1

    :cond_6
    const-wide/16 v18, 0x1

    :goto_1
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    const/4 v4, 0x0

    move-object v14, v0

    move v4, v15

    move-object v15, v3

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    if-eqz v10, :cond_7

    iget-object v3, v10, LqW8;->e:Ljava/lang/Object;

    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/zzlj;->e:Ljava/lang/Long;

    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_7
    invoke-virtual {v1, v0, v2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_2

    :cond_8
    move v4, v15

    if-eqz v10, :cond_9

    invoke-virtual {v1, v0, v2}, LhV8;->r(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_9
    :goto_2
    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ltq7;->R(Ljava/lang/String;)Lpt8;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v10

    iget-object v14, v2, Lcom/google/android/gms/measurement/internal/zzq;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lpt8;->n0()Ljava/lang/String;

    move-result-object v15

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzq;->r:Ljava/lang/String;

    invoke-virtual {v0}, Lpt8;->g0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v14, v15, v3, v4}, LOW8;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->t()Lec8;

    move-result-object v3

    const-string v4, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v0}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v3, v4, v10}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Lpt8;->i0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, LTR8;->f()V

    invoke-virtual {v3}, Lns8;->e()V

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v3}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v10, 0x1

    new-array v14, v10, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object v4, v14, v10

    const-string v10, "events"

    invoke-virtual {v0, v10, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    const-string v15, "user_attributes"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "conditional_properties"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "apps"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "raw_events"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "raw_events_metadata"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "event_filters"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "property_filters"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "audience_filter_values"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    const-string v15, "consent_settings"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v10, v15

    invoke-static {}, LOe9;->b()Z

    iget-object v15, v3, Lns8;->a:LPn8;

    invoke-virtual {v15}, LPn8;->w()Lgl7;

    move-result-object v15
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v21, v11

    :try_start_2
    sget-object v11, La98;->v0:LL88;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v22, v6

    const/4 v6, 0x0

    :try_start_3
    invoke-virtual {v15, v6, v11}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v11

    if-eqz v11, :cond_a

    const-string v6, "default_event_params"

    invoke-virtual {v0, v6, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v10, v0

    :cond_a
    if-lez v10, :cond_b

    iget-object v0, v3, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v6, "Deleted application data. app, records"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v6, v4, v8}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object/from16 v22, v6

    goto :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v22, v6

    move-object/from16 v21, v11

    :goto_3
    :try_start_4
    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v6, "Error deleting application data. appId, error"

    invoke-static {v4}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v6, v4, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_4
    const/4 v0, 0x0

    goto :goto_5

    :cond_c
    move-object/from16 v22, v6

    move-object/from16 v21, v11

    :goto_5
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lpt8;->P()J

    move-result-wide v3

    const-wide/32 v10, -0x80000000

    cmp-long v3, v3, v10

    if-eqz v3, :cond_d

    invoke-virtual {v0}, Lpt8;->P()J

    move-result-wide v3

    iget-wide v14, v2, Lcom/google/android/gms/measurement/internal/zzq;->k:J

    cmp-long v3, v3, v14

    if-eqz v3, :cond_d

    const/4 v15, 0x1

    goto :goto_6

    :cond_d
    const/4 v15, 0x0

    :goto_6
    invoke-virtual {v0}, Lpt8;->l0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lpt8;->P()J

    move-result-wide v16

    cmp-long v0, v16, v10

    if-nez v0, :cond_e

    if-eqz v3, :cond_e

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzq;->d:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    goto :goto_7

    :cond_e
    const/4 v0, 0x0

    :goto_7
    or-int/2addr v0, v15

    if-eqz v0, :cond_f

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v4, "_pv"

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzaw;

    const-string v15, "_au"

    new-instance v4, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v4, v0}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    invoke-virtual {v1, v3, v2}, LhV8;->g(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_f
    invoke-virtual/range {p0 .. p1}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    if-nez v9, :cond_10

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v4, "_f"

    invoke-virtual {v0, v3, v4}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v0

    const/4 v15, 0x0

    goto :goto_8

    :cond_10
    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v4, "_v"

    invoke-virtual {v0, v3, v4}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v0

    const/4 v15, 0x1

    :goto_8
    if-nez v0, :cond_25

    const-wide/32 v3, 0x36ee80

    div-long v8, v12, v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    mul-long/2addr v8, v3

    const-string v3, "_dac"

    const-string v4, "_et"

    const-string v6, "_r"

    const-string v10, "_c"

    if-nez v15, :cond_23

    :try_start_5
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzlj;

    const-string v15, "_fot"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, v1, LhV8;->k:Lxi8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lxi8;

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_11

    goto/16 :goto_a

    :cond_11
    iget-object v9, v8, Lxi8;->a:LPn8;

    invoke-virtual {v9}, LPn8;->c()Ldn8;

    move-result-object v9

    invoke-virtual {v9}, Lns8;->e()V

    invoke-virtual {v8}, Lxi8;->a()Z

    move-result v9

    if-nez v9, :cond_12

    iget-object v0, v8, Lxi8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->r()Lec8;

    move-result-object v0

    const-string v5, "Install Referrer Reporter is not available"

    invoke-virtual {v0, v5}, Lec8;->a(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_12
    new-instance v9, Lki8;

    invoke-direct {v9, v8, v0}, Lki8;-><init>(Lxi8;Ljava/lang/String;)V

    iget-object v0, v8, Lxi8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    new-instance v0, Landroid/content/Intent;

    const-string v11, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    invoke-direct {v0, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v11, Landroid/content/ComponentName;

    const-string v14, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    invoke-direct {v11, v5, v14}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v11, v8, Lxi8;->a:LPn8;

    invoke-virtual {v11}, LPn8;->z()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v11

    if-nez v11, :cond_13

    iget-object v0, v8, Lxi8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->v()Lec8;

    move-result-object v0

    const-string v5, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    invoke-virtual {v0, v5}, Lec8;->a(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_13
    const/4 v14, 0x0

    invoke-virtual {v11, v0, v14}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_16

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_16

    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/pm/ResolveInfo;

    iget-object v11, v11, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v11, :cond_18

    iget-object v14, v11, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v11, v11, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v11, :cond_15

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {v8}, Lxi8;->a()Z

    move-result v5

    if-eqz v5, :cond_15

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-static {}, Lcom/google/android/gms/common/stats/ConnectionTracker;->getInstance()Lcom/google/android/gms/common/stats/ConnectionTracker;

    move-result-object v0

    iget-object v11, v8, Lxi8;->a:LPn8;

    invoke-virtual {v11}, LPn8;->z()Landroid/content/Context;

    move-result-object v11

    const/4 v14, 0x1

    invoke-virtual {v0, v11, v5, v9, v14}, Lcom/google/android/gms/common/stats/ConnectionTracker;->bindService(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iget-object v5, v8, Lxi8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->s()Lec8;

    move-result-object v5

    const-string v9, "Install Referrer Service is"

    if-eqz v0, :cond_14

    const-string v0, "available"

    goto :goto_9

    :cond_14
    const-string v0, "not available"

    :goto_9
    invoke-virtual {v5, v9, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_b

    :catch_3
    move-exception v0

    :try_start_7
    iget-object v5, v8, Lxi8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->o()Lec8;

    move-result-object v5

    const-string v8, "Exception occurred while binding to Install Referrer Service"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v8, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_b

    :cond_15
    iget-object v0, v8, Lxi8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v5, "Play Store version 8.3.73 or higher required for Install Referrer"

    invoke-virtual {v0, v5}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_b

    :cond_16
    iget-object v0, v8, Lxi8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->r()Lec8;

    move-result-object v0

    const-string v5, "Play Service for fetching Install Referrer is unavailable on device"

    invoke-virtual {v0, v5}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_b

    :cond_17
    :goto_a
    iget-object v0, v8, Lxi8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->v()Lec8;

    move-result-object v0

    const-string v5, "Install Referrer Reporter was called with invalid app package name"

    invoke-virtual {v0, v5}, Lec8;->a(Ljava/lang/String;)V

    :cond_18
    :goto_b
    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v8, 0x1

    invoke-virtual {v5, v10, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v5, v6, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v8, 0x0

    invoke-virtual {v5, v7, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v6, v22

    invoke-virtual {v5, v6, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v10, v20

    invoke-virtual {v5, v10, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v11, v21

    invoke-virtual {v5, v11, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v8, 0x1

    invoke-virtual {v5, v4, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzq;->q:Z

    if-eqz v0, :cond_19

    invoke-virtual {v5, v3, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_19
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {v0}, LTR8;->f()V

    const-string v4, "first_open_count"

    invoke-virtual {v0, v3, v4}, Ltq7;->L(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v8

    iget-object v0, v1, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_1b

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v4, "PackageManager is null, first open report might be inaccurate. appId"

    invoke-static {v3}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_1a
    :goto_c
    const-wide/16 v3, 0x0

    goto/16 :goto_13

    :cond_1b
    :try_start_8
    iget-object v0, v1, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_d

    :catch_4
    move-exception v0

    :try_start_9
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->o()Lec8;

    move-result-object v4

    const-string v14, "Package info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v4, v14, v15, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_20

    iget-wide v14, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v16, 0x0

    cmp-long v4, v14, v16

    if-eqz v4, :cond_20

    move-object/from16 v20, v10

    move-object/from16 v21, v11

    iget-wide v10, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v14, v10

    if-eqz v0, :cond_1e

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    move-result-object v0

    sget-object v4, La98;->f0:LL88;

    const/4 v10, 0x0

    invoke-virtual {v0, v10, v4}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-wide/16 v14, 0x0

    cmp-long v0, v8, v14

    if-nez v0, :cond_1c

    const-wide/16 v14, 0x1

    invoke-virtual {v5, v7, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v8, 0x0

    :cond_1c
    :goto_e
    const/4 v15, 0x0

    goto :goto_f

    :cond_1d
    const-wide/16 v14, 0x1

    invoke-virtual {v5, v7, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_e

    :cond_1e
    const/4 v10, 0x0

    const/4 v15, 0x1

    :goto_f
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzlj;

    const-string v4, "_fi"

    const/4 v7, 0x1

    if-eq v7, v15, :cond_1f

    const-wide/16 v14, 0x0

    goto :goto_10

    :cond_1f
    const-wide/16 v14, 0x1

    :goto_10
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-object v15, v4

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_11

    :cond_20
    move-object/from16 v20, v10

    move-object/from16 v21, v11

    const/4 v10, 0x0

    :goto_11
    :try_start_a
    iget-object v0, v1, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3
    :try_end_a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_12

    :catch_5
    move-exception v0

    :try_start_b
    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->o()Lec8;

    move-result-object v4

    const-string v7, "Application info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v7, v3, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v10

    :goto_12
    if-eqz v3, :cond_1a

    iget v0, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v4, 0x1

    and-int/2addr v0, v4

    if-eqz v0, :cond_21

    move-object/from16 v4, v20

    const-wide/16 v10, 0x1

    invoke-virtual {v5, v4, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_21
    iget v0, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1a

    move-object/from16 v3, v21

    const-wide/16 v10, 0x1

    invoke-virtual {v5, v3, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_c

    :goto_13
    cmp-long v0, v8, v3

    if-ltz v0, :cond_22

    invoke-virtual {v5, v6, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_22
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzaw;

    const-string v15, "_f"

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v3, v5}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v0

    move-object/from16 v16, v3

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    invoke-virtual {v1, v0, v2}, LhV8;->i(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_14

    :cond_23
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzlj;

    const-string v15, "_fvt"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v7, 0x1

    invoke-virtual {v0, v10, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v6, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v4, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v4, v2, Lcom/google/android/gms/measurement/internal/zzq;->q:Z

    if-eqz v4, :cond_24

    invoke-virtual {v0, v3, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_24
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzaw;

    const-string v15, "_v"

    new-instance v4, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v4, v0}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    invoke-virtual {v1, v3, v2}, LhV8;->i(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_14

    :cond_25
    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzq;->j:Z

    if-eqz v0, :cond_26

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzaw;

    const-string v15, "_cd"

    new-instance v4, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v4, v0}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    invoke-virtual {v1, v3, v2}, LhV8;->i(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_26
    :goto_14
    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->l()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->f0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    throw v0

    :cond_27
    return-void
.end method

.method public final o()V
    .locals 1

    iget v0, p0, LhV8;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LhV8;->q:I

    return-void
.end method

.method public final p(Lcom/google/android/gms/measurement/internal/zzac;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, LhV8;->I(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, LhV8;->q(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_0
    return-void
.end method

.method public final q(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 10

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    invoke-static {p2}, LhV8;->Q(Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->e0()V

    :try_start_0
    invoke-virtual {p0, p2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ltq7;->S(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzac;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v3, "Removing conditional user property"

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    iget-object v5, p0, LhV8;->l:LPn8;

    invoke-virtual {v5}, LPn8;->D()Lqb8;

    move-result-object v5

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ltq7;->J(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ltq7;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzac;->l:Lcom/google/android/gms/measurement/internal/zzaw;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzaw;->c:Lcom/google/android/gms/measurement/internal/zzau;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzau;->u()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    move-object v4, v1

    invoke-virtual {p0}, LhV8;->h0()LOW8;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzac;->l:Lcom/google/android/gms/measurement/internal/zzaw;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzaw;->b:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzac;->l:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/zzaw;->e:J

    const/4 v8, 0x1

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, LOW8;->y0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/measurement/internal/zzaw;

    invoke-virtual {p0, p1, p2}, LhV8;->D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->t()Lec8;

    move-result-object p2

    const-string v0, "Conditional user property doesn\'t exist"

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LhV8;->l:LPn8;

    invoke-virtual {v2}, LPn8;->D()Lqb8;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    :goto_1
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->f0()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LhV8;->c:Ltq7;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ltq7;->f0()V

    throw p1

    :cond_5
    invoke-virtual {p0, p2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void
.end method

.method public final r(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 7

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    invoke-static {p2}, LhV8;->Q(Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void

    :cond_1
    const-string v0, "_npa"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzq;->s:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->n()Lec8;

    move-result-object p1

    const-string v0, "Falling back to manifest metadata value for ad personalization"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzq;->s:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "auto"

    const-string v2, "_npa"

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void

    :cond_3
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    iget-object v1, p0, LhV8;->l:LPn8;

    invoke-virtual {v1}, LPn8;->D()Lqb8;

    move-result-object v1

    invoke-virtual {v1, p1}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Removing user property"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->e0()V

    :try_start_0
    invoke-virtual {p0, p2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    const-string v0, "_id"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "_lair"

    invoke-virtual {v0, v1, v2}, Ltq7;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Ltq7;->j(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, LhV8;->c:Ltq7;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ltq7;->l()V

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->n()Lec8;

    move-result-object p2

    const-string v0, "User property removed"

    iget-object v1, p0, LhV8;->l:LPn8;

    invoke-virtual {v1}, LPn8;->D()Lqb8;

    move-result-object v1

    invoke-virtual {v1, p1}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->f0()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LhV8;->c:Ltq7;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ltq7;->f0()V

    throw p1
.end method

.method public final s(Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 7
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "app_id=?"

    iget-object v1, p0, LhV8;->x:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LhV8;->y:Ljava/util/List;

    iget-object v2, p0, LhV8;->x:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v1}, Lns8;->e()V

    invoke-virtual {v1}, LTR8;->f()V

    :try_start_0
    invoke-virtual {v1}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v5, "apps"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    const-string v6, "events"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "user_attributes"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "conditional_properties"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events_metadata"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "queue"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "audience_filter_values"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "main_event_params"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "default_event_params"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    if-lez v5, :cond_1

    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v3, "Reset analytics data. app, records"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    invoke-static {v2}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error resetting analytics data. appId, error"

    invoke-virtual {v1, v3, v2, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, LhV8;->n(Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_2
    return-void
.end method

.method public final t(Ljava/lang/String;LwE8;)V
    .locals 1

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LhV8;->D:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput-object p1, p0, LhV8;->D:Ljava/lang/String;

    iput-object p2, p0, LhV8;->C:LwE8;

    return-void
.end method

.method public final u()V
    .locals 4

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->h0()V

    iget-object v0, p0, LhV8;->i:LVN8;

    iget-object v0, v0, LVN8;->g:Lzg8;

    invoke-virtual {v0}, Lzg8;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, LhV8;->i:LVN8;

    iget-object v0, v0, LVN8;->g:Lzg8;

    invoke-virtual {p0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lzg8;->b(J)V

    :cond_0
    invoke-virtual {p0}, LhV8;->M()V

    return-void
.end method

.method public final v(Lcom/google/android/gms/measurement/internal/zzac;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, LhV8;->I(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, LhV8;->w(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_0
    return-void
.end method

.method public final w(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 10

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    invoke-static {p2}, LhV8;->Q(Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzac;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Lcom/google/android/gms/measurement/internal/zzac;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1}, Ltq7;->e0()V

    :try_start_0
    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ltq7;->S(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzac;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->t()Lec8;

    move-result-object v2

    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    iget-object v4, p0, LhV8;->l:LPn8;

    invoke-virtual {v4}, LPn8;->D()Lqb8;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v6}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    if-eqz v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzac;->e:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->e:J

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzac;->i:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->i:J

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzac;->g:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->g:Ljava/lang/String;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzac;->j:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->j:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-wide v6, v4, Lcom/google/android/gms/measurement/internal/zzlj;->d:J

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v8

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/zzlj;->g:Ljava/lang/String;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->g:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzac;->e:J

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v7

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzlj;->g:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    move p1, v2

    :cond_4
    :goto_0
    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->f:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    new-instance v9, LqW8;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzac;->c:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    iget-wide v6, v1, Lcom/google/android/gms/measurement/internal/zzlj;->d:J

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v1, p0, LhV8;->c:Ltq7;

    invoke-static {v1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v1, v9}, Ltq7;->u(LqW8;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v2, "User property updated immediately"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    iget-object v4, p0, LhV8;->l:LPn8;

    invoke-virtual {v4}, LPn8;->D()Lqb8;

    move-result-object v4

    iget-object v5, v9, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "(2)Too many active user properties, ignoring"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v3}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LhV8;->l:LPn8;

    invoke-virtual {v4}, LPn8;->D()Lqb8;

    move-result-object v4

    iget-object v5, v9, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    if-eqz p1, :cond_6

    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzac;->j:Lcom/google/android/gms/measurement/internal/zzaw;

    if-eqz p1, :cond_6

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->j:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/zzac;->e:J

    invoke-direct {p1, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Lcom/google/android/gms/measurement/internal/zzaw;J)V

    invoke-virtual {p0, p1, p2}, LhV8;->D(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_6
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1, v0}, Ltq7;->t(Lcom/google/android/gms/measurement/internal/zzac;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->n()Lec8;

    move-result-object p1

    const-string p2, "Conditional property added"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    iget-object v2, p0, LhV8;->l:LPn8;

    invoke-virtual {v2}, LPn8;->D()Lqb8;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v1, v2, v0}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, LhV8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string p2, "Too many conditional properties, ignoring"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzac;->b:Ljava/lang/String;

    invoke-static {v1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LhV8;->l:LPn8;

    invoke-virtual {v2}, LPn8;->D()Lqb8;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzac;->d:Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v1, v2, v0}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LhV8;->c:Ltq7;

    invoke-static {p1}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p1}, Ltq7;->f0()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LhV8;->c:Ltq7;

    invoke-static {p2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {p2}, Ltq7;->f0()V

    throw p1
.end method

.method public final x(Ljava/lang/String;LXm7;)V
    .locals 5

    invoke-virtual {p0}, LhV8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LhV8;->d()V

    iget-object v0, p0, LhV8;->A:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {v0}, LTR8;->f()V

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "app_id"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "consent_state"

    invoke-virtual {p2}, LXm7;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string v2, "consent_settings"

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-virtual {p2, v2, v3, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p2, v1, v3

    if-nez p2, :cond_0

    iget-object p2, v0, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->o()Lec8;

    move-result-object p2

    const-string v1, "Failed to insert/update consent setting (got -1). appId"

    invoke-static {p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p2

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    invoke-static {p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Error storing consent setting. appId, error"

    invoke-virtual {v0, v1, p1, p2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "_id"

    invoke-virtual/range {p0 .. p0}, LhV8;->c()Ldn8;

    move-result-object v4

    invoke-virtual {v4}, Lns8;->e()V

    invoke-virtual/range {p0 .. p0}, LhV8;->d()V

    invoke-static/range {p2 .. p2}, LhV8;->Q(Lcom/google/android/gms/measurement/internal/zzq;)Z

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    iget-boolean v4, v2, Lcom/google/android/gms/measurement/internal/zzq;->i:Z

    if-nez v4, :cond_1

    invoke-virtual {v1, v2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, LOW8;->p0(Ljava/lang/String;)I

    move-result v9

    const/4 v4, 0x1

    const/16 v5, 0x18

    const/4 v6, 0x0

    if-eqz v9, :cond_3

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v3

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    invoke-virtual {v3, v7, v5, v4}, LOW8;->o(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v11

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_2
    move v12, v6

    :goto_0
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v6

    iget-object v7, v1, LhV8;->E:LDW8;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v10, "_ev"

    invoke-virtual/range {v6 .. v12}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_3
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v7

    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, LOW8;->l0(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v13

    if-eqz v13, :cond_6

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v3

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LhV8;->U()Lgl7;

    invoke-virtual {v3, v7, v5, v4}, LOW8;->o(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    instance-of v3, v0, Ljava/lang/String;

    if-nez v3, :cond_4

    instance-of v3, v0, Ljava/lang/CharSequence;

    if-eqz v3, :cond_5

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    :cond_5
    move/from16 v16, v6

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v10

    iget-object v11, v1, LhV8;->E:LDW8;

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v14, "_ev"

    invoke-virtual/range {v10 .. v16}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzlj;->s()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, LOW8;->m(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_7

    return-void

    :cond_7
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    const-string v6, "_sid"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/zzlj;->d:J

    iget-object v11, v0, Lcom/google/android/gms/measurement/internal/zzlj;->g:Ljava/lang/String;

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, v1, LhV8;->c:Ltq7;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    const-string v7, "_sno"

    invoke-virtual {v6, v5, v7}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v6

    if-eqz v6, :cond_8

    iget-object v7, v6, LqW8;->e:Ljava/lang/Object;

    instance-of v10, v7, Ljava/lang/Long;

    if-eqz v10, :cond_8

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_1

    :cond_8
    if-eqz v6, :cond_9

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->t()Lec8;

    move-result-object v7

    const-string v10, "Retrieved last session number from database does not contain a valid (long) value"

    iget-object v6, v6, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v7, v10, v6}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    iget-object v6, v1, LhV8;->c:Ltq7;

    invoke-static {v6}, LhV8;->R(LTR8;)LTR8;

    const-string v7, "_s"

    invoke-virtual {v6, v5, v7}, Ltq7;->V(Ljava/lang/String;Ljava/lang/String;)Lpv7;

    move-result-object v5

    if-eqz v5, :cond_a

    iget-wide v5, v5, Lpv7;->c:J

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->s()Lec8;

    move-result-object v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v12, "Backfill the session number. Last used session number"

    invoke-virtual {v7, v12, v10}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_a
    const-wide/16 v5, 0x0

    :goto_1
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzlj;

    const-wide/16 v13, 0x1

    add-long/2addr v5, v13

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v7, "_sno"

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/measurement/internal/zzlj;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v12, v2}, LhV8;->y(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_b
    new-instance v5, LqW8;

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzlj;->g:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/lang/String;

    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/zzlj;->c:Ljava/lang/String;

    iget-wide v11, v0, Lcom/google/android/gms/measurement/internal/zzlj;->d:J

    move-object v7, v5

    move-object v13, v4

    invoke-direct/range {v7 .. v13}, LqW8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    iget-object v6, v1, LhV8;->l:LPn8;

    invoke-virtual {v6}, LPn8;->D()Lqb8;

    move-result-object v6

    iget-object v7, v5, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Setting user property"

    invoke-virtual {v0, v7, v6, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->e0()V

    :try_start_0
    iget-object v0, v5, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Ltq7;->X(Ljava/lang/String;Ljava/lang/String;)LqW8;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v3, v5, LqW8;->e:Ljava/lang/Object;

    iget-object v0, v0, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v0, v3, v4}, Ltq7;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v1, v2}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0, v5}, Ltq7;->u(LqW8;)Z

    move-result v0

    iget-object v3, v1, LhV8;->c:Ltq7;

    invoke-static {v3}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v3}, Ltq7;->l()V

    if-nez v0, :cond_d

    invoke-virtual/range {p0 .. p0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v3, "Too many unique user properties are set. Ignoring user property"

    iget-object v4, v1, LhV8;->l:LPn8;

    invoke-virtual {v4}, LPn8;->D()Lqb8;

    move-result-object v4

    iget-object v6, v5, LqW8;->c:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lqb8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v5, LqW8;->e:Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LhV8;->h0()LOW8;

    move-result-object v6

    iget-object v7, v1, LhV8;->E:LDW8;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {v6 .. v12}, LOW8;->B(LDW8;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_d
    iget-object v0, v1, LhV8;->c:Ltq7;

    invoke-static {v0}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v0}, Ltq7;->f0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, LhV8;->c:Ltq7;

    invoke-static {v2}, LhV8;->R(LTR8;)LTR8;

    invoke-virtual {v2}, Ltq7;->f0()V

    throw v0
.end method

.method public final z()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LhV8;->l:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
