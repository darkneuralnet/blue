.class public final Landroidx/lifecycle/r;
.super Landroidx/lifecycle/u$d;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0016\u00a2\u0006\u0004\u0008%\u0010&B%\u0008\u0017\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008%\u0010)J/\u0010\t\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\t\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0017R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006*"
    }
    d2 = {
        "Landroidx/lifecycle/r;",
        "Landroidx/lifecycle/u$d;",
        "Landroidx/lifecycle/u$b;",
        "LOr6;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "LFE0;",
        "extras",
        "create",
        "(Ljava/lang/Class;LFE0;)LOr6;",
        "",
        "key",
        "b",
        "(Ljava/lang/String;Ljava/lang/Class;)LOr6;",
        "(Ljava/lang/Class;)LOr6;",
        "viewModel",
        "",
        "a",
        "Landroid/app/Application;",
        "Landroid/app/Application;",
        "application",
        "c",
        "Landroidx/lifecycle/u$b;",
        "factory",
        "Landroid/os/Bundle;",
        "d",
        "Landroid/os/Bundle;",
        "defaultArgs",
        "Landroidx/lifecycle/f;",
        "e",
        "Landroidx/lifecycle/f;",
        "lifecycle",
        "Landroidx/savedstate/a;",
        "f",
        "Landroidx/savedstate/a;",
        "savedStateRegistry",
        "<init>",
        "()V",
        "LPi5;",
        "owner",
        "(Landroid/app/Application;LPi5;Landroid/os/Bundle;)V",
        "lifecycle-viewmodel-savedstate_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public b:Landroid/app/Application;

.field public final c:Landroidx/lifecycle/u$b;

.field public d:Landroid/os/Bundle;

.field public e:Landroidx/lifecycle/f;

.field public f:Landroidx/savedstate/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/u$d;-><init>()V

    new-instance v0, Landroidx/lifecycle/u$a;

    invoke-direct {v0}, Landroidx/lifecycle/u$a;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/r;->c:Landroidx/lifecycle/u$b;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;LPi5;Landroid/os/Bundle;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    const-string v0, "owner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/u$d;-><init>()V

    invoke-interface {p2}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/r;->f:Landroidx/savedstate/a;

    invoke-interface {p2}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p2

    iput-object p2, p0, Landroidx/lifecycle/r;->e:Landroidx/lifecycle/f;

    iput-object p3, p0, Landroidx/lifecycle/r;->d:Landroid/os/Bundle;

    iput-object p1, p0, Landroidx/lifecycle/r;->b:Landroid/app/Application;

    if-eqz p1, :cond_0

    sget-object p2, Landroidx/lifecycle/u$a;->f:Landroidx/lifecycle/u$a$a;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/u$a$a;->b(Landroid/app/Application;)Landroidx/lifecycle/u$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/lifecycle/u$a;

    invoke-direct {p1}, Landroidx/lifecycle/u$a;-><init>()V

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/r;->c:Landroidx/lifecycle/u$b;

    return-void
.end method


# virtual methods
.method public a(LOr6;)V
    .locals 2

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/r;->e:Landroidx/lifecycle/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/r;->f:Landroidx/savedstate/a;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/r;->e:Landroidx/lifecycle/f;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1, v0, v1}, Landroidx/lifecycle/LegacySavedStateHandleController;->a(LOr6;Landroidx/savedstate/a;Landroidx/lifecycle/f;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Class;)LOr6;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/r;->e:Landroidx/lifecycle/f;

    if-eqz v0, :cond_4

    const-class v1, Lie;

    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/r;->b:Landroid/app/Application;

    if-eqz v2, :cond_0

    invoke-static {}, LQi5;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {p2, v2}, LQi5;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, LQi5;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {p2, v2}, LQi5;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_2

    iget-object p1, p0, Landroidx/lifecycle/r;->b:Landroid/app/Application;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/lifecycle/r;->c:Landroidx/lifecycle/u$b;

    invoke-interface {p1, p2}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;)LOr6;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, Landroidx/lifecycle/u$c;->b:Landroidx/lifecycle/u$c$a;

    invoke-virtual {p1}, Landroidx/lifecycle/u$c$a;->a()Landroidx/lifecycle/u$c;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/u$c;->create(Ljava/lang/Class;)LOr6;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    iget-object v3, p0, Landroidx/lifecycle/r;->f:Landroidx/savedstate/a;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, p0, Landroidx/lifecycle/r;->d:Landroid/os/Bundle;

    invoke-static {v3, v0, p1, v4}, Landroidx/lifecycle/LegacySavedStateHandleController;->b(Landroidx/savedstate/a;Landroidx/lifecycle/f;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/lifecycle/r;->b:Landroid/app/Application;

    if-eqz v1, :cond_3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aput-object v1, v4, v0

    invoke-virtual {p1}, Landroidx/lifecycle/SavedStateHandleController;->b()Landroidx/lifecycle/p;

    move-result-object v0

    aput-object v0, v4, v3

    invoke-static {p2, v2, v4}, LQi5;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LOr6;

    move-result-object p2

    goto :goto_2

    :cond_3
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/lifecycle/SavedStateHandleController;->b()Landroidx/lifecycle/p;

    move-result-object v3

    aput-object v3, v1, v0

    invoke-static {p2, v2, v1}, LQi5;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LOr6;

    move-result-object p2

    :goto_2
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p2, v0, p1}, LOr6;->setTagIfAbsent(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public create(Ljava/lang/Class;)LOr6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/r;->b(Ljava/lang/String;Ljava/lang/Class;)LOr6;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LFE0;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/u$c;->d:LFE0$b;

    invoke-virtual {p2, v0}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    sget-object v1, Landroidx/lifecycle/q;->a:LFE0$b;

    invoke-virtual {p2, v1}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v1, Landroidx/lifecycle/q;->b:LFE0$b;

    invoke-virtual {p2, v1}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v0, Landroidx/lifecycle/u$a;->h:LFE0$b;

    invoke-virtual {p2, v0}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    const-class v1, Lie;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-static {}, LQi5;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, LQi5;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, LQi5;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, LQi5;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/r;->c:Landroidx/lifecycle/u$b;

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;LFE0;)LOr6;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    invoke-static {p2}, Landroidx/lifecycle/q;->a(LFE0;)Landroidx/lifecycle/p;

    move-result-object p2

    aput-object p2, v1, v4

    invoke-static {p1, v2, v1}, LQi5;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LOr6;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p2}, Landroidx/lifecycle/q;->a(LFE0;)Landroidx/lifecycle/p;

    move-result-object p2

    aput-object p2, v0, v3

    invoke-static {p1, v2, v0}, LQi5;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LOr6;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/r;->e:Landroidx/lifecycle/f;

    if-eqz p2, :cond_4

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/r;->b(Ljava/lang/String;Ljava/lang/Class;)LOr6;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
