.class public final LGI6;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGI6$a;,
        LGI6$b;,
        LGI6$c;,
        LGI6$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u0015\u001cB\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0016\u0010\u0010\u001a\u00020\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "LGI6;",
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
        "",
        "LH6;",
        "sections",
        "u",
        "LF6;",
        "r",
        "Lco/bird/android/bottomsheet/BaseBottomSheet;",
        "Lco/bird/android/model/BottomSheetButton;",
        "c",
        "Lco/bird/android/bottomsheet/BaseBottomSheet;",
        "bottomSheet",
        "<init>",
        "()V",
        "a",
        "b",
        "d",
        "zone-flight-sheet_release"
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
        "SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n1#1,155:1\n9#2,4:156\n9#2,4:165\n9#2,4:178\n1855#3,2:160\n288#3,2:162\n1360#3:169\n1446#3,5:170\n288#3,2:175\n18#4:164\n18#4:177\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter\n*L\n50#1:156,4\n64#1:165,4\n71#1:178,4\n58#1:160,2\n63#1:162,2\n69#1:169\n69#1:170,5\n70#1:175,2\n64#1:164\n71#1:177\n*E\n"
    }
.end annotation


# instance fields
.field public c:Lco/bird/android/bottomsheet/BaseBottomSheet;
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
    .locals 0

    invoke-direct {p0}, LyS0;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAdapterData(LGI6;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBottomSheet$p(LGI6;)Lco/bird/android/bottomsheet/BaseBottomSheet;
    .locals 0

    iget-object p0, p0, LGI6;->c:Lco/bird/android/bottomsheet/BaseBottomSheet;

    return-object p0
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LOI6;

    invoke-direct {v0}, LOI6;-><init>()V

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

    iput-object p1, p0, LGI6;->c:Lco/bird/android/bottomsheet/BaseBottomSheet;

    if-eqz p1, :cond_3

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2}, Lco/bird/android/bottomsheet/BaseBottomSheet;->clearPeekViews$default(Lco/bird/android/bottomsheet/BaseBottomSheet;ZILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LGI6;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LYj4;->item_zone_flight_sheet_summary:I

    if-ne p2, v0, :cond_0

    new-instance p2, LGI6$d;

    invoke-direct {p2, p0, p1}, LGI6$d;-><init>(LGI6;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LYj4;->item_zone_flight_sheet_status:I

    if-ne p2, v0, :cond_1

    new-instance p2, LGI6$c;

    invoke-direct {p2, p0, p1}, LGI6$c;-><init>(LGI6;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LYj4;->item_zone_flight_sheet_details_title:I

    if-ne p2, v0, :cond_2

    new-instance p2, LGI6$b;

    invoke-direct {p2, p0, p1}, LGI6$b;-><init>(LGI6;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LYj4;->item_zone_flight_sheet_detail:I

    if-ne p2, v0, :cond_3

    new-instance p2, LGI6$a;

    invoke-direct {p2, p0, p1}, LGI6$a;-><init>(LGI6;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
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

.method public r()LF6;
    .locals 1

    new-instance v0, LHI6;

    invoke-direct {v0}, LHI6;-><init>()V

    return-object v0
.end method

.method public u(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LG6;

    invoke-virtual {v3}, LG6;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LG6;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    invoke-super {p0, p1}, LMy;->u(Ljava/util/Collection;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LH6;

    invoke-virtual {v3}, LH6;->e()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_3

    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LG6;

    invoke-virtual {v3}, LG6;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_6
    move-object v1, v2

    :goto_4
    check-cast v1, LG6;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    move-object p1, v2

    :goto_5
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;->getTitle()Ljava/lang/String;

    move-result-object p1

    goto :goto_6

    :cond_8
    move-object p1, v2

    :goto_6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, LGI6;->c:Lco/bird/android/bottomsheet/BaseBottomSheet;

    if-eqz p1, :cond_9

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v2}, Lco/bird/android/bottomsheet/BaseBottomSheet;->clearPeekViews$default(Lco/bird/android/bottomsheet/BaseBottomSheet;ZILjava/lang/Object;)V

    :cond_9
    return-void
.end method
