.class public Landroidx/camera/core/impl/q$b;
.super Landroidx/camera/core/impl/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/impl/q$a;-><init>()V

    return-void
.end method

.method public static o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroid/util/Size;",
            ")",
            "Landroidx/camera/core/impl/q$b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/s;->P(Landroidx/camera/core/impl/q$d;)Landroidx/camera/core/impl/q$d;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/impl/q$b;

    invoke-direct {v1}, Landroidx/camera/core/impl/q$b;-><init>()V

    invoke-interface {v0, p1, p0, v1}, Landroidx/camera/core/impl/q$d;->a(Landroid/util/Size;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/q$b;)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Implementation is missing option unpacker for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, LRY5;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/util/Collection;)Landroidx/camera/core/impl/q$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/hardware/camera2/CameraDevice$StateCallback;",
            ">;)",
            "Landroidx/camera/core/impl/q$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/q$b;->e(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/core/impl/q$b;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public b(Ljava/util/Collection;)Landroidx/camera/core/impl/q$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lpa0;",
            ">;)",
            "Landroidx/camera/core/impl/q$b;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->a(Ljava/util/Collection;)V

    return-object p0
.end method

.method public c(Ljava/util/List;)Landroidx/camera/core/impl/q$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)",
            "Landroidx/camera/core/impl/q$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/q$b;->j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/q$b;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public d(Lpa0;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public e(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public g(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    return-object p0
.end method

.method public h(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;
    .locals 1

    invoke-static {p1}, Landroidx/camera/core/impl/q$e;->a(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$e$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$e$a;->a()Landroidx/camera/core/impl/q$e;

    move-result-object p1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public i(Lpa0;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    return-object p0
.end method

.method public j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public k(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;
    .locals 2

    invoke-static {p1}, Landroidx/camera/core/impl/q$e;->a(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$e$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$e$a;->a()Landroidx/camera/core/impl/q$e;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->f(Landroidx/camera/core/impl/DeferrableSurface;)V

    return-object p0
.end method

.method public l(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/d$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m()Landroidx/camera/core/impl/q;
    .locals 9

    new-instance v8, Landroidx/camera/core/impl/q;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Landroidx/camera/core/impl/q$a;->c:Ljava/util/List;

    iget-object v3, p0, Landroidx/camera/core/impl/q$a;->d:Ljava/util/List;

    iget-object v4, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    iget-object v5, p0, Landroidx/camera/core/impl/q$a;->e:Ljava/util/List;

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v6

    iget-object v7, p0, Landroidx/camera/core/impl/q$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/impl/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/impl/d;Landroid/hardware/camera2/params/InputConfiguration;)V

    return-object v8
.end method

.method public n()Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->i()V

    return-object p0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public q(Lpa0;)Z
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->o(Lpa0;)Z

    move-result v0

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public r(Landroid/util/Range;)Landroidx/camera/core/impl/q$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/core/impl/q$b;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->q(Landroid/util/Range;)V

    return-object p0
.end method

.method public s(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->r(Landroidx/camera/core/impl/f;)V

    return-object p0
.end method

.method public t(Landroid/hardware/camera2/params/InputConfiguration;)Landroidx/camera/core/impl/q$b;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/impl/q$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    return-object p0
.end method

.method public u(I)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->s(I)V

    return-object p0
.end method
