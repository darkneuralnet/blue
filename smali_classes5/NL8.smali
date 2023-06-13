.class public final LNL8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LZN8;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(LpL8;LBL8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LpL8;->k(LpL8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LNL8;->a:Ljava/lang/Long;

    invoke-static {p1}, LpL8;->g(LpL8;)LZN8;

    move-result-object p2

    iput-object p2, p0, LNL8;->b:LZN8;

    invoke-static {p1}, LpL8;->j(LpL8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LNL8;->c:Ljava/lang/Boolean;

    invoke-static {p1}, LpL8;->h(LpL8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LNL8;->d:Ljava/lang/Boolean;

    invoke-static {p1}, LpL8;->i(LpL8;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LNL8;->e:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()LZN8;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LNL8;->b:LZN8;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LNL8;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LNL8;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LNL8;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LNL8;->a:Ljava/lang/Long;

    return-object v0
.end method
