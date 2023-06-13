.class public LgU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVL4;
.implements Lv22;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LVL4<",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lv22;"
    }
.end annotation


# instance fields
.field public final b:Landroid/graphics/Bitmap;

.field public final c:LeU;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;LeU;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Bitmap must not be null"

    invoke-static {p1, v0}, LzZ3;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, LgU;->b:Landroid/graphics/Bitmap;

    const-string p1, "BitmapPool must not be null"

    invoke-static {p2, p1}, LzZ3;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LeU;

    iput-object p1, p0, LgU;->c:LeU;

    return-void
.end method

.method public static f(Landroid/graphics/Bitmap;LeU;)LgU;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LgU;

    invoke-direct {v0, p0, p1}, LgU;-><init>(Landroid/graphics/Bitmap;LeU;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LgU;->b:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lpi6;->h(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LgU;->c:LeU;

    iget-object v1, p0, LgU;->b:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, LeU;->c(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LgU;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LgU;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LgU;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
