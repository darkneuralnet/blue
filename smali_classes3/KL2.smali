.class public final LKL2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKL2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LJL2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LKL2;
    .locals 1

    invoke-static {}, LKL2$a;->a()LKL2;

    move-result-object v0

    return-object v0
.end method

.method public static c()LJL2;
    .locals 1

    new-instance v0, LJL2;

    invoke-direct {v0}, LJL2;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LJL2;
    .locals 1

    invoke-static {}, LKL2;->c()LJL2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKL2;->b()LJL2;

    move-result-object v0

    return-object v0
.end method
