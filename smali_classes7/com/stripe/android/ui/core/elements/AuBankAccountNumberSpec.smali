.class public final Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$$serializer;,
        Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0011\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\'\u0008\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u001c\u0010\u000e\u001a\u00020\r2\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tR \u0010\u000f\u001a\u00020\n8\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "initialValues",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "transform",
        "apiPath",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath$annotations",
        "()V",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V",
        "",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lbt5;)V",
        "Companion",
        "$serializer",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;


# instance fields
.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->Companion:Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    sput v0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/uicore/elements/IdentifierSpec;
        .annotation runtime LVs5;
            value = "api_path"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p3, p1, 0x0

    if-eqz p3, :cond_0

    sget-object p3, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$$serializer;

    invoke-virtual {p3}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$$serializer;->getDescriptor()LMs5;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p1, v0, p3}, LzW3;->b(IILMs5;)V

    :cond_0
    const/4 p3, 0x0

    invoke-direct {p0, p3}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string p2, "au_becs_debit[account_number]"

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 1

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string p2, "au_becs_debit[account_number]"

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-void
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "api_path"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v4, "au_becs_debit[account_number]"

    invoke-virtual {v3, v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    if-eqz v2, :cond_2

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/SectionElement;"
        }
    .end annotation

    const-string v0, "initialValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v8, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v3, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;

    invoke-direct {v3}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v8}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    const/4 p1, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, p1, v1, p1}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release$default(Lcom/stripe/android/ui/core/elements/FormItemSpec;Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p1

    return-object p1
.end method
