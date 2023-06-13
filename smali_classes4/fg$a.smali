.class public Lfg$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfg;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/Announcement;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lfg;


# direct methods
.method public constructor <init>(Lfg;LEb5;)V
    .locals 0

    iput-object p1, p0, Lfg$a;->d:Lfg;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `announcement` (`id`,`context`,`context_parameters`,`display_type`,`content_type`,`title`,`title_asset`,`message`,`message_url`,`button_text`,`analytics_title`,`button_url`,`open_in_webview`,`auxiliary_title`,`auxiliary_body`,`auxiliary_asset`,`share_content`,`learn_more_url`,`pages`,`navigation_title`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {p0, p1, p2}, Lfg$a;->p(LqV5;Lco/bird/android/model/persistence/Announcement;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/Announcement;)V
    .locals 4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, Ldg;->a:Ldg;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getContext()Lco/bird/android/model/constant/AnnouncementContext;

    move-result-object v0

    invoke-static {v0}, Ldg;->g(Lco/bird/android/model/constant/AnnouncementContext;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getContextParameters()Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;

    move-result-object v0

    invoke-static {v0}, Ldg;->i(Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getDisplayType()Lco/bird/android/model/constant/AnnouncementDisplayType;

    move-result-object v0

    invoke-static {v0}, Ldg;->h(Lco/bird/android/model/constant/AnnouncementDisplayType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getContentType()Lco/bird/android/model/constant/AnnouncementContentType;

    move-result-object v0

    invoke-static {v0}, Ldg;->f(Lco/bird/android/model/constant/AnnouncementContentType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getTitleAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v0

    invoke-static {v0}, Ldg;->j(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getMessageUrl()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getMessageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getButtonText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getButtonUrl()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getButtonUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getOpenInWebview()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_c

    const/4 v0, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getOpenInWebview()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_c
    const/16 v1, 0xd

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_d
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryTitle()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryBody()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryBody()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_f
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v0

    invoke-static {v0}, Ldg;->j(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_10

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_10

    :cond_10
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_10
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getShareContent()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_11

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_11

    :cond_11
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getShareContent()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_11
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getLearnMoreUrl()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_12

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getLearnMoreUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_12
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getPages()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ldg;->k(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_13

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_13

    :cond_13
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_13
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_14

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_14

    :cond_14
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Announcement;->getNavigationTitle()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_14
    return-void
.end method
