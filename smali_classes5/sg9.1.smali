.class public final Lsg9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LxL7;

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

.method public static bridge synthetic a(Lsg9;)LxL7;
    .locals 0

    iget-object p0, p0, Lsg9;->e:LxL7;

    return-object p0
.end method

.method public static bridge synthetic n(Lsg9;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lsg9;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic o(Lsg9;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lsg9;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic p(Lsg9;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lsg9;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic q(Lsg9;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lsg9;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic r(Lsg9;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lsg9;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic s(Lsg9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lsg9;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic t(Lsg9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lsg9;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic u(Lsg9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lsg9;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic v(Lsg9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lsg9;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic w(Lsg9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lsg9;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)Lsg9;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    const/16 p1, 0xa

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lsg9;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(LxL7;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->e:LxL7;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/Integer;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public final l(Ljava/lang/String;)Lsg9;
    .locals 0

    iput-object p1, p0, Lsg9;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final m()LGg9;
    .locals 2

    new-instance v0, LGg9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LGg9;-><init>(Lsg9;Lzg9;)V

    return-object v0
.end method
