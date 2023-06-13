.class public final LKg0$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKg0;
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
        "LKg0$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lob2;",
        "b",
        "Lob2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LKg0;Landroid/view/View;)V",
        "co.bird.android.feature.operator-inventory"
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
        "SMAP\nCategoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/CategoryAdapter$PartHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,58:1\n18#2:59\n9#3,4:60\n*S KotlinDebug\n*F\n+ 1 CategoryAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/CategoryAdapter$PartHeaderViewHolder\n*L\n42#1:59\n42#1:60,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lob2;

.field public final synthetic c:LKg0;


# direct methods
.method public constructor <init>(LKg0;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKg0$a;->c:LKg0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lob2;->a(Landroid/view/View;)Lob2;

    move-result-object v0

    const-string v1, "bind(view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LKg0$a;->b:Lob2;

    new-instance v0, LKg0$a$a;

    invoke-direct {v0, p1, p0}, LKg0$a$a;-><init>(LKg0;LKg0$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LKg0$a;->c:LKg0;

    invoke-static {v0}, LKg0;->access$getAdapterData(LKg0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WirePartCategory;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WirePartCategory;

    if-eqz p1, :cond_2

    iget-object v0, p0, LKg0$a;->b:Lob2;

    iget-object v0, v0, Lob2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePartCategory;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePartCategory;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LKg0$a;->b:Lob2;

    iget-object v0, v0, Lob2;->c:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {v0}, LUI4;->b()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->a1(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-static {}, LjU;->l()LjU;

    move-result-object v0

    invoke-virtual {p1, v0}, LrI4;->g1(LK96;)LrI4;

    move-result-object p1

    iget-object v0, p0, LKg0$a;->b:Lob2;

    iget-object v0, v0, Lob2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_2

    iget-object p1, p0, LKg0$a;->b:Lob2;

    iget-object p1, p1, Lob2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-void
.end method
