.class public final Lsi3;
.super Lri3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/SkuOrder;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lri3;-><init>()V

    iput-object p1, p0, Lsi3;->a:LEb5;

    new-instance v0, Lsi3$a;

    invoke-direct {v0, p0, p1}, Lsi3$a;-><init>(Lsi3;LEb5;)V

    iput-object v0, p0, Lsi3;->b:Lcf1;

    new-instance v0, Lsi3$b;

    invoke-direct {v0, p0, p1}, Lsi3$b;-><init>(Lsi3;LEb5;)V

    iput-object v0, p0, Lsi3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(Lsi3;)LEb5;
    .locals 0

    iget-object p0, p0, Lsi3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(Lsi3;)Lcf1;
    .locals 0

    iget-object p0, p0, Lsi3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(Lsi3;)Lgz5;
    .locals 0

    iget-object p0, p0, Lsi3;->c:Lgz5;

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

    new-instance v0, Lsi3$d;

    invoke-direct {v0, p0}, Lsi3$d;-><init>(Lsi3;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Lco/bird/android/model/persistence/SkuOrder;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lsi3$c;

    invoke-direct {v0, p0, p1}, Lsi3$c;-><init>(Lsi3;Lco/bird/android/model/persistence/SkuOrder;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/SkuOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM `sku_order` WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lsi3;->a:LEb5;

    const-string v1, "sku_order"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lsi3$e;

    invoke-direct {v2, p0, v0}, Lsi3$e;-><init>(Lsi3;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
