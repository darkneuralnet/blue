.class public LLH6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLH6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:LJH6;

.field public b:J

.field public c:J

.field public d:[B

.field public e:[B

.field public f:[B

.field public g:[B

.field public h:Lxv;

.field public i:[B

.field public j:LRH6;


# direct methods
.method public constructor <init>(LJH6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LLH6$b;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LLH6$b;->c:J

    const/4 v0, 0x0

    iput-object v0, p0, LLH6$b;->d:[B

    iput-object v0, p0, LLH6$b;->e:[B

    iput-object v0, p0, LLH6$b;->f:[B

    iput-object v0, p0, LLH6$b;->g:[B

    iput-object v0, p0, LLH6$b;->h:Lxv;

    iput-object v0, p0, LLH6$b;->i:[B

    iput-object v0, p0, LLH6$b;->j:LRH6;

    iput-object p1, p0, LLH6$b;->a:LJH6;

    return-void
.end method

.method public static synthetic a(LLH6$b;)LJH6;
    .locals 0

    iget-object p0, p0, LLH6$b;->a:LJH6;

    return-object p0
.end method

.method public static synthetic b(LLH6$b;)[B
    .locals 0

    iget-object p0, p0, LLH6$b;->i:[B

    return-object p0
.end method

.method public static synthetic c(LLH6$b;)LRH6;
    .locals 0

    iget-object p0, p0, LLH6$b;->j:LRH6;

    return-object p0
.end method

.method public static synthetic d(LLH6$b;)J
    .locals 2

    iget-wide v0, p0, LLH6$b;->b:J

    return-wide v0
.end method

.method public static synthetic e(LLH6$b;)[B
    .locals 0

    iget-object p0, p0, LLH6$b;->d:[B

    return-object p0
.end method

.method public static synthetic f(LLH6$b;)[B
    .locals 0

    iget-object p0, p0, LLH6$b;->e:[B

    return-object p0
.end method

.method public static synthetic g(LLH6$b;)[B
    .locals 0

    iget-object p0, p0, LLH6$b;->f:[B

    return-object p0
.end method

.method public static synthetic h(LLH6$b;)[B
    .locals 0

    iget-object p0, p0, LLH6$b;->g:[B

    return-object p0
.end method

.method public static synthetic i(LLH6$b;)Lxv;
    .locals 0

    iget-object p0, p0, LLH6$b;->h:Lxv;

    return-object p0
.end method

.method public static synthetic j(LLH6$b;)J
    .locals 2

    iget-wide v0, p0, LLH6$b;->c:J

    return-wide v0
.end method


# virtual methods
.method public k()LLH6;
    .locals 2

    new-instance v0, LLH6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LLH6;-><init>(LLH6$b;LLH6$a;)V

    return-object v0
.end method

.method public l(Lxv;)LLH6$b;
    .locals 6

    invoke-virtual {p1}, Lxv;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Lxv;

    iget-object v1, p0, LLH6$b;->a:LJH6;

    invoke-virtual {v1}, LJH6;->a()I

    move-result v1

    const-wide/16 v2, 0x1

    shl-long v4, v2, v1

    sub-long/2addr v4, v2

    invoke-direct {v0, p1, v4, v5}, Lxv;-><init>(Lxv;J)V

    iput-object v0, p0, LLH6$b;->h:Lxv;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LLH6$b;->h:Lxv;

    :goto_0
    return-object p0
.end method

.method public m(J)LLH6$b;
    .locals 0

    iput-wide p1, p0, LLH6$b;->b:J

    return-object p0
.end method

.method public n(J)LLH6$b;
    .locals 0

    iput-wide p1, p0, LLH6$b;->c:J

    return-object p0
.end method

.method public o([B)LLH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LLH6$b;->f:[B

    return-object p0
.end method

.method public p([B)LLH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LLH6$b;->g:[B

    return-object p0
.end method

.method public q([B)LLH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LLH6$b;->e:[B

    return-object p0
.end method

.method public r([B)LLH6$b;
    .locals 0

    invoke-static {p1}, LWH6;->c([B)[B

    move-result-object p1

    iput-object p1, p0, LLH6$b;->d:[B

    return-object p0
.end method
