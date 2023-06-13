.class public final Lcom/stripe/android/financialconnections/domain/Entry$Image;
.super Lcom/stripe/android/financialconnections/domain/Entry;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/domain/Entry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Image"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/Entry$Image$$serializer;,
        Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002%$B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB%\u0008\u0017\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001e\u0010#J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00c7\u0001J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u0013\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\nH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/Entry$Image;",
        "Lcom/stripe/android/financialconnections/domain/Entry;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "component1",
        "content",
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
        "Lcom/stripe/android/financialconnections/model/Image;",
        "getContent",
        "()Lcom/stripe/android/financialconnections/model/Image;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/Image;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/model/Image;Lbt5;)V",
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
            "Lcom/stripe/android/financialconnections/domain/Entry$Image;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;


# instance fields
.field private final content:Lcom/stripe/android/financialconnections/model/Image;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->Companion:Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/domain/Entry$Image$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/domain/Entry$Image$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/Image;Lbt5;)V
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

    sget-object p3, Lcom/stripe/android/financialconnections/domain/Entry$Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/domain/Entry$Image$$serializer;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/domain/Entry$Image$$serializer;->getDescriptor()LMs5;

    move-result-object p3

    invoke-static {p1, v0, p3}, LzW3;->b(IILMs5;)V

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/Entry;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/Image;)V
    .locals 1

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/domain/Entry;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/domain/Entry$Image;Lcom/stripe/android/financialconnections/model/Image;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/domain/Entry$Image;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/Entry$Image;->copy(Lcom/stripe/android/financialconnections/model/Image;)Lcom/stripe/android/financialconnections/domain/Entry$Image;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/domain/Entry$Image;LUt0;LMs5;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Image$$serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/Image;)Lcom/stripe/android/financialconnections/domain/Entry$Image;
    .locals 1

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/domain/Entry$Image;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/domain/Entry$Image;-><init>(Lcom/stripe/android/financialconnections/model/Image;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/domain/Entry$Image;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/domain/Entry$Image;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getContent()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Image(content="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/Entry$Image;->content:Lcom/stripe/android/financialconnections/model/Image;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Image;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
