.class public Lj40$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj40;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/BulkScanPurposeBird;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lj40;


# direct methods
.method public constructor <init>(Lj40;LEb5;)V
    .locals 0

    iput-object p1, p0, Lj40$a;->d:Lj40;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `bulk_scan_purpose_bird` (`bird_id`,`purpose`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/BulkScanPurposeBird;

    invoke-virtual {p0, p1, p2}, Lj40$a;->p(LqV5;Lco/bird/android/model/persistence/BulkScanPurposeBird;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/BulkScanPurposeBird;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BulkScanPurposeBird;->getBirdId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BulkScanPurposeBird;->getBirdId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BulkScanPurposeBird;->getPurpose()Lco/bird/android/model/constant/BulkScanPurpose;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lj40$a;->d:Lj40;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BulkScanPurposeBird;->getPurpose()Lco/bird/android/model/constant/BulkScanPurpose;

    move-result-object p2

    invoke-static {v0, p2}, Lj40;->h(Lj40;Lco/bird/android/model/constant/BulkScanPurpose;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
