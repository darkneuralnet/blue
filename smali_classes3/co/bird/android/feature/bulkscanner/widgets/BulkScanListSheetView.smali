.class public final Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(B\u001d\u0008\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)\u00a2\u0006\u0004\u0008\'\u0010+B\'\u0008\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\u0008\u0008\u0002\u0010-\u001a\u00020,\u00a2\u0006\u0004\u0008\'\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002R\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00080\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0008`\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001fR\u0011\u0010$\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006/"
    }
    d2 = {
        "Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "",
        "i",
        "",
        "LH6;",
        "sections",
        "j",
        "LDI3;",
        "viewModel",
        "e",
        "k",
        "Le40;",
        "b",
        "Le40;",
        "f",
        "()Le40;",
        "birdAdapter",
        "Lh40;",
        "c",
        "Lh40;",
        "g",
        "()Lh40;",
        "partAdapter",
        "LRp6;",
        "d",
        "LRp6;",
        "binding",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "partMaps",
        "Landroid/widget/Button;",
        "h",
        "()Landroid/widget/Button;",
        "updateButton",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "bulk-scanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Le40;

.field public final c:Lh40;

.field public final d:LRp6;

.field public final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LDI3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    new-instance p1, Le40;

    invoke-direct {p1}, Le40;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->b:Le40;

    new-instance v1, Lh40;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lh40;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->c:Lh40;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, LSi4;->view_bulk_scanner_list_sheet:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p0}, LRp6;->a(Landroid/view/View;)LRp6;

    move-result-object v0

    const-string v1, "bind(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->d:LRp6;

    iget-object v1, v0, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v1, v0, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, LMf0;

    sget-object v3, LD62;->f:LD62;

    invoke-virtual {v3}, LD62;->b()Landroid/view/animation/Interpolator;

    move-result-object v3

    invoke-direct {v2, v3}, LMf0;-><init>(Landroid/view/animation/Interpolator;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object v0, v0, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->e:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Le40;

    invoke-direct {p1}, Le40;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->b:Le40;

    new-instance p2, Lh40;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, v1}, Lh40;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->c:Lh40;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, LSi4;->view_bulk_scanner_list_sheet:I

    invoke-virtual {p2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p0}, LRp6;->a(Landroid/view/View;)LRp6;

    move-result-object p2

    const-string v0, "bind(this)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->d:LRp6;

    iget-object v0, p2, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v0, p2, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, LMf0;

    sget-object v2, LD62;->f:LD62;

    invoke-virtual {v2}, LD62;->b()Landroid/view/animation/Interpolator;

    move-result-object v2

    invoke-direct {v1, v2}, LMf0;-><init>(Landroid/view/animation/Interpolator;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object p2, p2, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->e:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Le40;

    invoke-direct {p1}, Le40;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->b:Le40;

    new-instance p2, Lh40;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lh40;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->c:Lh40;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget p3, LSi4;->view_bulk_scanner_list_sheet:I

    invoke-virtual {p2, p3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p0}, LRp6;->a(Landroid/view/View;)LRp6;

    move-result-object p2

    const-string p3, "bind(this)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->d:LRp6;

    iget-object p3, p2, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p3, p2, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LMf0;

    sget-object v1, LD62;->f:LD62;

    invoke-virtual {v1}, LD62;->b()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-direct {v0, v1}, LMf0;-><init>(Landroid/view/animation/Interpolator;)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object p2, p2, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->e:Ljava/util/HashMap;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final e(LDI3;)V
    .locals 2

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->e:Ljava/util/HashMap;

    invoke-virtual {p1}, LDI3;->b()Lco/bird/android/model/wire/WireInventoryPart;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireInventoryPart;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDI3;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->c:Lh40;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lct4;->w(ILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->e:Ljava/util/HashMap;

    invoke-virtual {p1}, LDI3;->b()Lco/bird/android/model/wire/WireInventoryPart;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireInventoryPart;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->k()V

    :cond_0
    return-void
.end method

.method public final f()Le40;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->b:Le40;

    return-object v0
.end method

.method public final g()Lh40;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->c:Lh40;

    return-object v0
.end method

.method public final h()Landroid/widget/Button;
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->d:LRp6;

    iget-object v0, v0, LRp6;->h:Landroid/widget/Button;

    const-string v1, "binding.updateButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->d:LRp6;

    iget-object v0, v0, LRp6;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->c:Lh40;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method public final j(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->b:Le40;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->k()V

    return-void
.end method

.method public final k()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->d:LRp6;

    iget-object v0, v0, LRp6;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->b:Le40;

    invoke-virtual {v1}, LMy;->getItemCount()I

    move-result v1

    iget-object v2, p0, Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;->e:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
