.class public final LG39;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LG59;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(LG39;)LG59;
    .locals 0

    iget-object p0, p0, LG39;->b:LG59;

    return-object p0
.end method

.method public static bridge synthetic h(LG39;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LG39;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic i(LG39;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LG39;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic j(LG39;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LG39;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic k(LG39;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LG39;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LG39;
    .locals 0

    iput-object p1, p0, LG39;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(Ljava/lang/Boolean;)LG39;
    .locals 0

    iput-object p1, p0, LG39;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Ljava/lang/Long;)LG39;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LG39;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final d(LG59;)LG39;
    .locals 0

    iput-object p1, p0, LG39;->b:LG59;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LG39;
    .locals 0

    iput-object p1, p0, LG39;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f()LY39;
    .locals 2

    new-instance v0, LY39;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LY39;-><init>(LG39;LP39;)V

    return-object v0
.end method
