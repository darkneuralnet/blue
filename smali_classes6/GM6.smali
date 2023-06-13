.class public final LGM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LFM6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(LwM6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LHK6;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LGM6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGM6;->a:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LfP6;",
            ">;[B)V"
        }
    .end annotation

    const/4 p2, 0x1

    iput p2, p0, LGM6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGM6;->a:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;[C)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;[C)V"
        }
    .end annotation

    const/4 p2, 0x2

    iput p2, p0, LGM6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGM6;->a:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;[S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LHK6;",
            ">;[S)V"
        }
    .end annotation

    const/4 p2, 0x3

    iput p2, p0, LGM6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGM6;->a:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LGM6;->b:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LGM6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LdN6;

    check-cast v0, LHK6;

    invoke-direct {v1, v0}, LdN6;-><init>(LHK6;)V

    return-object v1

    :cond_0
    iget-object v0, p0, LGM6;->a:LwM6;

    check-cast v0, LTO6;

    invoke-virtual {v0}, LTO6;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, LMM6;

    invoke-direct {v1, v0}, LMM6;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_1
    iget-object v0, p0, LGM6;->a:LwM6;

    invoke-static {v0}, LsM6;->c(LwM6;)LoM6;

    move-result-object v0

    new-instance v1, LhL6;

    invoke-direct {v1, v0}, LhL6;-><init>(LoM6;)V

    return-object v1

    :cond_2
    iget-object v0, p0, LGM6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LFM6;

    check-cast v0, LHK6;

    invoke-direct {v1, v0}, LFM6;-><init>(LHK6;)V

    return-object v1
.end method
