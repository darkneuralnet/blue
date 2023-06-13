.class public final LCc3;
.super LBc3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/Notification;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LBc3;-><init>()V

    iput-object p1, p0, LCc3;->a:LEb5;

    new-instance v0, LCc3$a;

    invoke-direct {v0, p0, p1}, LCc3$a;-><init>(LCc3;LEb5;)V

    iput-object v0, p0, LCc3;->b:Lcf1;

    new-instance v0, LCc3$b;

    invoke-direct {v0, p0, p1}, LCc3$b;-><init>(LCc3;LEb5;)V

    iput-object v0, p0, LCc3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic g(LCc3;)LEb5;
    .locals 0

    iget-object p0, p0, LCc3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic h(LCc3;)Lcf1;
    .locals 0

    iget-object p0, p0, LCc3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic i(LCc3;)Lgz5;
    .locals 0

    iget-object p0, p0, LCc3;->c:Lgz5;

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

    new-instance v0, LCc3$d;

    invoke-direct {v0, p0}, LCc3$d;-><init>(LCc3;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT date FROM notifications ORDER BY date DESC LIMIT 1"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    new-instance v1, LCc3$h;

    invoke-direct {v1, p0, v0}, LCc3$h;-><init>(LCc3;LHb5;)V

    invoke-static {v1}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object v0

    return-object v0
.end method

.method public varargs c([Lco/bird/android/model/persistence/Notification;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LCc3$c;

    invoke-direct {v0, p0, p1}, LCc3$c;-><init>(LCc3;[Lco/bird/android/model/persistence/Notification;)V

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
            "Lco/bird/android/model/persistence/Notification;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM notifications WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LCc3;->a:LEb5;

    const-string v1, "notifications"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LCc3$f;

    invoke-direct {v2, p0, v0}, LCc3$f;-><init>(LCc3;LHb5;)V

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
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Notification;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM notifications WHERE group_id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LCc3;->a:LEb5;

    const-string v1, "notifications"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LCc3$g;

    invoke-direct {v2, p0, v0}, LCc3$g;-><init>(LCc3;LHb5;)V

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
            "Lco/bird/android/model/persistence/Notification;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `notifications`.`id` AS `id`, `notifications`.`group_id` AS `group_id`, `notifications`.`category` AS `category`, `notifications`.`kind` AS `kind`, `notifications`.`title` AS `title`, `notifications`.`short_description` AS `short_description`, `notifications`.`full_description` AS `full_description`, `notifications`.`icon` AS `icon`, `notifications`.`date` AS `date`, `notifications`.`actions` AS `actions` FROM notifications WHERE group_id IS NULL"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LCc3;->a:LEb5;

    const-string v3, "notifications"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LCc3$e;

    invoke-direct {v4, p0, v0}, LCc3$e;-><init>(LCc3;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
