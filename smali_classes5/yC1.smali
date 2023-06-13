.class public LyC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr96;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr96<",
        "LuC1;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lr96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr96;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr96;

    iput-object p1, p0, LyC1;->b:Lr96;

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, LyC1;->b:Lr96;

    invoke-interface {v0, p1}, Lak2;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public b(Landroid/content/Context;LVL4;II)LVL4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LVL4<",
            "LuC1;",
            ">;II)",
            "LVL4<",
            "LuC1;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, LVL4;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LuC1;

    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/a;->f()LeU;

    move-result-object v1

    invoke-virtual {v0}, LuC1;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, LgU;

    invoke-direct {v3, v2, v1}, LgU;-><init>(Landroid/graphics/Bitmap;LeU;)V

    iget-object v1, p0, LyC1;->b:Lr96;

    invoke-interface {v1, p1, v3, p3, p4}, Lr96;->b(Landroid/content/Context;LVL4;II)LVL4;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-interface {v3}, LVL4;->b()V

    :cond_0
    invoke-interface {p1}, LVL4;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, p0, LyC1;->b:Lr96;

    invoke-virtual {v0, p3, p1}, LuC1;->m(Lr96;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LyC1;

    if-eqz v0, :cond_0

    check-cast p1, LyC1;

    iget-object v0, p0, LyC1;->b:Lr96;

    iget-object p1, p1, LyC1;->b:Lr96;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LyC1;->b:Lr96;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
