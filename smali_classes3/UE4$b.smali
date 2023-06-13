.class public final LUE4$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUE4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LUE4$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Laf2;",
        "b",
        "Laf2;",
        "binding",
        "LXE4;",
        "c",
        "LXE4;",
        "adapter",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LUE4;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nRepairV3OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$RepairCategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n18#2:170\n9#3,4:171\n1#4:175\n1726#5,3:176\n1774#5,4:179\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$RepairCategoryViewHolder\n*L\n120#1:170\n120#1:171,4\n125#1:176,3\n128#1:179,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Laf2;

.field public final c:LXE4;

.field public final synthetic d:LUE4;


# direct methods
.method public constructor <init>(LUE4;Landroid/view/View;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUE4$b;->d:LUE4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Laf2;->a(Landroid/view/View;)Laf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LUE4$b;->b:Laf2;

    new-instance v0, LXE4;

    invoke-direct {v0}, LXE4;-><init>()V

    iput-object v0, p0, LUE4$b;->c:LXE4;

    invoke-virtual {p2}, Laf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "binding.root"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LUE4$b$a;

    invoke-direct {v2, p0, p1}, LUE4$b$a;-><init>(LUE4$b;LUE4;)V

    invoke-static {v1, v2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p2, Laf2;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    const-string v2, "binding.image"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "itemView.context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    invoke-static {v1, v2}, LCY1;->a(Landroid/widget/ImageView;F)V

    iget-object v1, p2, Laf2;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p2}, Laf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {v2, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance p2, Landroidx/recyclerview/widget/g;

    invoke-direct {p2}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p2, LUE4$b$b;

    invoke-static {p1}, LUE4;->access$getIssueSelectsSubject$p(LUE4;)Lio/reactivex/subjects/d;

    move-result-object v1

    invoke-direct {p2, v1}, LUE4$b$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LXE4;->v(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LUE4$b$c;

    invoke-static {p1}, LUE4;->access$getNonRepairSelectsSubject$p(LUE4;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-direct {p2, p1}, LUE4$b$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LXE4;->w(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 12

    iget-object v0, p0, LUE4$b;->d:LUE4;

    invoke-static {v0}, LUE4;->access$getAdapterData(LUE4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIy4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LIy4;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, LIy4;->a()Lco/bird/android/model/RepairCategory;

    move-result-object v0

    invoke-virtual {p1}, LIy4;->b()LH6;

    move-result-object v2

    invoke-virtual {p1}, LIy4;->c()Z

    move-result p1

    iget-object v3, p0, LUE4$b;->b:Laf2;

    iget-object v3, v3, Laf2;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getDescription()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v5

    if-ne v3, v5, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getDescription()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getIssues()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v6, v3, Ljava/util/Collection;

    if-eqz v6, :cond_4

    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    :cond_3
    move v3, v5

    goto :goto_2

    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/RepairIssue;

    invoke-virtual {v6}, Lco/bird/android/model/RepairIssue;->getSelected()Z

    move-result v6

    xor-int/2addr v6, v5

    if-nez v6, :cond_5

    move v3, v4

    :goto_2
    if-eqz v3, :cond_6

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lnl4;->repair_repairs_needed:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_6
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v6, Lnl4;->repair_repairs_needed_format:I

    new-array v7, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getIssues()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    instance-of v9, v8, Ljava/util/Collection;

    if-eqz v9, :cond_7

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v4

    goto :goto_5

    :cond_7
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v9, v4

    :cond_8
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/android/model/RepairIssue;

    invoke-virtual {v10}, Lco/bird/android/model/RepairIssue;->getCompleted()Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v10}, Lco/bird/android/model/RepairIssue;->getSelected()Z

    move-result v10

    if-eqz v10, :cond_9

    move v10, v5

    goto :goto_4

    :cond_9
    move v10, v4

    :goto_4
    if-eqz v10, :cond_8

    add-int/lit8 v9, v9, 0x1

    if-gez v9, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_3

    :cond_a
    :goto_5
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v7, v4

    invoke-virtual {v3, v6, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_6
    iget-object v4, p0, LUE4$b;->b:Laf2;

    iget-object v4, v4, Laf2;->b:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lco/bird/android/model/RepairCategory;->getAssetUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v3, p0, LUE4$b;->b:Laf2;

    iget-object v3, v3, Laf2;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-static {v3}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v3

    invoke-virtual {v3, v0}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    iget-object v3, p0, LUE4$b;->b:Laf2;

    iget-object v3, v3, Laf2;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v0, v3}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object v0

    goto :goto_7

    :cond_b
    move-object v0, v1

    :goto_7
    if-nez v0, :cond_c

    iget-object v0, p0, LUE4$b;->b:Laf2;

    iget-object v0, v0, Laf2;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_c
    iget-object v0, p0, LUE4$b;->b:Laf2;

    invoke-virtual {v0}, Laf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, LUE4$b;->c:LXE4;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1, v0}, LMy;->u(Ljava/util/Collection;)V

    :cond_d
    return-void
.end method
