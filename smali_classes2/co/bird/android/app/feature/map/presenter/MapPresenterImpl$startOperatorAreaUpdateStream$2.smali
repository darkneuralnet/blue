.class final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Landroid/location/Location;",
        "+",
        "Ljava/lang/Double;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\u0010\t\u001ab\u0012*\u0008\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00000\u0000 \u0006*0\u0012*\u0008\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/B;",
        "Landroid/location/Location;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/B;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Landroid/location/Location;",
            "Ljava/lang/Double;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getAreaManager$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lbn;

    move-result-object p1

    invoke-interface {p1}, Lbn;->I()Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2$1;

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2$1;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v1, Lco/bird/android/app/feature/map/presenter/c;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/presenter/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$legacyAreaRefreshObservable(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->invoke(Lkotlin/Pair;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
