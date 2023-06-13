.class public final synthetic La67;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF57;


# static fields
.field public static final synthetic a:La67;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, La67;

    invoke-direct {v0}, La67;-><init>()V

    sput-object v0, La67;->a:La67;

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

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbog;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbog;->s()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
