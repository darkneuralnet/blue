.class public final LA79;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc69;


# instance fields
.field public final synthetic a:LW79;

.field public final synthetic b:Lc69;


# direct methods
.method public constructor <init>(Ll89;LW79;Lc69;)V
    .locals 0

    iput-object p2, p0, LA79;->a:LW79;

    iput-object p3, p0, LA79;->b:Lc69;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LA79;->b:Lc69;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()LMb9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LA79;->a:LW79;

    sget-object v1, LO79;->b:LO79;

    sget-object v2, LO79;->d:LO79;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LQa9;

    invoke-direct {v0}, LQa9;-><init>()V

    return-object v0

    :cond_0
    iget-object v0, p0, LA79;->b:Lc69;

    invoke-interface {v0}, Lc69;->zza()LMb9;

    move-result-object v0

    return-object v0
.end method
