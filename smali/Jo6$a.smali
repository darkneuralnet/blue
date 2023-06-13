.class public final LJo6$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJo6;->f(LzO2;LvO2;J)LyO2;
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
.field public final synthetic g:LzO2;

.field public final synthetic h:LJo6;

.field public final synthetic i:LOU3;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(LzO2;LJo6;LOU3;I)V
    .locals 0

    iput-object p1, p0, LJo6$a;->g:LzO2;

    iput-object p2, p0, LJo6$a;->h:LJo6;

    iput-object p3, p0, LJo6$a;->i:LOU3;

    iput p4, p0, LJo6$a;->j:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LJo6$a;->g:LzO2;

    iget-object v0, p0, LJo6$a;->h:LJo6;

    invoke-virtual {v0}, LJo6;->a()I

    move-result v2

    iget-object v0, p0, LJo6$a;->h:LJo6;

    invoke-virtual {v0}, LJo6;->h()LA96;

    move-result-object v3

    iget-object v0, p0, LJo6$a;->h:LJo6;

    invoke-virtual {v0}, LJo6;->g()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj26;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj26;->i()Li26;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    const/4 v5, 0x0

    iget-object v0, p0, LJo6$a;->i:LOU3;

    invoke-virtual {v0}, LOU3;->i1()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lu16;->a(Lg01;ILA96;Li26;ZI)LOs4;

    move-result-object v0

    iget-object v1, p0, LJo6$a;->h:LJo6;

    invoke-virtual {v1}, LJo6;->b()Lv16;

    move-result-object v1

    sget-object v2, LEy3;->b:LEy3;

    iget v3, p0, LJo6$a;->j:I

    iget-object v4, p0, LJo6$a;->i:LOU3;

    invoke-virtual {v4}, LOU3;->d1()I

    move-result v4

    invoke-virtual {v1, v2, v0, v3, v4}, Lv16;->j(LEy3;LOs4;II)V

    iget-object v0, p0, LJo6$a;->h:LJo6;

    invoke-virtual {v0}, LJo6;->b()Lv16;

    move-result-object v0

    invoke-virtual {v0}, Lv16;->d()F

    move-result v0

    neg-float v0, v0

    iget-object v2, p0, LJo6$a;->i:LOU3;

    const/4 v3, 0x0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LOU3$a;->r(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LJo6$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
