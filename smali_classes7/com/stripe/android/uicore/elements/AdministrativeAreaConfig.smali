.class public final Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/DropdownConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000f8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000cR\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;",
        "Lcom/stripe/android/uicore/elements/DropdownConfig;",
        "country",
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;",
        "(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V",
        "debugLabel",
        "",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "displayItems",
        "",
        "getDisplayItems",
        "()Ljava/util/List;",
        "fullAdministrativeAreaNames",
        "label",
        "",
        "getLabel",
        "()I",
        "rawItems",
        "getRawItems",
        "shortAdministrativeAreaNames",
        "tinyMode",
        "",
        "getTinyMode",
        "()Z",
        "convertFromRaw",
        "rawValue",
        "getSelectedItemLabel",
        "index",
        "Country",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAdministrativeAreaConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdministrativeAreaConfig.kt\ncom/stripe/android/uicore/elements/AdministrativeAreaConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1549#2:130\n1620#2,3:131\n1549#2:134\n1620#2,3:135\n*S KotlinDebug\n*F\n+ 1 AdministrativeAreaConfig.kt\ncom/stripe/android/uicore/elements/AdministrativeAreaConfig\n*L\n11#1:130\n11#1:131,3\n12#1:134\n12#1:135,3\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final debugLabel:Ljava/lang/String;

.field private final displayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fullAdministrativeAreaNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final label:I

.field private final rawItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shortAdministrativeAreaNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final tinyMode:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V
    .locals 4

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    const-string v0, "administrativeArea"

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->debugLabel:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;->getLabel()I

    move-result p1

    iput p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->label:I

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->rawItems:Ljava/util/List;

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->displayItems:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    return-object p1
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getDisableDropdownWithSingleElement()Z
    .locals 1

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/DropdownConfig$DefaultImpls;->getDisableDropdownWithSingleElement(Lcom/stripe/android/uicore/elements/DropdownConfig;)Z

    move-result v0

    return v0
.end method

.method public getDisplayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->displayItems:Ljava/util/List;

    return-object v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->label:I

    return v0
.end method

.method public getRawItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->rawItems:Ljava/util/List;

    return-object v0
.end method

.method public getSelectedItemLabel(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getTinyMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->tinyMode:Z

    return v0
.end method
