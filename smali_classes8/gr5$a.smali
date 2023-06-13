.class public final Lgr5$a;
.super Lrp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgr5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrp<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000c\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\r8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lgr5$a;",
        "Lrp;",
        "",
        "affected",
        "i",
        "failure",
        "",
        "d",
        "",
        "toString",
        "k",
        "l",
        "j",
        "Lgr5;",
        "b",
        "Lgr5;",
        "impl",
        "Lop;",
        "c",
        "Lop;",
        "desc",
        "",
        "J",
        "g",
        "()J",
        "opSequence",
        "<init>",
        "(Lgr5;Lop;)V",
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
.field public final b:Lgr5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgr5<",
            "*>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final c:Lop;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final d:J


# direct methods
.method public constructor <init>(Lgr5;Lop;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr5<",
            "*>;",
            "Lop;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lrp;-><init>()V

    iput-object p1, p0, Lgr5$a;->b:Lgr5;

    iput-object p2, p0, Lgr5$a;->c:Lop;

    invoke-static {}, Lsr5;->b()LJs5;

    move-result-object p1

    invoke-virtual {p1}, LJs5;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lgr5$a;->d:J

    invoke-virtual {p2, p0}, Lop;->d(Lrp;)V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p2}, Lgr5$a;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lgr5$a;->c:Lop;

    invoke-virtual {p1, p0, p2}, Lop;->a(Lrp;Ljava/lang/Object;)V

    return-void
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lgr5$a;->d:J

    return-wide v0
.end method

.method public i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lgr5$a;->k()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lgr5$a;->c:Lop;

    invoke-virtual {v0, p0}, Lop;->c(Lrp;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lgr5$a;->l()V

    :cond_1
    throw v0
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, Lsr5;->e()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lgr5$a;->b:Lgr5;

    sget-object v2, Lgr5;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, v1, p0, v0}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-object p1, p0, Lgr5$a;->b:Lgr5;

    invoke-static {p1}, Lgr5;->R(Lgr5;)V

    :cond_2
    return-void
.end method

.method public final k()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lgr5$a;->b:Lgr5;

    :cond_0
    :goto_0
    iget-object v1, v0, Lgr5;->_state:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v1, p0, :cond_1

    return-object v2

    :cond_1
    instance-of v3, v1, LGh3;

    if-eqz v3, :cond_2

    check-cast v1, LGh3;

    iget-object v2, p0, Lgr5$a;->b:Lgr5;

    invoke-virtual {v1, v2}, LGh3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {}, Lsr5;->e()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lgr5$a;->b:Lgr5;

    sget-object v3, Lgr5;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lsr5;->e()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v1, v4, p0}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v2

    :cond_3
    invoke-static {}, Lsr5;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Lgr5$a;->b:Lgr5;

    sget-object v1, Lgr5;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lsr5;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, p0, v2}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AtomicSelectOp(sequence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lgr5$a;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
