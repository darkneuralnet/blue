.class public final Lxq1;
.super Lwq1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/FleetStatus;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lwq1;-><init>()V

    iput-object p1, p0, Lxq1;->a:LEb5;

    new-instance v0, Lxq1$a;

    invoke-direct {v0, p0, p1}, Lxq1$a;-><init>(Lxq1;LEb5;)V

    iput-object v0, p0, Lxq1;->b:Lcf1;

    new-instance v0, Lxq1$b;

    invoke-direct {v0, p0, p1}, Lxq1$b;-><init>(Lxq1;LEb5;)V

    iput-object v0, p0, Lxq1;->c:Lgz5;

    new-instance v0, Lxq1$c;

    invoke-direct {v0, p0, p1}, Lxq1$c;-><init>(Lxq1;LEb5;)V

    iput-object v0, p0, Lxq1;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic f(Lxq1;)LEb5;
    .locals 0

    iget-object p0, p0, Lxq1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic g(Lxq1;)Lcf1;
    .locals 0

    iget-object p0, p0, Lxq1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic h(Lxq1;)Lgz5;
    .locals 0

    iget-object p0, p0, Lxq1;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic i(Lxq1;)Lgz5;
    .locals 0

    iget-object p0, p0, Lxq1;->c:Lgz5;

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

    new-instance v0, Lxq1$f;

    invoke-direct {v0, p0}, Lxq1$f;-><init>(Lxq1;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetStatus;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM fleet_status WHERE fleet_id = ? AND prediction_id = \'NONE\'"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lxq1;->a:LEb5;

    const-string v1, "fleet_status"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lxq1$g;

    invoke-direct {v2, p0, v0}, Lxq1$g;-><init>(Lxq1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetStatus;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM fleet_status WHERE fleet_id = ? AND prediction_id != \'NONE\' ORDER BY id"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lxq1;->a:LEb5;

    const-string v1, "fleet_status"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lxq1$h;

    invoke-direct {v2, p0, v0}, Lxq1$h;-><init>(Lxq1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs d([Lco/bird/android/model/persistence/FleetStatus;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lxq1$d;

    invoke-direct {v0, p0, p1}, Lxq1$d;-><init>(Lxq1;[Lco/bird/android/model/persistence/FleetStatus;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;Lorg/joda/time/DateTime;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lxq1$e;

    invoke-direct {v0, p0, p1, p2}, Lxq1$e;-><init>(Lxq1;Ljava/lang/String;Lorg/joda/time/DateTime;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
