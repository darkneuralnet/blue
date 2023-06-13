.class public final Lcom/stripe/android/uicore/elements/RowElement;
.super Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/RowElement;",
        "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;",
        "LEu1;",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValueFlow",
        "Lcom/stripe/android/uicore/elements/RowController;",
        "sectionFieldErrorController",
        "",
        "",
        "rawValuesMap",
        "",
        "setRawValue",
        "getTextFieldIdentifiers",
        "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "fields",
        "Ljava/util/List;",
        "getFields",
        "()Ljava/util/List;",
        "controller",
        "Lcom/stripe/android/uicore/elements/RowController;",
        "getController",
        "()Lcom/stripe/android/uicore/elements/RowController;",
        "_identifier",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/RowController;)V",
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
        "SMAP\nRowElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowElement.kt\ncom/stripe/android/uicore/elements/RowElement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n1855#2,2:42\n1549#2:44\n1620#2,3:45\n287#3:35\n288#3:40\n37#4:36\n36#4,3:37\n106#5:41\n*S KotlinDebug\n*F\n+ 1 RowElement.kt\ncom/stripe/android/uicore/elements/RowElement\n*L\n15#1:31\n15#1:32,3\n22#1:42,2\n28#1:44\n28#1:45,3\n15#1:35\n15#1:40\n15#1:36\n15#1:37,3\n15#1:41\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final controller:Lcom/stripe/android/uicore/elements/RowController;

.field private final fields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/RowController;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
            ">;",
            "Lcom/stripe/android/uicore/elements/RowController;",
            ")V"
        }
    .end annotation

    const-string v0, "_identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/RowElement;->fields:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/RowElement;->controller:Lcom/stripe/android/uicore/elements/RowController;

    return-void
.end method


# virtual methods
.method public final getController()Lcom/stripe/android/uicore/elements/RowController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/RowElement;->controller:Lcom/stripe/android/uicore/elements/RowController;

    return-object v0
.end method

.method public final getFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/RowElement;->fields:Ljava/util/List;

    return-object v0
.end method

.method public getFormFieldValueFlow()LEu1;
    .locals 3
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/RowElement;->fields:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getFormFieldValueFlow()LEu1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [LEu1;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, [LEu1;

    new-instance v1, Lcom/stripe/android/uicore/elements/RowElement$getFormFieldValueFlow$$inlined$combine$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/RowElement$getFormFieldValueFlow$$inlined$combine$1;-><init>([LEu1;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getTextFieldIdentifiers()LEu1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/RowElement;->fields:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getTextFieldIdentifiers()LEu1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEu1;

    return-object v0
.end method

.method public sectionFieldErrorController()Lcom/stripe/android/uicore/elements/RowController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/RowElement;->controller:Lcom/stripe/android/uicore/elements/RowController;

    return-object v0
.end method

.method public bridge synthetic sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/RowElement;->sectionFieldErrorController()Lcom/stripe/android/uicore/elements/RowController;

    move-result-object v0

    return-object v0
.end method

.method public setRawValue(Ljava/util/Map;)V
    .locals 2
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/RowElement;->fields:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-virtual {v1, p1}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->setRawValue(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method
