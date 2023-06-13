.class public LW03$c$a;
.super LM1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW03$c;->A(Landroid/view/View;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:LW03$c;


# direct methods
.method public constructor <init>(LW03$c;IZ)V
    .locals 0

    iput-object p1, p0, LW03$c$a;->c:LW03$c;

    iput p2, p0, LW03$c$a;->a:I

    iput-boolean p3, p0, LW03$c$a;->b:Z

    invoke-direct {p0}, LM1;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Lp2;)V
    .locals 8

    invoke-super {p0, p1, p2}, LM1;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lp2;)V

    iget-object v0, p0, LW03$c$a;->c:LW03$c;

    iget v1, p0, LW03$c$a;->a:I

    invoke-static {v0, v1}, LW03$c;->o(LW03$c;I)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    iget-boolean v6, p0, LW03$c$a;->b:Z

    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v7

    invoke-static/range {v2 .. v7}, Lp2$c;->a(IIIIZZ)Lp2$c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp2;->i0(Ljava/lang/Object;)V

    return-void
.end method
