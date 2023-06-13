.class public final Lgr5$c;
.super LGh3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgr5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lgr5$c;",
        "LGh3;",
        "",
        "affected",
        "c",
        "Lbx2$c;",
        "a",
        "Lbx2$c;",
        "otherOp",
        "Lrp;",
        "()Lrp;",
        "atomicOp",
        "<init>",
        "(Lbx2$c;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lbx2$c;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbx2$c;)V
    .locals 0

    invoke-direct {p0}, LGh3;-><init>()V

    iput-object p1, p0, Lgr5$c;->a:Lbx2$c;

    return-void
.end method


# virtual methods
.method public a()Lrp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrp<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lgr5$c;->a:Lbx2$c;

    invoke-virtual {v0}, Lbx2$c;->a()Lrp;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    if-eqz p1, :cond_1

    check-cast p1, Lgr5;

    iget-object v0, p0, Lgr5$c;->a:Lbx2$c;

    invoke-virtual {v0}, Lbx2$c;->d()V

    iget-object v0, p0, Lgr5$c;->a:Lbx2$c;

    invoke-virtual {v0}, Lbx2$c;->a()Lrp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lrp;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lgr5$c;->a:Lbx2$c;

    iget-object v1, v1, Lbx2$c;->c:Lbx2$a;

    goto :goto_0

    :cond_0
    invoke-static {}, Lsr5;->e()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    sget-object v2, Lgr5;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p1, p0, v1}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
