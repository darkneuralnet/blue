.class public final LZc0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\"\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\u0008*\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u000c\u001a\u00020\u0008*\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a8\u0006\r"
    }
    d2 = {
        "T",
        "Lkotlin/coroutines/Continuation;",
        "delegate",
        "LXc0;",
        "b",
        "LWc0;",
        "Lbx2;",
        "node",
        "",
        "c",
        "Lo51;",
        "handle",
        "a",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LWc0;Lo51;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "*>;",
            "Lo51;",
            ")V"
        }
    .end annotation

    new-instance v0, Ls51;

    invoke-direct {v0, p1}, Ls51;-><init>(Lo51;)V

    invoke-interface {p0, v0}, LWc0;->H(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final b(Lkotlin/coroutines/Continuation;)LXc0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "LXc0<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, LL41;

    if-nez v0, :cond_0

    new-instance v0, LXc0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, LL41;

    invoke-virtual {v0}, LL41;->i()LXc0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LXc0;->F()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, LXc0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    return-object v0
.end method

.method public static final c(LWc0;Lbx2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "*>;",
            "Lbx2;",
            ")V"
        }
    .end annotation

    new-instance v0, Lmw4;

    invoke-direct {v0, p1}, Lmw4;-><init>(Lbx2;)V

    invoke-interface {p0, v0}, LWc0;->H(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
