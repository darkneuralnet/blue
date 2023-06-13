.class public final LQD8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LbE8;

.field public c:LJC8;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/Integer;

.field public f:Ljava/lang/Integer;

.field public g:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LQD8;)LJC8;
    .locals 0

    iget-object p0, p0, LQD8;->c:LJC8;

    return-object p0
.end method

.method public static bridge synthetic i(LQD8;)LbE8;
    .locals 0

    iget-object p0, p0, LQD8;->b:LbE8;

    return-object p0
.end method

.method public static bridge synthetic k(LQD8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LQD8;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic l(LQD8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LQD8;->f:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic m(LQD8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LQD8;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic n(LQD8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LQD8;->g:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic o(LQD8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LQD8;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Long;)LQD8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LQD8;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final c(Ljava/lang/Integer;)LQD8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LQD8;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d(LJC8;)LQD8;
    .locals 0

    iput-object p1, p0, LQD8;->c:LJC8;

    return-object p0
.end method

.method public final e(Ljava/lang/Integer;)LQD8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LQD8;->f:Ljava/lang/Integer;

    return-object p0
.end method

.method public final f(LbE8;)LQD8;
    .locals 0

    iput-object p1, p0, LQD8;->b:LbE8;

    return-object p0
.end method

.method public final g(Ljava/lang/Integer;)LQD8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LQD8;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public final h(Ljava/lang/Integer;)LQD8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LQD8;->g:Ljava/lang/Integer;

    return-object p0
.end method

.method public final j()LzE8;
    .locals 2

    new-instance v0, LzE8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LzE8;-><init>(LQD8;LmE8;)V

    return-object v0
.end method
