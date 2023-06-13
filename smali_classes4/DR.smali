.class public final LDR;
.super LCR;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/BirdRatingHistory;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LCR;-><init>()V

    iput-object p1, p0, LDR;->a:LEb5;

    new-instance v0, LDR$a;

    invoke-direct {v0, p0, p1}, LDR$a;-><init>(LDR;LEb5;)V

    iput-object v0, p0, LDR;->b:Lcf1;

    new-instance v0, LDR$b;

    invoke-direct {v0, p0, p1}, LDR$b;-><init>(LDR;LEb5;)V

    iput-object v0, p0, LDR;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(LDR;)LEb5;
    .locals 0

    iget-object p0, p0, LDR;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LDR;)Lcf1;
    .locals 0

    iget-object p0, p0, LDR;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(LDR;)Lgz5;
    .locals 0

    iget-object p0, p0, LDR;->c:Lgz5;

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
.method public a(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/BirdRatingHistory;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM bird_rating_history WHERE bird_id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LDR$e;

    invoke-direct {p1, p0, v0}, LDR$e;-><init>(LDR;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, LDR$d;

    invoke-direct {v0, p0}, LDR$d;-><init>(LDR;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c(Lco/bird/android/model/persistence/BirdRatingHistory;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LDR$c;

    invoke-direct {v0, p0, p1}, LDR$c;-><init>(LDR;Lco/bird/android/model/persistence/BirdRatingHistory;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
