.class public final Lso3;
.super Lro3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lro3;-><init>()V

    iput-object p1, p0, Lso3;->a:LEb5;

    new-instance v0, Lso3$a;

    invoke-direct {v0, p0, p1}, Lso3$a;-><init>(Lso3;LEb5;)V

    iput-object v0, p0, Lso3;->b:Lcf1;

    new-instance v0, Lso3$b;

    invoke-direct {v0, p0, p1}, Lso3$b;-><init>(Lso3;LEb5;)V

    iput-object v0, p0, Lso3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic c(Lso3;)LEb5;
    .locals 0

    iget-object p0, p0, Lso3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic d(Lso3;)Lcf1;
    .locals 0

    iget-object p0, p0, Lso3;->b:Lcf1;

    return-object p0
.end method

.method public static e()Ljava/util/List;
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
.method public varargs a([Lco/bird/android/model/persistence/OperatorNotificationCategory;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lso3$c;

    invoke-direct {v0, p0, p1}, Lso3$c;-><init>(Lso3;[Lco/bird/android/model/persistence/OperatorNotificationCategory;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public b()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `categories`.`category` AS `category`, `categories`.`title` AS `title` FROM categories"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lso3;->a:LEb5;

    const-string v3, "categories"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lso3$d;

    invoke-direct {v4, p0, v0}, Lso3$d;-><init>(Lso3;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
