.class final Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;LTq4;Lio/reactivex/Observable;)V
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/Float;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012Z\u0010\u0002\u001aV\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007 \u0006**\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "",
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
        "SMAP\nMerchantSiteModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1855#2,2:74\n*S KotlinDebug\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1\n*L\n42#1:74,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;->this$0:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "merchantSites"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;->this$0:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lco/bird/android/model/wire/WireMerchantSite;

    new-instance v3, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-static {v6, v4}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItemKt;->markerId(Lco/bird/android/model/wire/WireMerchantSite;Ljava/lang/Float;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->access$getReactiveConfig$p(Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;)LTq4;

    move-result-object v4

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getBirdPayConfig()Lco/bird/android/model/wire/configs/BirdPayConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/BirdPayConfig;->getMerchantPinSize()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    goto :goto_1

    :cond_0
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    :goto_1
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-static {v4}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItemKt;->pinVisibility(Ljava/lang/Float;)Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;

    move-result-object v9

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;->this$0:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

    invoke-static {p1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->access$getMerchantSiteRenderer$p(Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;)Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;

    move-result-object p1

    invoke-virtual {p1, v1}, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;->render(Ljava/util/List;)V

    :cond_2
    return-void
.end method
