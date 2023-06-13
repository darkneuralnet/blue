.class public final LUs$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUs;->y(LYs;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/api/response/ReloadConfigResponse;",
        ">;+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "LDs;",
        ">;>;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Balance;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u000c\u001a\u00020\t2\u009b\u0001\u0010\u0008\u001a\u0096\u0001\u0012*\u0012(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u0002 \u0005*J\u0012*\u0012(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lkotlin/Triple;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "",
        "kotlin.jvm.PlatformType",
        "LDs;",
        "Lco/bird/android/model/Balance;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
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
        "SMAP\nAutoReloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter$consume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1559#2:202\n1590#2,4:203\n1#3:207\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter$consume$5\n*L\n70#1:202\n70#1:203,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LUs;


# direct methods
.method public constructor <init>(LUs;)V
    .locals 0

    iput-object p1, p0, LUs$i;->g:LUs;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LUs$i;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/buava/Optional<",
            "LDs;",
            ">;>;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Balance;",
            ">;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Triple;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lco/bird/api/response/ReloadConfigResponse;->getCurrency()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    :cond_0
    iget-object v5, v0, LUs$i;->g:LUs;

    invoke-static {v5}, LUs;->access$getReactiveConfig$p(LUs;)LTq4;

    move-result-object v5

    invoke-virtual {v5}, LTq4;->f8()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v5

    :cond_1
    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lco/bird/api/response/AutoReloadConfig;->getCurrentOption()Lco/bird/api/response/ReloadOption;

    move-result-object v6

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDs;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LDs;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lco/bird/api/response/AutoReloadConfig;->getOptions()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    :cond_5
    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v3, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v9, 0x0

    move v10, v9

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v10, 0x1

    if-gez v10, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_6
    move-object v13, v11

    check-cast v13, Lco/bird/api/response/ReloadOption;

    invoke-virtual {v13}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_7

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "_autoreload_option_id_client_provided_"

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x3e

    const/16 v22, 0x0

    invoke-static/range {v13 .. v22}, Lco/bird/api/response/ReloadOption;->copy$default(Lco/bird/api/response/ReloadOption;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)Lco/bird/api/response/ReloadOption;

    move-result-object v13

    :cond_7
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v10, v12

    goto :goto_2

    :cond_8
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v3, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_9
    const/4 v8, 0x0

    :goto_3
    if-eqz v8, :cond_b

    if-eqz v6, :cond_a

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v6}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_6

    :cond_b
    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lco/bird/api/response/ReloadOption;->getAmount()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_4

    :cond_c
    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_d

    invoke-virtual {v6}, Lco/bird/api/response/ReloadOption;->getAmount()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v8, v10, v12

    if-lez v8, :cond_d

    const-string v9, "[auto_pay_plan_in_auto_reload_v2]"

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3e

    const/16 v17, 0x0

    move-object v8, v6

    invoke-static/range {v8 .. v17}, Lco/bird/api/response/ReloadOption;->copy$default(Lco/bird/api/response/ReloadOption;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)Lco/bird/api/response/ReloadOption;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v8, v0, LUs$i;->g:LUs;

    invoke-virtual {v2}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, LUs;->access$setOptionIdSelected$p(LUs;Ljava/lang/String;)V

    invoke-virtual {v2}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_d
    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/Balance;

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    if-lez v8, :cond_e

    const/4 v9, 0x1

    :cond_e
    if-eqz v9, :cond_f

    goto :goto_5

    :cond_f
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_10

    iget-object v8, v0, LUs$i;->g:LUs;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v15, Lco/bird/api/response/ReloadOption;

    const-string v10, "[auto_pay_plan_in_auto_reload_v2]"

    int-to-long v11, v2

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    move-object v9, v15

    move-object v7, v15

    move-object v15, v2

    invoke-direct/range {v9 .. v16}, Lco/bird/api/response/ReloadOption;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v2, "[auto_pay_plan_in_auto_reload_v2]"

    invoke-static {v8, v2}, LUs;->access$setOptionIdSelected$p(LUs;Ljava/lang/String;)V

    goto :goto_6

    :cond_10
    const/4 v2, 0x0

    :goto_6
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    if-nez v1, :cond_15

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_11
    const/4 v1, 0x0

    :goto_7
    if-nez v1, :cond_15

    if-nez v2, :cond_14

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/ReloadOption;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_8

    :cond_12
    const/4 v7, 0x0

    :goto_8
    if-nez v7, :cond_13

    const-string v1, ""

    goto :goto_9

    :cond_13
    move-object v1, v7

    goto :goto_9

    :cond_14
    move-object v1, v2

    :cond_15
    :goto_9
    iget-object v2, v0, LUs$i;->g:LUs;

    new-instance v6, Lzs;

    const-string v7, "includeAutoReloadOptions"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-direct {v6, v4, v5, v3, v1}, Lzs;-><init>(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method
