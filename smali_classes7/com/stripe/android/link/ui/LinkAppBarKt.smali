.class public final Lcom/stripe/android/link/ui/LinkAppBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a`\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022+\u0010\n\u001a\'\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\u0004\u0018\u0001`\u0008\u00a2\u0006\u0002\u0008\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LinkAppBarState;",
        "state",
        "Lkotlin/Function0;",
        "",
        "onBackPressed",
        "onLogout",
        "Lkotlin/Function1;",
        "LPm0;",
        "Lcom/stripe/android/link/ui/BottomSheetContent;",
        "Lkotlin/ExtensionFunctionType;",
        "showBottomSheetContent",
        "LinkAppBar",
        "(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "LinkAppBarPreview",
        "(LEt0;I)V",
        "LinkAppBar_NoEmail",
        "LinkAppBar_ChildScreen",
        "LinkAppBar_ChildScreen_NoEmail",
        "link_release"
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
        "SMAP\nLinkAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,208:1\n79#2,2:209\n81#2:237\n85#2:291\n75#3:211\n76#3,11:213\n75#3:246\n76#3,11:248\n89#3:276\n89#3:290\n76#4:212\n76#4:247\n460#5,13:224\n460#5,13:259\n473#5,3:273\n50#5:279\n49#5:280\n473#5,3:287\n154#6:238\n154#6:239\n154#6:278\n74#7,6:240\n80#7:272\n84#7:277\n1057#8,6:281\n76#9:292\n76#9:293\n*S KotlinDebug\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt\n*L\n42#1:209,2\n42#1:237\n42#1:291\n42#1:211\n42#1:213,11\n62#1:246\n62#1:248,11\n62#1:276\n42#1:290\n42#1:212\n62#1:247\n42#1:224,13\n62#1:259,13\n62#1:273,3\n98#1:279\n98#1:280\n42#1:287,3\n51#1:238\n66#1:239\n114#1:278\n62#1:240,6\n62#1:272\n62#1:277\n98#1:281,6\n60#1:292\n93#1:293\n*E\n"
    }
.end annotation


