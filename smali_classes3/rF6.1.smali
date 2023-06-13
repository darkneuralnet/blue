.class public final LrF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LrF6$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LqF6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LrF6;
    .locals 1

    invoke-static {}, LrF6$a;->a()LrF6;

    move-result-object v0

    return-object v0
.end method

.method public static c()LqF6;
    .locals 1

    new-instance v0, LqF6;

    invoke-direct {v0}, LqF6;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LqF6;
    .locals 1

    invoke-static {}, LrF6;->c()LqF6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LrF6;->b()LqF6;

    move-result-object v0

    return-object v0
.end method
