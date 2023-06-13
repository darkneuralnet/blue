.class public final LUc$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lol2;

.field public b:Lpl2;

.field public c:Ljava/lang/String;

.field public d:Lp8;

.field public e:Z

.field public f:LJk2;

.field public g:Ljava/security/KeyStore;

.field public h:Lnl2;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LUc$b;->a:Lol2;

    iput-object v0, p0, LUc$b;->b:Lpl2;

    iput-object v0, p0, LUc$b;->c:Ljava/lang/String;

    iput-object v0, p0, LUc$b;->d:Lp8;

    const/4 v1, 0x1

    iput-boolean v1, p0, LUc$b;->e:Z

    iput-object v0, p0, LUc$b;->f:LJk2;

    iput-object v0, p0, LUc$b;->g:Ljava/security/KeyStore;

    return-void
.end method

.method public static synthetic a(LUc$b;)Lpl2;
    .locals 0

    iget-object p0, p0, LUc$b;->b:Lpl2;

    return-object p0
.end method

.method public static synthetic b(LUc$b;)Lp8;
    .locals 0

    iget-object p0, p0, LUc$b;->d:Lp8;

    return-object p0
.end method

.method public static synthetic c(LUc$b;)Lnl2;
    .locals 0

    iget-object p0, p0, LUc$b;->h:Lnl2;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized d()LUc;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUc$b;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LUc$b;->g()Lp8;

    move-result-object v0

    iput-object v0, p0, LUc$b;->d:Lp8;

    :cond_0
    invoke-virtual {p0}, LUc$b;->f()Lnl2;

    move-result-object v0

    iput-object v0, p0, LUc$b;->h:Lnl2;

    new-instance v0, LUc;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUc;-><init>(LUc$b;LUc$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final e()Lnl2;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LUc$b;->d:Lp8;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, LUc$b;->a:Lol2;

    invoke-static {v1, v0}, Lll2;->j(Lol2;Lp8;)Lll2;

    move-result-object v0

    invoke-static {v0}, Lnl2;->j(Lll2;)Lnl2;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-static {}, LUc;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cannot decrypt keyset: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object v0, p0, LUc$b;->a:Lol2;

    invoke-static {v0}, LXj0;->a(Lol2;)Lll2;

    move-result-object v0

    invoke-static {v0}, Lnl2;->j(Lll2;)Lnl2;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lnl2;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, LUc$b;->e()Lnl2;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, LUc;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, LUc;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2

    const-string v0, "keyset not found, will generate a new one. %s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LUc$b;->f:LJk2;

    if-eqz v0, :cond_2

    invoke-static {}, Lnl2;->i()Lnl2;

    move-result-object v0

    iget-object v1, p0, LUc$b;->f:LJk2;

    invoke-virtual {v0, v1}, Lnl2;->a(LJk2;)Lnl2;

    move-result-object v0

    invoke-virtual {v0}, Lnl2;->d()Lll2;

    move-result-object v1

    invoke-virtual {v1}, Lll2;->g()Lml2;

    move-result-object v1

    invoke-virtual {v1, v2}, Lml2;->K(I)Lml2$c;

    move-result-object v1

    invoke-virtual {v1}, Lml2$c;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Lnl2;->h(I)Lnl2;

    move-result-object v0

    iget-object v1, p0, LUc$b;->d:Lp8;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnl2;->d()Lll2;

    move-result-object v1

    iget-object v2, p0, LUc$b;->b:Lpl2;

    iget-object v3, p0, LUc$b;->d:Lp8;

    invoke-virtual {v1, v2, v3}, Lll2;->l(Lpl2;Lp8;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lnl2;->d()Lll2;

    move-result-object v1

    iget-object v2, p0, LUc$b;->b:Lpl2;

    invoke-static {v1, v2}, LXj0;->b(Lll2;Lpl2;)V

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Lp8;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LUc;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, LUc;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Android Keystore requires at least Android M"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    iget-object v0, p0, LUc$b;->g:Ljava/security/KeyStore;

    if-eqz v0, :cond_1

    new-instance v0, LWc$b;

    invoke-direct {v0}, LWc$b;-><init>()V

    iget-object v2, p0, LUc$b;->g:Ljava/security/KeyStore;

    invoke-virtual {v0, v2}, LWc$b;->b(Ljava/security/KeyStore;)LWc$b;

    move-result-object v0

    invoke-virtual {v0}, LWc$b;->a()LWc;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, LWc;

    invoke-direct {v0}, LWc;-><init>()V

    :goto_0
    iget-object v2, p0, LUc$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, LWc;->e(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "cannot use Android Keystore, it\'ll be disabled"

    if-nez v2, :cond_2

    :try_start_0
    iget-object v4, p0, LUc$b;->c:Ljava/lang/String;

    invoke-static {v4}, LWc;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    invoke-static {}, LUc;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    :cond_2
    :goto_2
    :try_start_1
    iget-object v4, p0, LUc$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, LWc;->b(Ljava/lang/String;)Lp8;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    :goto_3
    if-nez v2, :cond_3

    invoke-static {}, LUc;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    :cond_3
    new-instance v1, Ljava/security/KeyStoreException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, LUc$b;->c:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "the master key %s exists but is unusable"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public h(LJk2;)LUc$b;
    .locals 0

    iput-object p1, p0, LUc$b;->f:LJk2;

    return-object p0
.end method

.method public i(Ljava/lang/String;)LUc$b;
    .locals 1

    const-string v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LUc$b;->e:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, LUc$b;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot call withMasterKeyUri() after calling doNotUseKeystore()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)LUc$b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, LXy5;

    invoke-direct {v0, p1, p2, p3}, LXy5;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LUc$b;->a:Lol2;

    new-instance v0, LYy5;

    invoke-direct {v0, p1, p2, p3}, LYy5;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LUc$b;->b:Lpl2;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need a keyset name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
