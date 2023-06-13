.class public final Ll06;
.super LpG2;
.source "SourceFile"

# interfaces
.implements LqZ0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll06$a;,
        Ll06$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0000\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002%&B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\"\u0010#J\u001c\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\'"
    }
    d2 = {
        "Ll06;",
        "LpG2;",
        "LqZ0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "",
        "y",
        "",
        "B",
        "A",
        "",
        "timeMillis",
        "LWc0;",
        "continuation",
        "l",
        "Lo51;",
        "t",
        "LSC0;",
        "c",
        "LSC0;",
        "mainDispatcher",
        "Ll06$b;",
        "d",
        "Ll06$b;",
        "delegate",
        "G",
        "()LpG2;",
        "immediate",
        "S",
        "()LqZ0;",
        "delay",
        "<init>",
        "(LSC0;)V",
        "e",
        "a",
        "b",
        "kotlinx-coroutines-test"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final e:Ll06$a;


# instance fields
.field public final c:LSC0;

.field public d:Ll06$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll06$b<",
            "LSC0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll06$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll06$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll06;->e:Ll06$a;

    return-void
.end method

.method public constructor <init>(LSC0;)V
    .locals 2

    invoke-direct {p0}, LpG2;-><init>()V

    iput-object p1, p0, Ll06;->c:LSC0;

    new-instance v0, Ll06$b;

    const-string v1, "Dispatchers.Main"

    invoke-direct {v0, p1, v1}, Ll06$b;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll06;->d:Ll06$b;

    return-void
.end method


# virtual methods
.method public A(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ll06;->d:Ll06$b;

    invoke-virtual {v0}, Ll06$b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSC0;

    invoke-virtual {v0, p1, p2}, LSC0;->A(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(Lkotlin/coroutines/CoroutineContext;)Z
    .locals 1

    iget-object v0, p0, Ll06;->d:Ll06$b;

    invoke-virtual {v0}, Ll06$b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSC0;

    invoke-virtual {v0, p1}, LSC0;->B(Lkotlin/coroutines/CoroutineContext;)Z

    move-result p1

    return p1
.end method

.method public G()LpG2;
    .locals 2

    iget-object v0, p0, Ll06;->d:Ll06$b;

    invoke-virtual {v0}, Ll06$b;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LpG2;

    if-eqz v1, :cond_0

    check-cast v0, LpG2;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LpG2;->G()LpG2;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    move-object v0, p0

    :cond_2
    return-object v0
.end method

.method public final S()LqZ0;
    .locals 2

    iget-object v0, p0, Ll06;->d:Ll06$b;

    invoke-virtual {v0}, Ll06$b;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LqZ0;

    if-eqz v1, :cond_0

    check-cast v0, LqZ0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, LbX0;->a()LqZ0;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public l(JLWc0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LWc0<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ll06;->S()LqZ0;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LqZ0;->l(JLWc0;)V

    return-void
.end method

.method public t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;
    .locals 1

    invoke-virtual {p0}, Ll06;->S()LqZ0;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LqZ0;->t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;

    move-result-object p1

    return-object p1
.end method

.method public y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ll06;->d:Ll06$b;

    invoke-virtual {v0}, Ll06$b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSC0;

    invoke-virtual {v0, p1, p2}, LSC0;->y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method
