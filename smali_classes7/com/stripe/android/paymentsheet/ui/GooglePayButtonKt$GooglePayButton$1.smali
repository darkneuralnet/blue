.class final Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/content/Context;",
        "Lcom/stripe/android/paymentsheet/ui/GooglePayButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/ui/GooglePayButton;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePayButton$1;->invoke(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/ui/GooglePayButton;

    move-result-object p1

    return-object p1
.end method
