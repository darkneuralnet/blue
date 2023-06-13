.class public abstract Lco/bird/android/model/identification/IdentificationDetectedStringsResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0003\u0010\u0005\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDetectedStringsResult;",
        "",
        "()V",
        "isSatisfied",
        "",
        "()Z",
        "isSatisfied$delegate",
        "Lkotlin/Lazy;",
        "Lco/bird/android/model/identification/IdentificationDetectedStringsMlKitErrorResult;",
        "Lco/bird/android/model/identification/IdentificationDetectedStringsNoLanguageSupportResult;",
        "Lco/bird/android/model/identification/IdentificationDetectedStringsNotSatisfiedResult;",
        "Lco/bird/android/model/identification/IdentificationDetectedStringsSatisfiedResult;",
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


# instance fields
.field private final isSatisfied$delegate:Lkotlin/Lazy;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lco/bird/android/model/identification/IdentificationDetectedStringsResult$isSatisfied$2;

    invoke-direct {v0, p0}, Lco/bird/android/model/identification/IdentificationDetectedStringsResult$isSatisfied$2;-><init>(Lco/bird/android/model/identification/IdentificationDetectedStringsResult;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedStringsResult;->isSatisfied$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/identification/IdentificationDetectedStringsResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final isSatisfied()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedStringsResult;->isSatisfied$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
