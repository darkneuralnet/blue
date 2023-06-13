.class public final Lfl3$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfl3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfl3$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
        "minOption",
        "maxOption",
        "e",
        "LZd2;",
        "b",
        "LZd2;",
        "viewBinding",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lfl3;Landroid/view/View;)V",
        "filters_release"
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
        "SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$RangeSelectFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n18#2:299\n18#2:312\n9#3,4:300\n9#3,4:313\n288#4,2:304\n533#4,6:306\n766#4:317\n857#4,2:318\n1855#4,2:320\n777#4:322\n788#4:323\n1864#4,2:324\n789#4,2:326\n1866#4:328\n791#4:329\n1549#4:330\n1620#4,3:331\n1855#4,2:334\n766#4:336\n857#4,2:337\n1549#4:339\n1620#4,3:340\n1855#4,2:343\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$RangeSelectFilterViewHolder\n*L\n254#1:299\n227#1:312\n254#1:300,4\n227#1:313,4\n255#1:304,2\n256#1:306,6\n230#1:317\n230#1:318,2\n231#1:320,2\n234#1:322\n234#1:323\n234#1:324,2\n234#1:326,2\n234#1:328\n234#1:329\n235#1:330\n235#1:331,3\n236#1:334,2\n242#1:336\n242#1:337,2\n243#1:339\n243#1:340,3\n244#1:343,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LZd2;

.field public c:Z

.field public final synthetic d:Lfl3;


# direct methods
.method public constructor <init>(Lfl3;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lfl3$c;->d:Lfl3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LZd2;->a(Landroid/view/View;)LZd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lfl3$c;->b:LZd2;

    iget-object p2, p2, LZd2;->b:Lco/bird/android/widget/FilterSeekBar;

    new-instance v0, Lgl3;

    invoke-direct {v0, p0, p1}, Lgl3;-><init>(Lfl3$c;Lfl3;)V

    invoke-virtual {p2, v0}, Lco/bird/android/widget/RangeSeekBar;->setOnRangeSeekBarChangeListener(Lco/bird/android/widget/RangeSeekBar$c;)V

    return-void
.end method

.method public static synthetic a(Lfl3$c;Lfl3;Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lfl3$c;->b(Lfl3$c;Lfl3;Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final b(Lfl3$c;Lfl3;Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 10

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lfl3$c;->c:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p2}, LE6;->e(I)LG6;

    move-result-object p2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz p2, :cond_14

    const-string v0, "maxIdx"

    const-string v1, "minIdx"

    const/4 v2, 0x1

    if-nez p3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_7

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-static {p1}, Lfl3;->access$getOptionSubject$p(Lfl3;)Lio/reactivex/subjects/d;

    move-result-object v4

    invoke-static {p2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v4, v3}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    move v6, v5

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    if-gez v6, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_8
    move-object v9, v7

    check-cast v9, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v9

    if-eqz v9, :cond_b

    if-nez p3, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-eq v6, v9, :cond_b

    :goto_5
    if-nez p4, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-eq v6, v9, :cond_b

    :goto_6
    move v6, v2

    goto :goto_7

    :cond_b
    move v6, v5

    :goto_7
    if-eqz v6, :cond_c

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_c
    move v6, v8

    goto :goto_4

    :cond_d
    new-instance v3, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-static {p2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_e
    invoke-static {p1}, Lfl3;->access$getOptionSubject$p(Lfl3;)Lio/reactivex/subjects/d;

    move-result-object v4

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/Pair;

    invoke-virtual {v4, v7}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_9

    :cond_f
    const/4 v3, 0x2

    new-array v3, v3, [Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v4

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_10
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v7

    xor-int/2addr v7, v2

    if-eqz v7, :cond_10

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-static {p2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    invoke-static {p1}, Lfl3;->access$getOptionSubject$p(Lfl3;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {p1, v3}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_c

    :cond_13
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object p1

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object p2

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {p0, p1, p2}, Lfl3$c;->e(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;)V

    :cond_14
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfl3$c;->c:Z

    iget-object v1, p0, Lfl3$c;->d:Lfl3;

    invoke-static {v1}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    if-nez v4, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v3, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v2, v5

    :cond_5
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    if-nez v2, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    :cond_6
    invoke-virtual {p0, v4, v2}, Lfl3$c;->e(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;)V

    iget-object v3, p0, Lfl3$c;->b:LZd2;

    iget-object v3, v3, LZd2;->b:Lco/bird/android/widget/FilterSeekBar;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Lco/bird/android/widget/RangeSeekBar;->setRangeValues(Ljava/lang/Number;Ljava/lang/Number;)V

    iget-object v0, p0, Lfl3$c;->b:LZd2;

    iget-object v0, v0, LZd2;->b:Lco/bird/android/widget/FilterSeekBar;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lco/bird/android/widget/RangeSeekBar;->setSelectedMinValue(Ljava/lang/Number;)V

    iget-object v0, p0, Lfl3$c;->b:LZd2;

    iget-object v0, v0, LZd2;->b:Lco/bird/android/widget/FilterSeekBar;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/widget/RangeSeekBar;->setSelectedMaxValue(Ljava/lang/Number;)V

    :cond_7
    iput-boolean v1, p0, Lfl3$c;->c:Z

    return-void
.end method

.method public final e(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;)V
    .locals 1

    iget-object v0, p0, Lfl3$c;->b:LZd2;

    iget-object v0, v0, LZd2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lfl3$c;->b:LZd2;

    iget-object p1, p1, LZd2;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
