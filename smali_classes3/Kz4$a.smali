.class public final LKz4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKz4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001c\u0010\u000c\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006 "
    }
    d2 = {
        "LKz4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/TextView;",
        "kotlin.jvm.PlatformType",
        "b",
        "Landroid/widget/TextView;",
        "supertypeText",
        "c",
        "repairsNeeded",
        "Landroid/widget/ImageView;",
        "d",
        "Landroid/widget/ImageView;",
        "asset",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "e",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "Landroid/view/View;",
        "f",
        "Landroid/view/View;",
        "divider",
        "LHz4;",
        "g",
        "LHz4;",
        "adapter",
        "view",
        "<init>",
        "(LKz4;Landroid/view/View;)V",
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
        "SMAP\nRepairIssueSupertypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n1#4:112\n41#5:113\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder\n*L\n86#1:107\n86#1:108,4\n95#1:113\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroidx/recyclerview/widget/RecyclerView;

.field public final f:Landroid/view/View;

.field public final g:LHz4;

.field public final synthetic h:LKz4;


# direct methods
.method public constructor <init>(LKz4;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKz4$a;->h:LKz4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    sget v0, LRh4;->supertype:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LKz4$a;->b:Landroid/widget/TextView;

    sget v0, LRh4;->repairsNeeded:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LKz4$a;->c:Landroid/widget/TextView;

    sget v0, LRh4;->asset:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LKz4$a;->d:Landroid/widget/ImageView;

    sget v0, LRh4;->recyclerView:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, LKz4$a;->e:Landroidx/recyclerview/widget/RecyclerView;

    sget v1, LRh4;->divider:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, LKz4$a;->f:Landroid/view/View;

    new-instance p2, LHz4;

    invoke-direct {p2}, LHz4;-><init>()V

    iput-object p2, p0, LKz4$a;->g:LHz4;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance v1, Landroidx/recyclerview/widget/g;

    invoke-direct {v1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    const-string p2, "recyclerView"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LKz4$a$a;

    invoke-direct {p2, p0}, LKz4$a$a;-><init>(LKz4$a;)V

    invoke-static {v0, p2}, LMs2;->v(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKz4$a$b;

    invoke-direct {v0, p1, p0}, LKz4$a$b;-><init>(LKz4;LKz4$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LKz4$a;->h:LKz4;

    invoke-static {v0}, LKz4;->access$getAdapterData(LKz4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LEa2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LEa2;

    if-eqz p1, :cond_4

    iget-object v0, p0, LKz4$a;->h:LKz4;

    invoke-virtual {p1}, LEa2;->a()Lco/bird/android/model/Issue;

    move-result-object v2

    invoke-virtual {p1}, LEa2;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LEa2;->c()LH6;

    move-result-object p1

    iget-object v4, p0, LKz4$a;->b:Landroid/widget/TextView;

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, LKz4$a;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getAssetId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "recyclerView"

    if-eqz v2, :cond_2

    invoke-static {v0}, LKz4;->access$getLocalAssetManager$p(LKz4;)Lsu2;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/AssetManagerType;->REPAIR:Lco/bird/android/model/constant/AssetManagerType;

    sget-object v6, Lco/bird/android/model/constant/TaskPriority;->IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

    invoke-interface {v4, v2, v5, v6}, Lsu2;->a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;)Lio/reactivex/F;

    move-result-object v2

    iget-object v4, p0, LKz4$a;->d:Landroid/widget/ImageView;

    const-string v5, "asset"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LKz4;->access$getRecyclerView$p(LKz4;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-static {v0}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    const-string v5, "ViewScopeProvider.from(this)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4, v0}, LYf5;->L(Lio/reactivex/F;Landroid/widget/ImageView;Lcom/uber/autodispose/ScopeProvider;)V

    :cond_2
    iget-object v0, p0, LKz4$a;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH6;->f()I

    move-result v2

    const/4 v4, 0x0

    if-lez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v4

    :goto_1
    const/4 v5, 0x2

    invoke-static {v0, v2, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LKz4$a;->f:Landroid/view/View;

    const-string v1, "divider"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LKz4$a;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ltu6;->u(Landroid/view/View;)Z

    move-result v1

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LKz4$a;->g:LHz4;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_4
    return-void
.end method
