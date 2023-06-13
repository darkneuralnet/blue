.class public final LvX8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LHL7;

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

.method public static bridge synthetic a(LvX8;)LHL7;
    .locals 0

    iget-object p0, p0, LvX8;->e:LHL7;

    return-object p0
.end method

.method public static bridge synthetic n(LvX8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LvX8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic o(LvX8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LvX8;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic p(LvX8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LvX8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic q(LvX8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LvX8;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic r(LvX8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LvX8;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic s(LvX8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LvX8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic t(LvX8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LvX8;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic u(LvX8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LvX8;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic v(LvX8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LvX8;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic w(LvX8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LvX8;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)LvX8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LvX8;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(Ljava/lang/Boolean;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final h(LHL7;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->e:LHL7;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/Integer;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public final l(Ljava/lang/String;)LvX8;
    .locals 0

    iput-object p1, p0, LvX8;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final m()LPX8;
    .locals 2

    new-instance v0, LPX8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LPX8;-><init>(LvX8;LFX8;)V

    return-object v0
.end method
