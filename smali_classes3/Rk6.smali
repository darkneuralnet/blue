.class public final LRk6;
.super LqA;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRk6$a;,
        LRk6$b;,
        LRk6$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u0008\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0012\u001a\u00020\nH\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "LRk6;",
        "LqA;",
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
        "LF6;",
        "r",
        "w",
        "Lco/bird/android/model/VehicleCommand;",
        "command",
        "B",
        "E",
        "f",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "<init>",
        "()V",
        "a",
        "b",
        "c",
        "co.bird.android.feature.commandcenter"
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
        "SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1549#2:129\n1620#2,3:130\n1855#2,2:133\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter\n*L\n69#1:129\n69#1:130,3\n70#1:133,2\n*E\n"
    }
.end annotation


# instance fields
.field public f:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LqA;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAdapterData(LRk6;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getButtonSubject(LRk6;)Lio/reactivex/subjects/d;
    .locals 0

    invoke-virtual {p0}, LqA;->D()Lio/reactivex/subjects/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(Lco/bird/android/model/VehicleCommand;)V
    .locals 1

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LoA;->B(Lco/bird/android/model/VehicleCommand;)V

    invoke-virtual {p0}, LRk6;->E()V

    return-void
.end method

.method public final E()V
    .locals 6

    iget-object v0, p0, LRk6;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    const-string v3, "child"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lft4;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p0, v3}, LMy;->getItemViewType(I)I

    move-result v4

    sget v5, Lnj4;->item_command_center_command:I

    if-ne v4, v5, :cond_2

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;

    move-result-object v2

    instance-of v4, v2, LoA$a;

    if-eqz v4, :cond_3

    check-cast v2, LoA$a;

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_2

    invoke-virtual {v2, v3}, LoA$a;->bind(I)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object p1, p0, LRk6;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LZk6;

    invoke-direct {v0}, LZk6;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LRk6;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    move-result-object v0

    sget v1, LUi4;->item_command_center_service_center:I

    if-ne p2, v1, :cond_0

    new-instance p1, LRk6$c;

    invoke-direct {p1, p0, v0}, LRk6$c;-><init>(LRk6;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v1, LUi4;->item_command_center_past_work_order:I

    if-ne p2, v1, :cond_1

    new-instance p1, LRk6$a;

    invoke-direct {p1, p0, v0}, LRk6$a;-><init>(LRk6;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v1, LUi4;->item_button_drop_down_brand_outline:I

    if-ne p2, v1, :cond_2

    new-instance p1, LqA$a;

    invoke-direct {p1, p0, v0}, LqA$a;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v1, Lmk4;->item_button_matte_black:I

    if-ne p2, v1, :cond_3

    new-instance p1, LqA$a;

    invoke-direct {p1, p0, v0}, LqA$a;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v1, Lmk4;->item_scrap_rejection:I

    if-ne p2, v1, :cond_4

    new-instance p1, LRk6$b;

    invoke-direct {p1, p0, v0}, LRk6$b;-><init>(LRk6;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    sget v1, Lmk4;->item_button:I

    if-ne p2, v1, :cond_5

    new-instance p1, LqA$a;

    invoke-direct {p1, p0, v0}, LqA$a;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_5
    invoke-super {p0, p1, p2}, LqA;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LSk6;

    invoke-direct {v0}, LSk6;-><init>()V

    return-object v0
.end method

.method public w()V
    .locals 0

    invoke-super {p0}, LoA;->w()V

    invoke-virtual {p0}, LRk6;->E()V

    return-void
.end method
