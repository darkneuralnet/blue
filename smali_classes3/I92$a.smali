.class public final LI92$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI92;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LI92$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lyc2;",
        "b",
        "Lyc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LI92;Landroid/view/View;)V",
        "inventory-scanning_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInventoryScanningDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningDetailsAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningDetailsAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n18#2:57\n9#3,4:58\n1#4:62\n*S KotlinDebug\n*F\n+ 1 InventoryScanningDetailsAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningDetailsAdapter$VehicleViewHolder\n*L\n44#1:57\n44#1:58,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lyc2;

.field public final synthetic c:LI92;


# direct methods
.method public constructor <init>(LI92;Landroid/view/View;)V
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

    iput-object p1, p0, LI92$a;->c:LI92;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lyc2;->a(Landroid/view/View;)Lyc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LI92$a;->b:Lyc2;

    iget-object p2, p2, Lyc2;->e:Landroid/widget/Button;

    const-string v0, "binding.scanSerialButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI92$a$a;

    invoke-direct {v0, p1, p0}, LI92$a$a;-><init>(LI92;LI92$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LI92$a;->c:LI92;

    invoke-static {v0}, LI92;->access$getAdapterData(LI92;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LG92;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LG92;

    if-eqz p1, :cond_2

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, LG92;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LG92;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LG92;->e()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->d:Landroid/widget/ImageView;

    const-string v2, "binding.greenCheck"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG92;->g()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, LG92;->i()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, LG92;->f()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, LI92$a;->b:Lyc2;

    iget-object v0, v0, Lyc2;->e:Landroid/widget/Button;

    const-string v2, "binding.scanSerialButton"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG92;->h()Z

    move-result p1

    invoke-static {v0, p1, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    return-void
.end method
