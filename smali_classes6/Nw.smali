.class public final synthetic LNw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Ldf3;

.field public final synthetic c:Lcom/skydoves/balloon/Balloon;


# direct methods
.method public synthetic constructor <init>(Ldf3;Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNw;->b:Ldf3;

    iput-object p2, p0, LNw;->c:Lcom/skydoves/balloon/Balloon;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LNw;->b:Ldf3;

    iget-object v1, p0, LNw;->c:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0, v1, p1}, Lcom/skydoves/balloon/Balloon;->a(Ldf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V

    return-void
.end method
