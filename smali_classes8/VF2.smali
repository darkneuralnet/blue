.class public LVF2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVF2$b;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Landroid/content/Context;

.field public e:LSF2;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lxf1;


# direct methods
.method public constructor <init>(LVF2$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LVF2;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LVF2;->g:Z

    iput-boolean v0, p0, LVF2;->h:Z

    invoke-static {p1}, LVF2$b;->a(LVF2$b;)I

    move-result v0

    iput v0, p0, LVF2;->a:I

    invoke-static {p1}, LVF2$b;->b(LVF2$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LVF2;->b:Ljava/lang/String;

    invoke-static {p1}, LVF2$b;->c(LVF2$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LVF2;->c:Ljava/lang/String;

    invoke-static {p1}, LVF2$b;->d(LVF2$b;)Z

    move-result v0

    iput-boolean v0, p0, LVF2;->g:Z

    invoke-static {p1}, LVF2$b;->e(LVF2$b;)Z

    move-result v0

    iput-boolean v0, p0, LVF2;->h:Z

    invoke-static {p1}, LVF2$b;->f(LVF2$b;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LVF2;->d:Landroid/content/Context;

    invoke-static {p1}, LVF2$b;->g(LVF2$b;)LSF2;

    move-result-object v0

    iput-object v0, p0, LVF2;->e:LSF2;

    invoke-static {p1}, LVF2$b;->h(LVF2$b;)Z

    move-result v0

    iput-boolean v0, p0, LVF2;->f:Z

    invoke-static {p1}, LVF2$b;->i(LVF2$b;)Lxf1;

    move-result-object p1

    iput-object p1, p0, LVF2;->i:Lxf1;

    return-void
.end method

.method public synthetic constructor <init>(LVF2$b;LVF2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LVF2;-><init>(LVF2$b;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVF2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LVF2;->d:Landroid/content/Context;

    return-object v0
.end method

.method public c()Lxf1;
    .locals 1

    iget-object v0, p0, LVF2;->i:Lxf1;

    return-object v0
.end method

.method public d()LSF2;
    .locals 1

    iget-object v0, p0, LVF2;->e:LSF2;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LVF2;->a:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVF2;->c:Ljava/lang/String;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, LVF2;->h:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LVF2;->g:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, LVF2;->f:Z

    return v0
.end method
