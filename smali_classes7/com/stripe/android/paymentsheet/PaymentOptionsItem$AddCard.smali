.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;
.super Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AddCard"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "()V",
        "isEnabledDuringEditing",
        "",
        "()Z",
        "viewType",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "getViewType",
        "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "paymentsheet_release"
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

.field private static final isEnabledDuringEditing:Z

.field private static final viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->AddCard:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;->viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getViewType()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;->viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-object v0
.end method

.method public isEnabledDuringEditing()Z
    .locals 1

    sget-boolean v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;->isEnabledDuringEditing:Z

    return v0
.end method
