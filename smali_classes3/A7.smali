.class public final synthetic LA7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LB7;

.field public final synthetic c:LB7$a;


# direct methods
.method public synthetic constructor <init>(LB7;LB7$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7;->b:LB7;

    iput-object p2, p0, LA7;->c:LB7$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LA7;->b:LB7;

    iget-object v1, p0, LA7;->c:LB7$a;

    invoke-static {v0, v1, p1}, LB7$a;->a(LB7;LB7$a;Landroid/view/View;)V

    return-void
.end method
