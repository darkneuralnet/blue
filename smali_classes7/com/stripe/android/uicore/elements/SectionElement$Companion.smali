.class public final Lcom/stripe/android/uicore/elements/SectionElement$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/SectionElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ%\u0010\u0003\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SectionElement$Companion;",
        "",
        "()V",
        "wrap",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "sectionFieldElement",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "label",
        "",
        "(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;",
        "sectionFieldElements",
        "",
        "(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;",
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
        "SMAP\nSectionElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 SectionElement.kt\ncom/stripe/android/uicore/elements/SectionElement$Companion\n*L\n52#1:67\n52#1:68,3\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;-><init>()V

    return-void
.end method

.method public static synthetic wrap$default(Lcom/stripe/android/uicore/elements/SectionElement$Companion;Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic wrap$default(Lcom/stripe/android/uicore/elements/SectionElement$Companion;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final wrap(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 1

    const-string v0, "sectionFieldElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p1

    return-object p1
.end method

.method public final wrap(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/stripe/android/uicore/elements/SectionElement;"
        }
    .end annotation

    const-string v0, "sectionFieldElements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

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

    check-cast v2, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/SectionElement;

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v3}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_section"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/uicore/elements/SectionController;

    invoke-direct {v3, p2, v1}, Lcom/stripe/android/uicore/elements/SectionController;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    invoke-direct {v0, v2, p1, v3}, Lcom/stripe/android/uicore/elements/SectionElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/SectionController;)V

    return-object v0
.end method
