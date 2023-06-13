.class public final synthetic LUD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/WorkOrder;

.field public final synthetic c:LVD6;

.field public final synthetic d:Lco/bird/android/model/constant/BirdModel;

.field public final synthetic e:Lco/bird/android/model/constant/ServiceCenterRoute;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/WorkOrder;LVD6;Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/constant/ServiceCenterRoute;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUD6;->b:Lco/bird/android/model/WorkOrder;

    iput-object p2, p0, LUD6;->c:LVD6;

    iput-object p3, p0, LUD6;->d:Lco/bird/android/model/constant/BirdModel;

    iput-object p4, p0, LUD6;->e:Lco/bird/android/model/constant/ServiceCenterRoute;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LUD6;->b:Lco/bird/android/model/WorkOrder;

    iget-object v1, p0, LUD6;->c:LVD6;

    iget-object v2, p0, LUD6;->d:Lco/bird/android/model/constant/BirdModel;

    iget-object v3, p0, LUD6;->e:Lco/bird/android/model/constant/ServiceCenterRoute;

    invoke-static {v0, v1, v2, v3}, LVD6;->b(Lco/bird/android/model/WorkOrder;LVD6;Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/constant/ServiceCenterRoute;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
