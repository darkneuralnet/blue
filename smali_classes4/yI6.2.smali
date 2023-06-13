.class public final LyI6;
.super LxI6;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/ZoneAssignmentGroup;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LxI6;-><init>()V

    iput-object p1, p0, LyI6;->a:LEb5;

    new-instance v0, LyI6$a;

    invoke-direct {v0, p0, p1}, LyI6$a;-><init>(LyI6;LEb5;)V

    iput-object v0, p0, LyI6;->b:Lcf1;

    new-instance v0, LyI6$b;

    invoke-direct {v0, p0, p1}, LyI6$b;-><init>(LyI6;LEb5;)V

    iput-object v0, p0, LyI6;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic e(LyI6;)LEb5;
    .locals 0

    iget-object p0, p0, LyI6;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(LyI6;)Lcf1;
    .locals 0

    iget-object p0, p0, LyI6;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic g(LyI6;)Lgz5;
    .locals 0

    iget-object p0, p0, LyI6;->c:Lgz5;

    return-object p0
.end method

.method public static h()Ljava/util/List;
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

    new-instance v0, LyI6$d;

    invoke-direct {v0, p0}, LyI6$d;-><init>(LyI6;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZoneAssignmentGroup;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LyI6$c;

    invoke-direct {v0, p0, p1}, LyI6$c;-><init>(LyI6;Ljava/util/List;)V

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
            "Lco/bird/android/model/persistence/ZoneAssignmentGroup;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `zone_assignment_groups`.`title` AS `title`, `zone_assignment_groups`.`color` AS `color`, `zone_assignment_groups`.`description` AS `description`, `zone_assignment_groups`.`empty_text` AS `empty_text`, `zone_assignment_groups`.`release_assignments` AS `release_assignments`, `zone_assignment_groups`.`capped_zone_reservation_groups` AS `capped_zone_reservation_groups` FROM zone_assignment_groups"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LyI6;->a:LEb5;

    const-string v3, "zone_assignment_groups"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LyI6$e;

    invoke-direct {v4, p0, v0}, LyI6$e;-><init>(LyI6;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LyI6$f;

    invoke-direct {v0, p0, p1}, LyI6$f;-><init>(LyI6;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
