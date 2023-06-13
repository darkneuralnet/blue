.class public final LF90$d;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "SourceFile"

# interfaces
.implements Lnc0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final synthetic c:LF90;


# direct methods
.method public constructor <init>(LF90;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LF90$d;->c:LF90;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, LF90$d;->b:Z

    iput-object p2, p0, LF90$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LF90$d;->c:LF90;

    iget-object v0, v0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->c:LF90$g;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LF90$d;->c:LF90;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LF90;->s0(Z)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LF90$d;->b:Z

    return v0
.end method

.method public onCameraAvailable(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LF90$d;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, LF90$d;->b:Z

    iget-object p1, p0, LF90$d;->c:LF90;

    iget-object p1, p1, LF90;->f:LF90$g;

    sget-object v0, LF90$g;->c:LF90$g;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LF90$d;->c:LF90;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LF90;->s0(Z)V

    :cond_1
    return-void
.end method

.method public onCameraUnavailable(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LF90$d;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, LF90$d;->b:Z

    return-void
.end method
