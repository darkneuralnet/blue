.class public Lg21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK24;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg21$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LK24<",
        "Le21;",
        "Le21;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lg21;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg21;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lg21;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static e()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, Lg21;

    invoke-direct {v0}, Lg21;-><init>()V

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
            "Le21;",
            ">;"
        }
    .end annotation

    const-class v0, Le21;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Le21;",
            ">;"
        }
    .end annotation

    const-class v0, Le21;

    return-object v0
.end method

.method public bridge synthetic c(LJ24;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lg21;->f(LJ24;)Le21;

    move-result-object p1

    return-object p1
.end method

.method public f(LJ24;)Le21;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJ24<",
            "Le21;",
            ">;)",
            "Le21;"
        }
    .end annotation

    new-instance v0, Lg21$a;

    invoke-direct {v0, p1}, Lg21$a;-><init>(LJ24;)V

    return-object v0
.end method
