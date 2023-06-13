.class public LzW0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH80;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzW0$b;->E0(LH80;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LH80<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LH80;

.field public final synthetic c:LzW0$b;


# direct methods
.method public constructor <init>(LzW0$b;LH80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LzW0$b$a;->c:LzW0$b;

    iput-object p2, p0, LzW0$b$a;->b:LH80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(LzW0$b$a;LH80;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LzW0$b$a;->e(LH80;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(LzW0$b$a;LH80;LHM4;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LzW0$b$a;->f(LH80;LHM4;)V

    return-void
.end method

.method private synthetic e(LH80;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LzW0$b$a;->c:LzW0$b;

    invoke-interface {p1, v0, p2}, LH80;->a(Lx80;Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic f(LH80;LHM4;)V
    .locals 2

    iget-object v0, p0, LzW0$b$a;->c:LzW0$b;

    iget-object v0, v0, LzW0$b;->c:Lx80;

    invoke-interface {v0}, Lx80;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, LzW0$b$a;->c:LzW0$b;

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2, v0}, LH80;->a(Lx80;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LzW0$b$a;->c:LzW0$b;

    invoke-interface {p1, v0, p2}, LH80;->b(Lx80;LHM4;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lx80;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, LzW0$b$a;->c:LzW0$b;

    iget-object p1, p1, LzW0$b;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p0, LzW0$b$a;->b:LH80;

    new-instance v1, LBW0;

    invoke-direct {v1, p0, v0, p2}, LBW0;-><init>(LzW0$b$a;LH80;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lx80;LHM4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TT;>;",
            "LHM4<",
            "TT;>;)V"
        }
    .end annotation

    iget-object p1, p0, LzW0$b$a;->c:LzW0$b;

    iget-object p1, p1, LzW0$b;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p0, LzW0$b$a;->b:LH80;

    new-instance v1, LAW0;

    invoke-direct {v1, p0, v0, p2}, LAW0;-><init>(LzW0$b$a;LH80;LHM4;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
