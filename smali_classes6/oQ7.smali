.class public final synthetic LoQ7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# static fields
.field public static final synthetic a:LoQ7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LoQ7;

    invoke-direct {v0}, LoQ7;-><init>()V

    sput-object v0, LoQ7;->a:LoQ7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->d(Ljava/lang/Exception;)V

    return-void
.end method
