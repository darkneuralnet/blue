.class public final Ldz9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LvU8;

.field public final c:LvU8;

.field public final d:LvU8;

.field public final e:Ljava/lang/String;

.field public final f:Laz9;


# direct methods
.method public synthetic constructor <init>(LZy9;Lcz9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LZy9;->l(LZy9;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Ldz9;->a:Ljava/lang/Long;

    invoke-static {p1}, LZy9;->a(LZy9;)LvU8;

    move-result-object p2

    iput-object p2, p0, Ldz9;->b:LvU8;

    invoke-static {p1}, LZy9;->b(LZy9;)LvU8;

    move-result-object p2

    iput-object p2, p0, Ldz9;->c:LvU8;

    invoke-static {p1}, LZy9;->c(LZy9;)LvU8;

    move-result-object p2

    iput-object p2, p0, Ldz9;->d:LvU8;

    invoke-static {p1}, LZy9;->m(LZy9;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ldz9;->e:Ljava/lang/String;

    invoke-static {p1}, LZy9;->j(LZy9;)Laz9;

    move-result-object p1

    iput-object p1, p0, Ldz9;->f:Laz9;

    return-void
.end method


# virtual methods
.method public final a()LvU8;
    .locals 1
    .annotation build Lt29;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Ldz9;->b:LvU8;

    return-object v0
.end method

.method public final b()LvU8;
    .locals 1
    .annotation build Lt29;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Ldz9;->c:LvU8;

    return-object v0
.end method

.method public final c()LvU8;
    .locals 1
    .annotation build Lt29;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Ldz9;->d:LvU8;

    return-object v0
.end method

.method public final d()Laz9;
    .locals 1
    .annotation build Lt29;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Ldz9;->f:Laz9;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build Lt29;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Ldz9;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lt29;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Ldz9;->e:Ljava/lang/String;

    return-object v0
.end method
