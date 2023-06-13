.class public Landroidx/transition/c$a$a;
.super Landroidx/transition/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/c$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lso;

.field public final synthetic b:Landroidx/transition/c$a;


# direct methods
.method public constructor <init>(Landroidx/transition/c$a;Lso;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/c$a$a;->b:Landroidx/transition/c$a;

    iput-object p2, p0, Landroidx/transition/c$a$a;->a:Lso;

    invoke-direct {p0}, Landroidx/transition/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 2

    iget-object v0, p0, Landroidx/transition/c$a$a;->a:Lso;

    iget-object v1, p0, Landroidx/transition/c$a$a;->b:Landroidx/transition/c$a;

    iget-object v1, v1, Landroidx/transition/c$a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, LNA5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->h0(Landroidx/transition/Transition$f;)Landroidx/transition/Transition;

    return-void
.end method
