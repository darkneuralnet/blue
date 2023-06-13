.class public final LFu1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lna4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lna4<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\u000c\u0012\u0006\u0008\u0000\u0012\u00028\u0000\u0018\u00010\u0004H\u0016R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LFu1;",
        "",
        "T",
        "Lna4;",
        "LhT5;",
        "subscriber",
        "",
        "c",
        "LEu1;",
        "b",
        "LEu1;",
        "flow",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "<init>",
        "(LEu1;Lkotlin/coroutines/CoroutineContext;)V",
        "kotlinx-coroutines-reactive"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final b:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(LEu1;Lkotlin/coroutines/CoroutineContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "+TT;>;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFu1;->b:LEu1;

    iput-object p2, p0, LFu1;->c:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public c(LhT5;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lmv1;

    iget-object v1, p0, LFu1;->b:LEu1;

    iget-object v2, p0, LFu1;->c:Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, p1, v2}, Lmv1;-><init>(LEu1;LhT5;Lkotlin/coroutines/CoroutineContext;)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    return-void
.end method
