.class public final LYs1$m;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "m"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LYs1$m;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LDr6;",
        "b",
        "LDr6;",
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
        "SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$RideRatingsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$RideRatingsViewHolder\n*L\n427#1:670\n427#1:671,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LDr6;

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

    iput-object p1, p0, LYs1$m;->c:LYs1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LDr6;->a(Landroid/view/View;)LDr6;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYs1$m;->b:LDr6;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LYs1$m;->c:LYs1;

    invoke-static {v0}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;

    if-eqz p1, :cond_2

    iget-object v0, p0, LYs1$m;->b:LDr6;

    iget-object v0, v0, LDr6;->b:Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setLabel(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYs1$m;->b:LDr6;

    iget-object v0, v0, LDr6;->b:Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;->getRating()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setRating(F)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;->getFeedback()Ljava/lang/String;

    move-result-object p1

    const-string v0, "binding.reviewBox"

    if-eqz p1, :cond_1

    iget-object v1, p0, LYs1$m;->b:LDr6;

    iget-object v1, v1, LDr6;->c:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LYs1$m;->b:LDr6;

    iget-object p1, p1, LDr6;->c:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, LYs1$m;->b:LDr6;

    iget-object p1, p1, LDr6;->c:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :cond_2
    return-void
.end method
