.class public final synthetic Lwl6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lxl6;

.field public final synthetic c:Lco/bird/android/model/BirdSummaryBody;

.field public final synthetic d:Lco/bird/android/model/wire/WireBird;

.field public final synthetic e:Lco/bird/android/model/MobilePartner;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Lco/bird/android/model/CommandCenterBody;


# direct methods
.method public synthetic constructor <init>(Lxl6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/MobilePartner;Ljava/util/List;Lco/bird/android/model/CommandCenterBody;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwl6;->b:Lxl6;

    iput-object p2, p0, Lwl6;->c:Lco/bird/android/model/BirdSummaryBody;

    iput-object p3, p0, Lwl6;->d:Lco/bird/android/model/wire/WireBird;

    iput-object p4, p0, Lwl6;->e:Lco/bird/android/model/MobilePartner;

    iput-object p5, p0, Lwl6;->f:Ljava/util/List;

    iput-object p6, p0, Lwl6;->g:Lco/bird/android/model/CommandCenterBody;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lwl6;->b:Lxl6;

    iget-object v1, p0, Lwl6;->c:Lco/bird/android/model/BirdSummaryBody;

    iget-object v2, p0, Lwl6;->d:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p0, Lwl6;->e:Lco/bird/android/model/MobilePartner;

    iget-object v4, p0, Lwl6;->f:Ljava/util/List;

    iget-object v5, p0, Lwl6;->g:Lco/bird/android/model/CommandCenterBody;

    invoke-static/range {v0 .. v5}, Lxl6;->w(Lxl6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/MobilePartner;Ljava/util/List;Lco/bird/android/model/CommandCenterBody;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
