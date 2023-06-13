.class final Lcom/stripe/android/uicore/address/FieldType$PostalCode;
.super Lcom/stripe/android/uicore/address/FieldType;
.source "SourceFile"


# annotations
.annotation runtime LVs5;
    value = "postalCode"
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/address/FieldType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PostalCode"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldType$PostalCode;",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "Lal2;",
        "capitalization-IUNYP9k",
        "()I",
        "capitalization",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v3, "postalCode"

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPostalCode()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    sget v5, Lcom/stripe/android/uicore/R$string;->address_label_postal_code:I

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public capitalization-IUNYP9k()I
    .locals 1

    sget-object v0, Lal2;->a:Lal2$a;

    invoke-virtual {v0}, Lal2$a;->b()I

    move-result v0

    return v0
.end method
