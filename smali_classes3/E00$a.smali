.class public final LE00$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE00;
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
        "LE00$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lab2;",
        "b",
        "Lab2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LE00;Landroid/view/View;)V",
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
        "SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyHeaderViewHolder\n*L\n110#1:266\n110#1:267,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lab2;

.field public final synthetic c:LE00;


# direct methods
.method public constructor <init>(LE00;Landroid/view/View;)V
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

    iput-object p1, p0, LE00$a;->c:LE00;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lab2;->a(Landroid/view/View;)Lab2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE00$a;->b:Lab2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LE00$a;->c:LE00;

    invoke-static {v0}, LE00;->access$getAdapterData(LE00;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/BountyFlightSheetDetails;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/BountyFlightSheetDetails;

    if-eqz p1, :cond_3

    iget-object v0, p0, LE00$a;->c:LE00;

    iget-object v2, p0, LE00$a;->b:Lab2;

    iget-object v2, v2, Lab2;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getHeader()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getHeader()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/FleetMarker;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v3

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getHeader()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/FleetMarker;->getBackgroundPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v3

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v2, p0, LE00$a;->b:Lab2;

    iget-object v2, v2, Lab2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getHeader()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getHeader()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;->getSubtitle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LE00$a;->b:Lab2;

    iget-object v1, v1, Lab2;->c:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, LE00$a;->b:Lab2;

    iget-object p1, p1, Lab2;->c:Landroid/widget/TextView;

    const-string v1, "binding.subtitle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :cond_2
    invoke-virtual {v0}, LE00;->w()Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "header"

    invoke-virtual {p1, v1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->n(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_3
    return-void
.end method
