.class public final synthetic Lk36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/view/e;

.field public final synthetic c:Landroid/view/Surface;

.field public final synthetic d:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic e:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/e;Landroid/view/Surface;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk36;->b:Landroidx/camera/view/e;

    iput-object p2, p0, Lk36;->c:Landroid/view/Surface;

    iput-object p3, p0, Lk36;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object p4, p0, Lk36;->e:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lk36;->b:Landroidx/camera/view/e;

    iget-object v1, p0, Lk36;->c:Landroid/view/Surface;

    iget-object v2, p0, Lk36;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v3, p0, Lk36;->e:Landroidx/camera/core/o;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/view/e;->k(Landroidx/camera/view/e;Landroid/view/Surface;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/o;)V

    return-void
.end method
