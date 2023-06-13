.class public Lcom/facebook/login/widget/LoginButton$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/widget/LoginButton$e;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/login/d;

.field public final synthetic c:Lcom/facebook/login/widget/LoginButton$e;


# direct methods
.method public constructor <init>(Lcom/facebook/login/widget/LoginButton$e;Lcom/facebook/login/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton$e$a;->c:Lcom/facebook/login/widget/LoginButton$e;

    iput-object p2, p0, Lcom/facebook/login/widget/LoginButton$e$a;->b:Lcom/facebook/login/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/login/widget/LoginButton$e$a;->b:Lcom/facebook/login/d;

    invoke-virtual {p1}, Lcom/facebook/login/d;->k()V

    return-void
.end method
