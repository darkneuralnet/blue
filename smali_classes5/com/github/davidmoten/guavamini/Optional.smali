.class public final Lcom/github/davidmoten/guavamini/Optional;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/davidmoten/guavamini/Optional$NotPresentException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/github/davidmoten/guavamini/Optional;-><init>(Ljava/lang/Object;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/github/davidmoten/guavamini/Optional;->a:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/github/davidmoten/guavamini/Optional;->b:Z

    return-void
.end method

.method public static a()Lcom/github/davidmoten/guavamini/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/github/davidmoten/guavamini/Optional<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/github/davidmoten/guavamini/Optional;

    invoke-direct {v0}, Lcom/github/davidmoten/guavamini/Optional;-><init>()V

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)Lcom/github/davidmoten/guavamini/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/github/davidmoten/guavamini/Optional<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/github/davidmoten/guavamini/Optional;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/github/davidmoten/guavamini/Optional;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/github/davidmoten/guavamini/Optional;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/davidmoten/guavamini/Optional;->a:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Lcom/github/davidmoten/guavamini/Optional$NotPresentException;

    invoke-direct {v0}, Lcom/github/davidmoten/guavamini/Optional$NotPresentException;-><init>()V

    throw v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/davidmoten/guavamini/Optional;->b:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/github/davidmoten/guavamini/Optional;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/github/davidmoten/guavamini/Optional;->a:Ljava/lang/Object;

    aput-object v2, v0, v1

    const-string v1, "Optional.of(%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Optional.absent"

    :goto_0
    return-object v0
.end method
