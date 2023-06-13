.class public final Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LpmInitialFormData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u000c\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0008\u0012\u00060\u0005j\u0002`\u0010\u0012\u0004\u0012\u00020\u00060\u000fJ\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;",
        "",
        "()V",
        "codeToSupportedPaymentMethod",
        "",
        "",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "containsKey",
        "",
        "it",
        "fromCode",
        "code",
        "putAll",
        "",
        "map",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "values",
        "",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;

.field private static final Instance:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;


# instance fields
.field private codeToSupportedPaymentMethod:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->Companion:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->$stable:I

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->Instance:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->codeToSupportedPaymentMethod:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->Instance:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    return-object v0
.end method


# virtual methods
.method public final containsKey(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->codeToSupportedPaymentMethod:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final fromCode(Ljava/lang/String;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->codeToSupportedPaymentMethod:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->codeToSupportedPaymentMethod:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->codeToSupportedPaymentMethod:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
