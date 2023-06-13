.class public final Lm10;
.super Ll10;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;

.field public final e:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Ll10;-><init>()V

    iput-object p1, p0, Lm10;->a:LEb5;

    new-instance v0, Lm10$c;

    invoke-direct {v0, p0, p1}, Lm10$c;-><init>(Lm10;LEb5;)V

    iput-object v0, p0, Lm10;->b:Lcf1;

    new-instance v0, Lm10$d;

    invoke-direct {v0, p0, p1}, Lm10$d;-><init>(Lm10;LEb5;)V

    iput-object v0, p0, Lm10;->c:Lgz5;

    new-instance v0, Lm10$e;

    invoke-direct {v0, p0, p1}, Lm10$e;-><init>(Lm10;LEb5;)V

    iput-object v0, p0, Lm10;->d:Lgz5;

    new-instance v0, Lm10$f;

    invoke-direct {v0, p0, p1}, Lm10$f;-><init>(Lm10;LEb5;)V

    iput-object v0, p0, Lm10;->e:Lgz5;

    return-void
.end method

.method public static bridge synthetic h(Lm10;)LEb5;
    .locals 0

    iget-object p0, p0, Lm10;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic i(Lm10;)Lcf1;
    .locals 0

    iget-object p0, p0, Lm10;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic j(Lm10;)Lgz5;
    .locals 0

    iget-object p0, p0, Lm10;->e:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic k(Lm10;)Lgz5;
    .locals 0

    iget-object p0, p0, Lm10;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic l(Lm10;)Lgz5;
    .locals 0

    iget-object p0, p0, Lm10;->c:Lgz5;

    return-object p0
.end method

.method public static m()Ljava/util/List;
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

    new-instance v0, Lm10$j;

    invoke-direct {v0, p0}, Lm10$j;-><init>(Lm10;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public varargs b([Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lm10$g;

    invoke-direct {v0, p0, p1}, Lm10$g;-><init>(Lm10;[Lco/bird/android/model/persistence/BrainSwapRecord;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lm10$i;

    invoke-direct {v0, p0, p1}, Lm10$i;-><init>(Lm10;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM brain_swaps WHERE bird_id = ? LIMIT 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lm10;->a:LEb5;

    const-string v1, "brain_swaps"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lm10$b;

    invoke-direct {v2, p0, v0}, Lm10$b;-><init>(Lm10;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM brain_swaps swaps WHERE imei = ? LIMIT 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lm10;->a:LEb5;

    const-string v1, "brain_swaps"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lm10$a;

    invoke-direct {v2, p0, v0}, Lm10$a;-><init>(Lm10;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public f()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `brain_swaps`.`bird_id` AS `bird_id`, `brain_swaps`.`part_id` AS `part_id`, `brain_swaps`.`imei` AS `imei`, `brain_swaps`.`bird_code` AS `bird_code`, `brain_swaps`.`brain_part` AS `brain_part`, `brain_swaps`.`status` AS `status`, `brain_swaps`.`created_at` AS `created_at` FROM brain_swaps"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lm10;->a:LEb5;

    const-string v3, "brain_swaps"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lm10$k;

    invoke-direct {v4, p0, v0}, Lm10$k;-><init>(Lm10;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lm10$h;

    invoke-direct {v0, p0, p2, p1}, Lm10$h;-><init>(Lm10;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
