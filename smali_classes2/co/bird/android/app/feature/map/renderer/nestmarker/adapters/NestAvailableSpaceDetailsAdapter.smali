.class public final Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lw1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0008\u0010\u000c\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R6\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Lw1;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "holder",
        "position",
        "",
        "onBindViewHolder",
        "getItemCount",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "onAttachedToRecyclerView",
        "",
        "selected",
        "Z",
        "getSelected",
        "()Z",
        "setSelected",
        "(Z)V",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
        "value",
        "availableSpaceDetails",
        "Ljava/util/List;",
        "getAvailableSpaceDetails",
        "()Ljava/util/List;",
        "setAvailableSpaceDetails",
        "(Ljava/util/List;)V",
        "<init>",
        "()V",
        "NestAvailableSpaceDetailViewHolder",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private availableSpaceDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;"
        }
    .end annotation
.end field

.field private selected:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getAvailableSpaceDetails$p(Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final getAvailableSpaceDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->selected:Z

    return v0
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsItemDecoration;

    invoke-direct {v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsItemDecoration;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lw1;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->onBindViewHolder(Lw1;I)V

    return-void
.end method

.method public onBindViewHolder(Lw1;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lw1;->bind(I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "parent.context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->selected:Z

    if-eqz v0, :cond_0

    sget v0, Lmj4;->item_nest_available_space_detail_selected:I

    goto :goto_0

    :cond_0
    sget v0, Lmj4;->item_nest_available_space_detail:I

    :goto_0
    const/4 v1, 0x0

    invoke-static {p2, v0, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;

    invoke-direct {p2, p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;-><init>(Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public final setAvailableSpaceDetails(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemRangeInserted(II)V

    goto :goto_0

    :cond_0
    new-instance v0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$availableSpaceDetails$diff$1;

    invoke-direct {v0, p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$availableSpaceDetails$diff$1;-><init>(Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;Ljava/util/List;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/recyclerview/widget/h;->c(Landroidx/recyclerview/widget/h$b;Z)Landroidx/recyclerview/widget/h$e;

    move-result-object v0

    const-string v1, "set(value) {\n      if (f\u2026tesTo(this)\n      }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->availableSpaceDetails:Ljava/util/List;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/h$e;->d(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :goto_0
    return-void
.end method

.method public final setSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->selected:Z

    return-void
.end method
