.class public final LL1;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Lp2;

.field public final d:I


# direct methods
.method public constructor <init>(ILp2;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, LL1;->b:I

    iput-object p2, p0, LL1;->c:Lp2;

    iput p3, p0, LL1;->d:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    iget v1, p0, LL1;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, LL1;->c:Lp2;

    iget v1, p0, LL1;->d:I

    invoke-virtual {v0, v1, p1}, Lp2;->U(ILandroid/os/Bundle;)Z

    return-void
.end method
