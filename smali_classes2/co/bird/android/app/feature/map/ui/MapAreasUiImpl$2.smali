.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "LfM2;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/persistence/Area;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LfM2;",
        "it",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/persistence/Area;",
        "invoke",
        "(LfM2;)Lco/bird/android/buava/Optional;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(LfM2;)Lco/bird/android/buava/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfM2;",
            ")",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Area;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getAreaMarkers$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LfM2;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$2;->invoke(LfM2;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
