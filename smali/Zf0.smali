.class public final synthetic LZf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic b:Lcom/adyen/checkout/card/CardView;


# direct methods
.method public synthetic constructor <init>(Lcom/adyen/checkout/card/CardView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf0;->b:Lcom/adyen/checkout/card/CardView;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, LZf0;->b:Lcom/adyen/checkout/card/CardView;

    invoke-static {v0, p1, p2}, Lcom/adyen/checkout/card/CardView;->l(Lcom/adyen/checkout/card/CardView;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
