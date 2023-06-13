.class public abstract LOB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LaZ2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOB$a;,
        LOB$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000 \u000c2\u00020\u0001:\u0001\u0013Bu\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00107\u001a\u000202\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010@\u0012\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010D\u00a2\u0006\u0004\u0008H\u0010IJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\t\u001a\u00020\u0008H\u0002J\u0016\u0010\u000b\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\u000c\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0008\u0010\u0013\u001a\u00020\u0008H\u0017J\u0008\u0010\u0014\u001a\u00020\u0008H\u0016J\u0008\u0010\u0015\u001a\u00020\u0008H&R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0017R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0017\u00107\u001a\u0002028\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0016\u0010C\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0016\u0010G\u001a\u0004\u0018\u00010D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010F\u00a8\u0006J"
    }
    d2 = {
        "LOB;",
        "LaZ2;",
        "Lco/bird/android/model/User;",
        "user",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/UserRoleItem;",
        "r",
        "",
        "o",
        "userRoles",
        "n",
        "m",
        "t",
        "p",
        "Lco/bird/android/model/constant/UserRole;",
        "userRole",
        "",
        "u",
        "a",
        "onResume",
        "C",
        "LOh;",
        "LOh;",
        "appBuildConfig",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "b",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "Lgl;",
        "c",
        "Lgl;",
        "preference",
        "LTq4;",
        "d",
        "LTq4;",
        "reactiveConfig",
        "LZ03;",
        "e",
        "LZ03;",
        "ui",
        "Le13;",
        "f",
        "Le13;",
        "navigator",
        "LEa;",
        "g",
        "LEa;",
        "analyticsManager",
        "LZ85;",
        "h",
        "LZ85;",
        "q",
        "()LZ85;",
        "riderDemandManager",
        "LaS2;",
        "i",
        "LaS2;",
        "merchantManager",
        "LRh6;",
        "j",
        "LRh6;",
        "userStream",
        "LOi;",
        "k",
        "LOi;",
        "appContextStream",
        "LGI3;",
        "l",
        "LGI3;",
        "partnerManager",
        "<init>",
        "(LOh;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgl;LTq4;LZ03;Le13;LEa;LZ85;LaS2;LRh6;LOi;LGI3;)V",
        "nav-drawer_release"
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
        "SMAP\nBaseNavigationDrawerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNavigationDrawerPresenter.kt\nco/bird/android/library/navigation/drawer/BaseNavigationDrawerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n180#2:258\n180#2:259\n180#2:260\n180#2:261\n180#2:262\n180#2:263\n766#3:264\n857#3,2:265\n1855#3,2:267\n766#3:269\n857#3,2:270\n*S KotlinDebug\n*F\n+ 1 BaseNavigationDrawerPresenter.kt\nco/bird/android/library/navigation/drawer/BaseNavigationDrawerPresenter\n*L\n78#1:258\n86#1:259\n104#1:260\n110#1:261\n124#1:262\n135#1:263\n202#1:264\n202#1:265,2\n206#1:267,2\n227#1:269\n227#1:270,2\n*E\n"
    }
.end annotation


# static fields
.field public static final m:LOB$a;


# instance fields
.field public final a:LOh;

.field public final b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgl;

.field public final d:LTq4;

.field public final e:LZ03;

.field public final f:Le13;

.field public final g:LEa;

.field public final h:LZ85;

.field public final i:LaS2;

.field public final j:LRh6;

.field public final k:LOi;

.field public final l:LGI3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LOB$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOB$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LOB;->m:LOB$a;

    return-void
.end method

.method public constructor <init>(LOh;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgl;LTq4;LZ03;Le13;LEa;LZ85;LaS2;LRh6;LOi;LGI3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOh;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lgl;",
            "LTq4;",
            "LZ03;",
            "Le13;",
            "LEa;",
            "LZ85;",
            "LaS2;",
            "LRh6;",
            "LOi;",
            "LGI3;",
            ")V"
        }
    .end annotation

    const-string v0, "appBuildConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "riderDemandManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantManager"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOB;->a:LOh;

    iput-object p2, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iput-object p3, p0, LOB;->c:Lgl;

    iput-object p4, p0, LOB;->d:LTq4;

    iput-object p5, p0, LOB;->e:LZ03;

    iput-object p6, p0, LOB;->f:Le13;

    iput-object p7, p0, LOB;->g:LEa;

    iput-object p8, p0, LOB;->h:LZ85;

    iput-object p9, p0, LOB;->i:LaS2;

    iput-object p10, p0, LOB;->j:LRh6;

    iput-object p11, p0, LOB;->k:LOi;

    iput-object p12, p0, LOB;->l:LGI3;

    return-void
.end method

