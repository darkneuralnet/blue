.class public LTz3;
.super LbA3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTz3$a;
    }
.end annotation


# direct methods
.method public constructor <init>(ILandroid/view/Surface;)V
    .locals 2

    new-instance v0, LTz3$a;

    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v1, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {v0, v1}, LTz3$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {p0, v0}, LTz3;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, LbA3;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public static i(Landroid/hardware/camera2/params/OutputConfiguration;)LTz3;
    .locals 2

    new-instance v0, LTz3;

    new-instance v1, LTz3$a;

    invoke-direct {v1, p0}, LTz3$a;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    invoke-direct {v0, v1}, LTz3;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/view/Surface;
    .locals 1

    invoke-virtual {p0}, LTz3;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0}, Landroid/hardware/camera2/params/OutputConfiguration;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LbA3;->a:Ljava/lang/Object;

    check-cast v0, LTz3$a;

    iget-object v0, v0, LTz3$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LbA3;->a:Ljava/lang/Object;

    check-cast v0, LTz3$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, LTz3$a;->c:Z

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LbA3;->a:Ljava/lang/Object;

    check-cast v0, LTz3$a;

    iput-object p1, v0, LTz3$a;->b:Ljava/lang/String;

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LbA3;->a:Ljava/lang/Object;

    instance-of v0, v0, LTz3$a;

    invoke-static {v0}, LHZ3;->a(Z)V

    iget-object v0, p0, LbA3;->a:Ljava/lang/Object;

    check-cast v0, LTz3$a;

    iget-object v0, v0, LTz3$a;->a:Landroid/hardware/camera2/params/OutputConfiguration;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, LbA3;->a:Ljava/lang/Object;

    check-cast v0, LTz3$a;

    iget-boolean v0, v0, LTz3$a;->c:Z

    return v0
.end method
