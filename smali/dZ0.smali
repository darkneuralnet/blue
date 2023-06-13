.class public final synthetic LdZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic d:LO80$a;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdZ0;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LdZ0;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object p3, p0, LdZ0;->d:LO80$a;

    iput-wide p4, p0, LdZ0;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LdZ0;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LdZ0;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v2, p0, LdZ0;->d:LO80$a;

    iget-wide v3, p0, LdZ0;->e:J

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/core/impl/g;->d(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;J)V

    return-void
.end method
