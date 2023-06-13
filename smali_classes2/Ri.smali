.class public final LRi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRi$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LQi;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LRi;
    .locals 1

    invoke-static {}, LRi$a;->a()LRi;

    move-result-object v0

    return-object v0
.end method

.method public static c()LQi;
    .locals 1

    new-instance v0, LQi;

    invoke-direct {v0}, LQi;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LQi;
    .locals 1

    invoke-static {}, LRi;->c()LQi;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRi;->b()LQi;

    move-result-object v0

    return-object v0
.end method
