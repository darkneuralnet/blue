.class public final LnM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LPJ6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LnM6;
    .locals 1

    invoke-static {}, LTK6;->a()LnM6;

    move-result-object v0

    return-object v0
.end method

.method public static c()LPJ6;
    .locals 1

    new-instance v0, LPJ6;

    invoke-direct {v0}, LPJ6;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LnM6;->c()LPJ6;

    move-result-object v0

    return-object v0
.end method
