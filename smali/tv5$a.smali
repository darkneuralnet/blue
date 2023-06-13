.class public final Ltv5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltv5$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltv5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/params/SessionConfiguration;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LSz3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LSz3;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lkv5;->a()V

    invoke-static {p2}, Ltv5;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, p3, p4}, Ljv5;->a(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/params/SessionConfiguration;

    move-result-object p1

    invoke-direct {p0, p1}, Ltv5$a;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lsb0;->a(Ljava/lang/Object;)Landroid/hardware/camera2/params/SessionConfiguration;

    move-result-object v0

    iput-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {p1}, Lsb0;->a(Ljava/lang/Object;)Landroid/hardware/camera2/params/SessionConfiguration;

    move-result-object p1

    invoke-static {p1}, Llv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ltv5;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ltv5$a;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0}, Lpv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;)Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public b()LR22;
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0}, Lqv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;)Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object v0

    invoke-static {v0}, LR22;->b(Ljava/lang/Object;)LR22;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0}, Lrv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LSz3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltv5$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public e(LR22;)V
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-virtual {p1}, LR22;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/InputConfiguration;

    invoke-static {v0, p1}, Lnv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/params/InputConfiguration;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ltv5$a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    check-cast p1, Ltv5$a;

    iget-object p1, p1, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0}, Lsv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;)I

    move-result v0

    return v0
.end method

.method public h(Landroid/hardware/camera2/CaptureRequest;)V
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0, p1}, Lmv5;->a(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/CaptureRequest;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ltv5$a;->a:Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {v0}, Lov5;->a(Landroid/hardware/camera2/params/SessionConfiguration;)I

    move-result v0

    return v0
.end method
