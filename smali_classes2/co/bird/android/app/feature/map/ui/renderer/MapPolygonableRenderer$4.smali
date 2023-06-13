.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;-><init>(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V
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
        "Lco/bird/android/model/Polygonable;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Polygonable;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/Polygonable;",
        "kotlin.jvm.PlatformType",
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
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1855#2:519\n1856#2:521\n1855#2,2:522\n1#3:520\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4\n*L\n240#1:519\n240#1:521\n246#1:522,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            ">;+",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const-string v1, "polygonablesToAdd"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/Polygonable;

    invoke-static {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v3

    invoke-virtual {v3, v2}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    if-nez v3, :cond_0

    new-instance v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-direct {v3, v1, v2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/model/Polygonable;)V

    invoke-static {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->putIfAbsent(Lco/bird/android/model/Polygonable;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->addToMap()V

    goto :goto_0

    :cond_1
    const-string v0, "polygonablesToRemove"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Polygonable;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->removeFromMap()V

    goto :goto_1

    :cond_3
    return-void
.end method
