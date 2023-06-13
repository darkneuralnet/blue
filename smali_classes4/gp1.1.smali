.class public final Lgp1;
.super Lfp1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/FleetListVehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lfp1;-><init>()V

    iput-object p1, p0, Lgp1;->a:LEb5;

    new-instance v0, Lgp1$a;

    invoke-direct {v0, p0, p1}, Lgp1$a;-><init>(Lgp1;LEb5;)V

    iput-object v0, p0, Lgp1;->b:Lcf1;

    new-instance v0, Lgp1$b;

    invoke-direct {v0, p0, p1}, Lgp1$b;-><init>(Lgp1;LEb5;)V

    iput-object v0, p0, Lgp1;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic f(Lgp1;)LEb5;
    .locals 0

    iget-object p0, p0, Lgp1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic g(Lgp1;)Lcf1;
    .locals 0

    iget-object p0, p0, Lgp1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic h(Lgp1;)Lgz5;
    .locals 0

    iget-object p0, p0, Lgp1;->c:Lgz5;

    return-object p0
.end method

.method public static i()Ljava/util/List;
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

    new-instance v0, Lgp1$d;

    invoke-direct {v0, p0}, Lgp1$d;-><init>(Lgp1;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public varargs b([Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lgp1$c;

    invoke-direct {v0, p0, p1}, Lgp1$c;-><init>(Lgp1;[Lco/bird/android/model/persistence/FleetListVehicle;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v6, Lgp1$g;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lgp1$g;-><init>(Lgp1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/List;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetListVehicle;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SELECT * FROM fleet_list_vehicle WHERE vehicle_id IN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    add-int/2addr v1, v2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v1, v3}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lgp1;->a:LEb5;

    const-string v1, "fleet_list_vehicle"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lgp1$f;

    invoke-direct {v3, p0, v0}, Lgp1$f;-><init>(Lgp1;LHb5;)V

    invoke-static {p1, v2, v1, v3}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetListVehicle;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM fleet_list_vehicle WHERE list = ? AND fleet_id = ? AND section = ?"

    const/4 v1, 0x3

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v0, p1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1, p2}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    if-nez p3, :cond_2

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1, p3}, LHb5;->G0(ILjava/lang/String;)V

    :goto_2
    iget-object p1, p0, Lgp1;->a:LEb5;

    const-string p2, "fleet_list_vehicle"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lgp1$e;

    invoke-direct {p3, p0, v0}, Lgp1$e;-><init>(Lgp1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, p3}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
