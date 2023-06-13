.class public final Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$HeaderViewHolder;,
        Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nR\"\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "Lio/reactivex/Observable;",
        "",
        "c1",
        "I2",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lma4;",
        "actionClicksRelay",
        "d",
        "disabledClicksRelay",
        "<init>",
        "()V",
        "HeaderViewHolder",
        "VehicleViewHolder",
        "core-inventory_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->c:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->d:Lma4;

    return-void
.end method

.method public static final synthetic access$getActionClicksRelay$p(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->c:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getAdapterData(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDisabledClicksRelay$p(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->d:Lma4;

    return-object p0
.end method


# virtual methods
.method public final I2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->d:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "disabledClicksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c1()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->c:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "actionClicksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LXi4;->item_core_inventory_scan_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$HeaderViewHolder;

    invoke-direct {p2, p0, p1}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$HeaderViewHolder;-><init>(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Lmk4;->item_scan_vehicle:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;

    invoke-direct {p2, p0, p1}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;-><init>(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapterDiff;

    invoke-direct {v0}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapterDiff;-><init>()V

    return-object v0
.end method
