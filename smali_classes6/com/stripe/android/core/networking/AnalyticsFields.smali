.class public final Lcom/stripe/android/core/networking/AnalyticsFields;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/AnalyticsFields;",
        "",
        "()V",
        "ANALYTICS_UA",
        "",
        "APP_NAME",
        "APP_VERSION",
        "BINDINGS_VERSION",
        "DEVICE_TYPE",
        "EVENT",
        "IS_DEVELOPMENT",
        "OS_NAME",
        "OS_RELEASE",
        "OS_VERSION",
        "PUBLISHABLE_KEY",
        "SESSION_ID",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ANALYTICS_UA:Ljava/lang/String; = "analytics_ua"

.field public static final APP_NAME:Ljava/lang/String; = "app_name"

.field public static final APP_VERSION:Ljava/lang/String; = "app_version"

.field public static final BINDINGS_VERSION:Ljava/lang/String; = "bindings_version"

.field public static final DEVICE_TYPE:Ljava/lang/String; = "device_type"

.field public static final EVENT:Ljava/lang/String; = "event"

.field public static final INSTANCE:Lcom/stripe/android/core/networking/AnalyticsFields;

.field public static final IS_DEVELOPMENT:Ljava/lang/String; = "is_development"

.field public static final OS_NAME:Ljava/lang/String; = "os_name"

.field public static final OS_RELEASE:Ljava/lang/String; = "os_release"

.field public static final OS_VERSION:Ljava/lang/String; = "os_version"

.field public static final PUBLISHABLE_KEY:Ljava/lang/String; = "publishable_key"

.field public static final SESSION_ID:Ljava/lang/String; = "session_id"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/core/networking/AnalyticsFields;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/AnalyticsFields;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/AnalyticsFields;->INSTANCE:Lcom/stripe/android/core/networking/AnalyticsFields;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
