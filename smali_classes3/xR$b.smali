.class public final LxR$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxR;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LxR$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/view/View;",
        "b",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "view",
        "LHc2;",
        "c",
        "LHc2;",
        "binding",
        "<init>",
        "(LxR;Landroid/view/View;)V",
        "co.bird.android.feature.bird-rating-history"
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
        "SMAP\nBirdRatingHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RideRatingTagsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n1855#4,2:107\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryAdapter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryAdapter$RideRatingTagsViewHolder\n*L\n72#1:102\n72#1:103,4\n73#1:107,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:LHc2;

.field public final synthetic d:LxR;


# direct methods
.method public constructor <init>(LxR;Landroid/view/View;)V
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

    iput-object p1, p0, LxR$b;->d:LxR;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LxR$b;->b:Landroid/view/View;

    invoke-static {p2}, LHc2;->a(Landroid/view/View;)LHc2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LxR$b;->c:LHc2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 9

    iget-object v0, p0, LxR$b;->c:LHc2;

    iget-object v0, v0, LHc2;->c:Lcom/google/android/material/chip/ChipGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, LxR$b;->d:LxR;

    invoke-static {v0}, LxR;->access$getAdapterData(LxR;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;

    iget-object v1, p0, LxR$b;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "view.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1}, LPi0;->c(Landroid/view/LayoutInflater;)LPi0;

    move-result-object v1

    const-string v3, "inflate(view.context.layoutInflater)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, LPi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;->getCount()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v4, v6, :cond_1

    move v4, v6

    goto :goto_2

    :cond_1
    move v4, v5

    :goto_2
    invoke-virtual {v3, v4}, Lcom/google/android/material/chip/Chip;->setChipIconVisible(Z)V

    invoke-virtual {v1}, LPi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;->getCount()I

    move-result v3

    if-le v3, v6, :cond_2

    iget-object v3, p0, LxR$b;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-static {v2}, LZs6;->c(Landroid/view/LayoutInflater;)LZs6;

    move-result-object v2

    invoke-virtual {v2}, LZs6;->b()Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/16 v6, 0x14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    float-to-int v7, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v8

    float-to-int v8, v8

    invoke-direct {v4, v7, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v3, "inflate(view.context.lay\u2026Px.toInt())\n            }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, LZs6;->b()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;->getCount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, LTq6;

    invoke-virtual {v2}, LZs6;->b()Landroid/widget/TextView;

    move-result-object v2

    const-string v3, "countBinding.root"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, LTq6;-><init>(Landroid/view/View;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v0, v5, v5, v2, v3}, LTq6;->setBounds(IIII)V

    invoke-virtual {v1}, LPi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/material/chip/Chip;->setChipIcon(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    iget-object v0, p0, LxR$b;->c:LHc2;

    iget-object v0, v0, LHc2;->c:Lcom/google/android/material/chip/ChipGroup;

    invoke-virtual {v1}, LPi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    :cond_3
    return-void
.end method
