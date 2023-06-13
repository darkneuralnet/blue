.class public final LMw$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMw$a;->a(LzO2;Ljava/util/List;J)LyO2;
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LOU3;

.field public final synthetic h:LzO2;

.field public final synthetic i:LOU3;


# direct methods
.method public constructor <init>(LOU3;LzO2;LOU3;)V
    .locals 0

    iput-object p1, p0, LMw$a$a;->g:LOU3;

    iput-object p2, p0, LMw$a$a;->h:LzO2;

    iput-object p3, p0, LMw$a$a;->i:LOU3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 9

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMw$a$a;->g:LOU3;

    invoke-virtual {v0}, LOU3;->i1()I

    move-result v0

    iget-object v1, p0, LMw$a$a;->h:LzO2;

    invoke-static {}, LMw;->c()F

    move-result v2

    invoke-interface {v1, v2}, Lg01;->F0(F)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {}, LMw;->d()F

    move-result v0

    goto :goto_1

    :cond_1
    invoke-static {}, LMw;->b()F

    move-result v0

    :goto_1
    iget-object v2, p0, LMw$a$a;->i:LOU3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LOU3$a;->r(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    iget-object v1, p0, LMw$a$a;->i:LOU3;

    invoke-virtual {v1}, LOU3;->i1()I

    move-result v1

    iget-object v2, p0, LMw$a$a;->h:LzO2;

    invoke-interface {v2, v0}, Lg01;->F0(F)I

    move-result v0

    add-int v4, v1, v0

    iget-object v0, p0, LMw$a$a;->g:LOU3;

    invoke-virtual {v0}, LOU3;->d1()I

    move-result v0

    neg-int v0, v0

    div-int/lit8 v5, v0, 0x2

    iget-object v3, p0, LMw$a$a;->g:LOU3;

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

    invoke-virtual {p0, p1}, LMw$a$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
