.class public final enum LfV2$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LfV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LfV2$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LfV2$g;

.field public static final enum c:LfV2$g;

.field public static final enum d:LfV2$g;

.field public static final synthetic e:[LfV2$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LfV2$g;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LfV2$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfV2$g;->b:LfV2$g;

    new-instance v1, LfV2$g;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LfV2$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, LfV2$g;->c:LfV2$g;

    new-instance v3, LfV2$g;

    const-string v5, "FINISHED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LfV2$g;-><init>(Ljava/lang/String;I)V

    sput-object v3, LfV2$g;->d:LfV2$g;

    const/4 v5, 0x3

    new-array v5, v5, [LfV2$g;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LfV2$g;->e:[LfV2$g;

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

.method public static valueOf(Ljava/lang/String;)LfV2$g;
    .locals 1

    const-class v0, LfV2$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LfV2$g;

    return-object p0
.end method

.method public static values()[LfV2$g;
    .locals 1

    sget-object v0, LfV2$g;->e:[LfV2$g;

    invoke-virtual {v0}, [LfV2$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LfV2$g;

    return-object v0
.end method
