.class public final Lq16$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq16;->j(LgV2;LeZ;)LgV2;
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
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LiA0;",
        "",
        "a",
        "(LiA0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:F

.field public final synthetic h:LeZ;


# direct methods
.method public constructor <init>(FLeZ;)V
    .locals 0

    iput p1, p0, Lq16$e;->g:F

    iput-object p2, p0, Lq16$e;->h:LeZ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "$this$drawWithContent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, LiA0;->n0()V

    iget v1, v0, Lq16$e;->g:F

    sget-object v3, Lk61;->c:Lk61$a;

    invoke-virtual {v3}, Lk61$a;->a()F

    move-result v3

    invoke-static {v1, v3}, Lk61;->i(FF)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget v1, v0, Lq16$e;->g:F

    invoke-interface/range {p1 .. p1}, Lg01;->b()F

    move-result v3

    mul-float v8, v1, v3

    invoke-interface/range {p1 .. p1}, LI61;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LxB5;->g(J)F

    move-result v1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float v3, v8, v3

    sub-float/2addr v1, v3

    iget-object v3, v0, Lq16$e;->h:LeZ;

    invoke-virtual {v3}, LeZ;->a()La30;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4, v1}, LGe3;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p1 .. p1}, LI61;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, LxB5;->i(J)F

    move-result v6

    invoke-static {v6, v1}, LGe3;->a(FF)J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x1f0

    const/4 v15, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v15}, LI61;->f0(LI61;La30;JJFILiJ3;FLsm0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, Lq16$e;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
