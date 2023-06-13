.class public final LMd9;
.super Lk39;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lk39<",
        "TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk39;-><init>()V

    return-void
.end method

.method public static D()LMd9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "LMd9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LMd9;

    invoke-direct {v0}, LMd9;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final g(LMb9;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMb9<",
            "+TV;>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lv39;->g(LMb9;)Z

    move-result p1

    return p1
.end method

.method public final w(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lv39;->w(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
