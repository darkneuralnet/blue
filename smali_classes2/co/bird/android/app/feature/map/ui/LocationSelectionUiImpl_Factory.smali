.class public final Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final locationManagerProvider:LY94;
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

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;->locationManagerProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;)",
            "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Lco/bird/android/core/mvp/BaseActivity;LHx5;Ldr4;)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LHx5;Ldr4;)V

    return-object v0
.end method


# virtual methods
.method public get(Lco/bird/android/core/mvp/BaseActivity;LHx5;)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;->locationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, p2, v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl_Factory;->newInstance(Lco/bird/android/core/mvp/BaseActivity;LHx5;Ldr4;)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;

    move-result-object p1

    return-object p1
.end method
