.class public final synthetic Lq84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lp84$b;

.field public final synthetic c:Lp84;


# direct methods
.method public synthetic constructor <init>(Lp84$b;Lp84;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq84;->b:Lp84$b;

    iput-object p2, p0, Lq84;->c:Lp84;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lq84;->b:Lp84$b;

    iget-object v1, p0, Lq84;->c:Lp84;

    invoke-static {v0, v1, p1}, Lp84$b;->a(Lp84$b;Lp84;Landroid/view/View;)V

    return-void
.end method
