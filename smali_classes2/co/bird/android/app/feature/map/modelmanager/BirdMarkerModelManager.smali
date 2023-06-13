.class public final Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;
.super Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;",
        "Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "",
        "render",
        "Li66;",
        "traceProvider",
        "Li66;",
        "Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;",
        "birdMarkerRenderer",
        "<init>",
        "(Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;Li66;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final traceProvider:Li66;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;Li66;)V
    .locals 1

    const-string v0, "birdMarkerRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "traceProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;-><init>(Lco/bird/android/app/feature/map/ui/MapModelRenderer;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;->traceProvider:Li66;

    return-void
.end method


# virtual methods
.method public render()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;->traceProvider:Li66;

    const-string v1, "bird_markers_rendering"

    invoke-interface {v0, v1}, Li66;->a(Ljava/lang/String;)Lb66;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "count"

    invoke-interface {v0, v2, v1}, Lb66;->b(Ljava/lang/String;Ljava/lang/String;)Lb66;

    const-string v1, "filter_count"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Lb66;->b(Ljava/lang/String;Ljava/lang/String;)Lb66;

    invoke-interface {v0}, Lb66;->start()Lb66;

    invoke-super {p0}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->render()I

    move-result v1

    const-string v2, "drawn_count"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Lb66;->b(Ljava/lang/String;Ljava/lang/String;)Lb66;

    invoke-interface {v0}, Lb66;->stop()V

    return v1
.end method
