.class public final LCm7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LvU8;

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

.method public static bridge synthetic a(LCm7;)LvU8;
    .locals 0

    iget-object p0, p0, LCm7;->e:LvU8;

    return-object p0
.end method

.method public static bridge synthetic n(LCm7;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LCm7;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic o(LCm7;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LCm7;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic p(LCm7;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LCm7;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic q(LCm7;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LCm7;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic r(LCm7;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LCm7;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic s(LCm7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LCm7;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic t(LCm7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LCm7;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic u(LCm7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LCm7;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic v(LCm7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LCm7;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic w(LCm7;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LCm7;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)LCm7;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LCm7;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(LvU8;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->e:LvU8;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/Integer;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public final l(Ljava/lang/String;)LCm7;
    .locals 0

    iput-object p1, p0, LCm7;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final m()LEm7;
    .locals 2

    new-instance v0, LEm7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LEm7;-><init>(LCm7;LDm7;)V

    return-object v0
.end method
