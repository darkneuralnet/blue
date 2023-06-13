.class public final LE00$f;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LE00$f;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Leb2;",
        "b",
        "Leb2;",
        "binding",
        "",
        "c",
        "Ljava/lang/String;",
        "surplusId",
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
        "SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyVehiclesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyVehiclesViewHolder\n*L\n200#1:266\n200#1:267,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Leb2;

.field public c:Ljava/lang/String;

.field public final synthetic d:LE00;


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

    iput-object p1, p0, LE00$f;->d:LE00;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Leb2;->a(Landroid/view/View;)Leb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LE00$f;->b:Leb2;

    iget-object p2, p2, Leb2;->c:Landroid/widget/ImageView;

    const-string v0, "binding.refresh"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LE00$f$a;

    invoke-direct {v0, p0, p1}, LE00$f$a;-><init>(LE00$f;LE00;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LE00$f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LE00$f;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LE00$f;->d:LE00;

    invoke-static {v0}, LE00;->access$getAdapterData(LE00;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, LE00$f;->b:Leb2;

    iget-object v2, v2, Leb2;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    iget-object v0, p0, LE00$f;->b:Leb2;

    iget-object v0, v0, Leb2;->d:Landroid/widget/TextView;

    const-string v2, "binding.title"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, LE00$f;->b:Leb2;

    iget-object v1, v1, Leb2;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, LE00$f;->b:Leb2;

    iget-object v0, v0, Leb2;->b:Landroid/widget/TextView;

    const-string v1, "binding.body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    :cond_4
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;->getAction()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$RecheckSurplus;

    if-eqz v0, :cond_5

    iget-object v0, p0, LE00$f;->b:Leb2;

    iget-object v0, v0, Leb2;->c:Landroid/widget/ImageView;

    const-string v1, "binding.refresh"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$RecheckSurplus;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$RecheckSurplus;->getSurplusId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LE00$f;->c:Ljava/lang/String;

    :cond_5
    return-void
.end method
