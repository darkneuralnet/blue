.class public final LwG$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwG;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/BeginnerModeOnboardingResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LwG;


# direct methods
.method public constructor <init>(LwG;)V
    .locals 0

    iput-object p1, p0, LwG$a;->g:LwG;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/BeginnerModeOnboardingResponse;)V
    .locals 2

    iget-object v0, p0, LwG$a;->g:LwG;

    invoke-static {v0}, LwG;->access$getBeginnerModeTopView$p(LwG;)Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/BeginnerModeOnboardingResponse;->getAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;->setIcon(Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/BeginnerModeOnboardingResponse;->getContentSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;->setSubtitle(Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/BeginnerModeOnboardingResponse;->getContentTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;

    invoke-virtual {p0, p1}, LwG$a;->a(Lco/bird/api/response/BeginnerModeOnboardingResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method