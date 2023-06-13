.class public final LZE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZE0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LYE0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LZE0;
    .locals 1

    invoke-static {}, LZE0$a;->a()LZE0;

    move-result-object v0

    return-object v0
.end method

.method public static c()LYE0;
    .locals 1

    new-instance v0, LYE0;

    invoke-direct {v0}, LYE0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LYE0;
    .locals 1

    invoke-static {}, LZE0;->c()LYE0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZE0;->b()LYE0;

    move-result-object v0

    return-object v0
.end method
