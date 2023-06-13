.class public final LU98;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Landroid/accounts/Account;

.field public f:Ljava/lang/String;

.field public final g:LiP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LiP8<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LE98;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p2, "files"

    iput-object p2, p0, LU98;->c:Ljava/lang/String;

    const-string p2, "common"

    iput-object p2, p0, LU98;->d:Ljava/lang/String;

    sget-object p2, Lka8;->b:Landroid/accounts/Account;

    iput-object p2, p0, LU98;->e:Landroid/accounts/Account;

    const-string p2, ""

    iput-object p2, p0, LU98;->f:Ljava/lang/String;

    invoke-static {}, LZP8;->u()LiP8;

    move-result-object p2

    iput-object p2, p0, LU98;->g:LiP8;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    const-string v1, "Context cannot be null"

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {v0, v1, p2}, LDf8;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, LU98;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LU98;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Landroid/net/Uri;
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LU98;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LU98;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-object v1, p0, LU98;->e:Landroid/accounts/Account;

    invoke-static {v1}, Lf88;->b(Landroid/accounts/Account;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    iget-object v2, p0, LU98;->f:Ljava/lang/String;

    aput-object v2, v0, v1

    const-string v1, "/%s/%s/%s/%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LU98;->g:LiP8;

    invoke-virtual {v1}, LiP8;->f()LZP8;

    move-result-object v1

    invoke-static {v1}, Lpf8;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    const-string v3, "android"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    iget-object v3, p0, LU98;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedFragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)LU98;
    .locals 0

    const-string p1, "recaptcha"

    invoke-static {p1}, Lka8;->b(Ljava/lang/String;)V

    iput-object p1, p0, LU98;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LU98;
    .locals 0

    sget-object p1, Lka8;->a:Ljava/util/regex/Pattern;

    const-string p1, "token.pb"

    iput-object p1, p0, LU98;->f:Ljava/lang/String;

    return-object p0
.end method
