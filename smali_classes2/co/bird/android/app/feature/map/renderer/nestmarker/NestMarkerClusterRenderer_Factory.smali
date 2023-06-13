.class public final Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


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

.field private final reactiveConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;->contextProvider:LY94;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;->reactiveConfigProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;

    invoke-direct {v0, p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(LGl0;LcD1;Landroid/content/Context;LTq4;)Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
            ">;",
            "LcD1;",
            "Landroid/content/Context;",
            "LTq4;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    invoke-direct {v0, p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;-><init>(LGl0;LcD1;Landroid/content/Context;LTq4;)V

    return-object v0
.end method


# virtual methods
.method public get(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
            ">;",
            "LcD1;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;->reactiveConfigProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    invoke-static {p1, p2, v0, v1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer_Factory;->newInstance(LGl0;LcD1;Landroid/content/Context;LTq4;)Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    move-result-object p1

    return-object p1
.end method
