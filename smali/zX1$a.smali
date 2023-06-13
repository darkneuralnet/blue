.class public final LzX1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lez2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzX1;->e(Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "zX1$a",
        "Lez2$b;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        "drawable",
        "",
        "b",
        "a",
        "components-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:LzX1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LzX1;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, LzX1$a;->a:LzX1;

    iput-object p2, p0, LzX1$a;->b:Ljava/lang/String;

    iput p3, p0, LzX1$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LzX1$a;->a:LzX1;

    invoke-static {v0}, LzX1;->b(LzX1;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    :goto_0
    if-eqz v0, :cond_1

    iget v1, p0, LzX1$a;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    :cond_1
    invoke-static {}, LzX1;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageView is null for failed Logo - "

    iget-object v2, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LCx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, LzX1$a;->a:LzX1;

    invoke-static {v0}, LzX1;->a(LzX1;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LzX1$a;->a:LzX1;

    invoke-static {v0}, LzX1;->b(LzX1;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 2

    const-string v0, "drawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LzX1$a;->a:LzX1;

    invoke-static {v0}, LzX1;->b(LzX1;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_1
    invoke-static {}, LzX1;->c()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ImageView is null for received Logo - "

    iget-object v1, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LCx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object p1, p0, LzX1$a;->a:LzX1;

    invoke-static {p1}, LzX1;->a(LzX1;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LzX1$a;->a:LzX1;

    invoke-static {p1}, LzX1;->b(LzX1;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LzX1$a;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
