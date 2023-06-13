.class public final Landroidx/lifecycle/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\u000c\u0008\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\u000c\u0010\u000f\u001a\u00020\u000c*\u00020\u000eH\u0007\"\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00108\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\"\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011\"\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00108\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0011\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "LPi5;",
        "LXr6;",
        "T",
        "",
        "c",
        "(LPi5;)V",
        "savedStateRegistryOwner",
        "viewModelStoreOwner",
        "",
        "key",
        "Landroid/os/Bundle;",
        "defaultArgs",
        "Landroidx/lifecycle/p;",
        "b",
        "LFE0;",
        "a",
        "LFE0$b;",
        "LFE0$b;",
        "SAVED_STATE_REGISTRY_OWNER_KEY",
        "VIEW_MODEL_STORE_OWNER_KEY",
        "DEFAULT_ARGS_KEY",
        "LMi5;",
        "e",
        "(LXr6;)LMi5;",
        "savedStateHandlesVM",
        "LLi5;",
        "d",
        "(LPi5;)LLi5;",
        "savedStateHandlesProvider",
        "lifecycle-viewmodel-savedstate_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "SavedStateHandleSupport"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LFE0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFE0$b<",
            "LPi5;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final b:LFE0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFE0$b<",
            "LXr6;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final c:LFE0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFE0$b<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/q$b;

    invoke-direct {v0}, Landroidx/lifecycle/q$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/q;->a:LFE0$b;

    new-instance v0, Landroidx/lifecycle/q$c;

    invoke-direct {v0}, Landroidx/lifecycle/q$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/q;->b:LFE0$b;

    new-instance v0, Landroidx/lifecycle/q$a;

    invoke-direct {v0}, Landroidx/lifecycle/q$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/q;->c:LFE0$b;

    return-void
.end method

.method public static final a(LFE0;)Landroidx/lifecycle/p;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/q;->a:LFE0$b;

    invoke-virtual {p0, v0}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPi5;

    if-eqz v0, :cond_2

    sget-object v1, Landroidx/lifecycle/q;->b:LFE0$b;

    invoke-virtual {p0, v1}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXr6;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/lifecycle/q;->c:LFE0$b;

    invoke-virtual {p0, v2}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/u$c;->d:LFE0$b;

    invoke-virtual {p0, v3}, LFE0;->a(LFE0$b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {v0, v1, p0, v2}, Landroidx/lifecycle/q;->b(LPi5;LXr6;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/p;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LPi5;LXr6;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/p;
    .locals 1

    invoke-static {p0}, Landroidx/lifecycle/q;->d(LPi5;)LLi5;

    move-result-object p0

    invoke-static {p1}, Landroidx/lifecycle/q;->e(LXr6;)LMi5;

    move-result-object p1

    invoke-virtual {p1}, LMi5;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/p;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/p;->f:Landroidx/lifecycle/p$a;

    invoke-virtual {p0, p2}, LLi5;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0, p3}, Landroidx/lifecycle/p$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/p;

    move-result-object v0

    invoke-virtual {p1}, LMi5;->e()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static final c(LPi5;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LPi5;",
            ":",
            "LXr6;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$b;->c:Landroidx/lifecycle/f$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/f$b;->d:Landroidx/lifecycle/f$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Landroidx/savedstate/a;->c(Ljava/lang/String;)Landroidx/savedstate/a$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, LLi5;

    invoke-interface {p0}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    move-object v3, p0

    check-cast v3, LXr6;

    invoke-direct {v0, v2, v3}, LLi5;-><init>(Landroidx/savedstate/a;LXr6;)V

    invoke-interface {p0}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroidx/savedstate/a;->i(Ljava/lang/String;Landroidx/savedstate/a$c;)V

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(LLi5;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(LPi5;)LLi5;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object p0

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {p0, v0}, Landroidx/savedstate/a;->c(Ljava/lang/String;)Landroidx/savedstate/a$c;

    move-result-object p0

    instance-of v0, p0, LLi5;

    if-eqz v0, :cond_0

    check-cast p0, LLi5;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(LXr6;)LMi5;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG22;

    invoke-direct {v0}, LG22;-><init>()V

    sget-object v1, Landroidx/lifecycle/q$d;->g:Landroidx/lifecycle/q$d;

    const-class v2, LMi5;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, LG22;->a(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, LG22;->b()Landroidx/lifecycle/u$b;

    move-result-object v0

    new-instance v1, Landroidx/lifecycle/u;

    invoke-direct {v1, p0, v0}, Landroidx/lifecycle/u;-><init>(LXr6;Landroidx/lifecycle/u$b;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v1, p0, v2}, Landroidx/lifecycle/u;->b(Ljava/lang/String;Ljava/lang/Class;)LOr6;

    move-result-object p0

    check-cast p0, LMi5;

    return-object p0
.end method
