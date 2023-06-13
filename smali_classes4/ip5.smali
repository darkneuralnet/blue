.class public final Lip5;
.super Lhp5;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/ScrapOrderView;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lhp5;-><init>()V

    iput-object p1, p0, Lip5;->a:LEb5;

    new-instance v0, Lip5$a;

    invoke-direct {v0, p0, p1}, Lip5$a;-><init>(Lip5;LEb5;)V

    iput-object v0, p0, Lip5;->b:Lcf1;

    new-instance v0, Lip5$b;

    invoke-direct {v0, p0, p1}, Lip5$b;-><init>(Lip5;LEb5;)V

    iput-object v0, p0, Lip5;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic e(Lip5;)LEb5;
    .locals 0

    iget-object p0, p0, Lip5;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(Lip5;)Lcf1;
    .locals 0

    iget-object p0, p0, Lip5;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic g(Lip5;)Lgz5;
    .locals 0

    iget-object p0, p0, Lip5;->c:Lgz5;

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

    new-instance v0, Lip5$d;

    invoke-direct {v0, p0}, Lip5$d;-><init>(Lip5;)V

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
            "Lco/bird/android/model/persistence/ScrapOrderView;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lip5$c;

    invoke-direct {v0, p0, p1}, Lip5$c;-><init>(Lip5;Ljava/util/List;)V

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
            "Lco/bird/android/model/persistence/ScrapOrderView;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `scrap_order`.`order_id` AS `order_id`, `scrap_order`.`container_order_id` AS `container_order_id`, `scrap_order`.`details` AS `details`, `scrap_order`.`quantity` AS `quantity`, `scrap_order`.`bol_uploaded` AS `bol_uploaded`, `scrap_order`.`bol_status_text` AS `bol_status_text`, `scrap_order`.`bol_status_color` AS `bol_status_color` FROM `scrap_order`"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lip5;->a:LEb5;

    const-string v3, "scrap_order"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lip5$e;

    invoke-direct {v4, p0, v0}, Lip5$e;-><init>(Lip5;LHb5;)V

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

    new-instance v0, Lip5$f;

    invoke-direct {v0, p0, p1}, Lip5$f;-><init>(Lip5;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
