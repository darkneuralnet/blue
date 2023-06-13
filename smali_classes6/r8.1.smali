.class public Lr8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK24;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr8$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LK24<",
        "Lp8;",
        "Lp8;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lr8;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lr8;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lr8;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static e()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, Lr8;

    invoke-direct {v0}, Lr8;-><init>()V

    invoke-static {v0}, LNt4;->m(LK24;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lp8;",
            ">;"
        }
    .end annotation

    const-class v0, Lp8;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lp8;",
            ">;"
        }
    .end annotation

    const-class v0, Lp8;

    return-object v0
.end method

.method public bridge synthetic c(LJ24;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lr8;->f(LJ24;)Lp8;

    move-result-object p1

    return-object p1
.end method

.method public f(LJ24;)Lp8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJ24<",
            "Lp8;",
            ">;)",
            "Lp8;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, Lr8$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lr8$b;-><init>(LJ24;Lr8$a;)V

    return-object v0
.end method
