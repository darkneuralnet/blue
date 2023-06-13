.class Lio/card/payment/DataEntryActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/card/payment/DataEntryActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/card/payment/DataEntryActivity;


# direct methods
.method public constructor <init>(Lio/card/payment/DataEntryActivity;)V
    .locals 0

    iput-object p1, p0, Lio/card/payment/DataEntryActivity$2;->this$0:Lio/card/payment/DataEntryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/card/payment/DataEntryActivity$2;->this$0:Lio/card/payment/DataEntryActivity;

    invoke-virtual {p1}, Lio/card/payment/DataEntryActivity;->onBackPressed()V

    return-void
.end method
