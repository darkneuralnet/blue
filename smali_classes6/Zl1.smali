.class public interface abstract LZl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXl1;
.implements LYv5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LXl1<",
        "TK;TV;>;",
        "LYv5<",
        "TK;TV;>;"
    }
.end annotation


# virtual methods
.method public abstract a()LYv5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYv5<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public bridge synthetic a()LgX2;
    .locals 1

    invoke-interface {p0}, LZl1;->a()LYv5;

    move-result-object v0

    return-object v0
.end method
