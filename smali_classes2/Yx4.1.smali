.class public final synthetic LYx4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LXx4$b;

.field public final synthetic c:LBx4;


# direct methods
.method public synthetic constructor <init>(LXx4$b;LBx4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYx4;->b:LXx4$b;

    iput-object p2, p0, LYx4;->c:LBx4;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LYx4;->b:LXx4$b;

    iget-object v1, p0, LYx4;->c:LBx4;

    invoke-static {v0, v1, p1}, LXx4$b;->a(LXx4$b;LBx4;Landroid/view/View;)V

    return-void
.end method
