.class public final Lfg;
.super Leg;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Leg;-><init>()V

    iput-object p1, p0, Lfg;->a:LEb5;

    new-instance v0, Lfg$a;

    invoke-direct {v0, p0, p1}, Lfg$a;-><init>(Lfg;LEb5;)V

    iput-object v0, p0, Lfg;->b:Lcf1;

    new-instance v0, Lfg$b;

    invoke-direct {v0, p0, p1}, Lfg$b;-><init>(Lfg;LEb5;)V

    iput-object v0, p0, Lfg;->c:Lgz5;

    new-instance v0, Lfg$c;

    invoke-direct {v0, p0, p1}, Lfg$c;-><init>(Lfg;LEb5;)V

    iput-object v0, p0, Lfg;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic f(Lfg;)LEb5;
    .locals 0

    iget-object p0, p0, Lfg;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic g(Lfg;)Lcf1;
    .locals 0

    iget-object p0, p0, Lfg;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic h(Lfg;)Lgz5;
    .locals 0

    iget-object p0, p0, Lfg;->d:Lgz5;

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
.method public a(Lco/bird/android/model/constant/AnnouncementContext;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AnnouncementContext;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM announcement WHERE context = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-static {p1}, Ldg;->g(Lco/bird/android/model/constant/AnnouncementContext;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lfg;->a:LEb5;

    const-string v1, "announcement"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lfg$f;

    invoke-direct {v2, p0, v0}, Lfg$f;-><init>(Lfg;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public b(Lco/bird/android/model/constant/AnnouncementDisplayType;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AnnouncementDisplayType;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM announcement WHERE display_type = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-static {p1}, Ldg;->h(Lco/bird/android/model/constant/AnnouncementDisplayType;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lfg;->a:LEb5;

    const-string v1, "announcement"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lfg$g;

    invoke-direct {v2, p0, v0}, Lfg$g;-><init>(Lfg;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public c()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lfg$e;

    invoke-direct {v0, p0}, Lfg$e;-><init>(Lfg;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public varargs d([Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/c;
    .locals 1

    new-instance v0, Lfg$d;

    invoke-direct {v0, p0, p1}, Lfg$d;-><init>(Lfg;[Lco/bird/android/model/persistence/Announcement;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

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

    new-instance v0, Lfg$h;

    invoke-direct {v0, p0, p1}, Lfg$h;-><init>(Lfg;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
