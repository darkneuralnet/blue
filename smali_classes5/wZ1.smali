.class public LwZ1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final u:Ljava/lang/String;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Landroid/app/Activity;

.field public d:Landroid/content/Context;

.field public final e:LJO1;

.field public final f:LvO1;

.field public final g:LFO1;

.field public final h:LFO1;

.field public final i:LFO1;

.field public final j:LFO1;

.field public final k:LFO1;

.field public final l:LxO1;

.field public final m:LCO1;

.field public final n:LIO1;

.field public o:LFO1;

.field public p:LxO1;

.field public q:LCO1;

.field public r:LIO1;

.field public s:LvO1;

.field public t:LCO1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, LwZ1;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LwZ1;->u:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LwZ1;->a:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LwZ1;->b:Z

    new-instance v0, LOX0;

    invoke-direct {v0}, LOX0;-><init>()V

    iput-object v0, p0, LwZ1;->e:LJO1;

    new-instance v1, LvX0;

    invoke-direct {v1}, LvX0;-><init>()V

    iput-object v1, p0, LwZ1;->f:LvO1;

    new-instance v1, LFX0;

    invoke-direct {v1}, LFX0;-><init>()V

    iput-object v1, p0, LwZ1;->g:LFO1;

    new-instance v1, LEX0;

    invoke-direct {v1}, LEX0;-><init>()V

    iput-object v1, p0, LwZ1;->h:LFO1;

    new-instance v1, LzX0;

    invoke-direct {v1}, LzX0;-><init>()V

    iput-object v1, p0, LwZ1;->i:LFO1;

    new-instance v1, LAX0;

    invoke-direct {v1, v0}, LAX0;-><init>(LJO1;)V

    iput-object v1, p0, LwZ1;->j:LFO1;

    new-instance v1, LBX0;

    invoke-direct {v1, v0}, LBX0;-><init>(LJO1;)V

    iput-object v1, p0, LwZ1;->k:LFO1;

    new-instance v0, LxX0;

    invoke-direct {v0}, LxX0;-><init>()V

    iput-object v0, p0, LwZ1;->l:LxO1;

    new-instance v0, LCX0;

    invoke-direct {v0}, LCX0;-><init>()V

    iput-object v0, p0, LwZ1;->m:LCO1;

    new-instance v0, LNX0;

    invoke-direct {v0}, LNX0;-><init>()V

    iput-object v0, p0, LwZ1;->n:LIO1;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LwZ1;->d:Landroid/content/Context;

    return-object v0
.end method

.method public c()LCO1;
    .locals 1

    iget-object v0, p0, LwZ1;->t:LCO1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwZ1;->m:LCO1;

    :goto_0
    return-object v0
.end method

.method public d(LwO1;)LFO1;
    .locals 3

    sget-object v0, LwZ1$a;->a:[I

    invoke-interface {p1}, LwO1;->h0()LzT2;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    sget-object v0, LwZ1;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to find view factory for in-app message with type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LwO1;->h0()LzT2;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, LwZ1;->k:LFO1;

    return-object p1

    :cond_1
    iget-object p1, p0, LwZ1;->j:LFO1;

    return-object p1

    :cond_2
    iget-object p1, p0, LwZ1;->i:LFO1;

    return-object p1

    :cond_3
    iget-object p1, p0, LwZ1;->h:LFO1;

    return-object p1

    :cond_4
    iget-object p1, p0, LwZ1;->g:LFO1;

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LwZ1;->b:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, LwZ1;->a:Z

    return v0
.end method

.method public g()LvO1;
    .locals 1

    iget-object v0, p0, LwZ1;->s:LvO1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwZ1;->f:LvO1;

    :goto_0
    return-object v0
.end method

.method public h()LxO1;
    .locals 1

    iget-object v0, p0, LwZ1;->p:LxO1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwZ1;->l:LxO1;

    :goto_0
    return-object v0
.end method

.method public i()LCO1;
    .locals 1

    iget-object v0, p0, LwZ1;->q:LCO1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwZ1;->m:LCO1;

    :goto_0
    return-object v0
.end method

.method public j(LwO1;)LFO1;
    .locals 1

    iget-object v0, p0, LwZ1;->o:LFO1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, LwZ1;->d(LwO1;)LFO1;

    move-result-object p1

    return-object p1
.end method

.method public k()LIO1;
    .locals 1

    iget-object v0, p0, LwZ1;->r:LIO1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwZ1;->n:LIO1;

    :goto_0
    return-object v0
.end method
