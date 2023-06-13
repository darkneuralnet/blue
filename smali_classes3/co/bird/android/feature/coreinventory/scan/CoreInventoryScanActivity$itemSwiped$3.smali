.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->A1()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "scan",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lkotlin/Pair;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->b(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lkotlin/Pair;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lkotlin/Pair;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->access$getUndoDeleteRelay$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lma4;

    move-result-object p0

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    invoke-static {v0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->access$getBinding$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lf00;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lf00;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    sget v2, Lnl4;->transfer_order_snack_vehicle_deleted:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->o0(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->I()Landroid/view/View;

    move-result-object v3

    const/high16 v4, 0x447a0000    # 1000.0f

    invoke-virtual {v3, v4}, Landroid/view/View;->setElevation(F)V

    sget v3, Lnl4;->transfer_order_snack_vehicle_deleted_undo:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/a;

    invoke-direct {v4, v1, p1}, Lco/bird/android/feature/coreinventory/scan/a;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lkotlin/Pair;)V

    invoke-virtual {v0, v3, v4}, Lcom/google/android/material/snackbar/Snackbar;->r0(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    invoke-virtual {v0, v2}, Lcom/google/android/material/snackbar/Snackbar;->s0(I)Lcom/google/android/material/snackbar/Snackbar;

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->Y()V

    return-void
.end method
