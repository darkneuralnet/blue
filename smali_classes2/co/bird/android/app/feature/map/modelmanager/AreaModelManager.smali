.class public final Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/modelmanager/MapModelManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/modelmanager/MapModelManager<",
        "Lco/bird/android/model/persistence/Area;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0016\u0010\n\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0008\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;",
        "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;",
        "Lco/bird/android/model/persistence/Area;",
        "",
        "previousAreasCount",
        "",
        "render",
        "",
        "items",
        "addItems",
        "setItems",
        "item",
        "removeItem",
        "clearItems",
        "Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;",
        "areaRenderer",
        "Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;",
        "Li66;",
        "traceProvider",
        "Li66;",
        "",
        "areas",
        "Ljava/util/List;",
        "<init>",
        "(Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;Li66;)V",
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
.field private final areaRenderer:Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;

.field private final areas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;"
        }
    .end annotation
.end field

.field private final traceProvider:Li66;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;Li66;)V
    .locals 1

    const-string v0, "areaRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "traceProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areaRenderer:Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;

    iput-object p2, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->traceProvider:Li66;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    return-void
.end method

.method private final render(I)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->traceProvider:Li66;

    const-string v1, "areas_rendering"

    invoke-interface {v0, v1}, Li66;->a(Ljava/lang/String;)Lb66;

    move-result-object v0

    const-string v1, "previous_areas_drawn"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lb66;->b(Ljava/lang/String;Ljava/lang/String;)Lb66;

    iget-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "new_areas_drawn"

    invoke-interface {v0, v1, p1}, Lb66;->b(Ljava/lang/String;Ljava/lang/String;)Lb66;

    invoke-interface {v0}, Lb66;->start()Lb66;

    iget-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areaRenderer:Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-virtual {p1, v1}, Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;->render(Ljava/util/List;)V

    invoke-interface {v0}, Lb66;->stop()V

    return-void
.end method


# virtual methods
.method public addItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->render(I)V

    return-void
.end method

.method public clearItems()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->render(I)V

    return-void
.end method

.method public removeItem(Lco/bird/android/model/persistence/Area;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->render(I)V

    return-void
.end method

.method public bridge synthetic removeItem(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Area;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->removeItem(Lco/bird/android/model/persistence/Area;)V

    return-void
.end method

.method public setItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->areas:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->render(I)V

    return-void
.end method
