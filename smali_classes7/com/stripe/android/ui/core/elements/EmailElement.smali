.class public final Lcom/stripe/android/ui/core/elements/EmailElement;
.super Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/EmailElement;",
        "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "initialValue",
        "",
        "controller",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)V",
        "getController",
        "()Lcom/stripe/android/uicore/elements/TextFieldController;",
        "getIdentifier",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getInitialValue",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final controller:Lcom/stripe/android/uicore/elements/TextFieldController;

.field private final identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final initialValue:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/EmailElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->controller:Lcom/stripe/android/uicore/elements/TextFieldController;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getEmail()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const-string p2, ""

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    new-instance p3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v1, Lcom/stripe/android/uicore/elements/EmailConfig;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/EmailConfig;-><init>()V

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p3

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/EmailElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/EmailElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/EmailElement;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/EmailElement;->copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)Lcom/stripe/android/ui/core/elements/EmailElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/uicore/elements/TextFieldController;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)Lcom/stripe/android/ui/core/elements/EmailElement;
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/EmailElement;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/EmailElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/EmailElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/EmailElement;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmailElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public bridge synthetic getController()Lcom/stripe/android/uicore/elements/InputController;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v0

    return-object v0
.end method

.method public getController()Lcom/stripe/android/uicore/elements/TextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->controller:Lcom/stripe/android/uicore/elements/TextFieldController;

    return-object v0
.end method

.method public getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getInitialValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/EmailElement;->initialValue:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/EmailElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EmailElement(identifier="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", initialValue="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", controller="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
