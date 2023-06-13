.class public final LjF1;
.super LiF1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/PendingScanEntity;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lgz5;

.field public final e:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LiF1;-><init>()V

    iput-object p1, p0, LjF1;->a:LEb5;

    new-instance v0, LjF1$d;

    invoke-direct {v0, p0, p1}, LjF1$d;-><init>(LjF1;LEb5;)V

    iput-object v0, p0, LjF1;->b:Lcf1;

    new-instance v0, LjF1$e;

    invoke-direct {v0, p0, p1}, LjF1$e;-><init>(LjF1;LEb5;)V

    iput-object v0, p0, LjF1;->c:Lcf1;

    new-instance v0, LjF1$f;

    invoke-direct {v0, p0, p1}, LjF1$f;-><init>(LjF1;LEb5;)V

    iput-object v0, p0, LjF1;->d:Lgz5;

    new-instance v0, LjF1$g;

    invoke-direct {v0, p0, p1}, LjF1$g;-><init>(LjF1;LEb5;)V

    iput-object v0, p0, LjF1;->e:Lgz5;

    return-void
.end method

.method public static bridge synthetic i(LjF1;)LEb5;
    .locals 0

    iget-object p0, p0, LjF1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic j(LjF1;)Lcf1;
    .locals 0

    iget-object p0, p0, LjF1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic k(LjF1;)Lcf1;
    .locals 0

    iget-object p0, p0, LjF1;->c:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic l(LjF1;)Lgz5;
    .locals 0

    iget-object p0, p0, LjF1;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic m(LjF1;)Lgz5;
    .locals 0

    iget-object p0, p0, LjF1;->e:Lgz5;

    return-object p0
.end method

.method public static n()Ljava/util/List;
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

    new-instance v0, LjF1$j;

    invoke-direct {v0, p0, p1}, LjF1$j;-><init>(LjF1;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LjF1$k;

    invoke-direct {v0, p0, p1}, LjF1$k;-><init>(LjF1;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/PendingScanEntity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM pending_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LjF1$l;

    invoke-direct {p1, p0, v0}, LjF1$l;-><init>(LjF1;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM unidentified_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LjF1$b;

    invoke-direct {p1, p0, v0}, LjF1$b;-><init>(LjF1;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public varargs e([Lco/bird/android/model/persistence/PendingScanEntity;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LjF1$h;

    invoke-direct {v0, p0, p1}, LjF1$h;-><init>(LjF1;[Lco/bird/android/model/persistence/PendingScanEntity;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public varargs f([Lco/bird/android/model/persistence/UnidentifiedScanEntity;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LjF1$i;

    invoke-direct {v0, p0, p1}, LjF1$i;-><init>(LjF1;[Lco/bird/android/model/persistence/UnidentifiedScanEntity;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/PendingScanEntity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM pending_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LjF1;->a:LEb5;

    const-string v1, "pending_scan_hard_count"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LjF1$a;

    invoke-direct {v2, p0, v0}, LjF1$a;-><init>(LjF1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM unidentified_scan_hard_count WHERE hard_count_id = ? ORDER BY id ASC"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LjF1;->a:LEb5;

    const-string v1, "unidentified_scan_hard_count"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LjF1$c;

    invoke-direct {v2, p0, v0}, LjF1$c;-><init>(LjF1;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
