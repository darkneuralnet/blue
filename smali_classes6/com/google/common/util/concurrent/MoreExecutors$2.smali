.class Lcom/google/common/util/concurrent/MoreExecutors$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/util/concurrent/MoreExecutors;->renamingDecorator(Ljava/util/concurrent/Executor;LYU5;)Ljava/util/concurrent/Executor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$executor:Ljava/util/concurrent/Executor;

.field final synthetic val$nameSupplier:LYU5;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LYU5;)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/util/concurrent/MoreExecutors$2;->val$executor:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/common/util/concurrent/MoreExecutors$2;->val$nameSupplier:LYU5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/common/util/concurrent/MoreExecutors$2;->val$executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/google/common/util/concurrent/MoreExecutors$2;->val$nameSupplier:LYU5;

    invoke-static {p1, v1}, Lcom/google/common/util/concurrent/Callables;->threadRenaming(Ljava/lang/Runnable;LYU5;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
