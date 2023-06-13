.class public final Landroidx/camera/core/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s$a;
.implements Landroidx/camera/core/impl/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/s$a<",
        "Landroidx/camera/core/h;",
        "Landroidx/camera/core/impl/i;",
        "Landroidx/camera/core/h$g;",
        ">;",
        "Landroidx/camera/core/impl/k$a<",
        "Landroidx/camera/core/h$g;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/camera/core/impl/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/h$g;-><init>(Landroidx/camera/core/impl/m;)V

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/m;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/h$g;->a:Landroidx/camera/core/impl/m;

    sget-object v0, LRY5;->c:Landroidx/camera/core/impl/f$a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    const-class v0, Landroidx/camera/core/h;

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
    invoke-virtual {p0, v0}, Landroidx/camera/core/h$g;->m(Ljava/lang/Class;)Landroidx/camera/core/h$g;

    return-void
.end method

.method public static f(Landroidx/camera/core/impl/f;)Landroidx/camera/core/h$g;
    .locals 1

    new-instance v0, Landroidx/camera/core/h$g;

    invoke-static {p0}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/h$g;-><init>(Landroidx/camera/core/impl/m;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/h$g;->p(I)Landroidx/camera/core/h$g;

    move-result-object p1

    return-object p1
.end method

.method public b()Landroidx/camera/core/impl/l;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/h$g;->a:Landroidx/camera/core/impl/m;

    return-object v0
.end method

.method public bridge synthetic c(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/h$g;->o(Landroid/util/Size;)Landroidx/camera/core/h$g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Landroidx/camera/core/impl/s;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->g()Landroidx/camera/core/impl/i;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroidx/camera/core/h;
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/i;->I:Landroidx/camera/core/impl/f$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v1

    sget-object v3, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    invoke-interface {v1, v3, v0}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    const/16 v3, 0x100

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Landroidx/camera/core/h$g;->g()Landroidx/camera/core/impl/i;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/core/impl/k;->F(Landroidx/camera/core/impl/k;)V

    new-instance v1, Landroidx/camera/core/h;

    invoke-direct {v1, v0}, Landroidx/camera/core/h;-><init>(Landroidx/camera/core/impl/i;)V

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v3, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v3, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    if-eqz v0, :cond_1

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {v1, v2}, Landroidx/camera/core/h;->N0(Landroid/util/Rational;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v2, LW92;->a:Landroidx/camera/core/impl/f$a;

    invoke-static {}, LAc0;->c()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    const-string v2, "The IO executor can\'t be null"

    invoke-static {v0, v2}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/impl/i;->G:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/f;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The flash mode is not allowed to set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    return-object v1
.end method

.method public g()Landroidx/camera/core/impl/i;
    .locals 2

    new-instance v0, Landroidx/camera/core/impl/i;

    iget-object v1, p0, Landroidx/camera/core/h$g;->a:Landroidx/camera/core/impl/m;

    invoke-static {v1}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/i;-><init>(Landroidx/camera/core/impl/n;)V

    return-object v0
.end method

.method public h(I)Landroidx/camera/core/h$g;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/i;->F:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public i(Ljava/util/concurrent/Executor;)Landroidx/camera/core/h$g;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LW92;->a:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(I)Landroidx/camera/core/h$g;
    .locals 3

    const/16 v0, 0x64

    const-string v1, "jpegQuality"

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, LHZ3;->c(IIILjava/lang/String;)I

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/i;->N:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(I)Landroidx/camera/core/h$g;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/s;->z:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(I)Landroidx/camera/core/h$g;
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->l:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m(Ljava/lang/Class;)Landroidx/camera/core/h$g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Landroidx/camera/core/h;",
            ">;)",
            "Landroidx/camera/core/h$g;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->c:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

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

    invoke-virtual {p0, p1}, Landroidx/camera/core/h$g;->n(Ljava/lang/String;)Landroidx/camera/core/h$g;

    :cond_0
    return-object p0
.end method

.method public n(Ljava/lang/String;)Landroidx/camera/core/h$g;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->b:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Landroid/util/Size;)Landroidx/camera/core/h$g;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public p(I)Landroidx/camera/core/h$g;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h$g;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method
