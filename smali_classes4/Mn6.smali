.class public final LMn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMn6$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LLn6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LMn6;
    .locals 1

    invoke-static {}, LMn6$a;->a()LMn6;

    move-result-object v0

    return-object v0
.end method

.method public static c()LLn6;
    .locals 1

    new-instance v0, LLn6;

    invoke-direct {v0}, LLn6;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LLn6;
    .locals 1

    invoke-static {}, LMn6;->c()LLn6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LMn6;->b()LLn6;

    move-result-object v0

    return-object v0
.end method
