.class public abstract Lgz5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u0003\u001a\u00020\u0002H$J\u0008\u0010\u0005\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0006H\u0016J\u0008\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lgz5;",
        "",
        "",
        "e",
        "",
        "c",
        "LqV5;",
        "b",
        "statement",
        "h",
        "d",
        "",
        "canUseCached",
        "g",
        "LEb5;",
        "a",
        "LEb5;",
        "database",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "lock",
        "Lkotlin/Lazy;",
        "f",
        "()LqV5;",
        "stmt",
        "<init>",
        "(LEb5;)V",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:LEb5;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgz5;->a:LEb5;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lgz5;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lgz5$a;

    invoke-direct {p1, p0}, Lgz5$a;-><init>(Lgz5;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lgz5;->c:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic a(Lgz5;)LqV5;
    .locals 0

    invoke-virtual {p0}, Lgz5;->d()LqV5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()LqV5;
    .locals 3

    invoke-virtual {p0}, Lgz5;->c()V

    iget-object v0, p0, Lgz5;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lgz5;->g(Z)LqV5;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lgz5;->a:LEb5;

    invoke-virtual {v0}, LEb5;->a()V

    return-void
.end method

.method public final d()LqV5;
    .locals 2

    invoke-virtual {p0}, Lgz5;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgz5;->a:LEb5;

    invoke-virtual {v1, v0}, LEb5;->d(Ljava/lang/String;)LqV5;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public final f()LqV5;
    .locals 1

    iget-object v0, p0, Lgz5;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqV5;

    return-object v0
.end method

.method public final g(Z)LqV5;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lgz5;->f()LqV5;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lgz5;->d()LqV5;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public h(LqV5;)V
    .locals 1

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lgz5;->f()LqV5;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lgz5;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
