.class public final Lfl3$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl3$d;-><init>(Lfl3;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n18#2:299\n18#2:313\n18#2:319\n9#3,4:300\n9#3,4:314\n9#3,4:320\n1549#4:304\n1620#4,3:305\n1549#4:308\n1620#4,3:309\n288#4:312\n289#4:318\n1747#4,3:324\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder$1\n*L\n88#1:299\n99#1:313\n103#1:319\n88#1:300,4\n99#1:314,4\n103#1:320,4\n93#1:304\n93#1:305,3\n94#1:308\n94#1:309,3\n96#1:312\n96#1:318\n103#1:324,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lfl3$d;

.field public final synthetic h:Lfl3;


# direct methods
.method public constructor <init>(Lfl3$d;Lfl3;)V
    .locals 0

    iput-object p1, p0, Lfl3$d$a;->g:Lfl3$d;

    iput-object p2, p0, Lfl3$d$a;->h:Lfl3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lfl3$d$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 10

    iget-object p1, p0, Lfl3$d$a;->g:Lfl3$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lfl3$d$a;->h:Lfl3;

    invoke-static {v1}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object v1

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    check-cast v1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget-object v2, p0, Lfl3$d$a;->h:Lfl3;

    invoke-static {v2}, Lfl3;->access$getFilterSubject$p(Lfl3;)Lio/reactivex/subjects/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object v2, p0, Lfl3$d$a;->h:Lfl3;

    invoke-static {v2}, Lfl3;->access$getRecyclerView$p(Lfl3;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    const-string v4, "recyclerView"

    if-nez v2, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_3
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v5, 0x0

    invoke-static {v5, v2}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v2

    iget-object v6, p0, Lfl3$d$a;->h:Lfl3;

    invoke-static {v6}, Lfl3;->access$getRecyclerView$p(Lfl3;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v6

    if-nez v6, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v3

    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v2, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    move-object v9, v2

    check-cast v9, Lkotlin/collections/IntIterator;

    invoke-virtual {v9}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v9

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iget-object v2, p0, Lfl3$d$a;->h:Lfl3;

    invoke-static {v2}, Lfl3;->access$getRecyclerView$p(Lfl3;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v7, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    invoke-virtual {v2, v7}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    const-class v2, Lfl3$b;

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v4, p0, Lfl3$d$a;->h:Lfl3;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lfl3$b;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v8

    if-eq v8, v0, :cond_a

    invoke-static {v4}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v9

    invoke-virtual {v9, v8}, LE6;->e(I)LG6;

    move-result-object v8

    invoke-virtual {v8}, LG6;->c()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v9, :cond_9

    goto :goto_3

    :cond_9
    move-object v8, v3

    :goto_3
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    move v8, v7

    goto :goto_4

    :cond_a
    move v8, v5

    :goto_4
    if-eqz v8, :cond_8

    goto :goto_5

    :cond_b
    move-object v6, v3

    :goto_5
    check-cast v6, Lfl3$b;

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lfl3$b;->a()V

    :cond_c
    iget-object v0, p0, Lfl3$d$a;->h:Lfl3;

    invoke-static {v0}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v0, :cond_d

    move-object v3, p1

    :cond_d
    check-cast v3, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_11

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_f

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    move p1, v5

    goto :goto_6

    :cond_f
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v0

    xor-int/2addr v0, v7

    if-eqz v0, :cond_10

    move p1, v7

    :goto_6
    if-ne p1, v7, :cond_11

    move v5, v7

    :cond_11
    iget-object p1, p0, Lfl3$d$a;->g:Lfl3$d;

    invoke-static {p1}, Lfl3$d;->a(Lfl3$d;)LOd2;

    move-result-object p1

    iget-object p1, p1, LOd2;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method
