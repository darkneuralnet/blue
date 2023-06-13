.class public abstract LZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls00;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x5a1e55ec4136984cL


# instance fields
.field public b:Ljava/util/ArrayList;

.field public c:Ljava/lang/Object;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LZ0;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, LZ0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LZ0;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, LZ0;->c:Ljava/lang/Object;

    iput p1, p0, LZ0;->d:I

    return-void
.end method


# virtual methods
.method public a(Ls00;)V
    .locals 1

    iget-object v0, p0, LZ0;->c:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LKo;->c(Z)V

    iget-object v0, p0, LZ0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract b()Ljava/lang/Object;
.end method

.method public c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LZ0;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LZ0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public getBounds()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZ0;->c:Ljava/lang/Object;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LZ0;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LZ0;->c:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, LZ0;->c:Ljava/lang/Object;

    return-object v0
.end method
