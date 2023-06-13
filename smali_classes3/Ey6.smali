.class public final LEy6;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEy6$a;,
        LEy6$b;,
        LEy6$c;,
        LEy6$d;,
        LEy6$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0005\u001a\u001b\u0011\u0015\u001cB\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "LEy6;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "onDetachedFromRecyclerView",
        "Lkotlin/Function1;",
        "Lco/bird/android/model/WarehouseFlightSheetButton;",
        "onButtonClick",
        "v",
        "c",
        "Lkotlin/jvm/functions/Function1;",
        "Lco/bird/android/bottomsheet/BaseBottomSheet;",
        "Lco/bird/android/model/BottomSheetButton;",
        "d",
        "Lco/bird/android/bottomsheet/BaseBottomSheet;",
        "bottomSheet",
        "<init>",
        "()V",
        "a",
        "b",
        "e",
        "warehouse-flight-sheet_release"
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
        "SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n9#2,4:184\n1855#3,2:188\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter\n*L\n68#1:184,4\n76#1:188,2\n*E\n"
    }
.end annotation


# instance fields
.field public c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/WarehouseFlightSheetButton;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lco/bird/android/bottomsheet/BaseBottomSheet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "Lco/bird/android/model/BottomSheetButton;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LyS0;-><init>()V

    sget-object v0, LEy6$f;->g:LEy6$f;

    iput-object v0, p0, LEy6;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LEy6;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBottomSheet$p(LEy6;)Lco/bird/android/bottomsheet/BaseBottomSheet;
    .locals 0

    iget-object p0, p0, LEy6;->d:Lco/bird/android/bottomsheet/BaseBottomSheet;

    return-object p0
.end method

.method public static final synthetic access$getOnButtonClick$p(LEy6;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, LEy6;->c:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LMy6;

    invoke-direct {v0}, LMy6;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    instance-of v1, p1, Lco/bird/android/bottomsheet/BaseBottomSheet;

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    check-cast p1, Lco/bird/android/bottomsheet/BaseBottomSheet;

    iput-object p1, p0, LEy6;->d:Lco/bird/android/bottomsheet/BaseBottomSheet;

    if-eqz p1, :cond_3

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2}, Lco/bird/android/bottomsheet/BaseBottomSheet;->clearPeekViews$default(Lco/bird/android/bottomsheet/BaseBottomSheet;ZILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LEy6;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 3

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LVj4;->item_warehouse_flight_sheet_summary:I

    if-ne p2, v0, :cond_0

    new-instance p2, LEy6$c;

    invoke-direct {p2, p0, p1}, LEy6$c;-><init>(LEy6;Landroid/view/View;)V

    goto :goto_2

    :cond_0
    sget v0, LVj4;->item_warehouse_flight_sheet_status:I

    if-ne p2, v0, :cond_1

    new-instance p2, LEy6$b;

    invoke-direct {p2, p0, p1}, LEy6$b;-><init>(LEy6;Landroid/view/View;)V

    goto :goto_2

    :cond_1
    sget v0, Lbk4;->item_formatted_flight_sheet_detail_short:I

    const/4 v2, 0x1

    if-ne p2, v0, :cond_2

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_2
    sget v0, Lbk4;->item_formatted_flight_sheet_detail_long:I

    if-ne p2, v0, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    new-instance p2, LEy6$a;

    invoke-direct {p2, p0, p1}, LEy6$a;-><init>(LEy6;Landroid/view/View;)V

    goto :goto_2

    :cond_4
    sget v0, LVj4;->item_warehouse_flight_sheet_vehicle_details_title:I

    if-ne p2, v0, :cond_5

    new-instance p2, LEy6$e;

    invoke-direct {p2, p0, p1}, LEy6$e;-><init>(LEy6;Landroid/view/View;)V

    goto :goto_2

    :cond_5
    sget v0, LVj4;->item_warehouse_flight_sheet_vehicle_detail:I

    if-ne p2, v0, :cond_6

    new-instance p2, LEy6$d;

    invoke-direct {p2, p0, p1}, LEy6$d;-><init>(LEy6;Landroid/view/View;)V

    goto :goto_2

    :cond_6
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_2
    return-object p2
.end method

.method public onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final v(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/WarehouseFlightSheetButton;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onButtonClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEy6;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method
