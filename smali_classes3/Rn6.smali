.class public final synthetic LRn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LQn6;


# direct methods
.method public synthetic constructor <init>(LQn6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRn6;->b:LQn6;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LRn6;->b:LQn6;

    invoke-static {v0, p1}, LQn6$b;->a(LQn6;Landroid/view/View;)V

    return-void
.end method
