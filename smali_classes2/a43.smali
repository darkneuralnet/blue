.class public final synthetic La43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

.field public final synthetic c:Lks6;

.field public final synthetic d:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lks6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La43;->b:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    iput-object p2, p0, La43;->c:Lks6;

    iput-object p3, p0, La43;->d:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, La43;->b:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    iget-object v1, p0, La43;->c:Lks6;

    iget-object v2, p0, La43;->d:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-static {v0, v1, v2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->t(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lks6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    return-void
.end method
