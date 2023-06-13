.class public final Lbx2$c;
.super LGh3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbx2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\u0008\u00030\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lbx2$c;",
        "LGh3;",
        "",
        "affected",
        "c",
        "",
        "d",
        "",
        "toString",
        "Lbx2;",
        "Lkotlinx/coroutines/internal/Node;",
        "a",
        "Lbx2;",
        "b",
        "next",
        "Lbx2$a;",
        "Lbx2$a;",
        "desc",
        "Lrp;",
        "()Lrp;",
        "atomicOp",
        "<init>",
        "(Lbx2;Lbx2;Lbx2$a;)V",
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
.field public final a:Lbx2;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final b:Lbx2;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final c:Lbx2$a;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbx2;Lbx2;Lbx2$a;)V
    .locals 0

    invoke-direct {p0}, LGh3;-><init>()V

    iput-object p1, p0, Lbx2$c;->a:Lbx2;

    iput-object p2, p0, Lbx2$c;->b:Lbx2;

    iput-object p3, p0, Lbx2$c;->c:Lbx2$a;

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

    iget-object v0, p0, Lbx2$c;->c:Lbx2$a;

    invoke-virtual {v0}, Lop;->b()Lrp;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    if-eqz p1, :cond_5

    check-cast p1, Lbx2;

    iget-object v0, p0, Lbx2$c;->c:Lbx2$a;

    invoke-virtual {v0, p0}, Lbx2$a;->j(Lbx2$c;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcx2;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lbx2$c;->b:Lbx2;

    invoke-static {v0}, Lbx2;->r(Lbx2;)Lnw4;

    move-result-object v3

    sget-object v4, Lbx2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p1, p0, v3}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lbx2$c;->c:Lbx2$a;

    invoke-virtual {v3, p1}, Lbx2$a;->k(Lbx2;)V

    invoke-static {v0, v2}, Lbx2;->p(Lbx2;LGh3;)Lbx2;

    :cond_0
    return-object v1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lbx2$c;->a()Lrp;

    move-result-object v1

    invoke-virtual {v1, v0}, Lrp;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lbx2$c;->a()Lrp;

    move-result-object v0

    invoke-virtual {v0}, Lrp;->f()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    sget-object v1, Lqp;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lbx2$c;->a()Lrp;

    move-result-object v0

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    iget-object v0, p0, Lbx2$c;->c:Lbx2$a;

    iget-object v1, p0, Lbx2$c;->b:Lbx2;

    invoke-virtual {v0, p1, v1}, Lbx2$a;->n(Lbx2;Lbx2;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lbx2$c;->b:Lbx2;

    :goto_1
    sget-object v1, Lbx2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lbx2$c;->c:Lbx2$a;

    invoke-virtual {v0, p0}, Lbx2$a;->g(Lbx2$c;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrepareOp(op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbx2$c;->a()Lrp;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
