.class public final LMV8;
.super LXW8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LXW8;"
    }
.end annotation


# instance fields
.field public final synthetic c:LBV8;


# direct methods
.method public constructor <init>(LBV8;)V
    .locals 1

    iput-object p1, p0, LMV8;->c:LBV8;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LXW8;-><init>(LBV8;LqV8;)V

    return-void
.end method

.method public synthetic constructor <init>(LBV8;LqV8;)V
    .locals 0

    invoke-direct {p0, p1}, LMV8;-><init>(LBV8;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LWV8;

    iget-object v1, p0, LMV8;->c:LBV8;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWV8;-><init>(LBV8;LqV8;)V

    return-object v0
.end method
