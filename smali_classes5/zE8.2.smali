.class public final LzE8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LbE8;

.field public final c:LJC8;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/Integer;

.field public final g:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(LQD8;LmE8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LQD8;->o(LQD8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LzE8;->a:Ljava/lang/Long;

    invoke-static {p1}, LQD8;->i(LQD8;)LbE8;

    move-result-object p2

    iput-object p2, p0, LzE8;->b:LbE8;

    invoke-static {p1}, LQD8;->a(LQD8;)LJC8;

    move-result-object p2

    iput-object p2, p0, LzE8;->c:LJC8;

    invoke-static {p1}, LQD8;->k(LQD8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LzE8;->d:Ljava/lang/Integer;

    invoke-static {p1}, LQD8;->m(LQD8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LzE8;->e:Ljava/lang/Integer;

    invoke-static {p1}, LQD8;->l(LQD8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LzE8;->f:Ljava/lang/Integer;

    invoke-static {p1}, LQD8;->n(LQD8;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LzE8;->g:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()LJC8;
    .locals 1
    .annotation build Lin7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LzE8;->c:LJC8;

    return-object v0
.end method

.method public final b()LbE8;
    .locals 1
    .annotation build Lin7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LzE8;->b:LbE8;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build Lin7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LzE8;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1
    .annotation build Lin7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LzE8;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build Lin7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LzE8;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1
    .annotation build Lin7;
        zza = 0x7
    .end annotation

    iget-object v0, p0, LzE8;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()Ljava/lang/Long;
    .locals 1
    .annotation build Lin7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LzE8;->a:Ljava/lang/Long;

    return-object v0
.end method
