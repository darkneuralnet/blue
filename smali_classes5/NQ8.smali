.class public final LNQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LeL7;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Boolean;

.field public h:Ljava/lang/Boolean;

.field public i:Ljava/lang/Boolean;

.field public j:Ljava/lang/Integer;

.field public k:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LNQ8;)LeL7;
    .locals 0

    iget-object p0, p0, LNQ8;->e:LeL7;

    return-object p0
.end method

.method public static bridge synthetic n(LNQ8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LNQ8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic o(LNQ8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LNQ8;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic p(LNQ8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LNQ8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic q(LNQ8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LNQ8;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic r(LNQ8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LNQ8;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic s(LNQ8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LNQ8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic t(LNQ8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LNQ8;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic u(LNQ8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LNQ8;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic v(LNQ8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LNQ8;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic w(LNQ8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LNQ8;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)LNQ8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LNQ8;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(LeL7;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->e:LeL7;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/Integer;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public final l(Ljava/lang/String;)LNQ8;
    .locals 0

    iput-object p1, p0, LNQ8;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final m()LhR8;
    .locals 2

    new-instance v0, LhR8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LhR8;-><init>(LNQ8;LXQ8;)V

    return-object v0
.end method
