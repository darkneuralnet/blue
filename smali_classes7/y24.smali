.class public final synthetic Ly24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly24;->b:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ly24;->b:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->a(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V

    return-void
.end method
