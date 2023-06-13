.class public final LM9$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM9;->c(LzO2;LL9;FFLvO2;J)LyO2;
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
.field public final synthetic g:LL9;

.field public final synthetic h:F

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:LOU3;

.field public final synthetic m:I


# direct methods
.method public constructor <init>(LL9;FIIILOU3;I)V
    .locals 0

    iput-object p1, p0, LM9$a;->g:LL9;

    iput p2, p0, LM9$a;->h:F

    iput p3, p0, LM9$a;->i:I

    iput p4, p0, LM9$a;->j:I

    iput p5, p0, LM9$a;->k:I

    iput-object p6, p0, LM9$a;->l:LOU3;

    iput p7, p0, LM9$a;->m:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 9

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9$a;->g:LL9;

    invoke-static {v0}, LM9;->b(LL9;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v4, v1

    goto :goto_1

    :cond_0
    iget v0, p0, LM9$a;->h:F

    sget-object v2, Lk61;->c:Lk61$a;

    invoke-virtual {v2}, Lk61$a;->c()F

    move-result v2

    invoke-static {v0, v2}, Lk61;->i(FF)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, LM9$a;->i:I

    goto :goto_0

    :cond_1
    iget v0, p0, LM9$a;->j:I

    iget v2, p0, LM9$a;->k:I

    sub-int/2addr v0, v2

    iget-object v2, p0, LM9$a;->l:LOU3;

    invoke-virtual {v2}, LOU3;->i1()I

    move-result v2

    sub-int/2addr v0, v2

    :goto_0
    move v4, v0

    :goto_1
    iget-object v0, p0, LM9$a;->g:LL9;

    invoke-static {v0}, LM9;->b(LL9;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_2
    move v5, v1

    goto :goto_3

    :cond_2
    iget v0, p0, LM9$a;->h:F

    sget-object v1, Lk61;->c:Lk61$a;

    invoke-virtual {v1}, Lk61$a;->c()F

    move-result v1

    invoke-static {v0, v1}, Lk61;->i(FF)Z

    move-result v0

    if-nez v0, :cond_3

    iget v1, p0, LM9$a;->i:I

    goto :goto_2

    :cond_3
    iget v0, p0, LM9$a;->m:I

    iget v1, p0, LM9$a;->k:I

    sub-int/2addr v0, v1

    iget-object v1, p0, LM9$a;->l:LOU3;

    invoke-virtual {v1}, LOU3;->d1()I

    move-result v1

    sub-int v1, v0, v1

    goto :goto_2

    :goto_3
    iget-object v3, p0, LM9$a;->l:LOU3;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LOU3$a;->r(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LM9$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
