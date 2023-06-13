.class public final LqR8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LNL8;

.field public final b:LRK8;

.field public final c:LWJ8;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(LWQ8;LgR8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LWQ8;->c(LWQ8;)LNL8;

    move-result-object p2

    iput-object p2, p0, LqR8;->a:LNL8;

    invoke-static {p1}, LWQ8;->b(LWQ8;)LRK8;

    move-result-object p2

    iput-object p2, p0, LqR8;->b:LRK8;

    invoke-static {p1}, LWQ8;->a(LWQ8;)LWJ8;

    move-result-object p2

    iput-object p2, p0, LqR8;->c:LWJ8;

    invoke-static {p1}, LWQ8;->j(LWQ8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LqR8;->d:Ljava/lang/Integer;

    invoke-static {p1}, LWQ8;->k(LWQ8;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LqR8;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()LWJ8;
    .locals 1
    .annotation build LmW7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LqR8;->c:LWJ8;

    return-object v0
.end method

.method public final b()LRK8;
    .locals 1
    .annotation build LmW7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LqR8;->b:LRK8;

    return-object v0
.end method

.method public final c()LNL8;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LqR8;->a:LNL8;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LqR8;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LqR8;->e:Ljava/lang/Integer;

    return-object v0
.end method
