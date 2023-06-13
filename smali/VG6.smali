.class public final synthetic LVG6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LWG6;

.field public final synthetic c:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public synthetic constructor <init>(LWG6;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVG6;->b:LWG6;

    iput-object p2, p0, LVG6;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LVG6;->b:LWG6;

    iget-object v1, p0, LVG6;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0, v1}, LWG6;->a(LWG6;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method
