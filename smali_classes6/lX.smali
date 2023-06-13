.class public final LlX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LlX$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LkX;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LlX;
    .locals 1

    invoke-static {}, LlX$a;->a()LlX;

    move-result-object v0

    return-object v0
.end method

.method public static c()LkX;
    .locals 1

    new-instance v0, LkX;

    invoke-direct {v0}, LkX;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LkX;
    .locals 1

    invoke-static {}, LlX;->c()LkX;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LlX;->b()LkX;

    move-result-object v0

    return-object v0
.end method
