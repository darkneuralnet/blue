.class public final LrP8;
.super LZM8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LZM8<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final d:LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZP8<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZP8;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZP8<",
            "TE;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LZM8;-><init>(II)V

    iput-object p1, p0, LrP8;->d:LZP8;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, LrP8;->d:LZP8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
