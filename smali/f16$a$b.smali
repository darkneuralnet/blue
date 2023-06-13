.class public final Lf16$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf16$a;->a(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LiA0;",
        "Lkotlin/Unit;",
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
.field public final synthetic g:Lne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne<",
            "Ljava/lang/Float;",
            "Lsf;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LHe3;

.field public final synthetic i:LF16;

.field public final synthetic j:LC16;

.field public final synthetic k:La30;


# direct methods
.method public constructor <init>(Lne;LHe3;LF16;LC16;La30;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne<",
            "Ljava/lang/Float;",
            "Lsf;",
            ">;",
            "LHe3;",
            "LF16;",
            "LC16;",
            "La30;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lf16$a$b;->g:Lne;

    iput-object p2, p0, Lf16$a$b;->h:LHe3;

    iput-object p3, p0, Lf16$a$b;->i:LF16;

    iput-object p4, p0, Lf16$a$b;->j:LC16;

    iput-object p5, p0, Lf16$a$b;->k:La30;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$drawWithContent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, LiA0;->n0()V

    iget-object v2, v0, Lf16$a$b;->g:Lne;

    invoke-virtual {v2}, Lne;->n()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v10

    cmpg-float v2, v10, v4

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_3

    iget-object v2, v0, Lf16$a$b;->h:LHe3;

    iget-object v3, v0, Lf16$a$b;->i:LF16;

    invoke-virtual {v3}, LF16;->g()J

    move-result-wide v5

    invoke-static {v5, v6}, Ls26;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LHe3;->originalToTransformed(I)I

    move-result v2

    iget-object v3, v0, Lf16$a$b;->j:LC16;

    invoke-virtual {v3}, LC16;->g()Lj26;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lj26;->i()Li26;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Li26;->d(I)LOs4;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    new-instance v2, LOs4;

    invoke-direct {v2, v4, v4, v4, v4}, LOs4;-><init>(FFFF)V

    :cond_2
    invoke-static {}, Lf16;->c()F

    move-result v3

    invoke-interface {v1, v3}, Lg01;->T0(F)F

    move-result v7

    invoke-virtual {v2}, LOs4;->i()F

    move-result v3

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float v4, v7, v4

    add-float/2addr v3, v4

    invoke-interface/range {p1 .. p1}, LI61;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LxB5;->i(J)F

    move-result v5

    sub-float/2addr v5, v4

    invoke-static {v3, v5}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v3

    invoke-virtual {v2}, LOs4;->l()F

    move-result v4

    invoke-static {v3, v4}, LGe3;->a(FF)J

    move-result-wide v4

    invoke-virtual {v2}, LOs4;->e()F

    move-result v2

    invoke-static {v3, v2}, LGe3;->a(FF)J

    move-result-wide v8

    iget-object v2, v0, Lf16$a$b;->k:La30;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1b0

    const/16 v16, 0x0

    move-object/from16 v1, p1

    move-wide v3, v4

    move-wide v5, v8

    move v8, v11

    move-object v9, v12

    move-object v11, v13

    move v12, v14

    move v13, v15

    move-object/from16 v14, v16

    invoke-static/range {v1 .. v14}, LI61;->f0(LI61;La30;JJFILiJ3;FLsm0;IILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, Lf16$a$b;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
