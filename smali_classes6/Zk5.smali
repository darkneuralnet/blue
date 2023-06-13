.class public LZk5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/reactivex/E;

.field public final b:Lio/reactivex/C;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/C;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/C;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/E;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LZk5$e;

    invoke-direct {v0, p0}, LZk5$e;-><init>(LZk5;)V

    iput-object v0, p0, LZk5;->c:Lio/reactivex/C;

    new-instance v0, LZk5$g;

    invoke-direct {v0, p0}, LZk5$g;-><init>(LZk5;)V

    iput-object v0, p0, LZk5;->d:Lio/reactivex/C;

    iput-object p1, p0, LZk5;->a:Lio/reactivex/E;

    new-instance v0, LZk5$a;

    invoke-direct {v0, p0, p1}, LZk5$a;-><init>(LZk5;Lio/reactivex/E;)V

    iput-object v0, p0, LZk5;->b:Lio/reactivex/C;

    return-void
.end method

.method public static f(Lio/reactivex/C;)Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;)",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    new-instance v0, LZk5$c;

    invoke-direct {v0, p0}, LZk5$c;-><init>(Lio/reactivex/C;)V

    return-object v0
.end method

.method public static g()Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    new-instance v0, LZk5$d;

    invoke-direct {v0}, LZk5$d;-><init>()V

    return-object v0
.end method

.method public static h()Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    new-instance v0, LZk5$f;

    invoke-direct {v0}, LZk5$f;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(I)Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    invoke-static {}, Lde3;->a()Lio/reactivex/C;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LZk5;->d:Lio/reactivex/C;

    invoke-static {p1}, LZk5;->f(Lio/reactivex/C;)Lio/reactivex/C;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, LZk5;->c:Lio/reactivex/C;

    invoke-static {p1}, LZk5;->f(Lio/reactivex/C;)Lio/reactivex/C;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, LZk5;->b:Lio/reactivex/C;

    invoke-static {p1}, LZk5;->f(Lio/reactivex/C;)Lio/reactivex/C;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    invoke-static {}, Lde3;->a()Lio/reactivex/C;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LZk5;->d()Lio/reactivex/C;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power"

    invoke-static {v0, p1}, Lye5;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p0}, LZk5;->e()Lio/reactivex/C;

    move-result-object p1

    return-object p1
.end method

.method public final c(I)Lio/reactivex/C;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    int-to-long v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    new-instance v2, LZk5$b;

    invoke-direct {v2, p0, p1, v0, v1}, LZk5$b;-><init>(LZk5;IJ)V

    return-object v2
.end method

.method public final d()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x9c4

    invoke-virtual {p0, v0}, LZk5;->c(I)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/C<",
            "Lxe5;",
            "Lxe5;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, LZk5;->c(I)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method
