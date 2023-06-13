.class public Luk2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luk2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luk2;->b(LQk2;)Luk2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LQk2;


# direct methods
.method public constructor <init>(LQk2;)V
    .locals 0

    iput-object p1, p0, Luk2$a;->a:LQk2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Luk2$a;->a:LQk2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Class;)Lsk2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TQ;>;)",
            "Lsk2<",
            "TQ;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    :try_start_0
    new-instance v0, Ltk2;

    iget-object v1, p0, Luk2$a;->a:LQk2;

    invoke-direct {v0, v1, p1}, Ltk2;-><init>(LQk2;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Primitive type not supported"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Luk2$a;->a:LQk2;

    invoke-virtual {v0}, LQk2;->i()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()Lsk2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsk2<",
            "*>;"
        }
    .end annotation

    new-instance v0, Ltk2;

    iget-object v1, p0, Luk2$a;->a:LQk2;

    invoke-virtual {v1}, LQk2;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ltk2;-><init>(LQk2;Ljava/lang/Class;)V

    return-object v0
.end method
