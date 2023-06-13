.class public final Lcq3;
.super Lbq3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lbq3;-><init>()V

    iput-object p1, p0, Lcq3;->a:LEb5;

    new-instance v0, Lcq3$a;

    invoke-direct {v0, p0, p1}, Lcq3$a;-><init>(Lcq3;LEb5;)V

    iput-object v0, p0, Lcq3;->b:Lcf1;

    new-instance v0, Lcq3$b;

    invoke-direct {v0, p0, p1}, Lcq3$b;-><init>(Lcq3;LEb5;)V

    iput-object v0, p0, Lcq3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic e(Lcq3;)LEb5;
    .locals 0

    iget-object p0, p0, Lcq3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(Lcq3;)Lcf1;
    .locals 0

    iget-object p0, p0, Lcq3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic g(Lcq3;)Lgz5;
    .locals 0

    iget-object p0, p0, Lcq3;->c:Lgz5;

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

    new-instance v0, Lcq3$d;

    invoke-direct {v0, p0}, Lcq3$d;-><init>(Lcq3;)V

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
            "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lcq3$c;

    invoke-direct {v0, p0, p1}, Lcq3$c;-><init>(Lcq3;Ljava/util/List;)V

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
            "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `operator_order_section`.`title` AS `title`, `operator_order_section`.`idx` AS `idx` FROM `operator_order_section`"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lcq3;->a:LEb5;

    const-string v3, "operator_order_section"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcq3$e;

    invoke-direct {v4, p0, v0}, Lcq3$e;-><init>(Lcq3;LHb5;)V

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

    new-instance v0, Lcq3$f;

    invoke-direct {v0, p0, p1}, Lcq3$f;-><init>(Lcq3;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
