.class public final LnN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LnN2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u001a\u000e\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u0002\u001a \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0000\u001a \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lhu1;",
        "s",
        "LyM2;",
        "g",
        "t",
        "h",
        "m",
        "e",
        "LUc4;",
        "quaternion",
        "f",
        "LVb5;",
        "order",
        "a",
        "d",
        "eye",
        "target",
        "up",
        "b",
        "forward",
        "c",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(LyM2;LVb5;)Lhu1;
    .locals 8

    const-string v0, "m"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhu1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lhu1;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, LnN2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const v3, 0x3f7ffffe    # 0.9999999f

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, -0x40800000    # -1.0f

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    invoke-virtual {p1}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v6

    invoke-virtual {v6}, Liu1;->g()F

    move-result v6

    cmpg-float v7, v6, v5

    if-gez v7, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    cmpl-float v5, v6, v4

    if-lez v5, :cond_1

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_2

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v2

    invoke-virtual {v2}, Liu1;->g()F

    move-result v2

    neg-float v2, v2

    float-to-double v2, v2

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->g()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    neg-float v1, v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->f()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :cond_2
    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :pswitch_1
    invoke-virtual {p1}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v6

    invoke-virtual {v6}, Liu1;->g()F

    move-result v6

    cmpg-float v7, v6, v5

    if-gez v7, :cond_3

    move v4, v5

    goto :goto_1

    :cond_3
    cmpl-float v5, v6, v4

    if-lez v5, :cond_4

    goto :goto_1

    :cond_4
    move v4, v6

    :goto_1
    neg-float v4, v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_5

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v2

    invoke-virtual {v2}, Liu1;->g()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->g()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :cond_5
    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    neg-float v1, v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->f()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p1}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v6

    invoke-virtual {v6}, Liu1;->f()F

    move-result v6

    cmpg-float v7, v6, v5

    if-gez v7, :cond_6

    move v4, v5

    goto :goto_2

    :cond_6
    cmpl-float v5, v6, v4

    if-lez v5, :cond_7

    goto :goto_2

    :cond_7
    move v4, v6

    :goto_2
    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_8

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v2

    invoke-virtual {v2}, Liu1;->f()F

    move-result v2

    neg-float v2, v2

    float-to-double v2, v2

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    neg-float v1, v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :cond_8
    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->g()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :pswitch_3
    invoke-virtual {p1}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v6

    invoke-virtual {v6}, Liu1;->f()F

    move-result v6

    cmpg-float v7, v6, v5

    if-gez v7, :cond_9

    move v4, v5

    goto :goto_3

    :cond_9
    cmpl-float v5, v6, v4

    if-lez v5, :cond_a

    goto :goto_3

    :cond_a
    move v4, v6

    :goto_3
    neg-float v4, v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_b

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v2

    invoke-virtual {v2}, Liu1;->e()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->g()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->f()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :cond_b
    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->g()F

    move-result v3

    neg-float v3, v3

    float-to-double v3, v3

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    float-to-double v5, p0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    double-to-float p0, v3

    invoke-virtual {v0, v1, p0}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object p0

    invoke-virtual {v0, p0, v2}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :pswitch_4
    invoke-virtual {p1}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v6

    invoke-virtual {v6}, Liu1;->e()F

    move-result v6

    cmpg-float v7, v6, v5

    if-gez v7, :cond_c

    move v4, v5

    goto :goto_4

    :cond_c
    cmpl-float v5, v6, v4

    if-lez v5, :cond_d

    goto :goto_4

    :cond_d
    move v4, v6

    :goto_4
    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_e

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v2

    invoke-virtual {v2}, Liu1;->f()F

    move-result v2

    neg-float v2, v2

    float-to-double v2, v2

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->g()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    neg-float v1, v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :cond_e
    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->g()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->f()F

    move-result p0

    float-to-double v5, p0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    double-to-float p0, v3

    invoke-virtual {v0, v1, p0}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object p0

    invoke-virtual {v0, p0, v2}, Lhu1;->j(LUj6;F)V

    goto/16 :goto_6

    :pswitch_5
    invoke-virtual {p1}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v6

    invoke-virtual {v6}, Liu1;->e()F

    move-result v6

    cmpg-float v7, v6, v5

    if-gez v7, :cond_f

    move v4, v5

    goto :goto_5

    :cond_f
    cmpl-float v5, v6, v4

    if-lez v5, :cond_10

    goto :goto_5

    :cond_10
    move v4, v6

    :goto_5
    neg-float v4, v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_11

    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v2

    invoke-virtual {v2}, Liu1;->g()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object p1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    float-to-double v3, p0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    double-to-float p0, v1

    invoke-virtual {v0, p1, p0}, Lhu1;->j(LUj6;F)V

    goto :goto_6

    :cond_11
    invoke-virtual {p1}, LVb5;->d()LUj6;

    move-result-object v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->f()F

    move-result v3

    neg-float v3, v3

    float-to-double v3, v3

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->g()F

    move-result p0

    float-to-double v5, p0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    double-to-float p0, v3

    invoke-virtual {v0, v1, p0}, Lhu1;->j(LUj6;F)V

    invoke-virtual {p1}, LVb5;->c()LUj6;

    move-result-object p0

    invoke-virtual {v0, p0, v2}, Lhu1;->j(LUj6;F)V

    :goto_6
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v6}, Lhu1;->e(Lhu1;FFFILjava/lang/Object;)Lhu1;

    move-result-object p0

    invoke-virtual {p0}, Lhu1;->g()F

    move-result p1

    const v0, 0x42652ee0

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lhu1;->k(F)V

    invoke-virtual {p0}, Lhu1;->h()F

    move-result p1

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lhu1;->l(F)V

    invoke-virtual {p0}, Lhu1;->i()F

    move-result p1

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lhu1;->m(F)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lhu1;Lhu1;Lhu1;)LyM2;
    .locals 4

    const-string v0, "eye"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "up"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhu1;

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v1

    invoke-virtual {p0}, Lhu1;->g()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v2

    invoke-virtual {p0}, Lhu1;->h()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Lhu1;->i()F

    move-result p1

    invoke-virtual {p0}, Lhu1;->i()F

    move-result v3

    sub-float/2addr p1, v3

    invoke-direct {v0, v1, v2, p1}, Lhu1;-><init>(FFF)V

    invoke-static {p0, v0, p2}, LnN2;->c(Lhu1;Lhu1;Lhu1;)LyM2;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lhu1;Lhu1;Lhu1;)LyM2;
    .locals 6

    const-string v0, "eye"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "forward"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "up"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object p1

    new-instance v0, Lhu1;

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v1

    invoke-virtual {p2}, Lhu1;->i()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p1}, Lhu1;->i()F

    move-result v2

    invoke-virtual {p2}, Lhu1;->h()F

    move-result v3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Lhu1;->i()F

    move-result v2

    invoke-virtual {p2}, Lhu1;->g()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v3

    invoke-virtual {p2}, Lhu1;->i()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v3

    invoke-virtual {p2}, Lhu1;->h()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v4

    invoke-virtual {p2}, Lhu1;->g()F

    move-result p2

    mul-float/2addr v4, p2

    sub-float/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Lhu1;-><init>(FFF)V

    invoke-static {v0}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object p2

    new-instance v0, Lhu1;

    invoke-virtual {p2}, Lhu1;->h()F

    move-result v1

    invoke-virtual {p1}, Lhu1;->i()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p2}, Lhu1;->i()F

    move-result v2

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p2}, Lhu1;->i()F

    move-result v2

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p2}, Lhu1;->g()F

    move-result v3

    invoke-virtual {p1}, Lhu1;->i()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p2}, Lhu1;->g()F

    move-result v3

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p2}, Lhu1;->h()F

    move-result v4

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Lhu1;-><init>(FFF)V

    invoke-static {v0}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object v0

    new-instance v1, LyM2;

    new-instance v2, Liu1;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v2, p2, v3, v4, v5}, Liu1;-><init>(Lhu1;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, Liu1;

    invoke-direct {p2, v0, v3, v4, v5}, Liu1;-><init>(Lhu1;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Liu1;

    invoke-virtual {p1}, Lhu1;->n()Lhu1;

    move-result-object p1

    invoke-direct {v0, p1, v3, v4, v5}, Liu1;-><init>(Lhu1;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Liu1;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {p1, p0, v3}, Liu1;-><init>(Lhu1;F)V

    invoke-direct {v1, v2, p2, v0, p1}, LyM2;-><init>(Liu1;Liu1;Liu1;Liu1;)V

    return-object v1
.end method

.method public static final d(LyM2;)LUc4;
    .locals 6

    const-string v0, "m"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->e()F

    move-result v0

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    add-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    const/high16 v2, 0x3e800000    # 0.25f

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x40000000    # 2.0f

    if-lez v1, :cond_0

    add-float/2addr v0, v3

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v4

    new-instance v1, LUc4;

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->g()F

    move-result v3

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    sub-float/2addr v3, v4

    div-float/2addr v3, v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->e()F

    move-result v4

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->g()F

    move-result v5

    sub-float/2addr v4, v5

    div-float/2addr v4, v0

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->f()F

    move-result v5

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    sub-float/2addr v5, p0

    div-float/2addr v5, v0

    mul-float/2addr v0, v2

    invoke-direct {v1, v3, v4, v5, v0}, LUc4;-><init>(FFFF)V

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->e()F

    move-result v0

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->e()F

    move-result v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->e()F

    move-result v0

    add-float/2addr v0, v3

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v4

    new-instance v1, LUc4;

    mul-float/2addr v2, v0

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->e()F

    move-result v3

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    add-float/2addr v3, v4

    div-float/2addr v3, v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->e()F

    move-result v4

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->g()F

    move-result v5

    add-float/2addr v4, v5

    div-float/2addr v4, v0

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->g()F

    move-result v5

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->f()F

    move-result p0

    sub-float/2addr v5, p0

    div-float/2addr v5, v0

    invoke-direct {v1, v2, v3, v4, v5}, LUc4;-><init>(FFFF)V

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->f()F

    move-result v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->f()F

    move-result v0

    add-float/2addr v0, v3

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v4

    new-instance v1, LUc4;

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->e()F

    move-result v3

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    add-float/2addr v3, v4

    div-float/2addr v3, v0

    mul-float/2addr v2, v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->g()F

    move-result v5

    add-float/2addr v4, v5

    div-float/2addr v4, v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->e()F

    move-result v5

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->g()F

    move-result p0

    sub-float/2addr v5, p0

    div-float/2addr v5, v0

    invoke-direct {v1, v3, v2, v4, v5}, LUc4;-><init>(FFFF)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v0

    invoke-virtual {v0}, Liu1;->g()F

    move-result v0

    add-float/2addr v0, v3

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->e()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    invoke-virtual {v1}, Liu1;->f()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v4

    new-instance v1, LUc4;

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v3

    invoke-virtual {v3}, Liu1;->e()F

    move-result v3

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->g()F

    move-result v4

    add-float/2addr v3, v4

    div-float/2addr v3, v0

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object v4

    invoke-virtual {v4}, Liu1;->f()F

    move-result v4

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->g()F

    move-result v5

    add-float/2addr v4, v5

    div-float/2addr v4, v0

    mul-float/2addr v2, v0

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v5

    invoke-virtual {v5}, Liu1;->f()F

    move-result v5

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object p0

    invoke-virtual {p0}, Liu1;->e()F

    move-result p0

    sub-float/2addr v5, p0

    div-float/2addr v5, v0

    invoke-direct {v1, v3, v4, v2, v5}, LUc4;-><init>(FFFF)V

    :goto_0
    invoke-static {v1}, LWc4;->f(LUc4;)LUc4;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LyM2;)LyM2;
    .locals 8

    const-string v0, "m"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LyM2;

    invoke-virtual {p0}, LyM2;->b()Liu1;

    move-result-object v1

    new-instance v2, Lhu1;

    invoke-virtual {v1}, Liu1;->e()F

    move-result v3

    invoke-virtual {v1}, Liu1;->f()F

    move-result v4

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lhu1;-><init>(FFF)V

    invoke-static {v2}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object v2

    invoke-virtual {p0}, LyM2;->c()Liu1;

    move-result-object v1

    new-instance v3, Lhu1;

    invoke-virtual {v1}, Liu1;->e()F

    move-result v4

    invoke-virtual {v1}, Liu1;->f()F

    move-result v5

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    invoke-direct {v3, v4, v5, v1}, Lhu1;-><init>(FFF)V

    invoke-static {v3}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object v3

    invoke-virtual {p0}, LyM2;->d()Liu1;

    move-result-object p0

    new-instance v1, Lhu1;

    invoke-virtual {p0}, Liu1;->e()F

    move-result v4

    invoke-virtual {p0}, Liu1;->f()F

    move-result v5

    invoke-virtual {p0}, Liu1;->g()F

    move-result p0

    invoke-direct {v1, v4, v5, p0}, Lhu1;-><init>(FFF)V

    invoke-static {v1}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LyM2;-><init>(Lhu1;Lhu1;Lhu1;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final f(LUc4;)LyM2;
    .locals 26

    const-string v0, "quaternion"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, LWc4;->f(LUc4;)LUc4;

    move-result-object v0

    new-instance v8, LyM2;

    new-instance v9, Liu1;

    invoke-virtual {v0}, LUc4;->c()F

    move-result v1

    invoke-virtual {v0}, LUc4;->c()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->d()F

    move-result v2

    invoke-virtual {v0}, LUc4;->d()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v10, 0x40000000    # 2.0f

    mul-float/2addr v1, v10

    const/high16 v11, 0x3f800000    # 1.0f

    sub-float v2, v11, v1

    invoke-virtual {v0}, LUc4;->b()F

    move-result v1

    invoke-virtual {v0}, LUc4;->c()F

    move-result v3

    mul-float/2addr v1, v3

    invoke-virtual {v0}, LUc4;->d()F

    move-result v3

    invoke-virtual {v0}, LUc4;->a()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v1, v3

    mul-float v3, v1, v10

    invoke-virtual {v0}, LUc4;->b()F

    move-result v1

    invoke-virtual {v0}, LUc4;->d()F

    move-result v4

    mul-float/2addr v1, v4

    invoke-virtual {v0}, LUc4;->c()F

    move-result v4

    invoke-virtual {v0}, LUc4;->a()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v1, v4

    mul-float v4, v1, v10

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Liu1;

    invoke-virtual {v0}, LUc4;->b()F

    move-result v1

    invoke-virtual {v0}, LUc4;->c()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->d()F

    move-result v2

    invoke-virtual {v0}, LUc4;->a()F

    move-result v4

    mul-float/2addr v2, v4

    sub-float/2addr v1, v2

    mul-float v13, v1, v10

    invoke-virtual {v0}, LUc4;->b()F

    move-result v1

    invoke-virtual {v0}, LUc4;->b()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->d()F

    move-result v2

    invoke-virtual {v0}, LUc4;->d()F

    move-result v4

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    mul-float/2addr v1, v10

    sub-float v14, v11, v1

    invoke-virtual {v0}, LUc4;->c()F

    move-result v1

    invoke-virtual {v0}, LUc4;->d()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->b()F

    move-result v2

    invoke-virtual {v0}, LUc4;->a()F

    move-result v4

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    mul-float v15, v1, v10

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    move-object v12, v3

    invoke-direct/range {v12 .. v18}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Liu1;

    invoke-virtual {v0}, LUc4;->b()F

    move-result v1

    invoke-virtual {v0}, LUc4;->d()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->c()F

    move-result v2

    invoke-virtual {v0}, LUc4;->a()F

    move-result v5

    mul-float/2addr v2, v5

    add-float/2addr v1, v2

    mul-float v20, v1, v10

    invoke-virtual {v0}, LUc4;->c()F

    move-result v1

    invoke-virtual {v0}, LUc4;->d()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->b()F

    move-result v2

    invoke-virtual {v0}, LUc4;->a()F

    move-result v5

    mul-float/2addr v2, v5

    sub-float/2addr v1, v2

    mul-float v21, v1, v10

    invoke-virtual {v0}, LUc4;->b()F

    move-result v1

    invoke-virtual {v0}, LUc4;->b()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0}, LUc4;->c()F

    move-result v2

    invoke-virtual {v0}, LUc4;->c()F

    move-result v0

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    mul-float/2addr v1, v10

    sub-float v22, v11, v1

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x0

    move-object/from16 v19, v4

    invoke-direct/range {v19 .. v25}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, v9

    invoke-direct/range {v1 .. v7}, LyM2;-><init>(Liu1;Liu1;Liu1;Liu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public static final g(Lhu1;)LyM2;
    .locals 24

    const-string v0, "s"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LyM2;

    new-instance v9, Liu1;

    invoke-virtual/range {p0 .. p0}, Lhu1;->g()F

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Liu1;

    const/4 v11, 0x0

    invoke-virtual/range {p0 .. p0}, Lhu1;->h()F

    move-result v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xd

    const/16 v16, 0x0

    move-object v10, v3

    invoke-direct/range {v10 .. v16}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Liu1;

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual/range {p0 .. p0}, Lhu1;->i()F

    move-result v20

    const/16 v21, 0x0

    const/16 v22, 0xb

    const/16 v23, 0x0

    move-object/from16 v17, v4

    invoke-direct/range {v17 .. v23}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LyM2;-><init>(Liu1;Liu1;Liu1;Liu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final h(Lhu1;)LyM2;
    .locals 8

    const-string v0, "t"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LyM2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Liu1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v5, p0, v1}, Liu1;-><init>(Lhu1;F)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LyM2;-><init>(Liu1;Liu1;Liu1;Liu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
