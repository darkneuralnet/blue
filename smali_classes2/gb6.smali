.class public final Lgb6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lgb6;",
        "",
        "LOh;",
        "appBuildConfig",
        "Lco/bird/android/config/tweaks/dsl/Tweaks;",
        "a",
        "<init>",
        "()V",
        "config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lgb6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb6;

    invoke-direct {v0}, Lgb6;-><init>()V

    sput-object v0, Lgb6;->a:Lgb6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LOh;)Lco/bird/android/config/tweaks/dsl/Tweaks;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "appBuildConfig"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgb6$a;

    invoke-direct {v0, p0}, Lgb6$a;-><init>(LOh;)V

    invoke-static {v0}, Lfb6;->a(Lkotlin/jvm/functions/Function1;)Lco/bird/android/config/tweaks/dsl/Tweaks;

    move-result-object p0

    return-object p0
.end method
