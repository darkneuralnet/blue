.class public final LO61;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LtM4<",
        "Landroid/graphics/drawable/Drawable;",
        "[B>;"
    }
.end annotation


# instance fields
.field public final a:LeU;

.field public final b:LtM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtM4<",
            "Landroid/graphics/Bitmap;",
            "[B>;"
        }
    .end annotation
.end field

.field public final c:LtM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtM4<",
            "LuC1;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LeU;LtM4;LtM4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeU;",
            "LtM4<",
            "Landroid/graphics/Bitmap;",
            "[B>;",
            "LtM4<",
            "LuC1;",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO61;->a:LeU;

    iput-object p2, p0, LO61;->b:LtM4;

    iput-object p3, p0, LO61;->c:LtM4;

    return-void
.end method

.method public static b(LVL4;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "LVL4<",
            "LuC1;",
            ">;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method public a(LVL4;Lsy3;)LVL4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Lsy3;",
            ")",
            "LVL4<",
            "[B>;"
        }
    .end annotation

    invoke-interface {p1}, LVL4;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, LO61;->b:LtM4;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, LO61;->a:LeU;

    invoke-static {v0, v1}, LgU;->f(Landroid/graphics/Bitmap;LeU;)LgU;

    move-result-object v0

    invoke-interface {p1, v0, p2}, LtM4;->a(LVL4;Lsy3;)LVL4;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, LuC1;

    if-eqz v0, :cond_1

    iget-object v0, p0, LO61;->c:LtM4;

    invoke-static {p1}, LO61;->b(LVL4;)LVL4;

    move-result-object p1

    invoke-interface {v0, p1, p2}, LtM4;->a(LVL4;Lsy3;)LVL4;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
