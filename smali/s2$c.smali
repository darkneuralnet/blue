.class public Ls2$c;
.super Ls2$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Ls2;)V
    .locals 0

    invoke-direct {p0, p1}, Ls2$b;-><init>(Ls2;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Ls2$a;->a:Ls2;

    invoke-static {p2}, Lp2;->V0(Landroid/view/accessibility/AccessibilityNodeInfo;)Lp2;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, p4}, Ls2;->a(ILp2;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
