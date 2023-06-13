.class public final Lcom/stripe/android/model/Address$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/Address;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/model/Address;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000c\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\r\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u000e\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0014\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/model/Address$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/model/Address;",
        "()V",
        "city",
        "",
        "country",
        "line1",
        "line2",
        "postalCode",
        "state",
        "build",
        "setCity",
        "setCountry",
        "setCountryCode",
        "countryCode",
        "Lcom/stripe/android/core/model/CountryCode;",
        "setLine1",
        "setLine2",
        "setPostalCode",
        "setState",
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


# instance fields
.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private line1:Ljava/lang/String;

.field private line2:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private state:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/model/Address;
    .locals 8

    new-instance v7, Lcom/stripe/android/model/Address;

    iget-object v1, p0, Lcom/stripe/android/model/Address$Builder;->city:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/Address$Builder;->country:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/Address$Builder;->line1:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/Address$Builder;->line2:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/model/Address$Builder;->postalCode:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/model/Address$Builder;->state:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v0

    return-object v0
.end method

.method public final setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->city:Ljava/lang/String;

    return-object p0
.end method

.method public final setCountry(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method public final setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method public final setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->line1:Ljava/lang/String;

    return-object p0
.end method

.method public final setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->line2:Ljava/lang/String;

    return-object p0
.end method

.method public final setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->postalCode:Ljava/lang/String;

    return-object p0
.end method

.method public final setState(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->state:Ljava/lang/String;

    return-object p0
.end method
