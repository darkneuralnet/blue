.class public final Lgt4;
.super La01;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lgt4;",
        "La01;",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "subscriptionId",
        "<init>",
        "()V",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:Lgt4;

.field public static final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgt4;

    invoke-direct {v0}, Lgt4;-><init>()V

    sput-object v0, Lgt4;->a:Lgt4;

    const-string v0, "javaClass"

    sput-object v0, Lgt4;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La01;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lgt4;->b:Ljava/lang/String;

    return-object v0
.end method
