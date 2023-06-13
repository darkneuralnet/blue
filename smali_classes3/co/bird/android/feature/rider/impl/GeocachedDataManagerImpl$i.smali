.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->onCreate(LLifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "strategy",
        "",
        "kotlin.jvm.PlatformType",
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
.field public final synthetic g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "evicting all map cell caches for new strategy "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getSubRegionToServerCells$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->j()V

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getServerCellLastQuery$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->j()V

    return-void
.end method
