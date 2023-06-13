.class public abstract LlB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leh2;


# instance fields
.field private final algs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LXg2;",
            ">;"
        }
    .end annotation
.end field

.field private final encs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LUc1;",
            ">;"
        }
    .end annotation
.end field

.field private final jcaContext:Lch2;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "LXg2;",
            ">;",
            "Ljava/util/Set<",
            "LUc1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lch2;

    invoke-direct {v0}, Lch2;-><init>()V

    iput-object v0, p0, LlB;->jcaContext:Lch2;

    if-eqz p1, :cond_1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LlB;->algs:Ljava/util/Set;

    if-eqz p2, :cond_0

    iput-object p2, p0, LlB;->encs:Ljava/util/Set;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The supported encryption methods must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The supported JWE algorithm set must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic getJCAContext()LBg2;
    .locals 1

    invoke-virtual {p0}, LlB;->getJCAContext()Lch2;

    move-result-object v0

    return-object v0
.end method

.method public getJCAContext()Lch2;
    .locals 1

    iget-object v0, p0, LlB;->jcaContext:Lch2;

    return-object v0
.end method

.method public supportedEncryptionMethods()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LUc1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LlB;->encs:Ljava/util/Set;

    return-object v0
.end method

.method public supportedJWEAlgorithms()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LXg2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LlB;->algs:Ljava/util/Set;

    return-object v0
.end method
