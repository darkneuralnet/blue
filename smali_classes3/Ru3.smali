.class public final synthetic LRu3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LQu3;

.field public final synthetic c:LQu3$b;


# direct methods
.method public synthetic constructor <init>(LQu3;LQu3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRu3;->b:LQu3;

    iput-object p2, p0, LRu3;->c:LQu3$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LRu3;->b:LQu3;

    iget-object v1, p0, LRu3;->c:LQu3$b;

    invoke-static {v0, v1, p1}, LQu3$b;->a(LQu3;LQu3$b;Landroid/view/View;)V

    return-void
.end method
