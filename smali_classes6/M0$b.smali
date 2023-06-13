.class public LM0$b;
.super LM0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0;->f()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LM0<",
        "TE;>.c<",
        "LmX2$a<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic f:LM0;


# direct methods
.method public constructor <init>(LM0;)V
    .locals 0

    iput-object p1, p0, LM0$b;->f:LM0;

    invoke-direct {p0, p1}, LM0$c;-><init>(LM0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0$b;->c(I)LmX2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(I)LmX2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LmX2$a<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LM0$b;->f:LM0;

    iget-object v0, v0, LM0;->d:LJd3;

    invoke-virtual {v0, p1}, LJd3;->d(I)LmX2$a;

    move-result-object p1

    return-object p1
.end method
