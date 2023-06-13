.class public final LPw2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPw2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LOw2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LPw2;
    .locals 1

    invoke-static {}, LPw2$a;->a()LPw2;

    move-result-object v0

    return-object v0
.end method

.method public static c()LOw2;
    .locals 1

    new-instance v0, LOw2;

    invoke-direct {v0}, LOw2;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LOw2;
    .locals 1

    invoke-static {}, LPw2;->c()LOw2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPw2;->b()LOw2;

    move-result-object v0

    return-object v0
.end method
