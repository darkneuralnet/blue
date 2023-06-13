.class public final LL00;
.super LK00;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LK00;-><init>()V

    iput-object p1, p0, LL00;->a:LEb5;

    new-instance v0, LL00$a;

    invoke-direct {v0, p0, p1}, LL00$a;-><init>(LL00;LEb5;)V

    iput-object v0, p0, LL00;->b:Lcf1;

    new-instance v0, LL00$b;

    invoke-direct {v0, p0, p1}, LL00$b;-><init>(LL00;LEb5;)V

    iput-object v0, p0, LL00;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(LL00;)LEb5;
    .locals 0

    iget-object p0, p0, LL00;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LL00;)Lcf1;
    .locals 0

    iget-object p0, p0, LL00;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(LL00;)Lgz5;
    .locals 0

    iget-object p0, p0, LL00;->c:Lgz5;

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
.method public a(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM bounty_flight_sheet WHERE bounty_id = ? LIMIT 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LL00$e;

    invoke-direct {p1, p0, v0}, LL00$e;-><init>(LL00;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, LL00$d;

    invoke-direct {v0, p0}, LL00$d;-><init>(LL00;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LL00$c;

    invoke-direct {v0, p0, p1}, LL00$c;-><init>(LL00;Lco/bird/android/model/persistence/BountyFlightSheetDetails;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
