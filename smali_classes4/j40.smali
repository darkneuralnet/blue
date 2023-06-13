.class public final Lj40;
.super Li40;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/BulkScanPurposeBird;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Li40;-><init>()V

    iput-object p1, p0, Lj40;->a:LEb5;

    new-instance v0, Lj40$a;

    invoke-direct {v0, p0, p1}, Lj40$a;-><init>(Lj40;LEb5;)V

    iput-object v0, p0, Lj40;->b:Lcf1;

    new-instance v0, Lj40$b;

    invoke-direct {v0, p0, p1}, Lj40$b;-><init>(Lj40;LEb5;)V

    iput-object v0, p0, Lj40;->c:Lgz5;

    new-instance v0, Lj40$c;

    invoke-direct {v0, p0, p1}, Lj40$c;-><init>(Lj40;LEb5;)V

    iput-object v0, p0, Lj40;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic e(Lj40;)LEb5;
    .locals 0

    iget-object p0, p0, Lj40;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(Lj40;)Lcf1;
    .locals 0

    iget-object p0, p0, Lj40;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic g(Lj40;)Lgz5;
    .locals 0

    iget-object p0, p0, Lj40;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic h(Lj40;Lco/bird/android/model/constant/BulkScanPurpose;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lj40;->i(Lco/bird/android/model/constant/BulkScanPurpose;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lj40$e;

    invoke-direct {v0, p0}, Lj40$e;-><init>(Lj40;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public varargs b([Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lj40$g;

    invoke-direct {v0, p0, p1}, Lj40$g;-><init>(Lj40;[Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Lco/bird/android/model/persistence/BulkScanPurposeBird;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lj40$d;

    invoke-direct {v0, p0, p1}, Lj40$d;-><init>(Lj40;Lco/bird/android/model/persistence/BulkScanPurposeBird;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Lco/bird/android/model/constant/BulkScanPurpose;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/BulkScanPurpose;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;"
        }
    .end annotation

    const-string v0, "\n    SELECT * \n    FROM bird \n    INNER JOIN bulk_scan_purpose_bird \n    ON bird.id=bulk_scan_purpose_bird.bird_id \n    AND bulk_scan_purpose_bird.purpose = ?\n  "

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lj40;->i(Lco/bird/android/model/constant/BulkScanPurpose;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lj40;->a:LEb5;

    const-string v1, "bird"

    const-string v2, "bulk_scan_purpose_bird"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lj40$f;

    invoke-direct {v2, p0, v0}, Lj40$f;-><init>(Lj40;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lco/bird/android/model/constant/BulkScanPurpose;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lj40$h;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    const-string p1, "PART_SCAN"

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string p1, "ADD_TO_BATCH"

    return-object p1

    :cond_3
    const-string p1, "WAKE_VEHICLES"

    return-object p1

    :cond_4
    const-string p1, "SERVICE_CENTER"

    return-object p1

    :cond_5
    const-string p1, "MAP"

    return-object p1
.end method
