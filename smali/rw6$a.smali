.class public Lrw6$a;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrw6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrw6;


# direct methods
.method public constructor <init>(Lrw6;)V
    .locals 0

    iput-object p1, p0, Lrw6$a;->a:Lrw6;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureSequenceAborted(Landroid/hardware/camera2/CameraCaptureSession;I)V
    .locals 0

    iget-object p1, p0, Lrw6$a;->a:Lrw6;

    iget-object p1, p1, Lrw6;->d:LO80$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LO80$a;->d()Z

    iget-object p1, p0, Lrw6$a;->a:Lrw6;

    const/4 p2, 0x0

    iput-object p2, p1, Lrw6;->d:LO80$a;

    :cond_0
    return-void
.end method

.method public onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    iget-object p1, p0, Lrw6$a;->a:Lrw6;

    iget-object p1, p1, Lrw6;->d:LO80$a;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LO80$a;->c(Ljava/lang/Object;)Z

    iget-object p1, p0, Lrw6$a;->a:Lrw6;

    iput-object p2, p1, Lrw6;->d:LO80$a;

    :cond_0
    return-void
.end method
