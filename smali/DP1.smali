.class public final LDP1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a;\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a;\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "LtY1;",
        "imageVector",
        "",
        "contentDescription",
        "LgV2;",
        "modifier",
        "Lpm0;",
        "tint",
        "",
        "a",
        "(LtY1;Ljava/lang/String;LgV2;JLEt0;II)V",
        "LnE3;",
        "painter",
        "b",
        "(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V",
        "c",
        "LxB5;",
        "",
        "d",
        "(J)Z",
        "LgV2;",
        "DefaultIconSizeModifier",
        "material_release"
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
        "SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,170:1\n76#2:171\n76#2:172\n76#2:180\n36#3:173\n36#3:181\n1114#4,6:174\n1114#4,6:182\n154#5:188\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:171\n100#1:172\n134#1:180\n102#1:173\n139#1:181\n102#1:174,6\n139#1:182,6\n169#1:188\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LgV2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, LgV2;->b0:LgV2$a;

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v0, v1}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    sput-object v0, LDP1;->a:LgV2;

    return-void
.end method

.method public static final a(LtY1;Ljava/lang/String;LgV2;JLEt0;II)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v8, p5

    move/from16 v1, p6

    const-string v2, "imageVector"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x2fbc0c6f

    invoke-interface {v8, v2}, LEt0;->F(I)V

    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_0

    sget-object v3, LgV2;->b0:LgV2$a;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    :goto_0
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_1

    invoke-static {}, LgA0;->a()LU94;

    move-result-object v4

    invoke-interface {v8, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm0;

    invoke-virtual {v4}, Lpm0;->w()J

    move-result-wide v9

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v4

    invoke-interface {v8, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, -0x1

    const-string v7, "androidx.compose.material.Icon (Icon.kt:61)"

    invoke-static {v2, v1, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    and-int/lit8 v2, v1, 0xe

    invoke-static {v0, v8, v2}, Lgk6;->b(LtY1;LEt0;I)Lfk6;

    move-result-object v0

    sget v2, Lfk6;->i:I

    and-int/lit8 v6, v1, 0x70

    or-int/2addr v2, v6

    and-int/lit16 v6, v1, 0x380

    or-int/2addr v2, v6

    and-int/lit16 v1, v1, 0x1c00

    or-int v6, v2, v1

    const/4 v7, 0x0

    move-object/from16 v1, p1

    move-object v2, v3

    move-wide v3, v4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v7}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface/range {p5 .. p5}, LEt0;->Q()V

    return-void
.end method

.method public static final b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V
    .locals 21

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    const-string v0, "painter"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x44202ba2

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v11

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p2

    :goto_0
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_1

    invoke-static {}, LgA0;->a()LU94;

    move-result-object v1

    invoke-interface {v11, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpm0;

    invoke-virtual {v1}, Lpm0;->w()J

    move-result-wide v13

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v1

    invoke-interface {v11, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v20, 0x0

    invoke-static/range {v13 .. v20}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move/from16 v13, p6

    and-int/lit16 v3, v13, -0x1c01

    move-wide v7, v1

    goto :goto_1

    :cond_1
    move/from16 v13, p6

    move-wide/from16 v7, p3

    move v3, v13

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.Icon (Icon.kt:129)"

    invoke-static {v0, v3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->g()J

    move-result-wide v0

    invoke-static {v7, v8, v0, v1}, Lpm0;->o(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    sget-object v14, Lsm0;->b:Lsm0$a;

    const/16 v17, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    move-wide v15, v7

    invoke-static/range {v14 .. v19}, Lsm0$a;->b(Lsm0$a;JIILjava/lang/Object;)Lsm0;

    move-result-object v0

    move-object v6, v0

    :goto_2
    const v0, 0x5c3b4092

    invoke-interface {v11, v0}, LEt0;->F(I)V

    const/4 v14, 0x0

    if-eqz v10, :cond_6

    sget-object v0, LgV2;->b0:LgV2$a;

    const v2, 0x44faf204

    invoke-interface {v11, v2}, LEt0;->F(I)V

    invoke-interface {v11, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_5

    :cond_4
    new-instance v3, LDP1$b;

    invoke-direct {v3, v10}, LDP1$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {v11}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-static {v0, v14, v3, v2, v1}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v0

    goto :goto_3

    :cond_6
    sget-object v0, LgV2;->b0:LgV2$a;

    :goto_3
    move-object v15, v0

    invoke-interface {v11}, LEt0;->Q()V

    invoke-static {v12}, Landroidx/compose/ui/graphics/b;->d(LgV2;)LgV2;

    move-result-object v0

    invoke-static {v0, v9}, LDP1;->c(LgV2;LnE3;)LgV2;

    move-result-object v0

    sget-object v1, LBA0;->a:LBA0$a;

    invoke-virtual {v1}, LBA0$a;->b()LBA0;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x16

    const/16 v17, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v18, v7

    move/from16 v7, v16

    move-object/from16 v8, v17

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/draw/b;->b(LgV2;LnE3;ZLK9;LBA0;FLsm0;ILjava/lang/Object;)LgV2;

    move-result-object v0

    invoke-interface {v0, v15}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v0

    invoke-static {v0, v11, v14}, Ld10;->a(LgV2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface {v11}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_4

    :cond_8
    new-instance v11, LDP1$a;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v12

    move-wide/from16 v4, v18

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LDP1$a;-><init>(LnE3;Ljava/lang/String;LgV2;JII)V

    invoke-interface {v8, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final c(LgV2;LnE3;)LgV2;
    .locals 4

    invoke-virtual {p1}, LnE3;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v0

    sget-object v2, LxB5;->b:LxB5$a;

    invoke-virtual {v2}, LxB5$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LxB5;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LnE3;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, LDP1;->d(J)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LgV2;->b0:LgV2$a;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, LDP1;->a:LgV2;

    :goto_1
    invoke-interface {p0, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final d(J)Z
    .locals 1

    invoke-static {p0, p1}, LxB5;->i(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, LxB5;->g(J)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
