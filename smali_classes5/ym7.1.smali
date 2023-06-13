.class public final Lym7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LvU8;

.field public c:LvU8;

.field public d:LvU8;

.field public e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lym7;)LvU8;
    .locals 0

    iget-object p0, p0, Lym7;->b:LvU8;

    return-object p0
.end method

.method public static bridge synthetic b(Lym7;)LvU8;
    .locals 0

    iget-object p0, p0, Lym7;->c:LvU8;

    return-object p0
.end method

.method public static bridge synthetic c(Lym7;)LvU8;
    .locals 0

    iget-object p0, p0, Lym7;->d:LvU8;

    return-object p0
.end method

.method public static bridge synthetic j(Lym7;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lym7;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic k(Lym7;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lym7;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/Long;)Lym7;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lym7;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final e(LvU8;)Lym7;
    .locals 0

    iput-object p1, p0, Lym7;->b:LvU8;

    return-object p0
.end method

.method public final f(Ljava/lang/Integer;)Lym7;
    .locals 0

    iput-object p1, p0, Lym7;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public final g(LvU8;)Lym7;
    .locals 0

    iput-object p1, p0, Lym7;->c:LvU8;

    return-object p0
.end method

.method public final h(LvU8;)Lym7;
    .locals 0

    iput-object p1, p0, Lym7;->d:LvU8;

    return-object p0
.end method

.method public final i()LBm7;
    .locals 2

    new-instance v0, LBm7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LBm7;-><init>(Lym7;LAm7;)V

    return-object v0
.end method
