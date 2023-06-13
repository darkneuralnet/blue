.class public final synthetic LvS5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/StripeEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/StripeEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvS5;->b:Lcom/stripe/android/view/StripeEditText;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, LvS5;->b:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/view/StripeEditText;->b(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V

    return-void
.end method
