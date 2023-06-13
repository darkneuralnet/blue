.class public final Ldn2;
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
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;",
        "Lv22;"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/res/Resources;

.field public final c:LVL4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;LVL4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Ldn2;->b:Landroid/content/res/Resources;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVL4;

    iput-object p1, p0, Ldn2;->c:LVL4;

    return-void
.end method

.method public static f(Landroid/content/res/Resources;LVL4;)LVL4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "LVL4<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ldn2;

    invoke-direct {v0, p0, p1}, Ldn2;-><init>(Landroid/content/res/Resources;LVL4;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Ldn2;->c:LVL4;

    invoke-interface {v0}, LVL4;->a()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Ldn2;->c:LVL4;

    invoke-interface {v0}, LVL4;->b()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Ldn2;->c:LVL4;

    instance-of v1, v0, Lv22;

    if-eqz v1, :cond_0

    check-cast v0, Lv22;

    invoke-interface {v0}, Lv22;->c()V

    :cond_0
    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method

.method public e()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Ldn2;->b:Landroid/content/res/Resources;

    iget-object v2, p0, Ldn2;->c:LVL4;

    invoke-interface {v2}, LVL4;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn2;->e()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    return-object v0
.end method
