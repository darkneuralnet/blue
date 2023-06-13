.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
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
.field final synthetic $activity:Lco/bird/android/core/mvp/BaseActivity;

.field final synthetic $reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->$reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->$activity:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;
    .locals 7

    new-instance v6, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getMap$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LcD1;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->$reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->$activity:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getMapConfig(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getLocationManager$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ldr4;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;-><init>(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V

    return-object v6
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;->invoke()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    move-result-object v0

    return-object v0
.end method
