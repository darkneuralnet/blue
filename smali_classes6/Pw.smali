.class public final synthetic LPw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/skydoves/balloon/Balloon;


# direct methods
.method public synthetic constructor <init>(Lhf3;Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LPw;->b:Lcom/skydoves/balloon/Balloon;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, LPw;->b:Lcom/skydoves/balloon/Balloon;

    invoke-static {v0, v1, p1}, Lcom/skydoves/balloon/Balloon;->f(Lhf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V

    return-void
.end method
