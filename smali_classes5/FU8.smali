.class public final LFU8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LcW8;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/Boolean;

.field public final f:Lbw7;

.field public final g:Ljava/lang/Boolean;

.field public final h:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(LlU8;LwU8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LlU8;->q(LlU8;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LFU8;->a:Ljava/lang/Long;

    invoke-static {p1}, LlU8;->k(LlU8;)LcW8;

    move-result-object p2

    iput-object p2, p0, LFU8;->b:LcW8;

    invoke-static {p1}, LlU8;->o(LlU8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LFU8;->c:Ljava/lang/Boolean;

    invoke-static {p1}, LlU8;->l(LlU8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LFU8;->d:Ljava/lang/Boolean;

    invoke-static {p1}, LlU8;->m(LlU8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LFU8;->e:Ljava/lang/Boolean;

    invoke-static {p1}, LlU8;->a(LlU8;)Lbw7;

    move-result-object p2

    iput-object p2, p0, LFU8;->f:Lbw7;

    invoke-static {p1}, LlU8;->p(LlU8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LFU8;->g:Ljava/lang/Boolean;

    invoke-static {p1}, LlU8;->n(LlU8;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LFU8;->h:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()Lbw7;
    .locals 1
    .annotation build LfR7;
        zza = 0x8
    .end annotation

    iget-object v0, p0, LFU8;->f:Lbw7;

    return-object v0
.end method

.method public final b()LcW8;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LFU8;->b:LcW8;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LFU8;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LFU8;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0xa
    .end annotation

    iget-object v0, p0, LFU8;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LFU8;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final g()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0x9
    .end annotation

    iget-object v0, p0, LFU8;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final h()Ljava/lang/Long;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LFU8;->a:Ljava/lang/Long;

    return-object v0
.end method
