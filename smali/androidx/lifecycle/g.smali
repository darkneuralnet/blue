.class public final Landroidx/lifecycle/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/lifecycle/g;",
        "",
        "",
        "b",
        "Landroidx/lifecycle/f;",
        "a",
        "Landroidx/lifecycle/f;",
        "lifecycle",
        "Landroidx/lifecycle/f$b;",
        "Landroidx/lifecycle/f$b;",
        "minState",
        "LK41;",
        "c",
        "LK41;",
        "dispatchQueue",
        "Landroidx/lifecycle/i;",
        "d",
        "Landroidx/lifecycle/i;",
        "observer",
        "Lzh2;",
        "parentJob",
        "<init>",
        "(Landroidx/lifecycle/f;Landroidx/lifecycle/f$b;LK41;Lzh2;)V",
        "lifecycle-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/f;

.field public final b:Landroidx/lifecycle/f$b;

.field public final c:LK41;

.field public final d:Landroidx/lifecycle/i;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/f;Landroidx/lifecycle/f$b;LK41;Lzh2;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatchQueue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentJob"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/g;->a:Landroidx/lifecycle/f;

    iput-object p2, p0, Landroidx/lifecycle/g;->b:Landroidx/lifecycle/f$b;

    iput-object p3, p0, Landroidx/lifecycle/g;->c:LK41;

    new-instance p2, Lyq2;

    invoke-direct {p2, p0, p4}, Lyq2;-><init>(Landroidx/lifecycle/g;Lzh2;)V

    iput-object p2, p0, Landroidx/lifecycle/g;->d:Landroidx/lifecycle/i;

    invoke-virtual {p1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object p3

    sget-object v0, Landroidx/lifecycle/f$b;->b:Landroidx/lifecycle/f$b;

    if-ne p3, v0, :cond_0

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p4, p2, p1, p2}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/lifecycle/g;->b()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroidx/lifecycle/f;->a(LFq2;)V

    :goto_0
    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/g;Lzh2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/lifecycle/g;->c(Landroidx/lifecycle/g;Lzh2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public static final c(Landroidx/lifecycle/g;Lzh2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$parentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 1>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object p3

    sget-object v0, Landroidx/lifecycle/f$b;->b:Landroidx/lifecycle/f$b;

    if-ne p3, v0, :cond_0

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, p2, p3}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/lifecycle/g;->b()V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object p1

    iget-object p2, p0, Landroidx/lifecycle/g;->b:Landroidx/lifecycle/f$b;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-gez p1, :cond_1

    iget-object p0, p0, Landroidx/lifecycle/g;->c:LK41;

    invoke-virtual {p0}, LK41;->h()V

    goto :goto_0

    :cond_1
    iget-object p0, p0, Landroidx/lifecycle/g;->c:LK41;

    invoke-virtual {p0}, LK41;->i()V

    :goto_0
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/g;->a:Landroidx/lifecycle/f;

    iget-object v1, p0, Landroidx/lifecycle/g;->d:Landroidx/lifecycle/i;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->d(LFq2;)V

    iget-object v0, p0, Landroidx/lifecycle/g;->c:LK41;

    invoke-virtual {v0}, LK41;->g()V

    return-void
.end method
