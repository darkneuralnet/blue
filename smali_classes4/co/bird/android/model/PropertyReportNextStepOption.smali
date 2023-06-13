.class public final Lco/bird/android/model/PropertyReportNextStepOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00082\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/android/model/PropertyReportNextStepOption;",
        "Landroid/os/Parcelable;",
        "action",
        "Lco/bird/android/model/PropertyReportNextStep;",
        "(Lco/bird/android/model/PropertyReportNextStep;)V",
        "getAction",
        "()Lco/bird/android/model/PropertyReportNextStep;",
        "checked",
        "",
        "getChecked",
        "()Z",
        "setChecked",
        "(Z)V",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/PropertyReportNextStepOption;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final action:Lco/bird/android/model/PropertyReportNextStep;

.field private checked:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/PropertyReportNextStepOption$Creator;

    invoke-direct {v0}, Lco/bird/android/model/PropertyReportNextStepOption$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/PropertyReportNextStepOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/PropertyReportNextStep;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/PropertyReportNextStepOption;Lco/bird/android/model/PropertyReportNextStep;ILjava/lang/Object;)Lco/bird/android/model/PropertyReportNextStepOption;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/PropertyReportNextStepOption;->copy(Lco/bird/android/model/PropertyReportNextStep;)Lco/bird/android/model/PropertyReportNextStepOption;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/PropertyReportNextStep;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/PropertyReportNextStep;)Lco/bird/android/model/PropertyReportNextStepOption;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/PropertyReportNextStepOption;

    invoke-direct {v0, p1}, Lco/bird/android/model/PropertyReportNextStepOption;-><init>(Lco/bird/android/model/PropertyReportNextStep;)V

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
    instance-of v1, p1, Lco/bird/android/model/PropertyReportNextStepOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/PropertyReportNextStepOption;

    iget-object v1, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    iget-object p1, p1, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAction()Lco/bird/android/model/PropertyReportNextStep;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    return-object v0
.end method

.method public final getChecked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/PropertyReportNextStepOption;->checked:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setChecked(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/model/PropertyReportNextStepOption;->checked:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PropertyReportNextStepOption(action="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object p2, p0, Lco/bird/android/model/PropertyReportNextStepOption;->action:Lco/bird/android/model/PropertyReportNextStep;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
