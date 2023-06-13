.class public final LFU2$c$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFU2$c;->invoke(Lh10;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lss5;",
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
.field public final synthetic g:LGU2;

.field public final synthetic h:LZC0;


# direct methods
.method public constructor <init>(LGU2;LZC0;)V
    .locals 0

    iput-object p1, p0, LFU2$c$d;->g:LGU2;

    iput-object p2, p0, LFU2$c$d;->h:LZC0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, LFU2$c$d;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 5

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFU2$c$d;->g:LGU2;

    invoke-virtual {v0}, LGU2;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LFU2$c$d$a;

    iget-object v1, p0, LFU2$c$d;->g:LGU2;

    iget-object v2, p0, LFU2$c$d;->h:LZC0;

    invoke-direct {v0, v1, v2}, LFU2$c$d$a;-><init>(LGU2;LZC0;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2, v1}, Lps5;->j(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, LFU2$c$d;->g:LGU2;

    invoke-virtual {v0}, LGU2;->g()LtX5;

    move-result-object v0

    invoke-virtual {v0}, LtX5;->n()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LHU2;->d:LHU2;

    if-ne v0, v3, :cond_0

    new-instance v0, LFU2$c$d$b;

    iget-object v3, p0, LFU2$c$d;->g:LGU2;

    iget-object v4, p0, LFU2$c$d;->h:LZC0;

    invoke-direct {v0, v3, v4}, LFU2$c$d$b;-><init>(LGU2;LZC0;)V

    invoke-static {p1, v1, v0, v2, v1}, Lps5;->m(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LFU2$c$d;->g:LGU2;

    invoke-virtual {v0}, LGU2;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LFU2$c$d$c;

    iget-object v3, p0, LFU2$c$d;->g:LGU2;

    iget-object v4, p0, LFU2$c$d;->h:LZC0;

    invoke-direct {v0, v3, v4}, LFU2$c$d$c;-><init>(LGU2;LZC0;)V

    invoke-static {p1, v1, v0, v2, v1}, Lps5;->b(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
