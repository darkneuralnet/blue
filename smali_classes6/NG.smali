.class public LNG;
.super Lms4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lms4<",
        "LNG;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lms4;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic f()Lms4;
    .locals 1

    invoke-virtual {p0}, LNG;->o()LNG;

    move-result-object v0

    return-object v0
.end method

.method public o()LNG;
    .locals 0

    return-object p0
.end method
