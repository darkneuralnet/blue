.class final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$zoneColorConfig$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;-><init>(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$zoneColorConfig$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$zoneColorConfig$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getReactiveConfig$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getZoneColorOverride()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$zoneColorConfig$2;->invoke()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move-result-object v0

    return-object v0
.end method
