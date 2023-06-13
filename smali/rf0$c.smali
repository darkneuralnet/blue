.class public Lrf0$c;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf0;->p(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrf0;


# direct methods
.method public constructor <init>(Lrf0;)V
    .locals 0

    iput-object p1, p0, Lrf0$c;->a:Lrf0;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    iget-object p1, p0, Lrf0$c;->a:Lrf0;

    iget-object p1, p1, Lrf0;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lrf0$c;->a:Lrf0;

    iget-object p2, p2, Lrf0;->g:Landroidx/camera/core/impl/q;

    if-nez p2, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    invoke-virtual {p2}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object p2

    const-string p3, "CaptureSession"

    const-string v0, "Submit FLASH_MODE_OFF request"

    invoke-static {p3, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lrf0$c;->a:Lrf0;

    iget-object v0, p3, Lrf0;->q:LW56;

    invoke-virtual {v0, p2}, LW56;->a(Landroidx/camera/core/impl/d;)Landroidx/camera/core/impl/d;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3, p2}, Lrf0;->e(Ljava/util/List;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
