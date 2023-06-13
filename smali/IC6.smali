.class public abstract LIC6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LXh3;
.end method

.method public final b(LFh3;)LIC6;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LIC6;->c(Ljava/util/List;)LIC6;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Ljava/util/List;)LIC6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LFh3;",
            ">;)",
            "LIC6;"
        }
    .end annotation
.end method
