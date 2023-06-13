.class public final LsC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtC1$a;


# instance fields
.field public final a:LeU;

.field public final b:Lto;


# direct methods
.method public constructor <init>(LeU;Lto;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsC1;->a:LeU;

    iput-object p2, p0, LsC1;->b:Lto;

    return-void
.end method


# virtual methods
.method public a(I)[B
    .locals 2

    iget-object v0, p0, LsC1;->b:Lto;

    if-nez v0, :cond_0

    new-array p1, p1, [B

    return-object p1

    :cond_0
    const-class v1, [B

    invoke-interface {v0, p1, v1}, Lto;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LsC1;->a:LeU;

    invoke-interface {v0, p1, p2, p3}, LeU;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, LsC1;->a:LeU;

    invoke-interface {v0, p1}, LeU;->c(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public d(I)[I
    .locals 2

    iget-object v0, p0, LsC1;->b:Lto;

    if-nez v0, :cond_0

    new-array p1, p1, [I

    return-object p1

    :cond_0
    const-class v1, [I

    invoke-interface {v0, p1, v1}, Lto;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    return-object p1
.end method

.method public e([B)V
    .locals 1

    iget-object v0, p0, LsC1;->b:Lto;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0, p1}, Lto;->put(Ljava/lang/Object;)V

    return-void
.end method

.method public f([I)V
    .locals 1

    iget-object v0, p0, LsC1;->b:Lto;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0, p1}, Lto;->put(Ljava/lang/Object;)V

    return-void
.end method
