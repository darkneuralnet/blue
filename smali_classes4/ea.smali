.class public final Lea;
.super Lda;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/AnalyticsEntity;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/AnalyticsEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lda;-><init>()V

    iput-object p1, p0, Lea;->a:LEb5;

    new-instance v0, Lea$a;

    invoke-direct {v0, p0, p1}, Lea$a;-><init>(Lea;LEb5;)V

    iput-object v0, p0, Lea;->b:Lcf1;

    new-instance v0, Lea$b;

    invoke-direct {v0, p0, p1}, Lea$b;-><init>(Lea;LEb5;)V

    iput-object v0, p0, Lea;->c:Lbf1;

    return-void
.end method

.method public static bridge synthetic e(Lea;)LEb5;
    .locals 0

    iget-object p0, p0, Lea;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(Lea;)Lbf1;
    .locals 0

    iget-object p0, p0, Lea;->c:Lbf1;

    return-object p0
.end method

.method public static bridge synthetic g(Lea;)Lcf1;
    .locals 0

    iget-object p0, p0, Lea;->b:Lcf1;

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
.method public a(Ljava/util/List;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/AnalyticsEntity;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lea$d;

    invoke-direct {v0, p0, p1}, Lea$d;-><init>(Lea;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public b()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT COUNT(id) FROM analytics"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    new-instance v1, Lea$f;

    invoke-direct {v1, p0, v0}, Lea$f;-><init>(Lea;LHb5;)V

    invoke-static {v1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/AnalyticsEntity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `analytics`.`id` AS `id`, `analytics`.`name` AS `name`, `analytics`.`properties` AS `properties` FROM analytics"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    new-instance v1, Lea$e;

    invoke-direct {v1, p0, v0}, Lea$e;-><init>(Lea;LHb5;)V

    invoke-static {v1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public d(Lco/bird/android/model/persistence/AnalyticsEntity;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lea$c;

    invoke-direct {v0, p0, p1}, Lea$c;-><init>(Lea;Lco/bird/android/model/persistence/AnalyticsEntity;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
