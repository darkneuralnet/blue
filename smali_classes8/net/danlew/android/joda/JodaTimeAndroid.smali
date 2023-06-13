.class public final Lnet/danlew/android/joda/JodaTimeAndroid;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static TZ_DATA_VERSION:Ljava/lang/String; = "2022ggtz"


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public static init(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
