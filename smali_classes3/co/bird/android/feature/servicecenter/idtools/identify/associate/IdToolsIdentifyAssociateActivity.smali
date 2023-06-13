.class public final Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;
.super Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0014@\u0014X\u0095.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;",
        "Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LFR1;",
        "E",
        "LFR1;",
        "m0",
        "()LFR1;",
        "setPresenter",
        "(LFR1;)V",
        "presenter",
        "<init>",
        "()V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdToolsIdentifyAssociateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyAssociateActivity.kt\nco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n44#2:87\n1#3:88\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyAssociateActivity.kt\nco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity\n*L\n36#1:87\n*E\n"
    }
.end annotation


# instance fields
.field protected E:LFR1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public m0()LFR1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;->E:LFR1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LyQ1;->b:LyQ1;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, LAk1;->component$default(LAk1;Landroid/app/Application;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsQ1;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;->o0(LsQ1;)V

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;->k0()LsQ1;

    move-result-object p1

    invoke-interface {p1}, LsQ1;->a()Lco/bird/android/feature/servicecenter/idtools/identify/associate/a$a;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    const-string v3, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyActivity;->j0()LP3;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v4

    invoke-interface {p1, p0, v0, v3, v4}, Lco/bird/android/feature/servicecenter/idtools/identify/associate/a$a;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;)Lco/bird/android/feature/servicecenter/idtools/identify/associate/a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/servicecenter/idtools/identify/associate/a;->a(Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "id_tool_option"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lco/bird/android/model/IdToolOption;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "scan_first"

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v5, "bird"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;->m0()LFR1;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v3, :cond_0

    move v7, v4

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    invoke-interface {v5, p1, v7}, LFR1;->f(Lco/bird/android/model/IdToolOption;Z)V

    if-eqz v0, :cond_1

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;->m0()LFR1;

    move-result-object v0

    invoke-interface {v0}, LFR1;->e()V

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;->m0()LFR1;

    move-result-object v0

    invoke-interface {v0, v3, v1}, LFR1;->b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WirePart;)V

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    sget v3, Lnl4;->id_tools_confirm_replace_format:I

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1, p0, v6, v2, v1}, LaQ1;->label$default(Lco/bird/android/model/IdToolOption;Landroid/content/Context;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v6

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method
