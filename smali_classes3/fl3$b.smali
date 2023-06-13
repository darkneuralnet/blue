.class public final Lfl3$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfl3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "Lfl3$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "a",
        "LRd2;",
        "b",
        "LRd2;",
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
        "SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$MultiSelectFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n18#2:299\n18#2:306\n9#3,4:300\n9#3,4:307\n1855#4,2:304\n1747#4,3:311\n1549#4:314\n1620#4,3:315\n1549#4:318\n1620#4,3:319\n1855#4,2:322\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$MultiSelectFilterViewHolder\n*L\n186#1:299\n209#1:306\n186#1:300,4\n209#1:307,4\n188#1:304,2\n209#1:311,3\n211#1:314\n211#1:315,3\n212#1:318\n212#1:319,3\n213#1:322,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LRd2;

.field public final synthetic c:Lfl3;


# direct methods
.method public constructor <init>(Lfl3;Landroid/view/View;)V
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

    iput-object p1, p0, Lfl3$b;->c:Lfl3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LRd2;->a(Landroid/view/View;)LRd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lfl3$b;->b:LRd2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lfl3$b;->c:Lfl3;

    invoke-static {v1}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v1

    invoke-virtual {v1, v0}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_4

    move v0, v3

    :goto_1
    if-ne v0, v3, :cond_5

    goto :goto_2

    :cond_5
    move v3, v1

    :goto_2
    iget-object v0, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v0}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    iget-object v1, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v1}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v1

    const-string v2, "binding.root"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    move-object v5, v0

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    const-string v4, "null cannot be cast to non-null type com.google.android.material.chip.Chip"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/google/android/material/chip/Chip;

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/chip/Chip;

    invoke-virtual {v1, v3}, Lcom/google/android/material/chip/Chip;->setChecked(Z)V

    goto :goto_5

    :cond_8
    return-void
.end method

.method public bind(I)V
    .locals 9

    iget-object v0, p0, Lfl3$b;->c:Lfl3;

    invoke-static {v0}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lfl3$b;->c:Lfl3;

    iget-object v2, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v2}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    iget-object v4, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v4}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "binding.root.context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    iget-object v6, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v6}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v4, v6, v7}, LOi0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LOi0;

    move-result-object v4

    const-string v6, "inflate(binding.root.con\u2026ter, binding.root, false)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, LOi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v6

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, LOi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v6

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v8, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v8}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v8}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v5, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v5}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v8, LEf4;->filter_chip_icon_color_state_list:I

    invoke-static {v5, v8}, LNA0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v7, v5}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v7, v5}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v7

    if-eqz v7, :cond_2

    iget-object v8, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v8}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v8}, LLm0;->a(Lco/bird/android/model/constant/ColoredIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v1

    :goto_2
    invoke-virtual {v6, v7}, Lcom/google/android/material/chip/Chip;->setChipIcon(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4}, LOi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v6

    invoke-virtual {v5, v6}, Lcom/google/android/material/chip/Chip;->setChecked(Z)V

    invoke-virtual {v4}, LOi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v5

    const-string v6, "chip.root"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lfl3$b$a;

    invoke-direct {v6, v0, p1, v3}, Lfl3$b$a;-><init>(Lfl3;Lco/bird/android/model/persistence/OperatorOptionFilter;Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;)V

    invoke-static {v5, v6}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v3, p0, Lfl3$b;->b:LRd2;

    invoke-virtual {v3}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v3

    invoke-virtual {v4}, LOi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    :cond_3
    return-void
.end method
