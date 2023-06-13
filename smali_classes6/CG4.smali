.class public final LCG4;
.super LZt4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCG4$c;,
        LCG4$b;,
        LCG4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LZt4<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final d:[LCG4$b;

.field public static final e:[Ljava/lang/Object;


# instance fields
.field public final b:LCG4$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCG4$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "LCG4$b<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [LCG4$b;

    sput-object v1, LCG4;->d:[LCG4$b;

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, LCG4;->e:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LCG4$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCG4$a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LZt4;-><init>()V

    iput-object p1, p0, LCG4;->b:LCG4$a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, LCG4;->d:[LCG4$b;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static g()LCG4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LCG4<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LCG4;

    new-instance v1, LCG4$c;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, LCG4$c;-><init>(I)V

    invoke-direct {v0, v1}, LCG4;-><init>(LCG4$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LCG4$b;

    array-length v0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, LCG4;->b:LCG4$a;

    invoke-interface {v0, p1}, LCG4$a;->add(Ljava/lang/Object;)V

    iget-object p1, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LCG4$b;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-interface {v0, v3}, LCG4$a;->a(LCG4$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "value == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(LCG4$b;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCG4$b<",
            "TT;>;)Z"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LCG4$b;

    array-length v1, v0

    add-int/lit8 v2, v1, 0x1

    new-array v2, v2, [LCG4$b;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v2, v1

    iget-object v1, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public h(LCG4$b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCG4$b<",
            "TT;>;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LCG4$b;

    sget-object v1, LCG4;->d:[LCG4$b;

    if-ne v0, v1, :cond_1

    return-void

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

    sget-object v1, LCG4;->d:[LCG4$b;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [LCG4$b;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, LCG4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

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

    new-instance v0, LCG4$b;

    invoke-direct {v0, p1, p0}, LCG4$b;-><init>(Lio/reactivex/D;LCG4;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-boolean p1, v0, LCG4$b;->e:Z

    if-nez p1, :cond_1

    invoke-virtual {p0, v0}, LCG4;->e(LCG4$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, v0, LCG4$b;->e:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LCG4;->h(LCG4$b;)V

    return-void

    :cond_0
    iget-object p1, p0, LCG4;->b:LCG4$a;

    invoke-interface {p1, v0}, LCG4$a;->a(LCG4$b;)V

    :cond_1
    return-void
.end method
