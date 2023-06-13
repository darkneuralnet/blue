.class public final synthetic LkF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LlF;

.field public final synthetic c:LlF$a;


# direct methods
.method public synthetic constructor <init>(LlF;LlF$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkF;->b:LlF;

    iput-object p2, p0, LkF;->c:LlF$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LkF;->b:LlF;

    iget-object v1, p0, LkF;->c:LlF$a;

    invoke-static {v0, v1, p1}, LlF$a;->a(LlF;LlF$a;Landroid/view/View;)V

    return-void
.end method
