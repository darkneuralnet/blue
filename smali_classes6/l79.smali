.class public final enum Ll79;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll79;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum b:Ll79;

.field public static final synthetic c:[Ll79;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll79;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll79;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll79;->b:Ll79;

    const/4 v1, 0x1

    new-array v1, v1, [Ll79;

    aput-object v0, v1, v2

    sput-object v1, Ll79;->c:[Ll79;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string p1, "INSTANCE"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Ll79;
    .locals 1

    sget-object v0, Ll79;->c:[Ll79;

    invoke-virtual {v0}, [Ll79;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll79;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