# direct methods
.method public static final LinkAppBar(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move/from16 v13, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLogout"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showBottomSheetContent"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2db8e6cb

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v2, v13, 0xe

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v13

    goto :goto_1

    :cond_1
    move v2, v13

    :goto_1
    and-int/lit8 v4, v13, 0x70

    if-nez v4, :cond_3

    invoke-interface {v15, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v13, 0x380

    if-nez v4, :cond_5

    invoke-interface {v15, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v13, 0x1c00

    if-nez v4, :cond_7

    invoke-interface {v15, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v2, v4

    :cond_7
    move v14, v2

    and-int/lit16 v2, v14, 0x16db

    const/16 v4, 0x492

    if-ne v2, v4, :cond_9

    invoke-interface {v15}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v15}, LEt0;->k()V

    goto/16 :goto_a

    :cond_9
    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.ui.LinkAppBar (LinkAppBar.kt:35)"

    invoke-static {v0, v14, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v9, 0x0

    const/4 v8, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v9, v8, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getAppBarHeight()F

    move-result v5

    invoke-static {v4, v9, v5, v8, v2}, LBB5;->h(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v22, Llo;->a:Llo;

    invoke-virtual/range {v22 .. v22}, Llo;->b()Llo$e;

    move-result-object v4

    sget-object v23, LK9;->a:LK9$a;

    invoke-virtual/range {v23 .. v23}, LK9$a;->k()LK9$c;

    move-result-object v5

    const v6, 0x2952b718

    invoke-interface {v15, v6}, LEt0;->F(I)V

    const/16 v6, 0x36

    invoke-static {v4, v5, v15, v6}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v4

    const v7, -0x4ee9b9da

    invoke-interface {v15, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v24, LBt0;->M:LBt0$a;

    invoke-virtual/range {v24 .. v24}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_b

    invoke-static {}, Lyt0;->c()V

    :cond_b
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v15, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    :cond_c
    invoke-interface {v15}, LEt0;->e()V

    :goto_6
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual/range {v24 .. v24}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v4, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v24 .. v24}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v24 .. v24}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v24 .. v24}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v4, v15, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v8, 0x7ab4aae9

    invoke-interface {v15, v8}, LEt0;->F(I)V

    const v2, -0x286e2e7f

    invoke-interface {v15, v2}, LEt0;->F(I)V

    sget-object v18, Lad5;->a:Lad5;

    const v2, 0x6151ac99

    invoke-interface {v15, v2}, LEt0;->F(I)V

    int-to-float v7, v3

    invoke-static {v7}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v2, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$1;

    invoke-direct {v2, v1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$1;-><init>(Lcom/stripe/android/link/ui/LinkAppBarState;)V

    const v6, 0x586b5335

    const/4 v8, 0x1

    invoke-static {v15, v6, v8, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    shr-int/lit8 v2, v14, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6030

    const/16 v17, 0xc

    move/from16 v20, v2

    move-object/from16 v2, p1

    move/from16 v25, v7

    move-object v7, v15

    move/from16 v8, v20

    move/from16 p4, v9

    const/16 v26, 0x0

    move/from16 v9, v17

    invoke-static/range {v2 .. v9}, LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/LinkAppBarState;->getShowHeader()Z

    move-result v2

    const/high16 v27, 0x3f800000    # 1.0f

    if-eqz v2, :cond_d

    move/from16 v2, v27

    goto :goto_7

    :cond_d
    move/from16 v2, v26

    :goto_7
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    move-object v6, v15

    invoke-static/range {v2 .. v8}, LJe;->f(FLlf;FLkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    move-object/from16 v16, v18

    move-object/from16 v17, v0

    move/from16 v18, v3

    invoke-static/range {v16 .. v21}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v3

    invoke-static {v2}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar$lambda$4$lambda$0(LsP5;)F

    move-result v2

    invoke-static {v3, v2}, LU9;->a(LgV2;F)LgV2;

    move-result-object v28

    const/16 v29, 0x0

    const/16 v2, 0x12

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v30

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0xd

    const/16 v34, 0x0

    invoke-static/range {v28 .. v34}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-virtual/range {v23 .. v23}, LK9$a;->g()LK9$b;

    move-result-object v3

    const v4, -0x1cd0f17e

    invoke-interface {v15, v4}, LEt0;->F(I)V

    invoke-virtual/range {v22 .. v22}, Llo;->g()Llo$l;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v3, v15, v5}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v15, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    invoke-virtual/range {v24 .. v24}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_e

    invoke-static {}, Lyt0;->c()V

    :cond_e
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v15, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_8

    :cond_f
    invoke-interface {v15}, LEt0;->e()V

    :goto_8
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual/range {v24 .. v24}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v3, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v24 .. v24}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v24 .. v24}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v24 .. v24}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v15, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v15, v2}, LEt0;->F(I)V

    const v2, -0x455f09d5

    invoke-interface {v15, v2}, LEt0;->F(I)V

    sget-object v16, LQm0;->a:LQm0;

    const v2, -0x5ea54ff1

    invoke-interface {v15, v2}, LEt0;->F(I)V

    sget v2, Lcom/stripe/android/link/R$drawable;->ic_link_logo:I

    move/from16 v9, p4

    invoke-static {v2, v15, v9}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v2

    sget v3, Lcom/stripe/android/link/R$string;->link:I

    invoke-static {v3, v15, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    sget-object v5, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v5, v15, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkColors;->getLinkLogo-0d7_KjU()J

    move-result-wide v5

    const/16 v8, 0x8

    const/16 v17, 0x4

    move-object v7, v15

    move/from16 v18, v9

    move/from16 v9, v17

    invoke-static/range {v2 .. v9}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/LinkAppBarState;->getEmail()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_10

    const/16 v18, 0x1

    :cond_10
    const/4 v2, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/16 v19, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1;

    invoke-direct {v4, v1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1;-><init>(Lcom/stripe/android/link/ui/LinkAppBarState;)V

    const v5, 0x543a38e7

    const/4 v6, 0x1

    invoke-static {v15, v5, v6, v4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v20

    const v22, 0x180006

    const/16 v23, 0x1e

    move v9, v14

    move-object/from16 v14, v16

    move-object v8, v15

    move/from16 v15, v18

    move-object/from16 v16, v2

    move-object/from16 v18, v3

    move-object/from16 v21, v8

    invoke-static/range {v14 .. v23}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface {v8}, LEt0;->Q()V

    invoke-interface {v8}, LEt0;->Q()V

    invoke-interface {v8}, LEt0;->Q()V

    invoke-interface {v8}, LEt0;->f()V

    invoke-interface {v8}, LEt0;->Q()V

    invoke-interface {v8}, LEt0;->Q()V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/LinkAppBarState;->getShowOverflowMenu()Z

    move-result v2

    if-eqz v2, :cond_11

    move/from16 v2, v27

    goto :goto_9

    :cond_11
    move/from16 v2, v26

    :goto_9
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v14, 0xe

    move-object v6, v8

    move-object v15, v8

    move v8, v14

    invoke-static/range {v2 .. v8}, LJe;->f(FLlf;FLkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/LinkAppBarState;->getShowOverflowMenu()Z

    move-result v4

    invoke-static {v2}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar$lambda$4$lambda$2(LsP5;)F

    move-result v2

    invoke-static {v0, v2}, LU9;->a(LgV2;F)LgV2;

    move-result-object v0

    invoke-static/range {v25 .. v25}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v3

    const v0, 0x1e7b2b64

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-interface {v15, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v15, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_12

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_13

    :cond_12
    new-instance v2, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1;

    invoke-direct {v2, v12, v11, v9}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v15, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_13
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    const/4 v5, 0x0

    sget-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->getLambda-1$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    const/16 v8, 0x6000

    const/16 v9, 0x8

    move-object v7, v15

    invoke-static/range {v2 .. v9}, LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LQt0;->Y()V

    :cond_14
    :goto_a
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_15

    goto :goto_b

    :cond_15
    new-instance v7, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$2;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$2;-><init>(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method

.method private static final LinkAppBar$lambda$4$lambda$0(LsP5;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final LinkAppBar$lambda$4$lambda$2(LsP5;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final LinkAppBarPreview(LEt0;I)V
    .locals 4

    const v0, 0x7bc94637

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkAppBarPreview (LinkAppBar.kt:126)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->getLambda-3$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBarPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBarPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final LinkAppBar_ChildScreen(LEt0;I)V
    .locals 4

    const v0, 0x6cb608c

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkAppBar_ChildScreen (LinkAppBar.kt:168)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->getLambda-7$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar_ChildScreen$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar_ChildScreen$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final LinkAppBar_ChildScreen_NoEmail(LEt0;I)V
    .locals 4

    const v0, -0x97e3978

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkAppBar_ChildScreen_NoEmail (LinkAppBar.kt:189)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->getLambda-9$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar_ChildScreen_NoEmail$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar_ChildScreen_NoEmail$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final LinkAppBar_NoEmail(LEt0;I)V
    .locals 4

    const v0, 0x3b2b52bf

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkAppBar_NoEmail (LinkAppBar.kt:147)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;->getLambda-5$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar_NoEmail$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar_NoEmail$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$LinkAppBarPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBarPreview(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LinkAppBar_ChildScreen(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar_ChildScreen(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LinkAppBar_ChildScreen_NoEmail(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar_ChildScreen_NoEmail(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LinkAppBar_NoEmail(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar_NoEmail(LEt0;I)V

    return-void
.end method
