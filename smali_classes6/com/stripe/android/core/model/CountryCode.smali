.class public final Lcom/stripe/android/core/model/CountryCode;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/model/CountryCode$$serializer;,
        Lcom/stripe/android/core/model/CountryCode$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB%\u0008\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001c\u0010!J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\r\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/core/model/CountryCode;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "value",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "<init>",
        "(Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lbt5;)V",
        "Companion",
        "$serializer",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final CA:Lcom/stripe/android/core/model/CountryCode;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/core/model/CountryCode;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

.field private static final GB:Lcom/stripe/android/core/model/CountryCode;

.field private static final US:Lcom/stripe/android/core/model/CountryCode;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/model/CountryCode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/model/CountryCode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    new-instance v0, Lcom/stripe/android/core/model/CountryCode$Creator;

    invoke-direct {v0}, Lcom/stripe/android/core/model/CountryCode$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/core/model/CountryCode;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    const-string v1, "US"

    invoke-direct {v0, v1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/CountryCode;->US:Lcom/stripe/android/core/model/CountryCode;

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    const-string v1, "CA"

    invoke-direct {v0, v1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/CountryCode;->CA:Lcom/stripe/android/core/model/CountryCode;

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    const-string v1, "GB"

    invoke-direct {v0, v1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/CountryCode;->GB:Lcom/stripe/android/core/model/CountryCode;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lbt5;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    sget-object p3, Lcom/stripe/android/core/model/CountryCode$$serializer;->INSTANCE:Lcom/stripe/android/core/model/CountryCode$$serializer;

    invoke-virtual {p3}, Lcom/stripe/android/core/model/CountryCode$$serializer;->getDescriptor()LMs5;

    move-result-object p3

    invoke-static {p1, v0, p3}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getCA$cp()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->CA:Lcom/stripe/android/core/model/CountryCode;

    return-object v0
.end method

.method public static final synthetic access$getGB$cp()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->GB:Lcom/stripe/android/core/model/CountryCode;

    return-object v0
.end method

.method public static final synthetic access$getUS$cp()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->US:Lcom/stripe/android/core/model/CountryCode;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/model/CountryCode;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/core/model/CountryCode;->copy(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/stripe/android/core/model/CountryCode;LUt0;LMs5;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iget-object p0, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    invoke-direct {v0, p1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/core/model/CountryCode;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/core/model/CountryCode;

    iget-object v1, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CountryCode(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/core/model/CountryCode;->value:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
