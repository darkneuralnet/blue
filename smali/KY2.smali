.class public LKY2;
.super LIY2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LIY2<",
        "LJY2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0008\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0008\u0010\u0007\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "LKY2;",
        "LIY2;",
        "LJY2;",
        "LHY2;",
        "destination",
        "",
        "c",
        "d",
        "Li13;",
        "h",
        "Li13;",
        "e",
        "()Li13;",
        "provider",
        "",
        "i",
        "I",
        "startDestinationId",
        "",
        "j",
        "Ljava/lang/String;",
        "startDestinationRoute",
        "",
        "k",
        "Ljava/util/List;",
        "destinations",
        "startDestination",
        "route",
        "<init>",
        "(Li13;Ljava/lang/String;Ljava/lang/String;)V",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final h:Li13;

.field public i:I

.field public j:Ljava/lang/String;

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LHY2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li13;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDestination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LNY2;

    invoke-virtual {p1, v0}, Li13;->d(Ljava/lang/Class;)Ld13;

    move-result-object v0

    invoke-direct {p0, v0, p3}, LIY2;-><init>(Ld13;Ljava/lang/String;)V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, LKY2;->k:Ljava/util/List;

    iput-object p1, p0, LKY2;->h:Li13;

    iput-object p2, p0, LKY2;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final c(LHY2;)V
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKY2;->k:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d()LJY2;
    .locals 3

    invoke-super {p0}, LIY2;->a()LHY2;

    move-result-object v0

    check-cast v0, LJY2;

    iget-object v1, p0, LKY2;->k:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, LJY2;->G(Ljava/util/Collection;)V

    iget v1, p0, LKY2;->i:I

    if-nez v1, :cond_1

    iget-object v2, p0, LKY2;->j:Ljava/lang/String;

    if-nez v2, :cond_1

    invoke-virtual {p0}, LIY2;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must set a start destination route"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must set a start destination id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, p0, LKY2;->j:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, LJY2;->R(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, LJY2;->Q(I)V

    :goto_0
    return-object v0
.end method

.method public final e()Li13;
    .locals 1

    iget-object v0, p0, LKY2;->h:Li13;

    return-object v0
.end method
