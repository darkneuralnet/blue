.class public final Lcom/stripe/android/link/ui/forms/FormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/FormController;",
        "formController",
        "LEu1;",
        "",
        "enabledFlow",
        "",
        "Form",
        "(Lcom/stripe/android/ui/core/FormController;LEu1;LEt0;I)V",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final Form(Lcom/stripe/android/ui/core/FormController;LEu1;LEt0;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/FormController;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "formController"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2edbf54c

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.forms.Form (Form.kt:8)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/FormController;->getHiddenIdentifiers()LEu1;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/FormController;->getElements()LtP5;

    move-result-object v3

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/FormController;->getLastTextFieldIdentifier()LEu1;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v7, 0x1248

    const/16 v8, 0x10

    move-object v2, p1

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(LEu1;LEu1;LEu1;LEu1;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/link/ui/forms/FormKt$Form$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/link/ui/forms/FormKt$Form$1;-><init>(Lcom/stripe/android/ui/core/FormController;LEu1;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method
