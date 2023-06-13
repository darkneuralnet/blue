.class public final Lco/bird/android/model/wire/configs/DeviceVerificationConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0016\u0008\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0007H\u00c6\u0003J+\u0010\u000f\u001a\u00020\u00002\u0016\u0008\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/DeviceVerificationConfig;",
        "",
        "endpoints",
        "",
        "",
        "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;",
        "recaptcha",
        "Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;",
        "(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)V",
        "getEndpoints",
        "()Ljava/util/Map;",
        "getRecaptcha",
        "()Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "model-wire_release"
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
.field private final endpoints:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "endpoints"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "endpoints"
    .end annotation
.end field

.field private final recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "recaptcha"
    .end annotation

    .annotation runtime Lft5;
        value = "recaptcha"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;-><init>(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;",
            ">;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;",
            ")V"
        }
    .end annotation

    const-string v0, "recaptcha"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    iput-object p2, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    new-instance p2, Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    const/4 p3, 0x1

    invoke-direct {p2, v0, p3, v0}, Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-direct {p0, p1, p2}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;-><init>(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/DeviceVerificationConfig;Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/DeviceVerificationConfig;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->copy(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    return-object v0
.end method

.method public final copy(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)Lco/bird/android/model/wire/configs/DeviceVerificationConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;",
            ">;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;",
            ")",
            "Lco/bird/android/model/wire/configs/DeviceVerificationConfig;"
        }
    .end annotation

    const-string v0, "recaptcha"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;-><init>(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEndpoints()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    return-object v0
.end method

.method public final getRecaptcha()Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->endpoints:Ljava/util/Map;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->recaptcha:Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceVerificationConfig(endpoints="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", recaptcha="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
