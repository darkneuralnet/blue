.class public final LIC0$i;
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
        "LWv1;",
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

.field public final synthetic h:LU16;

.field public final synthetic i:LF16;

.field public final synthetic j:LGY1;

.field public final synthetic k:LHe3;

.field public final synthetic l:Lx16;

.field public final synthetic m:LZC0;

.field public final synthetic n:LE20;


# direct methods
.method public constructor <init>(LC16;LU16;LF16;LGY1;LHe3;Lx16;LZC0;LE20;)V
    .locals 0

    iput-object p1, p0, LIC0$i;->g:LC16;

    iput-object p2, p0, LIC0$i;->h:LU16;

    iput-object p3, p0, LIC0$i;->i:LF16;

    iput-object p4, p0, LIC0$i;->j:LGY1;

    iput-object p5, p0, LIC0$i;->k:LHe3;

    iput-object p6, p0, LIC0$i;->l:Lx16;

    iput-object p7, p0, LIC0$i;->m:LZC0;

    iput-object p8, p0, LIC0$i;->n:LE20;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWv1;

    invoke-virtual {p0, p1}, LIC0$i;->invoke(LWv1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LWv1;)V
    .locals 12

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIC0$i;->g:LC16;

    invoke-virtual {v0}, LC16;->d()Z

    move-result v0

    invoke-interface {p1}, LWv1;->a()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LIC0$i;->g:LC16;

    invoke-interface {p1}, LWv1;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, LC16;->v(Z)V

    iget-object v0, p0, LIC0$i;->h:LU16;

    if-eqz v0, :cond_1

    iget-object v1, p0, LIC0$i;->g:LC16;

    iget-object v2, p0, LIC0$i;->i:LF16;

    iget-object v3, p0, LIC0$i;->j:LGY1;

    iget-object v4, p0, LIC0$i;->k:LHe3;

    invoke-static {v0, v1, v2, v3, v4}, LIC0;->h(LU16;LC16;LF16;LGY1;LHe3;)V

    invoke-interface {p1}, LWv1;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LIC0$i;->g:LC16;

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v0, p0, LIC0$i;->m:LZC0;

    iget-object v2, p0, LIC0$i;->n:LE20;

    iget-object v3, p0, LIC0$i;->i:LF16;

    iget-object v4, p0, LIC0$i;->g:LC16;

    iget-object v6, p0, LIC0$i;->k:LHe3;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, LIC0$i$a;

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v7}, LIC0$i$a;-><init>(LE20;LF16;LC16;Lj26;LHe3;Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x3

    const/4 v11, 0x0

    move-object v6, v0

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move v10, v1

    invoke-static/range {v6 .. v11}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_1
    invoke-interface {p1}, LWv1;->a()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LIC0$i;->l:Lx16;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lx16;->q(Lx16;LCe3;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method
