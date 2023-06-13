.class public final Lcom/stripe/android/financialconnections/model/VisualUpdate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/VisualUpdate$$serializer;,
        Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008%\u0010&B7\u0008\u0017\u0012\u0006\u0010\'\u001a\u00020\u0012\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\t\u0012\u0010\u0008\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008%\u0010*J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J#\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\t2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u00d6\u0001R \u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u001c\u0012\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001d\u0010\u001eR&\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010!\u0012\u0004\u0008$\u0010 \u001a\u0004\u0008\"\u0010#\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/VisualUpdate;",
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
        "",
        "",
        "component2",
        "reducedBranding",
        "merchantLogos",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Z",
        "getReducedBranding",
        "()Z",
        "getReducedBranding$annotations",
        "()V",
        "Ljava/util/List;",
        "getMerchantLogos",
        "()Ljava/util/List;",
        "getMerchantLogos$annotations",
        "<init>",
        "(ZLjava/util/List;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(IZLjava/util/List;Lbt5;)V",
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
            "Lcom/stripe/android/financialconnections/model/VisualUpdate;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;


# instance fields
.field private final merchantLogos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final reducedBranding:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->Companion:Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/VisualUpdate$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/VisualUpdate$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/util/List;Lbt5;)V
    .locals 1
    .param p2    # Z
        .annotation runtime LVs5;
            value = "reduced_branding"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime LVs5;
            value = "merchant_logo"
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

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    sget-object p4, Lcom/stripe/android/financialconnections/model/VisualUpdate$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/VisualUpdate$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/VisualUpdate$$serializer;->getDescriptor()LMs5;

    move-result-object p4

    invoke-static {p1, v0, p4}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "merchantLogos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/VisualUpdate;ZLjava/util/List;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/VisualUpdate;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/VisualUpdate;->copy(ZLjava/util/List;)Lcom/stripe/android/financialconnections/model/VisualUpdate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMerchantLogos$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "merchant_logo"
    .end annotation

    return-void
.end method

.method public static synthetic getReducedBranding$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "reduced_branding"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/VisualUpdate;LUt0;LMs5;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->v(LMs5;IZ)V

    new-instance v0, Lro;

    sget-object v1, LgS5;->a:LgS5;

    invoke-direct {v0, v1}, Lro;-><init>(LKj2;)V

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ZLjava/util/List;)Lcom/stripe/android/financialconnections/model/VisualUpdate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/financialconnections/model/VisualUpdate;"
        }
    .end annotation

    const-string v0, "merchantLogos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/VisualUpdate;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/VisualUpdate;-><init>(ZLjava/util/List;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/VisualUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/VisualUpdate;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMerchantLogos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    return-object v0
.end method

.method public final getReducedBranding()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VisualUpdate(reducedBranding="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", merchantLogos="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->reducedBranding:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/VisualUpdate;->merchantLogos:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return-void
.end method
