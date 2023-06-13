.class public LZY1$a;
.super Lre6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZY1;->j()Lre6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lre6<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public b:I

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field public final synthetic d:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(LZY1;Ljava/util/Iterator;)V
    .locals 0

    iput-object p2, p0, LZY1$a;->d:Ljava/util/Iterator;

    invoke-direct {p0}, Lre6;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget v0, p0, LZY1$a;->b:I

    if-gtz v0, :cond_1

    iget-object v0, p0, LZY1$a;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget v0, p0, LZY1$a;->b:I

    if-gtz v0, :cond_0

    iget-object v0, p0, LZY1$a;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX2$a;

    invoke-interface {v0}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, LZY1$a;->c:Ljava/lang/Object;

    invoke-interface {v0}, LmX2$a;->getCount()I

    move-result v0

    iput v0, p0, LZY1$a;->b:I

    :cond_0
    iget v0, p0, LZY1$a;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LZY1$a;->b:I

    iget-object v0, p0, LZY1$a;->c:Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
