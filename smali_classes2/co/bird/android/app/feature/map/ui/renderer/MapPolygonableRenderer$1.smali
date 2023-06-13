.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;-><init>(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Pair<",
        "+",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "+",
        "Ljava/lang/Float;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "invoke",
        "(Lkotlin/Unit;)Lkotlin/Pair;"
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;->invoke(Lkotlin/Unit;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lkotlin/Pair<",
            "Lcom/google/android/gms/maps/model/VisibleRegion;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getMap$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)LcD1;

    move-result-object p1

    invoke-virtual {p1}, LcD1;->k()LU74;

    move-result-object p1

    invoke-virtual {p1}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getMap$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)LcD1;

    move-result-object v0

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
