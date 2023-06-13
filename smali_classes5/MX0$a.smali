.class public LMX0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMX0;->c(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:LMX0;


# direct methods
.method public constructor <init>(LMX0;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, LMX0$a;->c:LMX0;

    iput-object p2, p0, LMX0$a;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p1, p0, LMX0$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-static {}, LMX0;->j()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Detected (bottom - top) of "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr p5, p3

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " in OnLayoutChangeListener"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LMX0$a;->b:Landroid/view/ViewGroup;

    iget-object p2, p0, LMX0$a;->c:LMX0;

    iget-object p2, p2, LMX0;->a:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object p1, p0, LMX0$a;->c:LMX0;

    iget-object p2, p0, LMX0$a;->b:Landroid/view/ViewGroup;

    iget-object p3, p1, LMX0;->b:LwO1;

    iget-object p4, p1, LMX0;->a:Landroid/view/View;

    iget-object p5, p1, LMX0;->c:LGO1;

    invoke-virtual {p1, p2, p3, p4, p5}, LMX0;->l(Landroid/view/ViewGroup;LwO1;Landroid/view/View;LGO1;)V

    return-void
.end method
