.class final Lco/bird/android/model/identification/IdentificationDetectedStringsResult$isSatisfied$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/identification/IdentificationDetectedStringsResult;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;


# direct methods
.method public constructor <init>(Lco/bird/android/model/identification/IdentificationDetectedStringsResult;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/identification/IdentificationDetectedStringsResult$isSatisfied$2;->this$0:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedStringsResult$isSatisfied$2;->this$0:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    sget-object v1, Lco/bird/android/model/identification/IdentificationDetectedStringsNoLanguageSupportResult;->INSTANCE:Lco/bird/android/model/identification/IdentificationDetectedStringsNoLanguageSupportResult;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lco/bird/android/model/identification/IdentificationDetectedStringsSatisfiedResult;

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    sget-object v1, Lco/bird/android/model/identification/IdentificationDetectedStringsMlKitErrorResult;->INSTANCE:Lco/bird/android/model/identification/IdentificationDetectedStringsMlKitErrorResult;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lco/bird/android/model/identification/IdentificationDetectedStringsNotSatisfiedResult;->INSTANCE:Lco/bird/android/model/identification/IdentificationDetectedStringsNotSatisfiedResult;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/identification/IdentificationDetectedStringsResult$isSatisfied$2;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
