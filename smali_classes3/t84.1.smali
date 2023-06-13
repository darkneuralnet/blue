.class public final Lt84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt84$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ls84;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lt84;
    .locals 1

    invoke-static {}, Lt84$a;->a()Lt84;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ls84;
    .locals 1

    new-instance v0, Ls84;

    invoke-direct {v0}, Ls84;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Ls84;
    .locals 1

    invoke-static {}, Lt84;->c()Ls84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt84;->b()Ls84;

    move-result-object v0

    return-object v0
.end method
