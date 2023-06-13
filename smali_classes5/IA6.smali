.class public LIA6;
.super LV61;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LV61<",
        "LGA6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(LGA6;)V
    .locals 0

    invoke-direct {p0, p1}, LV61;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LV61;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, LGA6;

    invoke-virtual {v0}, LGA6;->i()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LV61;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, LGA6;

    invoke-virtual {v0}, LGA6;->stop()V

    iget-object v0, p0, LV61;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, LGA6;

    invoke-virtual {v0}, LGA6;->l()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LV61;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, LGA6;

    invoke-virtual {v0}, LGA6;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "LGA6;",
            ">;"
        }
    .end annotation

    const-class v0, LGA6;

    return-object v0
.end method
