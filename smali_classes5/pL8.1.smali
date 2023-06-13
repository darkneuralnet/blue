.class public final LpL8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LZN8;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(LpL8;)LZN8;
    .locals 0

    iget-object p0, p0, LpL8;->b:LZN8;

    return-object p0
.end method

.method public static bridge synthetic h(LpL8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LpL8;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic i(LpL8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LpL8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic j(LpL8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LpL8;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic k(LpL8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LpL8;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LpL8;
    .locals 0

    iput-object p1, p0, LpL8;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(Ljava/lang/Boolean;)LpL8;
    .locals 0

    iput-object p1, p0, LpL8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Ljava/lang/Long;)LpL8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LpL8;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final d(LZN8;)LpL8;
    .locals 0

    iput-object p1, p0, LpL8;->b:LZN8;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LpL8;
    .locals 0

    iput-object p1, p0, LpL8;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f()LNL8;
    .locals 2

    new-instance v0, LNL8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LNL8;-><init>(LpL8;LBL8;)V

    return-object v0
.end method
