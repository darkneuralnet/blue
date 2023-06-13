.class public final LZy9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LvU8;

.field public c:LvU8;

.field public d:LvU8;

.field public e:Ljava/lang/String;

.field public f:Laz9;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LZy9;)LvU8;
    .locals 0

    iget-object p0, p0, LZy9;->b:LvU8;

    return-object p0
.end method

.method public static bridge synthetic b(LZy9;)LvU8;
    .locals 0

    iget-object p0, p0, LZy9;->c:LvU8;

    return-object p0
.end method

.method public static bridge synthetic c(LZy9;)LvU8;
    .locals 0

    iget-object p0, p0, LZy9;->d:LvU8;

    return-object p0
.end method

.method public static bridge synthetic j(LZy9;)Laz9;
    .locals 0

    iget-object p0, p0, LZy9;->f:Laz9;

    return-object p0
.end method

.method public static bridge synthetic l(LZy9;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LZy9;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic m(LZy9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LZy9;->e:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final d(Laz9;)LZy9;
    .locals 0

    iput-object p1, p0, LZy9;->f:Laz9;

    return-object p0
.end method

.method public final e(Ljava/lang/Long;)LZy9;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LZy9;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final f(LvU8;)LZy9;
    .locals 0

    iput-object p1, p0, LZy9;->b:LvU8;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)LZy9;
    .locals 0

    const-string p1, "com.google.perception"

    iput-object p1, p0, LZy9;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final h(LvU8;)LZy9;
    .locals 0

    iput-object p1, p0, LZy9;->c:LvU8;

    return-object p0
.end method

.method public final i(LvU8;)LZy9;
    .locals 0

    iput-object p1, p0, LZy9;->d:LvU8;

    return-object p0
.end method

.method public final k()Ldz9;
    .locals 2

    new-instance v0, Ldz9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldz9;-><init>(LZy9;Lcz9;)V

    return-object v0
.end method
