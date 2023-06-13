.class final Lcom/stripe/android/core/networking/RequestHeadersFactory$Api$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;-><init>(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $options:Lcom/stripe/android/core/networking/ApiRequest$Options;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/networking/ApiRequest$Options;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/core/networking/RequestHeadersFactory$Api$1;->$options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/RequestHeadersFactory$Api$1;->$options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/RequestHeadersFactory$Api$1;->invoke()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v0

    return-object v0
.end method
