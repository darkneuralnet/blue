.class public final synthetic LUy6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

.field public final synthetic c:Lps6;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;Lps6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUy6;->b:Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    iput-object p2, p0, LUy6;->c:Lps6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LUy6;->b:Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    iget-object v1, p0, LUy6;->c:Lps6;

    invoke-static {v0, v1}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->t(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;Lps6;)V

    return-void
.end method
