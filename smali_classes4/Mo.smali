.class public final LMo;
.super LLo;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "LNo;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "LNo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LLo;-><init>()V

    iput-object p1, p0, LMo;->a:LEb5;

    new-instance v0, LMo$a;

    invoke-direct {v0, p0, p1}, LMo$a;-><init>(LMo;LEb5;)V

    iput-object v0, p0, LMo;->b:Lcf1;

    new-instance v0, LMo$b;

    invoke-direct {v0, p0, p1}, LMo$b;-><init>(LMo;LEb5;)V

    iput-object v0, p0, LMo;->c:Lbf1;

    return-void
.end method

.method public static bridge synthetic d(LMo;)LEb5;
    .locals 0

    iget-object p0, p0, LMo;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LMo;)Lcf1;
    .locals 0

    iget-object p0, p0, LMo;->b:Lcf1;

    return-object p0
.end method

.method public static f()Ljava/util/List;
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
.method public a(Ljava/lang/String;)Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "LNo;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM local_assets WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LMo$d;

    invoke-direct {p1, p0, v0}, LMo$d;-><init>(LMo;LHb5;)V

    invoke-static {p1}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lco/bird/android/model/constant/AssetManagerType;)Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AssetManagerType;",
            ")",
            "Lio/reactivex/p<",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT downloaded_at FROM local_assets WHERE manager = ? ORDER BY dateTime(downloaded_at) DESC LIMIT 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-static {p1}, LxB0;->a(Lco/bird/android/model/constant/AssetManagerType;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LMo$e;

    invoke-direct {p1, p0, v0}, LMo$e;-><init>(LMo;LHb5;)V

    invoke-static {p1}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public varargs c([LNo;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LMo$c;

    invoke-direct {v0, p0, p1}, LMo$c;-><init>(LMo;[LNo;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
