.class public final synthetic LEC7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final synthetic b:LEC7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LEC7;

    invoke-direct {v0}, LEC7;-><init>()V

    sput-object v0, LEC7;->b:LEC7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->g:Lcom/google/android/gms/common/internal/GmsLogger;

    const/4 v0, 0x0

    return-object v0
.end method
