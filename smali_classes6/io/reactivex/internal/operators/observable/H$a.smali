.class public final Lio/reactivex/internal/operators/observable/H$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/H$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TU;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/disposables/h;

.field public final c:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public d:Z

.field public final synthetic e:Lio/reactivex/internal/operators/observable/H;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/H;Lio/reactivex/internal/disposables/h;Lio/reactivex/D;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/disposables/h;",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/H$a;->e:Lio/reactivex/internal/operators/observable/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/H$a;->b:Lio/reactivex/internal/disposables/h;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/H$a;->c:Lio/reactivex/D;

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 2

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/H$a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/H$a;->d:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a;->e:Lio/reactivex/internal/operators/observable/H;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/H;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/H$a$a;

    invoke-direct {v1, p0}, Lio/reactivex/internal/operators/observable/H$a$a;-><init>(Lio/reactivex/internal/operators/observable/H$a;)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/H$a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/H$a;->d:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/H$a;->onComplete()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/H$a;->b:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/disposables/h;->b(Lio/reactivex/disposables/c;)Z

    return-void
.end method
