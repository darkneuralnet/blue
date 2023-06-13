.class public LST;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LeM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LeM4<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LeU;

.field public final b:LeM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LeM4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LeU;LeM4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeU;",
            "LeM4<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LST;->a:LeU;

    iput-object p2, p0, LST;->b:LeM4;

    return-void
.end method


# virtual methods
.method public a(Lsy3;)Lfb1;
    .locals 1

    iget-object v0, p0, LST;->b:LeM4;

    invoke-interface {v0, p1}, LeM4;->a(Lsy3;)Lfb1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/io/File;Lsy3;)Z
    .locals 0

    check-cast p1, LVL4;

    invoke-virtual {p0, p1, p2, p3}, LST;->c(LVL4;Ljava/io/File;Lsy3;)Z

    move-result p1

    return p1
.end method

.method public c(LVL4;Ljava/io/File;Lsy3;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;",
            "Ljava/io/File;",
            "Lsy3;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, LST;->b:LeM4;

    new-instance v1, LgU;

    invoke-interface {p1}, LVL4;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, LST;->a:LeU;

    invoke-direct {v1, p1, v2}, LgU;-><init>(Landroid/graphics/Bitmap;LeU;)V

    invoke-interface {v0, v1, p2, p3}, Lmb1;->b(Ljava/lang/Object;Ljava/io/File;Lsy3;)Z

    move-result p1

    return p1
.end method
