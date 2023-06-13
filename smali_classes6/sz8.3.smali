.class public abstract Lsz8;
.super LJy8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LPC8;",
        ">",
        "LJy8<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final e:LEC8;


# direct methods
.method public constructor <init>(Ljava/lang/String;LPC8;LEC8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;",
            "LEC8;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LJy8;-><init>(Ljava/lang/String;LPC8;)V

    invoke-virtual {p3}, LEC8;->b()Z

    move-result p1

    invoke-static {p1}, LyK8;->e(Z)V

    iput-object p3, p0, Lsz8;->e:LEC8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/UUID;LEC8;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LJy8;-><init>(Ljava/lang/String;Ljava/util/UUID;)V

    invoke-virtual {p3}, LEC8;->b()Z

    move-result p1

    invoke-static {p1}, LyK8;->e(Z)V

    iput-object p3, p0, Lsz8;->e:LEC8;

    return-void
.end method
