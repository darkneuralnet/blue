.class public final LTp3;
.super LSp3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LSp3;-><init>()V

    iput-object p1, p0, LTp3;->a:LEb5;

    new-instance v0, LTp3$a;

    invoke-direct {v0, p0, p1}, LTp3$a;-><init>(LTp3;LEb5;)V

    iput-object v0, p0, LTp3;->b:Lcf1;

    new-instance v0, LTp3$b;

    invoke-direct {v0, p0, p1}, LTp3$b;-><init>(LTp3;LEb5;)V

    iput-object v0, p0, LTp3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic f(LTp3;)LEb5;
    .locals 0

    iget-object p0, p0, LTp3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic g(LTp3;)Lcf1;
    .locals 0

    iget-object p0, p0, LTp3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic h(LTp3;)Lgz5;
    .locals 0

    iget-object p0, p0, LTp3;->c:Lgz5;

    return-object p0
.end method

.method public static i()Ljava/util/List;
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

    new-instance v0, LTp3$d;

    invoke-direct {v0, p0}, LTp3$d;-><init>(LTp3;)V

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
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LTp3$c;

    invoke-direct {v0, p0, p1}, LTp3$c;-><init>(LTp3;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/OperatorOrderViewType;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM `operator_order` WHERE order_id = ? AND type = ?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-static {p2}, LRp3;->b(Lco/bird/android/model/constant/OperatorOrderViewType;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    iget-object p1, p0, LTp3;->a:LEb5;

    const-string p2, "operator_order"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, LTp3$f;

    invoke-direct {v1, p0, v0}, LTp3$f;-><init>(LTp3;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v1}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

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
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM `operator_order` WHERE section = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LTp3;->a:LEb5;

    const-string v1, "operator_order"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LTp3$e;

    invoke-direct {v2, p0, v0}, LTp3$e;-><init>(LTp3;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/util/List;)Lio/reactivex/c;
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

    new-instance v0, LTp3$g;

    invoke-direct {v0, p0, p1}, LTp3$g;-><init>(LTp3;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
