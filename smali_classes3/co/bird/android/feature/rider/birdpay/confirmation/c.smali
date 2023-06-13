.class public abstract Lco/bird/android/feature/rider/birdpay/confirmation/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/rider/birdpay/confirmation/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\'J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\'\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/feature/rider/birdpay/confirmation/c;",
        "",
        "LgM3;",
        "impl",
        "LcM3;",
        "d",
        "Lco/bird/android/feature/rider/birdpay/confirmation/e;",
        "LSL3;",
        "b",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lcom/uber/autodispose/ScopeProvider;",
        "c",
        "<init>",
        "()V",
        "a",
        "bird-pay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lco/bird/android/feature/rider/birdpay/confirmation/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/rider/birdpay/confirmation/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/rider/birdpay/confirmation/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/rider/birdpay/confirmation/c;->a:Lco/bird/android/feature/rider/birdpay/confirmation/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lco/bird/android/core/mvp/BaseActivity;)Lco/bird/android/feature/rider/birdpay/confirmation/e$b;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lco/bird/android/feature/rider/birdpay/confirmation/c;->a:Lco/bird/android/feature/rider/birdpay/confirmation/c$a;

    invoke-virtual {v0, p0}, Lco/bird/android/feature/rider/birdpay/confirmation/c$a;->a(Lco/bird/android/core/mvp/BaseActivity;)Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(Lco/bird/android/feature/rider/birdpay/confirmation/e;)LSL3;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract c(Lco/bird/android/core/mvp/BaseActivity;)Lcom/uber/autodispose/ScopeProvider;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract d(LgM3;)LcM3;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
