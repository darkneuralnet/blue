.class public final LFh3$a;
.super LEG6$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFh3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEG6$a<",
        "LFh3$a;",
        "LFh3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000c0\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003J\u000f\u0010\u0007\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\u00008PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "LFh3$a;",
        "LEG6$a;",
        "LFh3;",
        "Ljava/lang/Class;",
        "Lh32;",
        "inputMerger",
        "n",
        "l",
        "()LFh3;",
        "m",
        "()LFh3$a;",
        "thisObject",
        "Landroidx/work/c;",
        "workerClass",
        "<init>",
        "(Ljava/lang/Class;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "workerClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LEG6$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0}, LEG6$a;->g()LHG6;

    move-result-object p1

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, LHG6;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic b()LEG6;
    .locals 1

    invoke-virtual {p0}, LFh3$a;->l()LFh3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()LEG6$a;
    .locals 1

    invoke-virtual {p0}, LFh3$a;->m()LFh3$a;

    move-result-object v0

    return-object v0
.end method

.method public l()LFh3;
    .locals 2

    invoke-virtual {p0}, LEG6$a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LEG6$a;->g()LHG6;

    move-result-object v0

    iget-object v0, v0, LHG6;->j:Llz0;

    invoke-virtual {v0}, Llz0;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    new-instance v0, LFh3;

    invoke-direct {v0, p0}, LFh3;-><init>(LFh3$a;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()LFh3$a;
    .locals 0

    return-object p0
.end method

.method public final n(Ljava/lang/Class;)LFh3$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lh32;",
            ">;)",
            "LFh3$a;"
        }
    .end annotation

    const-string v0, "inputMerger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LEG6$a;->g()LHG6;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, LHG6;->d:Ljava/lang/String;

    return-object p0
.end method
