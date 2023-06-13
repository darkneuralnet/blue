.class public Landroidx/browser/trusted/TrustedWebActivityService$a;
.super LlP1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/browser/trusted/TrustedWebActivityService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/browser/trusted/TrustedWebActivityService;


# direct methods
.method public constructor <init>(Landroidx/browser/trusted/TrustedWebActivityService;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    invoke-direct {p0}, LlP1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public B4(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    invoke-static {p1}, Landroidx/browser/trusted/a$c;->a(Landroid/os/Bundle;)Landroidx/browser/trusted/a$c;

    move-result-object p1

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    iget-object p1, p1, Landroidx/browser/trusted/a$c;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroidx/browser/trusted/TrustedWebActivityService;->d(Ljava/lang/String;)Z

    move-result p1

    new-instance v0, Landroidx/browser/trusted/a$e;

    invoke-direct {v0, p1}, Landroidx/browser/trusted/a$e;-><init>(Z)V

    invoke-virtual {v0}, Landroidx/browser/trusted/a$e;->a()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public C2(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/IBinder;)Landroid/os/Bundle;
    .locals 1

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    invoke-static {p3}, Lza6;->a(Landroid/os/IBinder;)Lza6;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Landroidx/browser/trusted/TrustedWebActivityService;->f(Ljava/lang/String;Landroid/os/Bundle;Lza6;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public I4(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    invoke-static {p1}, Landroidx/browser/trusted/a$b;->a(Landroid/os/Bundle;)Landroidx/browser/trusted/a$b;

    move-result-object p1

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    iget-object v1, p1, Landroidx/browser/trusted/a$b;->a:Ljava/lang/String;

    iget p1, p1, Landroidx/browser/trusted/a$b;->b:I

    invoke-virtual {v0, v1, p1}, Landroidx/browser/trusted/TrustedWebActivityService;->e(Ljava/lang/String;I)V

    return-void
.end method

.method public Q2()Landroid/os/Bundle;
    .locals 1

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    invoke-virtual {v0}, Landroidx/browser/trusted/TrustedWebActivityService;->h()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public W3()Landroid/os/Bundle;
    .locals 2

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    new-instance v0, Landroidx/browser/trusted/a$a;

    iget-object v1, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    invoke-virtual {v1}, Landroidx/browser/trusted/TrustedWebActivityService;->g()[Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/browser/trusted/a$a;-><init>([Landroid/os/Parcelable;)V

    invoke-virtual {v0}, Landroidx/browser/trusted/a$a;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final c5()V
    .locals 3

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    iget v1, v0, Landroidx/browser/trusted/TrustedWebActivityService;->c:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Caller is not verified as Trusted Web Activity provider."

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    invoke-virtual {v0}, Landroidx/browser/trusted/TrustedWebActivityService;->c()Lt56;

    const/4 v0, 0x0

    throw v0
.end method

.method public o0(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    invoke-static {p1}, Landroidx/browser/trusted/a$d;->a(Landroid/os/Bundle;)Landroidx/browser/trusted/a$d;

    move-result-object p1

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    iget-object v1, p1, Landroidx/browser/trusted/a$d;->a:Ljava/lang/String;

    iget v2, p1, Landroidx/browser/trusted/a$d;->b:I

    iget-object v3, p1, Landroidx/browser/trusted/a$d;->c:Landroid/app/Notification;

    iget-object p1, p1, Landroidx/browser/trusted/a$d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/browser/trusted/TrustedWebActivityService;->j(Ljava/lang/String;ILandroid/app/Notification;Ljava/lang/String;)Z

    move-result p1

    new-instance v0, Landroidx/browser/trusted/a$e;

    invoke-direct {v0, p1}, Landroidx/browser/trusted/a$e;-><init>(Z)V

    invoke-virtual {v0}, Landroidx/browser/trusted/a$e;->a()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public y4()I
    .locals 1

    invoke-virtual {p0}, Landroidx/browser/trusted/TrustedWebActivityService$a;->c5()V

    iget-object v0, p0, Landroidx/browser/trusted/TrustedWebActivityService$a;->a:Landroidx/browser/trusted/TrustedWebActivityService;

    invoke-virtual {v0}, Landroidx/browser/trusted/TrustedWebActivityService;->i()I

    move-result v0

    return v0
.end method
