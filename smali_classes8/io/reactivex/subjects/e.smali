.class public final Lio/reactivex/subjects/e;
.super Lio/reactivex/subjects/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/subjects/e$c;,
        Lio/reactivex/subjects/e$d;,
        Lio/reactivex/subjects/e$e;,
        Lio/reactivex/subjects/e$b;,
        Lio/reactivex/subjects/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/subjects/h<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final e:[Lio/reactivex/subjects/e$b;

.field public static final f:[Lio/reactivex/subjects/e$b;

.field public static final g:[Ljava/lang/Object;


# instance fields
.field public final b:Lio/reactivex/subjects/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/e$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "Lio/reactivex/subjects/e$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lio/reactivex/subjects/e$b;

    sput-object v1, Lio/reactivex/subjects/e;->e:[Lio/reactivex/subjects/e$b;

    new-array v1, v0, [Lio/reactivex/subjects/e$b;

    sput-object v1, Lio/reactivex/subjects/e;->f:[Lio/reactivex/subjects/e$b;

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lio/reactivex/subjects/e;->g:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/subjects/e$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/e$a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/subjects/h;-><init>()V

    iput-object p1, p0, Lio/reactivex/subjects/e;->b:Lio/reactivex/subjects/e$a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lio/reactivex/subjects/e;->e:[Lio/reactivex/subjects/e$b;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static e()Lio/reactivex/subjects/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/subjects/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/subjects/e;

    new-instance v1, Lio/reactivex/subjects/e$e;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lio/reactivex/subjects/e$e;-><init>(I)V

    invoke-direct {v0, v1}, Lio/reactivex/subjects/e;-><init>(Lio/reactivex/subjects/e$a;)V

    return-object v0
.end method

.method public static g(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;I)Lio/reactivex/subjects/e;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "I)",
            "Lio/reactivex/subjects/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/subjects/e;

    new-instance v7, Lio/reactivex/subjects/e$c;

    move-object v1, v7

    move v2, p4

    move-wide v3, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lio/reactivex/subjects/e$c;-><init>(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-direct {v0, v7}, Lio/reactivex/subjects/e;-><init>(Lio/reactivex/subjects/e$a;)V

    return-object v0
.end method


# virtual methods
.method public c(Lio/reactivex/subjects/e$b;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/e$b<",
            "TT;>;)Z"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/subjects/e$b;

    sget-object v1, Lio/reactivex/subjects/e;->f:[Lio/reactivex/subjects/e$b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [Lio/reactivex/subjects/e$b;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public h(Lio/reactivex/subjects/e$b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/e$b<",
            "TT;>;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/subjects/e$b;

    sget-object v1, Lio/reactivex/subjects/e;->f:[Lio/reactivex/subjects/e$b;

    if-eq v0, v1, :cond_6

    sget-object v1, Lio/reactivex/subjects/e;->e:[Lio/reactivex/subjects/e$b;

    if-ne v0, v1, :cond_1

    goto :goto_3

    :cond_1
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_4

    return-void

    :cond_4
    const/4 v4, 0x1

    if-ne v1, v4, :cond_5

    sget-object v1, Lio/reactivex/subjects/e;->e:[Lio/reactivex/subjects/e$b;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Lio/reactivex/subjects/e$b;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_6
    :goto_3
    return-void
.end method

.method public i(Ljava/lang/Object;)[Lio/reactivex/subjects/e$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")[",
            "Lio/reactivex/subjects/e$b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/subjects/e;->b:Lio/reactivex/subjects/e$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lio/reactivex/subjects/e$a;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lio/reactivex/subjects/e;->f:[Lio/reactivex/subjects/e$b;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lio/reactivex/subjects/e$b;

    return-object p1

    :cond_0
    sget-object p1, Lio/reactivex/subjects/e;->f:[Lio/reactivex/subjects/e$b;

    return-object p1
.end method

.method public onComplete()V
    .locals 5

    iget-boolean v0, p0, Lio/reactivex/subjects/e;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/subjects/e;->d:Z

    invoke-static {}, Lio/reactivex/internal/util/n;->e()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lio/reactivex/subjects/e;->b:Lio/reactivex/subjects/e$a;

    invoke-interface {v1, v0}, Lio/reactivex/subjects/e$a;->a(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/e;->i(Ljava/lang/Object;)[Lio/reactivex/subjects/e$b;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v1, v4}, Lio/reactivex/subjects/e$a;->b(Lio/reactivex/subjects/e$b;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, Lio/reactivex/subjects/e;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/subjects/e;->d:Z

    invoke-static {p1}, Lio/reactivex/internal/util/n;->g(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/reactivex/subjects/e;->b:Lio/reactivex/subjects/e$a;

    invoke-interface {v0, p1}, Lio/reactivex/subjects/e$a;->a(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/e;->i(Ljava/lang/Object;)[Lio/reactivex/subjects/e$b;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-interface {v0, v3}, Lio/reactivex/subjects/e$a;->b(Lio/reactivex/subjects/e$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, Lio/reactivex/subjects/e;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/subjects/e;->b:Lio/reactivex/subjects/e$a;

    invoke-interface {v0, p1}, Lio/reactivex/subjects/e$a;->add(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/reactivex/subjects/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lio/reactivex/subjects/e$b;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-interface {v0, v3}, Lio/reactivex/subjects/e$a;->b(Lio/reactivex/subjects/e$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/subjects/e;->d:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    return-void
.end method

.method public subscribeActual(Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/subjects/e$b;

    invoke-direct {v0, p1, p0}, Lio/reactivex/subjects/e$b;-><init>(Lio/reactivex/D;Lio/reactivex/subjects/e;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-boolean p1, v0, Lio/reactivex/subjects/e$b;->e:Z

    if-nez p1, :cond_1

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/e;->c(Lio/reactivex/subjects/e$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, v0, Lio/reactivex/subjects/e$b;->e:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/e;->h(Lio/reactivex/subjects/e$b;)V

    return-void

    :cond_0
    iget-object p1, p0, Lio/reactivex/subjects/e;->b:Lio/reactivex/subjects/e$a;

    invoke-interface {p1, v0}, Lio/reactivex/subjects/e$a;->b(Lio/reactivex/subjects/e$b;)V

    :cond_1
    return-void
.end method
