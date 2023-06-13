.class public final synthetic LwS5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/StripeEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/StripeEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwS5;->b:Lcom/stripe/android/view/StripeEditText;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LwS5;->b:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;->a(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
