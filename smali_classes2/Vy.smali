.class public abstract LVy;
.super LxU;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LxU;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0019\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0001\u001a\u00020\u0005H\u0017R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001c"
    }
    d2 = {
        "LVy;",
        "T",
        "LxU;",
        "dataInitializer",
        "()Ljava/lang/Object;",
        "",
        "LZC0;",
        "k",
        "LZC0;",
        "getScope$interface_release",
        "()LZC0;",
        "scope",
        "LGX2;",
        "l",
        "LGX2;",
        "R",
        "()LGX2;",
        "data",
        "Lpy0;",
        "m",
        "Lpy0;",
        "S",
        "()Lpy0;",
        "dataHolder",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(LZC0;Landroid/content/Context;)V",
        "interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final k:LZC0;

.field public final l:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final m:Lpy0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpy0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZC0;Landroid/content/Context;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LxU;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, LVy;->dataInitializer()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, LVy;->l:LGX2;

    new-instance p2, Lpy0;

    invoke-direct {p2}, Lpy0;-><init>()V

    iput-object p2, p0, LVy;->m:Lpy0;

    iput-object p1, p0, LVy;->k:LZC0;

    invoke-virtual {p0}, LVy;->T()V

    return-void
.end method


# virtual methods
.method public final R()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LVy;->l:LGX2;

    return-object v0
.end method

.method public final S()Lpy0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpy0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LVy;->m:Lpy0;

    return-object v0
.end method

.method public T()V
    .locals 4

    iget-object v0, p0, LVy;->k:LZC0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smartlock scope "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LVy;->m:Lpy0;

    invoke-virtual {p0, v0}, LxU;->K(Loy0;)V

    iget-object v0, p0, LVy;->l:LGX2;

    new-instance v2, LVy$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LVy$a;-><init>(LVy;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v2}, LVu1;->L(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object v0

    iget-object v2, p0, LVy;->k:LZC0;

    invoke-static {v0, v2}, LVu1;->I(LEu1;LZC0;)Lzh2;

    const-string v0, "launched smartlock coroutine"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public abstract dataInitializer()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method
