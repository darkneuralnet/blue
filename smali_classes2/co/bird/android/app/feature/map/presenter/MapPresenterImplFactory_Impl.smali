.class public final Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;


# instance fields
.field private final delegateFactory:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;

    return-void
.end method

.method public static create(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory_Impl;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory_Impl;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "*>;",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/model/constant/MapMode;",
            "Z)",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;

    invoke-virtual {v0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->get(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    move-result-object p1

    return-object p1
.end method
