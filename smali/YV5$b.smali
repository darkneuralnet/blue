.class public abstract LYV5$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(LMV5;Ljava/util/List;)LYV5$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMV5;",
            "Ljava/util/List<",
            "LYV5$d;",
            ">;)",
            "LYV5$b;"
        }
    .end annotation

    new-instance v0, Llu;

    invoke-direct {v0, p0, p1}, Llu;-><init>(LMV5;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYV5$d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()LMV5;
.end method
