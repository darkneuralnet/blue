.class public final Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;->contextProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;)Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public get()Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;->newInstance(Landroid/content/Context;)Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider_Factory;->get()Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    move-result-object v0

    return-object v0
.end method