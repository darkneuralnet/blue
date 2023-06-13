.class public final LUs2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUs2;
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
        "Lfe3<",
        "LUs2$b<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:LZd3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZd3$a<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LZd3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LZd3$a<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LUs2$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, LUs2$a;->d:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LUs2$a;->c:LZd3$a;

    return-void
.end method

.method public static synthetic a(LUs2$a;LUs2$b;)V
    .locals 0

    invoke-direct {p0, p1}, LUs2$a;->c(LUs2$b;)V

    return-void
.end method

.method private synthetic c(LUs2$b;)V
    .locals 1

    iget-object v0, p0, LUs2$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LUs2$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LUs2$a;->c:LZd3$a;

    invoke-virtual {p1}, LUs2$b;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LZd3$a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LUs2$b;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LUs2$a;->c:LZd3$a;

    invoke-virtual {p1}, LUs2$b;->c()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {v0, p1}, LZd3$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, LUs2$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public d(LUs2$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUs2$b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LUs2$a;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LTs2;

    invoke-direct {v1, p0, p1}, LTs2;-><init>(LUs2$a;LUs2$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic onChanged(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LUs2$b;

    invoke-virtual {p0, p1}, LUs2$a;->d(LUs2$b;)V

    return-void
.end method
