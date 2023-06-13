.class public final LU39;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LX29;

.field public b:LcW8;

.field public c:Ljava/lang/Long;

.field public d:Lbw7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LU39;)Lbw7;
    .locals 0

    iget-object p0, p0, LU39;->d:Lbw7;

    return-object p0
.end method

.method public static bridge synthetic b(LU39;)LcW8;
    .locals 0

    iget-object p0, p0, LU39;->b:LcW8;

    return-object p0
.end method

.method public static bridge synthetic c(LU39;)LX29;
    .locals 0

    iget-object p0, p0, LU39;->a:LX29;

    return-object p0
.end method

.method public static bridge synthetic i(LU39;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LU39;->c:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final d(LX29;)LU39;
    .locals 0

    iput-object p1, p0, LU39;->a:LX29;

    return-object p0
.end method

.method public final e(LcW8;)LU39;
    .locals 0

    iput-object p1, p0, LU39;->b:LcW8;

    return-object p0
.end method

.method public final f(Lbw7;)LU39;
    .locals 0

    iput-object p1, p0, LU39;->d:Lbw7;

    return-object p0
.end method

.method public final g(Ljava/lang/Long;)LU39;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LU39;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public final h()Ll49;
    .locals 2

    new-instance v0, Ll49;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll49;-><init>(LU39;Ld49;)V

    return-object v0
.end method
