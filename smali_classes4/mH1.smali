.class public final LmH1;
.super LlH1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LlH1;-><init>()V

    iput-object p1, p0, LmH1;->a:LEb5;

    new-instance v0, LmH1$b;

    invoke-direct {v0, p0, p1}, LmH1$b;-><init>(LmH1;LEb5;)V

    iput-object v0, p0, LmH1;->b:Lcf1;

    new-instance v0, LmH1$c;

    invoke-direct {v0, p0, p1}, LmH1$c;-><init>(LmH1;LEb5;)V

    iput-object v0, p0, LmH1;->c:Lgz5;

    new-instance v0, LmH1$d;

    invoke-direct {v0, p0, p1}, LmH1$d;-><init>(LmH1;LEb5;)V

    iput-object v0, p0, LmH1;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic g(LmH1;)LEb5;
    .locals 0

    iget-object p0, p0, LmH1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic h(LmH1;)Lcf1;
    .locals 0

    iget-object p0, p0, LmH1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic i(LmH1;)Lgz5;
    .locals 0

    iget-object p0, p0, LmH1;->c:Lgz5;

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
.method public a(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LmH1$f;

    invoke-direct {v0, p0, p1}, LmH1$f;-><init>(LmH1;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lio/reactivex/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM hard_count_scan WHERE session_id  = ? AND completed = 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LmH1;->a:LEb5;

    const-string v1, "hard_count_scan"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LmH1$i;

    invoke-direct {v2, p0, v0}, LmH1$i;-><init>(LmH1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->a(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM hard_count_scan WHERE session_id  = ? AND bird_id = ?"

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
    new-instance p1, LmH1$g;

    invoke-direct {p1, p0, v0}, LmH1$g;-><init>(LmH1;LHb5;)V

    invoke-static {p1}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM hard_count_scan WHERE session_id  = ? AND scan_identifier = ?"

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
    new-instance p1, LmH1$h;

    invoke-direct {p1, p0, v0}, LmH1$h;-><init>(LmH1;LHb5;)V

    invoke-static {p1}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LmH1$e;

    invoke-direct {v0, p0, p1}, LmH1$e;-><init>(LmH1;Lco/bird/android/model/persistence/HardCountScan;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM hard_count_scan WHERE session_id  = ? AND completed = 1 ORDER BY scanned_at DESC LIMIT 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LmH1;->a:LEb5;

    const-string v1, "hard_count_scan"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LmH1$a;

    invoke-direct {v2, p0, v0}, LmH1$a;-><init>(LmH1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
