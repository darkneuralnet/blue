.class public final Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;
.super Lcom/stripe/android/link/analytics/LinkEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/analytics/LinkEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AccountLookupFailure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;",
        "Lcom/stripe/android/link/analytics/LinkEvent;",
        "()V",
        "eventName",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "link_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;

.field private static final eventName:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;

    invoke-direct {v0}, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;-><init>()V

    sput-object v0, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;

    const-string v0, "link.account_lookup.failure"

    sput-object v0, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;->eventName:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/link/analytics/LinkEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getEventName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;->eventName:Ljava/lang/String;

    return-object v0
.end method