.method public synthetic constructor <init>(LOh;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgl;LTq4;LZ03;Le13;LEa;LZ85;LaS2;LRh6;LOi;LGI3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v14, v2

    goto :goto_0

    :cond_0
    move-object/from16 v14, p11

    :goto_0
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_1

    move-object v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v15, p12

    :goto_1
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    invoke-direct/range {v3 .. v15}, LOB;-><init>(LOh;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgl;LTq4;LZ03;Le13;LEa;LZ85;LaS2;LRh6;LOi;LGI3;)V

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$configureRoleDropdownSelector(LOB;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, LOB;->m(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$configureRoleSwitch(LOB;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, LOB;->n(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LOB;)LEa;
    .locals 0

    iget-object p0, p0, LOB;->g:LEa;

    return-object p0
.end method

.method public static final synthetic access$getAppContextStream$p(LOB;)LOi;
    .locals 0

    iget-object p0, p0, LOB;->k:LOi;

    return-object p0
.end method

.method public static final synthetic access$getMerchantManager$p(LOB;)LaS2;
    .locals 0

    iget-object p0, p0, LOB;->i:LaS2;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LOB;)Lgl;
    .locals 0

    iget-object p0, p0, LOB;->c:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(LOB;)LTq4;
    .locals 0

    iget-object p0, p0, LOB;->d:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(LOB;)LZ03;
    .locals 0

    iget-object p0, p0, LOB;->e:LZ03;

    return-object p0
.end method

.method public static final synthetic access$getUserRoles(LOB;Lco/bird/android/model/User;)Lio/reactivex/Observable;
    .locals 0

    invoke-virtual {p0, p1}, LOB;->r(Lco/bird/android/model/User;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$navigateToRole(LOB;Lco/bird/android/model/constant/UserRole;)Z
    .locals 0

    invoke-virtual {p0, p1}, LOB;->u(Lco/bird/android/model/constant/UserRole;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOB;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOB;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LOB;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOB;->v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOB;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LOB;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOB;->z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LOB;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract C()V
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, LOB;->j:LRh6;

    invoke-interface {v0}, LRh6;->f()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "userStream.updateEvents(\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LOB$d;

    invoke-direct {v2, p0}, LOB$d;-><init>(LOB;)V

    new-instance v3, LHB;

    invoke-direct {v3, v2}, LHB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LOB;->j:LRh6;

    invoke-interface {v0}, LRh6;->f()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, LOB$e;

    invoke-direct {v2, p0}, LOB$e;-><init>(LOB;)V

    new-instance v3, LIB;

    invoke-direct {v3, v2}, LIB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "@CallSuper\n  override fu\u2026f()\n        }\n      }\n  }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LOB$f;

    invoke-direct {v2, p0}, LOB$f;-><init>(LOB;)V

    new-instance v3, LJB;

    invoke-direct {v3, v2}, LJB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LOB;->e:LZ03;

    invoke-interface {v0}, LZ03;->Uf()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LOB$g;

    invoke-direct {v2, p0}, LOB$g;-><init>(LOB;)V

    new-instance v3, LKB;

    invoke-direct {v3, v2}, LKB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LOB;->e:LZ03;

    invoke-interface {v0}, LZ03;->g4()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LOB$h;

    invoke-direct {v2, p0}, LOB$h;-><init>(LOB;)V

    new-instance v3, LLB;

    invoke-direct {v3, v2}, LLB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LOB;->e:LZ03;

    invoke-interface {v0}, LZ03;->G8()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LOB$i;

    invoke-direct {v2, p0}, LOB$i;-><init>(LOB;)V

    new-instance v3, LMB;

    invoke-direct {v3, v2}, LMB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LOB;->d:LTq4;

    invoke-virtual {v0}, LTq4;->Z6()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LOB;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LOB$j;

    invoke-direct {v1, p0}, LOB$j;-><init>(LOB;)V

    new-instance v2, LNB;

    invoke-direct {v2, v1}, LNB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LOB;->e:LZ03;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LZ03;->ml(Z)V

    iget-object v0, p0, LOB;->e:LZ03;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, LZ03;->qd(Z)V

    iget-object v0, p0, LOB;->e:LZ03;

    invoke-virtual {p0, p1}, LOB;->p(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LOB;->t(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, LZ03;->gi(Ljava/util/List;)V

    invoke-virtual {p0}, LOB;->o()V

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LOB;->e:LZ03;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt p1, v1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    invoke-interface {v0, p1}, LZ03;->ml(Z)V

    iget-object p1, p0, LOB;->e:LZ03;

    invoke-interface {p1, v3}, LZ03;->qd(Z)V

    iget-object p1, p0, LOB;->e:LZ03;

    invoke-interface {p1, v2}, LZ03;->b7(Z)V

    return-void
.end method

.method public final o()V
    .locals 4

    iget-object v0, p0, LOB;->c:Lgl;

    invoke-virtual {v0}, Lgl;->s0()Lco/bird/android/model/UserRoleItem;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v1

    sget-object v2, LOB$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LOB;->e:LZ03;

    iget-object v1, p0, LOB;->i:LaS2;

    invoke-interface {v1}, LaS2;->l()I

    move-result v1

    if-le v1, v2, :cond_1

    sget v1, Lnl4;->drawer_ride_switch_merchant_many:I

    goto :goto_0

    :cond_1
    sget v1, Lnl4;->drawer_ride_switch_merchant:I

    :goto_0
    invoke-interface {v0, v1}, LZ03;->Le(I)V

    iget-object v0, p0, LOB;->e:LZ03;

    iget-object v1, p0, LOB;->a:LOh;

    invoke-interface {v1}, LOh;->i()I

    move-result v1

    invoke-interface {v0, v1}, LZ03;->setIcon(I)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, LOB;->e:LZ03;

    invoke-interface {v1, v0}, LZ03;->cc(Lco/bird/android/model/UserRoleItem;)V

    iget-object v0, p0, LOB;->e:LZ03;

    iget-object v1, p0, LOB;->a:LOh;

    invoke-interface {v1}, LOh;->i()I

    move-result v1

    invoke-interface {v0, v1}, LZ03;->setIcon(I)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, LOB;->e:LZ03;

    sget v1, Lnl4;->drawer_ride_switch_rider:I

    invoke-interface {v0, v1}, LZ03;->Le(I)V

    iget-object v0, p0, LOB;->e:LZ03;

    iget-object v1, p0, LOB;->a:LOh;

    invoke-interface {v1}, LOh;->g()I

    move-result v1

    invoke-interface {v0, v1}, LZ03;->setIcon(I)V

    :goto_1
    iget-object v0, p0, LOB;->e:LZ03;

    invoke-interface {v0, v2}, LZ03;->Mj(Z)V

    return-void
.end method

.method public onResume()V
    .locals 0

    return-void
.end method

.method public final p(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOB;->c:Lgl;

    invoke-virtual {v0}, Lgl;->z1()Lco/bird/android/model/UserRoleItem;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/UserRoleItem;

    invoke-virtual {v3}, Lco/bird/android/model/UserRoleItem;->getUserRoleCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/UserRoleItem;->getUserRoleCode()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v3, v4, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    xor-int/2addr v3, v5

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final q()LZ85;
    .locals 1

    iget-object v0, p0, LOB;->h:LZ85;

    return-object v0
.end method

.method public final r(Lco/bird/android/model/User;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LOB;->i:LaS2;

    invoke-interface {v0}, LaS2;->j()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LOB$c;

    invoke-direct {v1, p1}, LOB$c;-><init>(Ljava/lang/Object;)V

    new-instance p1, LGB;

    invoke-direct {p1, v1}, LGB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "merchantManager.isMerchant.map(user::getRoles)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final t(Ljava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lco/bird/android/model/UserRoleItem;

    iget-object v5, p0, LOB;->a:LOh;

    invoke-interface {v5}, LOh;->b()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/model/UserRoleItem;

    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v1

    sget-object v2, LOB$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-eq v1, v3, :cond_7

    const/4 v2, 0x2

    if-eq v1, v2, :cond_6

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRoleTitleStringRes()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_4
    iget-object v1, p0, LOB;->i:LaS2;

    invoke-interface {v1}, LaS2;->l()I

    move-result v1

    if-le v1, v3, :cond_5

    sget v1, Lnl4;->drawer_ride_switch_merchant_many:I

    goto :goto_3

    :cond_5
    sget v1, Lnl4;->drawer_ride_switch_merchant:I

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_6
    sget v1, Lnl4;->drawer_ride_switch_operator:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_7
    sget v1, Lnl4;->drawer_ride_switch_rider:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_4
    move-object v8, v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lco/bird/android/model/UserRoleItem;->copy$default(Lco/bird/android/model/UserRoleItem;Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/model/UserRoleItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    return-object v0
.end method

.method public final u(Lco/bird/android/model/constant/UserRole;)Z
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, LOB$b;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v1, v3, :cond_0

    return v4

    :cond_0
    iget-object v1, v0, LOB;->f:Le13;

    invoke-interface {v1, v4}, Le13;->X0(Z)V

    goto :goto_0

    :cond_1
    iget-object v5, v0, LOB;->f:Le13;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Le13$a;->goToOperator$default(Le13;ZLco/bird/android/model/GoOperatorMapDeeplinkParams;Ljava/util/List;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v11, v0, LOB;->f:Le13;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, Le13$a;->goToRider$default(Le13;ZZLco/bird/android/model/GoDeepLinkParams;ILjava/lang/Object;)V

    iget-object v1, v0, LOB;->h:LZ85;

    const-string v3, "mode_switch"

    invoke-interface {v1, v3}, LZ85;->b(Ljava/lang/String;)V

    :goto_0
    iget-object v1, v0, LOB;->g:LEa;

    new-instance v10, LOU2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, LOU2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return v2
.end method
