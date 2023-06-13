.class public final synthetic LfZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic c:LO80$a;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfZ0;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object p2, p0, LfZ0;->c:LO80$a;

    iput-wide p3, p0, LfZ0;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LfZ0;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v1, p0, LfZ0;->c:LO80$a;

    iget-wide v2, p0, LfZ0;->d:J

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/impl/g;->b(Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;J)V

    return-void
.end method
