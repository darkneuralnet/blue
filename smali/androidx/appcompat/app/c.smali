.class public abstract Landroidx/appcompat/app/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/c$b;,
        Landroidx/appcompat/app/c$a;
    }
.end annotation


# static fields
.field public static b:Landroidx/appcompat/app/d$a;

.field public static c:I

.field public static d:Lvv2;

.field public static e:Lvv2;

.field public static f:Ljava/lang/Boolean;

.field public static g:Z

.field public static final h:Lyo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyo<",
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/appcompat/app/c;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/appcompat/app/d$a;

    new-instance v1, Landroidx/appcompat/app/d$b;

    invoke-direct {v1}, Landroidx/appcompat/app/d$b;-><init>()V

    invoke-direct {v0, v1}, Landroidx/appcompat/app/d$a;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Landroidx/appcompat/app/c;->b:Landroidx/appcompat/app/d$a;

    const/16 v0, -0x64

    sput v0, Landroidx/appcompat/app/c;->c:I

    const/4 v0, 0x0

    sput-object v0, Landroidx/appcompat/app/c;->d:Lvv2;

    sput-object v0, Landroidx/appcompat/app/c;->e:Lvv2;

    sput-object v0, Landroidx/appcompat/app/c;->f:Ljava/lang/Boolean;

    const/4 v0, 0x0

    sput-boolean v0, Landroidx/appcompat/app/c;->g:Z

    new-instance v0, Lyo;

    invoke-direct {v0}, Lyo;-><init>()V

    sput-object v0, Landroidx/appcompat/app/c;->h:Lyo;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/app/c;->i:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/app/c;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static I(Landroidx/appcompat/app/c;)V
    .locals 1

    sget-object v0, Landroidx/appcompat/app/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/c;->J(Landroidx/appcompat/app/c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static J(Landroidx/appcompat/app/c;)V
    .locals 3

    sget-object v0, Landroidx/appcompat/app/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/c;->h:Lyo;

    invoke-virtual {v1}, Lyo;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/c;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static O(I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "AppCompatDelegate"

    const-string v0, "setDefaultNightMode() called with an unknown mode"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/app/c;->c:I

    if-eq v0, p0, :cond_1

    sput p0, Landroidx/appcompat/app/c;->c:I

    invoke-static {}, Landroidx/appcompat/app/c;->g()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static U(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Landroidx/appcompat/app/c;->y(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LT30;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Landroidx/appcompat/app/c;->g:Z

    if-nez v0, :cond_6

    sget-object v0, Landroidx/appcompat/app/c;->b:Landroidx/appcompat/app/d$a;

    new-instance v1, Ldi;

    invoke-direct {v1, p0}, Ldi;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/d$a;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    sget-object v0, Landroidx/appcompat/app/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/c;->d:Lvv2;

    if-nez v1, :cond_4

    sget-object v1, Landroidx/appcompat/app/c;->e:Lvv2;

    if-nez v1, :cond_2

    invoke-static {p0}, Landroidx/appcompat/app/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lvv2;->b(Ljava/lang/String;)Lvv2;

    move-result-object p0

    sput-object p0, Landroidx/appcompat/app/c;->e:Lvv2;

    :cond_2
    sget-object p0, Landroidx/appcompat/app/c;->e:Lvv2;

    invoke-virtual {p0}, Lvv2;->g()Z

    move-result p0

    if-eqz p0, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    sget-object p0, Landroidx/appcompat/app/c;->e:Lvv2;

    sput-object p0, Landroidx/appcompat/app/c;->d:Lvv2;

    goto :goto_0

    :cond_4
    sget-object v2, Landroidx/appcompat/app/c;->e:Lvv2;

    invoke-virtual {v1, v2}, Lvv2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Landroidx/appcompat/app/c;->d:Lvv2;

    sput-object v1, Landroidx/appcompat/app/c;->e:Lvv2;

    invoke-virtual {v1}, Lvv2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/appcompat/app/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_5
    :goto_0
    monitor-exit v0

    :cond_6
    :goto_1
    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/appcompat/app/c;->z(Landroid/content/Context;)V

    return-void
.end method

.method public static d(Landroidx/appcompat/app/c;)V
    .locals 3

    sget-object v0, Landroidx/appcompat/app/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/c;->J(Landroidx/appcompat/app/c;)V

    sget-object v1, Landroidx/appcompat/app/c;->h:Lyo;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lyo;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static g()V
    .locals 3

    sget-object v0, Landroidx/appcompat/app/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/c;->h:Lyo;

    invoke-virtual {v1}, Lyo;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/c;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/appcompat/app/c;->f()Z

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static j(Landroid/app/Activity;Lai;)Landroidx/appcompat/app/c;
    .locals 1

    new-instance v0, Landroidx/appcompat/app/AppCompatDelegateImpl;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/AppCompatDelegateImpl;-><init>(Landroid/app/Activity;Lai;)V

    return-object v0
.end method

.method public static k(Landroid/app/Dialog;Lai;)Landroidx/appcompat/app/c;
    .locals 1

    new-instance v0, Landroidx/appcompat/app/AppCompatDelegateImpl;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/AppCompatDelegateImpl;-><init>(Landroid/app/Dialog;Lai;)V

    return-object v0
.end method

.method public static n()Lvv2;
    .locals 1

    invoke-static {}, LT30;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/appcompat/app/c;->s()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/appcompat/app/c$b;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lvv2;->j(Landroid/os/LocaleList;)Lvv2;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Landroidx/appcompat/app/c;->d:Lvv2;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lvv2;->f()Lvv2;

    move-result-object v0

    return-object v0
.end method

.method public static p()I
    .locals 1

    sget v0, Landroidx/appcompat/app/c;->c:I

    return v0
.end method

.method public static s()Ljava/lang/Object;
    .locals 2

    sget-object v0, Landroidx/appcompat/app/c;->h:Lyo;

    invoke-virtual {v0}, Lyo;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/app/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/appcompat/app/c;->o()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "locale"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static u()Lvv2;
    .locals 1

    sget-object v0, Landroidx/appcompat/app/c;->d:Lvv2;

    return-object v0
.end method

.method public static y(Landroid/content/Context;)Z
    .locals 1

    sget-object v0, Landroidx/appcompat/app/c;->f:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/AppLocalesMetadataHolderService;->a(Landroid/content/Context;)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-string v0, "autoStoreLocales"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Landroidx/appcompat/app/c;->f:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "AppCompatDelegate"

    const-string v0, "Checking for metadata for AppLocalesMetadataHolderService : Service not found"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Landroidx/appcompat/app/c;->f:Ljava/lang/Boolean;

    :cond_0
    :goto_0
    sget-object p0, Landroidx/appcompat/app/c;->f:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic z(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/appcompat/app/d;->c(Landroid/content/Context;)V

    const/4 p0, 0x1

    sput-boolean p0, Landroidx/appcompat/app/c;->g:Z

    return-void
.end method


# virtual methods
.method public abstract A(Landroid/content/res/Configuration;)V
.end method

.method public abstract B(Landroid/os/Bundle;)V
.end method

.method public abstract C()V
.end method

.method public abstract D(Landroid/os/Bundle;)V
.end method

.method public abstract E()V
.end method

.method public abstract F(Landroid/os/Bundle;)V
.end method

.method public abstract G()V
.end method

.method public abstract H()V
.end method

.method public abstract K(I)Z
.end method

.method public abstract L(I)V
.end method

.method public abstract M(Landroid/view/View;)V
.end method

.method public abstract N(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public P(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 0

    return-void
.end method

.method public abstract Q(Landroidx/appcompat/widget/Toolbar;)V
.end method

.method public R(I)V
    .locals 0

    return-void
.end method

.method public abstract S(Ljava/lang/CharSequence;)V
.end method

.method public abstract T(LG2$a;)LG2;
.end method

.method public abstract e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract f()Z
.end method

.method public h(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public i(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->h(Landroid/content/Context;)V

    return-object p1
.end method

.method public abstract l(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end method

.method public abstract m(I)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation
.end method

.method public o()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract q()Landroidx/appcompat/app/a$b;
.end method

.method public r()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public abstract t()Landroid/view/MenuInflater;
.end method

.method public abstract v()Landroidx/appcompat/app/ActionBar;
.end method

.method public abstract w()V
.end method

.method public abstract x()V
.end method
