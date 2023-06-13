.class public abstract Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldElement;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00060\u00050\u0004H\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016R\u001a\u0010\u0010\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "sectionFieldErrorController",
        "LEu1;",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValueFlow",
        "",
        "",
        "rawValuesMap",
        "",
        "setRawValue",
        "getTextFieldIdentifiers",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getIdentifier",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "getController",
        "()Lcom/stripe/android/uicore/elements/InputController;",
        "controller",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V",
        "stripe-ui-core_release"
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
        "SMAP\nSectionSingleFieldElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionSingleFieldElement.kt\ncom/stripe/android/uicore/elements/SectionSingleFieldElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n47#2:43\n49#2:47\n50#3:44\n55#3:46\n106#4:45\n1#5:48\n*S KotlinDebug\n*F\n+ 1 SectionSingleFieldElement.kt\ncom/stripe/android/uicore/elements/SectionSingleFieldElement\n*L\n27#1:43\n27#1:47\n27#1:44\n27#1:46\n27#1:45\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method


# virtual methods
.method public abstract getController()Lcom/stripe/android/uicore/elements/InputController;
.end method

.method public getFormFieldValueFlow()LEu1;
    .locals 2
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

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getController()Lcom/stripe/android/uicore/elements/InputController;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1;

    invoke-direct {v1, v0, p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;)V

    return-object v1
.end method

.method public getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public getShouldRenderOutsideCard()Z
    .locals 1

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/SectionFieldElement$DefaultImpls;->getShouldRenderOutsideCard(Lcom/stripe/android/uicore/elements/SectionFieldElement;)Z

    move-result v0

    return v0
.end method

.method public getTextFieldIdentifiers()LEu1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getController()Lcom/stripe/android/uicore/elements/InputController;

    move-result-object v1

    instance-of v1, v1, Lcom/stripe/android/uicore/elements/TextFieldController;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_1
    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    return-object v0
.end method

.method public sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getController()Lcom/stripe/android/uicore/elements/InputController;

    move-result-object v0

    return-object v0
.end method

.method public setRawValue(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getController()Lcom/stripe/android/uicore/elements/InputController;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/InputController;->onRawValueChange(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
