.class public final synthetic LzD0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/CountryTextInputLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/CountryTextInputLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzD0;->b:Lcom/stripe/android/view/CountryTextInputLayout;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, LzD0;->b:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/view/CountryTextInputLayout;->c(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/View;Z)V

    return-void
.end method
