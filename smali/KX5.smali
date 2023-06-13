.class public final synthetic LKX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw6$c;


# instance fields
.field public final synthetic a:LOX5;


# direct methods
.method public synthetic constructor <init>(LOX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKX5;->a:LOX5;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    iget-object v0, p0, LKX5;->a:LOX5;

    invoke-static {v0, p1, p2}, LOX5;->L(LOX5;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method
