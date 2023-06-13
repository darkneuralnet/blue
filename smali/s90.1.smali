.class public final synthetic Ls90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lr90$b;

.field public final synthetic c:Landroid/hardware/camera2/TotalCaptureResult;


# direct methods
.method public synthetic constructor <init>(Lr90$b;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls90;->b:Lr90$b;

    iput-object p2, p0, Ls90;->c:Landroid/hardware/camera2/TotalCaptureResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls90;->b:Lr90$b;

    iget-object v1, p0, Ls90;->c:Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {v0, v1}, Lr90$b;->a(Lr90$b;Landroid/hardware/camera2/TotalCaptureResult;)V

    return-void
.end method
