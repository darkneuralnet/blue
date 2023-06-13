.class public final LN23$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN23;->a()V
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
        "Lco/bird/android/model/ParkingNestData;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/ParkingNestData;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LN23;


# direct methods
.method public constructor <init>(LN23;)V
    .locals 0

    iput-object p1, p0, LN23$d;->g:LN23;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/ParkingNestData;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/ParkingNestData;

    if-eqz p1, :cond_0

    iget-object v0, p0, LN23$d;->g:LN23;

    invoke-static {v0}, LN23;->access$getNestDetailsUi$p(LN23;)LP23;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/ParkingNest;->getPhotos()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, LP23;->Xc(Ljava/util/List;)V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/ParkingNest;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LP23;->setName(Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/ParkingNest;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LP23;->setAddress(Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/ParkingNest;->getAvailableParkingCapacity()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, LP23;->yh(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getNotes()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LP23;->f5(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LN23$d;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
