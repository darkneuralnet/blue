.class public final Lio/reactivex/internal/operators/observable/H$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/H$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/observable/H$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/H$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/H$a$a;->b:Lio/reactivex/internal/operators/observable/H$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a$a;->b:Lio/reactivex/internal/operators/observable/H$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/H$a;->c:Lio/reactivex/D;

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a$a;->b:Lio/reactivex/internal/operators/observable/H$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/H$a;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a$a;->b:Lio/reactivex/internal/operators/observable/H$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/H$a;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a$a;->b:Lio/reactivex/internal/operators/observable/H$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/H$a;->b:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/disposables/h;->b(Lio/reactivex/disposables/c;)Z

    return-void
.end method
