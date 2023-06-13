.class public final LNq0;
.super LMq0;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;

.field public final e:Lgz5;

.field public final f:Lgz5;

.field public final g:Lgz5;

.field public final h:Lgz5;

.field public final i:Lgz5;

.field public final j:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LMq0;-><init>()V

    iput-object p1, p0, LNq0;->a:LEb5;

    new-instance v0, LNq0$k;

    invoke-direct {v0, p0, p1}, LNq0$k;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->b:Lcf1;

    new-instance v0, LNq0$l;

    invoke-direct {v0, p0, p1}, LNq0$l;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->c:Lgz5;

    new-instance v0, LNq0$m;

    invoke-direct {v0, p0, p1}, LNq0$m;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->d:Lgz5;

    new-instance v0, LNq0$n;

    invoke-direct {v0, p0, p1}, LNq0$n;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->e:Lgz5;

    new-instance v0, LNq0$o;

    invoke-direct {v0, p0, p1}, LNq0$o;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->f:Lgz5;

    new-instance v0, LNq0$p;

    invoke-direct {v0, p0, p1}, LNq0$p;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->g:Lgz5;

    new-instance v0, LNq0$q;

    invoke-direct {v0, p0, p1}, LNq0$q;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->h:Lgz5;

    new-instance v0, LNq0$r;

    invoke-direct {v0, p0, p1}, LNq0$r;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->i:Lgz5;

    new-instance v0, LNq0$s;

    invoke-direct {v0, p0, p1}, LNq0$s;-><init>(LNq0;LEb5;)V

    iput-object v0, p0, LNq0;->j:Lgz5;

    return-void
.end method

.method public static bridge synthetic k(LNq0;)LEb5;
    .locals 0

    iget-object p0, p0, LNq0;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic l(LNq0;)Lcf1;
    .locals 0

    iget-object p0, p0, LNq0;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic m(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->j:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic n(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->f:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic o(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->g:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic p(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic q(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->c:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic r(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->e:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic s(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->h:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic t(LNq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LNq0;->i:Lgz5;

    return-object p0
.end method

.method public static u()Ljava/util/List;
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

    new-instance v0, LNq0$i;

    invoke-direct {v0, p0}, LNq0$i;-><init>(LNq0;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lio/reactivex/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM complaint_resolution WHERE complaint_hash = ? LIMIT 1"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, LHb5;->S0(IJ)V

    new-instance p1, LNq0$j;

    invoke-direct {p1, p0, v0}, LNq0$j;-><init>(LNq0;LHb5;)V

    invoke-static {p1}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public c(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LNq0$a;

    invoke-direct {v0, p0, p1}, LNq0$a;-><init>(LNq0;Lco/bird/android/model/persistence/ComplaintResolution;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Lio/reactivex/c;
    .locals 1

    new-instance v0, LNq0$e;

    invoke-direct {v0, p0, p1}, LNq0$e;-><init>(LNq0;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public e(ILjava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LNq0$f;

    invoke-direct {v0, p0, p2, p1}, LNq0$f;-><init>(LNq0;Ljava/lang/String;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public f(ILjava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LNq0$c;

    invoke-direct {v0, p0, p2, p3, p1}, LNq0$c;-><init>(LNq0;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public g(ILjava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LNq0$b;

    invoke-direct {v0, p0, p2, p3, p1}, LNq0$b;-><init>(LNq0;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public h(ILjava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LNq0$d;

    invoke-direct {v0, p0, p2, p1}, LNq0$d;-><init>(LNq0;Ljava/util/List;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public i(ILjava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LNq0$g;

    invoke-direct {v0, p0, p2, p1}, LNq0$g;-><init>(LNq0;Ljava/lang/String;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public j(ILjava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LNq0$h;

    invoke-direct {v0, p0, p2, p1}, LNq0$h;-><init>(LNq0;Ljava/util/List;I)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
