.class public abstract Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/modelmanager/MapModelManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/modelmanager/MapModelManager<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0008\u0010\u0012\u001a\u00020\u0010H\u0016J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0008\u0010\u0016\u001a\u00020\u0017H\u0014J\u0016\u0010\u0018\u001a\u00020\u00102\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u0007X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;",
        "T",
        "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;",
        "renderer",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer;",
        "(Lco/bird/android/app/feature/map/ui/MapModelRenderer;)V",
        "filters",
        "",
        "Lco/bird/android/app/feature/map/modelmanager/Filter;",
        "getFilters",
        "()Ljava/util/List;",
        "items",
        "getItems",
        "getRenderer",
        "()Lco/bird/android/app/feature/map/ui/MapModelRenderer;",
        "addItems",
        "",
        "",
        "clearItems",
        "removeItem",
        "item",
        "(Ljava/lang/Object;)V",
        "render",
        "",
        "setItems",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbstractModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractModelManager.kt\nco/bird/android/app/feature/map/modelmanager/AbstractModelManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1789#2,3:39\n*S KotlinDebug\n*F\n+ 1 AbstractModelManager.kt\nco/bird/android/app/feature/map/modelmanager/AbstractModelManager\n*L\n33#1:39,3\n*E\n"
    }
.end annotation


# instance fields
.field private final filters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/modelmanager/Filter<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final renderer:Lco/bird/android/app/feature/map/ui/MapModelRenderer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/ui/MapModelRenderer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapModelRenderer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/ui/MapModelRenderer<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->renderer:Lco/bird/android/app/feature/map/ui/MapModelRenderer;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->filters:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->render()I

    return-void
.end method

.method public clearItems()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->render()I

    return-void
.end method

.method public final getFilters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/modelmanager/Filter<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->filters:Ljava/util/List;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getRenderer()Lco/bird/android/app/feature/map/ui/MapModelRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/app/feature/map/ui/MapModelRenderer<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->renderer:Lco/bird/android/app/feature/map/ui/MapModelRenderer;

    return-object v0
.end method

.method public removeItem(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->render()I

    return-void
.end method

.method public render()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->filters:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<T of co.bird.android.app.feature.map.modelmanager.AbstractModelManager>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/app/feature/map/modelmanager/Filter;

    invoke-interface {v2, v1}, Lco/bird/android/app/feature/map/modelmanager/Filter;->apply(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->renderer:Lco/bird/android/app/feature/map/ui/MapModelRenderer;

    invoke-interface {v0, v1}, Lco/bird/android/app/feature/map/ui/MapModelRenderer;->render(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->addItems(Ljava/util/List;)V

    return-void
.end method
