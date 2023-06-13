.class public final LCs1;
.super LBs1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/FlightSheetDetails;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LBs1;-><init>()V

    iput-object p1, p0, LCs1;->a:LEb5;

    new-instance v0, LCs1$a;

    invoke-direct {v0, p0, p1}, LCs1$a;-><init>(LCs1;LEb5;)V

    iput-object v0, p0, LCs1;->b:Lcf1;

    new-instance v0, LCs1$b;

    invoke-direct {v0, p0, p1}, LCs1$b;-><init>(LCs1;LEb5;)V

    iput-object v0, p0, LCs1;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(LCs1;)LEb5;
    .locals 0

    iget-object p0, p0, LCs1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LCs1;)Lcf1;
    .locals 0

    iget-object p0, p0, LCs1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(LCs1;)Lgz5;
    .locals 0

    iget-object p0, p0, LCs1;->c:Lgz5;

    return-object p0
.end method

.method public static g()Ljava/util/List;
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

    new-instance v0, LCs1$d;

    invoke-direct {v0, p0}, LCs1$d;-><init>(LCs1;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/FlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM flight_sheet WHERE vehicle_id = ? AND context = ?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    if-nez p2, :cond_1

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p2}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    iget-object p1, p0, LCs1;->a:LEb5;

    const-string p2, "flight_sheet"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, LCs1$e;

    invoke-direct {v1, p0, v0}, LCs1$e;-><init>(LCs1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v1}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public c(Lco/bird/android/model/persistence/FlightSheetDetails;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LCs1$c;

    invoke-direct {v0, p0, p1}, LCs1$c;-><init>(LCs1;Lco/bird/android/model/persistence/FlightSheetDetails;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
