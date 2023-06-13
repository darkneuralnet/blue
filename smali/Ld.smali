.class public final LLd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aM\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a/\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a3\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a \u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "LCe3;",
        "position",
        "",
        "isStartHandle",
        "LUL4;",
        "direction",
        "handlesCrossed",
        "LgV2;",
        "modifier",
        "Lkotlin/Function0;",
        "",
        "content",
        "c",
        "(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V",
        "a",
        "(LgV2;ZLUL4;ZLEt0;I)V",
        "f",
        "Le80;",
        "",
        "radius",
        "LMW1;",
        "e",
        "LLE1;",
        "handleReferencePoint",
        "b",
        "(JLLE1;Lkotlin/jvm/functions/Function2;LEt0;I)V",
        "h",
        "areHandlesCrossed",
        "g",
        "foundation_release"
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
        "SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n558#2,17:332\n50#3:349\n49#3:350\n1114#4,6:351\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n194#1:332,17\n232#1:349\n232#1:350\n232#1:351,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LgV2;ZLUL4;ZLEt0;I)V
    .locals 7

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2dbc596

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    and-int/lit8 v1, p5, 0xe

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x70

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x380

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0x1c00

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v1, v1, 0x16db

    const/16 v2, 0x492

    if-ne v1, v2, :cond_9

    invoke-interface {p4}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LEt0;->k()V

    goto :goto_6

    :cond_9
    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)"

    invoke-static {v0, p5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    invoke-static {}, LSr5;->c()F

    move-result v0

    invoke-static {}, LSr5;->b()F

    move-result v1

    invoke-static {p0, v0, v1}, LBB5;->x(LgV2;FF)LgV2;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, LLd;->f(LgV2;ZLUL4;Z)LgV2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p4, v1}, LDN5;->a(LgV2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_6
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p4

    if-nez p4, :cond_c

    goto :goto_7

    :cond_c
    new-instance v6, LLd$a;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LLd$a;-><init>(LgV2;ZLUL4;ZI)V

    invoke-interface {p4, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final b(JLLE1;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LLE1;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v11, p3

    move/from16 v12, p5

    const-string v0, "handleReferencePoint"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x53fc662e

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, v12, 0xe

    move-wide/from16 v13, p0

    if-nez v2, :cond_1

    invoke-interface {v1, v13, v14}, LEt0;->s(J)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    and-int/lit8 v4, v12, 0x70

    if-nez v4, :cond_3

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v12, 0x380

    if-nez v4, :cond_5

    invoke-interface {v1, v11}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v2, 0x2db

    const/16 v5, 0x92

    if-ne v4, v5, :cond_7

    invoke-interface {v1}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, -0x1

    const-string v5, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)"

    invoke-static {v0, v2, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    invoke-static/range {p0 .. p1}, LCe3;->o(J)F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    invoke-static/range {p0 .. p1}, LCe3;->p(J)F

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-static {v0, v4}, LB52;->a(II)J

    move-result-wide v4

    invoke-static {v4, v5}, LA52;->b(J)LA52;

    move-result-object v0

    const v6, 0x1e7b2b64

    invoke-interface {v1, v6}, LEt0;->F(I)V

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v6

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_9

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_a

    :cond_9
    new-instance v6, LJE1;

    const/4 v0, 0x0

    invoke-direct {v6, v3, v4, v5, v0}, LJE1;-><init>(LLE1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {v1}, LEt0;->Q()V

    move-object v4, v6

    check-cast v4, LJE1;

    const/4 v5, 0x0

    new-instance v6, LAY3;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0xf

    const/16 v23, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v23}, LAY3;-><init>(ZZZLOq5;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shl-int/lit8 v0, v2, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v9, v0, 0x180

    const/4 v10, 0x2

    move-object/from16 v7, p3

    move-object v8, v1

    invoke-static/range {v4 .. v10}, Lxd;->a(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_5
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_c

    goto :goto_6

    :cond_c
    new-instance v7, LLd$b;

    move-object v0, v7

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LLd$b;-><init>(JLLE1;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method public static final c(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "LUL4;",
            "Z",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v9, p3

    move-object/from16 v10, p5

    move/from16 v11, p8

    const-string v0, "direction"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x24bbecda

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v1, v11, 0xe

    move-wide/from16 v13, p0

    if-nez v1, :cond_1

    invoke-interface {v12, v13, v14}, LEt0;->s(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v11, 0x70

    move/from16 v15, p2

    if-nez v2, :cond_3

    invoke-interface {v12, v15}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v11, 0x380

    if-nez v2, :cond_5

    invoke-interface {v12, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v11, 0x1c00

    move/from16 v8, p4

    if-nez v2, :cond_7

    invoke-interface {v12, v8}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    const v2, 0xe000

    and-int/2addr v2, v11

    if-nez v2, :cond_9

    invoke-interface {v12, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x70000

    and-int/2addr v2, v11

    move-object/from16 v7, p6

    if-nez v2, :cond_b

    invoke-interface {v12, v7}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    move v6, v1

    const v1, 0x5b6db

    and-int/2addr v1, v6

    const v2, 0x12492

    if-ne v1, v2, :cond_d

    invoke-interface {v12}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_7

    :cond_c
    invoke-interface {v12}, LEt0;->k()V

    goto :goto_9

    :cond_d
    :goto_7
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)"

    invoke-static {v0, v6, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_e
    invoke-static/range {p2 .. p4}, LLd;->h(ZLUL4;Z)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, LLE1;->c:LLE1;

    goto :goto_8

    :cond_f
    sget-object v0, LLE1;->b:LLE1;

    :goto_8
    move-object/from16 v16, v0

    new-instance v4, LLd$c;

    move-object v0, v4

    move-object/from16 v1, p6

    move-object/from16 v2, p5

    move/from16 v3, p2

    move-object v9, v4

    move-wide/from16 v4, p0

    move/from16 v17, v6

    move-object/from16 v7, p3

    move/from16 v8, p4

    invoke-direct/range {v0 .. v8}, LLd$c;-><init>(Lkotlin/jvm/functions/Function2;LgV2;ZJILUL4;Z)V

    const v0, 0x2ba2f39d

    const/4 v1, 0x1

    invoke-static {v12, v0, v1, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    and-int/lit8 v0, v17, 0xe

    or-int/lit16 v6, v0, 0x180

    move-wide/from16 v1, p0

    move-object/from16 v3, v16

    move-object v5, v12

    invoke-static/range {v1 .. v6}, LLd;->b(JLLE1;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    :goto_9
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_11

    goto :goto_a

    :cond_11
    new-instance v12, LLd$d;

    move-object v0, v12

    move-wide/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LLd$d;-><init>(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {v9, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method public static final synthetic d(ZLUL4;Z)Z
    .locals 0

    invoke-static {p0, p1, p2}, LLd;->h(ZLUL4;Z)Z

    move-result p0

    return p0
.end method

.method public static final e(Le80;F)LMW1;
    .locals 30

    move-object/from16 v0, p0

    move/from16 v3, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-double v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    float-to-int v1, v1

    mul-int/lit8 v5, v1, 0x2

    sget-object v1, LIE1;->a:LIE1;

    invoke-virtual {v1}, LIE1;->c()LMW1;

    move-result-object v2

    invoke-virtual {v1}, LIE1;->a()Lme0;

    move-result-object v4

    invoke-virtual {v1}, LIE1;->b()Loe0;

    move-result-object v11

    if-eqz v2, :cond_0

    if-eqz v4, :cond_0

    invoke-interface {v2}, LMW1;->getWidth()I

    move-result v6

    if-gt v5, v6, :cond_0

    invoke-interface {v2}, LMW1;->getHeight()I

    move-result v6

    if-le v5, v6, :cond_1

    :cond_0
    sget-object v2, LNW1;->b:LNW1$a;

    invoke-virtual {v2}, LNW1$a;->a()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v10, 0x0

    move v4, v5

    invoke-static/range {v4 .. v10}, LOW1;->b(IIIZLBm0;ILjava/lang/Object;)LMW1;

    move-result-object v2

    invoke-virtual {v1, v2}, LIE1;->f(LMW1;)V

    invoke-static {v2}, Lse0;->a(LMW1;)Lme0;

    move-result-object v4

    invoke-virtual {v1, v4}, LIE1;->d(Lme0;)V

    :cond_1
    move-object v12, v2

    move-object v13, v4

    if-nez v11, :cond_2

    new-instance v11, Loe0;

    invoke-direct {v11}, Loe0;-><init>()V

    invoke-virtual {v1, v11}, LIE1;->e(Loe0;)V

    :cond_2
    move-object/from16 v27, v11

    invoke-virtual/range {p0 .. p0}, Le80;->getLayoutDirection()Lpm2;

    move-result-object v1

    invoke-interface {v12}, LMW1;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-interface {v12}, LMW1;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v4}, LCB5;->a(FF)J

    move-result-wide v4

    invoke-virtual/range {v27 .. v27}, Loe0;->o()Loe0$a;

    move-result-object v2

    invoke-virtual {v2}, Loe0$a;->a()Lg01;

    move-result-object v11

    invoke-virtual {v2}, Loe0$a;->b()Lpm2;

    move-result-object v10

    invoke-virtual {v2}, Loe0$a;->c()Lme0;

    move-result-object v9

    invoke-virtual {v2}, Loe0$a;->d()J

    move-result-wide v7

    invoke-virtual/range {v27 .. v27}, Loe0;->o()Loe0$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Loe0$a;->j(Lg01;)V

    invoke-virtual {v2, v1}, Loe0$a;->k(Lpm2;)V

    invoke-virtual {v2, v13}, Loe0$a;->i(Lme0;)V

    invoke-virtual {v2, v4, v5}, Loe0$a;->l(J)V

    invoke-interface {v13}, Lme0;->v()V

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->a()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    invoke-interface/range {v27 .. v27}, LI61;->h()J

    move-result-wide v19

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    sget-object v0, LLW;->b:LLW$a;

    invoke-virtual {v0}, LLW$a;->a()I

    move-result v24

    const/16 v25, 0x3a

    const/16 v26, 0x0

    move-object/from16 v14, v27

    invoke-static/range {v14 .. v26}, LI61;->z0(LI61;JJJFLJ61;Lsm0;IILjava/lang/Object;)V

    const-wide v0, 0xff000000L

    invoke-static {v0, v1}, Lvm0;->c(J)J

    move-result-wide v15

    sget-object v2, LCe3;->b:LCe3$a;

    invoke-virtual {v2}, LCe3$a;->c()J

    move-result-wide v17

    invoke-static {v3, v3}, LCB5;->a(FF)J

    move-result-wide v19

    const/16 v24, 0x0

    const/16 v25, 0x78

    invoke-static/range {v14 .. v26}, LI61;->z0(LI61;JJJFLJ61;Lsm0;IILjava/lang/Object;)V

    invoke-static {v0, v1}, Lvm0;->c(J)J

    move-result-wide v1

    invoke-static {v3, v3}, LGe3;->a(FF)J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x78

    const/16 v18, 0x0

    move-object/from16 v0, v27

    move/from16 v3, p1

    move-wide/from16 v28, v7

    move-object v7, v14

    move-object v8, v15

    move-object v14, v9

    move/from16 v9, v16

    move-object v15, v10

    move/from16 v10, v17

    move-object/from16 v16, v12

    move-object v12, v11

    move-object/from16 v11, v18

    invoke-static/range {v0 .. v11}, LI61;->J(LI61;JFJFLJ61;Lsm0;IILjava/lang/Object;)V

    invoke-interface {v13}, Lme0;->p()V

    invoke-virtual/range {v27 .. v27}, Loe0;->o()Loe0$a;

    move-result-object v0

    invoke-virtual {v0, v12}, Loe0$a;->j(Lg01;)V

    invoke-virtual {v0, v15}, Loe0$a;->k(Lpm2;)V

    invoke-virtual {v0, v14}, Loe0$a;->i(Lme0;)V

    move-wide/from16 v1, v28

    invoke-virtual {v0, v1, v2}, Loe0$a;->l(J)V

    return-object v16
.end method

.method public static final f(LgV2;ZLUL4;Z)LgV2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LLd$e;

    invoke-direct {v0, p1, p2, p3}, LLd$e;-><init>(ZLUL4;Z)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, LDt0;->b(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LUL4;Z)Z
    .locals 1

    const-string v0, "direction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LUL4;->b:LUL4;

    if-ne p0, v0, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    sget-object v0, LUL4;->c:LUL4;

    if-ne p0, v0, :cond_2

    if-eqz p1, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(ZLUL4;Z)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, LLd;->g(LUL4;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LLd;->g(LUL4;Z)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
