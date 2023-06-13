.class public LMX0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX56$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMX0;->u()LX56$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LMX0;


# direct methods
.method public constructor <init>(LMX0;)V
    .locals 0

    iput-object p1, p0, LMX0$c;->a:LMX0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LMX0$c;->a:LMX0;

    iget-object v1, v0, LMX0;->a:Landroid/view/View;

    iget-object v0, v0, LMX0;->i:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LMX0$c;->a:LMX0;

    iget-object v0, v0, LMX0;->b:LwO1;

    invoke-interface {v0}, LwO1;->Z()LI41;

    move-result-object v0

    sget-object v1, LI41;->b:LI41;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LMX0$c;->a:LMX0;

    invoke-virtual {v0}, LMX0;->k()V

    :cond_0
    return-void
.end method
