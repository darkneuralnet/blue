.class public final Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/model/ElementsSessionParams;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ElementsSessionParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DeferredIntentType"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\t\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "locale",
        "",
        "deferredIntentParams",
        "Lcom/stripe/android/model/DeferredIntentParams;",
        "(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)V",
        "clientSecret",
        "getClientSecret",
        "()Ljava/lang/String;",
        "getDeferredIntentParams",
        "()Lcom/stripe/android/model/DeferredIntentParams;",
        "expandFields",
        "",
        "getExpandFields",
        "()Ljava/util/List;",
        "getLocale",
        "type",
        "getType",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "payments-core_release"
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

.field private final locale:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)V
    .locals 1

    const-string v0, "deferredIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->locale:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;ILjava/lang/Object;)Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->copy(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/DeferredIntentParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;
    .locals 1

    const-string v0, "deferredIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    iget-object p1, p1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getClientSecret()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    return-object v0
.end method

.method public getExpandFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLocale()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    const-string v0, "deferred_intent"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getLocale()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeferredIntentType(locale="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deferredIntentParams="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->locale:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->deferredIntentParams:Lcom/stripe/android/model/DeferredIntentParams;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/DeferredIntentParams;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
