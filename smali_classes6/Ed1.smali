.class public final LEd1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "LKd1<",
        "TT_ENGINE;>;T_ENGINE:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Ljava/util/logging/Logger;

.field public static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Z

.field public static final e:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$a;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$e;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$g;",
            "Ljava/security/Signature;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$f;",
            "Ljava/security/MessageDigest;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$b;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$d;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:LEd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEd1<",
            "LKd1$c;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:LKd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT_WRAPPER;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, LEd1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LEd1;->b:Ljava/util/logging/Logger;

    invoke-static {}, LV46;->c()Z

    move-result v0

    const-string v1, "AndroidOpenSSL"

    const-string v2, "GmsCore_OpenSSL"

    if-eqz v0, :cond_0

    const-string v0, "Conscrypt"

    filled-new-array {v2, v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LEd1;->b([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LEd1;->c:Ljava/util/List;

    const/4 v0, 0x0

    sput-boolean v0, LEd1;->d:Z

    goto :goto_0

    :cond_0
    invoke-static {}, LvT5;->b()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LEd1;->b([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LEd1;->c:Ljava/util/List;

    sput-boolean v3, LEd1;->d:Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LEd1;->c:Ljava/util/List;

    sput-boolean v3, LEd1;->d:Z

    :goto_0
    new-instance v0, LEd1;

    new-instance v1, LKd1$a;

    invoke-direct {v1}, LKd1$a;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->e:LEd1;

    new-instance v0, LEd1;

    new-instance v1, LKd1$e;

    invoke-direct {v1}, LKd1$e;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->f:LEd1;

    new-instance v0, LEd1;

    new-instance v1, LKd1$g;

    invoke-direct {v1}, LKd1$g;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->g:LEd1;

    new-instance v0, LEd1;

    new-instance v1, LKd1$f;

    invoke-direct {v1}, LKd1$f;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->h:LEd1;

    new-instance v0, LEd1;

    new-instance v1, LKd1$b;

    invoke-direct {v1}, LKd1$b;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->i:LEd1;

    new-instance v0, LEd1;

    new-instance v1, LKd1$d;

    invoke-direct {v1}, LKd1$d;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->j:LEd1;

    new-instance v0, LEd1;

    new-instance v1, LKd1$c;

    invoke-direct {v1}, LKd1$c;-><init>()V

    invoke-direct {v0, v1}, LEd1;-><init>(LKd1;)V

    sput-object v0, LEd1;->k:LEd1;

    return-void
.end method

.method public constructor <init>(LKd1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEd1;->a:LKd1;

    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p0, v3

    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    sget-object v5, LEd1;->b:Ljava/util/logging/Logger;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const-string v4, "Provider %s not available"

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT_ENGINE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    sget-object v0, LEd1;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/Provider;

    :try_start_0
    iget-object v4, p0, LEd1;->a:LKd1;

    invoke-interface {v4, p1, v3}, LKd1;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v3

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_1
    sget-boolean v0, LEd1;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LEd1;->a:LKd1;

    invoke-interface {v0, p1, v1}, LKd1;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No good Provider found."

    invoke-direct {p1, v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
