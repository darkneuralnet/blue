.class public final LFn$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFn;->P1(Ljava/util/List;Landroid/location/Location;)Lco/bird/android/model/ParkingType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/Area;",
        "Lco/bird/android/model/ParkingType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Area;",
        "area",
        "Lco/bird/android/model/ParkingType;",
        "a",
        "(Lco/bird/android/model/persistence/Area;)Lco/bird/android/model/ParkingType;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LFn;

.field public final synthetic h:Landroid/location/Location;


# direct methods
.method public constructor <init>(LFn;Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, LFn$x;->g:LFn;

    iput-object p2, p0, LFn$x;->h:Landroid/location/Location;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/Area;)Lco/bird/android/model/ParkingType;
    .locals 2

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFn$x;->g:LFn;

    iget-object v1, p0, LFn$x;->h:Landroid/location/Location;

    invoke-static {v0, p1, v1}, LFn;->access$contains(LFn;Lco/bird/android/model/persistence/Area;Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getPreferredParking()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/model/ParkingType;->PREFERRED_PARKING:Lco/bird/android/model/ParkingType;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getNoParking()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lco/bird/android/model/ParkingType;->NO_PARKING:Lco/bird/android/model/ParkingType;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/ParkingType;->NONE:Lco/bird/android/model/ParkingType;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Area;

    invoke-virtual {p0, p1}, LFn$x;->a(Lco/bird/android/model/persistence/Area;)Lco/bird/android/model/ParkingType;

    move-result-object p1

    return-object p1
.end method
