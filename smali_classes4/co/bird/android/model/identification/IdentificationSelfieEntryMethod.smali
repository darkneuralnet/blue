.class public final enum Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationSelfieEntryMethod$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;",
        "",
        "(Ljava/lang/String;I)V",
        "toWire",
        "",
        "PHOTO",
        "VIDEO",
        "UNKNOWN",
        "Companion",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationEntry.kt\nco/bird/android/model/identification/IdentificationSelfieEntryMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

.field public static final Companion:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod$Companion;

.field public static final enum PHOTO:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

.field public static final enum VIDEO:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->PHOTO:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->VIDEO:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->UNKNOWN:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    const-string v1, "PHOTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->PHOTO:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    const-string v1, "VIDEO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->VIDEO:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->UNKNOWN:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->$values()[Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->$VALUES:[Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    new-instance v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->Companion:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->$VALUES:[Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    return-object v0
.end method


# virtual methods
.method public final toWire()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "getDefault()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->UNKNOWN:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    if-eq p0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
