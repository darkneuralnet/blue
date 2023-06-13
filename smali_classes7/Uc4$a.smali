.class public final LUc4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUc4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUc4$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\tJ.\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a8\u0006\u0012"
    }
    d2 = {
        "LUc4$a;",
        "",
        "Lhu1;",
        "axis",
        "",
        "angle",
        "LUc4;",
        "a",
        "d",
        "LVb5;",
        "order",
        "c",
        "yaw",
        "pitch",
        "roll",
        "b",
        "<init>",
        "()V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LUc4$a;-><init>()V

    return-void
.end method

.method public static synthetic d(LUc4$a;Lhu1;LVb5;ILjava/lang/Object;)LUc4;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LVb5;->j:LVb5;

    :cond_0
    invoke-virtual {p0, p1, p2}, LUc4$a;->c(Lhu1;LVb5;)LUc4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lhu1;F)LUc4;
    .locals 6

    const-string v0, "axis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3c8efa35

    mul-float/2addr p2, v0

    new-instance v0, LUc4;

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr p2, v1

    float-to-double v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float p2, v3

    invoke-static {p1}, Lck6;->a(Lhu1;)Lhu1;

    move-result-object p1

    new-instance v3, Lhu1;

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v4

    mul-float/2addr v4, p2

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v5

    mul-float/2addr v5, p2

    invoke-virtual {p1}, Lhu1;->i()F

    move-result p1

    mul-float/2addr p2, p1

    invoke-direct {v3, v4, v5, p2}, Lhu1;-><init>(FFF)V

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    double-to-float p1, p1

    invoke-direct {v0, v3, p1}, LUc4;-><init>(Lhu1;F)V

    return-object v0
.end method

