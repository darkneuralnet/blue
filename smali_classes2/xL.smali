.class public final LxL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxL$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LwL;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LxL;
    .locals 1

    invoke-static {}, LxL$a;->a()LxL;

    move-result-object v0

    return-object v0
.end method

.method public static c()LwL;
    .locals 1

    new-instance v0, LwL;

    invoke-direct {v0}, LwL;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LwL;
    .locals 1

    invoke-static {}, LxL;->c()LwL;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LxL;->b()LwL;

    move-result-object v0

    return-object v0
.end method
