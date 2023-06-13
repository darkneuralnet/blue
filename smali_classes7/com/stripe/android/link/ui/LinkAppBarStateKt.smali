.class public final Lcom/stripe/android/link/ui/LinkAppBarStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "isRootScreen",
        "",
        "currentRoute",
        "email",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "accountStatus",
        "Lcom/stripe/android/link/ui/LinkAppBarState;",
        "rememberLinkAppBarState",
        "(ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;LEt0;I)Lcom/stripe/android/link/ui/LinkAppBarState;",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLinkAppBarState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBarState.kt\ncom/stripe/android/link/ui/LinkAppBarStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1057#2,3:58\n1060#2,3:62\n1#3:61\n*S KotlinDebug\n*F\n+ 1 LinkAppBarState.kt\ncom/stripe/android/link/ui/LinkAppBarStateKt\n*L\n25#1:58,3\n25#1:62,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final rememberLinkAppBarState(ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;LEt0;I)Lcom/stripe/android/link/ui/LinkAppBarState;
    .locals 10

    const v0, -0x4e959400

    invoke-interface {p4, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.rememberLinkAppBarState (LinkAppBarState.kt:18)"

    invoke-static {v0, p5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p4, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p5

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p5, v0

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p5, :cond_1

    sget-object p5, LEt0;->a:LEt0$a;

    invoke-virtual {p5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p5

    if-ne v0, p5, :cond_d

    :cond_1
    const-string p5, "CardEdit?id={id}"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "PaymentMethod?loadFromArgs={loadFromArgs}"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    move v6, v2

    goto :goto_0

    :cond_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v6, p0

    goto :goto_0

    :cond_3
    move v6, v3

    :goto_0
    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_4

    move p5, v3

    goto :goto_1

    :cond_4
    sget-object p5, Lcom/stripe/android/link/LinkScreen$Verification;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Verification;

    invoke-virtual {p5}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object p5

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    :goto_1
    if-eqz p5, :cond_5

    move p5, v3

    goto :goto_2

    :cond_5
    sget-object p5, Lcom/stripe/android/link/LinkScreen$SignUp;->INSTANCE:Lcom/stripe/android/link/LinkScreen$SignUp;

    invoke-virtual {p5}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object p5

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    :goto_2
    if-eqz p5, :cond_6

    :goto_3
    move p1, v3

    goto :goto_4

    :cond_6
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    if-nez p0, :cond_7

    goto :goto_3

    :cond_7
    move p1, v2

    :goto_4
    if-eqz p0, :cond_8

    if-eqz p2, :cond_8

    sget-object p5, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    if-ne p3, p5, :cond_8

    move v7, v3

    goto :goto_5

    :cond_8
    move v7, v2

    :goto_5
    if-eqz p0, :cond_9

    sget p0, Lcom/stripe/android/link/R$drawable;->ic_link_close:I

    goto :goto_6

    :cond_9
    sget p0, Lcom/stripe/android/link/R$drawable;->ic_link_back:I

    :goto_6
    move v5, p0

    const/4 p0, 0x0

    if-eqz p2, :cond_c

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_a

    if-eqz p1, :cond_b

    :cond_a
    move v2, v3

    :cond_b
    if-nez v2, :cond_c

    move-object v8, p2

    goto :goto_7

    :cond_c
    move-object v8, p0

    :goto_7
    new-instance v0, Lcom/stripe/android/link/ui/LinkAppBarState;

    move-object v4, v0

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/link/ui/LinkAppBarState;-><init>(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V

    invoke-interface {p4, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_d
    check-cast v0, Lcom/stripe/android/link/ui/LinkAppBarState;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-static {}, LQt0;->Y()V

    :cond_e
    invoke-interface {p4}, LEt0;->Q()V

    return-object v0
.end method
