.class public final LIC0$j;
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
        "Lnm2;",
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

.field public final synthetic h:Z

.field public final synthetic i:Lx16;

.field public final synthetic j:LF16;

.field public final synthetic k:LHe3;


# direct methods
.method public constructor <init>(LC16;ZLx16;LF16;LHe3;)V
    .locals 0

    iput-object p1, p0, LIC0$j;->g:LC16;

    iput-boolean p2, p0, LIC0$j;->h:Z

    iput-object p3, p0, LIC0$j;->i:Lx16;

    iput-object p4, p0, LIC0$j;->j:LF16;

    iput-object p5, p0, LIC0$j;->k:LHe3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnm2;

    invoke-virtual {p0, p1}, LIC0$j;->invoke(Lnm2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lnm2;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIC0$j;->g:LC16;

    invoke-virtual {v0, p1}, LC16;->x(Lnm2;)V

    iget-boolean v0, p0, LIC0$j;->h:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LIC0$j;->g:LC16;

    invoke-virtual {v0}, LC16;->c()LME1;

    move-result-object v0

    sget-object v1, LME1;->c:LME1;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LIC0$j;->g:LC16;

    invoke-virtual {v0}, LC16;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LIC0$j;->i:Lx16;

    invoke-virtual {v0}, Lx16;->a0()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LIC0$j;->i:Lx16;

    invoke-virtual {v0}, Lx16;->J()V

    :goto_0
    iget-object v0, p0, LIC0$j;->g:LC16;

    iget-object v1, p0, LIC0$j;->i:Lx16;

    invoke-static {v1, v2}, Ly16;->c(Lx16;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, LC16;->D(Z)V

    iget-object v0, p0, LIC0$j;->g:LC16;

    iget-object v1, p0, LIC0$j;->i:Lx16;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ly16;->c(Lx16;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, LC16;->C(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LIC0$j;->g:LC16;

    invoke-virtual {v0}, LC16;->c()LME1;

    move-result-object v0

    sget-object v1, LME1;->d:LME1;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LIC0$j;->g:LC16;

    iget-object v1, p0, LIC0$j;->i:Lx16;

    invoke-static {v1, v2}, Ly16;->c(Lx16;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, LC16;->A(Z)V

    :cond_2
    :goto_1
    iget-object v0, p0, LIC0$j;->g:LC16;

    iget-object v1, p0, LIC0$j;->j:LF16;

    iget-object v2, p0, LIC0$j;->k:LHe3;

    invoke-static {v0, v1, v2}, LIC0;->g(LC16;LF16;LHe3;)V

    :cond_3
    iget-object v0, p0, LIC0$j;->g:LC16;

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p1}, Lj26;->m(Lnm2;)V

    :goto_2
    return-void
.end method
