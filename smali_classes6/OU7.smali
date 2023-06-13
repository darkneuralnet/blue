.class public final LOU7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String;

.field public static e:LOU7;


# instance fields
.field public final a:LbV7;

.field public final b:LXS7;

.field public c:LRQ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRQ8<",
            "LAu9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0}, LnU7;->a(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LOU7;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LbV7;LXS7;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LOU7;->b:LXS7;

    iput-object p1, p0, LOU7;->a:LbV7;

    invoke-static {}, LRQ8;->w()LRQ8;

    move-result-object p1

    iput-object p1, p0, LOU7;->c:LRQ8;

    return-void
.end method

.method public static b()LOU7;
    .locals 3

    sget-object v0, LOU7;->e:LOU7;

    if-nez v0, :cond_0

    new-instance v0, LOU7;

    new-instance v1, LbV7;

    invoke-direct {v1}, LbV7;-><init>()V

    new-instance v2, LXS7;

    invoke-direct {v2}, LXS7;-><init>()V

    invoke-direct {v0, v1, v2}, LOU7;-><init>(LbV7;LXS7;)V

    sput-object v0, LOU7;->e:LOU7;

    :cond_0
    sget-object v0, LOU7;->e:LOU7;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)LXT7;
    .locals 5

    new-instance v0, LkQ8;

    invoke-direct {v0}, LkQ8;-><init>()V

    iget-object v1, p0, LOU7;->c:LRQ8;

    invoke-virtual {v1}, LRQ8;->f()LbU8;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAu9;

    :try_start_0
    invoke-virtual {v2}, LAu9;->zza()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, LOU7;->b:LXS7;

    invoke-static {v2, p1, v4}, LbV7;->a(LAu9;Landroid/content/Context;LXS7;)Lnh9;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, LkQ8;->a(Ljava/lang/Object;Ljava/lang/Object;)LkQ8;
    :try_end_0
    .catch LmT7; {:try_start_0 .. :try_end_0} :catch_1
    .catch LaU7; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    :goto_1
    sget-object v3, LOU7;->d:Ljava/lang/String;

    invoke-static {v3, v2}, LHo7;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LkQ8;->b()LvQ8;

    move-result-object p1

    iget-object v0, p0, LOU7;->b:LXS7;

    invoke-virtual {v0}, LXS7;->e()Lwu9;

    move-result-object v0

    invoke-static {p1, v0}, LXT7;->c(LvQ8;Lwu9;)LXT7;

    move-result-object p1

    return-object p1
.end method

.method public final c(LAT7;)V
    .locals 1

    invoke-virtual {p1}, LAT7;->a()LZP8;

    move-result-object v0

    invoke-static {v0}, LRQ8;->v(Ljava/util/Collection;)LRQ8;

    move-result-object v0

    iput-object v0, p0, LOU7;->c:LRQ8;

    iget-object v0, p0, LOU7;->b:LXS7;

    invoke-virtual {p1}, LAT7;->b()Lsu9;

    move-result-object p1

    invoke-virtual {v0, p1}, LXS7;->f(Lsu9;)V

    return-void
.end method
