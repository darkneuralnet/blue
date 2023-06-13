.class public final Lz80$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;
.implements LH80;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/disposables/c;",
        "LH80<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lx80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx80<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-",
            "LHM4<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public volatile d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Lx80;Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "*>;",
            "Lio/reactivex/D<",
            "-",
            "LHM4<",
            "TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz80$a;->e:Z

    iput-object p1, p0, Lz80$a;->b:Lx80;

    iput-object p2, p0, Lz80$a;->c:Lio/reactivex/D;

    return-void
.end method


# virtual methods
.method public a(Lx80;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lx80;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lz80$a;->c:Lio/reactivex/D;

    invoke-interface {p1, p2}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    new-instance v0, Lio/reactivex/exceptions/CompositeException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-direct {v0, v1}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b(Lx80;LHM4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TT;>;",
            "LHM4<",
            "TT;>;)V"
        }
    .end annotation

    iget-boolean p1, p0, Lz80$a;->d:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    :try_start_0
    iget-object v0, p0, Lz80$a;->c:Lio/reactivex/D;

    invoke-interface {v0, p2}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    iget-boolean p2, p0, Lz80$a;->d:Z

    if-nez p2, :cond_2

    iput-boolean p1, p0, Lz80$a;->e:Z

    iget-object p2, p0, Lz80$a;->c:Lio/reactivex/D;

    invoke-interface {p2}, Lio/reactivex/D;->onComplete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-static {p2}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iget-boolean v0, p0, Lz80$a;->e:Z

    if-eqz v0, :cond_1

    invoke-static {p2}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lz80$a;->d:Z

    if-nez v0, :cond_2

    :try_start_1
    iget-object v0, p0, Lz80$a;->c:Lio/reactivex/D;

    invoke-interface {v0, p2}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/exceptions/CompositeException;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    aput-object v0, v2, p1

    invoke-direct {v1, v2}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz80$a;->d:Z

    iget-object v0, p0, Lz80$a;->b:Lx80;

    invoke-interface {v0}, Lx80;->cancel()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lz80$a;->d:Z

    return v0
.end method
