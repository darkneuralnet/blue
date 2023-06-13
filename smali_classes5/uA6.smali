.class public final LuA6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u008d\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\u0019\u0010\u001c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a#\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00162\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0007\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "LBA6;",
        "state",
        "LgV2;",
        "modifier",
        "",
        "captureBackPresses",
        "LvA6;",
        "navigator",
        "Lkotlin/Function1;",
        "Landroid/webkit/WebView;",
        "",
        "onCreated",
        "onDispose",
        "Lx2;",
        "client",
        "Lw2;",
        "chromeClient",
        "Landroid/content/Context;",
        "factory",
        "a",
        "(LBA6;LgV2;ZLvA6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx2;Lw2;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "LVz6;",
        "",
        "url",
        "LVz6$b;",
        "j",
        "LZC0;",
        "coroutineScope",
        "h",
        "(LZC0;LEt0;II)LvA6;",
        "data",
        "baseUrl",
        "i",
        "(Ljava/lang/String;Ljava/lang/String;LEt0;II)LBA6;",
        "web_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(LBA6;LgV2;ZLvA6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx2;Lw2;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBA6;",
            "LgV2;",
            "Z",
            "LvA6;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;",
            "Lx2;",
            "Lw2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Landroid/webkit/WebView;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v10, p0

    move/from16 v11, p10

    move/from16 v12, p11

    const-string v0, "state"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x57d06ac9

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v13

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0xe

    if-nez v1, :cond_2

    invoke-interface {v13, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x70

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v13, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v4, p1

    :goto_4
    and-int/lit8 v5, v12, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v11, 0x380

    if-nez v6, :cond_8

    move/from16 v6, p2

    invoke-interface {v13, v6}, LEt0;->o(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v6, p2

    :goto_7
    and-int/lit16 v7, v11, 0x1c00

    if-nez v7, :cond_b

    and-int/lit8 v7, v12, 0x8

    if-nez v7, :cond_9

    move-object/from16 v7, p3

    invoke-interface {v13, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_8

    :cond_9
    move-object/from16 v7, p3

    :cond_a
    const/16 v8, 0x400

    :goto_8
    or-int/2addr v1, v8

    goto :goto_9

    :cond_b
    move-object/from16 v7, p3

    :goto_9
    and-int/lit8 v8, v12, 0x10

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_b

    :cond_c
    const v9, 0xe000

    and-int/2addr v9, v11

    if-nez v9, :cond_e

    move-object/from16 v9, p4

    invoke-interface {v13, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_a

    :cond_d
    const/16 v14, 0x2000

    :goto_a
    or-int/2addr v1, v14

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v9, p4

    :goto_c
    and-int/lit8 v14, v12, 0x20

    if-eqz v14, :cond_f

    const/high16 v15, 0x30000

    or-int/2addr v1, v15

    goto :goto_e

    :cond_f
    const/high16 v15, 0x70000

    and-int/2addr v15, v11

    if-nez v15, :cond_11

    move-object/from16 v15, p5

    invoke-interface {v13, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v16, 0x10000

    :goto_d
    or-int v1, v1, v16

    goto :goto_f

    :cond_11
    :goto_e
    move-object/from16 v15, p5

    :goto_f
    and-int/lit8 v16, v12, 0x40

    if-eqz v16, :cond_12

    const/high16 v17, 0x80000

    or-int v1, v1, v17

    :cond_12
    and-int/lit16 v2, v12, 0x80

    if-eqz v2, :cond_13

    const/high16 v17, 0x400000

    or-int v1, v1, v17

    :cond_13
    and-int/lit16 v0, v12, 0x100

    if-eqz v0, :cond_14

    const/high16 v18, 0x6000000

    or-int v1, v1, v18

    move-object/from16 v4, p8

    goto :goto_11

    :cond_14
    const/high16 v18, 0xe000000

    and-int v18, v11, v18

    move-object/from16 v4, p8

    if-nez v18, :cond_16

    invoke-interface {v13, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_15

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_15
    const/high16 v18, 0x2000000

    :goto_10
    or-int v1, v1, v18

    :cond_16
    :goto_11
    and-int/lit16 v4, v12, 0xc0

    const/16 v6, 0xc0

    if-ne v4, v6, :cond_18

    const v4, 0xb6db6db

    and-int/2addr v4, v1

    const v6, 0x2492492

    if-ne v4, v6, :cond_18

    invoke-interface {v13}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_17

    goto :goto_12

    :cond_17
    invoke-interface {v13}, LEt0;->k()V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v8, p7

    move-object v4, v7

    move-object v5, v9

    move-object v6, v15

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    goto/16 :goto_1c

    :cond_18
    :goto_12
    invoke-interface {v13}, LEt0;->J()V

    and-int/lit8 v4, v11, 0x1

    const v18, -0x380001

    const/4 v6, 0x1

    if-eqz v4, :cond_1d

    invoke-interface {v13}, LEt0;->l()Z

    move-result v4

    if-eqz v4, :cond_19

    goto :goto_13

    :cond_19
    invoke-interface {v13}, LEt0;->k()V

    and-int/lit8 v0, v12, 0x8

    if-eqz v0, :cond_1a

    and-int/lit16 v1, v1, -0x1c01

    :cond_1a
    if-eqz v16, :cond_1b

    and-int v1, v1, v18

    :cond_1b
    if-eqz v2, :cond_1c

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_1c
    move-object/from16 v14, p1

    move-object/from16 v5, p7

    move-object/from16 v18, p8

    move v4, v1

    move-object/from16 v16, v9

    move-object v8, v15

    move/from16 v15, p2

    move-object v9, v7

    move-object/from16 v7, p6

    goto/16 :goto_19

    :cond_1d
    :goto_13
    if-eqz v3, :cond_1e

    sget-object v3, LgV2;->b0:LgV2$a;

    goto :goto_14

    :cond_1e
    move-object/from16 v3, p1

    :goto_14
    if-eqz v5, :cond_1f

    move v4, v6

    goto :goto_15

    :cond_1f
    move/from16 v4, p2

    :goto_15
    and-int/lit8 v5, v12, 0x8

    move-object/from16 p1, v3

    if-eqz v5, :cond_20

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v3, v13, v5, v6}, LuA6;->h(LZC0;LEt0;II)LvA6;

    move-result-object v7

    and-int/lit16 v1, v1, -0x1c01

    :cond_20
    if-eqz v8, :cond_21

    sget-object v3, LuA6$a;->g:LuA6$a;

    move-object v9, v3

    :cond_21
    if-eqz v14, :cond_22

    sget-object v3, LuA6$b;->g:LuA6$b;

    move-object v15, v3

    :cond_22
    if-eqz v16, :cond_24

    const v3, -0x1d58f75c

    invoke-interface {v13, v3}, LEt0;->F(I)V

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_23

    new-instance v3, Lx2;

    invoke-direct {v3}, Lx2;-><init>()V

    invoke-interface {v13, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_23
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v3, Lx2;

    and-int v1, v1, v18

    goto :goto_16

    :cond_24
    move-object/from16 v3, p6

    :goto_16
    if-eqz v2, :cond_26

    const v2, -0x1d58f75c

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_25

    new-instance v2, Lw2;

    invoke-direct {v2}, Lw2;-><init>()V

    invoke-interface {v13, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_25
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v2, Lw2;

    const v5, -0x1c00001

    and-int/2addr v1, v5

    goto :goto_17

    :cond_26
    move-object/from16 v2, p7

    :goto_17
    move-object/from16 v14, p1

    if-eqz v0, :cond_27

    move-object v5, v2

    move-object/from16 v16, v9

    move-object v8, v15

    const/16 v18, 0x0

    goto :goto_18

    :cond_27
    move-object/from16 v18, p8

    move-object v5, v2

    move-object/from16 v16, v9

    move-object v8, v15

    :goto_18
    move v15, v4

    move-object v9, v7

    move v4, v1

    move-object v7, v3

    :goto_19
    invoke-interface {v13}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_28

    const/4 v0, -0x1

    const-string v1, "com.google.accompanist.web.WebView (WebView.kt:70)"

    const v2, 0x57d06ac9

    invoke-static {v2, v4, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_28
    const v0, -0x1d58f75c

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_29

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v3, v3, v2, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v13, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_29
    invoke-interface {v13}, LEt0;->Q()V

    move-object v3, v0

    check-cast v3, LEX2;

    if-eqz v15, :cond_2a

    invoke-virtual {v9}, LvA6;->b()Z

    move-result v0

    if-eqz v0, :cond_2a

    move v0, v6

    goto :goto_1a

    :cond_2a
    const/4 v0, 0x0

    :goto_1a
    const v2, 0x44faf204

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-interface {v13, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_2b

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_2c

    :cond_2b
    new-instance v6, LuA6$c;

    invoke-direct {v6, v3}, LuA6$c;-><init>(LEX2;)V

    invoke-interface {v13, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2c
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    invoke-static {v0, v6, v13, v2, v2}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {v3}, LuA6;->b(LEX2;)Landroid/webkit/WebView;

    move-result-object v0

    const v2, 0x1e7b2b64

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-interface {v13, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_2d

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_2e

    :cond_2d
    new-instance v6, LuA6$d;

    const/4 v1, 0x0

    invoke-direct {v6, v9, v3, v1}, LuA6$d;-><init>(LvA6;LEX2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v13, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2e
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v1, v4, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/lit16 v1, v1, 0x208

    invoke-static {v0, v9, v6, v13, v1}, LY91;->e(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    shr-int/lit8 v0, v4, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v8, v13, v0}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v0

    invoke-static {v3}, LuA6;->b(LEX2;)Landroid/webkit/WebView;

    move-result-object v1

    const v2, 0x51b3427e

    invoke-interface {v13, v2}, LEt0;->F(I)V

    if-nez v1, :cond_2f

    goto :goto_1b

    :cond_2f
    new-instance v2, LuA6$e;

    invoke-direct {v2, v1, v0}, LuA6$e;-><init>(Landroid/webkit/WebView;LsP5;)V

    const/16 v0, 0x8

    invoke-static {v1, v2, v13, v0}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1b
    invoke-interface {v13}, LEt0;->Q()V

    invoke-virtual {v7, v10}, Lx2;->d(LBA6;)V

    invoke-virtual {v7, v9}, Lx2;->c(LvA6;)V

    invoke-virtual {v5, v10}, Lw2;->b(LBA6;)V

    invoke-static {}, LT32;->a()LU94;

    move-result-object v0

    invoke-interface {v13, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/16 v17, 0x0

    const/16 v19, 0x0

    new-instance v6, LuA6$f;

    move-object v0, v6

    move-object/from16 v2, p0

    move-object/from16 v20, v3

    move-object v3, v9

    move/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v5, v18

    move-object v10, v6

    const/4 v11, 0x1

    move-object/from16 v6, v16

    move-object/from16 v23, v7

    move-object/from16 v7, v22

    move-object/from16 v24, v8

    move-object/from16 v8, v23

    move-object/from16 v25, v9

    move-object/from16 v9, v20

    invoke-direct/range {v0 .. v9}, LuA6$f;-><init>(ZLBA6;LvA6;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lw2;Lx2;LEX2;)V

    const v0, -0x5fba294d

    invoke-static {v13, v0, v11, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    shr-int/lit8 v1, v21, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0xc00

    const/4 v2, 0x6

    move-object/from16 p1, v14

    move-object/from16 p2, v17

    move/from16 p3, v19

    move-object/from16 p4, v0

    move-object/from16 p5, v13

    move/from16 p6, v1

    move/from16 p7, v2

    invoke-static/range {p1 .. p7}, Lg10;->a(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-static {}, LQt0;->Y()V

    :cond_30
    move-object v2, v14

    move v3, v15

    move-object/from16 v5, v16

    move-object/from16 v9, v18

    move-object/from16 v8, v22

    move-object/from16 v7, v23

    move-object/from16 v6, v24

    move-object/from16 v4, v25

    :goto_1c
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v13

    if-nez v13, :cond_31

    goto :goto_1d

    :cond_31
    new-instance v14, LuA6$g;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LuA6$g;-><init>(LBA6;LgV2;ZLvA6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx2;Lw2;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v13, v14}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1d
    return-void
.end method

.method public static final b(LEX2;)Landroid/webkit/WebView;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Landroid/webkit/WebView;",
            ">;)",
            "Landroid/webkit/WebView;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/webkit/WebView;

    return-object p0
.end method

.method public static final c(LEX2;Landroid/webkit/WebView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Landroid/webkit/WebView;",
            ">;",
            "Landroid/webkit/WebView;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(LsP5;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic e(LEX2;)Landroid/webkit/WebView;
    .locals 0

    invoke-static {p0}, LuA6;->b(LEX2;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LEX2;Landroid/webkit/WebView;)V
    .locals 0

    invoke-static {p0, p1}, LuA6;->c(LEX2;Landroid/webkit/WebView;)V

    return-void
.end method

.method public static final synthetic g(LsP5;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-static {p0}, LuA6;->d(LsP5;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LZC0;LEt0;II)LvA6;
    .locals 2

    const v0, 0x5f8182fe

    invoke-interface {p1, v0}, LEt0;->F(I)V

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_1

    const p0, 0x2e20b340

    invoke-interface {p1, p0}, LEt0;->F(I)V

    const p0, -0x1d58f75c

    invoke-interface {p1, p0}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p0

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p0, p3, :cond_0

    sget-object p0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {p0, p1}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object p0

    new-instance p3, Liu0;

    invoke-direct {p3, p0}, Liu0;-><init>(LZC0;)V

    invoke-interface {p1, p3}, LEt0;->z(Ljava/lang/Object;)V

    move-object p0, p3

    :cond_0
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p0, Liu0;

    invoke-virtual {p0}, Liu0;->a()LZC0;

    move-result-object p0

    invoke-interface {p1}, LEt0;->Q()V

    :cond_1
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, -0x1

    const-string v1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:428)"

    invoke-static {v0, p2, p3, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x44faf204

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_3

    sget-object p2, LEt0;->a:LEt0$a;

    invoke-virtual {p2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p3, p2, :cond_4

    :cond_3
    new-instance p3, LvA6;

    invoke-direct {p3, p0}, LvA6;-><init>(LZC0;)V

    invoke-interface {p1, p3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p3, LvA6;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {p1}, LEt0;->Q()V

    return-object p3
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;LEt0;II)LBA6;
    .locals 2

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3b3447eb

    invoke-interface {p2, v0}, LEt0;->F(I)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {}, LQt0;->O()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v1, "com.google.accompanist.web.rememberWebViewStateWithHTMLData (WebView.kt:476)"

    invoke-static {v0, p3, p4, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    const p3, 0x1e7b2b64

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p3, p4

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_2

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p4, p3, :cond_3

    :cond_2
    new-instance p4, LBA6;

    new-instance p3, LVz6$a;

    invoke-direct {p3, p0, p1}, LVz6$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p4, p3}, LBA6;-><init>(LVz6;)V

    invoke-interface {p2, p4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p4, LBA6;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    return-object p4
.end method

.method public static final j(LVz6;Ljava/lang/String;)LVz6$b;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LVz6$b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LVz6$b;

    invoke-static {p0, p1, v2, v1, v2}, LVz6$b;->c(LVz6$b;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)LVz6$b;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, LVz6$b;

    invoke-direct {p0, p1, v2, v1, v2}, LVz6$b;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object p0
.end method
