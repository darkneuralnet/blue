.class public final synthetic LyC7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LyC7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LyC7;

    invoke-direct {v0}, LyC7;-><init>()V

    sput-object v0, LyC7;->a:LyC7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->lambda$getComponents$0(LOs0;)Lba;

    move-result-object p1

    return-object p1
.end method
