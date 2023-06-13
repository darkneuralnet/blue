.class public final LYs1$n;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LYs1$n;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LZb2;",
        "b",
        "LZb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LYs1;Landroid/view/View;)V",
        "flight-sheet_release"
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
        "SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n177#4,2:675\n766#5:677\n857#5,2:678\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder\n*L\n393#1:670\n393#1:671,4\n401#1:675,2\n411#1:677\n411#1:678,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LZb2;

.field public final synthetic c:LYs1;


# direct methods
.method public constructor <init>(LYs1;Landroid/view/View;)V
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

    iput-object p1, p0, LYs1$n;->c:LYs1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LZb2;->a(Landroid/view/View;)LZb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LYs1$n;->b:LZb2;

    iget-object p2, p2, LZb2;->b:Landroid/widget/ImageView;

    const-string v0, "binding.arrow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYs1$n$a;

    invoke-direct {v0, p1, p0}, LYs1$n$a;-><init>(LYs1;LYs1$n;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 8

    iget-object v0, p0, LYs1$n;->c:LYs1;

    invoke-static {v0}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LGQ5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LGQ5;

    if-eqz p1, :cond_8

    iget-object v0, p0, LYs1$n;->c:LYs1;

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LGQ5;->f()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LGQ5;->c()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->e:Landroid/widget/ImageView;

    invoke-virtual {p1}, LGQ5;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, LGQ5;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, p0, LYs1$n;->b:LZb2;

    iget-object v3, v3, LZb2;->e:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, LHg4;->background_circle:I

    invoke-static {v4, v5}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, p0, LYs1$n;->b:LZb2;

    iget-object v3, v3, LZb2;->e:Landroid/widget/ImageView;

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->e:Landroid/widget/ImageView;

    const-string v3, "binding.statusIcon"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->e:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LDf4;->birdWhite:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setColorFilter(I)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_2

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->b:Landroid/widget/ImageView;

    const-string v3, "binding.arrow"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LGQ5;->c()Ljava/lang/CharSequence;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    move v3, v4

    goto :goto_2

    :cond_3
    move v3, v5

    :goto_2
    const/4 v6, 0x2

    invoke-static {v2, v3, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->b:Landroid/widget/ImageView;

    invoke-static {v0}, LYs1;->access$getExpanded$p(LYs1;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1}, LGQ5;->f()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_3

    :cond_4
    const/high16 v3, 0x43340000    # 180.0f

    :goto_3
    invoke-virtual {v2, v3}, Landroid/view/View;->setRotation(F)V

    iget-object v2, p0, LYs1$n;->b:LZb2;

    iget-object v2, v2, LZb2;->d:Landroid/widget/TextView;

    const-string v3, "binding.statusDescription"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LYs1;->access$getExpanded$p(LYs1;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1}, LGQ5;->f()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {v2, p1, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-static {v0}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LG6;

    invoke-virtual {v3}, LG6;->b()I

    move-result v3

    sget v6, LZj4;->item_flight_sheet_campaign:I

    if-ne v3, v6, :cond_6

    move v3, v4

    goto :goto_5

    :cond_6
    move v3, v5

    :goto_5
    if-eqz v3, :cond_5

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {v0}, LYs1;->access$getBottomSheet$p(LYs1;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "status"

    invoke-virtual {p1, v1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->n(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_8
    return-void
.end method
