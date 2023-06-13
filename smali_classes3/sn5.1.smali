.class public final synthetic Lsn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ltn5;

.field public final synthetic c:Lco/bird/android/model/constant/ScrapRequestReason;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lco/bird/android/model/VehicleScrapRequest;


# direct methods
.method public synthetic constructor <init>(Ltn5;Lco/bird/android/model/constant/ScrapRequestReason;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/VehicleScrapRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn5;->b:Ltn5;

    iput-object p2, p0, Lsn5;->c:Lco/bird/android/model/constant/ScrapRequestReason;

    iput-object p3, p0, Lsn5;->d:Ljava/util/List;

    iput-object p4, p0, Lsn5;->e:Ljava/lang/String;

    iput-object p5, p0, Lsn5;->f:Lco/bird/android/model/VehicleScrapRequest;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lsn5;->b:Ltn5;

    iget-object v1, p0, Lsn5;->c:Lco/bird/android/model/constant/ScrapRequestReason;

    iget-object v2, p0, Lsn5;->d:Ljava/util/List;

    iget-object v3, p0, Lsn5;->e:Ljava/lang/String;

    iget-object v4, p0, Lsn5;->f:Lco/bird/android/model/VehicleScrapRequest;

    invoke-static {v0, v1, v2, v3, v4}, Ltn5;->b(Ltn5;Lco/bird/android/model/constant/ScrapRequestReason;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/VehicleScrapRequest;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
