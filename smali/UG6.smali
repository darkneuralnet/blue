.class public final LUG6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001aD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u001c\u0010\u0015\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000cH\u0002\u00a8\u0006\u001a"
    }
    d2 = {
        "Li74;",
        "processor",
        "Landroidx/work/impl/WorkDatabase;",
        "workDatabase",
        "Landroidx/work/a;",
        "configuration",
        "",
        "Lxm5;",
        "schedulers",
        "LHG6;",
        "newWorkSpec",
        "",
        "",
        "tags",
        "LZC6$a;",
        "f",
        "LaD6;",
        "name",
        "LEG6;",
        "workRequest",
        "LXh3;",
        "c",
        "Lai3;",
        "message",
        "",
        "e",
        "work-runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "WorkerUpdater"
.end annotation


# direct methods
.method public static synthetic a(LaD6;Ljava/lang/String;Lai3;Lkotlin/jvm/functions/Function0;LEG6;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LUG6;->d(LaD6;Ljava/lang/String;Lai3;Lkotlin/jvm/functions/Function0;LEG6;)V

    return-void
.end method

.method public static synthetic b(Landroidx/work/impl/WorkDatabase;LHG6;LHG6;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    invoke-static/range {p0 .. p6}, LUG6;->g(Landroidx/work/impl/WorkDatabase;LHG6;LHG6;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method

.method public static final c(LaD6;Ljava/lang/String;LEG6;)LXh3;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lai3;

    invoke-direct {v0}, Lai3;-><init>()V

    new-instance v5, LUG6$a;

    invoke-direct {v5, p2, p0, p1, v0}, LUG6$a;-><init>(LEG6;LaD6;Ljava/lang/String;Lai3;)V

    invoke-virtual {p0}, LaD6;->v()LmZ5;

    move-result-object v1

    invoke-interface {v1}, LmZ5;->c()LRs5;

    move-result-object v7

    new-instance v8, LSG6;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-object v4, v0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, LSG6;-><init>(LaD6;Ljava/lang/String;Lai3;Lkotlin/jvm/functions/Function0;LEG6;)V

    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static final d(LaD6;Ljava/lang/String;Lai3;Lkotlin/jvm/functions/Function0;LEG6;)V
    .locals 43

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "$this_enqueueUniquelyNamedPeriodic"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$operation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$enqueueNew"

    move-object/from16 v4, p3

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$workRequest"

    move-object/from16 v5, p4

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v2

    invoke-interface {v2, v0}, LIG6;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_0

    const-string v0, "Can\'t apply UPDATE policy to the chains of work."

    invoke-static {v1, v0}, LUG6;->e(Lai3;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LHG6$b;

    if-nez v6, :cond_1

    invoke-interface/range {p3 .. p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v7, v6, LHG6$b;->a:Ljava/lang/String;

    invoke-interface {v2, v7}, LIG6;->l(Ljava/lang/String;)LHG6;

    move-result-object v7

    if-nez v7, :cond_2

    new-instance v2, LXh3$b$a;

    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WorkSpec with "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v6, LHG6$b;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", that matches a name \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\", wasn\'t found"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, LXh3$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lai3;->a(LXh3$b;)V

    return-void

    :cond_2
    invoke-virtual {v7}, LHG6;->j()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type."

    invoke-static {v1, v0}, LUG6;->e(Lai3;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, v6, LHG6$b;->b:LUC6$a;

    sget-object v7, LUC6$a;->g:LUC6$a;

    if-ne v0, v7, :cond_4

    iget-object v0, v6, LHG6$b;->a:Ljava/lang/String;

    invoke-interface {v2, v0}, LIG6;->delete(Ljava/lang/String;)V

    invoke-interface/range {p3 .. p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    :cond_4
    invoke-virtual/range {p4 .. p4}, LEG6;->d()LHG6;

    move-result-object v7

    iget-object v8, v6, LHG6$b;->a:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const v35, 0xffffe

    const/16 v36, 0x0

    invoke-static/range {v7 .. v36}, LHG6;->e(LHG6;Ljava/lang/String;LUC6$a;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLlz0;ILgw;JJJJZLXy3;IIILjava/lang/Object;)LHG6;

    move-result-object v41

    :try_start_0
    invoke-virtual/range {p0 .. p0}, LaD6;->r()Li74;

    move-result-object v0

    const-string v2, "processor"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v2

    const-string v4, "workDatabase"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LaD6;->n()Landroidx/work/a;

    move-result-object v4

    const-string v6, "configuration"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LaD6;->s()Ljava/util/List;

    move-result-object v3

    const-string v6, "schedulers"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p4 .. p4}, LEG6;->c()Ljava/util/Set;

    move-result-object v42

    move-object/from16 v37, v0

    move-object/from16 v38, v2

    move-object/from16 v39, v4

    move-object/from16 v40, v3

    invoke-static/range {v37 .. v42}, LUG6;->f(Li74;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;LHG6;Ljava/util/Set;)LZC6$a;

    sget-object v0, LXh3;->a:LXh3$b$c;

    invoke-virtual {v1, v0}, Lai3;->a(LXh3$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v2, LXh3$b$a;

    invoke-direct {v2, v0}, LXh3$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lai3;->a(LXh3$b;)V

    :goto_0
    return-void
.end method

.method public static final e(Lai3;Ljava/lang/String;)V
    .locals 2

    new-instance v0, LXh3$b$a;

    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LXh3$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lai3;->a(LXh3$b;)V

    return-void
.end method

.method public static final f(Li74;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;LHG6;Ljava/util/Set;)LZC6$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li74;",
            "Landroidx/work/impl/WorkDatabase;",
            "Landroidx/work/a;",
            "Ljava/util/List<",
            "+",
            "Lxm5;",
            ">;",
            "LHG6;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "LZC6$a;"
        }
    .end annotation

    iget-object v5, p4, LHG6;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v0

    invoke-interface {v0, v5}, LIG6;->l(Ljava/lang/String;)LHG6;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v0, v3, LHG6;->b:LUC6$a;

    invoke-virtual {v0}, LUC6$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LZC6$a;->b:LZC6$a;

    return-object p0

    :cond_0
    invoke-virtual {v3}, LHG6;->j()Z

    move-result v0

    invoke-virtual {p4}, LHG6;->j()Z

    move-result v1

    xor-int/2addr v0, v1

    if-nez v0, :cond_4

    invoke-virtual {p0, v5}, Li74;->k(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    move-object v0, p3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxm5;

    invoke-interface {v1, v5}, Lxm5;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v8, LTG6;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p4

    move-object v4, p3

    move-object v6, p5

    move v7, p0

    invoke-direct/range {v0 .. v7}, LTG6;-><init>(Landroidx/work/impl/WorkDatabase;LHG6;LHG6;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    invoke-virtual {p1, v8}, LEb5;->z(Ljava/lang/Runnable;)V

    if-nez p0, :cond_2

    invoke-static {p2, p1, p3}, LEm5;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_2
    if-eqz p0, :cond_3

    sget-object p0, LZC6$a;->d:LZC6$a;

    goto :goto_1

    :cond_3
    sget-object p0, LZC6$a;->c:LZC6$a;

    :goto_1
    return-object p0

    :cond_4
    sget-object p0, LUG6$b;->g:LUG6$b;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Can\'t update "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " Worker to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " Worker. Update operation must preserve worker\'s type."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Worker with "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " doesn\'t exist"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(Landroidx/work/impl/WorkDatabase;LHG6;LHG6;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 36

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p1

    const-string v5, "$workDatabase"

    move-object/from16 v15, p0

    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$newWorkSpec"

    move-object/from16 v6, p1

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$oldWorkSpec"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$schedulers"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$workSpecId"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$tags"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/WorkDatabase;->J()LMG6;

    move-result-object v14

    const/4 v5, 0x0

    iget-object v6, v0, LHG6;->b:LUC6$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v34, v13

    move-object/from16 v35, v14

    move-wide/from16 v13, v16

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    iget v5, v0, LHG6;->k:I

    move/from16 v18, v5

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    iget-wide v7, v0, LHG6;->n:J

    move-wide/from16 v22, v7

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-virtual/range {p2 .. p2}, LHG6;->f()I

    move-result v0

    add-int/lit8 v31, v0, 0x1

    const v32, 0x7dbfd

    const/16 v33, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v33}, LHG6;->e(LHG6;Ljava/lang/String;LUC6$a;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLlz0;ILgw;JJJJZLXy3;IIILjava/lang/Object;)LHG6;

    move-result-object v0

    invoke-static {v1, v0}, LOd1;->b(Ljava/util/List;LHG6;)LHG6;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-interface {v1, v0}, LIG6;->r(LHG6;)V

    move-object/from16 v0, v35

    invoke-interface {v0, v2}, LMG6;->a(Ljava/lang/String;)V

    invoke-interface {v0, v2, v3}, LMG6;->c(Ljava/lang/String;Ljava/util/Set;)V

    if-nez p6, :cond_0

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, LIG6;->o(Ljava/lang/String;J)I

    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/WorkDatabase;->H()LzG6;

    move-result-object v0

    invoke-interface {v0, v2}, LzG6;->delete(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
