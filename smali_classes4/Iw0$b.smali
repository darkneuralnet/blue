.class public final LIw0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIw0;->g()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireTutorialResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireTutorialResponse;",
        "wireTutorialResponse",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireTutorialResponse;)Lio/reactivex/h;"
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
        "SMAP\nConfigurableTutorialRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialRepositoryImpl.kt\nco/bird/android/repository/tutorial/ConfigurableTutorialRepositoryImpl$fetchTutorials$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,94:1\n1603#2,9:95\n1855#2:104\n1549#2:105\n1620#2,3:106\n1856#2:110\n1612#2:111\n1603#2,9:112\n1855#2:121\n1549#2:122\n1620#2,3:123\n1856#2:127\n1612#2:128\n1549#2:131\n1620#2,3:132\n1#3:109\n1#3:126\n37#4,2:129\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialRepositoryImpl.kt\nco/bird/android/repository/tutorial/ConfigurableTutorialRepositoryImpl$fetchTutorials$1\n*L\n34#1:95,9\n34#1:104\n35#1:105\n35#1:106,3\n34#1:110\n34#1:111\n48#1:112,9\n48#1:121\n49#1:122\n49#1:123,3\n48#1:127\n48#1:128\n57#1:131\n57#1:132,3\n34#1:109\n48#1:126\n52#1:129,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIw0;


# direct methods
.method public constructor <init>(LIw0;)V
    .locals 0

    iput-object p1, p0, LIw0$b;->g:LIw0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireTutorialResponse;)Lio/reactivex/h;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "wireTutorialResponse"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireTutorialResponse;->getTutorials()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0xa

    const/4 v6, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireTutorials;

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getTutorials()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_e

    check-cast v10, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v10, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/android/model/wire/WireTutorial;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getHeader()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_1

    goto :goto_2

    :cond_1
    move v11, v8

    goto :goto_3

    :cond_2
    :goto_2
    move v11, v6

    :goto_3
    if-eqz v11, :cond_3

    const/4 v12, 0x0

    goto :goto_4

    :cond_3
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getHeader()Ljava/lang/String;

    move-result-object v11

    move-object v12, v11

    :goto_4
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getTitle()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_4

    goto :goto_5

    :cond_4
    move v11, v8

    goto :goto_6

    :cond_5
    :goto_5
    move v11, v6

    :goto_6
    if-eqz v11, :cond_6

    const/4 v13, 0x0

    goto :goto_7

    :cond_6
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getTitle()Ljava/lang/String;

    move-result-object v11

    move-object v13, v11

    :goto_7
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getMessage()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_7

    goto :goto_8

    :cond_7
    move v11, v8

    goto :goto_9

    :cond_8
    :goto_8
    move v11, v6

    :goto_9
    if-eqz v11, :cond_9

    const/4 v14, 0x0

    goto :goto_a

    :cond_9
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getMessage()Ljava/lang/String;

    move-result-object v11

    move-object v14, v11

    :goto_a
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getButtonText()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_b

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_a

    goto :goto_b

    :cond_a
    move v11, v8

    goto :goto_c

    :cond_b
    :goto_b
    move v11, v6

    :goto_c
    if-eqz v11, :cond_c

    const/16 v16, 0x0

    goto :goto_d

    :cond_c
    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTutorials;->getButtonText()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v16, v11

    :goto_d
    move-object v11, v9

    move-object v7, v15

    move-object/from16 v15, v16

    invoke-static/range {v10 .. v15}, LOv0;->b(Lco/bird/android/model/wire/WireTutorial;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/persistence/Tutorial;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v15, v7

    goto :goto_1

    :cond_d
    move-object v7, v15

    goto :goto_e

    :cond_e
    const/4 v7, 0x0

    :goto_e
    if-eqz v7, :cond_0

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_f
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lio/reactivex/c;

    iget-object v4, v0, LIw0$b;->g:LIw0;

    invoke-static {v4}, LIw0;->access$getConfigurableTutorialDao$p(LIw0;)LRv0;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireTutorialResponse;->getTutorials()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/wire/WireTutorials;

    if-eqz v9, :cond_11

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireTutorials;->getTutorials()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_11

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/wire/WireTutorial;

    invoke-virtual {v11}, Lco/bird/android/model/wire/WireTutorial;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_11
    const/4 v10, 0x0

    :cond_12
    if-eqz v10, :cond_10

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_13
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    new-array v7, v8, [Ljava/lang/String;

    invoke-interface {v2, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    array-length v7, v2

    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    invoke-virtual {v4, v2}, LRv0;->a([Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v2

    aput-object v2, v3, v8

    iget-object v2, v0, LIw0$b;->g:LIw0;

    invoke-static {v2}, LIw0;->access$getConfigurableTutorialDao$p(LIw0;)LRv0;

    move-result-object v2

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/persistence/Tutorial;

    invoke-static {v5}, LOv0;->i(Lco/bird/android/model/persistence/Tutorial;)Lco/bird/android/model/persistence/TutorialUpdate;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_14
    invoke-virtual {v2, v7}, LRv0;->i(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v2

    aput-object v2, v3, v6

    iget-object v2, v0, LIw0$b;->g:LIw0;

    invoke-static {v2}, LIw0;->access$getConfigurableTutorialDao$p(LIw0;)LRv0;

    move-result-object v2

    invoke-virtual {v2, v1}, LRv0;->h(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v3, v2

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireTutorialResponse;

    invoke-virtual {p0, p1}, LIw0$b;->a(Lco/bird/android/model/wire/WireTutorialResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
