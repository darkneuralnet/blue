.class public final Landroidx/camera/core/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/k$a;
.implements Landroidx/camera/core/impl/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/k$a<",
        "Landroidx/camera/core/e$c;",
        ">;",
        "Landroidx/camera/core/impl/s$a<",
        "Landroidx/camera/core/e;",
        "Landroidx/camera/core/impl/h;",
        "Landroidx/camera/core/e$c;",
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

    invoke-direct {p0, v0}, Landroidx/camera/core/e$c;-><init>(Landroidx/camera/core/impl/m;)V

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/m;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/e$c;->a:Landroidx/camera/core/impl/m;

    sget-object v0, LRY5;->c:Landroidx/camera/core/impl/f$a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    const-class v0, Landroidx/camera/core/e;

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
    invoke-virtual {p0, v0}, Landroidx/camera/core/e$c;->l(Ljava/lang/Class;)Landroidx/camera/core/e$c;

    return-void
.end method

.method public static f(Landroidx/camera/core/impl/f;)Landroidx/camera/core/e$c;
    .locals 1

    new-instance v0, Landroidx/camera/core/e$c;

    invoke-static {p0}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/e$c;-><init>(Landroidx/camera/core/impl/m;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/e$c;->o(I)Landroidx/camera/core/e$c;

    move-result-object p1

    return-object p1
.end method

.method public b()Landroidx/camera/core/impl/l;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/e$c;->a:Landroidx/camera/core/impl/m;

    return-object v0
.end method

.method public bridge synthetic c(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/e$c;->n(Landroid/util/Size;)Landroidx/camera/core/e$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Landroidx/camera/core/impl/s;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->g()Landroidx/camera/core/impl/h;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroidx/camera/core/e;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->g()Landroidx/camera/core/impl/h;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/core/impl/k;->F(Landroidx/camera/core/impl/k;)V

    new-instance v1, Landroidx/camera/core/e;

    invoke-direct {v1, v0}, Landroidx/camera/core/e;-><init>(Landroidx/camera/core/impl/h;)V

    return-object v1
.end method

.method public g()Landroidx/camera/core/impl/h;
    .locals 2

    new-instance v0, Landroidx/camera/core/impl/h;

    iget-object v1, p0, Landroidx/camera/core/e$c;->a:Landroidx/camera/core/impl/m;

    invoke-static {v1}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/h;-><init>(Landroidx/camera/core/impl/n;)V

    return-object v0
.end method

.method public h(I)Landroidx/camera/core/e$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/h;->F:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public i(Landroid/util/Size;)Landroidx/camera/core/e$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->q:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(I)Landroidx/camera/core/e$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/s;->z:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(I)Landroidx/camera/core/e$c;
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->l:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(Ljava/lang/Class;)Landroidx/camera/core/e$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Landroidx/camera/core/e;",
            ">;)",
            "Landroidx/camera/core/e$c;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->c:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

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

    invoke-virtual {p0, p1}, Landroidx/camera/core/e$c;->m(Ljava/lang/String;)Landroidx/camera/core/e$c;

    :cond_0
    return-object p0
.end method

.method public m(Ljava/lang/String;)Landroidx/camera/core/e$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, LRY5;->b:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public n(Landroid/util/Size;)Landroidx/camera/core/e$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(I)Landroidx/camera/core/e$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e$c;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method
