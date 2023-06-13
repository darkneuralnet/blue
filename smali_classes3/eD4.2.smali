.class public final LeD4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeD4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LdD4;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LeD4;
    .locals 1

    invoke-static {}, LeD4$a;->a()LeD4;

    move-result-object v0

    return-object v0
.end method

.method public static c()LdD4;
    .locals 1

    new-instance v0, LdD4;

    invoke-direct {v0}, LdD4;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LdD4;
    .locals 1

    invoke-static {}, LeD4;->c()LdD4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LeD4;->b()LdD4;

    move-result-object v0

    return-object v0
.end method
