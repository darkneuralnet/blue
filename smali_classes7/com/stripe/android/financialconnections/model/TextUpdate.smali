.class public final Lcom/stripe/android/financialconnections/model/TextUpdate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;,
        Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0013\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u001f\u0010 B\'\u0008\u0017\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\n\u0008\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008\u001f\u0010$J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0015\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u001a\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/TextUpdate;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "component1",
        "consent",
        "copy",
        "",
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
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "getConsent",
        "()Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "getConsent$annotations",
        "()V",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/ConsentPane;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/model/ConsentPane;Lbt5;)V",
        "Companion",
        "$serializer",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/TextUpdate;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;


# instance fields
.field private final consent:Lcom/stripe/android/financialconnections/model/ConsentPane;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/TextUpdate;->Companion:Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/TextUpdate$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/TextUpdate$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/TextUpdate;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/ConsentPane;Lbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/financialconnections/model/ConsentPane;
        .annotation runtime LVs5;
            value = "consent_pane"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p3, p1, 0x0

    if-eqz p3, :cond_0

    sget-object p3, Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;->getDescriptor()LMs5;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p1, v0, p3}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/ConsentPane;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/ConsentPane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/ConsentPane;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/TextUpdate;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/TextUpdate;->copy(Lcom/stripe/android/financialconnections/model/ConsentPane;)Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getConsent$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "consent_pane"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/TextUpdate;LUt0;LMs5;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    if-eqz v2, :cond_2

    sget-object v1, Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/ConsentPane;)Lcom/stripe/android/financialconnections/model/TextUpdate;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/TextUpdate;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/TextUpdate;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TextUpdate(consent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ConsentPane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    return-void
.end method
