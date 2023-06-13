.class public Lqh5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj1$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqh5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luj1$d<",
        "Lqh5$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lqh5;


# direct methods
.method public constructor <init>(Lqh5;)V
    .locals 0

    iput-object p1, p0, Lqh5$a;->a:Lqh5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lqh5$b;
    .locals 2

    :try_start_0
    new-instance v0, Lqh5$b;

    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-direct {v0, v1}, Lqh5$b;-><init>(Ljava/security/MessageDigest;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqh5$a;->a()Lqh5$b;

    move-result-object v0

    return-object v0
.end method
