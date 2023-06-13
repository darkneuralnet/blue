.class public final LTX2$d;
.super Lrp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTX2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrp<",
        "LTX2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000c\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "LTX2$d;",
        "Lrp;",
        "LTX2;",
        "affected",
        "",
        "k",
        "failure",
        "",
        "j",
        "LTX2$c;",
        "b",
        "LTX2$c;",
        "queue",
        "<init>",
        "(LTX2$c;)V",
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
.field public final b:LTX2$c;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LTX2$c;)V
    .locals 0

    invoke-direct {p0}, Lrp;-><init>()V

    iput-object p1, p0, LTX2$d;->b:LTX2$c;

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LTX2;

    invoke-virtual {p0, p1, p2}, LTX2$d;->j(LTX2;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTX2;

    invoke-virtual {p0, p1}, LTX2$d;->k(LTX2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(LTX2;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-static {}, LUX2;->d()LLa1;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, LTX2$d;->b:LTX2$c;

    :goto_0
    sget-object v0, LTX2;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p1, p0, p2}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public k(LTX2;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LTX2$d;->b:LTX2$c;

    invoke-virtual {p1}, LZw2;->P()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, LUX2;->g()LuX5;

    move-result-object p1

    :goto_0
    return-object p1
.end method
