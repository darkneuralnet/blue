.class public final synthetic Lp66;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic b:Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp66;->b:Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lp66;->b:Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;

    invoke-static {v0, p1}, Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;->A(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
