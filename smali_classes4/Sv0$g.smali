.class public LSv0$g;
.super Lbf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSv0;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbf1<",
        "Lco/bird/android/model/persistence/TutorialUpdate;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LSv0;


# direct methods
.method public constructor <init>(LSv0;LEb5;)V
    .locals 0

    iput-object p1, p0, LSv0$g;->d:LSv0;

    invoke-direct {p0, p2}, Lbf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `configurable_tutorial` SET `id` = ?,`context` = ?,`skippable` = ?,`header` = ?,`title` = ?,`asset` = ?,`menu_title` = ?,`menu_asset` = ?,`button_text` = ?,`bird_models` = ?,`pages` = ?,`group_header` = ?,`group_title` = ?,`group_message` = ?,`group_button_text` = ? WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/TutorialUpdate;

    invoke-virtual {p0, p1, p2}, LSv0$g;->m(LqV5;Lco/bird/android/model/persistence/TutorialUpdate;)V

    return-void
.end method

.method public m(LqV5;Lco/bird/android/model/persistence/TutorialUpdate;)V
    .locals 4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getContext()Lco/bird/android/model/constant/ConfigurableTutorialContext;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LSv0$g;->d:LSv0;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getContext()Lco/bird/android/model/constant/ConfigurableTutorialContext;

    move-result-object v2

    invoke-static {v0, v2}, LSv0;->n(LSv0;Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getSkippable()Z

    move-result v0

    const/4 v1, 0x3

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getHeader()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getHeader()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    sget-object v0, LQv0;->a:LQv0;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v0

    invoke-static {v0}, LQv0;->a(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getMenuTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getMenuTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getMenuAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v0

    invoke-static {v0}, LQv0;->a(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getButtonText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getBirdModels()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->o(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getPages()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LQv0;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupHeader()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupHeader()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupTitle()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupButtonText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getGroupButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/TutorialUpdate;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_e
    return-void
.end method
