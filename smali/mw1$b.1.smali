.class public final Lmw1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmw1;->h(LAc6;)LsP5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "LCc6;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "LCc6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkotlin/Function1;",
        "LCc6;",
        "",
        "onAsyncCompletion",
        "a",
        "(Lkotlin/jvm/functions/Function1;)LCc6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lmw1;

.field public final synthetic h:LAc6;


# direct methods
.method public constructor <init>(Lmw1;LAc6;)V
    .locals 0

    iput-object p1, p0, Lmw1$b;->g:Lmw1;

    iput-object p2, p0, Lmw1$b;->h:LAc6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)LCc6;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCc6;",
            "Lkotlin/Unit;",
            ">;)",
            "LCc6;"
        }
    .end annotation

    const-string v0, "onAsyncCompletion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmw1$b;->g:Lmw1;

    invoke-static {v0}, Lmw1;->d(Lmw1;)Lsw1;

    move-result-object v0

    iget-object v1, p0, Lmw1$b;->h:LAc6;

    iget-object v2, p0, Lmw1$b;->g:Lmw1;

    invoke-virtual {v2}, Lmw1;->g()LxV3;

    move-result-object v2

    iget-object v3, p0, Lmw1$b;->g:Lmw1;

    invoke-static {v3}, Lmw1;->c(Lmw1;)Lkotlin/jvm/functions/Function1;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, Lsw1;->a(LAc6;LxV3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LCc6;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lmw1$b;->g:Lmw1;

    invoke-static {v0}, Lmw1;->e(Lmw1;)LwV3;

    move-result-object v0

    iget-object v1, p0, Lmw1$b;->h:LAc6;

    iget-object v2, p0, Lmw1$b;->g:Lmw1;

    invoke-virtual {v2}, Lmw1;->g()LxV3;

    move-result-object v2

    iget-object v3, p0, Lmw1$b;->g:Lmw1;

    invoke-static {v3}, Lmw1;->c(Lmw1;)Lkotlin/jvm/functions/Function1;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, LwV3;->a(LAc6;LxV3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LCc6;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not load font"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1}, Lmw1$b;->a(Lkotlin/jvm/functions/Function1;)LCc6;

    move-result-object p1

    return-object p1
.end method
