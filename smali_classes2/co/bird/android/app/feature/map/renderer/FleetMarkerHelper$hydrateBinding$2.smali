.class final Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->hydrateBinding(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/drawable/Drawable;",
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


# instance fields
.field final synthetic $marker:Lco/bird/android/model/persistence/FleetMarker;

.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/FleetMarker;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;->$marker:Lco/bird/android/model/persistence/FleetMarker;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;->this$0:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;->$marker:Lco/bird/android/model/persistence/FleetMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;->this$0:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-static {v1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->access$getContext$p(Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;->invoke()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
