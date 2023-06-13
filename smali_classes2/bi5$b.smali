.class public final Lbi5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi5;->S6()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Ljava/util/ArrayList<",
        "Lco/bird/android/model/BirdInspectionPoint;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a,\u0012\u0004\u0012\u00020\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0002j\u0008\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "it",
        "Ljava/util/ArrayList;",
        "Lco/bird/android/model/BirdInspectionPoint;",
        "Lkotlin/collections/ArrayList;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Unit;)Ljava/util/ArrayList;"
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
        "SMAP\nSafetyInspectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafetyInspectionUi.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionUiImpl$startRepairClicks$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,139:1\n215#2,2:140\n*S KotlinDebug\n*F\n+ 1 SafetyInspectionUi.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionUiImpl$startRepairClicks$1\n*L\n102#1:140,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lbi5;


# direct methods
.method public constructor <init>(Lbi5;)V
    .locals 0

    iput-object p1, p0, Lbi5$b;->g:Lbi5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Ljava/util/ArrayList<",
            "Lco/bird/android/model/BirdInspectionPoint;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbi5$b;->g:Lbi5;

    invoke-static {p1}, Lbi5;->access$getAreaToInspectionAreaViewMap$p(Lbi5;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lbi5$b;->g:Lbi5;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {v0}, Lbi5;->access$getCheckedInspectionPointList$p(Lbi5;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-virtual {v1}, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lbi5$b;->g:Lbi5;

    invoke-static {v0}, Lbi5;->access$getCheckedInspectionPointList$p(Lbi5;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lbi5$b;->a(Lkotlin/Unit;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
