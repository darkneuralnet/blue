.class public final LSO8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LPX8;

.field public final b:LlO8;

.field public final c:LgN8;

.field public final d:LqR8;

.field public final e:LWR8;

.field public final f:Ly28;


# direct methods
.method public synthetic constructor <init>(LxO8;LHO8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LxO8;->m(LxO8;)LPX8;

    move-result-object p2

    iput-object p2, p0, LSO8;->a:LPX8;

    invoke-static {p1}, LxO8;->c(LxO8;)LlO8;

    move-result-object p2

    iput-object p2, p0, LSO8;->b:LlO8;

    invoke-static {p1}, LxO8;->b(LxO8;)LgN8;

    move-result-object p2

    iput-object p2, p0, LSO8;->c:LgN8;

    invoke-static {p1}, LxO8;->k(LxO8;)LqR8;

    move-result-object p2

    iput-object p2, p0, LSO8;->d:LqR8;

    invoke-static {p1}, LxO8;->l(LxO8;)LWR8;

    move-result-object p2

    iput-object p2, p0, LSO8;->e:LWR8;

    invoke-static {p1}, LxO8;->a(LxO8;)Ly28;

    move-result-object p1

    iput-object p1, p0, LSO8;->f:Ly28;

    return-void
.end method


# virtual methods
.method public final a()Ly28;
    .locals 1
    .annotation build LmW7;
        zza = 0x20
    .end annotation

    iget-object v0, p0, LSO8;->f:Ly28;

    return-object v0
.end method

.method public final b()LgN8;
    .locals 1
    .annotation build LmW7;
        zza = 0x3d
    .end annotation

    iget-object v0, p0, LSO8;->c:LgN8;

    return-object v0
.end method

.method public final c()LlO8;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LSO8;->b:LlO8;

    return-object v0
.end method

.method public final d()LqR8;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LSO8;->d:LqR8;

    return-object v0
.end method

.method public final e()LWR8;
    .locals 1
    .annotation build LmW7;
        zza = 0x3b
    .end annotation

    iget-object v0, p0, LSO8;->e:LWR8;

    return-object v0
.end method

.method public final f()LPX8;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LSO8;->a:LPX8;

    return-object v0
.end method
