.class public Lp24$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp24;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Ljavax/crypto/Mac;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lp24;


# direct methods
.method public constructor <init>(Lp24;)V
    .locals 0

    iput-object p1, p0, Lp24$a;->a:Lp24;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljavax/crypto/Mac;
    .locals 2

    :try_start_0
    sget-object v0, LEd1;->f:LEd1;

    iget-object v1, p0, Lp24$a;->a:Lp24;

    invoke-static {v1}, Lp24;->b(Lp24;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LEd1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;

    iget-object v1, p0, Lp24$a;->a:Lp24;

    invoke-static {v1}, Lp24;->c(Lp24;)Ljava/security/Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp24$a;->a()Ljavax/crypto/Mac;

    move-result-object v0

    return-object v0
.end method
