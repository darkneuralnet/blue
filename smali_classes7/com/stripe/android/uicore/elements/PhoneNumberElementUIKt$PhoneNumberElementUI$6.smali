.class final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$6;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-rvJmuoc(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LYk2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $focusManager:LBv1;


# direct methods
.method public constructor <init>(LBv1;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$6;->$focusManager:LBv1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYk2;

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$6;->invoke(LYk2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LYk2;)V
    .locals 1

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$6;->$focusManager:LBv1;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LBv1;->n(Z)V

    return-void
.end method