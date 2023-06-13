.class public final LOW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOW5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LNW5;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LOW5;
    .locals 1

    invoke-static {}, LOW5$a;->a()LOW5;

    move-result-object v0

    return-object v0
.end method

.method public static c()LNW5;
    .locals 1

    new-instance v0, LNW5;

    invoke-direct {v0}, LNW5;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LNW5;
    .locals 1

    invoke-static {}, LOW5;->c()LNW5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOW5;->b()LNW5;

    move-result-object v0

    return-object v0
.end method
