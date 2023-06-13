.class public final Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a$\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "T",
        "LEu1;",
        "LLifecycleOwner;",
        "owner",
        "b",
        "Landroidx/lifecycle/f;",
        "LFh0;",
        "",
        "c",
        "mvrx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final synthetic a(Landroidx/lifecycle/f;)LFh0;
    .locals 0

    invoke-static {p0}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt;->c(Landroidx/lifecycle/f;)LFh0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LEu1;LLifecycleOwner;)LEu1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "LLifecycleOwner;",
            ")",
            "LEu1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$a;-><init>(LLifecycleOwner;LEu1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0}, LVu1;->E(Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/lifecycle/f;)LFh0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/f;",
            ")",
            "LFh0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, -0x1

    invoke-static {v2, v0, v0, v1, v0}, LPh0;->b(ILk30;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LFh0;

    move-result-object v0

    new-instance v1, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$startedChannel$observer$1;

    invoke-direct {v1, v0}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$startedChannel$observer$1;-><init>(LFh0;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    new-instance v2, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$b;

    invoke-direct {v2, p0, v1}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$b;-><init>(Landroidx/lifecycle/f;Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt$startedChannel$observer$1;)V

    invoke-interface {v0, v2}, Lys5;->e(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method
