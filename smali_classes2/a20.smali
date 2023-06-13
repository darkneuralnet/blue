.class public final enum La20;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La20;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "La20;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "getFormat",
        "()Ljava/lang/String;",
        "format",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "c",
        "d",
        "e",
        "f",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:La20;

.field public static final enum d:La20;

.field public static final enum e:La20;

.field public static final enum f:La20;

.field public static final synthetic g:[La20;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, La20;

    const/4 v1, 0x0

    const-string v2, "yyyy-MM-dd"

    const-string v3, "SHORT"

    invoke-direct {v0, v3, v1, v2}, La20;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La20;->c:La20;

    new-instance v0, La20;

    const/4 v1, 0x1

    const-string v2, "yyyy-MM-dd kk:mm:ss"

    const-string v3, "LONG"

    invoke-direct {v0, v3, v1, v2}, La20;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La20;->d:La20;

    new-instance v0, La20;

    const/4 v1, 0x2

    const-string v2, "MM-dd kk:mm:ss.SSS"

    const-string v3, "ANDROID_LOGCAT"

    invoke-direct {v0, v3, v1, v2}, La20;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La20;->e:La20;

    new-instance v0, La20;

    const/4 v1, 0x3

    const-string v2, "h:mm a"

    const-string v3, "CLOCK_12_HOUR"

    invoke-direct {v0, v3, v1, v2}, La20;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La20;->f:La20;

    invoke-static {}, La20;->a()[La20;

    move-result-object v0

    sput-object v0, La20;->g:[La20;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, La20;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[La20;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [La20;

    sget-object v1, La20;->c:La20;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, La20;->d:La20;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, La20;->e:La20;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, La20;->f:La20;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)La20;
    .locals 1

    const-class v0, La20;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La20;

    return-object p0
.end method

.method public static values()[La20;
    .locals 1

    sget-object v0, La20;->g:[La20;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La20;

    return-object v0
.end method


# virtual methods
.method public final getFormat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La20;->b:Ljava/lang/String;

    return-object v0
.end method
