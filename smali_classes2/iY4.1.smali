.class public final synthetic LiY4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lco/bird/android/model/wire/WireRideDetail;

.field public final synthetic e:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(Li25;Ljava/util/List;Lco/bird/android/model/wire/WireRideDetail;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiY4;->b:Li25;

    iput-object p2, p0, LiY4;->c:Ljava/util/List;

    iput-object p3, p0, LiY4;->d:Lco/bird/android/model/wire/WireRideDetail;

    iput-object p4, p0, LiY4;->e:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LiY4;->b:Li25;

    iget-object v1, p0, LiY4;->c:Ljava/util/List;

    iget-object v2, p0, LiY4;->d:Lco/bird/android/model/wire/WireRideDetail;

    iget-object v3, p0, LiY4;->e:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1, v2, v3}, Li25;->v0(Li25;Ljava/util/List;Lco/bird/android/model/wire/WireRideDetail;Lco/bird/android/model/wire/WireBird;)V

    return-void
.end method
