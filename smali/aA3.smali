.class public LaA3;
.super LYz3;
.source "SourceFile"


# direct methods
.method public constructor <init>(ILandroid/view/Surface;)V
    .locals 1

    new-instance v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {p0, v0}, LaA3;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, LYz3;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public static l(Landroid/hardware/camera2/params/OutputConfiguration;)LaA3;
    .locals 1

    new-instance v0, LaA3;

    invoke-direct {v0, p0}, LaA3;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Landroid/view/Surface;
    .locals 1

    invoke-super {p0}, LTz3;->a()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Landroid/view/Surface;)V
    .locals 0

    invoke-super {p0, p1}, LWz3;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public bridge synthetic c()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LYz3;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()V
    .locals 0

    invoke-super {p0}, LWz3;->d()V

    return-void
.end method

.method public e(J)V
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LaA3;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0, p1, p2}, LZz3;->a(Landroid/hardware/camera2/params/OutputConfiguration;J)V

    return-void
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, LbA3;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, LYz3;->f(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic g()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, LYz3;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, LbA3;->hashCode()I

    move-result v0

    return v0
.end method
