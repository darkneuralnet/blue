.class public final Lco/bird/android/model/wire/WireServiceCenterCampaignPriorityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "getDisplayMessage",
        "",
        "Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;",
        "model-wire_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getDisplayMessage(Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->getPriority()Lco/bird/android/model/constant/CampaignPriority;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/CampaignPriority;->SEVERE:Lco/bird/android/model/constant/CampaignPriority;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->getCampaignRepairMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->getCampaignIssueMessage()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method
