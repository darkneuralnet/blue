.class public final Lh1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final b:Lh1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TV;>;"
        }
    .end annotation
.end field


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lh1$g;->b:Lh1;

    iget-object v0, v0, Lh1;->b:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh1$g;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0}, Lh1;->i(Lcom/google/common/util/concurrent/ListenableFuture;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lh1;->g:Lh1$b;

    iget-object v2, p0, Lh1$g;->b:Lh1;

    invoke-virtual {v1, v2, p0, v0}, Lh1$b;->b(Lh1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh1$g;->b:Lh1;

    invoke-static {v0}, Lh1;->f(Lh1;)V

    :cond_1
    return-void
.end method
