.class public abstract Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b;",
        "",
        "LjA1;",
        "presenter",
        "LfA1;",
        "b",
        "LoA1;",
        "ui",
        "LnA1;",
        "d",
        "<init>",
        "()V",
        "a",
        "frequent-flyer_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b;->a:Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lco/bird/android/core/mvp/BaseActivity;)Lco/bird/android/model/wire/WireFrequentFlyerView;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b;->a:Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;

    invoke-virtual {v0, p0}, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;->a(Lco/bird/android/core/mvp/BaseActivity;)Lco/bird/android/model/wire/WireFrequentFlyerView;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/core/mvp/BaseActivity;)Lcom/uber/autodispose/ScopeProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b;->a:Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;

    invoke-virtual {v0, p0}, Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;->b(Lco/bird/android/core/mvp/BaseActivity;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(LjA1;)LfA1;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract d(LoA1;)LnA1;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
