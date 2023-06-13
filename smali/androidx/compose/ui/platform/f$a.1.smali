.class public final Landroidx/compose/ui/platform/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/f;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/compose/ui/platform/f$a",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroid/view/View;",
        "view",
        "",
        "onViewAttachedToWindow",
        "onViewDetachedFromWindow",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Landroidx/compose/ui/platform/f;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/f;->w()Landroid/view/accessibility/AccessibilityManager;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f;->A()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    iget-object p1, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/f;->w()Landroid/view/accessibility/AccessibilityManager;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f;->E()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-static {p1}, Landroidx/compose/ui/platform/f;->f(Landroidx/compose/ui/platform/f;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-static {v0}, Landroidx/compose/ui/platform/f;->g(Landroidx/compose/ui/platform/f;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/f;->w()Landroid/view/accessibility/AccessibilityManager;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f;->A()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    iget-object p1, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/f;->w()Landroid/view/accessibility/AccessibilityManager;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/f$a;->b:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f;->E()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    return-void
.end method
