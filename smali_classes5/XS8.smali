.class public final LXS8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LEd9;

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

.method public static bridge synthetic a(LXS8;)LEd9;
    .locals 0

    iget-object p0, p0, LXS8;->e:LEd9;

    return-object p0
.end method

.method public static bridge synthetic n(LXS8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LXS8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic o(LXS8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LXS8;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic p(LXS8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LXS8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic q(LXS8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LXS8;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic r(LXS8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LXS8;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic s(LXS8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LXS8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic t(LXS8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LXS8;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic u(LXS8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LXS8;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic v(LXS8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LXS8;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic w(LXS8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LXS8;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)LXS8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LXS8;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(LEd9;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->e:LEd9;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/Integer;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public final l(Ljava/lang/String;)LXS8;
    .locals 0

    iput-object p1, p0, LXS8;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final m()LVT8;
    .locals 2

    new-instance v0, LVT8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LVT8;-><init>(LXS8;LiT8;)V

    return-object v0
.end method
