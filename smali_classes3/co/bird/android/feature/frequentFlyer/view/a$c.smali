.class public final Lco/bird/android/feature/frequentFlyer/view/a$c;
.super Lco/bird/android/feature/frequentFlyer/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/frequentFlyer/view/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lco/bird/android/feature/frequentFlyer/view/a$c;",
        "Lco/bird/android/feature/frequentFlyer/view/a;",
        "<init>",
        "()V",
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
.field public static final c:Lco/bird/android/feature/frequentFlyer/view/a$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/frequentFlyer/view/a$c;

    invoke-direct {v0}, Lco/bird/android/feature/frequentFlyer/view/a$c;-><init>()V

    sput-object v0, Lco/bird/android/feature/frequentFlyer/view/a$c;->c:Lco/bird/android/feature/frequentFlyer/view/a$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-string v0, "lottie/badge_platinum_loop.json"

    const/4 v1, 0x0

    const-string v2, "lottie/badge_platinum_start.json"

    invoke-direct {p0, v2, v0, v1}, Lco/bird/android/feature/frequentFlyer/view/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
