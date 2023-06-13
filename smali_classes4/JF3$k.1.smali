.class public final LJF3$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;->S(Ljava/util/List;Landroid/location/Location;Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/ParkingNest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Landroid/location/Location;

.field public final synthetic h:Lco/bird/android/model/ParkingNest;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Landroid/location/Location;Lco/bird/android/model/ParkingNest;I)V
    .locals 0

    iput-object p1, p0, LJF3$k;->g:Landroid/location/Location;

    iput-object p2, p0, LJF3$k;->h:Lco/bird/android/model/ParkingNest;

    iput p3, p0, LJF3$k;->i:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 4

    sget-object v0, LYw2;->a:LYw2;

    iget-object v1, p0, LJF3$k;->g:Landroid/location/Location;

    iget-object v2, p0, LJF3$k;->h:Lco/bird/android/model/ParkingNest;

    invoke-virtual {v2}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYw2;->d(Landroid/location/Location;Lco/bird/android/model/wire/WireLocation;)F

    move-result v0

    float-to-double v0, v0

    iget-object v2, p0, LJF3$k;->h:Lco/bird/android/model/ParkingNest;

    invoke-virtual {v2}, Lco/bird/android/model/ParkingNest;->getRadius()D

    move-result-wide v2

    sub-double/2addr v0, v2

    iget v2, p0, LJF3$k;->i:I

    int-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJF3$k;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
