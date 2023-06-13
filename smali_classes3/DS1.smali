.class public final LDS1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMV0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LDS1;",
        "LMV0;",
        "Landroid/content/Intent;",
        "intent",
        "Lio/reactivex/c;",
        "a",
        "",
        "j",
        "Llh6;",
        "Llh6;",
        "userManager",
        "Lgl;",
        "b",
        "Lgl;",
        "preference",
        "Le13;",
        "c",
        "Le13;",
        "navigator",
        "<init>",
        "(Llh6;Lgl;Le13;)V",
        "deeplink_release"
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
        "SMAP\nIdToolsNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsNavigator.kt\nco/bird/android/lib/deeplink/navigators/IdToolsNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Llh6;

.field public final b:Lgl;

.field public final c:Le13;


# direct methods
.method public constructor <init>(Llh6;Lgl;Le13;)V
    .locals 1

    const-string v0, "userManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDS1;->a:Llh6;

    iput-object p2, p0, LDS1;->b:Lgl;

    iput-object p3, p0, LDS1;->c:Le13;

    return-void
.end method

.method public static final synthetic access$getPreference$p(LDS1;)Lgl;
    .locals 0

    iget-object p0, p0, LDS1;->b:Lgl;

    return-object p0
.end method

.method public static final synthetic access$setFallbackRole(LDS1;)V
    .locals 0

    invoke-virtual {p0}, LDS1;->j()V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LDS1;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LDS1;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(LDS1;)V
    .locals 0

    invoke-static {p0}, LDS1;->i(LDS1;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LDS1;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final i(LDS1;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LDS1;->c:Le13;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToOperator$default(Le13;ZLco/bird/android/model/GoOperatorMapDeeplinkParams;Ljava/util/List;ILjava/lang/Object;)V

    iget-object p0, p0, LDS1;->c:Le13;

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v2}, Le13$a;->goToIdTools$default(Le13;Lco/bird/android/model/wire/WireBird;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lio/reactivex/c;
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "role"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, LDS1;->a:Llh6;

    invoke-interface {v0}, Llh6;->getUser()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LDS1$a;

    invoke-direct {v1, p0, p1}, LDS1$a;-><init>(LDS1;Ljava/lang/String;)V

    new-instance p1, LzS1;

    invoke-direct {p1, v1}, LzS1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LDS1$b;

    invoke-direct {v0, p0}, LDS1$b;-><init>(LDS1;)V

    new-instance v1, LAS1;

    invoke-direct {v1, v0}, LAS1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LDS1$c;

    invoke-direct {v0, p0}, LDS1$c;-><init>(LDS1;)V

    new-instance v1, LBS1;

    invoke-direct {v1, v0}, LBS1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    :goto_1
    new-instance v0, LCS1;

    invoke-direct {v0, p0}, LCS1;-><init>(LDS1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun navigate(in\u2026goToIdTools()\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, LDS1;->b:Lgl;

    invoke-virtual {v0}, Lgl;->r0()Lco/bird/android/model/UserRoleItem;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LDS1;->b:Lgl;

    invoke-virtual {v1, v0}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    :cond_0
    return-void
.end method
