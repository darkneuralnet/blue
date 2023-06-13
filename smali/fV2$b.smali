.class public LfV2$b;
.super LfV2$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfV2;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LfV2$h<",
        "TParams;TResult;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LfV2;


# direct methods
.method public constructor <init>(LfV2;)V
    .locals 0

    iput-object p1, p0, LfV2$b;->c:LfV2;

    invoke-direct {p0}, LfV2$h;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LfV2$b;->c:LfV2;

    iget-object v0, v0, LfV2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/16 v0, 0xa

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, p0, LfV2$b;->c:LfV2;

    iget-object v3, p0, LfV2$h;->b:[Ljava/lang/Object;

    invoke-virtual {v0, v3}, LfV2;->b([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LfV2$b;->c:LfV2;

    invoke-virtual {v0, v2}, LfV2;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :catchall_0
    move-exception v0

    :try_start_1
    iget-object v3, p0, LfV2$b;->c:LfV2;

    iget-object v3, v3, LfV2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, LfV2$b;->c:LfV2;

    invoke-virtual {v1, v2}, LfV2;->l(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method
