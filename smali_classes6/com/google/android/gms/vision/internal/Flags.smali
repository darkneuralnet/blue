.class public Lcom/google/android/gms/vision/internal/Flags;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final zza:Ljo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljo1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "vision:product_barcode_value_logging_enabled"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ljo1;->a(ILjava/lang/String;Ljava/lang/Boolean;)Ljo1$a;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/vision/internal/Flags;->zza:Ljo1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
