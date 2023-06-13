.class public final LxB0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxB0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "LxB0;",
        "",
        "<init>",
        "()V",
        "a",
        "local-asset_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LxB0$a;

.field public static final b:Lorg/joda/time/format/DateTimeFormatter;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LxB0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LxB0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LxB0;->a:LxB0$a;

    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "dateTime()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LxB0;->b:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lco/bird/android/model/constant/AssetManagerType;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LxB0;->a:LxB0$a;

    invoke-virtual {v0, p0}, LxB0$a;->a(Lco/bird/android/model/constant/AssetManagerType;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFormatter$cp()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, LxB0;->b:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final b(Lorg/joda/time/DateTime;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LxB0;->a:LxB0$a;

    invoke-virtual {v0, p0}, LxB0$a;->b(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Lco/bird/android/model/constant/AssetManagerType;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LxB0;->a:LxB0$a;

    invoke-virtual {v0, p0}, LxB0$a;->d(Ljava/lang/String;)Lco/bird/android/model/constant/AssetManagerType;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;)Lorg/joda/time/DateTime;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LxB0;->a:LxB0$a;

    invoke-virtual {v0, p0}, LxB0$a;->e(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object p0

    return-object p0
.end method
