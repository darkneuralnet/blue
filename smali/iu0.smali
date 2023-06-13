.class public final Liu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPv4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Liu0;",
        "LPv4;",
        "",
        "onRemembered",
        "onForgotten",
        "onAbandoned",
        "LZC0;",
        "b",
        "LZC0;",
        "a",
        "()LZC0;",
        "coroutineScope",
        "<init>",
        "(LZC0;)V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# instance fields
.field public final b:LZC0;


# direct methods
.method public constructor <init>(LZC0;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liu0;->b:LZC0;

    return-void
.end method


# virtual methods
.method public final a()LZC0;
    .locals 1

    iget-object v0, p0, Liu0;->b:LZC0;

    return-object v0
.end method

.method public onAbandoned()V
    .locals 3

    iget-object v0, p0, Liu0;->b:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LaD0;->d(LZC0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public onForgotten()V
    .locals 3

    iget-object v0, p0, Liu0;->b:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LaD0;->d(LZC0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public onRemembered()V
    .locals 0

    return-void
.end method
