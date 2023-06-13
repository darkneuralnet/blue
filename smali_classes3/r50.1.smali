.class public final Lr50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr50$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lq50;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lr50;
    .locals 1

    invoke-static {}, Lr50$a;->a()Lr50;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lq50;
    .locals 1

    new-instance v0, Lq50;

    invoke-direct {v0}, Lq50;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lq50;
    .locals 1

    invoke-static {}, Lr50;->c()Lq50;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr50;->b()Lq50;

    move-result-object v0

    return-object v0
.end method
