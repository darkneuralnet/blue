.class final Lco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapUiImpl;->showTeleportMarker(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LfM2;",
        "Lco/bird/android/model/wire/WireLocation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LfM2;",
        "marker",
        "Lco/bird/android/model/wire/WireLocation;",
        "invoke",
        "(LfM2;)Lco/bird/android/model/wire/WireLocation;",
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
        "SMAP\nMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUi.kt\nco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n1#2:539\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(LfM2;)Lco/bird/android/model/wire/WireLocation;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "marker"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual/range {p1 .. p1}, LfM2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v3, v2, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-virtual/range {p1 .. p1}, LfM2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v5, v2, Lcom/google/android/gms/maps/model/LatLng;->c:D

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x1fc

    const/4 v15, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v15}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, p0

    iget-object v3, v2, Lco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->access$getTeleportMarker$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)LfM2;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LfM2;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1;->invoke(LfM2;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1
.end method
