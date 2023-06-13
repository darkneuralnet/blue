.class public final synthetic Lpf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:Lrf0;

.field public final synthetic b:Landroidx/camera/core/impl/q;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Lrf0;Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf0;->a:Lrf0;

    iput-object p2, p0, Lpf0;->b:Landroidx/camera/core/impl/q;

    iput-object p3, p0, Lpf0;->c:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3

    iget-object v0, p0, Lpf0;->a:Lrf0;

    iget-object v1, p0, Lpf0;->b:Landroidx/camera/core/impl/q;

    iget-object v2, p0, Lpf0;->c:Landroid/hardware/camera2/CameraDevice;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lrf0;->j(Lrf0;Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
