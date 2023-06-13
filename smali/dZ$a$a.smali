.class public final LdZ$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdZ$a;->a(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Le80;",
        "LH61;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:F

.field public final synthetic h:Lhy5;

.field public final synthetic i:Lkt4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkt4<",
            "LbZ;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:La30;


# direct methods
.method public constructor <init>(FLhy5;Lkt4;La30;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lhy5;",
            "Lkt4<",
            "LbZ;",
            ">;",
            "La30;",
            ")V"
        }
    .end annotation

    iput p1, p0, LdZ$a$a;->g:F

    iput-object p2, p0, LdZ$a$a;->h:Lhy5;

    iput-object p3, p0, LdZ$a$a;->i:Lkt4;

    iput-object p4, p0, LdZ$a$a;->j:La30;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le80;)LH61;
    .locals 12

    const-string v1, "$this$drawWithCache"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, LdZ$a$a;->g:F

    invoke-interface {p1, v1}, Lg01;->T0(F)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LxB5;->h(J)F

    move-result v1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    if-nez v1, :cond_1

    invoke-static {p1}, LdZ;->a(Le80;)LH61;

    move-result-object v0

    goto/16 :goto_3

    :cond_1
    iget v1, p0, LdZ$a$a;->g:F

    sget-object v2, Lk61;->c:Lk61$a;

    invoke-virtual {v2}, Lk61$a;->a()F

    move-result v2

    invoke-static {v1, v2}, Lk61;->i(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    iget v1, p0, LdZ$a$a;->g:F

    invoke-interface {p1, v1}, Lg01;->T0(F)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    :goto_1
    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LxB5;->h(J)F

    move-result v2

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v2, v5

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v2, v6

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v9

    div-float v1, v9, v5

    invoke-static {v1, v1}, LGe3;->a(FF)J

    move-result-wide v6

    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LxB5;->i(J)F

    move-result v1

    sub-float/2addr v1, v9

    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v10

    invoke-static {v10, v11}, LxB5;->g(J)F

    move-result v2

    sub-float/2addr v2, v9

    invoke-static {v1, v2}, LCB5;->a(FF)J

    move-result-wide v10

    mul-float/2addr v5, v9

    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LxB5;->h(J)F

    move-result v1

    cmpl-float v1, v5, v1

    if-lez v1, :cond_3

    move v8, v3

    goto :goto_2

    :cond_3
    move v8, v4

    :goto_2
    iget-object v1, p0, LdZ$a$a;->h:Lhy5;

    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v2

    invoke-virtual {p1}, Le80;->getLayoutDirection()Lpm2;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4, p1}, Lhy5;->a(JLpm2;Lg01;)LMz3;

    move-result-object v1

    instance-of v2, v1, LMz3$a;

    if-eqz v2, :cond_4

    iget-object v2, p0, LdZ$a$a;->i:Lkt4;

    iget-object v3, p0, LdZ$a$a;->j:La30;

    move-object v4, v1

    check-cast v4, LMz3$a;

    move-object v0, p1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v8

    move v5, v9

    invoke-static/range {v0 .. v5}, LdZ;->b(Le80;Lkt4;La30;LMz3$a;ZF)LH61;

    move-result-object v0

    goto :goto_3

    :cond_4
    instance-of v2, v1, LMz3$c;

    if-eqz v2, :cond_5

    iget-object v2, p0, LdZ$a$a;->i:Lkt4;

    iget-object v3, p0, LdZ$a$a;->j:La30;

    move-object v4, v1

    check-cast v4, LMz3$c;

    move-object v0, p1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-wide v4, v6

    move-wide v6, v10

    invoke-static/range {v0 .. v9}, LdZ;->d(Le80;Lkt4;La30;LMz3$c;JJZF)LH61;

    move-result-object v0

    goto :goto_3

    :cond_5
    instance-of v1, v1, LMz3$b;

    if-eqz v1, :cond_6

    iget-object v1, p0, LdZ$a$a;->j:La30;

    move-object v0, p1

    move-wide v2, v6

    move-wide v4, v10

    move v6, v8

    move v7, v9

    invoke-static/range {v0 .. v7}, LdZ;->c(Le80;La30;JJZF)LH61;

    move-result-object v0

    :goto_3
    return-object v0

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le80;

    invoke-virtual {p0, p1}, LdZ$a$a;->a(Le80;)LH61;

    move-result-object p1

    return-object p1
.end method
