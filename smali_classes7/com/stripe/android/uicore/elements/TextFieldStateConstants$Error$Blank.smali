.class public final Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;
.super Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Blank"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;",
        "()V",
        "isBlank",
        "",
        "shouldShowError",
        "hasFocus",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget v0, Lcom/stripe/android/uicore/R$string;->blank_and_required:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public isBlank()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public shouldShowError(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
