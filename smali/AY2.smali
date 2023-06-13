.class public final LAY2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLifecycleOwner;
.implements LXr6;
.implements Landroidx/lifecycle/e;
.implements LPi5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAY2$a;,
        LAY2$b;,
        LAY2$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003W\u001c BS\u0008\u0002\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010&\u001a\u00020\u001f\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0008\u0002\u0010.\u001a\u00020+\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010/\u0012\u0008\u0008\u0002\u00106\u001a\u000202\u0012\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008R\u0010SB\u001d\u0008\u0017\u0012\u0006\u0010T\u001a\u00020\u0000\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008R\u0010UJ\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0007J\u0008\u0010\u000b\u001a\u00020\tH\u0007J\u0008\u0010\r\u001a\u00020\u000cH\u0016J\u0008\u0010\u000f\u001a\u00020\u000eH\u0016J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0013\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\u0008\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u0019\u0010*\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008\'\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u00100R\u0017\u00106\u001a\u0002028\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00083\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u0010(R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010>R\u0016\u0010A\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010@R\u001b\u0010E\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010C\u001a\u0004\u0008,\u0010DR\u001b\u0010I\u001a\u00020F8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008G\u0010C\u001a\u0004\u0008:\u0010HR*\u0010M\u001a\u00020+2\u0006\u0010J\u001a\u00020+8G@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010-\u001a\u0004\u00087\u0010K\"\u0004\u0008G\u0010LR\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010P\u00a8\u0006X"
    }
    d2 = {
        "LAY2;",
        "LLifecycleOwner;",
        "LXr6;",
        "Landroidx/lifecycle/e;",
        "LPi5;",
        "Landroidx/lifecycle/f;",
        "getLifecycle",
        "Landroidx/lifecycle/f$a;",
        "event",
        "",
        "j",
        "n",
        "LWr6;",
        "getViewModelStore",
        "Landroidx/lifecycle/u$b;",
        "getDefaultViewModelProviderFactory",
        "LFE0;",
        "getDefaultViewModelCreationExtras",
        "Landroid/os/Bundle;",
        "outBundle",
        "k",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "LHY2;",
        "c",
        "LHY2;",
        "f",
        "()LHY2;",
        "l",
        "(LHY2;)V",
        "destination",
        "d",
        "Landroid/os/Bundle;",
        "()Landroid/os/Bundle;",
        "arguments",
        "Landroidx/lifecycle/f$b;",
        "e",
        "Landroidx/lifecycle/f$b;",
        "hostLifecycleState",
        "LYY2;",
        "LYY2;",
        "viewModelStoreProvider",
        "",
        "g",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "id",
        "h",
        "savedState",
        "Landroidx/lifecycle/j;",
        "i",
        "Landroidx/lifecycle/j;",
        "lifecycle",
        "LOi5;",
        "LOi5;",
        "savedStateRegistryController",
        "Z",
        "savedStateRegistryAttached",
        "Landroidx/lifecycle/r;",
        "Lkotlin/Lazy;",
        "()Landroidx/lifecycle/r;",
        "defaultFactory",
        "Landroidx/lifecycle/p;",
        "m",
        "()Landroidx/lifecycle/p;",
        "savedStateHandle",
        "maxState",
        "()Landroidx/lifecycle/f$b;",
        "(Landroidx/lifecycle/f$b;)V",
        "maxLifecycle",
        "Landroidx/savedstate/a;",
        "getSavedStateRegistry",
        "()Landroidx/savedstate/a;",
        "savedStateRegistry",
        "<init>",
        "(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;)V",
        "entry",
        "(LAY2;Landroid/os/Bundle;)V",
        "o",
        "a",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final o:LAY2$a;


# instance fields
.field public final b:Landroid/content/Context;

.field public c:LHY2;

.field public final d:Landroid/os/Bundle;

.field public e:Landroidx/lifecycle/f$b;

.field public final f:LYY2;

.field public final g:Ljava/lang/String;

.field public final h:Landroid/os/Bundle;

.field public i:Landroidx/lifecycle/j;

.field public final j:LOi5;

.field public k:Z

.field public final l:Lkotlin/Lazy;

.field public final m:Lkotlin/Lazy;

.field public n:Landroidx/lifecycle/f$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LAY2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAY2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAY2;->o:LAY2$a;

    return-void
.end method

.method public constructor <init>(LAY2;Landroid/os/Bundle;)V
    .locals 9

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, LAY2;->b:Landroid/content/Context;

    iget-object v3, p1, LAY2;->c:LHY2;

    iget-object v5, p1, LAY2;->e:Landroidx/lifecycle/f$b;

    iget-object v6, p1, LAY2;->f:LYY2;

    iget-object v7, p1, LAY2;->g:Ljava/lang/String;

    iget-object v8, p1, LAY2;->h:Landroid/os/Bundle;

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, LAY2;-><init>(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p2, p1, LAY2;->e:Landroidx/lifecycle/f$b;

    iput-object p2, p0, LAY2;->e:Landroidx/lifecycle/f$b;

    iget-object p1, p1, LAY2;->n:Landroidx/lifecycle/f$b;

    invoke-virtual {p0, p1}, LAY2;->m(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAY2;->b:Landroid/content/Context;

    iput-object p2, p0, LAY2;->c:LHY2;

    iput-object p3, p0, LAY2;->d:Landroid/os/Bundle;

    iput-object p4, p0, LAY2;->e:Landroidx/lifecycle/f$b;

    iput-object p5, p0, LAY2;->f:LYY2;

    iput-object p6, p0, LAY2;->g:Ljava/lang/String;

    iput-object p7, p0, LAY2;->h:Landroid/os/Bundle;

    new-instance p1, Landroidx/lifecycle/j;

    invoke-direct {p1, p0}, Landroidx/lifecycle/j;-><init>(LLifecycleOwner;)V

    iput-object p1, p0, LAY2;->i:Landroidx/lifecycle/j;

    sget-object p1, LOi5;->d:LOi5$a;

    invoke-virtual {p1, p0}, LOi5$a;->a(LPi5;)LOi5;

    move-result-object p1

    iput-object p1, p0, LAY2;->j:LOi5;

    new-instance p1, LAY2$d;

    invoke-direct {p1, p0}, LAY2$d;-><init>(LAY2;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LAY2;->l:Lkotlin/Lazy;

    new-instance p1, LAY2$e;

    invoke-direct {p1, p0}, LAY2$e;-><init>(LAY2;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LAY2;->m:Lkotlin/Lazy;

    sget-object p1, Landroidx/lifecycle/f$b;->c:Landroidx/lifecycle/f$b;

    iput-object p1, p0, LAY2;->n:Landroidx/lifecycle/f$b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LAY2;-><init>(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static final synthetic a(LAY2;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LAY2;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(LAY2;)Landroidx/lifecycle/j;
    .locals 0

    iget-object p0, p0, LAY2;->i:Landroidx/lifecycle/j;

    return-object p0
.end method

.method public static final synthetic c(LAY2;)Z
    .locals 0

    iget-boolean p0, p0, LAY2;->k:Z

    return p0
.end method


# virtual methods
.method public final d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LAY2;->d:Landroid/os/Bundle;

    return-object v0
.end method

.method public final e()Landroidx/lifecycle/r;
    .locals 1

    iget-object v0, p0, LAY2;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    instance-of v1, p1, LAY2;

    if-nez v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v1, p0, LAY2;->g:Ljava/lang/String;

    check-cast p1, LAY2;

    iget-object v2, p1, LAY2;->g:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LAY2;->c:LHY2;

    iget-object v2, p1, LAY2;->c:LHY2;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LAY2;->i:Landroidx/lifecycle/j;

    iget-object v2, p1, LAY2;->i:Landroidx/lifecycle/j;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, LAY2;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v1

    invoke-virtual {p1}, LAY2;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LAY2;->d:Landroid/os/Bundle;

    iget-object v2, p1, LAY2;->d:Landroid/os/Bundle;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_6

    iget-object v1, p0, LAY2;->d:Landroid/os/Bundle;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    move p1, v2

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, LAY2;->d:Landroid/os/Bundle;

    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p1, LAY2;->d:Landroid/os/Bundle;

    if-eqz v5, :cond_4

    invoke-virtual {v5, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    move p1, v0

    :goto_1
    if-ne p1, v2, :cond_5

    move p1, v2

    goto :goto_2

    :cond_5
    move p1, v0

    :goto_2
    if-eqz p1, :cond_7

    :cond_6
    move v0, v2

    :cond_7
    :goto_3
    return v0
.end method

.method public final f()LHY2;
    .locals 1

    iget-object v0, p0, LAY2;->c:LHY2;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAY2;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getDefaultViewModelCreationExtras()LFE0;
    .locals 4

    new-instance v0, LqX2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, LqX2;-><init>(LFE0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, LAY2;->b:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    instance-of v3, v1, Landroid/app/Application;

    if-eqz v3, :cond_1

    move-object v2, v1

    check-cast v2, Landroid/app/Application;

    :cond_1
    if-eqz v2, :cond_2

    sget-object v1, Landroidx/lifecycle/u$a;->h:LFE0$b;

    invoke-virtual {v0, v1, v2}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    :cond_2
    sget-object v1, Landroidx/lifecycle/q;->a:LFE0$b;

    invoke-virtual {v0, v1, p0}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    sget-object v1, Landroidx/lifecycle/q;->b:LFE0$b;

    invoke-virtual {v0, v1, p0}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    iget-object v1, p0, LAY2;->d:Landroid/os/Bundle;

    if-eqz v1, :cond_3

    sget-object v2, Landroidx/lifecycle/q;->c:LFE0$b;

    invoke-virtual {v0, v2, v1}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    :cond_3
    return-object v0
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/u$b;
    .locals 1

    invoke-virtual {p0}, LAY2;->e()Landroidx/lifecycle/r;

    move-result-object v0

    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, LAY2;->i:Landroidx/lifecycle/j;

    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    iget-object v0, p0, LAY2;->j:LOi5;

    invoke-virtual {v0}, LOi5;->b()Landroidx/savedstate/a;

    move-result-object v0

    return-object v0
.end method

.method public getViewModelStore()LWr6;
    .locals 2

    iget-boolean v0, p0, LAY2;->k:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LAY2;->i:Landroidx/lifecycle/j;

    invoke-virtual {v0}, Landroidx/lifecycle/j;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$b;->b:Landroidx/lifecycle/f$b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, LAY2;->f:LYY2;

    if-eqz v0, :cond_1

    iget-object v1, p0, LAY2;->g:Ljava/lang/String;

    invoke-interface {v0, v1}, LYY2;->b(Ljava/lang/String;)LWr6;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Landroidx/lifecycle/f$b;
    .locals 1

    iget-object v0, p0, LAY2;->n:Landroidx/lifecycle/f$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, LAY2;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LAY2;->c:LHY2;

    invoke-virtual {v1}, LHY2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LAY2;->d:Landroid/os/Bundle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, LAY2;->d:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LAY2;->i:Landroidx/lifecycle/j;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LAY2;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Landroidx/lifecycle/p;
    .locals 1

    iget-object v0, p0, LAY2;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/p;

    return-object v0
.end method

.method public final j(Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/f$a;->c()Landroidx/lifecycle/f$b;

    move-result-object p1

    const-string v0, "event.targetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LAY2;->e:Landroidx/lifecycle/f$b;

    invoke-virtual {p0}, LAY2;->n()V

    return-void
.end method

.method public final k(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAY2;->j:LOi5;

    invoke-virtual {v0, p1}, LOi5;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final l(LHY2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LAY2;->c:LHY2;

    return-void
.end method

.method public final m(Landroidx/lifecycle/f$b;)V
    .locals 1

    const-string v0, "maxState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LAY2;->n:Landroidx/lifecycle/f$b;

    invoke-virtual {p0}, LAY2;->n()V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-boolean v0, p0, LAY2;->k:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LAY2;->j:LOi5;

    invoke-virtual {v0}, LOi5;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LAY2;->k:Z

    iget-object v0, p0, LAY2;->f:LYY2;

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/q;->c(LPi5;)V

    :cond_0
    iget-object v0, p0, LAY2;->j:LOi5;

    iget-object v1, p0, LAY2;->h:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, LOi5;->d(Landroid/os/Bundle;)V

    :cond_1
    iget-object v0, p0, LAY2;->e:Landroidx/lifecycle/f$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, LAY2;->n:Landroidx/lifecycle/f$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, LAY2;->i:Landroidx/lifecycle/j;

    iget-object v1, p0, LAY2;->e:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LAY2;->i:Landroidx/lifecycle/j;

    iget-object v1, p0, LAY2;->n:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    :goto_0
    return-void
.end method
