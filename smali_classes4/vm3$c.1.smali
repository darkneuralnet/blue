.class public final Lvm3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvm3;->m1(Landroid/location/Location;DLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireBird;",
        "lookupBird",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"
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
        "SMAP\nOperatorManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$fetchOperatorBirdNearby$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,648:1\n37#2,2:649\n26#3:651\n*S KotlinDebug\n*F\n+ 1 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$fetchOperatorBirdNearby$1\n*L\n385#1:649,2\n385#1:651\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lvm3;

.field public final synthetic h:Landroid/location/Location;

.field public final synthetic i:D

.field public final synthetic j:Lco/bird/android/model/constant/OperatorMapKind;

.field public final synthetic k:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

.field public final synthetic l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvm3;Landroid/location/Location;DLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvm3;",
            "Landroid/location/Location;",
            "D",
            "Lco/bird/android/model/constant/OperatorMapKind;",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvm3$c;->g:Lvm3;

    iput-object p2, p0, Lvm3$c;->h:Landroid/location/Location;

    iput-wide p3, p0, Lvm3$c;->i:D

    iput-object p5, p0, Lvm3$c;->j:Lco/bird/android/model/constant/OperatorMapKind;

    iput-object p6, p0, Lvm3$c;->k:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    iput-object p7, p0, Lvm3$c;->l:Ljava/util/List;

    iput-object p8, p0, Lvm3$c;->m:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lio/reactivex/h;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "lookupBird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm3$c;->g:Lvm3;

    invoke-static {v0}, Lvm3;->access$getBirdRepo$p(Lvm3;)LRR;

    move-result-object v1

    iget-object v2, p0, Lvm3$c;->h:Landroid/location/Location;

    iget-wide v3, p0, Lvm3$c;->i:D

    iget-object v5, p0, Lvm3$c;->j:Lco/bird/android/model/constant/OperatorMapKind;

    iget-object v6, p0, Lvm3$c;->k:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    new-instance v0, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 v7, 0x2

    invoke-direct {v0, v7}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    iget-object v7, p0, Lvm3$c;->l:Ljava/util/List;

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    check-cast v7, Ljava/util/Collection;

    new-array v9, v8, [Ljava/lang/String;

    invoke-interface {v7, v9}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/String;

    if-nez v7, :cond_1

    :cond_0
    new-array v7, v8, [Ljava/lang/String;

    :cond_1
    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    iget-object v8, p0, Lvm3$c;->m:Ljava/util/List;

    invoke-interface/range {v1 .. v8}, LRR;->B1(Landroid/location/Location;DLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lvm3$c;->a(Lco/bird/android/buava/Optional;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
