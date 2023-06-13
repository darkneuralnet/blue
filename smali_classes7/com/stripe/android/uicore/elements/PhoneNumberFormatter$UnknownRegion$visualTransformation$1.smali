.class final Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu6;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;-><init>(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "LDf;",
        "text",
        "LA96;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1;->INSTANCE:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filter(LDf;)LA96;
    .locals 8

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance p1, LA96;

    new-instance v0, LDf;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LDf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1$filter$1;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion$visualTransformation$1$filter$1;-><init>()V

    invoke-direct {p1, v0, v1}, LA96;-><init>(LDf;LHe3;)V

    return-object p1
.end method
