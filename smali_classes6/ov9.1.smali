.class public final Lov9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lpk8;

.field public b:Ljava/lang/Long;

.field public c:J

.field public final synthetic d:LFf7;


# direct methods
.method public synthetic constructor <init>(LFf7;LRt9;)V
    .locals 0

    iput-object p1, p0, Lov9;->d:LFf7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lpk8;)Lpk8;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v8, p2

    invoke-virtual/range {p2 .. p2}, Lpk8;->I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lpk8;->J()Ljava/util/List;

    move-result-object v9

    iget-object v2, v1, Lov9;->d:LFf7;

    iget-object v2, v2, LIR8;->b:LhV8;

    invoke-virtual {v2}, LhV8;->g0()LDV8;

    const-string v2, "_eid"

    invoke-static {v8, v2}, LDV8;->l(Lpk8;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_f

    const-string v5, "_ep"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_c

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->g0()LDV8;

    const-string v0, "_en"

    invoke-static {v8, v0}, LDV8;->l(Lpk8;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->q()Lec8;

    move-result-object v0

    const-string v2, "Extra parameter without an event name. eventId"

    invoke-virtual {v0, v2, v4}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v5

    :cond_0
    iget-object v0, v1, Lov9;->a:Lpk8;

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lov9;->b:Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    iget-object v0, v1, Lov9;->b:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    cmp-long v0, v13, v15

    if-eqz v0, :cond_5

    :cond_1
    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->W()Ltq7;

    move-result-object v13

    invoke-virtual {v13}, Lns8;->e()V

    invoke-virtual {v13}, LTR8;->f()V

    :try_start_0
    invoke-virtual {v13}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v14, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/String;

    aput-object v3, v15, v12

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v15, v11

    invoke-virtual {v0, v14, v15}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v13, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v15, "Main event not found"

    invoke-virtual {v0, v15}, Lec8;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    move-object v0, v5

    goto :goto_2

    :cond_2
    :try_start_2
    invoke-interface {v14, v12}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    invoke-interface {v14, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {}, Lpk8;->F()Ldk8;

    move-result-object v5

    invoke-static {v5, v0}, LDV8;->B(Lh19;[B)Lh19;

    move-result-object v0

    check-cast v0, Ldk8;

    invoke-virtual {v0}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lpk8;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v0, v15}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_5
    iget-object v5, v13, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->o()Lec8;

    move-result-object v5

    const-string v15, "Failed to merge main event. appId, eventId"

    invoke-static/range {p1 .. p1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v5, v15, v12, v4, v0}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v5, 0x0

    goto/16 :goto_7

    :catch_2
    move-exception v0

    const/4 v14, 0x0

    :goto_0
    :try_start_6
    iget-object v5, v13, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->a()LFc8;

    move-result-object v5

    invoke-virtual {v5}, LFc8;->o()Lec8;

    move-result-object v5

    const-string v12, "Error selecting main event"

    invoke-virtual {v5, v12, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v14, :cond_3

    :goto_1
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_a

    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-nez v5, :cond_4

    goto/16 :goto_6

    :cond_4
    check-cast v5, Lpk8;

    iput-object v5, v1, Lov9;->a:Lpk8;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iput-wide v12, v1, Lov9;->c:J

    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->g0()LDV8;

    iget-object v0, v1, Lov9;->a:Lpk8;

    invoke-static {v0, v2}, LDV8;->l(Lpk8;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, v1, Lov9;->b:Ljava/lang/Long;

    :cond_5
    iget-wide v12, v1, Lov9;->c:J

    const-wide/16 v14, -0x1

    add-long/2addr v12, v14

    iput-wide v12, v1, Lov9;->c:J

    cmp-long v0, v12, v6

    if-gtz v0, :cond_6

    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->W()Ltq7;

    move-result-object v2

    invoke-virtual {v2}, Lns8;->e()V

    iget-object v0, v2, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v4, "Clearing complex main event info. appId"

    invoke-virtual {v0, v4, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_7
    invoke-virtual {v2}, Ltq7;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "delete from main_event_params where app_id=?"

    new-array v5, v11, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    invoke-virtual {v0, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Error clearing complex main event"

    invoke-virtual {v2, v3, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->W()Ltq7;

    move-result-object v2

    iget-wide v5, v1, Lov9;->c:J

    iget-object v7, v1, Lov9;->a:Lpk8;

    move-object/from16 v3, p1

    invoke-virtual/range {v2 .. v7}, Ltq7;->s(Ljava/lang/String;Ljava/lang/Long;JLpk8;)Z

    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v1, Lov9;->a:Lpk8;

    invoke-virtual {v2}, Lpk8;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpl8;

    iget-object v4, v1, Lov9;->d:LFf7;

    iget-object v4, v4, LIR8;->b:LhV8;

    invoke-virtual {v4}, LhV8;->g0()LDV8;

    invoke-virtual {v3}, Lpl8;->H()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, LDV8;->k(Lpk8;Ljava/lang/String;)Lpl8;

    move-result-object v4

    if-nez v4, :cond_7

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-interface {v0, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v9, v0

    goto :goto_5

    :cond_9
    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->q()Lec8;

    move-result-object v0

    const-string v2, "No unique parameters in main event. eventName"

    invoke-virtual {v0, v2, v10}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_5
    move-object v0, v10

    goto :goto_8

    :cond_a
    :goto_6
    iget-object v0, v1, Lov9;->d:LFf7;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->q()Lec8;

    move-result-object v0

    const-string v2, "Extra parameter without existing main event. eventName, eventId"

    invoke-virtual {v0, v2, v10, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    return-object v2

    :catchall_1
    move-exception v0

    move-object v5, v14

    :goto_7
    if-eqz v5, :cond_b

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_b
    throw v0

    :cond_c
    iput-object v4, v1, Lov9;->b:Ljava/lang/Long;

    iput-object v8, v1, Lov9;->a:Lpk8;

    iget-object v2, v1, Lov9;->d:LFf7;

    iget-object v2, v2, LIR8;->b:LhV8;

    invoke-virtual {v2}, LhV8;->g0()LDV8;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v5, "_epc"

    invoke-static {v8, v5}, LDV8;->l(Lpk8;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_d

    move-object v2, v5

    :cond_d
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iput-wide v10, v1, Lov9;->c:J

    cmp-long v2, v10, v6

    if-gtz v2, :cond_e

    iget-object v2, v1, Lov9;->d:LFf7;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->q()Lec8;

    move-result-object v2

    const-string v3, "Complex event with zero extra param count. eventName"

    invoke-virtual {v2, v3, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_e
    iget-object v2, v1, Lov9;->d:LFf7;

    iget-object v2, v2, LIR8;->b:LhV8;

    invoke-virtual {v2}, LhV8;->W()Ltq7;

    move-result-object v2

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    iget-wide v5, v1, Lov9;->c:J

    move-object/from16 v3, p1

    move-object/from16 v7, p2

    invoke-virtual/range {v2 .. v7}, Ltq7;->s(Ljava/lang/String;Ljava/lang/Long;JLpk8;)Z

    :cond_f
    :goto_8
    invoke-virtual/range {p2 .. p2}, LpU8;->j()LUS8;

    move-result-object v2

    check-cast v2, Ldk8;

    invoke-virtual {v2, v0}, Ldk8;->I(Ljava/lang/String;)Ldk8;

    invoke-virtual {v2}, Ldk8;->G()Ldk8;

    invoke-virtual {v2, v9}, Ldk8;->B(Ljava/lang/Iterable;)Ldk8;

    invoke-virtual {v2}, LUS8;->q()LpU8;

    move-result-object v0

    check-cast v0, Lpk8;

    return-object v0
.end method
