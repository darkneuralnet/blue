.class public final LZH3$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZH3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZH3$a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "LZH3$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/constant/HealthStatus;",
        "healthStatus",
        "Lxe2;",
        "binding",
        "a",
        "b",
        "Lxe2;",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LZH3;Landroid/view/View;)V",
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
        "SMAP\nPartAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartAdapter$PartViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n18#2:106\n9#3,4:107\n13579#4:111\n13580#4:113\n13579#4,2:114\n1#5:112\n*S KotlinDebug\n*F\n+ 1 PartAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartAdapter$PartViewHolder\n*L\n53#1:106\n53#1:107,4\n82#1:111\n82#1:113\n93#1:114,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lxe2;

.field public final synthetic c:LZH3;


# direct methods
.method public constructor <init>(LZH3;Landroid/view/View;)V
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

    iput-object p1, p0, LZH3$a;->c:LZH3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lxe2;->a(Landroid/view/View;)Lxe2;

    move-result-object v0

    const-string v1, "bind(view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LZH3$a;->b:Lxe2;

    new-instance v0, LZH3$a$a;

    invoke-direct {v0, p1, p0}, LZH3$a$a;-><init>(LZH3;LZH3$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/constant/HealthStatus;Lxe2;)V
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, LZH3$a$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const-string v0, "drawable"

    const-string v1, "compoundDrawables"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq p1, v4, :cond_3

    if-eq p1, v3, :cond_1

    iget-object p1, p2, Lxe2;->d:Landroid/widget/TextView;

    const-string p2, "binding.healthStatusLabel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5, v5, v3, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    iget-object p1, p2, Lxe2;->d:Landroid/widget/TextView;

    const-string p2, "showHealthStatus$lambda$9"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4, v5, v3, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v2, LDf4;->birdRed:I

    invoke-static {p2, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->operator_inventory_oos_label:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v2

    :goto_1
    if-ge v5, v1, :cond_5

    aget-object v3, v2, v5

    if-eqz v3, :cond_2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3, p2}, Ltu6;->o(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p2, Lxe2;->d:Landroid/widget/TextView;

    const-string p2, "showHealthStatus$lambda$6"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4, v5, v3, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v2, LDf4;->birdYellow:I

    invoke-static {p2, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->operator_inventory_running_low_label:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v2

    :goto_2
    if-ge v5, v1, :cond_5

    aget-object v3, v2, v5

    if-eqz v3, :cond_4

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3, p2}, Ltu6;->o(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    return-void
.end method

.method public bind(I)V
    .locals 8

    iget-object v0, p0, LZH3$a;->c:LZH3;

    invoke-static {v0}, LZH3;->access$getAdapterData(LZH3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireInventoryPart;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireInventoryPart;

    if-eqz p1, :cond_4

    iget-object v0, p0, LZH3$a;->c:LZH3;

    iget-object v2, p0, LZH3$a;->b:Lxe2;

    iget-object v2, v2, Lxe2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireInventoryPart;->displayName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireInventoryPart;->getSku()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, LZH3$a;->b:Lxe2;

    iget-object v3, v3, Lxe2;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lnl4;->operator_inventory_part_sku:I

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireInventoryPart;->getDefaultImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v2, p0, LZH3$a;->b:Lxe2;

    iget-object v2, v2, Lxe2;->e:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v2

    invoke-virtual {v2}, LUI4;->b()LrI4;

    move-result-object v2

    invoke-virtual {v2, p1}, LrI4;->a1(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-static {}, LjU;->l()LjU;

    move-result-object v2

    invoke-virtual {p1, v2}, LrI4;->g1(LK96;)LrI4;

    move-result-object p1

    iget-object v2, p0, LZH3$a;->b:Lxe2;

    iget-object v2, v2, Lxe2;->e:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_3

    iget-object p1, p0, LZH3$a;->b:Lxe2;

    iget-object p1, p1, Lxe2;->e:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    invoke-static {v0}, LZH3;->access$getHealthStatus$p(LZH3;)Lco/bird/android/model/constant/HealthStatus;

    move-result-object p1

    iget-object v0, p0, LZH3$a;->b:Lxe2;

    invoke-virtual {p0, p1, v0}, LZH3$a;->a(Lco/bird/android/model/constant/HealthStatus;Lxe2;)V

    :cond_4
    return-void
.end method
