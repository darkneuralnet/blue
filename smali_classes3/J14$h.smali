.class public final LJ14$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14;->F(LK14;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LJ14$b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LJ14$b;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LJ14$b;)V"
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
        "SMAP\nPreloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1559#2:490\n1590#2,4:491\n1#3:495\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4\n*L\n129#1:490\n129#1:491,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJ14;

.field public final synthetic h:LK14;


# direct methods
.method public constructor <init>(LJ14;LK14;)V
    .locals 0

    iput-object p1, p0, LJ14$h;->g:LJ14;

    iput-object p2, p0, LJ14$h;->h:LK14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final b(Lkotlin/Lazy;)Lco/bird/api/response/ReloadOption;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Lco/bird/api/response/ReloadOption;",
            ">;)",
            "Lco/bird/api/response/ReloadOption;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/ReloadOption;

    return-object p0
.end method


# virtual methods
.method public final a(LJ14$b;)V
    .locals 24

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, LJ14$b;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LJ14$b;->b()Z

    move-result v5

    invoke-virtual/range {p1 .. p1}, LJ14$b;->c()Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LJ14$b;->d()Z

    move-result v6

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/api/response/ReloadConfigResponse;->getCurrency()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    iget-object v3, v0, LJ14$h;->g:LJ14;

    invoke-static {v3}, LJ14;->access$getReactiveConfig$p(LJ14;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v4, :cond_11

    invoke-virtual {v4}, Lco/bird/api/response/ReloadConfigResponse;->getPreload()Lco/bird/api/response/PreloadConfig;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-virtual {v4}, Lco/bird/api/response/PreloadConfig;->getOptions()Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_2

    goto/16 :goto_7

    :cond_2
    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-gez v9, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    move-object v12, v10

    check-cast v12, Lco/bird/api/response/ReloadOption;

    invoke-virtual {v12}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "_preload_option_id_client_provided_"

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x3e

    const/16 v21, 0x0

    invoke-static/range {v12 .. v21}, Lco/bird/api/response/ReloadOption;->copy$default(Lco/bird/api/response/ReloadOption;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)Lco/bird/api/response/ReloadOption;

    move-result-object v12

    :cond_4
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v11

    goto :goto_0

    :cond_5
    iget-object v4, v0, LJ14$h;->h:LK14;

    invoke-interface {v4}, LK14;->U7()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v9, v0, LJ14$h;->g:LJ14;

    invoke-static {v9}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v9

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v9, v4}, Lgl;->x2(Z)V

    :cond_6
    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LS04;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, LS04;->f()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v9, v0, LJ14$h;->g:LJ14;

    invoke-static {v9}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v9

    invoke-virtual {v9, v4}, Lgl;->A2(Ljava/lang/String;)V

    :cond_7
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    new-instance v9, LJ14$h$a;

    iget-object v10, v0, LJ14$h;->g:LJ14;

    invoke-direct {v9, v10, v7, v4}, LJ14$h$a;-><init>(LJ14;Ljava/util/List;I)V

    invoke-static {v9}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v9

    iget-object v10, v0, LJ14$h;->g:LJ14;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->c()Z

    move-result v11

    if-eqz v11, :cond_8

    move-object v11, v2

    goto :goto_1

    :cond_8
    const/4 v11, 0x0

    :goto_1
    if-nez v11, :cond_a

    sget-object v11, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v15, LS04;

    invoke-static {v9}, LJ14$h;->b(Lkotlin/Lazy;)Lco/bird/api/response/ReloadOption;

    move-result-object v13

    invoke-virtual {v13}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_9

    const-string v13, ""

    :cond_9
    move-object v14, v13

    invoke-static {v9}, LJ14$h;->b(Lkotlin/Lazy;)Lco/bird/api/response/ReloadOption;

    move-result-object v13

    invoke-virtual {v13}, Lco/bird/api/response/ReloadOption;->getAmount()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    sget-object v17, Lxx1;->a:Lxx1;

    invoke-static {v9}, LJ14$h;->b(Lkotlin/Lazy;)Lco/bird/api/response/ReloadOption;

    move-result-object v9

    invoke-virtual {v9}, Lco/bird/api/response/ReloadOption;->getAmount()J

    move-result-wide v18

    invoke-static {v3}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v20

    const/16 v21, 0x0

    const/16 v22, 0x4

    const/16 v23, 0x0

    invoke-static/range {v17 .. v23}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x68

    const/16 v22, 0x0

    move-object v13, v15

    move-object v12, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v9

    invoke-direct/range {v13 .. v22}, LS04;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v11, v12}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v11

    :cond_a
    invoke-static {v10, v11}, LJ14;->access$setCurrentOptionModelSelected$p(LJ14;Lco/bird/android/buava/Optional;)V

    iget-object v9, v0, LJ14$h;->g:LJ14;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_b

    iget-object v10, v0, LJ14$h;->g:LJ14;

    invoke-static {v10}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v10

    invoke-virtual {v10}, Lgl;->n0()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_c

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/api/response/ReloadOption;

    invoke-virtual {v10}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_2

    :cond_b
    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LS04;

    invoke-virtual {v10}, LS04;->f()Ljava/lang/String;

    move-result-object v10

    :cond_c
    :goto_2
    invoke-static {v9, v10}, LJ14;->access$setOptionIdSelected$p(LJ14;Ljava/lang/String;)V

    iget-object v9, v0, LJ14$h;->g:LJ14;

    invoke-static {v9}, LJ14;->access$getOptionIdSelected$p(LJ14;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "preload optionIdSelected: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v9, v10}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "preload optionModelSelectedOptional: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v2, v9}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/ReloadOption;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_d
    const/4 v2, 0x0

    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "preload reloadOptions[midIndex]?.id: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v0, LJ14$h;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->m0()Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_f

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReloadFromPreload()Lco/bird/api/response/AutoReloadFromPreloadConfig;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lco/bird/api/response/AutoReloadFromPreloadConfig;->getDefault()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_4

    :cond_e
    const/4 v9, 0x0

    goto :goto_5

    :cond_f
    :goto_4
    move-object v9, v2

    :goto_5
    iget-object v2, v0, LJ14$h;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->m0()Ljava/lang/Boolean;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "preload preference auto reload mandatory: "

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReloadFromPreload()Lco/bird/api/response/AutoReloadFromPreloadConfig;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lco/bird/api/response/AutoReloadFromPreloadConfig;->getDefault()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_6

    :cond_10
    const/4 v12, 0x0

    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "preload autoReloadFromPreload?.default: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v8, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "preload resolved autoReloadMandatory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v8, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Li04;

    iget-object v2, v0, LJ14$h;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getOptionIdSelected$p(LJ14;)Ljava/lang/String;

    move-result-object v8

    move-object v2, v1

    move-object v4, v7

    move-object v7, v9

    invoke-direct/range {v2 .. v8}, Li04;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)V

    iget-object v2, v0, LJ14$h;->g:LJ14;

    invoke-static {v2, v1}, LJ14;->access$setLatestPreloadOptionsAvailable$p(LJ14;Li04;)V

    iget-object v2, v0, LJ14$h;->h:LK14;

    invoke-interface {v2, v1}, Lrx4;->render(Ljava/lang/Object;)V

    :cond_11
    :goto_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ14$b;

    invoke-virtual {p0, p1}, LJ14$h;->a(LJ14$b;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
