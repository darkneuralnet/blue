.class public final Lco/bird/android/model/ridertutorial/TutorialKind$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/ridertutorial/TutorialKind;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/ridertutorial/TutorialKind$Companion;",
        "",
        "()V",
        "all",
        "",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "getAll",
        "()[Lco/bird/android/model/ridertutorial/TutorialKind;",
        "[Lco/bird/android/model/ridertutorial/TutorialKind;",
        "from",
        "string",
        "",
        "model_release"
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

    invoke-direct {p0}, Lco/bird/android/model/ridertutorial/TutorialKind$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String).toUpperCase()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/ridertutorial/TutorialKind;->valueOf(Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object p1

    return-object p1
.end method

.method public final getAll()[Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    invoke-static {}, Lco/bird/android/model/ridertutorial/TutorialKind;->access$getAll$cp()[Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object v0

    return-object v0
.end method
