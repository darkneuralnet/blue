.class public final synthetic LNv3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LMv3$b;

.field public final synthetic c:LMv3;


# direct methods
.method public synthetic constructor <init>(LMv3$b;LMv3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNv3;->b:LMv3$b;

    iput-object p2, p0, LNv3;->c:LMv3;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LNv3;->b:LMv3$b;

    iget-object v1, p0, LNv3;->c:LMv3;

    invoke-static {v0, v1, p1}, LMv3$b;->a(LMv3$b;LMv3;Landroid/view/View;)V

    return-void
.end method
