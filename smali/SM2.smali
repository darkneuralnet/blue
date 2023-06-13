.class public final LSM2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a-\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a-\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a5\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "LMm0;",
        "colors",
        "LB26;",
        "e",
        "(LMm0;LEt0;I)LB26;",
        "Lpm0;",
        "selectionColor",
        "textColor",
        "backgroundColor",
        "d",
        "(JJJ)J",
        "",
        "a",
        "(JJJ)F",
        "selectionColorAlpha",
        "c",
        "(JFJJ)F",
        "foreground",
        "background",
        "b",
        "(JJ)F",
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
        "SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n76#3:245\n67#4,3:246\n66#4:249\n1114#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(JJJ)F
    .locals 12

    const/4 v0, 0x0

    const v1, 0x3e4ccccd    # 0.2f

    const v2, 0x3ecccccd    # 0.4f

    move v11, v0

    move v9, v2

    move v10, v9

    :goto_0
    const/4 v2, 0x7

    if-ge v11, v2, :cond_2

    move-wide v2, p0

    move v4, v9

    move-wide v5, p2

    move-wide/from16 v7, p4

    invoke-static/range {v2 .. v8}, LSM2;->c(JFJJ)F

    move-result v2

    const/high16 v3, 0x40900000    # 4.5f

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    const/4 v3, 0x0

    cmpg-float v4, v3, v2

    if-gtz v4, :cond_0

    const v4, 0x3c23d70a    # 0.01f

    cmpg-float v4, v2, v4

    if-gtz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    if-nez v4, :cond_2

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    move v10, v9

    goto :goto_2

    :cond_1
    move v1, v9

    :goto_2
    add-float v2, v10, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float v9, v2, v3

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    return v9
.end method

.method public static final b(JJ)F
    .locals 0

    invoke-static {p0, p1}, Lvm0;->f(J)F

    move-result p0

    const p1, 0x3d4ccccd    # 0.05f

    add-float/2addr p0, p1

    invoke-static {p2, p3}, Lvm0;->f(J)F

    move-result p2

    add-float/2addr p2, p1

    invoke-static {p0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    div-float/2addr p1, p0

    return p1
.end method

.method public static final c(JFJJ)F
    .locals 8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-wide v0, p0

    move v2, p2

    invoke-static/range {v0 .. v7}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1, p5, p6}, Lvm0;->d(JJ)J

    move-result-wide p0

    invoke-static {p3, p4, p0, p1}, Lvm0;->d(JJ)J

    move-result-wide p2

    invoke-static {p2, p3, p0, p1}, LSM2;->b(JJ)F

    move-result p0

    return p0
.end method

.method public static final d(JJJ)J
    .locals 8

    const v2, 0x3ecccccd    # 0.4f

    move-wide v0, p0

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, LSM2;->c(JFJJ)F

    move-result v0

    const v3, 0x3e4ccccd    # 0.2f

    move-wide v1, p0

    move-wide v4, p2

    move-wide v6, p4

    invoke-static/range {v1 .. v7}, LSM2;->c(JFJJ)F

    move-result v1

    const/high16 v2, 0x40900000    # 4.5f

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    const p2, 0x3ecccccd    # 0.4f

    :goto_0
    move v2, p2

    goto :goto_1

    :cond_0
    cmpg-float v0, v1, v2

    if-gez v0, :cond_1

    const p2, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    invoke-static/range {p0 .. p5}, LSM2;->a(JJJ)F

    move-result p2

    goto :goto_0

    :goto_1
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-wide v0, p0

    invoke-static/range {v0 .. v7}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(LMm0;LEt0;I)LB26;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "colors"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x2b0437ad

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"

    move/from16 v5, p2

    invoke-static {v2, v5, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, LMm0;->j()J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, LMm0;->c()J

    move-result-wide v9

    const v2, 0x21eccae

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-static {v0, v9, v10}, LNm0;->a(LMm0;J)J

    move-result-wide v2

    sget-object v4, Lpm0;->b:Lpm0$a;

    invoke-virtual {v4}, Lpm0$a;->g()J

    move-result-wide v7

    cmp-long v4, v2, v7

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, LgA0;->a()LU94;

    move-result-object v2

    invoke-interface {v1, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpm0;

    invoke-virtual {v2}, Lpm0;->w()J

    move-result-wide v2

    :goto_1
    move-wide v11, v2

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    sget-object v2, LWz0;->a:LWz0;

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, LWz0;->d(LEt0;I)F

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/16 v18, 0x0

    invoke-static/range {v11 .. v18}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-static {v5, v6}, Lpm0;->i(J)Lpm0;

    move-result-object v2

    invoke-static {v9, v10}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v4

    const v11, 0x607fb4c4

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, LB26;

    invoke-virtual/range {p0 .. p0}, LMm0;->j()J

    move-result-wide v12

    invoke-static/range {v5 .. v10}, LSM2;->d(JJJ)J

    move-result-wide v14

    const/16 v16, 0x0

    move-object v11, v3

    invoke-direct/range {v11 .. v16}, LB26;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    check-cast v3, LB26;

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    return-object v3
.end method
