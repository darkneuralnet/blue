.class public LIA1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIA1;->o(Lcom/google/common/util/concurrent/ListenableFuture;LxA1;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfp<",
        "TI;TO;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LxA1;


# direct methods
.method public constructor <init>(LxA1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LIA1$a;->a:LxA1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, LIA1$a;->a:LxA1;

    invoke-interface {v0, p1}, LxA1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
