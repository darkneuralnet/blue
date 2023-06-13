.class public final LSz3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSz3$a;
    }
.end annotation


# instance fields
.field public final a:LSz3$a;


# direct methods
.method public constructor <init>(ILandroid/view/Surface;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    new-instance v0, LaA3;

    invoke-direct {v0, p1, p2}, LaA3;-><init>(ILandroid/view/Surface;)V

    iput-object v0, p0, LSz3;->a:LSz3$a;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, LYz3;

    invoke-direct {v0, p1, p2}, LYz3;-><init>(ILandroid/view/Surface;)V

    iput-object v0, p0, LSz3;->a:LSz3$a;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    new-instance v0, LWz3;

    invoke-direct {v0, p1, p2}, LWz3;-><init>(ILandroid/view/Surface;)V

    iput-object v0, p0, LSz3;->a:LSz3$a;

    goto :goto_0

    :cond_2
    new-instance v0, LTz3;

    invoke-direct {v0, p1, p2}, LTz3;-><init>(ILandroid/view/Surface;)V

    iput-object v0, p0, LSz3;->a:LSz3$a;

    :goto_0
    return-void
.end method

.method public constructor <init>(LSz3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSz3;->a:LSz3$a;

    return-void
.end method

.method public static h(Ljava/lang/Object;)LSz3;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_1

    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {p0}, LaA3;->l(Landroid/hardware/camera2/params/OutputConfiguration;)LaA3;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {p0}, LYz3;->k(Landroid/hardware/camera2/params/OutputConfiguration;)LYz3;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/16 v2, 0x1a

    if-lt v1, v2, :cond_3

    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {p0}, LWz3;->j(Landroid/hardware/camera2/params/OutputConfiguration;)LWz3;

    move-result-object p0

    goto :goto_0

    :cond_3
    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {p0}, LTz3;->i(Landroid/hardware/camera2/params/OutputConfiguration;)LTz3;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_4

    return-object v0

    :cond_4
    new-instance v0, LSz3;

    invoke-direct {v0, p0}, LSz3;-><init>(LSz3$a;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0, p1}, LSz3$a;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0}, LSz3$a;->d()V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0}, LSz3$a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0}, LSz3$a;->a()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0, p1}, LSz3$a;->f(Ljava/lang/String;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LSz3;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LSz3;->a:LSz3$a;

    check-cast p1, LSz3;

    iget-object p1, p1, LSz3;->a:LSz3$a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(J)V
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0, p1, p2}, LSz3$a;->e(J)V

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-interface {v0}, LSz3$a;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LSz3;->a:LSz3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
