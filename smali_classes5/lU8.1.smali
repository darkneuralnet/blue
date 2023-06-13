.class public final LlU8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LcW8;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;

.field public f:Lbw7;

.field public g:Ljava/lang/Boolean;

.field public h:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LlU8;)Lbw7;
    .locals 0

    iget-object p0, p0, LlU8;->f:Lbw7;

    return-object p0
.end method

.method public static bridge synthetic k(LlU8;)LcW8;
    .locals 0

    iget-object p0, p0, LlU8;->b:LcW8;

    return-object p0
.end method

.method public static bridge synthetic l(LlU8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LlU8;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic m(LlU8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LlU8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic n(LlU8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LlU8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic o(LlU8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LlU8;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic p(LlU8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LlU8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic q(LlU8;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LlU8;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Boolean;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Ljava/lang/Boolean;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final d(Ljava/lang/Long;)LlU8;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LlU8;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final e(LcW8;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->b:LcW8;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(Lbw7;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->f:Lbw7;

    return-object p0
.end method

.method public final i(Ljava/lang/Boolean;)LlU8;
    .locals 0

    iput-object p1, p0, LlU8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final j()LFU8;
    .locals 2

    new-instance v0, LFU8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LFU8;-><init>(LlU8;LwU8;)V

    return-object v0
.end method
