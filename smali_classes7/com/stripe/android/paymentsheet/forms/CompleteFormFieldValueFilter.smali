.class public final Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000e\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00060\u000e\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J<\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000eR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00060\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0010R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;",
        "",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "idFieldSnapshotMap",
        "",
        "hiddenIdentifiers",
        "",
        "showingMandate",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "userRequestedReuse",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "filterFlow",
        "LEu1;",
        "currentFieldValueMap",
        "LEu1;",
        "getShowingMandate",
        "()LEu1;",
        "<init>",
        "(LEu1;LEu1;LEu1;LEu1;)V",
        "paymentsheet_release"
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
        "SMAP\nCompleteFormFieldValueFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompleteFormFieldValueFilter.kt\ncom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n515#2:56\n500#2,6:57\n1549#3:63\n1620#3,3:64\n2624#3,3:67\n*S KotlinDebug\n*F\n+ 1 CompleteFormFieldValueFilter.kt\ncom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter\n*L\n41#1:56\n41#1:57,6\n50#1:63\n50#1:64,3\n51#1:67,3\n*E\n"
    }
.end annotation


# instance fields
.field private final currentFieldValueMap:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field private final hiddenIdentifiers:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final showingMandate:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final userRequestedReuse:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEu1;LEu1;LEu1;LEu1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "+",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;",
            "LEu1<",
            "+",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEu1<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
            ">;)V"
        }
    .end annotation

    const-string v0, "currentFieldValueMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showingMandate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRequestedReuse"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->currentFieldValueMap:LEu1;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->hiddenIdentifiers:LEu1;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->showingMandate:LEu1;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->userRequestedReuse:LEu1;

    return-void
.end method

.method public static final synthetic access$filterFlow(Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;Ljava/util/Map;Ljava/util/Set;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/paymentsheet/forms/FormFieldValues;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->filterFlow(Ljava/util/Map;Ljava/util/Set;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object p0

    return-object p0
.end method

.method private final filterFlow(Ljava/util/Map;Ljava/util/Set;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/paymentsheet/forms/FormFieldValues;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;Z",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
            ")",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v2, v3

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    invoke-direct {p1, v0, p3, p4}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;-><init>(Ljava/util/Map;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {p4}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result p4

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    xor-int/2addr p3, v2

    if-eqz p3, :cond_4

    const/4 v2, 0x0

    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    :goto_3
    return-object p1
.end method


# virtual methods
.method public final filterFlow()LEu1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->currentFieldValueMap:LEu1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->hiddenIdentifiers:LEu1;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->showingMandate:LEu1;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->userRequestedReuse:LEu1;

    new-instance v4, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;-><init>(Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v2, v3, v4}, LVu1;->l(LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function5;)LEu1;

    move-result-object v0

    return-object v0
.end method

.method public final getShowingMandate()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->showingMandate:LEu1;

    return-object v0
.end method
