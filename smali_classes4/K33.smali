.class public final LK33;
.super LJ33;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LJ33;-><init>()V

    iput-object p1, p0, LK33;->a:LEb5;

    new-instance v0, LK33$a;

    invoke-direct {v0, p0, p1}, LK33$a;-><init>(LK33;LEb5;)V

    iput-object v0, p0, LK33;->b:Lcf1;

    new-instance v0, LK33$b;

    invoke-direct {v0, p0, p1}, LK33$b;-><init>(LK33;LEb5;)V

    iput-object v0, p0, LK33;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(LK33;)LEb5;
    .locals 0

    iget-object p0, p0, LK33;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LK33;)Lcf1;
    .locals 0

    iget-object p0, p0, LK33;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(LK33;)Lgz5;
    .locals 0

    iget-object p0, p0, LK33;->c:Lgz5;

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

    new-instance v0, LK33$d;

    invoke-direct {v0, p0}, LK33$d;-><init>(LK33;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Lco/bird/android/model/persistence/NestFlightSheetDetails;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LK33$c;

    invoke-direct {v0, p0, p1}, LK33$c;-><init>(LK33;Lco/bird/android/model/persistence/NestFlightSheetDetails;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

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
            "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM nest_flight_sheet WHERE nest_id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LK33;->a:LEb5;

    const-string v1, "nest_flight_sheet"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LK33$e;

    invoke-direct {v2, p0, v0}, LK33$e;-><init>(LK33;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
