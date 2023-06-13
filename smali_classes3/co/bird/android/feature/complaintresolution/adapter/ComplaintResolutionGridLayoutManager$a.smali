.class public final Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;-><init>(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "co/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a",
        "Landroidx/recyclerview/widget/GridLayoutManager$b;",
        "",
        "position",
        "f",
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nComplaintResolutionGridLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionGridLayoutManager.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1774#2,4:35\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionGridLayoutManager.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$1\n*L\n20#1:35,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;->e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>()V

    return-void
.end method


# virtual methods
.method public f(I)I
    .locals 6

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;->e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    invoke-static {v0}, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;->access$getAdapter$p(Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;->e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    move-object v4, v0

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    invoke-static {v2}, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;->access$getAdapter$p(Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemViewType(I)I

    move-result v4

    sget v5, LVi4;->item_take_photo:I

    if-ne v4, v5, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    if-eqz v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_0

    :cond_3
    move v1, v3

    :goto_2
    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;->e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    invoke-static {v0}, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;->access$getAdapter$p(Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemViewType(I)I

    move-result p1

    sget v0, LVi4;->item_take_photo:I

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;->e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->o3()I

    move-result p1

    div-int/2addr p1, v1

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a;->e:Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->o3()I

    move-result p1

    :goto_3
    return p1
.end method
