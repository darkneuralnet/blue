.class public final LDe8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLifecycleOwner;


# static fields
.field public static final j:LDe8;


# instance fields
.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Landroid/os/Handler;

.field public final g:Landroidx/lifecycle/j;

.field public final h:Ljava/lang/Runnable;

.field public final i:LeQ7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LDe8;

    invoke-direct {v0}, LDe8;-><init>()V

    sput-object v0, LDe8;->j:LDe8;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LDe8;->b:I

    iput v0, p0, LDe8;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LDe8;->d:Z

    iput-boolean v0, p0, LDe8;->e:Z

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0, p0}, Landroidx/lifecycle/j;-><init>(LLifecycleOwner;)V

    iput-object v0, p0, LDe8;->g:Landroidx/lifecycle/j;

    new-instance v0, LrC7;

    invoke-direct {v0, p0}, LrC7;-><init>(LDe8;)V

    iput-object v0, p0, LDe8;->h:Ljava/lang/Runnable;

    new-instance v0, LeQ7;

    invoke-direct {v0, p0}, LeQ7;-><init>(LDe8;)V

    iput-object v0, p0, LDe8;->i:LeQ7;

    return-void
.end method

.method public static a()LLifecycleOwner;
    .locals 1

    sget-object v0, LDe8;->j:LDe8;

    return-object v0
.end method

.method public static h(Landroid/content/Context;)V
    .locals 3

    sget-object v0, LDe8;->j:LDe8;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, v0, LDe8;->f:Landroid/os/Handler;

    iget-object v1, v0, LDe8;->g:Landroidx/lifecycle/j;

    sget-object v2, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    new-instance v1, Lx68;

    invoke-direct {v1, v0}, Lx68;-><init>(LDe8;)V

    invoke-virtual {p0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget v0, p0, LDe8;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LDe8;->c:I

    if-nez v0, :cond_0

    iget-object v0, p0, LDe8;->f:Landroid/os/Handler;

    iget-object v1, p0, LDe8;->h:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    iget v0, p0, LDe8;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LDe8;->c:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, LDe8;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LDe8;->g:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$a;->ON_RESUME:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LDe8;->d:Z

    return-void

    :cond_0
    iget-object v0, p0, LDe8;->f:Landroid/os/Handler;

    iget-object v1, p0, LDe8;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 2

    iget v0, p0, LDe8;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LDe8;->b:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LDe8;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LDe8;->g:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LDe8;->e:Z

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    iget v0, p0, LDe8;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LDe8;->b:I

    invoke-virtual {p0}, LDe8;->g()V

    return-void
.end method

.method public final f()V
    .locals 2

    iget v0, p0, LDe8;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LDe8;->d:Z

    iget-object v0, p0, LDe8;->g:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$a;->ON_PAUSE:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, LDe8;->b:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, LDe8;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LDe8;->g:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LDe8;->e:Z

    :cond_0
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, LDe8;->g:Landroidx/lifecycle/j;

    return-object v0
.end method
