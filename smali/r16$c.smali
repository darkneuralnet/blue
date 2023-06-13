.class public final Lr16$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr16;->a(LzO2;Ljava/util/List;J)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOU3$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LOU3$a;",
        "",
        "a",
        "(LOU3$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOU3;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:LOU3;

.field public final synthetic m:LOU3;

.field public final synthetic n:LOU3;

.field public final synthetic o:LOU3;

.field public final synthetic p:Lr16;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:LzO2;


# direct methods
.method public constructor <init>(LOU3;IIIILOU3;LOU3;LOU3;LOU3;Lr16;IILzO2;)V
    .locals 0

    iput-object p1, p0, Lr16$c;->g:LOU3;

    iput p2, p0, Lr16$c;->h:I

    iput p3, p0, Lr16$c;->i:I

    iput p4, p0, Lr16$c;->j:I

    iput p5, p0, Lr16$c;->k:I

    iput-object p6, p0, Lr16$c;->l:LOU3;

    iput-object p7, p0, Lr16$c;->m:LOU3;

    iput-object p8, p0, Lr16$c;->n:LOU3;

    iput-object p9, p0, Lr16$c;->o:LOU3;

    iput-object p10, p0, Lr16$c;->p:Lr16;

    iput p11, p0, Lr16$c;->q:I

    iput p12, p0, Lr16$c;->r:I

    iput-object p13, p0, Lr16$c;->s:LzO2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 15

    move-object v0, p0

    const-string v1, "$this$layout"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lr16$c;->g:LOU3;

    if-eqz v1, :cond_0

    iget v1, v0, Lr16$c;->h:I

    iget v3, v0, Lr16$c;->i:I

    sub-int/2addr v1, v3

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v11

    iget v3, v0, Lr16$c;->j:I

    iget v4, v0, Lr16$c;->k:I

    iget-object v5, v0, Lr16$c;->l:LOU3;

    iget-object v6, v0, Lr16$c;->g:LOU3;

    iget-object v7, v0, Lr16$c;->m:LOU3;

    iget-object v8, v0, Lr16$c;->n:LOU3;

    iget-object v9, v0, Lr16$c;->o:LOU3;

    iget-object v1, v0, Lr16$c;->p:Lr16;

    invoke-static {v1}, Lr16;->h(Lr16;)Z

    move-result v10

    iget v1, v0, Lr16$c;->q:I

    iget v12, v0, Lr16$c;->r:I

    add-int/2addr v12, v1

    iget-object v1, v0, Lr16$c;->p:Lr16;

    invoke-static {v1}, Lr16;->f(Lr16;)F

    move-result v13

    iget-object v1, v0, Lr16$c;->s:LzO2;

    invoke-interface {v1}, Lg01;->b()F

    move-result v14

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lq16;->f(LOU3$a;IILOU3;LOU3;LOU3;LOU3;LOU3;ZIIFF)V

    goto :goto_0

    :cond_0
    iget v3, v0, Lr16$c;->j:I

    iget v4, v0, Lr16$c;->k:I

    iget-object v5, v0, Lr16$c;->l:LOU3;

    iget-object v6, v0, Lr16$c;->m:LOU3;

    iget-object v7, v0, Lr16$c;->n:LOU3;

    iget-object v8, v0, Lr16$c;->o:LOU3;

    iget-object v1, v0, Lr16$c;->p:Lr16;

    invoke-static {v1}, Lr16;->h(Lr16;)Z

    move-result v9

    iget-object v1, v0, Lr16$c;->s:LzO2;

    invoke-interface {v1}, Lg01;->b()F

    move-result v10

    iget-object v1, v0, Lr16$c;->p:Lr16;

    invoke-static {v1}, Lr16;->g(Lr16;)LPD3;

    move-result-object v11

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v11}, Lq16;->g(LOU3$a;IILOU3;LOU3;LOU3;LOU3;ZFLPD3;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, Lr16$c;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
