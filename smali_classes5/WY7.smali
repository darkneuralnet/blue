.class public final LWY7;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic b:LNZ7;


# direct methods
.method public constructor <init>(LNZ7;)V
    .locals 0

    iput-object p1, p0, LWY7;->b:LNZ7;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, LWY7;->b:LNZ7;

    invoke-virtual {v0}, LNZ7;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LWY7;->b:LNZ7;

    invoke-virtual {v0, p1}, LNZ7;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LIX7;

    invoke-direct {v0, p0}, LIX7;-><init>(LWY7;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LWY7;->b:LNZ7;

    invoke-virtual {v0, p1}, LNZ7;->d(Ljava/lang/Object;)LzZ7;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LWY7;->b:LNZ7;

    iget v0, v0, LNZ7;->d:I

    return v0
.end method
