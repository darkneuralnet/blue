.class public final LfI8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Long;

.field public final c:Ljava/lang/Long;

.field public final d:Ljava/lang/Long;

.field public final e:Ljava/lang/Long;

.field public final f:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(LHH8;LTH8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LHH8;->j(LHH8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LfI8;->a:Ljava/lang/Long;

    invoke-static {p1}, LHH8;->l(LHH8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LfI8;->b:Ljava/lang/Long;

    invoke-static {p1}, LHH8;->h(LHH8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LfI8;->c:Ljava/lang/Long;

    invoke-static {p1}, LHH8;->i(LHH8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LfI8;->d:Ljava/lang/Long;

    invoke-static {p1}, LHH8;->k(LHH8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LfI8;->e:Ljava/lang/Long;

    invoke-static {p1}, LHH8;->m(LHH8;)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LfI8;->f:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LfI8;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LfI8;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public final c()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LfI8;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LfI8;->e:Ljava/lang/Long;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LfI8;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 1
    .annotation build LmW7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LfI8;->f:Ljava/lang/Long;

    return-object v0
.end method
