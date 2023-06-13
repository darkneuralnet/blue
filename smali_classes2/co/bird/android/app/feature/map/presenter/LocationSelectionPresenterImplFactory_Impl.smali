.class public final Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;


# instance fields
.field private final delegateFactory:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;

    return-void
.end method

.method public static create(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory_Impl;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory_Impl;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;
    .locals 7

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl_Factory;->get(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    move-result-object p1

    return-object p1
.end method
