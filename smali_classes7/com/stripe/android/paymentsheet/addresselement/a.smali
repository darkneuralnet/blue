.class public final synthetic Lcom/stripe/android/paymentsheet/addresselement/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/compose/ui/focus/h;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/focus/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/a;->b:Landroidx/compose/ui/focus/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/a;->b:Landroidx/compose/ui/focus/h;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$1;->e(Landroidx/compose/ui/focus/h;)V

    return-void
.end method
