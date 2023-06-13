.class final Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/B<",
        "+",
        "Ljava/lang/Float;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "enabled",
        "Lio/reactivex/B;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)Lio/reactivex/B;",
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
.field final synthetic $reactiveConfig:LTq4;

.field final synthetic $reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;->$reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;->$reactiveConfig:LTq4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;->invoke$lambda$0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Boolean;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;->$reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraMoves()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;->$reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->d8()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1$1;->INSTANCE:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1$1;

    new-instance v2, Lco/bird/android/app/feature/map/cluster/nestmarker/a;

    invoke-direct {v2, v1}, Lco/bird/android/app/feature/map/cluster/nestmarker/a;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {p1, v0, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;->invoke(Ljava/lang/Boolean;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
