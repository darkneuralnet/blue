.class public final LY79;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY39;

.field public final b:LLk9;

.field public final c:LDR7;

.field public final d:LDR7;

.field public final e:LJ29;


# direct methods
.method public synthetic constructor <init>(LK79;LQ79;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LK79;->d(LK79;)LY39;

    move-result-object p2

    iput-object p2, p0, LY79;->a:LY39;

    invoke-static {p1}, LK79;->k(LK79;)LLk9;

    move-result-object p2

    iput-object p2, p0, LY79;->b:LLk9;

    invoke-static {p1}, LK79;->a(LK79;)LDR7;

    move-result-object p2

    iput-object p2, p0, LY79;->c:LDR7;

    invoke-static {p1}, LK79;->b(LK79;)LDR7;

    move-result-object p2

    iput-object p2, p0, LY79;->d:LDR7;

    invoke-static {p1}, LK79;->c(LK79;)LJ29;

    move-result-object p1

    iput-object p1, p0, LY79;->e:LJ29;

    return-void
.end method


# virtual methods
.method public final a()LDR7;
    .locals 1
    .annotation build LD18;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LY79;->c:LDR7;

    return-object v0
.end method

.method public final b()LDR7;
    .locals 1
    .annotation build LD18;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LY79;->d:LDR7;

    return-object v0
.end method

.method public final c()LJ29;
    .locals 1
    .annotation build LD18;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LY79;->e:LJ29;

    return-object v0
.end method

.method public final d()LY39;
    .locals 1
    .annotation build LD18;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LY79;->a:LY39;

    return-object v0
.end method

.method public final e()LLk9;
    .locals 1
    .annotation build LD18;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LY79;->b:LLk9;

    return-object v0
.end method
