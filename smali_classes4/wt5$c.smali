.class public final Lwt5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwt5;->a(Ljava/util/List;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        ">;",
        "Lot5$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "operatorFilters",
        "Lot5$b;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lot5$b;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServerDrivenFilterManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl$calculateFilterDiff$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,198:1\n1855#2:199\n288#2,2:200\n1856#2:205\n1#3:202\n37#4,2:203\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl$calculateFilterDiff$1\n*L\n142#1:199\n143#1:200,2\n142#1:205\n151#1:203,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwt5$c;->g:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lot5$b;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;)",
            "Lot5$b;"
        }
    .end annotation

    const-string v0, "operatorFilters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lwt5$c;->g:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/OperatorFilter;

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lco/bird/android/model/persistence/OperatorFilter;

    invoke-interface {v8}, Lco/bird/android/model/persistence/OperatorFilter;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4}, Lco/bird/android/model/persistence/OperatorFilter;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_1
    move-object v6, v7

    :goto_1
    check-cast v6, Lco/bird/android/model/persistence/OperatorFilter;

    instance-of v5, v6, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v5, :cond_2

    move-object v5, v6

    check-cast v5, Lco/bird/android/model/persistence/OperatorOptionFilter;

    goto :goto_2

    :cond_2
    move-object v5, v7

    :goto_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lco/bird/android/model/persistence/OperatorOptionFilter;->enabledOptionValues()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    :goto_3
    instance-of v8, v4, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v8, :cond_4

    move-object v9, v4

    check-cast v9, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v10

    if-nez v10, :cond_4

    invoke-virtual {v9}, Lco/bird/android/model/persistence/OperatorOptionFilter;->enabledOptionValues()Ljava/util/Set;

    move-result-object v9

    goto :goto_5

    :cond_4
    if-eqz v8, :cond_6

    new-instance v9, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 v10, 0x2

    invoke-direct {v9, v10}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    move-object v10, v4

    check-cast v10, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v10}, Lco/bird/android/model/persistence/OperatorOptionFilter;->enabledOptionValues()Ljava/util/Set;

    move-result-object v11

    new-array v12, v2, [Ljava/lang/String;

    invoke-interface {v11, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :cond_5
    move-object v10, v7

    :goto_4
    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result v10

    new-array v10, v10, [Ljava/lang/String;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lkotlin/collections/SetsKt;->setOfNotNull([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    goto :goto_5

    :cond_6
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v9

    :goto_5
    invoke-static {v5, v9}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v10

    invoke-static {v9, v5}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    invoke-static {v10, v5}, Lkotlin/collections/CollectionsKt;->union(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    const/4 v10, 0x1

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v10

    if-nez v5, :cond_a

    :cond_7
    instance-of v5, v4, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v5, :cond_b

    instance-of v5, v6, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v5, :cond_8

    move-object v7, v6

    check-cast v7, Lco/bird/android/model/persistence/OperatorToggleFilter;

    :cond_8
    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getEnabled()Z

    move-result v5

    move-object v6, v4

    check-cast v6, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getEnabled()Z

    move-result v6

    if-ne v5, v6, :cond_9

    move v5, v10

    goto :goto_6

    :cond_9
    move v5, v2

    :goto_6
    if-nez v5, :cond_b

    :cond_a
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    if-eqz v8, :cond_c

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/OperatorOptionFilter;->isSet()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Lco/bird/android/model/persistence/OperatorFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/OperatorFilterType;->RANGE_SELECT:Lco/bird/android/model/constant/OperatorFilterType;

    if-ne v5, v6, :cond_c

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v10

    if-eqz v4, :cond_e

    goto :goto_7

    :cond_c
    if-eqz v8, :cond_d

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/OperatorOptionFilter;->isSet()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Lco/bird/android/model/persistence/OperatorFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/OperatorFilterType;->MULTI_SELECT:Lco/bird/android/model/constant/OperatorFilterType;

    if-ne v5, v6, :cond_d

    invoke-interface {v9}, Ljava/util/Set;->size()I

    move-result v10

    goto :goto_7

    :cond_d
    instance-of v5, v4, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v5, :cond_e

    check-cast v4, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getEnabled()Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_7

    :cond_e
    move v10, v2

    :goto_7
    add-int/2addr v3, v10

    goto/16 :goto_0

    :cond_f
    new-instance p1, Lot5$b;

    invoke-direct {p1, v0, v3}, Lot5$b;-><init>(Ljava/util/List;I)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lwt5$c;->a(Ljava/util/List;)Lot5$b;

    move-result-object p1

    return-object p1
.end method
