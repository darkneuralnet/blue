.class public final synthetic Lw57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF57;


# static fields
.field public static final synthetic a:Lw57;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw57;

    invoke-direct {v0}, Lw57;-><init>()V

    sput-object v0, Lw57;->a:Lw57;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;->v()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
