.class public final Lio/reactivex/internal/operators/completable/A$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/completable/A$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/completable/A$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/completable/A$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/A$a$a;->b:Lio/reactivex/internal/operators/completable/A$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a$a;->b:Lio/reactivex/internal/operators/completable/A$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/A$a;->c:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a$a;->b:Lio/reactivex/internal/operators/completable/A$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/A$a;->d:Lio/reactivex/f;

    invoke-interface {v0}, Lio/reactivex/f;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a$a;->b:Lio/reactivex/internal/operators/completable/A$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/A$a;->c:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a$a;->b:Lio/reactivex/internal/operators/completable/A$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/A$a;->d:Lio/reactivex/f;

    invoke-interface {v0, p1}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/A$a$a;->b:Lio/reactivex/internal/operators/completable/A$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/A$a;->c:Lio/reactivex/disposables/b;

    invoke-virtual {v0, p1}, Lio/reactivex/disposables/b;->c(Lio/reactivex/disposables/c;)Z

    return-void
.end method
