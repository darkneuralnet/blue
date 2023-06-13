.class public final Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu6;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1",
        "LEu6;",
        "LDf;",
        "text",
        "LA96;",
        "filter",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;->this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public filter(LDf;)LA96;
    .locals 7

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;->this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->formatNumberNational(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance p1, LA96;

    new-instance v0, LDf;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LDf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;->this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    invoke-direct {v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)V

    invoke-direct {p1, v0, v1}, LA96;-><init>(LDf;LHe3;)V

    return-object p1
.end method
