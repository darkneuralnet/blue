.class public abstract LSN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u0006\"\u0008\u0008\u0001\u0010\u0002*\u00020\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H&R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0014\u001a\u0004\u0008\t\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LSN2;",
        "",
        "S",
        "LAN2;",
        "LRN2;",
        "viewModel",
        "LsN2;",
        "e",
        "",
        "a",
        "Z",
        "b",
        "()Z",
        "debugMode",
        "LEN2;",
        "LEN2;",
        "c",
        "()LEN2;",
        "stateStore",
        "LZC0;",
        "LZC0;",
        "()LZC0;",
        "coroutineScope",
        "Lkotlin/coroutines/CoroutineContext;",
        "d",
        "Lkotlin/coroutines/CoroutineContext;",
        "()Lkotlin/coroutines/CoroutineContext;",
        "subscriptionCoroutineContextOverride",
        "<init>",
        "(ZLEN2;LZC0;Lkotlin/coroutines/CoroutineContext;)V",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:LEN2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEN2<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final c:LZC0;

.field public final d:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(ZLEN2;LZC0;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LEN2<",
            "TS;>;",
            "LZC0;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "stateStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriptionCoroutineContextOverride"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LSN2;->a:Z

    iput-object p2, p0, LSN2;->b:LEN2;

    iput-object p3, p0, LSN2;->c:LZC0;

    iput-object p4, p0, LSN2;->d:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public final a()LZC0;
    .locals 1

    iget-object v0, p0, LSN2;->c:LZC0;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LSN2;->a:Z

    return v0
.end method

.method public final c()LEN2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEN2<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, LSN2;->b:LEN2;

    return-object v0
.end method

.method public final d()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    iget-object v0, p0, LSN2;->d:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public abstract e(LRN2;)LsN2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            ">(",
            "LRN2<",
            "TS;>;)",
            "LsN2;"
        }
    .end annotation
.end method
