.class public final synthetic LmF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LlF;


# direct methods
.method public synthetic constructor <init>(LlF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmF;->b:LlF;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LmF;->b:LlF;

    invoke-static {v0, p1}, LlF$b;->a(LlF;Landroid/view/View;)V

    return-void
.end method
