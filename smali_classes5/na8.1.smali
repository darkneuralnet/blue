.class public final Lna8;
.super LUb8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LUb8;"
    }
.end annotation


# instance fields
.field public final synthetic c:Ls98;


# direct methods
.method public constructor <init>(Ls98;)V
    .locals 1

    iput-object p1, p0, Lna8;->c:Ls98;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LUb8;-><init>(Ls98;LH98;)V

    return-void
.end method

.method public synthetic constructor <init>(Ls98;LH98;)V
    .locals 0

    invoke-direct {p0, p1}, Lna8;-><init>(Ls98;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LX98;

    iget-object v1, p0, Lna8;->c:Ls98;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX98;-><init>(Ls98;LH98;)V

    return-object v0
.end method
