.class public final Lfl3$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfl3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\r\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "Lfl3$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/constant/ClientIcon;",
        "clientIcon",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "iconColor",
        "iconBackgroundColor",
        "Lco/bird/android/model/constant/ColoredIcon;",
        "coloredIcon",
        "b",
        "LOd2;",
        "LOd2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lfl3;Landroid/view/View;)V",
        "filters_release"
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
        "SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,298:1\n18#2:299\n9#3,4:300\n1726#4,3:304\n1#5:307\n177#6,2:308\n177#6,2:310\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder\n*L\n114#1:299\n114#1:300,4\n124#1:304,3\n164#1:308,2\n177#1:310,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LOd2;

.field public final synthetic c:Lfl3;


# direct methods
.method public constructor <init>(Lfl3;Landroid/view/View;)V
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

    iput-object p1, p0, Lfl3$d;->c:Lfl3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LOd2;->a(Landroid/view/View;)LOd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lfl3$d;->b:LOd2;

    invoke-virtual {p2}, LOd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfl3$d$a;

    invoke-direct {v1, p0, p1}, Lfl3$d$a;-><init>(Lfl3$d;Lfl3;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, LOd2;->d:Lco/bird/android/feature/filters/operator/v2/view/LogicOperatorView;

    const-string v0, "binding.logicOperator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfl3$d$b;

    invoke-direct {v0, p1, p0}, Lfl3$d$b;-><init>(Lfl3;Lfl3$d;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lfl3$d;)LOd2;
    .locals 0

    iget-object p0, p0, Lfl3$d;->b:LOd2;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;)V
    .locals 6

    iget-object v0, p0, Lfl3$d;->b:LOd2;

    iget-object v0, v0, LOd2;->c:Landroid/widget/ImageView;

    const-string v1, "binding.icon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-nez p1, :cond_1

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    move v3, v2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v3, v2, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    const-string v0, "binding.root.context"

    if-eqz p1, :cond_2

    iget-object v3, p0, Lfl3$d;->b:LOd2;

    invoke-virtual {v3}, LOd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v3, p0, Lfl3$d;->b:LOd2;

    iget-object v3, v3, LOd2;->c:Landroid/widget/ImageView;

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lfl3$d;->b:LOd2;

    iget-object p2, p2, LOd2;->c:Landroid/widget/ImageView;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    if-eqz p4, :cond_3

    iget-object p1, p0, Lfl3$d;->b:LOd2;

    invoke-virtual {p1}, LOd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p1}, LLm0;->a(Lco/bird/android/model/constant/ColoredIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lfl3$d;->b:LOd2;

    iget-object p2, p2, LOd2;->c:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    iget-object p2, p0, Lfl3$d;->b:LOd2;

    iget-object p2, p2, LOd2;->c:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    instance-of p4, p3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz p4, :cond_4

    check-cast p3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    goto :goto_2

    :cond_4
    move-object p3, v5

    :goto_2
    if-eqz p3, :cond_5

    const/16 p4, 0x28

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, Ltd3;->b(Ljava/lang/Number;)F

    move-result p4

    float-to-int p4, p4

    iput p4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput p4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    goto :goto_3

    :cond_5
    move-object p3, v5

    :goto_3
    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Lfl3$d;->b:LOd2;

    iget-object p2, p2, LOd2;->c:Landroid/widget/ImageView;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0x8

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p3}, Ltd3;->b(Ljava/lang/Number;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p2, p3, p3, p3, p3}, Landroid/view/View;->setPadding(IIII)V

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p0, Lfl3$d;->b:LOd2;

    iget-object p2, p2, LOd2;->c:Landroid/widget/ImageView;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_4

    :cond_6
    move-object p1, v5

    :goto_4
    if-nez p1, :cond_9

    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->c:Landroid/widget/ImageView;

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of p3, p2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz p3, :cond_7

    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    goto :goto_5

    :cond_7
    move-object p2, v5

    :goto_5
    if-eqz p2, :cond_8

    const/16 p3, 0x18

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p3}, Ltd3;->b(Ljava/lang/Number;)F

    move-result p3

    float-to-int p3, p3

    iput p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    move-object v5, p2

    :cond_8
    invoke-virtual {p1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->c:Landroid/widget/ImageView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    :cond_9
    return-void
.end method

.method public bind(I)V
    .locals 9

    iget-object v0, p0, Lfl3$d;->c:Lfl3;

    invoke-static {v0}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorFilter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorFilter;

    if-eqz p1, :cond_a

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lfl3$d;->b:LOd2;

    iget-object v0, v0, LOd2;->f:Landroid/widget/TextView;

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lfl3$d;->b:LOd2;

    iget-object v0, v0, LOd2;->c:Landroid/widget/ImageView;

    const-string v3, "binding.icon"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v5

    goto :goto_2

    :cond_2
    :goto_1
    move v3, v4

    :goto_2
    const/4 v6, 0x2

    invoke-static {v0, v3, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v8

    invoke-virtual {p0, v0, v3, v7, v8}, Lfl3$d;->b(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;)V

    invoke-interface {p1}, Lco/bird/android/model/persistence/OperatorFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/OperatorFilterType;->MULTI_SELECT:Lco/bird/android/model/constant/OperatorFilterType;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->b:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_4

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    move v0, v4

    goto :goto_3

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v3

    if-nez v3, :cond_5

    move v0, v5

    :goto_3
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_4

    :cond_6
    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->b:Landroid/widget/CheckBox;

    const-string v0, "binding.checkbox"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :goto_4
    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lfl3$d;->b:LOd2;

    iget-object v0, v0, LOd2;->d:Lco/bird/android/feature/filters/operator/v2/view/LogicOperatorView;

    invoke-virtual {v0, p1}, Lco/bird/android/feature/filters/operator/v2/view/LogicOperatorView;->e(Lco/bird/android/model/constant/FilterLogicToggleOption;)V

    :cond_7
    iget-object p1, p0, Lfl3$d;->b:LOd2;

    iget-object p1, p1, LOd2;->d:Lco/bird/android/feature/filters/operator/v2/view/LogicOperatorView;

    const-string v0, "binding.logicOperator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v0

    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    move v4, v5

    :goto_5
    invoke-static {p1, v4, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_6

    :cond_9
    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lfl3$d;->b:LOd2;

    iget-object v0, v0, LOd2;->f:Landroid/widget/TextView;

    check-cast p1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object p1

    invoke-virtual {p0, v0, v1, v2, p1}, Lfl3$d;->b(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;)V

    :cond_a
    :goto_6
    return-void
.end method
