.class public final Lcom/google/android/gms/recaptcha/RecaptchaAction;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "RecaptchaActionCreator"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/recaptcha/RecaptchaAction;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lcom/google/android/gms/recaptcha/RecaptchaActionType;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValueUnchecked = "new com.google.android.gms.recaptcha.RecaptchaActionType(com.google.android.gms.recaptcha.RecaptchaActionType.OTHER)"
        getter = "getAction"
        id = 0x1
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValue = ""
        getter = "getCustomAction"
        id = 0x2
    .end annotation
.end field

.field public final d:Landroid/os/Bundle;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValueUnchecked = "new android.os.Bundle()"
        getter = "getAdditionalArgs"
        id = 0x3
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValue = ""
        getter = "getVerificationHistoryToken"
        id = 0x4
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LdY7;

    invoke-direct {v0}, LdY7;-><init>()V

    sput-object v0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/recaptcha/RecaptchaAction;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->s()Lcom/google/android/gms/recaptcha/RecaptchaActionType;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->u()Landroid/os/Bundle;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/google/android/gms/recaptcha/RecaptchaAction;-><init>(Lcom/google/android/gms/recaptcha/RecaptchaActionType;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/recaptcha/RecaptchaActionType;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, ""

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/google/android/gms/recaptcha/RecaptchaAction;-><init>(Lcom/google/android/gms/recaptcha/RecaptchaActionType;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/recaptcha/RecaptchaActionType;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/recaptcha/RecaptchaActionType;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x1
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x4
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->b:Lcom/google/android/gms/recaptcha/RecaptchaActionType;

    iput-object p2, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->d:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->e:Ljava/lang/String;

    return-object v0
.end method

.method public s()Lcom/google/android/gms/recaptcha/RecaptchaActionType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->b:Lcom/google/android/gms/recaptcha/RecaptchaActionType;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->b:Lcom/google/android/gms/recaptcha/RecaptchaActionType;

    iget-object v0, v0, Lcom/google/android/gms/recaptcha/RecaptchaActionType;->b:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->c:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->b:Lcom/google/android/gms/recaptcha/RecaptchaActionType;

    iget-object v0, v0, Lcom/google/android/gms/recaptcha/RecaptchaActionType;->b:Ljava/lang/String;

    return-object v0
.end method

.method public u()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->d:Landroid/os/Bundle;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/recaptcha/RecaptchaAction;->c:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->s()Lcom/google/android/gms/recaptcha/RecaptchaActionType;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->v()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->u()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeBundle(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 p2, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->E()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method
