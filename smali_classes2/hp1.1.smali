.class public final synthetic Lhp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

.field public final synthetic d:Los6;

.field public final synthetic e:Lco/bird/android/model/persistence/FleetMarker;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Los6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp1;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lhp1;->c:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    iput-object p3, p0, Lhp1;->d:Los6;

    iput-object p4, p0, Lhp1;->e:Lco/bird/android/model/persistence/FleetMarker;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lhp1;->b:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lhp1;->c:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    iget-object v2, p0, Lhp1;->d:Los6;

    iget-object v3, p0, Lhp1;->e:Lco/bird/android/model/persistence/FleetMarker;

    invoke-static {v0, v1, v2, v3}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->b(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Los6;Lco/bird/android/model/persistence/FleetMarker;)V

    return-void
.end method
