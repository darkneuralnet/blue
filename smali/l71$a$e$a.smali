.class public final Ll71$a$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll71$a$e;->invoke(Lss5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
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
.field public final synthetic g:Lm71;

.field public final synthetic h:LZC0;


# direct methods
.method public constructor <init>(Lm71;LZC0;)V
    .locals 0

    iput-object p1, p0, Ll71$a$e$a;->g:Lm71;

    iput-object p2, p0, Ll71$a$e$a;->h:LZC0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 7

    iget-object v0, p0, Ll71$a$e$a;->g:Lm71;

    invoke-virtual {v0}, Lm71;->c()LtX5;

    move-result-object v0

    invoke-virtual {v0}, LtX5;->m()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Lo71;->b:Lo71;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll71$a$e$a;->h:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Ll71$a$e$a$a;

    iget-object v0, p0, Ll71$a$e$a;->g:Lm71;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Ll71$a$e$a$a;-><init>(Lm71;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll71$a$e$a;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
