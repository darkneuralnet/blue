.class public final Lxw3;
.super Lww3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/OperatorTaskBanner;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lgz5;

.field public final e:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lww3;-><init>()V

    iput-object p1, p0, Lxw3;->a:LEb5;

    new-instance v0, Lxw3$d;

    invoke-direct {v0, p0, p1}, Lxw3$d;-><init>(Lxw3;LEb5;)V

    iput-object v0, p0, Lxw3;->b:Lcf1;

    new-instance v0, Lxw3$e;

    invoke-direct {v0, p0, p1}, Lxw3$e;-><init>(Lxw3;LEb5;)V

    iput-object v0, p0, Lxw3;->c:Lcf1;

    new-instance v0, Lxw3$f;

    invoke-direct {v0, p0, p1}, Lxw3$f;-><init>(Lxw3;LEb5;)V

    iput-object v0, p0, Lxw3;->d:Lgz5;

    new-instance v0, Lxw3$g;

    invoke-direct {v0, p0, p1}, Lxw3$g;-><init>(Lxw3;LEb5;)V

    iput-object v0, p0, Lxw3;->e:Lgz5;

    return-void
.end method

.method public static bridge synthetic h(Lxw3;)LEb5;
    .locals 0

    iget-object p0, p0, Lxw3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic i(Lxw3;)Lcf1;
    .locals 0

    iget-object p0, p0, Lxw3;->c:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic j(Lxw3;)Lcf1;
    .locals 0

    iget-object p0, p0, Lxw3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic k(Lxw3;)Lgz5;
    .locals 0

    iget-object p0, p0, Lxw3;->e:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic l(Lxw3;)Lgz5;
    .locals 0

    iget-object p0, p0, Lxw3;->d:Lgz5;

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

    new-instance v0, Lxw3$k;

    invoke-direct {v0, p0}, Lxw3$k;-><init>(Lxw3;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lxw3$j;

    invoke-direct {v0, p0}, Lxw3$j;-><init>(Lxw3;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c(Lco/bird/android/model/persistence/OperatorTaskBanner;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lxw3$i;

    invoke-direct {v0, p0, p1}, Lxw3$i;-><init>(Lxw3;Lco/bird/android/model/persistence/OperatorTaskBanner;)V

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
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lxw3$h;

    invoke-direct {v0, p0, p1}, Lxw3$h;-><init>(Lxw3;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public e()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorTaskBanner;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `operator_task_banners`.`title` AS `title`, `operator_task_banners`.`title_color` AS `title_color`, `operator_task_banners`.`background_color` AS `background_color` FROM operator_task_banners"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lxw3;->a:LEb5;

    const-string v3, "operator_task_banners"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lxw3$c;

    invoke-direct {v4, p0, v0}, Lxw3$c;-><init>(Lxw3;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public f()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `operator_task_group`.`title` AS `title`, `operator_task_group`.`tasks` AS `tasks` FROM operator_task_group"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lxw3;->a:LEb5;

    const-string v3, "operator_task_group"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lxw3$a;

    invoke-direct {v4, p0, v0}, Lxw3$a;-><init>(Lxw3;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM operator_task_group WHERE title IS (?)"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lxw3;->a:LEb5;

    const-string v1, "operator_task_group"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lxw3$b;

    invoke-direct {v2, p0, v0}, Lxw3$b;-><init>(Lxw3;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
