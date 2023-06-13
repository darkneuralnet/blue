.class public final Lcom/stripe/android/link/model/Navigator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u00082\u00103J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ$\u0010\u0011\u001a\u0012\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u000f\"\u0004\u0008\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0006R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010+8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/link/model/Navigator;",
        "",
        "Lcom/stripe/android/link/LinkScreen;",
        "target",
        "",
        "clearBackStack",
        "",
        "navigateTo",
        "(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;",
        "",
        "key",
        "value",
        "setResult",
        "(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;",
        "T",
        "LEu1;",
        "kotlin.jvm.PlatformType",
        "getResultFlow",
        "userInitiated",
        "onBack",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "result",
        "dismiss",
        "(Lcom/stripe/android/link/LinkActivityResult;)Lkotlin/Unit;",
        "Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;",
        "reason",
        "cancel",
        "isOnRootScreen",
        "()Ljava/lang/Boolean;",
        "unregister",
        "userNavigationEnabled",
        "Z",
        "getUserNavigationEnabled",
        "()Z",
        "setUserNavigationEnabled",
        "(Z)V",
        "LOY2;",
        "navigationController",
        "LOY2;",
        "getNavigationController",
        "()LOY2;",
        "setNavigationController",
        "(LOY2;)V",
        "Lkotlin/Function1;",
        "onDismiss",
        "Lkotlin/jvm/functions/Function1;",
        "getOnDismiss",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnDismiss",
        "(Lkotlin/jvm/functions/Function1;)V",
        "<init>",
        "()V",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private navigationController:LOY2;

.field private onDismiss:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private userNavigationEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/stripe/android/link/model/Navigator;->userNavigationEnabled:Z

    return-void
.end method

.method public static synthetic navigateTo$default(Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/LinkScreen;ZILjava/lang/Object;)Lkotlin/Unit;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cancel(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/model/Navigator;->dismiss(Lcom/stripe/android/link/LinkActivityResult;)Lkotlin/Unit;

    return-void
.end method

.method public final dismiss(Lcom/stripe/android/link/LinkActivityResult;)Lkotlin/Unit;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getNavigationController()LOY2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    return-object v0
.end method

.method public final getOnDismiss()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getResultFlow(Ljava/lang/String;)LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "LEu1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDY2;->y()LAY2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LAY2;->i()Landroidx/lifecycle/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p;->g(Ljava/lang/String;)LuX2;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkv1;->a(Landroidx/lifecycle/LiveData;)LEu1;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getUserNavigationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/model/Navigator;->userNavigationEnabled:Z

    return v0
.end method

.method public final isOnRootScreen()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/stripe/android/link/model/NavigatorKt;->isOnRootScreen(LOY2;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;
    .locals 2

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;

    invoke-direct {v1, p2, v0}, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;-><init>(ZLOY2;)V

    invoke-virtual {v0, p1, v1}, LDY2;->O(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final onBack(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/link/model/Navigator;->userNavigationEnabled:Z

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LDY2;->S()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->BackPressed:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/model/Navigator;->cancel(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V

    :cond_1
    return-void
.end method

.method public final setNavigationController(LOY2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    return-void
.end method

.method public final setOnDismiss(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/model/Navigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDY2;->F()LAY2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LAY2;->i()Landroidx/lifecycle/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final setUserNavigationEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/link/model/Navigator;->userNavigationEnabled:Z

    return-void
.end method

.method public final unregister()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/link/model/Navigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Lcom/stripe/android/link/model/Navigator;->navigationController:LOY2;

    return-void
.end method
