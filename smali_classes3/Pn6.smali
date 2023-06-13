.class public final synthetic LPn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LQn6$a;

.field public final synthetic c:LQn6;


# direct methods
.method public synthetic constructor <init>(LQn6$a;LQn6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPn6;->b:LQn6$a;

    iput-object p2, p0, LPn6;->c:LQn6;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LPn6;->b:LQn6$a;

    iget-object v1, p0, LPn6;->c:LQn6;

    invoke-static {v0, v1, p1}, LQn6$a;->a(LQn6$a;LQn6;Landroid/view/View;)V

    return-void
.end method
