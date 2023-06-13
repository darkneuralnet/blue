.class public final LQc3;
.super LPc3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/NotificationGroup;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LPc3;-><init>()V

    iput-object p1, p0, LQc3;->a:LEb5;

    new-instance v0, LQc3$a;

    invoke-direct {v0, p0, p1}, LQc3$a;-><init>(LQc3;LEb5;)V

    iput-object v0, p0, LQc3;->b:Lcf1;

    new-instance v0, LQc3$b;

    invoke-direct {v0, p0, p1}, LQc3$b;-><init>(LQc3;LEb5;)V

    iput-object v0, p0, LQc3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(LQc3;)LEb5;
    .locals 0

    iget-object p0, p0, LQc3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LQc3;)Lcf1;
    .locals 0

    iget-object p0, p0, LQc3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(LQc3;)Lgz5;
    .locals 0

    iget-object p0, p0, LQc3;->c:Lgz5;

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

    new-instance v0, LQc3$d;

    invoke-direct {v0, p0}, LQc3$d;-><init>(LQc3;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public varargs b([Lco/bird/android/model/persistence/NotificationGroup;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LQc3$c;

    invoke-direct {v0, p0, p1}, LQc3$c;-><init>(LQc3;[Lco/bird/android/model/persistence/NotificationGroup;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NotificationGroup;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `notification_groups`.`id` AS `id`, `notification_groups`.`title` AS `title`, `notification_groups`.`description` AS `description`, `notification_groups`.`category` AS `category`, `notification_groups`.`date` AS `date`, `notification_groups`.`icon` AS `icon` FROM notification_groups"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LQc3;->a:LEb5;

    const-string v3, "notification_groups"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LQc3$e;

    invoke-direct {v4, p0, v0}, LQc3$e;-><init>(LQc3;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
