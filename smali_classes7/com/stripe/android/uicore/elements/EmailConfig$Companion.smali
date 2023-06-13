.class public final Lcom/stripe/android/uicore/elements/EmailConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/EmailConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/EmailConfig$Companion;",
        "",
        "()V",
        "PATTERN",
        "Ljava/util/regex/Pattern;",
        "getPATTERN",
        "()Ljava/util/regex/Pattern;",
        "createController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "initialValue",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 7

    new-instance v6, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v1, Lcom/stripe/android/uicore/elements/EmailConfig;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/EmailConfig;-><init>()V

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, v6

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final getPATTERN()Ljava/util/regex/Pattern;
    .locals 1

    invoke-static {}, Lcom/stripe/android/uicore/elements/EmailConfig;->access$getPATTERN$cp()Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
