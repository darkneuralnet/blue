.class public final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        "T3:",
        "Ljava/lang/Object;",
        "T4:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/i<",
        "TT1;TT2;TT3;TT4;TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0010\u000c\u001a\u00028\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000\"\u0008\u0008\u0002\u0010\u0003*\u00020\u0000\"\u0008\u0008\u0003\u0010\u0004*\u00020\u0000\"\u0008\u0008\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "",
        "T1",
        "T2",
        "T3",
        "T4",
        "R",
        "t1",
        "t2",
        "t3",
        "t4",
        "apply",
        "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
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
        "SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl\n*L\n1#1,304:1\n541#2,10:305\n561#2,6:315\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT1;TT2;TT3;TT4;)TR;"
        }
    .end annotation

    check-cast p4, Lco/bird/android/buava/Optional;

    check-cast p3, Ljava/lang/Integer;

    check-cast p2, Lco/bird/android/model/filter/KeyBasedAreasFilter;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getMapMode$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    invoke-virtual {p4}, Lco/bird/android/buava/Optional;->c()Z

    move-result p3

    if-nez p3, :cond_0

    iget-object p3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {p3}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getReactiveConfig$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)LTq4;

    move-result-object p3

    invoke-virtual {p3}, LTq4;->f8()LZ84;

    move-result-object p3

    invoke-virtual {p3}, LZ84;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object p3

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getRiderShowAreasBeforeSelectingVehicle()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p1, "not showing areas due to active ride count = 0 && no focused bird present"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-virtual {p4}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lco/bird/android/model/wire/WireBird;

    if-eqz p3, :cond_2

    iget-object p4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {p4, p3}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getAreaFilterForParkingCalculationIfEnabled(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/filter/KeyBasedAreasFilter;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, p3

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "filtering "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " areas in rider map mode"

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p3, p4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p3, "filter"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lio;->a(Ljava/util/List;Lco/bird/android/model/filter/KeyBasedAreasFilter;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->getInvertedOperationalAreaPlaceholder()Lco/bird/android/model/persistence/Area;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    :cond_3
    :goto_1
    return-object p1
.end method
