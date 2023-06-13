.class public final synthetic Lnc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc;->a:Landroidx/compose/ui/platform/f;

    return-void
.end method


# virtual methods
.method public final onTouchExplorationStateChanged(Z)V
    .locals 1

    iget-object v0, p0, Lnc;->a:Landroidx/compose/ui/platform/f;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/f;->c(Landroidx/compose/ui/platform/f;Z)V

    return-void
.end method