.method public final b(FFFLVb5;)LUc4;
    .locals 7

    const-string v0, "order"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p1, v0

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr p2, v0

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float p2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr p3, v0

    float-to-double v3, p3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float p3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v0, v3

    sget-object v3, LUc4$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v3, p4

    packed-switch p4, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p4, LUc4;

    mul-float v3, p1, v2

    mul-float v4, v3, p3

    mul-float v5, v1, p2

    mul-float v6, v5, v0

    sub-float/2addr v4, v6

    mul-float/2addr v1, v2

    mul-float v2, v1, p3

    mul-float/2addr p1, p2

    mul-float p2, p1, v0

    add-float/2addr v2, p2

    mul-float/2addr v5, p3

    mul-float/2addr v3, v0

    add-float/2addr v5, v3

    mul-float/2addr p1, p3

    mul-float/2addr v1, v0

    sub-float/2addr p1, v1

    invoke-direct {p4, v4, v2, v5, p1}, LUc4;-><init>(FFFF)V

    goto/16 :goto_0

    :pswitch_1
    new-instance p4, LUc4;

    mul-float v3, p1, p2

    mul-float v4, v3, v0

    mul-float v5, v1, v2

    mul-float v6, v5, p3

    sub-float/2addr v4, v6

    mul-float/2addr v1, p2

    mul-float p2, v1, v0

    mul-float/2addr p1, v2

    mul-float v2, p1, p3

    add-float/2addr p2, v2

    mul-float/2addr v1, p3

    mul-float/2addr p1, v0

    sub-float/2addr v1, p1

    mul-float/2addr v5, v0

    mul-float/2addr v3, p3

    add-float/2addr v5, v3

    invoke-direct {p4, v4, p2, v1, v5}, LUc4;-><init>(FFFF)V

    goto :goto_0

    :pswitch_2
    new-instance p4, LUc4;

    mul-float v3, v1, v2

    mul-float v4, v3, p3

    mul-float v5, p1, p2

    mul-float v6, v5, v0

    add-float/2addr v4, v6

    mul-float/2addr v1, p2

    mul-float p2, v1, p3

    mul-float/2addr p1, v2

    mul-float v2, p1, v0

    add-float/2addr p2, v2

    mul-float/2addr p1, p3

    mul-float/2addr v1, v0

    sub-float/2addr p1, v1

    mul-float/2addr v5, p3

    mul-float/2addr v3, v0

    sub-float/2addr v5, v3

    invoke-direct {p4, v4, p2, p1, v5}, LUc4;-><init>(FFFF)V

    goto :goto_0

    :pswitch_3
    new-instance p4, LUc4;

    mul-float v3, v1, p2

    mul-float v4, v3, v0

    mul-float v5, p1, v2

    mul-float v6, v5, p3

    add-float/2addr v4, v6

    mul-float/2addr v3, p3

    mul-float/2addr v5, v0

    sub-float/2addr v3, v5

    mul-float/2addr p1, p2

    mul-float p2, p1, v0

    mul-float/2addr v1, v2

    mul-float v2, v1, p3

    sub-float/2addr p2, v2

    mul-float/2addr v1, v0

    mul-float/2addr p1, p3

    add-float/2addr v1, p1

    invoke-direct {p4, v4, v3, p2, v1}, LUc4;-><init>(FFFF)V

    goto :goto_0

    :pswitch_4
    new-instance p4, LUc4;

    mul-float v3, v1, p2

    mul-float/2addr v3, p3

    mul-float v4, v2, v0

    mul-float/2addr v4, p1

    add-float/2addr v3, v4

    mul-float v4, v2, p1

    mul-float/2addr v4, p3

    mul-float v5, v1, v0

    mul-float/2addr v5, p2

    sub-float/2addr v4, v5

    mul-float/2addr v1, v2

    mul-float v2, v1, p3

    mul-float v5, v0, p1

    mul-float/2addr v5, p2

    add-float/2addr v2, v5

    mul-float/2addr p1, p2

    mul-float/2addr p1, p3

    mul-float/2addr v1, v0

    sub-float/2addr p1, v1

    invoke-direct {p4, v3, v4, v2, p1}, LUc4;-><init>(FFFF)V

    goto :goto_0

    :pswitch_5
    new-instance p4, LUc4;

    mul-float v3, v1, p2

    mul-float v4, v3, p3

    mul-float v5, p1, v2

    mul-float v6, v5, v0

    sub-float/2addr v4, v6

    mul-float/2addr p1, p2

    mul-float p2, p1, v0

    mul-float/2addr v1, v2

    mul-float v2, v1, p3

    sub-float/2addr p2, v2

    mul-float/2addr v3, v0

    mul-float/2addr v5, p3

    add-float/2addr v3, v5

    mul-float/2addr v1, v0

    mul-float/2addr p1, p3

    add-float/2addr v1, p1

    invoke-direct {p4, v4, p2, v3, v1}, LUc4;-><init>(FFFF)V

    :goto_0
    return-object p4

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

.method public final c(Lhu1;LVb5;)LUc4;
    .locals 7

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "order"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lhu1;->e(Lhu1;FFFILjava/lang/Object;)Lhu1;

    move-result-object p1

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v0

    const v1, 0x3c8efa35

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lhu1;->k(F)V

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v0

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lhu1;->l(F)V

    invoke-virtual {p1}, Lhu1;->i()F

    move-result v0

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lhu1;->m(F)V

    invoke-virtual {p2}, LVb5;->d()LUj6;

    move-result-object v0

    invoke-virtual {p1, v0}, Lhu1;->f(LUj6;)F

    move-result v0

    invoke-virtual {p2}, LVb5;->b()LUj6;

    move-result-object v1

    invoke-virtual {p1, v1}, Lhu1;->f(LUj6;)F

    move-result v1

    invoke-virtual {p2}, LVb5;->c()LUj6;

    move-result-object v2

    invoke-virtual {p1, v2}, Lhu1;->f(LUj6;)F

    move-result p1

    invoke-virtual {p0, v0, v1, p1, p2}, LUc4$a;->b(FFFLVb5;)LUc4;

    move-result-object p1

    return-object p1
.end method
