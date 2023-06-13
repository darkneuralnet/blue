.class public final synthetic LT64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:LX64;

.field public final synthetic b:Landroidx/camera/core/impl/q;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic d:LPX5;


# direct methods
.method public synthetic constructor <init>(LX64;Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT64;->a:LX64;

    iput-object p2, p0, LT64;->b:Landroidx/camera/core/impl/q;

    iput-object p3, p0, LT64;->c:Landroid/hardware/camera2/CameraDevice;

    iput-object p4, p0, LT64;->d:LPX5;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4

    iget-object v0, p0, LT64;->a:LX64;

    iget-object v1, p0, LT64;->b:Landroidx/camera/core/impl/q;

    iget-object v2, p0, LT64;->c:Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, LT64;->d:LPX5;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, LX64;->i(LX64;Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
