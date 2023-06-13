.class public final LUo6$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s$a;
.implements Landroidx/camera/core/impl/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUo6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ltp6;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/s$a<",
        "LUo6<",
        "TT;>;",
        "LYo6<",
        "TT;>;",
        "LUo6$d<",
        "TT;>;>;",
        "Landroidx/camera/core/impl/k$a<",
        "LUo6$d<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/camera/core/impl/m;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/m;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUo6$d;->a:Landroidx/camera/core/impl/m;

    sget-object v0, LYo6;->F:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/n;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LRY5;->c:Landroidx/camera/core/impl/f$a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    const-class v0, LUo6;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, LUo6$d;->j(Ljava/lang/Class;)LUo6$d;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "VideoOutput is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ltp6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {p1}, LUo6$d;->f(Ltp6;)Landroidx/camera/core/impl/m;

    move-result-object p1

    invoke-direct {p0, p1}, LUo6$d;-><init>(Landroidx/camera/core/impl/m;)V

    return-void
.end method

.method public static f(Ltp6;)Landroidx/camera/core/impl/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ltp6;",
            ">(TT;)",
            "Landroidx/camera/core/impl/m;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v0

    sget-object v1, LYo6;->F:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p0}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static g(Landroidx/camera/core/impl/f;)LUo6$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f;",
            ")",
            "LUo6$d<",
            "+",
            "Ltp6;",
            ">;"
        }
    .end annotation

    new-instance v0, LUo6$d;

    invoke-static {p0}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p0

    invoke-direct {v0, p0}, LUo6$d;-><init>(Landroidx/camera/core/impl/m;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LUo6$d;->m(I)LUo6$d;

    move-result-object p1

    return-object p1
.end method

.method public b()Landroidx/camera/core/impl/l;
    .locals 1

    iget-object v0, p0, LUo6$d;->a:Landroidx/camera/core/impl/m;

    return-object v0
.end method

.method public bridge synthetic c(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LUo6$d;->l(Landroid/util/Size;)LUo6$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Landroidx/camera/core/impl/s;
    .locals 1

    invoke-virtual {p0}, LUo6$d;->h()LYo6;

    move-result-object v0

    return-object v0
.end method

.method public e()LUo6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LUo6<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LUo6;

    invoke-virtual {p0}, LUo6$d;->h()LYo6;

    move-result-object v1

    invoke-direct {v0, v1}, LUo6;-><init>(LYo6;)V

    return-object v0
.end method

.method public h()LYo6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYo6<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYo6;

    iget-object v1, p0, LUo6$d;->a:Landroidx/camera/core/impl/m;

    invoke-static {v1}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v1

    invoke-direct {v0, v1}, LYo6;-><init>(Landroidx/camera/core/impl/n;)V

    return-object v0
.end method

.method public i(I)LUo6$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LUo6$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUo6$d;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/s;->z:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(Ljava/lang/Class;)LUo6$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "LUo6<",
            "TT;>;>;)",
            "LUo6$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUo6$d;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->c:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, LUo6$d;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->b:Landroidx/camera/core/impl/f$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LUo6$d;->k(Ljava/lang/String;)LUo6$d;

    :cond_0
    return-object p0
.end method

.method public k(Ljava/lang/String;)LUo6$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LUo6$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUo6$d;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->b:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(Landroid/util/Size;)LUo6$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            ")",
            "LUo6$d<",
            "TT;>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "setTargetResolution is not supported."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(I)LUo6$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LUo6$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUo6$d;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public n(LxA1;)LUo6$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxA1<",
            "Ldp6;",
            "Lhp6;",
            ">;)",
            "LUo6$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUo6$d;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LYo6;->G:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method
