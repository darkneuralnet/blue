.class public final LJe3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe3;->f(LzO2;LvO2;J)LyO2;
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
.field public final synthetic g:LJe3;

.field public final synthetic h:LzO2;

.field public final synthetic i:LOU3;


# direct methods
.method public constructor <init>(LJe3;LzO2;LOU3;)V
    .locals 0

    iput-object p1, p0, LJe3$a;->g:LJe3;

    iput-object p2, p0, LJe3$a;->h:LzO2;

    iput-object p3, p0, LJe3$a;->i:LOU3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 10

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJe3$a;->g:LJe3;

    invoke-virtual {v0}, LJe3;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v2, p0, LJe3$a;->h:LzO2;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA52;

    invoke-virtual {v0}, LA52;->n()J

    move-result-wide v2

    iget-object v0, p0, LJe3$a;->g:LJe3;

    invoke-virtual {v0}, LJe3;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJe3$a;->i:LOU3;

    invoke-static {v2, v3}, LA52;->j(J)I

    move-result v4

    invoke-static {v2, v3}, LA52;->k(J)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, p1

    move-object v2, v0

    move v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    invoke-static/range {v1 .. v8}, LOU3$a;->v(LOU3$a;LOU3;IIFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJe3$a;->i:LOU3;

    invoke-static {v2, v3}, LA52;->j(J)I

    move-result v4

    invoke-static {v2, v3}, LA52;->k(J)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, p1

    move-object v2, v0

    move v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    invoke-static/range {v1 .. v8}, LOU3$a;->z(LOU3$a;LOU3;IIFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LJe3$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
