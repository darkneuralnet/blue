.class public final Lth5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/y;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/y<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u000c\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0015\u0010\u0008\u001a\u00020\u00072\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u0015\u0010\n\u001a\u00020\u00072\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0001J\u0013\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u000bH\u0096\u0001J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lth5;",
        "T",
        "Lio/reactivex/y;",
        "",
        "e",
        "Lio/reactivex/functions/f;",
        "p0",
        "",
        "a",
        "Lio/reactivex/disposables/c;",
        "b",
        "",
        "c",
        "value",
        "onNext",
        "(Ljava/lang/Object;)V",
        "onComplete",
        "error",
        "onError",
        "Lio/reactivex/y;",
        "emitter",
        "<init>",
        "(Lio/reactivex/y;)V",
        "rx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth5;->b:Lio/reactivex/y;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/functions/f;)V
    .locals 1

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    return-void
.end method

.method public b(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/y;->e()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/y;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/j;->onComplete()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/y;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/j;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/y;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lth5;->b:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
