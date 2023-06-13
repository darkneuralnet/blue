.class public final synthetic LS56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr90$c;


# instance fields
.field public final synthetic a:LU56;


# direct methods
.method public synthetic constructor <init>(LU56;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS56;->a:LU56;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, LS56;->a:LU56;

    invoke-static {v0, p1}, LU56;->b(LU56;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
