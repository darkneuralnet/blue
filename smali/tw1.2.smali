.class public final Ltw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aR\u0010\u000c\u001a\u0016\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Lew1;",
        "LAc6;",
        "typefaceRequest",
        "Lmp;",
        "asyncTypefaceCache",
        "LxV3;",
        "platformFontLoader",
        "Lkotlin/Function1;",
        "",
        "createDefaultTypeface",
        "Lkotlin/Pair;",
        "b",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Ljava/util/List;LAc6;Lmp;LxV3;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltw1;->b(Ljava/util/List;LAc6;Lmp;LxV3;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;LAc6;Lmp;LxV3;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lew1;",
            ">;",
            "LAc6;",
            "Lmp;",
            "LxV3;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LAc6;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lew1;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object/from16 v8, p3

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v13, v10

    move v12, v11

    :goto_0
    if-ge v12, v9, :cond_e

    move-object/from16 v14, p0

    invoke-interface {v14, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lew1;

    invoke-interface {v15}, Lew1;->a()I

    move-result v0

    sget-object v1, Luw1;->a:Luw1$a;

    invoke-virtual {v1}, Luw1$a;->b()I

    move-result v2

    invoke-static {v0, v2}, Luw1;->e(II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static/range {p2 .. p2}, Lmp;->a(Lmp;)LRX5;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    new-instance v0, Lmp$b;

    invoke-interface/range {p3 .. p3}, LxV3;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v15, v2}, Lmp$b;-><init>(Lew1;Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lmp;->c(Lmp;)LtE2;

    move-result-object v2

    invoke-virtual {v2, v0}, LtE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmp$a;

    if-nez v2, :cond_0

    invoke-static/range {p2 .. p2}, Lmp;->b(Lmp;)LMA5;

    move-result-object v2

    invoke-virtual {v2, v0}, LMA5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lmp$a;

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lmp$a;->g()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_1

    :cond_1
    :try_start_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    :try_start_2
    invoke-interface {v8, v15}, LxV3;->b(Lew1;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object/from16 v1, p2

    move-object v2, v15

    move-object/from16 v3, p3

    move-object v4, v0

    invoke-static/range {v1 .. v7}, Lmp;->f(Lmp;Lew1;LxV3;Ljava/lang/Object;ZILjava/lang/Object;)V

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual/range {p1 .. p1}, LAc6;->e()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LAc6;->f()LJw1;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LAc6;->d()I

    move-result v3

    invoke-static {v1, v0, v15, v2, v3}, LGw1;->a(ILjava/lang/Object;Lew1;LJw1;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to load font "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    move-object v1, v0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to load font "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_3
    invoke-virtual {v1}, Luw1$a;->c()I

    move-result v2

    invoke-static {v0, v2}, Luw1;->e(II)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static/range {p2 .. p2}, Lmp;->a(Lmp;)LRX5;

    move-result-object v1

    monitor-enter v1

    :try_start_3
    new-instance v0, Lmp$b;

    invoke-interface/range {p3 .. p3}, LxV3;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v15, v2}, Lmp$b;-><init>(Lew1;Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lmp;->c(Lmp;)LtE2;

    move-result-object v2

    invoke-virtual {v2, v0}, LtE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmp$a;

    if-nez v2, :cond_4

    invoke-static/range {p2 .. p2}, Lmp;->b(Lmp;)LMA5;

    move-result-object v2

    invoke-virtual {v2, v0}, LMA5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lmp$a;

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lmp$a;->g()Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v1

    goto :goto_3

    :cond_5
    :try_start_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v1

    :try_start_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {v8, v15}, LxV3;->b(Lew1;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v0, v10

    :cond_6
    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object/from16 v1, p2

    move-object v2, v15

    move-object/from16 v3, p3

    move-object v4, v0

    invoke-static/range {v1 .. v7}, Lmp;->f(Lmp;Lew1;LxV3;Ljava/lang/Object;ZILjava/lang/Object;)V

    :goto_3
    if-eqz v0, :cond_7

    invoke-virtual/range {p1 .. p1}, LAc6;->e()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LAc6;->f()LJw1;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LAc6;->d()I

    move-result v3

    invoke-static {v1, v0, v15, v2, v3}, LGw1;->a(ILjava/lang/Object;Lew1;LJw1;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_7
    move-object/from16 v1, p2

    goto :goto_4

    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_8
    invoke-virtual {v1}, Luw1$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Luw1;->e(II)Z

    move-result v0

    if-eqz v0, :cond_d

    move-object/from16 v1, p2

    invoke-virtual {v1, v15, v8}, Lmp;->d(Lew1;LxV3;)Lmp$a;

    move-result-object v0

    if-nez v0, :cond_a

    if-nez v13, :cond_9

    const/4 v0, 0x1

    new-array v0, v0, [Lew1;

    aput-object v15, v0, v11

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    goto :goto_4

    :cond_9
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    invoke-virtual {v0}, Lmp$a;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lmp$a;->e(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v0}, Lmp$a;->g()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p1 .. p1}, LAc6;->e()I

    move-result v1

    invoke-virtual {v0}, Lmp$a;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LAc6;->f()LJw1;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LAc6;->d()I

    move-result v3

    invoke-static {v1, v0, v15, v2, v3}, LGw1;->a(ILjava/lang/Object;Lew1;LJw1;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_c
    :goto_4
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown font type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object/from16 v1, p1

    move-object/from16 v2, p4

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method
