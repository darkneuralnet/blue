.class public final Lm69;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqh9;

.field public final b:LO59;

.field public final c:Ly59;

.field public final d:LY79;

.field public final e:Lv89;

.field public final f:Lp78;


# direct methods
.method public synthetic constructor <init>(LW59;Le69;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LW59;->m(LW59;)Lqh9;

    move-result-object p2

    iput-object p2, p0, Lm69;->a:Lqh9;

    invoke-static {p1}, LW59;->c(LW59;)LO59;

    move-result-object p2

    iput-object p2, p0, Lm69;->b:LO59;

    invoke-static {p1}, LW59;->b(LW59;)Ly59;

    move-result-object p2

    iput-object p2, p0, Lm69;->c:Ly59;

    invoke-static {p1}, LW59;->k(LW59;)LY79;

    move-result-object p2

    iput-object p2, p0, Lm69;->d:LY79;

    invoke-static {p1}, LW59;->l(LW59;)Lv89;

    move-result-object p2

    iput-object p2, p0, Lm69;->e:Lv89;

    invoke-static {p1}, LW59;->a(LW59;)Lp78;

    move-result-object p1

    iput-object p1, p0, Lm69;->f:Lp78;

    return-void
.end method


# virtual methods
.method public final a()Lp78;
    .locals 1
    .annotation build LD18;
        zza = 0x21
    .end annotation

    iget-object v0, p0, Lm69;->f:Lp78;

    return-object v0
.end method

.method public final b()Ly59;
    .locals 1
    .annotation build LD18;
        zza = 0x3d
    .end annotation

    iget-object v0, p0, Lm69;->c:Ly59;

    return-object v0
.end method

.method public final c()LO59;
    .locals 1
    .annotation build LD18;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lm69;->b:LO59;

    return-object v0
.end method

.method public final d()LY79;
    .locals 1
    .annotation build LD18;
        zza = 0x7
    .end annotation

    iget-object v0, p0, Lm69;->d:LY79;

    return-object v0
.end method

.method public final e()Lv89;
    .locals 1
    .annotation build LD18;
        zza = 0x3a
    .end annotation

    iget-object v0, p0, Lm69;->e:Lv89;

    return-object v0
.end method

.method public final f()Lqh9;
    .locals 1
    .annotation build LD18;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lm69;->a:Lqh9;

    return-object v0
.end method
