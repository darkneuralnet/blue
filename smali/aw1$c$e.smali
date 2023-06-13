.class public final Law1$c$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1$c;->e(LgV2;LEt0;I)LgV2;
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
.field public final synthetic g:LRT3;

.field public final synthetic h:LZC0;

.field public final synthetic i:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LRT3$a;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lxv1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:LrX2;

.field public final synthetic m:LE20;


# direct methods
.method public constructor <init>(LRT3;LZC0;LEX2;LEX2;LEX2;LrX2;LE20;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRT3;",
            "LZC0;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEX2<",
            "LRT3$a;",
            ">;",
            "LEX2<",
            "Lxv1;",
            ">;",
            "LrX2;",
            "LE20;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Law1$c$e;->g:LRT3;

    iput-object p2, p0, Law1$c$e;->h:LZC0;

    iput-object p3, p0, Law1$c$e;->i:LEX2;

    iput-object p4, p0, Law1$c$e;->j:LEX2;

    iput-object p5, p0, Law1$c$e;->k:LEX2;

    iput-object p6, p0, Law1$c$e;->l:LrX2;

    iput-object p7, p0, Law1$c$e;->m:LE20;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWv1;

    invoke-virtual {p0, p1}, Law1$c$e;->invoke(LWv1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LWv1;)V
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Law1$c$e;->i:LEX2;

    invoke-interface {p1}, LWv1;->a()Z

    move-result p1

    invoke-static {v0, p1}, Law1$c;->c(LEX2;Z)V

    iget-object p1, p0, Law1$c$e;->i:LEX2;

    invoke-static {p1}, Law1$c;->b(LEX2;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Law1$c$e;->j:LEX2;

    iget-object v1, p0, Law1$c$e;->g:LRT3;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LRT3;->a()LRT3$a;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-static {p1, v1}, Law1$c;->a(LEX2;LRT3$a;)V

    iget-object v2, p0, Law1$c$e;->h:LZC0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Law1$c$e$a;

    iget-object p1, p0, Law1$c$e;->k:LEX2;

    iget-object v1, p0, Law1$c$e;->l:LrX2;

    iget-object v6, p0, Law1$c$e;->m:LE20;

    invoke-direct {v5, p1, v1, v6, v0}, Law1$c$e$a;-><init>(LEX2;LrX2;LE20;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Law1$c$e;->j:LEX2;

    invoke-static {p1}, Law1$c;->d(LEX2;)LRT3$a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, LRT3$a;->release()V

    :cond_2
    iget-object p1, p0, Law1$c$e;->j:LEX2;

    invoke-static {p1, v0}, Law1$c;->a(LEX2;LRT3$a;)V

    iget-object v1, p0, Law1$c$e;->h:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Law1$c$e$b;

    iget-object p1, p0, Law1$c$e;->k:LEX2;

    iget-object v5, p0, Law1$c$e;->l:LrX2;

    invoke-direct {v4, p1, v5, v0}, Law1$c$e$b;-><init>(LEX2;LrX2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :goto_1
    return-void
.end method
