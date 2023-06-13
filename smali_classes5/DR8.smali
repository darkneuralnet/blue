.class public final LDR8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/Long;

.field public c:Ljava/lang/Long;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic h(LDR8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LDR8;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic i(LDR8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LDR8;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic j(LDR8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LDR8;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic k(LDR8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LDR8;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic l(LDR8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LDR8;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic m(LDR8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LDR8;->f:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LDR8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LDR8;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public final b(Ljava/lang/Long;)LDR8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LDR8;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public final c(Ljava/lang/Long;)LDR8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LDR8;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final d(Ljava/lang/Long;)LDR8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LDR8;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public final e(Ljava/lang/Long;)LDR8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LDR8;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public final f(Ljava/lang/Long;)LDR8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LDR8;->f:Ljava/lang/Long;

    return-object p0
.end method

.method public final g()LZR8;
    .locals 2

    new-instance v0, LZR8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LZR8;-><init>(LDR8;LOR8;)V

    return-object v0
.end method
