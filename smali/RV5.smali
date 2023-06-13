.class public final synthetic LRV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LSV5;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(LSV5;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRV5;->b:LSV5;

    iput-object p2, p0, LRV5;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LRV5;->b:LSV5;

    iget-object v1, p0, LRV5;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1}, LSV5;->c(LSV5;Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
