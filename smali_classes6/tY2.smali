.class public final LtY2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LtY2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LsY2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LtY2;
    .locals 1

    invoke-static {}, LtY2$a;->a()LtY2;

    move-result-object v0

    return-object v0
.end method

.method public static c()LsY2;
    .locals 1

    new-instance v0, LsY2;

    invoke-direct {v0}, LsY2;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LsY2;
    .locals 1

    invoke-static {}, LtY2;->c()LsY2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LtY2;->b()LsY2;

    move-result-object v0

    return-object v0
.end method
