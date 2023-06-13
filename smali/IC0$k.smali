.class public final LIC0$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0;->a(LF16;Lkotlin/jvm/functions/Function1;LgV2;LG26;LEu6;Lkotlin/jvm/functions/Function1;LrX2;La30;ZIILGY1;LZk2;ZZLkotlin/jvm/functions/Function3;LEt0;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LCe3;",
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
.field public final synthetic g:LC16;

.field public final synthetic h:Landroidx/compose/ui/focus/h;

.field public final synthetic i:Z

.field public final synthetic j:Lx16;

.field public final synthetic k:LHe3;


# direct methods
.method public constructor <init>(LC16;Landroidx/compose/ui/focus/h;ZLx16;LHe3;)V
    .locals 0

    iput-object p1, p0, LIC0$k;->g:LC16;

    iput-object p2, p0, LIC0$k;->h:Landroidx/compose/ui/focus/h;

    iput-boolean p3, p0, LIC0$k;->i:Z

    iput-object p4, p0, LIC0$k;->j:Lx16;

    iput-object p5, p0, LIC0$k;->k:LHe3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LIC0$k;->invoke-k-4lQ0M(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 11

    iget-object v0, p0, LIC0$k;->g:LC16;

    iget-object v1, p0, LIC0$k;->h:Landroidx/compose/ui/focus/h;

    iget-boolean v2, p0, LIC0$k;->i:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-static {v0, v1, v2}, LIC0;->j(LC16;Landroidx/compose/ui/focus/h;Z)V

    iget-object v0, p0, LIC0$k;->g:LC16;

    invoke-virtual {v0}, LC16;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LIC0$k;->g:LC16;

    invoke-virtual {v0}, LC16;->c()LME1;

    move-result-object v0

    sget-object v1, LME1;->c:LME1;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LIC0$k;->g:LC16;

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v7

    if-eqz v7, :cond_2

    iget-object v0, p0, LIC0$k;->g:LC16;

    iget-object v9, p0, LIC0$k;->k:LHe3;

    sget-object v4, Li16;->a:Li16$a;

    invoke-virtual {v0}, LC16;->k()LP91;

    move-result-object v8

    invoke-virtual {v0}, LC16;->j()Lkotlin/jvm/functions/Function1;

    move-result-object v10

    move-wide v5, p1

    invoke-virtual/range {v4 .. v10}, Li16$a;->i(JLj26;LP91;LHe3;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, LC16;->r()LT06;

    move-result-object p1

    invoke-virtual {p1}, LT06;->l()LDf;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    sget-object p1, LME1;->d:LME1;

    invoke-virtual {v0, p1}, LC16;->u(LME1;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LIC0$k;->j:Lx16;

    invoke-static {p1, p2}, LCe3;->d(J)LCe3;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx16;->p(LCe3;)V

    :cond_2
    :goto_1
    return-void
.end method
