.class public final Lcom/stripe/android/ui/core/elements/BsbElement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/FormElement;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u001f\u0010 J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/BsbElement;",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "LEu1;",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValueFlow",
        "identifierSpec",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
        "banks",
        "Ljava/util/List;",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "textElement",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "getTextElement$payments_ui_core_release",
        "()Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "",
        "bankName",
        "LEu1;",
        "getBankName",
        "()LEu1;",
        "Lcom/stripe/android/uicore/elements/Controller;",
        "getController",
        "()Lcom/stripe/android/uicore/elements/Controller;",
        "controller",
        "getIdentifier",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "identifier",
        "initialValue",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Ljava/lang/String;)V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBsbElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BsbElement.kt\ncom/stripe/android/ui/core/elements/BsbElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,46:1\n47#2:47\n49#2:51\n50#3:48\n55#3:50\n106#4:49\n*S KotlinDebug\n*F\n+ 1 BsbElement.kt\ncom/stripe/android/ui/core/elements/BsbElement\n*L\n30#1:47\n30#1:51\n30#1:48\n30#1:50\n30#1:49\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final bankName:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final banks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
            ">;"
        }
    .end annotation
.end field

.field private final identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final textElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/List<",
            "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "identifierSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "banks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->banks:Ljava/util/List;

    new-instance p1, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v1, "au_becs_debit[bsb_number]"

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    new-instance v7, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v2, Lcom/stripe/android/ui/core/elements/BsbConfig;

    invoke-direct {v2, p2}, Lcom/stripe/android/ui/core/elements/BsbConfig;-><init>(Ljava/util/List;)V

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v7

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0, v7}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->textElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFieldValue()LEu1;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/ui/core/elements/BsbElement$special$$inlined$map$1;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/ui/core/elements/BsbElement$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/ui/core/elements/BsbElement;)V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->bankName:LEu1;

    return-void
.end method

.method public static final synthetic access$getBanks$p(Lcom/stripe/android/ui/core/elements/BsbElement;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->banks:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final getBankName()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->bankName:LEu1;

    return-object v0
.end method

.method public getController()Lcom/stripe/android/uicore/elements/Controller;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getFormFieldValueFlow()LEu1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->textElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/InputController;->isComplete()LEu1;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->textElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFieldValue()LEu1;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/BsbElement$getFormFieldValueFlow$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/ui/core/elements/BsbElement$getFormFieldValueFlow$1;-><init>(Lcom/stripe/android/ui/core/elements/BsbElement;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v2}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    return-object v0
.end method

.method public getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getTextElement$payments_ui_core_release()Lcom/stripe/android/uicore/elements/SimpleTextElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/BsbElement;->textElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    return-object v0
.end method

.method public getTextFieldIdentifiers()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/FormElement$DefaultImpls;->getTextFieldIdentifiers(Lcom/stripe/android/uicore/elements/FormElement;)LEu1;

    move-result-object v0

    return-object v0
.end method
