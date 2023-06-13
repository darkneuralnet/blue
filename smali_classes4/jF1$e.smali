.class public LjF1$e;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjF1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LjF1;


# direct methods
.method public constructor <init>(LjF1;LEb5;)V
    .locals 0

    iput-object p1, p0, LjF1$e;->d:LjF1;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `unidentified_scan_hard_count` (`id`,`hard_count_id`,`scan_identifier`,`scan_error_code`) VALUES (nullif(?, 0),?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/UnidentifiedScanEntity;

    invoke-virtual {p0, p1, p2}, LjF1$e;->p(LqV5;Lco/bird/android/model/persistence/UnidentifiedScanEntity;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/UnidentifiedScanEntity;)V
    .locals 3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getHardCountId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getHardCountId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getScanIdentifier()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getScanIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    sget-object v0, LhF1;->a:LhF1;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getScanErrorCode()Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object p2

    invoke-static {p2}, LhF1;->b(Lco/bird/android/model/constant/InventoryScanningError;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x4

    if-nez p2, :cond_2

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    return-void
.end method
