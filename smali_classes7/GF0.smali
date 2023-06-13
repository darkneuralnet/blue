.class public final synthetic LGF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/CvcEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/CvcEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGF0;->b:Lcom/stripe/android/view/CvcEditText;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, LGF0;->b:Lcom/stripe/android/view/CvcEditText;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/view/CvcEditText;->c(Lcom/stripe/android/view/CvcEditText;Landroid/view/View;Z)V

    return-void
.end method
