.class public final LNz3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aQ\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aQ\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0016\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0016\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u0017\u001a\u0016\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u0018*\u00020\u001aH\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001c\u001a\u000c\u0010\u001f\u001a\u00020\u001e*\u00020\u001aH\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "LI61;",
        "LMz3;",
        "outline",
        "Lpm0;",
        "color",
        "",
        "alpha",
        "LJ61;",
        "style",
        "Lsm0;",
        "colorFilter",
        "LLW;",
        "blendMode",
        "",
        "d",
        "(LI61;LMz3;JFLJ61;Lsm0;I)V",
        "La30;",
        "brush",
        "b",
        "(LI61;LMz3;La30;FLJ61;Lsm0;I)V",
        "LOs4;",
        "LCe3;",
        "i",
        "(LOs4;)J",
        "LxB5;",
        "g",
        "LWb5;",
        "j",
        "(LWb5;)J",
        "h",
        "",
        "f",
        "ui-graphics_release"
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
        "SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(LWb5;)Z
    .locals 0

    invoke-static {p0}, LNz3;->f(LWb5;)Z

    move-result p0

    return p0
.end method

.method public static final b(LI61;LMz3;La30;FLJ61;Lsm0;I)V
    .locals 14

    move-object v0, p1

    const-string v1, "$this$drawOutline"

    move-object v2, p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "outline"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "brush"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "style"

    move-object/from16 v11, p4

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, LMz3$b;

    if-eqz v1, :cond_0

    check-cast v0, LMz3$b;

    invoke-virtual {v0}, LMz3$b;->a()LOs4;

    move-result-object v0

    invoke-static {v0}, LNz3;->i(LOs4;)J

    move-result-wide v5

    invoke-static {v0}, LNz3;->g(LOs4;)J

    move-result-wide v0

    move-object v2, p0

    move-object/from16 v3, p2

    move-wide v4, v5

    move-wide v6, v0

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v11, p6

    invoke-interface/range {v2 .. v11}, LI61;->m0(La30;JJFLJ61;Lsm0;I)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, LMz3$c;

    if-eqz v1, :cond_2

    check-cast v0, LMz3$c;

    invoke-virtual {v0}, LMz3$c;->b()LcJ3;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LMz3$c;->a()LWb5;

    move-result-object v0

    invoke-virtual {v0}, LWb5;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, LLC0;->d(J)F

    move-result v1

    invoke-static {v0}, LNz3;->j(LWb5;)J

    move-result-wide v5

    invoke-static {v0}, LNz3;->h(LWb5;)J

    move-result-wide v7

    const/4 v0, 0x2

    const/4 v3, 0x0

    const/4 v9, 0x0

    invoke-static {v1, v9, v0, v3}, LMC0;->b(FFILjava/lang/Object;)J

    move-result-wide v0

    move-object v2, p0

    move-object/from16 v3, p2

    move-wide v4, v5

    move-wide v6, v7

    move-wide v8, v0

    move/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move/from16 v13, p6

    invoke-interface/range {v2 .. v13}, LI61;->R(La30;JJJFLJ61;Lsm0;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, LMz3$a;

    if-eqz v1, :cond_3

    check-cast v0, LMz3$a;

    invoke-virtual {v0}, LMz3$a;->a()LcJ3;

    move-result-object v3

    :goto_0
    move-object v2, p0

    move-object/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    invoke-interface/range {v2 .. v8}, LI61;->j0(LcJ3;La30;FLJ61;Lsm0;I)V

    :goto_1
    return-void

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static synthetic c(LI61;LMz3;La30;FLJ61;Lsm0;IILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lzl1;->a:Lzl1;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    sget-object p3, LI61;->O:LI61$a;

    invoke-virtual {p3}, LI61$a;->a()I

    move-result p6

    :cond_3
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, LNz3;->b(LI61;LMz3;La30;FLJ61;Lsm0;I)V

    return-void
.end method

.method public static final d(LI61;LMz3;JFLJ61;Lsm0;I)V
    .locals 15

    move-object/from16 v0, p1

    const-string v1, "$this$drawOutline"

    move-object v2, p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "outline"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "style"

    move-object/from16 v11, p5

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, LMz3$b;

    if-eqz v1, :cond_0

    check-cast v0, LMz3$b;

    invoke-virtual {v0}, LMz3$b;->a()LOs4;

    move-result-object v0

    invoke-static {v0}, LNz3;->i(LOs4;)J

    move-result-wide v5

    invoke-static {v0}, LNz3;->g(LOs4;)J

    move-result-wide v7

    move-object v2, p0

    move-wide/from16 v3, p2

    move/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move/from16 v12, p7

    invoke-interface/range {v2 .. v12}, LI61;->k0(JJJFLJ61;Lsm0;I)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, LMz3$c;

    if-eqz v1, :cond_2

    check-cast v0, LMz3$c;

    invoke-virtual {v0}, LMz3$c;->b()LcJ3;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LMz3$c;->a()LWb5;

    move-result-object v0

    invoke-virtual {v0}, LWb5;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->d(J)F

    move-result v1

    invoke-static {v0}, LNz3;->j(LWb5;)J

    move-result-wide v5

    invoke-static {v0}, LNz3;->h(LWb5;)J

    move-result-wide v7

    const/4 v0, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v3}, LMC0;->b(FFILjava/lang/Object;)J

    move-result-wide v9

    move-object v2, p0

    move-wide/from16 v3, p2

    move-object/from16 v11, p5

    move/from16 v12, p4

    move-object/from16 v13, p6

    move/from16 v14, p7

    invoke-interface/range {v2 .. v14}, LI61;->W0(JJJJLJ61;FLsm0;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, LMz3$a;

    if-eqz v1, :cond_3

    check-cast v0, LMz3$a;

    invoke-virtual {v0}, LMz3$a;->a()LcJ3;

    move-result-object v3

    :goto_0
    move-object v2, p0

    move-wide/from16 v4, p2

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-interface/range {v2 .. v9}, LI61;->Z(LcJ3;JFLJ61;Lsm0;I)V

    :goto_1
    return-void

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static synthetic e(LI61;LMz3;JFLJ61;Lsm0;IILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    sget-object v0, Lzl1;->a:Lzl1;

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p5

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, p6

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    sget-object v0, LI61;->O:LI61$a;

    invoke-virtual {v0}, LI61$a;->a()I

    move-result v0

    move v8, v0

    goto :goto_3

    :cond_3
    move/from16 v8, p7

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-static/range {v1 .. v8}, LNz3;->d(LI61;LMz3;JFLJ61;Lsm0;I)V

    return-void
.end method

.method public static final f(LWb5;)Z
    .locals 6

    invoke-virtual {p0}, LWb5;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LLC0;->d(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, LLC0;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LWb5;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->d(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->d(J)F

    move-result v3

    cmpg-float v0, v0, v3

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LWb5;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->d(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->d(J)F

    move-result v3

    cmpg-float v0, v0, v3

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    invoke-virtual {p0}, LWb5;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->e(J)F

    move-result v3

    invoke-virtual {p0}, LWb5;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, LLC0;->e(J)F

    move-result v4

    cmpg-float v3, v3, v4

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    move v3, v2

    :goto_4
    if-eqz v3, :cond_7

    invoke-virtual {p0}, LWb5;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->e(J)F

    move-result v3

    invoke-virtual {p0}, LWb5;->i()J

    move-result-wide v4

    invoke-static {v4, v5}, LLC0;->e(J)F

    move-result v4

    cmpg-float v3, v3, v4

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    move v3, v2

    :goto_5
    if-eqz v3, :cond_7

    invoke-virtual {p0}, LWb5;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, LLC0;->e(J)F

    move-result v3

    invoke-virtual {p0}, LWb5;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LLC0;->e(J)F

    move-result p0

    cmpg-float p0, v3, p0

    if-nez p0, :cond_6

    move p0, v1

    goto :goto_6

    :cond_6
    move p0, v2

    :goto_6
    if-eqz p0, :cond_7

    move p0, v1

    goto :goto_7

    :cond_7
    move p0, v2

    :goto_7
    if-eqz v0, :cond_8

    if-eqz p0, :cond_8

    goto :goto_8

    :cond_8
    move v1, v2

    :goto_8
    return v1
.end method

.method public static final g(LOs4;)J
    .locals 2

    invoke-virtual {p0}, LOs4;->o()F

    move-result v0

    invoke-virtual {p0}, LOs4;->h()F

    move-result p0

    invoke-static {v0, p0}, LCB5;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final h(LWb5;)J
    .locals 2

    invoke-virtual {p0}, LWb5;->j()F

    move-result v0

    invoke-virtual {p0}, LWb5;->d()F

    move-result p0

    invoke-static {v0, p0}, LCB5;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final i(LOs4;)J
    .locals 2

    invoke-virtual {p0}, LOs4;->i()F

    move-result v0

    invoke-virtual {p0}, LOs4;->l()F

    move-result p0

    invoke-static {v0, p0}, LGe3;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final j(LWb5;)J
    .locals 2

    invoke-virtual {p0}, LWb5;->e()F

    move-result v0

    invoke-virtual {p0}, LWb5;->g()F

    move-result p0

    invoke-static {v0, p0}, LGe3;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method
