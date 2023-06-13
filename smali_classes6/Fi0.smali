.class public LFi0;
.super Lms4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lms4<",
        "LFi0;",
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

    invoke-virtual {p0}, LFi0;->o()LFi0;

    move-result-object v0

    return-object v0
.end method

.method public o()LFi0;
    .locals 0

    return-object p0
.end method
