.class public final Lt08;
.super La28;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La28;"
    }
.end annotation


# instance fields
.field public final synthetic c:LZY7;


# direct methods
.method public constructor <init>(LZY7;)V
    .locals 1

    iput-object p1, p0, Lt08;->c:LZY7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, La28;-><init>(LZY7;LQZ7;)V

    return-void
.end method

.method public synthetic constructor <init>(LZY7;LQZ7;)V
    .locals 0

    invoke-direct {p0, p1}, Lt08;-><init>(LZY7;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LCZ7;

    iget-object v1, p0, Lt08;->c:LZY7;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LCZ7;-><init>(LZY7;LQZ7;)V

    return-object v0
.end method
