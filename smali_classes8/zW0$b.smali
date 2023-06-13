.class public final LzW0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx80;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LzW0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lx80<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lx80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx80<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lx80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lx80<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzW0$b;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LzW0$b;->c:Lx80;

    return-void
.end method


# virtual methods
.method public E0(LH80;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH80<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LzW0$b;->c:Lx80;

    new-instance v1, LzW0$b$a;

    invoke-direct {v1, p0, p1}, LzW0$b$a;-><init>(LzW0$b;LH80;)V

    invoke-interface {v0, v1}, Lx80;->E0(LH80;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LzW0$b;->c:Lx80;

    invoke-interface {v0}, Lx80;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LzW0$b;->clone()Lx80;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lx80;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx80<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LzW0$b;

    iget-object v1, p0, LzW0$b;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LzW0$b;->c:Lx80;

    invoke-interface {v2}, Lx80;->clone()Lx80;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LzW0$b;-><init>(Ljava/util/concurrent/Executor;Lx80;)V

    return-object v0
.end method

.method public execute()LHM4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LHM4<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LzW0$b;->c:Lx80;

    invoke-interface {v0}, Lx80;->execute()LHM4;

    move-result-object v0

    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    iget-object v0, p0, LzW0$b;->c:Lx80;

    invoke-interface {v0}, Lx80;->isCanceled()Z

    move-result v0

    return v0
.end method

.method public request()Lokhttp3/Request;
    .locals 1

    iget-object v0, p0, LzW0$b;->c:Lx80;

    invoke-interface {v0}, Lx80;->request()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method
