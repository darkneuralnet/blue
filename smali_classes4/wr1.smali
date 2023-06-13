.class public final Lwr1;
.super Lvr1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/FleetStatusSummary;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lvr1;-><init>()V

    iput-object p1, p0, Lwr1;->a:LEb5;

    new-instance v0, Lwr1$a;

    invoke-direct {v0, p0, p1}, Lwr1$a;-><init>(Lwr1;LEb5;)V

    iput-object v0, p0, Lwr1;->b:Lcf1;

    new-instance v0, Lwr1$b;

    invoke-direct {v0, p0, p1}, Lwr1$b;-><init>(Lwr1;LEb5;)V

    iput-object v0, p0, Lwr1;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic e(Lwr1;)LEb5;
    .locals 0

    iget-object p0, p0, Lwr1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(Lwr1;)Lcf1;
    .locals 0

    iget-object p0, p0, Lwr1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic g(Lwr1;)Lgz5;
    .locals 0

    iget-object p0, p0, Lwr1;->c:Lgz5;

    return-object p0
.end method

.method public static h()Ljava/util/List;
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

    new-instance v0, Lwr1$d;

    invoke-direct {v0, p0}, Lwr1$d;-><init>(Lwr1;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetStatusSummary;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `fleet_summary`.`fleet_id` AS `fleet_id`, `fleet_summary`.`title` AS `title`, `fleet_summary`.`description` AS `description`, `fleet_summary`.`chart` AS `chart` FROM fleet_summary"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lwr1;->a:LEb5;

    const-string v3, "fleet_summary"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lwr1$e;

    invoke-direct {v4, p0, v0}, Lwr1$e;-><init>(Lwr1;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetStatusSummary;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lwr1$c;

    invoke-direct {v0, p0, p1}, Lwr1$c;-><init>(Lwr1;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lwr1$f;

    invoke-direct {v0, p0, p1}, Lwr1$f;-><init>(Lwr1;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
