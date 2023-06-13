.class public final LPX8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:LHL7;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/Boolean;

.field public final h:Ljava/lang/Boolean;

.field public final i:Ljava/lang/Boolean;

.field public final j:Ljava/lang/Integer;

.field public final k:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(LvX8;LFX8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LvX8;->s(LvX8;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LPX8;->a:Ljava/lang/String;

    invoke-static {p1}, LvX8;->t(LvX8;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LPX8;->b:Ljava/lang/String;

    invoke-static {p1}, LvX8;->v(LvX8;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LPX8;->c:Ljava/lang/String;

    invoke-static {p1}, LvX8;->w(LvX8;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LPX8;->d:Ljava/lang/String;

    invoke-static {p1}, LvX8;->a(LvX8;)LHL7;

    move-result-object p2

    iput-object p2, p0, LPX8;->e:LHL7;

    invoke-static {p1}, LvX8;->u(LvX8;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LPX8;->f:Ljava/lang/String;

    invoke-static {p1}, LvX8;->n(LvX8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LPX8;->g:Ljava/lang/Boolean;

    invoke-static {p1}, LvX8;->p(LvX8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LPX8;->h:Ljava/lang/Boolean;

    invoke-static {p1}, LvX8;->o(LvX8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LPX8;->i:Ljava/lang/Boolean;

    invoke-static {p1}, LvX8;->q(LvX8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LPX8;->j:Ljava/lang/Integer;

    invoke-static {p1}, LvX8;->r(LvX8;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LPX8;->k:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()LHL7;
    .locals 1
    .annotation build LmW7;
        zza = 0x8
    .end annotation

    iget-object v0, p0, LPX8;->e:LHL7;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0xa
    .end annotation

    iget-object v0, p0, LPX8;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0xc
    .end annotation

    iget-object v0, p0, LPX8;->i:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0xb
    .end annotation

    iget-object v0, p0, LPX8;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0xd
    .end annotation

    iget-object v0, p0, LPX8;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0xe
    .end annotation

    iget-object v0, p0, LPX8;->k:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LPX8;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LPX8;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1
    .annotation build LmW7;
        zza = 0x9
    .end annotation

    iget-object v0, p0, LPX8;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1
    .annotation build LmW7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LPX8;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LPX8;->d:Ljava/lang/String;

    return-object v0
.end method
