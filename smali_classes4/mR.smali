.class public final LmR;
.super LlR;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LlR;-><init>()V

    iput-object p1, p0, LmR;->a:LEb5;

    new-instance v0, LmR$d;

    invoke-direct {v0, p0, p1}, LmR$d;-><init>(LmR;LEb5;)V

    iput-object v0, p0, LmR;->b:Lcf1;

    new-instance v0, LmR$e;

    invoke-direct {v0, p0, p1}, LmR$e;-><init>(LmR;LEb5;)V

    iput-object v0, p0, LmR;->c:Lgz5;

    new-instance v0, LmR$f;

    invoke-direct {v0, p0, p1}, LmR$f;-><init>(LmR;LEb5;)V

    iput-object v0, p0, LmR;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic h(LmR;)LEb5;
    .locals 0

    iget-object p0, p0, LmR;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic i(LmR;)Lcf1;
    .locals 0

    iget-object p0, p0, LmR;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic j(LmR;)Lgz5;
    .locals 0

    iget-object p0, p0, LmR;->d:Lgz5;

    return-object p0
.end method

.method public static k()Ljava/util/List;
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

    new-instance v0, LmR$i;

    invoke-direct {v0, p0}, LmR$i;-><init>(LmR;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, LmR$h;

    invoke-direct {v0, p0}, LmR$h;-><init>(LmR;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `bird_plus_view`.`status` AS `status`, `bird_plus_view`.`subscription_plan_id` AS `subscription_plan_id`, `bird_plus_view`.`user_subscription_id` AS `user_subscription_id`, `bird_plus_view`.`codename` AS `codename`, `bird_plus_view`.`subscription_plan` AS `subscription_plan`, `bird_plus_view`.`user_subscription` AS `user_subscription`, `bird_plus_view`.`ineligible_reason` AS `ineligible_reason`, `bird_plus_view`.`display` AS `display`, `bird_plus_view`.`zendesk_article_id` AS `zendesk_article_id` FROM bird_plus_view"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LmR;->a:LEb5;

    const-string v3, "bird_plus_view"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LmR$j;

    invoke-direct {v4, p0, v0}, LmR$j;-><init>(LmR;LHb5;)V

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
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LmR$g;

    invoke-direct {v0, p0, p1}, LmR$g;-><init>(LmR;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

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
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM bird_plus_view WHERE codename = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LmR;->a:LEb5;

    const-string v1, "bird_plus_view"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LmR$c;

    invoke-direct {v2, p0, v0}, LmR$c;-><init>(LmR;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

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
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM bird_plus_view WHERE subscription_plan_id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LmR;->a:LEb5;

    const-string v1, "bird_plus_view"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LmR$b;

    invoke-direct {v2, p0, v0}, LmR$b;-><init>(LmR;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

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
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM bird_plus_view WHERE user_subscription_id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LmR;->a:LEb5;

    const-string v1, "bird_plus_view"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LmR$a;

    invoke-direct {v2, p0, v0}, LmR$a;-><init>(LmR;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
