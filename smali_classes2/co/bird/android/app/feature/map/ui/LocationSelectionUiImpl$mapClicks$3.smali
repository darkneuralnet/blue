.class final Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->mapClicks()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Lco/bird/android/model/wire/WireLocation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/model/wire/WireLocation;",
        "kotlin.jvm.PlatformType",
        "it",
        "Lcom/google/android/gms/maps/model/LatLng;",
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


# static fields
.field public static final INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;

    invoke-direct {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;-><init>()V

    sput-object v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/wire/WireLocation;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiKt;->access$toLocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;->invoke(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1
.end method
