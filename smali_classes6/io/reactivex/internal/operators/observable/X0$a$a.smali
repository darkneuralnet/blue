.class public final Lio/reactivex/internal/operators/observable/X0$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/X0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/D<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2d2b4e5564d98c4aL


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/observable/X0$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/X0$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/X0$a$a;->b:Lio/reactivex/internal/operators/observable/X0$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/X0$a$a;->b:Lio/reactivex/internal/operators/observable/X0$a;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/X0$a;->a()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/X0$a$a;->b:Lio/reactivex/internal/operators/observable/X0$a;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/X0$a;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/X0$a$a;->b:Lio/reactivex/internal/operators/observable/X0$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/X0$a;->c()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    return-void
.end method
