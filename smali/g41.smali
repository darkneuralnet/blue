.class public final enum Lg41;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg41;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum b:Lg41;

.field public static final synthetic c:[Lg41;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg41;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg41;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg41;->b:Lg41;

    invoke-static {}, Lg41;->a()[Lg41;

    move-result-object v0

    sput-object v0, Lg41;->c:[Lg41;

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

.method public static synthetic a()[Lg41;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lg41;

    const/4 v1, 0x0

    sget-object v2, Lg41;->b:Lg41;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg41;
    .locals 1

    const-class v0, Lg41;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg41;

    return-object p0
.end method

.method public static values()[Lg41;
    .locals 1

    sget-object v0, Lg41;->c:[Lg41;

    invoke-virtual {v0}, [Lg41;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg41;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DirectExecutor"

    return-object v0
.end method
