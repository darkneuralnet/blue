.class public final Lh40$a;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lh40$a;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "LDI3;",
        "viewModel",
        "",
        "a",
        "LQp6;",
        "b",
        "LQp6;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lh40;Landroid/view/View;)V",
        "bulk-scanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LQp6;

.field public final synthetic c:Lh40;


# direct methods
.method public constructor <init>(Lh40;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh40$a;->c:Lh40;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LQp6;->a(Landroid/view/View;)LQp6;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh40$a;->b:LQp6;

    return-void
.end method


# virtual methods
.method public final a(LDI3;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh40$a;->b:LQp6;

    iget-object v0, v0, LQp6;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->operator_inventory_bulk_part_scan_sku_quantity:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, LDI3;->b()Lco/bird/android/model/wire/WireInventoryPart;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireInventoryPart;->getSku()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p1}, LDI3;->c()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lh40$a;->b:LQp6;

    iget-object v0, v0, LQp6;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LDI3;->b()Lco/bird/android/model/wire/WireInventoryPart;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireInventoryPart;->displayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LDI3;->b()Lco/bird/android/model/wire/WireInventoryPart;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireInventoryPart;->getDefaultImageUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lh40$a;->b:LQp6;

    iget-object v1, v1, LQp6;->b:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v1

    invoke-virtual {v1}, LUI4;->b()LrI4;

    move-result-object v1

    invoke-virtual {v1, p1}, LrI4;->a1(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-static {}, LjU;->l()LjU;

    move-result-object v1

    invoke-virtual {p1, v1}, LrI4;->g1(LK96;)LrI4;

    move-result-object p1

    iget-object v1, p0, Lh40$a;->b:LQp6;

    iget-object v1, v1, LQp6;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lh40$a;->b:LQp6;

    iget-object p1, p1, LQp6;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method
