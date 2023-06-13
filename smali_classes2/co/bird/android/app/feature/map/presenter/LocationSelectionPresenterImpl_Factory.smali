.class public final Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final reactiveLocationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;->reactiveLocationManagerProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;)",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Ldr4;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;
    .locals 9

    new-instance v8, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;-><init>(Ldr4;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)V

    return-object v8
.end method


# virtual methods
.method public get(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;
    .locals 8

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;->reactiveLocationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ldr4;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-static/range {v1 .. v7}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;->newInstance(Ldr4;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    move-result-object p1

    return-object p1
.end method
