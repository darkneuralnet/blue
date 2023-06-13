.class public LM0$a;
.super LM0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0;->e()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LM0<",
        "TE;>.c<TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic f:LM0;


# direct methods
.method public constructor <init>(LM0;)V
    .locals 0

    iput-object p1, p0, LM0$a;->f:LM0;

    invoke-direct {p0, p1}, LM0$c;-><init>(LM0;)V

    return-void
.end method


# virtual methods
.method public b(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, LM0$a;->f:LM0;

    iget-object v0, v0, LM0;->d:LJd3;

    invoke-virtual {v0, p1}, LJd3;->f(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
