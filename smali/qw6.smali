.class public final synthetic Lqw6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:Lrw6$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Ltv5;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lrw6$b;Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqw6;->a:Lrw6$b;

    iput-object p2, p0, Lqw6;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p3, p0, Lqw6;->c:Ltv5;

    iput-object p4, p0, Lqw6;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4

    iget-object v0, p0, Lqw6;->a:Lrw6$b;

    iget-object v1, p0, Lqw6;->b:Landroid/hardware/camera2/CameraDevice;

    iget-object v2, p0, Lqw6;->c:Ltv5;

    iget-object v3, p0, Lqw6;->d:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lrw6;->b(Lrw6$b;Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
