.class public final enum Lio/reactivex/internal/util/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/internal/util/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/reactivex/internal/util/j;

.field public static final enum c:Lio/reactivex/internal/util/j;

.field public static final enum d:Lio/reactivex/internal/util/j;

.field public static final synthetic e:[Lio/reactivex/internal/util/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/reactivex/internal/util/j;

    const-string v1, "IMMEDIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/reactivex/internal/util/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/reactivex/internal/util/j;->b:Lio/reactivex/internal/util/j;

    new-instance v1, Lio/reactivex/internal/util/j;

    const-string v3, "BOUNDARY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/reactivex/internal/util/j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/reactivex/internal/util/j;->c:Lio/reactivex/internal/util/j;

    new-instance v3, Lio/reactivex/internal/util/j;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/reactivex/internal/util/j;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/reactivex/internal/util/j;->d:Lio/reactivex/internal/util/j;

    const/4 v5, 0x3

    new-array v5, v5, [Lio/reactivex/internal/util/j;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lio/reactivex/internal/util/j;->e:[Lio/reactivex/internal/util/j;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/internal/util/j;
    .locals 1

    const-class v0, Lio/reactivex/internal/util/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/internal/util/j;

    return-object p0
.end method

.method public static values()[Lio/reactivex/internal/util/j;
    .locals 1

    sget-object v0, Lio/reactivex/internal/util/j;->e:[Lio/reactivex/internal/util/j;

    invoke-virtual {v0}, [Lio/reactivex/internal/util/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/internal/util/j;

    return-object v0
.end method
