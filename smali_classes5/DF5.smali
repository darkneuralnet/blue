.class public final enum LDF5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDF5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LDF5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LDF5;",
        "",
        "",
        "b",
        "J",
        "()J",
        "value",
        "<init>",
        "(Ljava/lang/String;IJ)V",
        "h",
        "a",
        "c",
        "d",
        "e",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LDF5;

.field public static final enum d:LDF5;

.field public static final enum e:LDF5;

.field public static final synthetic f:[LDF5;

.field public static final g:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "LDF5;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:LDF5$a;


# instance fields
.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [LDF5;

    new-instance v1, LDF5;

    const-string v2, "None"

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, LDF5;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, LDF5;->c:LDF5;

    aput-object v1, v0, v5

    new-instance v1, LDF5;

    const-string v2, "Enabled"

    const-wide/16 v3, 0x1

    const/4 v5, 0x1

    invoke-direct {v1, v2, v5, v3, v4}, LDF5;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, LDF5;->d:LDF5;

    aput-object v1, v0, v5

    new-instance v1, LDF5;

    const-string v2, "RequireConfirm"

    const-wide/16 v3, 0x2

    const/4 v5, 0x2

    invoke-direct {v1, v2, v5, v3, v4}, LDF5;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, LDF5;->e:LDF5;

    aput-object v1, v0, v5

    sput-object v0, LDF5;->f:[LDF5;

    new-instance v0, LDF5$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDF5$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDF5;->h:LDF5$a;

    const-class v0, LDF5;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "EnumSet.allOf(SmartLoginOption::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LDF5;->g:Ljava/util/EnumSet;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, LDF5;->b:J

    return-void
.end method

.method public static final synthetic a()Ljava/util/EnumSet;
    .locals 1

    sget-object v0, LDF5;->g:Ljava/util/EnumSet;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LDF5;
    .locals 1

    const-class v0, LDF5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LDF5;

    return-object p0
.end method

.method public static values()[LDF5;
    .locals 1

    sget-object v0, LDF5;->f:[LDF5;

    invoke-virtual {v0}, [LDF5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LDF5;

    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, LDF5;->b:J

    return-wide v0
.end method
